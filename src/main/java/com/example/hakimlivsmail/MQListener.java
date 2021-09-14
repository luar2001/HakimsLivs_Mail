package com.example.hakimlivsmail;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQListener {

    @RabbitListener(queues = "mail")
    public void receiveMessage(MailDTO mailDTO){
        MailService.sendMail(mailDTO.getType(), mailDTO.getMailTo());
    }

}
