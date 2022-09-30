package com.ohj.ResponsibilityChain;

public abstract class Approver {

    private Approver approver; //下一个处理者
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }
    //设置下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，让子类来实现
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public String getName() {
        return name;
    }
}
