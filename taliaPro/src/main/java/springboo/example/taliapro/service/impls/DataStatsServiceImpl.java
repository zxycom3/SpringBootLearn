package springboo.example.taliapro.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboo.example.taliapro.mapper.DeptMapper;
import springboo.example.taliapro.mapper.EmpMapper;
import springboo.example.taliapro.service.DataStatsService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataStatsServiceImpl implements DataStatsService {
    @Autowired
    EmpMapper empMapper;
    @Override
    public Map<Integer, Integer> getPeoper(int year) {

        Map<Integer,Integer> ma=new HashMap<>();
        for(int i=1;i<=12;++i)
        {
            ma.put(i, empMapper.countEmpByMonth(i,year));
        }
        return ma;
    }

    @Override
    public Long allcount(int year) {
     return   empMapper.allcount(year);
    }
}