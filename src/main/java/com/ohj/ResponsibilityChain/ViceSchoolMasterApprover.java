package com.ohj.ResponsibilityChain;

public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(10000<purchaseRequest.getPrice()&&purchaseRequest.getPrice()<=30000){
            System.out.println("请求id="+purchaseRequest.getId()+" 被 "+super.getName()+"处理了");
        }else{
            //处理不了，让下一个处理者处理
            super.getApprover().processRequest(purchaseRequest);
        }
    }
}
