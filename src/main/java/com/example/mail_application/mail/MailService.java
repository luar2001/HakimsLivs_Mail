package com.example.mail_application.mail;

import okhttp3.Headers;

/**
 * Service Class for Mail
 */
 public class MailService {

    /**
     * SendGrid api URL
     */
    private static final String url = "https://api.sendgrid.com/v3/";

    private static String subject = null;

    private static String content = null;

    /**
     * Sends a mail using Twilio SendsGrid
     * @param type type of mail
     * @param mailAddress the mailAddress the mail will be sent to.
     */
     public static void sendMail(String type, String mailAddress){

        String sendUrl = url + "mail/send";

        if(type.equals("order")){

            subject = "Order Bekräftelse";
            content = "Din order har gåt igenom!";

        } else if(type.equals("newAccount")){

            subject = "Du har Skapat ett Account how Hakimslivs";
            content = "tack för att du har skapat ett account hos oss!";

        }

        Headers headers = new Headers.Builder()
                .add("Authorization", "Bearer "+ System.getenv("SECRET_MAIL_APIKEY"))
                .add("Content-Type", "application/json")
                .build();

        String temp = Connection.httpRequest(sendUrl,"POST", MailBuilder.mailBuilder(mailAddress,subject,content), headers);

        System.out.println("POST Request:\n" + temp);
    }

}
