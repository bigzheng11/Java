package DemoTwo;/*
主题:
时间:19:01
内容:
*/

public class Computer {
    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    //使用usb设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open();//打开usb设备
        if (usb instanceof Mouse) {//想要调用鼠标特有方法,需要判断
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.MouseMethod();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.KeyboardMethod();
        }
        usb.close();

    }
}
