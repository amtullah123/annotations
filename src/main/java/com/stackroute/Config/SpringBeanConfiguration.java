package com.stackroute.Config;

import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class SpringBeanConfiguration {
        @Bean(name="Movie.class")
//
//        @Scope("prototype")


        public Movie getMovie()
        {
//            Actor actor=new Actor();
//            actor.setName("shahrukh");
//            actor.setGender("M");
//            actor.setAge(50);
//////
//            Movie movie=new Movie();
//            movie.setMovieName("ddlj");
//            movie.setId(123);
//            movie.setActor(actor);
//            Actor actor=new Actor("shahrukh","M",50);
            Movie movie=new Movie(123,"amtullah");

            return movie;

    }
    @Bean(name="Actor.class")
    public Actor getActor() {
        Actor actor=new Actor("shahrukh","M",50);
    return actor;
        }

    }




