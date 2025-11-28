package springboo.example.taliapro.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*
@author zhang
@Date   2025/11/25 23:39
@description
*/
@Data
public class PeoperData
{
    private Integer month;

    // 月末在职总人数：字段名正确，类型正确（需替换硬编码为查询值）
    private Integer total;

    // 当月新增人数：修正拼写错误，并用@JsonProperty映射为前端需要的"new"
    @JsonProperty("new") // 关键：让JSON返回字段名=前端需要的"new"
    private Integer newOne; // 原名nweone→修正为newOne（避免关键字+语义正确）
}
