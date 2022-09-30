package com.ohj.prototype.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name; //基本数据类型
    public DeepCloneTarget deepCloneTarget;  //引用类型

    public DeepProtoType() {
    }

    //深拷贝，方式一：使用clone方法（缺点：当引用类型的成员属性过多时，需要一个一个进行处理）

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep= null;
        //完成对基本数据类型对克隆
        deep=super.clone();
        //对引用类型对属性，进行单独克隆
        DeepProtoType deepProtoType= (DeepProtoType) deep;
        deepProtoType.deepCloneTarget= (DeepCloneTarget) deepCloneTarget.clone();

        return deepProtoType;
    }

    //深拷贝，方式二：通过对象的序列化实现（推荐）
    public Object deepClone(){

        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;


        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this); //让当前这个对象以对象流的方式输出

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copyObj=(DeepProtoType) ois.readObject();
            return  copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                throw new RuntimeException(e2);
            }
        }
    }
}
