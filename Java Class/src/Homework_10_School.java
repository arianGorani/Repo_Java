public class Homework_10_School {
    public static void main(String[] args) {




        //Student 1
        Homework_10_Students_Methods s1 = new Homework_10_Students_Methods();

        // Student Enrollment
        s1.enrollStudent("Arian", "NY","qa");


        // Display student profile
        s1.displayStudentProfile();



        // 0 <--> 5000
        s1.feeDeposit(1000);



        //"QA", "Web", "PM", "IT", "Network"
        s1.changeCourse("web");


        //static Method to display school summary
        Homework_10_Students_Methods.schoolSummary();




    }
}
