package springboo.example.sping_boot.DAO;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.IMessageContext;
import org.hibernate.validator.constraints.Range;

/*
@author zhang
@Date   2025/9/27 15:23
@description
*/
@Data
public class UserQueryAo {
    @NotNull
    @Min(message = "页码不能小于0", value = 0)
    private Integer page = 1; // 注意：页码通常从1开始，这里原来的100可能是测试值，建议改1

    @NotNull
    @Range(min = 1, max = 100)
    private Integer size = 10;

    // 新增排序方向属性
    @NotBlank(message = "排序方向不能为空")
    private String sortDirection = "ASC"; // 默认升序

    // 新增排序字段属性
    @NotBlank(message = "排序字段不能为空")
    private String sortField = "id"; // 默认按id排序
}
