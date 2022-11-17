package Cglib动态代理;

import com.CGlib动态代理.Proxy.CGlibProxy;
import com.CGlib动态代理.target.TrainStation;
import com.jdk动态代理.proxy.Yellowmermer;
import com.jdk动态代理.target.TrainStationImp;
import org.junit.Test;

public class 黄牛买票 {
    @Test
    public void 黄牛买票(){
        CGlibProxy cGlibProxy=new CGlibProxy();
        TrainStation trainStation=new TrainStation();

        TrainStation o = (TrainStation) cGlibProxy.craetProxy(trainStation);
        o.sale();


    }
}
