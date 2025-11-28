package springboo.example.taliapro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboo.example.taliapro.pojo.PeoperData;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.service.DataStatsService; // 需要创建这个Service

import java.time.LocalDate;
import java.util.*;

@Slf4j
@RestController
@RequestMapping("/data/stats")
public class DataStatsController {

    @Autowired
    private DataStatsService dataStatsService;

    /**
     * 获取最近员工流动数据（新入职、离职）
     * 可以指定时间范围，例如按月、按季度
     * 假设这里获取最近3个月的数据
     *
     * @return Result 包含统计数据
     */
    @GetMapping("/employee")
    public Result getEmployeeFlowStats(@RequestParam  Integer year) {
        log.info("获取员工流动统计数据");
        // 可以传递参数，例如起始日期和结束日期，让前端选择
        // LocalDate endDate = LocalDate.now();
        // LocalDate startDate = endDate.minusMonths(3); // 统计最近3个月

        Map<Integer,Integer> ma=new HashMap<>();
        ma=dataStatsService.getPeoper(year);
        List<PeoperData> Data =new LinkedList<>();
        Long tatal=dataStatsService.allcount(year);
        for(int i=1;i<=12;++i)
        {
            PeoperData pa=new PeoperData();
            pa.setMonth(i);
            pa.setTotal(Math.toIntExact(tatal));
            pa.setNewOne((int) (tatal-ma.get(i)));
            Data.add(pa);
        }
        return Result.success(Data);
    }

}