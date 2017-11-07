package Task1_completeMailSender2;

public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "<html> don't call us we call you</html>";
    }
}
