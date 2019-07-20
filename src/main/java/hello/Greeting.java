package hello;

/**
 * 是资源类，用于处理get请求，并且传参到http，如果说返回的body的状态是200 则ok，则返回查询的结果
 * 在Spring中会Jackson JSON 自动将资源类封装成json
 * */
public class Greeting  {
    private final long id;
    private final String content;

    /**
     * 构造函数 new一个对象时必须传参
    * */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
