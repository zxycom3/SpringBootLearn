package springboo.example.lessionproject.server;

import springboo.example.lessionproject.entity.EPSTable;

import java.util.List;
import java.util.Optional;

/*
@author zhang
@Date   2025/10/20 15:20
@description
*/
public interface EPSTablesevice {
    List<EPSTable> getAllEPSTs();
    Optional<EPSTable> getEPSTById(Long id);
    EPSTable saveEPST(EPSTable epsTable);
    void deleteEPST(Long id);
    Optional<EPSTable> getByexprimentName(String exprimentname);
}
