package springboo.example.taliapro.service;

import springboo.example.taliapro.pojo.Emp;
import springboo.example.taliapro.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
public interface EmpService {

//    PageBean page(Integer page, Integer pageSize);
    PageBean page(Integer page, Integer pagesize, String name, Short gender, LocalDate begin,LocalDate end);

    void delete(List<Integer> ids);

    void save(Emp emp);

    Emp FindbyId(Integer id);

    void update(Emp emp);

    Emp login(Emp emp);

}
