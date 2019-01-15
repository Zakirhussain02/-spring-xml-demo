package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
