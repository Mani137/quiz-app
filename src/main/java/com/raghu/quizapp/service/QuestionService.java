package com.raghu.quizapp.service;

import com.raghu.quizapp.entity.Question;
import com.raghu.quizapp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions() {
        return repo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return repo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        repo.save(question);
        return "Success";
    }

    public String updateQuestion(Question question) {
        repo.save(question);
        return "Updated Successfully";
    }

    public String deleteQuestion(int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
