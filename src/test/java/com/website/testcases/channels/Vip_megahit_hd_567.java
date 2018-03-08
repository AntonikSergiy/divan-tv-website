package com.website.testcases.channels;

import com.codeborne.selenide.ElementsCollection;
import com.website.base.TestBase;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Features("Test feature")
public class Vip_megahit_hd_567 extends TestBase {


    @Test
    public void testCanOpenLoginPopup() {
        open("/tv/vip-megahit-hd-567");
        ElementsCollection epgIkonList = $("ul.epg-item-placeholder").findAll("i");
        epgIkonList.shouldHave(sizeGreaterThanOrEqual(5));
    }

}
