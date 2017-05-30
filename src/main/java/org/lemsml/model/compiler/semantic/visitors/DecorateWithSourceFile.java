package org.lemsml.model.compiler.semantic.visitors;

import java.io.File;

import org.lemsml.model.Assign;
import org.lemsml.model.Attachments;
import org.lemsml.model.Case;
import org.lemsml.model.Child;
import org.lemsml.model.ChildInstance;
import org.lemsml.model.Children;
import org.lemsml.model.Component;
import org.lemsml.model.ComponentReference;
import org.lemsml.model.ComponentRequirement;
import org.lemsml.model.ComponentType;
import org.lemsml.model.ConditionalDerivedVariable;
import org.lemsml.model.Constant;
import org.lemsml.model.DataDisplay;
import org.lemsml.model.DataWriter;
import org.lemsml.model.DerivedParameter;
import org.lemsml.model.DerivedVariable;
import org.lemsml.model.Dimension;
import org.lemsml.model.Dynamics;
import org.lemsml.model.EventConnection;
import org.lemsml.model.EventOut;
import org.lemsml.model.EventPort;
import org.lemsml.model.Exposure;
import org.lemsml.model.Fixed;
import org.lemsml.model.ForEach;
import org.lemsml.model.Include;
import org.lemsml.model.IndexParameter;
import org.lemsml.model.InstanceRequirement;
import org.lemsml.model.KineticScheme;
import org.lemsml.model.Lems;
import org.lemsml.model.Link;
import org.lemsml.model.MultiInstantiate;
import org.lemsml.model.OnCondition;
import org.lemsml.model.OnEntry;
import org.lemsml.model.OnEvent;
import org.lemsml.model.OnStart;
import org.lemsml.model.Path;
import org.lemsml.model.Property;
import org.lemsml.model.Record;
import org.lemsml.model.Regime;
import org.lemsml.model.Requirement;
import org.lemsml.model.Run;
import org.lemsml.model.Simulation;
import org.lemsml.model.StateAssignment;
import org.lemsml.model.StateVariable;
import org.lemsml.model.Structure;
import org.lemsml.model.Target;
import org.lemsml.model.Text;
import org.lemsml.model.TimeDerivative;
import org.lemsml.model.Transition;
import org.lemsml.model.Tunnel;
import org.lemsml.model.Unit;
import org.lemsml.model.With;
import org.lemsml.visitors.Visitor;

/**
 * @author borismarin
 *
 */
// public class DecorateWithSourceFile extends BaseVisitor<Boolean, Throwable> {
public class DecorateWithSourceFile implements Visitor<Boolean, Throwable> {

	private File sourceFile;

	public DecorateWithSourceFile(File sourceDoc) {
		sourceFile = sourceDoc;
	}

	@Override
	public Boolean visit(Lems lems) {
		lems.setDefinedIn(sourceFile);
		return true;

	}

	@Override
	public Boolean visit(Constant constant) {
		constant.setDefinedIn(sourceFile);
		return true;

	}

	@Override
	public Boolean visit(org.lemsml.model.extended.ComponentType componentType) {
		componentType.setDefinedIn(sourceFile);
		return true;
	}

	@Override
	public Boolean visit(org.lemsml.model.extended.Component component) {
		component.setDefinedIn(sourceFile);
		return true;
	}

	@Override
	public Boolean visit(Target target) {
		target.setDefinedIn(sourceFile);
		return true;
	}

	@Override
	public Boolean visit(org.lemsml.model.extended.Dimension dimension) {
		dimension.setDefinedIn(sourceFile);
		return true;
	}

	@Override
	public Boolean visit(org.lemsml.model.extended.Unit unit) {
		unit.setDefinedIn(sourceFile);
		return true;
	}

	@Override
	public Boolean visit(Assign aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Attachments aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Case aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Child aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ChildInstance aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Children aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Component aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ComponentReference aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ComponentRequirement aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ComponentType aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ConditionalDerivedVariable aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(DataDisplay aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(DataWriter aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(DerivedParameter aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(DerivedVariable aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Dimension aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Dynamics aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(EventConnection aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(EventOut aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(EventPort aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Exposure aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Fixed aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(ForEach aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Include aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(IndexParameter aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(InstanceRequirement aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(KineticScheme aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Link aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(MultiInstantiate aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(OnCondition aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(OnEntry aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(OnEvent aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(OnStart aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Path aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Property aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Record aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Regime aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Requirement aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Run aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Simulation aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(StateAssignment aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(StateVariable aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Structure aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Text aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(TimeDerivative aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Transition aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Tunnel aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(Unit aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(With aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(org.lemsml.model.extended.TimeDerivative aBean)
			throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

	@Override
	public Boolean visit(org.lemsml.model.Parameter aBean) throws Throwable {
		aBean.setDefinedIn(sourceFile);
		return null;
	}

}
