package springboo.example.lessionproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboo.example.lessionproject.entity.MajorCodeTable;

import java.util.Optional;

/*
@author zhang
@Date   2025/10/18 15:54
@description
*/
//实现jpa接口
//直接继承可使用jpa数据库（h2）的数据库操作
@Repository
public interface MajorCodeTableRepository extends JpaRepository<MajorCodeTable,Long>
{
    Optional<MajorCodeTable> findByMajorName(String majorName);
}
