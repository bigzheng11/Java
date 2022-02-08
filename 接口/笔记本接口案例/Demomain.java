package DemoTwo;/*
主题:
时间:19:04
内容:
*/

public class Demomain {
    public static void main(String[] args) {
        Computer one = new Computer();
        one.powerOn();

//        USB mouse = new Mouse();
//        mouse.open();
//        Mouse mouseDemo = (Mouse) mouse;
//        mouseDemo.MouseMethod();
//        mouse.close();//??????????????
        Mouse mouse = new Mouse();
        USB usb = mouse;  //首先向上转型,左父亲右类/左接口右实现
        //USB usb=new Mouse()
        one.useDevice(usb);//参数是USB类型,我正好传递进去的就是USB鼠标
        System.out.println("--------------------------------------------------");


        Keyboard Keyboard = new Keyboard();
        one.useDevice(Keyboard);
        //方法参数是USB类型,传递进去的是实现类对象,也发生了向上转型

        one.powerOff();//电脑关机


    }
}
