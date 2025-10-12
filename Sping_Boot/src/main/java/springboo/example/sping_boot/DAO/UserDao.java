package springboo.example.sping_boot.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import springboo.example.sping_boot.entity.User;
import springboo.example.sping_boot.entity.Uuser;

import java.util.List;

/*
@author zhang
@Date   2025/9/26 17:05
@description
*/
@Component
public class UserDao
{
    @Autowired
    private UserRepostery userRepostery;
    @Autowired
    private  UserDaoU userDaoU;

   // @PostMapping
    public User addUser(User user)
    {
        return userRepostery.save(user);
    }

    @GetMapping("/{id}")
    public  User getUser(@PathVariable("id") Long id)
    {
        System.out.println("ok");
        return userRepostery.findById(id).orElse(null);
    }
    //    @RequestMapping("Search")
//    public List<User> All(@RequestParam Integer page,@RequestParam Integer size)
//    {
//        return userRepostery.findAll();
//    }
 //   @RequestMapping("Search")
    public List<User> All()
    {
        return userRepostery.findAll();
    }

}
