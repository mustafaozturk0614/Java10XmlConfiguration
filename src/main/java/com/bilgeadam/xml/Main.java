package com.bilgeadam.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        IRunable game=context.getBean("mygame", IRunable.class);
//        IRunable game2=context.getBean("mygame", IRunable.class);


        GameRunner gameRunner=context.getBean("gamerunner", GameRunner.class);
//        GameRunner gameRunner2=new GameRunner(game2);

        gameRunner.run();
        System.out.println(gameRunner.getUsername());
        System.out.println(gameRunner.getPassword());

//        gameRunner2.run();
//        System.out.println(game.hashCode());
//        System.out.println(game2.hashCode());

    }
}
