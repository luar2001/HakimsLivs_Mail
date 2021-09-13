import okhttp3.Headers;

/**
 * Service Class for Mail
 */
 class MailService {

    /**
     * SendGrid api URL
     */
    private static final String url = "https://api.sendgrid.com/v3/";

    /**
     * Sends a mail using Twilio SendsGrid
     * @param apiKey twilio ApiKey
     * @param json json body
     */
     static void sendMail(String apiKey, String json){

        String sendUrl = url + "mail/send";

        Headers headers = new Headers.Builder()
                .add("Authorization", "Bearer "+ apiKey)
                .add("Content-Type", "application/json")
                .build();

        String temp = Connection.httpRequest(sendUrl,"POST", json, headers);

        System.out.println("POST Request:\n" + temp);
    }

}
