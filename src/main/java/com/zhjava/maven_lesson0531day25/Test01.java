package com.zhjava.maven_lesson0531day25;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Scanner;

public class Test01 {
    private  static Logger logger=Logger.getLogger(Test01.class.getName());
    @Test
    public void show02(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入被除数：");
        int beichu = sc.nextInt();

        logger.debug("输入被除数"+beichu);
        System.out.print("请输入除数：");
        int chu = sc.nextInt();

        logger.debug("输入除数"+chu);
        int result=beichu/chu;

        System.out.println(result);
        logger.debug("商"+result);

    }
    @Test
    public void show03(){

    }
    //类名不能跟他一致
    @Test
    public void show01(){
        System.out.println("1111");
    }


}
