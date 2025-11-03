package springboo.example.spring_mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

/*
@author zhang
@Date   2025/10/13 14:11
@description
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private  Short age;
    private Short gender;
    private String phone;
    private String degree;
}
