package start;

import models.SignInAccount;
import models.SignUpAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RestControllerAdvice
@RequestMapping("/api/v1")
public class ControllerServer {
    Map<String, Object> answerMap = new HashMap<>();

    @PostMapping("/sign-up")
    public ResponseEntity<Map<String, Object>> createNewAccount(@Valid @RequestBody SignUpAccount modelAccount) {
        return new ResponseEntity<>(answerMap, HttpStatus.OK);
    }






    @GetMapping("/hello")
    public String sayHello() {
        return "Привет, мир!";
    }
}