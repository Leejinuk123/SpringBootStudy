package woogie.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "Hello" +
                "<a href=\"http://localhost:8080/about\"><p>about으로 가겠습니까?</p></a>";
    }

    @GetMapping("/about")
    //@ResponseBody
    String about(Model model){
        model.addAttribute("name","청바지");
        model.addAttribute("price","5억");
        return "about.html";
    }

    @GetMapping("/others")
        //@ResponseBody
    String others(){
        return "others.html";
    }
}
