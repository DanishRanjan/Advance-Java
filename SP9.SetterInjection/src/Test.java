import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		//A a1=(A)f.getBean("a1");
		@SuppressWarnings("unused")
		A a2=(A)f.getBean("a2");
		@SuppressWarnings("unused")
		A a3=(A)f.getBean("a3");

	}

}
