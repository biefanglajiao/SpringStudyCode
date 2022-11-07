package bean实例化;

import com.bean的实例化.bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 静态工厂实例化 {
    @Test
    public void textwu(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        bean2 bean2 = ac.getBean("bean20", bean2.class);
        System.out.println(bean2);
    }
    @Test
    public void textyou(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        bean2 bean2 = ac.getBean("bean21", bean2.class);
        System.out.println(bean2);
    }
}
