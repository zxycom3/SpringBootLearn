package springboo.example.sping_boot.Server;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;
import springboo.example.sping_boot.DAO.*;
import springboo.example.sping_boot.commom.PageResult;
import springboo.example.sping_boot.commom.Rest;
import springboo.example.sping_boot.entity.User;
import springboo.example.sping_boot.entity.Uuser;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;

import static springboo.example.sping_boot.commom.Rest.succese1;

/*
@author zhang
@Date   2025/9/26 17:18
@description
*/
@Component
public class ServerD implements DServer
{
    @Autowired
    UserDao userdao=new UserDao();
    @Autowired
    private UserRepostery userRepostery;
    @Autowired
    private UserDaoU userDaoU;
    @Override
    public List<User> GetUser ()
    {
        return userdao.All();
    }

    @Override
    public User addUser(User user) {
        return  userdao.addUser(user);
      //  return user;
    }
    @Override
    public Rest<PageResult<UserVo>> queryUser(UserQueryAo queryAo) {
        // 处理排序
        Sort sort = Sort.by(
                Sort.Direction.fromString(
                        queryAo.getSortDirection() == null ? "ASC" : queryAo.getSortDirection()
                ),
                queryAo.getSortField()
        );

        // 页码转换：前端1-based -> Spring Data JPA 0-based
        int page = queryAo.getPage() - 1;
        int size = queryAo.getSize();
        PageRequest pageable = PageRequest.of(page, size, sort);

        // 调用Repository进行分页查询
        Page<Uuser> userPage = userDaoU.findAll(pageable);

        // 实体列表转换为VO列表
        List<UserVo> userVoList = userPage.getContent().stream()
                .map(UserVo::fromEntity)
                .collect(Collectors.toList());

        // 构造PageResult<UserVo>
        PageResult<UserVo> pageResult = new PageResult<>();
        pageResult.setList(userVoList);
        pageResult.setPage(userPage.getNumber() + 1); // 转回1-based页码
        pageResult.setSize(userPage.getSize());
        pageResult.setTotal(userPage.getTotalElements());
        pageResult.setPages(userPage.getTotalPages());

        // 封装为Rest响应
        return Rest.succese1(pageResult); // 假设Rest有success静态方法
    }


}
