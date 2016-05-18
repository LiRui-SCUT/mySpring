package com.stringinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lirui on 16-5-16.
 */
public class KnightMain {
    public static void main(String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(com.stringinaction.knights.config.KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkQuest();
    }
}
