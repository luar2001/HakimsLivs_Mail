public class Start {

    public static void main(String[] args) {
        String toMail= "Hakimslives@gmail.com";
        String subject = "Mail subject";
        String content = "Mail Content";
        String apiKey = "NULL";

        MailService.sendMail(apiKey,MailBuilder.mailBuilder(toMail,subject,content));
    }
}
