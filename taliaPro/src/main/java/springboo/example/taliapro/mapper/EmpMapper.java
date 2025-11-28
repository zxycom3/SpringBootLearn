package springboo.example.taliapro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import springboo.example.taliapro.pojo.Emp;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
//    @Select("SELECT COUNT(*) FROM talias.emp")
//    public Long count();
//
//    @Select("select *from talias.emp limit #{start},#{pagesize}  ")
//    public List<Emp> page(Long start,Long pagesize);
//    @Select("select *from talias.emp")
//      public List<Emp> emplist();

    List<Emp> emplist(Integer page, Integer pagesize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    void save(Emp emp);
    @Select("select *from talias.emp where id=#{id}")
    Emp FindbyId(Integer id);

    void update(Emp emp);
    @Select("select *from talias.emp where username=#{username} and password=#{password}")
    Emp login(Emp emp);

    Integer countEmpByMonth(@Param("month") Integer month,@Param("year") Integer year);
    @Select("SELECT COUNT(*) FROM talias.emp WHERE DATE_FORMAT(entrydate, '%Y') = #{year}")
    Long allcount(int year);
}
