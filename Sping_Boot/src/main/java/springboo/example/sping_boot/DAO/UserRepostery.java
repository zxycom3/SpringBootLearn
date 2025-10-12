package springboo.example.sping_boot.DAO;

import springboo.example.sping_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

/*
@author zhang
@Date   2025/9/22 16:10
@description
*/

public interface UserRepostery extends JpaRepository<User,Long>
{
}
