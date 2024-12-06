package com.test.guan;

/**
 * @author Guan
 * @date 2020/6/8 17:28
 */
public class AA {

    public static void main(String[] args) {
        while(true){
            System.out.println("==============");
        }
    }

    private static void tests(){
        // 1.for循环中不定义循环变量，不定义循环执行条件，不定义循环变量变化过程，那么这一定是个死循环
        //代码：
        for (;;) {
            System.out.println("asdasd");
        }
    }

    private static void tests2(){
        //2.for循环中，循环变量初始化，定义循环变量变换过程，不定义执行条件，那么这个循环就会无条件执行
        //代码：
        for (int i = 0; ; i++) {
            System.out.println("asdasd");
        }
    }

    private static void tests3(){
        //二.for循环下，如果有循环执行条件，在循环变量永远满足循环执行条件下，循环一直执行。
        //3.for循环中，循环变量初始化，定义循环执行条件，不定义循环变量变化过程，那么就会一直满足循环执行条件，循环一直执行
        //代码：
		int qewewrerer;
        for (int i = 0; i<100; ) {
            System.out.println("asdasd");
        }
    }

    private static void tests4(){
        //4.for循环中，循环条件全部定义，循环变量每次变化增加（减少）的数量如果跟循环体内循环变量每次减少（增加）的数量相等，那么就等于说
        //循环变量没有变化，循环一直满足循环条件，循环一直执行。
        //代码：
        for (int i = 0; i<100;i++ ) {
            System.out.println("asdasd");
            i--;
        }
    }

    private static void tests5(){
        // 5.for循环中，如果循环变量永远满足循环执行条件，那么循环一直执行
        //代码：
        for (int i = 0; i < 100; i--) {
            System.out.println("asdasd");
        }
    }

    private static void tests6(){
        for (int i = 0; 1==1; i++) {

            System.out.println("asdasd");

        }
    }

    private static void tests7(){
        for (int i = 0; 1!=11; i++) {
            System.out.println("asdasd");
        }
    }

    private static void tests8(){
        for (int i = 0; 11>=1; i++) {
            System.out.println("asdasd");
        }
    }

    private static void tests9(){
        for (int i = 0; i<3; i++) {
            System.out.println("asdasd");
        }
    }

    private static void tests10(){
        for (int i = 0; true||false; i++) {
            System.out.println("asdasd");
        }
    }

    private static void tests11(){
        for (int i = 0; true&&true; i++) {
            System.out.println("asdasd");
        }
    }


    private void tests1(){
        //三.for循环中，如果循环执行条件表达式为真，那么循环一直执行下去，跟循环变量初始化和循环变量变化过程没有一毛钱关系。

        //6.for循环中，如果循环执行条件一直为真，没有结束条件，那么循环一直执行

        //代码：
        for (int i = 0; true; i++) {
            System.out.println("asdasd");
        }
    }

}

//class TT{
//
//    public static void main(String[] args) {
//        System.out.println("CCCCCCCCCCCCC");
//        System.out.println("BBBBBBBBBBB ");
//        getResult();
//    }
//
//    public static String getResult() {
//        String str = null;
//        if (str.equals("testsss")) {
//            System.out.println("------------->");
//        }
//        return "I am guan...";
//    }
//}

