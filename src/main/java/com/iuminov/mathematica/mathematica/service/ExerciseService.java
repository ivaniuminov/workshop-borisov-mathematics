package com.iuminov.mathematica.mathematica.service;

import com.iuminov.mathematica.mathematica.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseService {

    public List<Exercise> getExercisesByAmount(int amount) {
        List<Exercise> result = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            Exercise ex = new Exercise();
            ex.setQuestion("Question " + i);
            ex.setAnswer("Answer " + i);
            result.add(ex);
        }
        return result;
    }
}
