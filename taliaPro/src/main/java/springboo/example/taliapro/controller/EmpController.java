package springboo.example.taliapro.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springboo.example.taliapro.pojo.Emp;
import springboo.example.taliapro.pojo.PageBean;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.service.EmpService;
import springboo.example.taliapro.utils.OssUploadExample;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理Controller
 */
@RestController
@Log4j2
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private OssUploadExample ossUploadExample;
//    @GetMapping("/emps")
//    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize)
//    {
//       log.info("分页查询");
//        PageBean pageBean=empService.page(page,pageSize);
//       return Result.success(pageBean);
//    }
    @GetMapping("/emps")
    public Result pagee(@RequestParam(defaultValue = "1") Integer page,
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        String name,
                        Short gender,
                        @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate begin,
                        @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate end )
    {
        log.info("分页查询");
        PageBean pageBean=empService.page(page,pageSize,name,gender,begin,end);
        return Result.success(pageBean);
    }
    @DeleteMapping("/emps/{ids}")
    public Result delete(@PathVariable List<Integer>ids)
    {
        empService.delete(ids);
        return Result.success();
    }
    @PostMapping("/emps")
    public Result add(@RequestBody Emp emp)
    {
        log.info("新增员工");
        empService.save(emp);
        return Result.success(emp);
    }
//    @PostMapping("/upload")
//    public Result upload(MultipartFile image) throws IOException {
//        log.info("文件上传{}{}","文件名:{}",image.getOriginalFilename());
//        String url= ossUploadExample.upload(image);
//        log.info("文件上传及其url{}",url);
//        return Result.success(url);
//    }
    @GetMapping("emps/{id}")
    public Result findbyid(@PathVariable Integer id)
    {
        log.info("id查询");
        Emp emp=  empService.FindbyId(id);
        return Result.success(emp);
    }
    @PutMapping("emps")
    public Result update(@RequestBody Emp emp)
    {
        log.info(emp);
        empService.update(emp);
        return Result.success(emp);
    }

}
