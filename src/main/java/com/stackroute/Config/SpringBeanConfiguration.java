package com.stackroute.Config;

import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {
        @Bean(name="Movie.class")
        public Movie getMovie()
        {
//            Actor actor=new Actor();
//            actor.setName("shahrukh");
//            actor.setGender("M");
//            actor.setAge(50);
//
//            Movie movie=new Movie();
//            movie.setMovieName("ddlj");
//            movie.setId(123);
//            movie.setActor(actor);
            Actor actor=new Actor("shahrukh","M",80);
            Movie movie=new Movie(123,"amtullah", actor);

            return movie;

    }
    }




