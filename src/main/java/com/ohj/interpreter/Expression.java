package com.ohj.interpreter;

import java.util.HashMap;

//抽象类表达式，通过HashMap的键值对，可以获取到变量到值
public abstract class Expression {

    //解释公式和数值，key是公式（表达式参数），value是具体到值
    //如 HashMap{a=10,b=20}
    public abstract int interpreter(HashMap<String,Integer> var);
}
