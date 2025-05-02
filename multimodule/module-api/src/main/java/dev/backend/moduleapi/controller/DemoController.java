package dev.backend.moduleapi.controller;

import dev.backend.moduleapi.service.DemoService;
import dev.backend.modulecommon.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;
    private final ExamService examService;

    @GetMapping("/save")
    public String save(){
        return demoService.save();
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable Long id){
        return demoService.find(id);
    }

    @GetMapping("/example")
    public String example(){
        return examService.print();
    }
}
