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

        Movie movie = (Movie) ctx.getBean("Movie.class");

//        System.out.println(movie.getMovieName());
//        System.out.println(movie.getId());
//        System.out.println(movie.getActor().getAge());
//        System.out.println(movie.getActor().getGender());
//        System.out.println(movie.getActor().getName());
        System.out.println(movie.toString());

    }
}
