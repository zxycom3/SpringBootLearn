package springboo.example.taliapro.service;

import springboo.example.taliapro.pojo.Dept;
import springboo.example.taliapro.pojo.Emp;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
      List<Dept> FindAlLDept();
      void DeleteById(Integer id);
      void InsertByDept(Dept dept);
}
