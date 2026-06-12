/*
We have 3 students, and each student has taken 3 exams. We want to store these scores and calculate the average score for each student.
 */
public class StudentGrade{
    public static void main(String[] args) {
        // 1. Initialize a 2D array (3 students, 3 exams each)
        // Rows = Students, Columns = Exam Scores
        int[][] grades = {
                {85, 90, 78},  // Student 0
                {92, 88, 95},  // Student 1
                {70, 65, 75}   // Student 2
        };
        // 2. Loop through the 2D array to process the data
        // The outer loop iterates through each row (each student)
        for (int i = 0; i < grades.length; i++) {
            int totalScore = 0;

            // The inner loop iterates through each column (each exam score for that student)
            for (int j = 0; j < grades[i].length; j++) {
                totalScore += grades[i][j]; // Accessing the element at row i, column j
            }

            // Calculate the average (cast to double for precision)
            double average = (double) totalScore / grades[i].length;

            // Print the result for the current student
            System.out.println("Student " + (i + 1) + "'s Average Score: " + average);
        }
    }
}