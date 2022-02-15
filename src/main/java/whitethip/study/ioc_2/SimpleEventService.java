package whitethip.study.ioc_2;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{
    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an Event");
    }

    @Override
    public void publishEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }
}
