package DemoTwo;/*
主题:
时间:19:04
内容:
*/

public class Keyboard implements USB {


    @Override
    public void open() {
        System.out.println("键盘打开");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void KeyboardMethod() {
        System.out.println("键盘特有方法");
    }
}
