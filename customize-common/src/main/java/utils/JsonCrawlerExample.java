package utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class JsonCrawlerExample {
    public static void main(String[] args) {
        try {
            // 发送HTTP GET请求并获取网页内容
            Document document = Jsoup.connect("https://mp.weixin.qq.com/s?__biz=MzIxNjI3MTM4OQ==&mid=2649848148&idx=2&sn=bd29b0abe07e1b91f8450f86f3c7857c&chksm=8f8e4626b8f9cf3067ce9973632b72c5743e98f588db6e6af29b7e63086e5a37a9d02d2d90dc&scene=27").get();

            // 获取网页标题
            String title = document.title();
            System.out.println("网页标题：" + title);

            String body = document.body().text();
            System.out.println("网页内容：" + body);



            // 获取所有的链接
            Elements links = document.select("a[href]");
            System.out.println("链接数量：" + links.size());

            // 打印每个链接的文本和URL
            for (Element link : links) {
                String linkText = link.text();
                String linkUrl = link.attr("href");
                System.out.println("链接文本：" + linkText);
                System.out.println("链接URL：" + linkUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
