package utils;

import java.util.List;

/**
 * 简化的分页结果类
 */
public class PageResult<T> {
    private long total;          // 总记录数
    private List<T> list;        // 分页数据
    private int pageNum;         // 当前页码
    private int pageSize;        // 每页条数
    private int pages;           // 总页数

    // 构造方法
    public PageResult(long total, List<T> list, int pageNum, int pageSize) {
        this.total = total;
        this.list = list;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.pages = (int) Math.ceil((double) total / pageSize);
    }

    // Getters
    public long getTotal() { return total; }
    public List<T> getList() { return list; }
    public int getPageNum() { return pageNum; }
    public int getPageSize() { return pageSize; }
    public int getPages() { return pages; }
}
