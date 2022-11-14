package com.example.justfun.DAO;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args)
    {
        // create and configure beans
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // retrieve configured instance
        Sport sport=context.getBean("mysport",Sport.class);
        //call methods on the bean
        System.out.println(sport.GetMessage());
        //close the context
        context.close();

    }

}
