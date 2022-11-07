package bean实例化;

import com.bean的实例化.bean2;
import com.bean的实例化.bean3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 实例工厂实例化 {
    @Test
    public void textwu(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        bean3 bean30 = ac.getBean("bean30", bean3.class);
        System.out.println(bean30);
    }

    @Test
    public void textyou(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        bean3 bean31 = ac.getBean("bean31", bean3.class);
        System.out.println(bean31);
    }
}
