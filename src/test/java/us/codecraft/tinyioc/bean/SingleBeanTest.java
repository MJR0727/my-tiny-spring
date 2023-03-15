package us.codecraft.tinyioc.bean;

import com.MJR.bean.factory.config.BeanDefinition;
import com.MJR.bean.factory.support.DefaultListeableBeanFactory;
import org.junit.Test;

/**
 * @author Mjr
 * @version 1.0
 * @description: version2_单例bean工厂测试
 * @date 2023/3/15 23:02
 */
public class SingleBeanTest {

    @Test
    public void testSingleBean(){
        DefaultListeableBeanFactory listeableBeanFactory = new DefaultListeableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        listeableBeanFactory.registerBeanDefinition("helloService",beanDefinition);

        HelloService helloService = (HelloService) listeableBeanFactory.getBean("helloService");
        helloService.hello();
    }
    /*
        存在的问题：1、Bean初始化方式单一，只能通过newInstance构造（无参构造器）
                    需要实现初始化方式：（1）有参构造（2）CGLiB动态构造
     */
}
