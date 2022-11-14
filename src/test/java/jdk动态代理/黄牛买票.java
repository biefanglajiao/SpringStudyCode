package jdk动态代理;


import com.jdk动态代理.proxy.Yellowmermer;
import com.jdk动态代理.target.TrainStation;
import com.jdk动态代理.target.TrainStationImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 黄牛买票 {
    @Test
    public void 黄牛买票(){
        Yellowmermer yellowmermer=new Yellowmermer();
        TrainStation trainStation=new TrainStationImp();
        //spring  取消new
       TrainStation proxy = (TrainStation) yellowmermer.createProxy(trainStation);//必须强转
      proxy.sale();
    }
    @Test
    public void 黄牛买票1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Yellowmermer yellow = ac.getBean("yellow", Yellowmermer.class);
        TrainStationImp trainstation = ac.getBean("trainstation", TrainStationImp.class);
        TrainStation proxy1 = (TrainStation) yellow.createProxy(trainstation); //必须强转
        proxy1.sale();
    }
}
