package io.github.felizardoDev.Div;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class DivController {
    private DivService divService;

    public DivController(DivService divService) {
        this.divService = divService;
    }

    @GetMapping("/make-division/{dividend}/{divisor}")
    @ResponseBody
    public ResponseEntity<String> split(@PathVariable double dividend, @PathVariable double divisor) {
        try {
            double result = divService.split(dividend, divisor);
            return ResponseEntity.ok("The result of the division is: " + result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
