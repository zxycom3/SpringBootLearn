package springboo.example.taliapro.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboo.example.taliapro.pojo.Emp;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.service.EmpService;
import springboo.example.taliapro.utils.Jwttool;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
@author zhang
@Date   2025/11/22 11:09
@description
*/
@RestController
@Slf4j
public class LoginController {
    @Autowired
    private EmpService empService;
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp)
    {
        log.info("登录操作");
        Emp e= empService.login(emp);
        if(e!=null&&e.getName().equals("金庸")&&e.getPassword().equals("123456"))
//        if(e!=null)
        {
            Map<String, Object> map=new HashMap<>();
            map.put("id",e.getId());
            map.put("name",e.getName());
            map.put("username",e.getUsername());
            String jwt=Jwttool.Genetate(map);
            return Result.success(jwt);
        }
        return Result.error("用户名或密码错误");
    }
}






