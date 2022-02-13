package whitethip.study.ioc_2;

public class MyEvent {
    private int data;

    private Object source;

    public MyEvent(Object source, int data){
        this.source = source;
        this.data = data;
    }

    public Object getSource(){
        return this.source;
    }

    public int getData(){
        return this.data;
    }
}
