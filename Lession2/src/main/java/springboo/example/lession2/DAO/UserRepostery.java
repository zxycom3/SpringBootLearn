package springboo.example.lession2.DAO;

import springboo.example.lession2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/*
@author zhang
@Date   2025/9/29 10:36
@description
*/
@Component
public interface UserRepostery extends JpaRepository<User,Long>
{
}
