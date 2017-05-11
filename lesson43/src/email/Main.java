package email;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by java on 21.04.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<EmailMessage> queue = new ArrayBlockingQueue<>(10);

        EmailProducer producer = new EmailProducer(queue);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));

        List<EmailMessage> messageList = Arrays.asList(
                new EmailMessage("user1@yopmail.com", "text message", "text message"),
                new EmailMessage("user2@yopmail.com", "text message", "text message"),
                new EmailMessage("user3@yopmail.com", "text message", "text message"),
                new EmailMessage("user4@yopmail.com", "text message", "text message"),
                new EmailMessage("user5@yopmail.com", "text message", "text message"),
                new EmailMessage("user6@yopmail.com", "text message", "text message"),
                new EmailMessage("user7@yopmail.com", "text message", "text message"),
                new EmailMessage("user8@yopmail.com", "text message", "text message")
        );
        producer.sendMessage(messageList);

        executorService.shutdown();
    }
}
