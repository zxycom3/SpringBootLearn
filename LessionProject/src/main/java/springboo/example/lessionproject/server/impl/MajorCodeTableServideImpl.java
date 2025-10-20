package springboo.example.lessionproject.server.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboo.example.lessionproject.entity.MajorCodeTable;
import springboo.example.lessionproject.repository.MajorCodeTableRepository;
import springboo.example.lessionproject.server.MajorCodeTableservice;

import java.util.List;
import java.util.Optional;

/*
@author zhang
@Date   2025/10/18 17:27
@description
*/
@Service
@RequiredArgsConstructor
public class MajorCodeTableServideImpl implements MajorCodeTableservice
{
    private  final MajorCodeTableRepository majorCodeTableRepository;
    @Override
    public List<MajorCodeTable> getAllMajorCodes() {
        return majorCodeTableRepository.findAll();
    }

    @Override
    public Optional<MajorCodeTable> getMajorCodeById(Long id) {
        return majorCodeTableRepository.findById(id);
    }

    @Override
    public MajorCodeTable saveMajorCode(MajorCodeTable majorCodeTable) {
        return majorCodeTableRepository.save(majorCodeTable);
    }

    @Override
    public void deleteMajorcode(Long id) {
        majorCodeTableRepository.deleteById(id);
    }

    @Override
    public Optional<MajorCodeTable> getByMajorCodeName(String majorname) {
        return majorCodeTableRepository.findByMajorName(majorname);
    }
}
