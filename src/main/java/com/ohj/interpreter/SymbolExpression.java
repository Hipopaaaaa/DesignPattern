package com.ohj.interpreter;

import java.util.HashMap;

//抽象运算符号解析器，这里的每个运算符号，都只和自己左右两个数字有关系
//但左右两个数字有可能也是一个解析但结果，无论何种类型，都是Expression类的实现类
public class SymbolExpression extends Expression{

    public Expression left; //左表达式
    public Expression right; //右表达式

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是让其子类来实现的，因此该方法是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
