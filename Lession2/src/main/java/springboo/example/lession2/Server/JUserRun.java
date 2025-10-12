package springboo.example.lession2.Server;

import springboo.example.lession2.Entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/*
@author zhang
@Date   2025/9/29 11:03
@description
*/
@Component
public interface JUserRun
{
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(Long id,User updatedUser);
    void deleteUser(Long id);
}
