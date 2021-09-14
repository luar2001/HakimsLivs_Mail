package com.example.hakimlivsmail;

public class Start {

    public static void main(String[] args) {
        String toMail= "Hakimslives@gmail.com";
        String subject = "Mail subject";
        String content = "Mail Content";

        MailService.sendMail(MailBuilder.mailBuilder(toMail,subject,content));
    }
}
