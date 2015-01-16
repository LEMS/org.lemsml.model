package parser;

import java.io.File;

import visitors.AddTypeToComponentVisitor;
import visitors.BuildNameComponentTypeMapVisitor;
import visitors.ProcessIncludesVisitor;
import extended.Lems;

public class LemsParser {

	Lems lems;
	File cwd;
	File schema;

	public Lems getLems() {
		return lems;
	}

	public LemsParser(File lemsdocument, File schema) {
		this.lems = LemsXmlUtils.unmarshall(lemsdocument, schema);
		this.cwd = lemsdocument.getParentFile();
		this.schema = schema;
	}

	public void populateNameComponentTypeHM() throws Throwable {
//		traverseWithVisitor((Visitable) lems.getComponentType(), new BuildNameComponentTypeMapVisitor(lems));
		LemsVisitorUtils.visitList(lems.getComponentType(), new BuildNameComponentTypeMapVisitor(lems));
	}

	public void decorateComponentsWithType() throws Throwable {
		LemsVisitorUtils.visitList(lems.getComponent(), new AddTypeToComponentVisitor(lems));
	}

	public void processIncludes() throws Throwable {
		ProcessIncludesVisitor incProcVisitor = new ProcessIncludesVisitor(lems, schema, cwd);
		//traverseWithVisitor((Visitable) lems, incProcVisitor);
		LemsVisitorUtils.visitList(lems.getInclude(), incProcVisitor);
		this.lems = incProcVisitor.getResolvedLems();
	}
}
