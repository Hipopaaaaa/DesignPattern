package com.ohj.prototype.deep;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {
    private static final long serialVersionUID=1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //提供一个克隆方法，该类对属性都是基本数据类型，因此使用默认对clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
