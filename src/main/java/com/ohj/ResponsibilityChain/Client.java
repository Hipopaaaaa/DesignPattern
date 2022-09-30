package com.ohj.ResponsibilityChain;

public class Client {
    public static void main(String[] args) {

        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 6000, 1);

        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //将各个审批级别的下一个人进行组合(处理人要构成一个环形)

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        //形成环，若不形成环，则每次请求必须有第一个处理者开始处理，否则会出现空指针异常
        schoolMasterApprover.setApprover(departmentApprover);

        //随便一个人来处理请求
        schoolMasterApprover.processRequest(purchaseRequest);

    }
}
