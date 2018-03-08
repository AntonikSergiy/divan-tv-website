package com.website.pages;


import com.codeborne.selenide.Selenide;

public class MainPage {



    public MainPage open() {
        Selenide.open("/");
        return this;
    }

}
