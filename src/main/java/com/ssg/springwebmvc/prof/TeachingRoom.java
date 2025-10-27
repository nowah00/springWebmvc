package com.ssg.springwebmvc.prof;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor

public class TeachingRoom {

    @Autowired
    private final Teacher teacher;
}
