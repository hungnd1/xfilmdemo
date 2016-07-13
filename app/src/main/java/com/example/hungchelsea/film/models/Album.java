package com.example.hungchelsea.film.models;

/**
 * Created by HungChelsea on 13-Jul-16.
 */
public class Album {

    private String name;
    private int numOfSong;
    private int thumbnail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSong() {
        return numOfSong;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Album() {
    }

    public Album(String name, int numOfSong, int thumbnail) {
        this.name = name;
        this.numOfSong = numOfSong;
        this.thumbnail = thumbnail;
    }
}
