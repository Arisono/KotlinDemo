package src;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ningchuanqi
 */
public class MyJava {


    /**
     *
     */
    public static void is(){
        System.out.println("is invoked");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        String let="abcdjkldjfddsa85";

        System.out.println("let="+let.substring(let.length()-4,let.length()));


        float i=9.08f;
        String d="20200909";
        System.out.println(""+d.substring(6,8));

        System.out.println(""+Integer.parseInt(d.substring(6,8)));

        String str = "{\"fosTag\":\"2ace715d87295de05ed1f38b9981725a\",\"richMediaType\":1,\"server\":\"https:\\/\\/dev-smartbuildingcs.ivyiot.cn\",\"pushServer\":255,\"port\":433,\"supportRichMedia\":1,\"isEnable\":1,\"richMediaEnable\":1}";
        String str2 = str.replaceAll("\\\\", "\\\\\\\\");
        System.out.println(str);
        System.out.println(str2);


    }

    /**
     *
     * 数字补零
     * @param i
     * @return List<T>
     */
    public  static String  decimalFormat(double i){
        return new DecimalFormat("#0.00").format(i);
    }

}
