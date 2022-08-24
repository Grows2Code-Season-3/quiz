package org.launchcode.quiz;

import org.junit.Test;
import org.launchcode.quiz.assignment.Quiz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {

    @Test
    public void testAddAssignment() {
        // Arrange
        Student student = new Student("Jane");
        Quiz quiz = new Quiz();

        // Act
        student.addAssignment(quiz);

        // Assert
        assertTrue(student.getAssignments().contains(quiz));
        assertEquals(1, student.getAssignments().size());
    }

}
