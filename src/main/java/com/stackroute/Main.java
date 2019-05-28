package com.stackroute;

import com.stackroute.Config.AppConfig;
import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AnnotationConfigApplicationContext c=(AnnotationConfigApplicationContext) ctx;
        c.destroy();
//        Movie movie = (Movie) ctx.getBean("Movie.class");
//        System.out.println(movie);
//        Movie movie = (Movie) ctx.getBean("Movie.class");
//        System.out.println(movie.getMovieName());
//        System.out.println(movie.getId());
//        System.out.println(movie.getActor().getAge());
//        System.out.println(movie.getActor().getGender());
//        System.out.println(movie.getActor().getName());
//        Actor actor=(Actor)ctx.getBean("Actor.class");
//        System.out.println(actor.getAge());
//        System.out.println(actor.getGender());
//        System.out.println(actor.getName());
//        System.out.println(movie.toString());
//        Movie movie1 = (Movie) ctx.getBean("Movie1.class");
//        System.out.println(movie1.getMovieName());
//        System.out.println(movie1.getId());
//        System.out.println(movie1.getActor().getAge());
//        System.out.println(movie1.getActor().getGender());
//        System.out.println(movie1.getActor().getName());
//        System.out.println(movie1.toString());
//        System.out.println(movie==movie1);
    }
}
