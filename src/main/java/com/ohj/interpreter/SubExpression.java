package com.ohj.interpreter;

import java.util.HashMap;

//减法表达式
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相减，var仍然是{a=10,b=20}
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) :返回 left 表达式的值，a=10
        //super.right.interpreter(var) :返回 right 表达式的值，b=20
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
