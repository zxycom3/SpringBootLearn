package springboo.example.sping_boot.entity;

import jakarta.persistence.*;
import org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase;
import org.springframework.aot.generate.GeneratedTypeReference;

/*
@author zhang
@Date   2025/9/22 16:04
@description
*/
@Entity//当前是一个jpa的实体=数据库表
@Table(name="t_user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String username;
    private  Integer age;
    private  String email;
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
