package com.firebase_info.firebaseandroidchat;

public class Message {
    // поле
    private String text;

    // пустой конструктор (необходим для работы базы данных Firebase)
    public Message() {
    }

    // конструктор, используемый нами
    public Message(String text) {
        this.text = text;
    }

    // геттер
    public String getText() {
        return text;
    }

    // сеттер
    public void setText(String text) {
        this.text = text;
    }
}


