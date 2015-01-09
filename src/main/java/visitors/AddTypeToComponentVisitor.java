package visitors;

import org.lemsml.model.Component;
import org.lemsml.model.ComponentType;
import org.lemsml.model.Lems;
import org.lemsml.visitors.BaseVisitor;


public class AddTypeToComponentVisitor extends BaseVisitor<Object, Throwable>{

	private Lems lems;

	public AddTypeToComponentVisitor(Lems lems) {
		this.lems = lems;
	}

	@Override
	public Object visit(Component comp) throws Throwable {
		ComponentType ctToSet = ((extended.Lems) this.lems)
				.getComponentTypeByName(comp.getType());
		((extended.Component) comp).set_ComponentType(ctToSet);
		return null;
	}

	public Lems getLems() {
		return lems;
	}

	public void setLems(Lems lems) {
		this.lems = lems;
	}

}