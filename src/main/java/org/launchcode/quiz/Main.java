package org.launchcode.quiz;

import org.launchcode.quiz.assignment.CodingProject;
import org.launchcode.quiz.assignment.Quiz;
import org.launchcode.quiz.question.CheckboxQuestion;
import org.launchcode.quiz.question.MultipleChoiceQuestion;
import org.launchcode.quiz.question.ShortAnswerQuestion;
import org.launchcode.quiz.question.TrueFalseQuestion;

import java.util.Date;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jane");

        Quiz quiz = new Quiz();
        student.addAssignment(quiz);

        quiz.addQuestion(new ShortAnswerQuestion("What is your favorite color?", "green"));
        quiz.addQuestion(new TrueFalseQuestion("Cheese is delicious", true));

        String[] mcChoices = {"Charlotte", "Asheville", "Raleigh", "Greensboro"};
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of North Carolina?", mcChoices, 2));

        String[] cbChoices = {"6", "42", "7", "2"};
        int[] cbAnswers = {2, 3};
        quiz.addQuestion(new CheckboxQuestion("Which of the following are prime numbers?", cbChoices, cbAnswers));

        quiz.runQuiz();

        // Create, submit, and grade a CodingProject
        CodingProject project = new CodingProject("https://classroom.github.com/a/8nCf_KLD",
                new Date(),
                "Java Assignment 2");

        student.addAssignment(project);
        project.setRepositoryUrl("https://github.com/my-assignment-2");
        project.setUserScore(1);

        double studentGrade = student.calculateGrade();

        System.out.println("The overall grade for " + student.getName() + " is " + studentGrade);
    }

}
