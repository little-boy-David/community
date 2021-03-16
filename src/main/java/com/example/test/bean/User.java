package com.example.test.bean;


public class User {
    private int Id;
    private String userName;
    private String passWord;
    private String Address;
    private String Phone;
    private String Sex;
    private int Age;
    private String Emotion;
    private String Hobby;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHobby() {
        return Hobby;
    }

    public String getPhone() {
        return Phone;
    }

    public String getSex() {
        return Sex;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmotion() {
        return Emotion;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setEmotion(String emotion) {
        Emotion = emotion;
    }
}
