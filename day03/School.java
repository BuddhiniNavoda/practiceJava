import java.util.ArrayList;

public class School {

    public class Student {
        private String S_id;
        private String S_name;
        private String className;
        private String grade;

        public String getStudentDetails() {
            return S_id + S_name + className + grade;

        }

        public void setStudentDetails(String S_id, String S_name, String className, String grade) {
            this.S_id = S_id;
            this.S_name = S_name;
            this.className = className;
            this.grade = grade;

        }

        /*
         * public int getS_id(){
         * return S_id;
         * }
         * 
         * public void int setS_id(int S_id){
         * this.S_id=S_id;
         * }
         * 
         * 
         * public String getS_name(){
         * return S_name;
         * }
         * 
         * public void String setS_name(String S_name){
         * this.S_name=S_name;
         * }
         * 
         * 
         * 
         * public String getclassName(){
         * return className;
         * }
         * 
         * public void String setclassName(String getclassName){
         * this.className=className;
         * }
         * 
         * 
         * public String getgrade(){
         * return grade;
         * }
         * 
         * public void String setgrade(String grade){
         * this.grade= grade;
         * }
         */
        public void addStudent() {
            ArrayList<String> studentList = new ArrayList<>();
            studentList.add(S_name);
            System.out.println("Student List" + studentList);
            System.out.println("Number of students:" + studentList.size());

        }

    }

    public class Teacher {
        private String T_id;
        private String T_name;
        private String subject;

        public String getTeacherDetails() {
            return T_id + T_name + subject;

        }

        public void setStudentDetails(String T_id, String T_name, String subject) {
            this.T_id = T_id;
            this.T_name = T_name;
            this.subject = subject;

        }

        /*
         * public int getT_id(){
         * return T_id;
         * }
         * 
         * public void int setT_id(int T_id){
         * this.T_id=T_id;
         * }
         * 
         * public String getT_name(){
         * return T_name;
         * }
         * 
         * public void String setT_name(String T_name){
         * this.S_name=T_name;
         * }
         */

        public void addTeacher() {
            ArrayList<String> teacherList = new ArrayList<>();
            teacherList.add(T_name);
            System.out.println("Student List" + teacherList);
            System.out.println("Number of students:" + teacherList.size());

        }

        public void addSubject() {

            ArrayList<String> subjectList = new ArrayList<>();
            subjectList.add(subject);
            System.out.println("Subject List" + subjectList);
            System.out.println("Number of subjects:" + subjectList.size());

        }
    }

    public static void main(String[] args) {
        School school = new School();
        School.Student student = school.new Student();
        School.Teacher teacher = school.new Teacher();

        student.setStudentDetails("S001", "_John", "_grade10", "_A");
        System.out.println("Student Details: " + student.getStudentDetails());
        student.setStudentDetails("S002", "_Smith", "_grade1", "_A");
        System.out.println("Student Details: " + student.getStudentDetails());
        student.setStudentDetails("S003", "_Salman", "_grade5", "_A");
        System.out.println("Student Details: " + student.getStudentDetails());

        teacher.setStudentDetails("T001", "_Jane", "_Mathematics");
        System.out.println("Teacher Details: " + teacher.getTeacherDetails());

        student.addStudent();
        teacher.addTeacher();
        teacher.addSubject();
    }

}