package com.raghu.quizapp.controller;

import com.raghu.quizapp.entity.Question;
import com.raghu.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService service;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable("category") String category){
        return service.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return service.addQuestion(question);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question){
        return service.updateQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable("id") int id){
        return service.deleteQuestion(id);
    }


}
