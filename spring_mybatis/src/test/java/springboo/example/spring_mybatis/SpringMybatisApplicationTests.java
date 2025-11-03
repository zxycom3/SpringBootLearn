package springboo.example.spring_mybatis;

import springboo.example.spring_mybatis.mapper.EmpMapper;
import springboo.example.spring_mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboo.example.spring_mybatis.pojo.Emp;
import springboo.example.spring_mybatis.pojo.User;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EmpMapper empMapper;

    @Test
    public  void testlistUser(){
        List<User> All=userMapper.list();
        for (User user : All) {
            System.out.println(user.toString());
        }
    }
//    @Test
//    public  void Delet()
//    {
//        int x=empMapper.delete(16);
//        System.out.println(x);
//    }
//    @Test
//    public void Insert()
//    {
//        Emp em = new Emp(18, "user12", "123456", "张三", (short)1, "1", (short)2, LocalDateTime.of(2025, 1, 1, 0, 0), 1, LocalDateTime.now(), LocalDateTime.now());
//        empMapper.insert(em);
//        System.out.println(em.getId());
//    }
//    @Test
//    public  void testEmp(){
//        List<Emp> All=empMapper.em();
//        for (Emp em : All) {
//            System.out.println(em.toString());
//        }
//    }
//    @Test
//    public  void update()
//    {
//        Emp em=new Emp();
//        em.setId(16);
//        em.setImage("18.jpg");
//        em.setGender((short) 0);
//        em.setJob((short) 1);
//        em.setName("Tom");
//        em.setUpdateTime(LocalDateTime.now());
//        em.setDeptId(1);
//        em.setUsername("userTom");
//        empMapper.update(em);
//    }
//    @Test
//    public void find()
//    {
//        Emp em=empMapper.Findid(7);
//        System.out.println(em.toString());
//    }
    @Test
    public  void getbyequis()
    {
        Emp em= new Emp();
        em.setGender((short) 1);
        em.setName("张");
        List<Emp> list=empMapper.getByequis(em);
        for(int i=0;i<list.size();++i)
        {
            System.out.println(list.get(i).toString());
        }
    }






}
