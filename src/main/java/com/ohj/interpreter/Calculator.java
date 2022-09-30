package com.ohj.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    //定义表达式
    private Expression expression;

    public Calculator(String expStr){  //expStr就是表达式，如 a+b
        //安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //将表达式拆分成字符数组
        char[] charArray = expStr.toCharArray(); //[a,+,b]

        Expression left=null;
        Expression right=null;

        //遍历字符数组，即遍历 [a,+,b]
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case'+':
                    left=stack.pop();  //从stack取出 left表达式 -> a
                    right=new VarExpression(String.valueOf(charArray[++i])); //取出right表达式-> b
                    stack.push(new AddExpression(left,right)); //根据left和right构建AddExpression对象，然后加入到stack,相加-> a+b
                    break;
                case '-':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果是一个变量（如a，b），即创建VarExpression对象，并放入栈中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }

        //遍历完整个charArray数组后，stack就得到类最后的Expression
        this.expression=stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        //最后将表达式a+b 和 var 绑定-> 即 {a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
