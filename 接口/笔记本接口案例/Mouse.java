package DemoTwo;/*
主题:
时间:19:04
内容:
*/

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    public void MouseMethod() {
        System.out.println("鼠标特有方法");
    }

}
