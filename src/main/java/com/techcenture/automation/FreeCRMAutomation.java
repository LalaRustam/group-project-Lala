package com.techcenture.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class FreeCRMAutomation {

    public static void main(String[] args) {

        /*
            You have all the necessary dependencies you need to automate this flow. For verifications you will
            be using JUnit assertions which already exists in the project

            Steps to automate new customer registration flow
            1. Go to automationpractice.com
            2. Verify the header
            2. Click Sign in
            3. Verify AUTHENTICATION header
            4. Verify ‘Please enter your email address to create an account.’ is displayed
            5. Enter an invalid randomly generated email address (without @) from faker and click Create an account button.
            6.Verify the error message.
            7.Enter a valid email address and click the create an account button.
            8. In the next page, verify the following headers:
            CREATE AN ACCOUNT HEADER
            YOUR PERSONAL INFORMATION

            9. Enter all the details for the new customer and click the Register button
            10. Verify MY ACCOUNT header and the customer full name on top right
            11. Verify following tabs on the page:
            ORDER HISTORY AND DETAILS
            MY CREDIT SLIPS
            MY ADDRESSES
            MY PERSONAL INFORMATION
            MY WISHLIST

            12. Sign out.
            13. Verify ‘ALREADY REGISTERED?’ header
            14. Login using the customer email and password you used to register.
            15. Verify the customer name on top right
            16. Sign out
            17. Quit the browser instance

         */


    }
}
