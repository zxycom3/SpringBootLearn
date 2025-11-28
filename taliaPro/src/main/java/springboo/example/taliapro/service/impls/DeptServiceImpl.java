package springboo.example.taliapro.service.impls;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboo.example.taliapro.mapper.DeptMapper;
import springboo.example.taliapro.pojo.Dept;
import springboo.example.taliapro.service.DeptService;

import java.time.LocalDateTime;
import java.util.List;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
public class DeptServiceImpl implements DeptService {
    @Autowired
    private  final DeptMapper deptMapper;
    @Override
    public List<Dept> FindAlLDept() {
        return deptMapper.FindAllDept();
    }

    @Override
    public void DeleteById(Integer id) {
        deptMapper.DeleteById(id);
    }

    @Override
    public void InsertByDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.InsertByDept(dept);
    }
}
