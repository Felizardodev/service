package io.github.felizardoDev.Div;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class DivController {
    private DivService divService;

    public DivController(DivService divService) {
        this.divService = divService;
    }
    @GetMapping("/make-division")
    @ResponseBody
    public Map<String, Object> divide(@RequestParam Map<String, String> params) {
        Map<String, Object> result = new HashMap<>();

        try {
            double dividend = Double.parseDouble(params.get("dividend"));
            double divisor = Double.parseDouble(params.get("divisor"));
            double divisionResult = divService.divide(dividend, divisor);

            result.put("result", divisionResult);
        } catch (IllegalArgumentException e) {
            result.put("error", e.getMessage());
        }

        return result;
    }

}