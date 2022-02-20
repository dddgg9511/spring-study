package whitethip.study.ioc_2;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @NonNull
    public String createEvent(@NonNull String name){
        //return "hello " + name;
        return null;
    }
}
