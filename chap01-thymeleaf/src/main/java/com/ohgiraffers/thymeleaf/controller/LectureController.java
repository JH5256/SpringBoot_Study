package com.ohgiraffers.thymeleaf.controller;

import com.ohgiraffers.thymeleaf.model.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LectureController {

    @GetMapping("/lecture/expression")
    public ModelAndView expression(ModelAndView mv) {

        mv.addObject("member", new MemberDTO("판다", 20, '남', "서울시 종로구"));

        mv.addObject("hello", "<h3>hello Thymeleaf!</h3>");

        mv.setViewName("/lecture/expression");

        return mv;
    }

}
