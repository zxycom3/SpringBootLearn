package springboo.example.lessionproject.entity;

import jakarta.persistence.*;
import lombok.Data;

/*
@author zhang
@Date   2025/10/18 15:30
@description
*/
@Data
@Entity(name="tbl_mct")
public class MajorCodeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //所属学院
    @Column(name="affiliatedCollege")
    private String affiliatedCollege;
    //专业代码
    private String majorCode;
//    专业名称
    private String majorName;
//    学制
    private String educationslSystem;
//    培养层次
    private String educationalLevel;
}
