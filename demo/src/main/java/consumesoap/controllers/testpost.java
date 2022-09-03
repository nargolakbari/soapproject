package consumesoap.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mypro")
public class testpost {
    @PostMapping("/postbody")
    public String postBody(@RequestBody String fullName) {
        return "Hello dear" + fullName;
    
}
}

