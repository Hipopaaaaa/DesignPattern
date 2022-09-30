package com.ohj.ResponsibilityChain;

public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()<=5000){
            System.out.println("请求id="+purchaseRequest.getId()+" 被 "+super.getName()+"处理了");
        }else{
            //处理不了，让下一个处理者处理
            super.getApprover().processRequest(purchaseRequest);
        }
    }
}
