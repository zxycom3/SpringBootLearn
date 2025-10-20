package springboo.example.lessionproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springboo.example.lessionproject.common.ApiResponse;
import springboo.example.lessionproject.entity.MajorCodeTable;
import springboo.example.lessionproject.repository.MajorCodeTableRepository;

import java.util.List;

/*
@author zhang
@Date   2025/10/18 16:00
@description
*/
@RestController
@RequestMapping("/api/major-codes")
@AllArgsConstructor
public class MajorCodeTableController
{

    private final MajorCodeTableRepository majorCodeTableRepository;
    @PostMapping
    public ApiResponse<MajorCodeTable> createMajorCode(@RequestBody MajorCodeTable majorCodeTable)
    {
        return ApiResponse.success(majorCodeTableRepository.save(majorCodeTable));
    }
    @GetMapping("/GetAll")
    public ApiResponse<List<MajorCodeTable>> createMajorCode()
    {
        return ApiResponse.success(majorCodeTableRepository.findAll());
    }


}
