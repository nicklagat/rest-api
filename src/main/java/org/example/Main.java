package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RestAPI restAPI = new RestAPI();
        try {
            restAPI.makePost();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}