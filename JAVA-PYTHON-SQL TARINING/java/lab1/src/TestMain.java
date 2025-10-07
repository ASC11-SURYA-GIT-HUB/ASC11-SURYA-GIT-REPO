public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Alice");
        s1.setCity("New York");
        s1.setMarks1(70);
        s1.setMarks2(80);
        s1.setMarks3(90);
        s1.setFeePerMonth(5000f);
        s1.setEligibleForScholarship(true);

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Bob");
        s2.setCity("Los Angeles");
        s2.setMarks1(65);
        s2.setMarks2(55);
        s2.setMarks3(75);
        s2.setFeePerMonth(3000f);
        s2.setEligibleForScholarship(false);

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("Charlie");
        s3.setCity("Chicago");
        s3.setMarks1(80);
        s3.setMarks2(90);
        s3.setMarks3(85);
        s3.setFeePerMonth(4500f);
        s3.setEligibleForScholarship(true);

        Student[] students = {s1, s2, s3};

        // Student with highest total marks
        Student topStudent = s1;
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Top Student: " + topStudent.getStudentName());

        // Student with lowest fee
        Student lowestFeeStudent = s1;
        for (Student s : students) {
            if (s.getFeePerMonth() < lowestFeeStudent.getFeePerMonth()) {
                lowestFeeStudent = s;
            }
        }
        System.out.println("Lowest Fee Student: " + lowestFeeStudent.getStudentName() + " - Fee: " + lowestFeeStudent.getFeePerMonth());

        // Print details for every student
        for (Student s : students) {
            System.out.println("\nStudent: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship Eligible: " + s.isEligibleForScholarship());
        }
    }
}
