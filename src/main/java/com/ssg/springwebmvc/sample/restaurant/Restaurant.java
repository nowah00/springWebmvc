package com.ssg.springwebmvc.sample.restaurant;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@ToString
@Component
public class Restaurant {

    private final Chef chef; // 스프링 컨테이너에서 제공받은 한개의 객체를 계속 생성
}
