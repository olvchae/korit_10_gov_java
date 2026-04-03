package study.ch15.ex;

interface ButtonClickListener {
    void onClick(String buttonName);
}

class Button{
    private String name;
    ButtonClickListener listener;

    public Button(String name) {
        this.name = name;
    }

    public void setListener(ButtonClickListener listener) {
        this.listener = listener;
    }

    public void click(){
        listener.onClick(name);
    }
}

class AlertListener implements ButtonClickListener{
    public AlertListener() {
        System.out.println();
    }

    @Override
    public void onClick(String buttonName) {
        System.out.println("[경고] " + buttonName + "클릭됨!");
    }
}

class LogListener implements ButtonClickListener{
    public LogListener() {

    }

    @Override
    public void onClick(String buttonName) {
        System.out.println("[로그] " + buttonName + "클릭됨 at ");
    }
}
public class Ex19 {
    public static void main(String[] args) {
        Button btn = new Button("저장");
        btn.setListener(new AlertListener());
        btn.click();  // [경고] 저장 클릭됨!
        btn.setListener(new LogListener());
        btn.click();  // [로그] 저장 클릭됨 at 2025-...
    }
}
