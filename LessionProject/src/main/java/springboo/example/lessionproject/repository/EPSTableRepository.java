package springboo.example.lessionproject.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import springboo.example.lessionproject.entity.EPSTable;
import springboo.example.lessionproject.entity.MajorCodeTable;

import java.util.Optional;

/*
@author zhang
@Date   2025/10/18 17:23
@description
*/
public interface EPSTableRepository   extends JpaRepository<EPSTable,Long>
{
    Optional<EPSTable> findByexprimentName(String exprimentname);
}
