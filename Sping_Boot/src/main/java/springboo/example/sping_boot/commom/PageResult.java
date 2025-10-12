package springboo.example.sping_boot.commom;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class PageResult<T> {
    private List<T> list;
    private int page;
    private int size;
    private long total;
    private int pages;

    // 构造方法也可以保留，或者用setter
    public PageResult() {
    }

    // 如果需要从Page<T>构造，也可以写构造方法
    public PageResult(Page<T> page) {
        this.list = page.getContent();
        this.page = page.getNumber() + 1; // 1-based
        this.size = page.getSize();
        this.total = page.getTotalElements();
        this.pages = page.getTotalPages();
    }
}