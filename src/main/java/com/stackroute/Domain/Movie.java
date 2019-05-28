package com.stackroute.Domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  {
    private int id;
    private String movieName;
    //    @Autowired
    private Actor actor;


    public Movie() {

    }

//    @Autowired
//    public Movie(Actor actor) {
//        this.actor = actor;
//    }

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }



}
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("beanfactory is" +beanFactory);
//    }
//
//    @Override
//    public void setBeanName(String s) {
//        System.out.println("beanName is" +s);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println(applicationContext);
//        System.out.println(applicationContext.getBean("Actor.class"));
//    }
//}
//
