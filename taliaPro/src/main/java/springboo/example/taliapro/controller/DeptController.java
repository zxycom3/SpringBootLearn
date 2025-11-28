package springboo.example.taliapro.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboo.example.taliapro.pojo.Dept;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.service.DeptService;
import springboo.example.taliapro.service.impls.DeptServiceImpl;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class DeptController {
//    private static final Logger log=LoggerFactory.getLogger(DeptController.class);
//    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @Autowired
    private final DeptService deptServiceimp;
    @GetMapping("/depts")
    public Result list()
    {
        log.info("查询数据");
        List<Dept> depts=deptServiceimp.FindAlLDept();
        return Result.success(depts);
    }
    @DeleteMapping("depts/{id}")
    public void DeleteById(@PathVariable Integer id)
    {
        log.info("通过id删除部门成员");
        deptServiceimp.DeleteById(id);
    }
    @PostMapping("/depts")
    public Result InsertByDept(@RequestBody Dept dept)
    {
        deptServiceimp.InsertByDept(dept);
        log.info("新增部门数据");
        return Result.success(dept);
    }
}
