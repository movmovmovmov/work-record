package project.rlozi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class CmmnController {
    @GetMapping("/check")
    public String check() {
        return "check";
    }

}
