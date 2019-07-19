package com.atguigu.gmall0218.mock.util;

import java.util.Random;

public class RandomNum {
    //随机生成选项，30%男，70女
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
