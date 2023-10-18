package io.github.felizardoDev.Div;

import org.springframework.web.bind.annotation.*; //Anotações relacionadas ao Spring MVC

import java.util.LinkedHashMap;
import java.util.Map;

@RestController //Retornar repostas HTTP
@RequestMapping(value = "/api")
public class DivController {
    private DivService divService; //Injeção de dependência

    public DivController(DivService divService) { //Construtor da class DivController
        this.divService = divService;
    }
    @GetMapping("/make-division")
    @ResponseBody
    public Map<String, Object> divide(@RequestParam double dividend, @RequestParam double divisor) {
        //O método retorna um map contendo chave como String e valore como Object.
        Map<String, Object> result = new LinkedHashMap<>(); //Armazenar o resultado da operação.

        try { //try-catch tenta executar a operação e se ocorrer uma exceção, ela é capturada e tratada no bloco catch.
            double divisionResult = divService.divide(dividend, divisor);
            //Chama o método divide do serviço DivService para calcular a divisão.

            result.put("result", divisionResult); //Adiciona o resultado ao mapa result com a chave "result".
        } catch (IllegalArgumentException e) { //Retorna a msg de erro se o divisor for 0.
            result.put("error", e.getMessage());
        }
        return result;
    }
}