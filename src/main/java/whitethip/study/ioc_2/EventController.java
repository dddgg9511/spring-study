package whitethip.study.ioc_2;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {
    @InitBinder
    public void init(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    }
    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event){
        System.out.println(event);
        return event.getId().toString();
    }
}
