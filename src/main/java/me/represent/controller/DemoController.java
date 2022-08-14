package me.represent.controller;

import me.represent.controller.dto.Demo;
import me.represent.data.entities.DemoEntity;
import me.represent.data.repositories.DemoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DemoController {

    private final DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/demo")
    public String demo(Model model) {
        List<DemoEntity> demos = demoRepository.findAll();
        model.addAttribute("demo", new Demo(demos.stream().findFirst().orElseThrow()));
        return "demo";
    }
}
