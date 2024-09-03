package notes;

public class Variable {


    public static void main(String[] args){

        // Generate a vector Array
        String [] course = new String[5];

        // Variables are declared;
        int idCourse;
        String courseName;
        String courseTeacherName;
        float courseScore;
        boolean courseStatus;

        //Variables are inicializated;

        idCourse = 101;
        courseName = "Java";
        courseTeacherName = "Ber";
        courseScore = 4.5f;
        courseStatus = true;

        //charging data into course vector
        String idCourse2 = idCourse + "";
        course[0] = idCourse2;
        course[1] = courseName;
        course[2] = courseTeacherName;
        course[3]= courseScore + "";
        course[4] = courseStatus + "";

        System.out.println(course[0]);
        System.out.println(course[1]);
        System.out.println(course[2]);
        System.out.println(course[3]);
        System.out.println(course[4]);




    }
}
