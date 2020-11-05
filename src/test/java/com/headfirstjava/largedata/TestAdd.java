package com.headfirstjava.largedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author: liuyuhang
 * @date: 2020/11/05
 */
public class TestAdd {

    /**
     * 原文链接 https://www.cnblogs.com/keatsCoder/p/11849137.html
     * @param args
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String user = "root";
        String password = "123456789";

        //建立连接
        Connection conn = DriverManager.getConnection(url, user, password);


        String[] city1 = {"西安市", "延安市", "铜川市", "渭南市", "咸阳市", "宝鸡市", "汉中市", "榆林市", "安康市", "商洛市"};
        LocalDateTime begin = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder(" insert into test_id(name, age, address, birthday) values ");

            for (int j = 0; j < 100000; j++) {
                sb.append(" ('").append(NameUtil.getRandomUserName()).append("', ").append(i).append(", '").append(city1[i % city1.length]).append("', '2019-").append(i % 12 + 1).append("-").append(j % 27 + 1).append("'),");
            }
            String sql = sb.toString().substring(0, sb.length() - 1);
            Statement statement = conn.createStatement();
            statement.execute(sql);
        }
        LocalDateTime end = LocalDateTime.now();
        Duration between = Duration.between(begin, end);
        long l = between.toMillis();
        System.out.println( "相差的毫秒数：" +  l);
        System.out.println(end);
        System.out.println(begin);
    }
}
