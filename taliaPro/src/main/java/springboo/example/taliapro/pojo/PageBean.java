package springboo.example.taliapro.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/*
@author zhang
@Date   2025/11/20 11:10
@description
*/
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PageBean {
    private  Integer total;
    private List<Emp> rows;
}
