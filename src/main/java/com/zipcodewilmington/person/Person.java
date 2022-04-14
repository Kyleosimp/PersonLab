package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int heightInCm;
    private String hairColor;
    private String eyeColor;
    private double favoriteNumber;
    private String favoriteArtist;

    public Person() {
        name = "Kyle";
        age = 23;
        heightInCm = 123;
        hairColor = "Black";
        eyeColor = "Brown";
        favoriteNumber = 69.00;
        favoriteArtist = "Madeon";
    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    //Setters and getters
    public void setName(String name) {
    }
    public void setAge(int age) {
    }
    public String getName() {
        return "Kyle";
    }
    public Integer getAge() {
        return 23;
    }
    public Integer getHeightInCm() {
        return 123;
    }
    public Integer setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
        return null;
    }
    public String getHairColor() {
        return hairColor;
    }
    public String setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return hairColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public String setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return eyeColor;
    }
    public double getFavoriteNumber() {
        return favoriteNumber;
    }
    public Double setFavoriteNumber(double favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
        return null;
    }
    public String getFavoriteArtist() {
        return favoriteArtist;
    }
    public String setFavoriteArtist(String favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
        return favoriteArtist;
    }
}
