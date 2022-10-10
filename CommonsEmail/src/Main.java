import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Main {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.live.com");
        email.setSmtpPort(25);
        email.setAuthenticator(new DefaultAuthenticator("lucas alves da silva", "******"));
        email.setSSLOnConnect(true);
        email.setFrom("lucas.tink@hotmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("lucas.tink22@gmail.com");
        email.send();

        System.out.println("Fim... ");
    }
}