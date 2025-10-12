package springboo.example.lession2.Server;

import springboo.example.lession2.DAO.UserDao;
import springboo.example.lession2.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/*
@author zhang
@Date   2025/9/29 11:01
@description
*/
@Component
public class UserRun implements JUserRun
{
  /*  private static final List<User> users = new ArrayList<>();
    static {
        users.add(new User(1L, "admin", "admin@example.com", "2025-09-29"));
        users.add(new User(2L, "test", "test@example.com", "2025-09-28"));
    }*/
    @Autowired
    private UserDao users=new UserDao();

    @Override
    public List<User> getAllUsers() {
        return users.All();
    }
    // 2. 添加用户（对应前端POST /api/users）
    @Override
    @PostMapping
    public void addUser(User user) {
      //  user.setId(long);
        //(users.size() + 1))
        user.setCreateTime(new Date().toString().substring(0, 10));
        users.addUser(user);
    }

    @Override
    public void updateUser(Long id, User updatedUser) {

    }

    // 3. 更新用户（对应前端PUT /api/users/{id}）
 /*   @Override
    @PutMapping("/{id}")
    public void updateUser(Long id,User updatedUser) {
        List<User> userss = new ArrayList<>();
        userss.add((User) users.All());
        for (int i = 0; i < userss.size(); i++) {
            if (userss.get(i).getId().equals(id)) {
                updatedUser.setId(id);
                updatedUser.setCreateTime(userss.get(i).getCreateTime()); // 保持创建时间不变
                userss.set(i, updatedUser);
                break;
            }
        }
    }*/
    // 4. 删除用户（对应前端DELETE /api/users/{id}）
    @Override
    @DeleteMapping("/{id}")
    public void deleteUser(Long id) {
      //  users.removeIf(user -> user.getId().equals(id));
        users.delete(id);
    }
}
