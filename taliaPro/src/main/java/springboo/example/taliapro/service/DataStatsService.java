package springboo.example.taliapro.service;

import java.util.Map;

public interface DataStatsService {
    Map<Integer, Integer> getPeoper(int year);

    Long allcount(int yaer);
}