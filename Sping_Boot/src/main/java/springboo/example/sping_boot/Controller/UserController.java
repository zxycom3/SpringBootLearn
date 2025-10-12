package springboo.example.sping_boot.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springboo.example.sping_boot.DAO.UserDao;
import springboo.example.sping_boot.DAO.UserQueryAo;
import springboo.example.sping_boot.Server.ServerD;
import springboo.example.sping_boot.commom.Rest;
import springboo.example.sping_boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import springboo.example.sping_boot.DAO.UserRepostery;

import java.util.ArrayList;
import java.util.List;

/*
@author zhang
@Date   2025/9/22 16:12
@description
*/
@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
     private final ServerD server=new ServerD();
     @RequestMapping("GetUser")
     public Rest rest()
     {
         List<User> temp=server.GetUser();
         return Rest.succese1(temp);
     }
     @PostMapping
     public Rest Prest(@RequestBody User user)
     {
         User user1=server.addUser(user);
         return Rest.succese1(user1);
     }
     @RequestMapping("/Search")
     public Rest<?> getUsers(@Validated UserQueryAo queryAo)
     {
         return server.queryUser(queryAo);
     }
}
