package springboo.example.lession2.controller;

import springboo.example.lession2.Entity.User;
import springboo.example.lession2.Server.UserRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/*
@author zhang
@Date   2025/9/29 10:41
@description
*/
@RestController
@RequestMapping("/api/users") // 接口基础路径，与前端axios的baseURL对应
@CrossOrigin(origins = "http://localhost:3030") // 允许前端域名（Vue默认8080）
public class UserController
{
     @Autowired
     private UserRun userRun;
     @GetMapping
     public List<User> getAllUsers() {
         return userRun.getAllUsers();
     }
    // 2. 添加用户（对应前端POST /api/users）
    @PostMapping
    public void addUser(@RequestBody User user) {
       userRun.addUser(user);
    }

    // 3. 更新用户（对应前端PUT /api/users/{id}）
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
       userRun.updateUser(id,updatedUser);
    }

    // 4. 删除用户（对应前端DELETE /api/users/{id}）
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
       userRun.deleteUser(id);
    }
}
