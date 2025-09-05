package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 通用分页查询工具类
 * 支持String、int、Map、BO等多种参数类型
 */
public class PageQueryUtil {

    /**
     * 基础分页查询方法
     * @param pageNum 页码
     * @param pageSize 每页条数
     * @param queryFunction 查询函数接口
     * @param <T> 返回数据类型
     * @return 分页结果
     */
    public static <T> PageResult<T> query(int pageNum, int pageSize, QueryFunction<T> queryFunction) {
        // 执行全量查询
        List<T> allList = queryFunction.execute();
        // 手动分页处理
        List<T> pageList = getPageData(allList, pageNum, pageSize);
        // 计算分页参数
        long total = allList.size();
        int pages = (int) Math.ceil((double) total / pageSize);

        return new PageResult<>(
                total,
                pageList,
                pageNum,
                pageSize,
                pages
        );
    }

    /**
     * 带参数的分页查询 - 支持Map参数
     */
    public static <T> PageResult<T> queryWithParam(int pageNum, int pageSize,
                                                   Map<String, Object> params,
                                                   ParamQueryFunction<Map<String, Object>, T> queryFunction) {
        List<T> allList = queryFunction.execute(params);
        List<T> pageList = getPageData(allList, pageNum, pageSize);
        long total = allList.size();
        int pages = (int) Math.ceil((double) total / pageSize);

        return new PageResult<>(
                total,
                pageList,
                pageNum,
                pageSize,
                pages
        );
    }

    /**
     * 带参数的分页查询 - 支持BO对象参数
     */
    public static <P, T> PageResult<T> queryWithBo(int pageNum, int pageSize,
                                                   P paramBo,
                                                   ParamQueryFunction<P, T> queryFunction) {
        List<T> allList = queryFunction.execute(paramBo);
        List<T> pageList = getPageData(allList, pageNum, pageSize);
        long total = allList.size();
        int pages = (int) Math.ceil((double) total / pageSize);

        return new PageResult<>(
                total,
                pageList,
                pageNum,
                pageSize,
                pages
        );
    }

    /**
     * 手动分页处理逻辑
     */
    private static <T> List<T> getPageData(List<T> allList, int pageNum, int pageSize) {
        if (allList == null || allList.isEmpty()) {
            return new ArrayList<>();
        }

        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, allList.size());

        if (startIndex >= allList.size()) {
            return new ArrayList<>();
        }

        return allList.subList(startIndex, endIndex);
    }

    /**
     * 无参查询函数接口
     */
    @FunctionalInterface
    public interface QueryFunction<T> {
        List<T> execute();
    }

    /**
     * 带参查询函数接口
     */
    @FunctionalInterface
    public interface ParamQueryFunction<P, T> {
        List<T> execute(P param);
    }

    /**
     * 分页结果封装类
     */
    public static class PageResult<T> {
        private long total;          // 总记录数
        private List<T> list;        // 分页数据
        private int pageNum;         // 当前页码
        private int pageSize;        // 每页条数
        private int pages;           // 总页数

        public PageResult(long total, List<T> list, int pageNum, int pageSize, int pages) {
            this.total = total;
            this.list = list;
            this.pageNum = pageNum;
            this.pageSize = pageSize;
            this.pages = pages;
        }

        // Getters and Setters
        public long getTotal() { return total; }
        public void setTotal(long total) { this.total = total; }
        public List<T> getList() { return list; }
        public void setList(List<T> list) { this.list = list; }
        public int getPageNum() { return pageNum; }
        public void setPageNum(int pageNum) { this.pageNum = pageNum; }
        public int getPageSize() { return pageSize; }
        public void setPageSize(int pageSize) { this.pageSize = pageSize; }
        public int getPages() { return pages; }
        public void setPages(int pages) { this.pages = pages; }
    }
}
