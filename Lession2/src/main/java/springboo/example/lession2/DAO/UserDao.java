package springboo.example.lession2.DAO;

import springboo.example.lession2.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/*
@author zhang
@Date   2025/9/29 11:14
@description
*/
@Component
public class UserDao
{
      @Autowired
      private  UserRepostery userRepostery;

      public void addUser(User user)
      {
          userRepostery.save(user);
      }

      public  void delete(Long id)
      {
          userRepostery.deleteById(id);
      }

      public Optional<User> find(Long id)
      {
          return userRepostery.findById(id);
      }

      public List<User> All()
      {
          return userRepostery.findAll();
      }


}
