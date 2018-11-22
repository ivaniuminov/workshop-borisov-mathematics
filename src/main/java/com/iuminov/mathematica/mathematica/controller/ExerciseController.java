package com.iuminov.mathematica.mathematica.controller;

import com.iuminov.mathematica.mathematica.model.Exercise;
import com.iuminov.mathematica.mathematica.service.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExerciseController {
    public final ExerciseService exerciseService;

    @GetMapping("/math/{amount}")
    public List<Exercise> getExercises(@PathVariable int amount) {
        return exerciseService.getExercisesByAmount(amount);
    }
}
