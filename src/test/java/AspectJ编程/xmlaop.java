package AspectJ编程;

import com.AspectJ编程.基于xml实现aop.target.TrainStation;

import com.AspectJ编程.基于xml实现aop.target.TrainStationImp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlaop {
    @Test
    public void xmlaoptextjdk(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContextXmljdkAop.xml");
        TrainStationImp trainstation = ac.getBean("trainstationimp", TrainStationImp.class);
        //有接口时  使用的时jdk动态代理  yaoyongjdk动态代理的来取值
      trainstation.sale();
    }
    @Test
    public void xmlaoptextcglib(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContextXmlcglibAop.xml");
        TrainStation trainstation = ac.getBean("trainstation", TrainStation.class);

        trainstation.sale();
    }
}
