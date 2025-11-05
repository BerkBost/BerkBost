package com.example.demo.application;

import com.example.demo.domain.NameRequest;
import com.example.demo.domain.NameResponse;
import com.example.demo.domain.PrintNameUseCase;

public class PrintNameUseCaseImpl implements PrintNameUseCase {

    @Override
    public NameResponse printName(NameRequest nameRequest) {
        try {
            System.out.println("Name: " + nameRequest.getName());
            return new NameResponse(1);
        } catch (Exception e) {
            return new NameResponse(0);
        }
    }
}
