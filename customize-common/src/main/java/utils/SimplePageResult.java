// family-common/src/main/java/utils/SimplePageResult.java
package utils;

import java.util.List;

/**
 * 简化版分页结果类（只保留核心字段）
 */
public class SimplePageResult<T> {
    private long total;       // 总记录数（必须）
    private List<T> data;     // 当前页数据（必须）
    private int pageNum;      // 当前页码（必须）
    private int pageSize;     // 每页条数（必须）
    private int totalPages;   // 总页数（可选，可前端计算）

    // 构造方法（自动计算总页数）
    public SimplePageResult(long total, List<T> data, int pageNum, int pageSize) {
        this.total = total;
        this.data = data;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPages = (int) Math.ceil((double) total / pageSize); // 总页数=总记录数/页大小（向上取整）
    }

    // Getters（无需Setters，构造时已赋值）
    public long getTotal() { return total; }
    public List<T> getData() { return data; }
    public int getPageNum() { return pageNum; }
    public int getPageSize() { return pageSize; }
    public int getTotalPages() { return totalPages; }
}