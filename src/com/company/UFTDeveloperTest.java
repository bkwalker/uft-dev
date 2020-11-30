package com.company;

import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://www.advantageonlineshopping.com/");



        Link tabletsCategoryLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("TABLETS Shop Now ")
                .tagName("DIV").build());
        tabletsCategoryLink.click();

        WebElement hPElitePad1000G2TabletWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP ElitePad 1000 G2 Tablet")
                .tagName("A").build());
        hPElitePad1000G2TabletWebElement.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();
        browser.close();
    }

}