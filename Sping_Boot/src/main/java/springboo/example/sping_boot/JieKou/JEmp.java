package springboo.example.sping_boot.JieKou;

import springboo.example.sping_boot.Emp;

import java.util.List;

/*
@author zhang
@Date   2025/9/16 21:45
@description
*/
public interface JEmp
{
    List<Emp> Dao();
    List<Emp> server();
}
