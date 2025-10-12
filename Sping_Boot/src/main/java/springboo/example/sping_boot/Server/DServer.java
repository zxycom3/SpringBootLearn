package springboo.example.sping_boot.Server;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import springboo.example.sping_boot.DAO.UserQueryAo;
import springboo.example.sping_boot.DAO.UserVo;
import springboo.example.sping_boot.commom.PageResult;
import springboo.example.sping_boot.commom.Rest;
import springboo.example.sping_boot.entity.User;

import java.util.List;

/*
@author zhang
@Date   2025/9/26 17:32
@description
*/
public interface DServer
{
    List<User> GetUser ();
    User addUser(User user);
    Rest<PageResult<UserVo>> queryUser(UserQueryAo queryAo);
}
