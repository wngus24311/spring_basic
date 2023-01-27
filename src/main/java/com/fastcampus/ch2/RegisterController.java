package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URLEncoder;

@Controller
@RequestMapping("/register")
public class RegisterController {
//    @RequestMapping("/register/add")
//    @GetMapping("/register/add")
//    public String register() {
//        return "registerForm";
//    }

//    @RequestMapping(value="/register/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String save(User user, Model model) throws Exception {
        // 1. 유효성 검사
        if (!isValid(user)){
         String msg = URLEncoder.encode( "id를 잘못 입력했습니다.", "UTF-8");
         model.addAttribute("msg", msg);
         return "redirect:/register/add";
        }
        // 2. DB에 신규회원 정보를 저장

        return "registerInfo";
    }

    private boolean isValid(User user) {
        return true;
    }
}
