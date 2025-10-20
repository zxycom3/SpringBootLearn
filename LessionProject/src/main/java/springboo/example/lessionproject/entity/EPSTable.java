package springboo.example.lessionproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@author zhang
@Date   2025/10/18 17:07
@description
*/
@Data
@Entity(name="course")
@AllArgsConstructor
@NoArgsConstructor
public class EPSTable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    序号
    private int seriaLnNumber;
//    实验编号
    private String exprimentNumber;
//   实验名称
    private String exprimentName;
//   实验内容
    private String exprimentContent;
//    实验类别
    private int exprimentCategory;
//    实验类性
    private int exprimentNature;
//
    private int exprimentDiscipline;
//    实验要求
    private int exprimentRequirement;
//    实验者类别
    private int exprimenterCategory;
//    实验人数
    private int exprimenterCount;
//    实验者组人数
    private int groupmemmberCount;
//
    private int exprimentCrediHours;
    private int isoffered;
    private int nonexprimentReason;
    private String labNo;
    private String labname;
    private String coursename;
    private int courseSemester;
    private int totalCoursehours;
    private int throrehours;
    private int practicaHours;
    private int courseType;

}
