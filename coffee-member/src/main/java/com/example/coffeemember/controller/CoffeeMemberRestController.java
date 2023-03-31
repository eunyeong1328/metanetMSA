package com.example.coffeemember.controller;

import com.example.coffeemember.service.MemberService;
import com.example.coffeemember.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-member")
public class CoffeeMemberRestController {

    @Autowired
    MemberService service;

    @GetMapping("/")
    public String coffeeMember(){
        return "coffee-member service";
    }

    @GetMapping("/existMember/{memberMember}")
    public boolean existMember(@PathVariable("memberName") String memberName){
        MemberVO vo = new MemberVO();
        vo.setMemberNamer(memberName);

        if(service.findMember(vo) != null){
            return false;
        }else{
            return false;
        }
    }
    @GetMapping("/createMemberTable")
    public void createMemberTable(){
        service.createMemberTable();
    }

    @GetMapping("/insertMember")
    public void insetMember() {
        service.insertMember();
    }
}
