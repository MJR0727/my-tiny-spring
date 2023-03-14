package us.codecraft.tinyioc.bean;

import com.MJR.bean.factory.support.AbstarctBeanFactory;
import org.junit.Test;

/**
 * @author Mjr
 * @version 1.0
 * @description: 版本一，最简单的Bean工厂
 * @date 2023/3/14 20:06
 */
public class SimpleAbstarctBeanFactoryTest {

    @Test
    public void testBeanFactory(){
        //AbstarctBeanFactory abstarctBeanFactory = new AbstarctBeanFactory();
        //HelloService helloService = new HelloService();
        //abstarctBeanFactory.registerBean("helloService",helloService);
        //HelloService service = (HelloService) abstarctBeanFactory.getBean("helloService");
        //service.hello();
    }

    class HelloService{

        public HelloService(){
        }

        public void hello(){
            System.out.println("hello-IOC");
        }

    }
    /*
    存在的问题：
             1、IOC容器（BeanFactory）的功能标准化不好，注册Bean和获取Bean的工作应该实现接口标准化
             2、Bean缺少一些统一的信息标识（元数据）。
     */
}
