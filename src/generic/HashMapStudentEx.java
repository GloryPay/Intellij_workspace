package generic;

import java.util.HashMap;
import java.util.Iterator;

// id와 전화번호로 구성되는 Student 클래스를 만들고, 이름을 '키'로 하고 Student 객체를 '값' 으로 하는 해시맵을 작성하라.
class Student {
    int id;
    String phoneNum;

    Student(int id, String phoneNum){
        this.id = id;
        this.phoneNum = phoneNum;
    }
}

public class HashMapStudentEx {

    public static void main(String[] args) {

        HashMap<String,Student> Attendance = new HashMap<>();

        Attendance.put("김영찬",new Student(1, "010-4566-1234"));
        Attendance.put("맹근동",new Student(2, "010-4124-9994"));
        Attendance.put("조재욱",new Student(3, "010-2020-0806"));

        System.out.println("출석부의 학생수 : "+ Attendance.size() + "명\n");
/*
        Iterator<String> keys = Attendance.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.printf("이름 : %s\t학번 : %d\t폰번호 : %s\n", key, Attendance.get(key).id, Attendance.get(key).phoneNum);
        }
*/
        for (String name : Attendance.keySet()) {
            System.out.printf("이름 : %s\t학번 : %d\t폰번호 : %s\n", name, Attendance.get(name).id, Attendance.get(name).phoneNum);
        }

    }

}
