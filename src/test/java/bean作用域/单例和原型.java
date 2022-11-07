package bean作用域;

import com.bean的实例化.bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 配置bean标签中scope属性来设置 singleton(默认)单例prototype原型
 */

public class 单例和原型 {
    @Test
    public void danli(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        bean1 bean1 = ac.getBean("bean12", bean1.class);
        bean1 bean2 = ac.getBean("bean12", bean1.class);
        bean1 bean3 = ac.getBean("bean12", bean1.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);
    }
    @Test
    public void 原型(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        bean1 bean1 = ac.getBean("bean13", bean1.class);
        bean1 bean2 = ac.getBean("bean13", bean1.class);
        bean1 bean3 = ac.getBean("bean13", bean1.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);
    }
}
