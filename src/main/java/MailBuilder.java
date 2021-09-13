/**
 * Builds the JSON body of the HTTP Request that will then be turned into a MAIL by SendGrid
 */
 class MailBuilder {
    /**
     * Who sends the mail (Mail address)
     */
    private static final String sendMail = "Hakimslives@gmail.com";

    /**
     * Builds the Mail that will be sent to the user
     * @param toMail Who the mail will be sent to. (Mail address)
     * @param subject Mail Subject
     * @param content Mail Content
     * @return String with body of the mail
     */
    static String mailBuilder(String toMail, String subject, String content){
       return """
                {"personalizations": [{"to": [{"email": "$to"}]}],"from": {"email": "$send"},"subject": "$subject","content": [{"type": "text/plain", "value": "$content"}]}
              """.replace("$to",toMail).replace("$send", sendMail).replace("$subject", subject).replace("$content", content);
    }
}
