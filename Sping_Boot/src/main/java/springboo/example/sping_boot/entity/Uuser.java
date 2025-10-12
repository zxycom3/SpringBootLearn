package springboo.example.sping_boot.entity;

import jakarta.persistence.*;
import lombok.Getter;

/*
@author zhang
@Date   2025/9/27 15:16
@description
*/
@Entity
@Table(name="T_usern")
public class Uuser
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="username",nullable = false,length = 50,unique = true)
    private String username;
    @Column(name="password",nullable = false,length = 50)
    private String pwd;
    @Column(name="nikename",nullable = true,length = 50)
    private String nikename;
    @Column(name="email",nullable = false,length = 50,unique = true)
    private String email;
    @Getter
    private String createdAt;
    private String updateAt;
    private String stausText;
    public Uuser(int id, String username, String pwd, String nikename, String email, String createdAt, String updateAt, String stausText) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.nikename = nikename;
        this.email = email;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.stausText = stausText;
    }


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getStausText() {
        return stausText;
    }

    public void setStausText(String stausText) {
        this.stausText = stausText;
    }



    public Uuser(){}
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }





}
