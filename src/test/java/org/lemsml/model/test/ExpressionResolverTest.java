package org.lemsml.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.lemsml.model.compiler.parser.LEMSParser;
import org.lemsml.model.compiler.parser.XMLUtils;
import org.lemsml.model.extended.Lems;

public class ExpressionResolverTest extends BaseTest {

	private File schema;
	private File include0;

	@Before
	public void setUp() {
		schema = getLocalFile("/Schemas/LEMS_v0.9.0.xsd");
		include0 = getLocalFile("/examples/expression-resolver-test/include0.xml");
	}

	@Test
	public void validate() {
		assertTrue(XMLUtils.validate(include0, schema));
	}

	@Test
	public void testIncludeVisitor() throws Throwable {

		LEMSParser parser = new LEMSParser(include0, schema);
		Lems lemsDoc = parser.parse();
		assertEquals(3, lemsDoc.getConstants().size());
		System.out.println(lemsDoc.getConstants().get(0).getValue());
	}

}
