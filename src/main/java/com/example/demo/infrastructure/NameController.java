package com.example.demo.infrastructure;

import com.example.demo.domain.NameRequest;
import com.example.demo.domain.NameResponse;
import com.example.demo.domain.PrintNameUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    private final PrintNameUseCase printNameUseCase;

    public NameController(PrintNameUseCase printNameUseCase) {
        this.printNameUseCase = printNameUseCase;
    }

    @PostMapping("/print-name")
    public NameResponse printName(@RequestBody NameRequest nameRequest) {
        return printNameUseCase.printName(nameRequest);
    }
}
