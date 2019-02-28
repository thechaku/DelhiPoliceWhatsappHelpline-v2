package com.controller;

import com.constants.CommonConstants;
import com.constants.TextCommand;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class init {

    static WebDriver web;
    static WebElement search, buff, input;
    static List<WebElement> users, messages;
    static HashMap<String, Long> userToTimeMapping = new HashMap<String, Long>();

    public static void main(String[] args) {
        initProg();
        String username, msg;
        long time;
        while (true) {
            System.out.println('/');
            users = ((ChromeDriver) web).findElementsByClassName("_2EXPL");
            //System.out.println("user found = " + users.size());
            for (WebElement user : users) {
                if (user.getAttribute("innerHTML").contains("OUeyt")) {
                    try {
                        user.findElement(By.className("_3j7s9")).click();
                    }catch (Exception e){
                        continue;
                    }
                    username = ((ChromeDriver) web).findElementByCssSelector("#main > header > div._5SiUq > div > div > span").getText();
                    System.out.println("user = " + username);
                    //time = (new SimpleDateFormat("HH:mm:ss")).format(Calendar.getInstance().getTime());
                    time = new Date().getTime();
                    System.out.println("time = " + time);
                    if (!repeatedMsg(username)) {
                        messages = ((ChromeDriver) web).findElementsByXPath("//div[@class='copyable-text']");
                        msg = messages.get(messages.size() - 1).findElement(By.className("selectable-text")).getText();
                        System.out.println("new message = " + msg);
                        if (msg.length()>0 && msg.charAt(0) == '#') {
                            handlecommand(msg);
                        } else {
                            sendInput(CommonConstants.FIRST_GREETING_MESSAGE);
                        }
                    }
                    userToTimeMapping.put(username, time);
                    buff.click();

                    //handleMessage(user);
                }
            }
        }


    }

    private static void handlecommand(String msg) {
        if(msg.equals("#commands")){
            for(TextCommand tc : TextCommand.commandHashMap.values()){
                sendInput(tc.getName()+"-"+tc.getDescription());
            }
        }
        else{

            TextCommand commandObj = TextCommand.commandHashMap.get(msg);
            if(commandObj != null){
                sendInput(commandObj.getContent());
            }
            else{
                sendInput("unknown command");
            }
        }
    }

    private static void process_fir() {
        sendInput("to be made");
    }

    private static void sendInput(String inputTxt) {
        input = ((ChromeDriver) web).findElementByXPath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]");
        input.click();
        input.sendKeys(inputTxt + Keys.ENTER);
    }

    private static boolean repeatedMsg(String username) {
        return userToTimeMapping.containsKey(username) && ((new Date().getTime()) - userToTimeMapping.get(username) < 2000);
    }

    private static void initProg() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha Chaku\\Desktop\\Major Project\\chromedriver_win32\\chromedriver.exe");
        web = new ChromeDriver();
        try {
            web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            web.navigate().to("https://web.whatsapp.com");
            WebDriverWait wait = new WebDriverWait(web, 120);
            search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"side\"]/div[1]/div/label/input")));
//            web.manage().window().setPosition(new Point(-3000, -3000));
            search.sendKeys("Buff" + Keys.ENTER);
            System.out.println("sleeping");
            Thread.sleep(4000); // sec
            System.out.println("awake");
            buff = ((ChromeDriver) web).findElementByXPath("//*[@id=\"pane-side\"]/div/div/div/div/div");
            buff.click();
            search.sendKeys(Keys.ESCAPE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
