package parser;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XmlFileUtils {

	public static boolean validate(File document, File schema) {
		boolean ret = false;
		try {
			System.out.print("Validating file " + document.getName()
					+ " against schema " + schema.getName() + "... ");
			StreamSource src = new StreamSource(document);
			XmlFileUtils.parseSchema(schema).newValidator().validate(src);
			ret = true;
			System.out.println("Valid!!");
		} catch (SAXException e) {
			// e.printStackTrace();
			System.out.println("Invalid!!");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Can't open schema file!!!");
		}

		return ret;
	}

	public static File transform(File document, File transformation) {
		System.out.println("Applying XSLT " + transformation.getName()
				+ " to file " + document.getName() + "... ");
		String orig_name = document.getPath();
		String transf_name = orig_name.substring(0, orig_name.lastIndexOf('.')) + "_transformed.xml";
		File outputFile = new File(transf_name);
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(transformation);
		Transformer transformer;
		try {
			transformer = factory.newTransformer(xslt);
			Source text = new StreamSource(document);
			transformer.transform(text, new StreamResult(outputFile));
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return outputFile;
	}

	public static Schema parseSchema(File schema) {
		Schema parsedSchema = null;
		SchemaFactory sf = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			parsedSchema = sf.newSchema(schema);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			System.out.println("Problems parsing schema " + schema.getName());
			e.printStackTrace();
		}
		return parsedSchema;
	}

}