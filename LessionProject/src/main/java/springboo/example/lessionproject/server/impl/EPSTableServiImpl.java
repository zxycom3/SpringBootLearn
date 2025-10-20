package springboo.example.lessionproject.server.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboo.example.lessionproject.entity.EPSTable;
import springboo.example.lessionproject.entity.MajorCodeTable;
import springboo.example.lessionproject.repository.EPSTableRepository;
import springboo.example.lessionproject.server.EPSTablesevice;

import java.util.List;
import java.util.Optional;

/*
@author zhang
@Date   2025/10/20 15:18
@description
*/
@Service
@RequiredArgsConstructor
public class EPSTableServiImpl implements EPSTablesevice {
    private  EPSTableRepository epsTableRepository;
    @Override
    public List<EPSTable> getAllEPSTs() {
        return epsTableRepository.findAll();
    }

    @Override
    public Optional<EPSTable> getEPSTById(Long id) {
        return epsTableRepository.findById(id);
    }

    @Override
    public EPSTable saveEPST(EPSTable epsTable) {
        return epsTableRepository.save(epsTable);
    }

    @Override
    public void deleteEPST(Long id) {
        epsTableRepository.deleteById(id);
    }

    @Override
    public Optional<EPSTable> getByexprimentName(String exprimentname) {
        return epsTableRepository.findByexprimentName(exprimentname);
    }
}
