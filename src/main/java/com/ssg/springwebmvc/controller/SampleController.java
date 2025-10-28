package com.ssg.springwebmvc.controller;

import com.ssg.springwebmvc.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller // 해당 클래스가 스프링 MVC 에서 컨트롤러 역할을 한다. 스프링의 빈으로 등록
@Log4j2
public class SampleController {

    @GetMapping("/hello") // == doGet()
    public void hello() {
        log.info("hello springwebmvc!");
    }

    @GetMapping("/ex01")
    public void ex01(String name, int age){
        log.info("ex01에서 수집한 파라미터");
        log.info("name : " + name);
        log.info("age : " + age);
    }

    @GetMapping("/ex02")
    public void ex02(@RequestParam(name="name",defaultValue = "lalala") String name, // 기본값 지정
                     @RequestParam(name="age",defaultValue = "10")int age){
        log.info("ex02에서 수집한 파라미터");
        log.info("name : " + name);
        log.info("age : " + age);
    }

    @GetMapping("/ex03")
    public void ex03(LocalDate dueDate){
        log.info("ex03에서 수집한 파라미터");
        log.info("dueDate : " + dueDate);
    }

    @GetMapping("/ex04")
    public void ex04(Model model){
        log.info("ex04에서 수집한 파라미터");
        model.addAttribute("message", "Hello Spring MVC");
    }

    @GetMapping("/ex04_1")
    public void ex04_1(TodoDTO todoDTO,Model model){
        log.info("ex04_1에서 수집한 파라미터");
        todoDTO = TodoDTO.builder().title("Good Day").dueDate(LocalDate.parse("2000-12-06")).writer("hawon").build();
        log.info(todoDTO);
        model.addAttribute("todoDTO", todoDTO);
    }


}
