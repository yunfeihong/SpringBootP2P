package com.qbh.p2p003consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qbh.p2p.service.loan.LoanService;
import com.qbh.p2p.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {

    //配置消费者连接服务者
    @Reference(interfaceClass = com.qbh.p2p.service.loan.LoanService.class)
    private LoanService loanService;

    @Reference(interfaceClass = com.qbh.p2p.service.user.UserService.class)
    private UserService userService;

    @RequestMapping("/az")
    public String index(Model model){
        double avgLoanInfoRate = loanService.avgLoanInfoRate();
        int sumBidInfoBidMoney = loanService.sumBidInfoBidMoney();
        int countUser = userService.countUser();
        model.addAttribute("avgLoanInfoRate",avgLoanInfoRate);
        model.addAttribute("sumBidInfoBidMoney",sumBidInfoBidMoney);
        model.addAttribute("countUser",countUser);
        System.out.println(avgLoanInfoRate);
        System.out.println(sumBidInfoBidMoney);
        System.out.println(countUser);
        return "index";
    }
}
