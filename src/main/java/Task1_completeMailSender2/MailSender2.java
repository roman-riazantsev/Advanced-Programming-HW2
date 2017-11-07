package Task1_completeMailSender2;


import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailSender2 {

    private Map<Integer, MailGenerator> map = new HashMap<>();

    @SneakyThrows
    public MailSender2() {

        Reflections scanner = new Reflections("Task1_completeMailSender2");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);

        // "write several lines of code which fill this map with non abstract classes"

        int counter = 0;
        for (Class<? extends MailGenerator> aClass : classes) {
            System.out.println(counter +" " + aClass);
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                counter ++;
                map.put(counter, aClass.newInstance());
            }
        }
    }

    public void sendMail(MailInfo mailInfo) {

        MailGenerator mailGenerator = map.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);
    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
