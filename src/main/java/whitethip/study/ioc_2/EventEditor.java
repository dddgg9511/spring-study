package whitethip.study.ioc_2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
