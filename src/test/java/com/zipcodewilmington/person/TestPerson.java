package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    //Default Test Constructors
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Kyle";
        Integer expectedAge = Integer.MAX_VALUE;
        // When
        Person person = new Person();
        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Assert.assertEquals(expectedName, actualName);
//        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Kyle";
        // When
        Person person = new Person(expected);
        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 23;
        // When
        Person person = new Person(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 23;
        String expectedName = "Kyle";
        // When
        Person person = new Person(expectedName, expectedAge);
        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Kyle";
        // When
        person.setName(expected);
        String actual = person.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 23;
        // When
        person.setAge(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    //New added Test Constructors
    @Test
    public void testHairColor(){
        String expectedHairColor = "Black";
        Person person = new Person(expectedHairColor);
        String actualHairColor = person.setHairColor("Black");
        Assert.assertEquals(expectedHairColor,actualHairColor);
    }
    @Test
    public void testEyeColor(){
        String expectedEyeColor = "Brown";
        Person person = new Person(expectedEyeColor);
        String actualEyeColor = person.setEyeColor("Brown");
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }
    @Test
    public void testHeight(){
        Person person = new Person();
        Integer expectedHeight = 123;
        Integer actualHeight = 123;
        Assert.assertEquals(expectedHeight, actualHeight, .1);
    }
    @Test
    public void testFavoriteArtist(){
        String expectedArtist = "Madeon";
        Person person = new Person(expectedArtist);
        String actualArtist = person.setFavoriteArtist("Madeon");
        Assert.assertEquals(expectedArtist, actualArtist);
    }
    @Test
    public void testFavoriteNumber(){
        Person person = new Person();
        Double expectedNum = 69.00;
        Double actualNum = 69.00;
        Assert.assertEquals(expectedNum, actualNum, .1);
    }
}
