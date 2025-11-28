package springboo.example.taliapro.service.impls;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.autoconfigure.PageHelperProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboo.example.taliapro.mapper.EmpMapper;
import springboo.example.taliapro.pojo.Emp;
import springboo.example.taliapro.pojo.PageBean;
import springboo.example.taliapro.service.EmpService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
   @Autowired
   private EmpMapper empMapper;
   @Autowired
   private PageHelperProperties pageHelperProperties;

    @Override
    public PageBean page(Integer page, Integer pagesize, String name, Short gender, LocalDate begin, LocalDate end) {
        PageHelper.startPage(page,pagesize);
        List<Emp> empList=empMapper.emplist(page,pagesize,name,gender,begin,end);
        Page<Emp> emppage=(Page<Emp>)empList;
        return new PageBean((int) emppage.getTotal(),emppage.getResult());
    }

    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }


//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        PageHelper.startPage(page,pageSize);
//        List<Emp>emplist=empMapper.emplist();
//        Page<Emp> empPage=(Page<Emp>) emplist;
//        return new PageBean((int) empPage.getTotal(),empPage.getResult());
//    }

    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
       empMapper.save(emp);
    }

    @Override
    public Emp FindbyId(Integer id) {
       return empMapper.FindbyId(id);
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
//        emp.setEntrydate(LocalDate.from(LocalDateTime.now()));
        empMapper.update(emp);
    }
    @Override
    public Emp login(Emp emp) {
        return empMapper.login(emp);
    }

}
