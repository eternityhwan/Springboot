package com.study.main;

// 컨트롤러 자바 파일

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTApi {
    @GetMapping("/home")  // localhost:8080/home 이라고 들어가야 나옴
    public String Welcom(){
        return "서버 잘 돌아간다.";
    }
}
