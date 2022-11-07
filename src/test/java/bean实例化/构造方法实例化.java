package bean实例化;

import com.bean的实例化.bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 构造方法实例化 {
    @Test
    public void textwu() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        bean1 bean1 = ac.getBean("bean10", bean1.class);
        System.out.println(bean1);

    }
    @Test
    public void textyou() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        bean1 bean1 = ac.getBean("bean11", bean1.class);
        System.out.println(bean1);

    }
}
