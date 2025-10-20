package springboo.example.lessionproject.server;

import springboo.example.lessionproject.entity.MajorCodeTable;

import java.util.List;
import java.util.Optional;

/*
@author zhang
@Date   2025/10/18 17:28
@description
*/
public interface MajorCodeTableservice {
    List<MajorCodeTable> getAllMajorCodes();
    Optional<MajorCodeTable> getMajorCodeById(Long id);
    MajorCodeTable saveMajorCode(MajorCodeTable majorCodeTable);
    void deleteMajorcode(Long id);
//    根据专业名称查询
    Optional<MajorCodeTable> getByMajorCodeName(String majorname);
}
