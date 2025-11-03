package springboo.example.spring_mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
@author zhang
@Date   2025/10/17 11:09
@description
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp
{
    private int id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private  Short job;
    private LocalDateTime entrydate;
    private  int deptId;
    private  LocalDateTime createTime;
    private  LocalDateTime updateTime;
}
