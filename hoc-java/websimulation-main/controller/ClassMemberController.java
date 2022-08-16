package controller;

import java.time.LocalDate;

import org.json.JSONObject;

import dto.MemberDto;
import model.Gender;
import model.Student;
import model.Teacher;
import service.ClassMemberService;
import util.Constants;
import util.DateTimeUtil;

public class ClassMemberController {
    
    private ClassMemberService classMemberService;

    public ClassMemberController() {
        this.classMemberService = new ClassMemberService();
    }

    /**
     * add moi student
     * @param studentDto
     * @return
     */
    public JSONObject addStudent(JSONObject studentInfo) {

        // convert json objet to teacher DTO
        String name = studentInfo.getString("name").toString();
        LocalDate birthday = DateTimeUtil.convertStringToLocalDate(studentInfo.get("birthday").toString());
        Gender gender = studentInfo.get("gender").toString().toLowerCase().equals("name") ? Gender.MALE : Gender.FEMALE;
        String email = studentInfo.get("email").toString();
        String phoneNumber = studentInfo.get("phoneNumber").toString();
        boolean isOnline = studentInfo.get("isOnline").toString().toLowerCase().equals("y") ? true : false;
        String background = studentInfo.get("yearOfExperience").toString();
        Student student = new Student(0, name, birthday, gender, email, phoneNumber, isOnline, background);
        //call service 

        int id =  classMemberService.addNewStudent(student);
        System.out.println("new user id: " + id);

        // create result
        JSONObject result = new JSONObject();
        result.put("status_code", Constants.OK);
        if (id > 0) {
            result.put("success", true);
            result.put("message", "Add student thanh cong");
        } else {
            result.put("success", false);
            result.put("message", "Add student that bai");
        }
        return result;

    }

    /**
     * add moi teacher
     * @param teachderDto
     * @return
     */
    public JSONObject addTeacher(JSONObject teacherInfo) {
        // convert json object to teacher Dto
        String name = teacherInfo.get("name").toString();
        LocalDate birthday = DateTimeUtil.convertStringToLocalDate(teacherInfo.get("birthday").toString());
        Gender gender = teacherInfo.get("gender").toString().toLowerCase().equals("name") ? Gender.MALE : Gender.FEMALE;
        String email = teacherInfo.get("email").toString();
        String phoneNumber = teacherInfo.get("phoneNumber").toString();
        int yearOfExperience = Integer.parseInt(teacherInfo.get("yearOfExperience").toString());
        String speciality = teacherInfo.get("speciality").toString();

        Teacher teacher = new Teacher(0, name, birthday, gender, email, phoneNumber, yearOfExperience, speciality);
        // call service
        int id =  classMemberService.addNewTeacher(teacher);
        System.out.println("new user id: " + id);
        // create result
        JSONObject result = new JSONObject();
        result.put("status_code", Constants.OK);
        if (id > 0) {
            result.put("success", true);
            result.put("message", "Add teacher thanh cong");
        } else {
            result.put("success", false);
            result.put("message", "Add teacher that bai");
        }
        return result;
    }

    /**
     * delete user by id
     * @param id
     * @return
     */
    public int deleteUser(int id) {
        return 0;
    }

    /**
     * search user by keyword
     * @param keyword
     * @return
     */
    public JSONObject search(String keyword) {
        return null;
    }


    public JSONObject getStudentInfo(int id) {
        return null;
    }

    public JSONObject getTeacherInfo(int id) {
        return null;
    }

}
