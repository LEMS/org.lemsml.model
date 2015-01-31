package extended;

import javax.xml.bind.annotation.XmlRegistry;

import org.lemsml.model.ObjectFactory;

@XmlRegistry
public class ExtObjectFactory extends ObjectFactory {

	@Override
	public Component createComponent() {
		return new Component();
	}

	@Override
	public Lems createLems() {
		return new Lems();
	}
}