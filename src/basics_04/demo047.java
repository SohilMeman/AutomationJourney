package src.basics_04;

import java.util.Locale;
import java.util.Scanner;

public class demo047 {
    public static void main(String[] args) {

        //Real time example to execute in different browser to entering the browser name

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the browser name");
        String browser = sc.next();

        switch(browser.toLowerCase()){
            case "chrome":
            System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firfox code");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I do not have any idea about this browser");

        }
    }


}
