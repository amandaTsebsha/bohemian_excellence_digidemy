package bohemian_excellence_digidemy

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WebController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about/")
    public String about() {
        return "about";
    }
    
    @GetMapping("/contact/")
    public String contact() {
        return "contact";
    }

    @GetMapping("/services/")
    public String services() {
        return "services";
    }

    @GetMapping("/courses/")
    public String courses() {
        return "courses";
    }

    @GetMapping("/investors/")
    public String investors() {
        return "investors";
    }
}
