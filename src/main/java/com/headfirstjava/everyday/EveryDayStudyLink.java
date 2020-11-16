package com.headfirstjava.everyday;

import com.headfirstjava.service.User2Service;
import lombok.SneakyThrows;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * @author: liuyuhang
 * @date: 2020/11/05
 */
public class EveryDayStudyLink {
    /**
     * 这里面存储一些每天学到的新的并且需要花时间进一步整理的知识
     *
     */


    /**
     * git  查看分支情况
     * https://www.jianshu.com/p/5adc552323ca
     *
     * git branch
     * 👆查看本地分支
     *
     * git branch -a
     * 👆查看本地分支和远程分支
     *
     * git branch -r
     * 👆单独只查看远程分支
     *
     *
     * git pull origin master:brantest
     * git pull origin branch1:dev
     * 将远程主机origin的master分支拉取过来，与本地的brantest分支合并
     *
     * git push
     * git push <远程主机名> <本地分支名>:<远程分支名>
     *
     *
     * git branch -vv 查看分支关联情况
     *
     */

    /**
     * git Your local changes to the following files would be overwritten by checkout
     * https://blog.csdn.net/qq_32452623/article/details/75645578
     */


    /**
     * git branch --set-upstream-to=origin/branch1 dev
     * 将本地分支 dev 和远程分支 branch1 相关联
     *
     */

    /**
     * 1⃣️git init 初始化仓库，这个命令在本地初始化了一个 master 本地仓库
     * 2⃣️github 新建项目代码，GitHub 可以更改新建项目的默认分支名字，例如 main 或者 master 分支
     * 3⃣️本地仓库和远程仓库建立关联
     *  git remote add origin https://github.com/onemoretrees/gitcheet.git
     *  将本地仓库和远程仓库关联起来
     * 4⃣️这个时候分支还没有关联 ⚠️
     * 5⃣️ git 本地 master 分支和远程 master 分支建立关联
     * git branch --set-upstream-to=origin/master master
     * 6⃣️ git pull
     *
     * ⚠️ 本地分支推送到远程
     * 1⃣️ 切换到要推送的分支上面，
     * 2⃣️ git push origin dev:dev1
     * 3⃣️ 推送本地 dev 分支到远程 dev1 分支，
     * 4⃣️ 本地 dev 分支代码推送到远程 dev 分支
     *   git push origin dev:dev1
     * 5⃣️
     */


    /**
     *
     * git merge 和 git rebase 小结
     * https://www.cnblogs.com/veryvalley/p/8026580.html
     *
     *
     */


    /**
     * 放弃 git 修改，已经 git add 或者 没有 git add
     * https://www.cnblogs.com/qufanblog/p/7606105.html
     *
     */


    /**
     * git log 命令
     * https://www.jianshu.com/p/0805b5d5d893
     */


    /**
     * git add
     */

    /**
     * 跨域定义
     * https://blog.csdn.net/ppxin/article/details/94717173
     *
     * 跨越解决方法
     * https://blog.csdn.net/echizao1839/article/details/106938167/
     */


    /**
     *
     * idea 注入数据提示 Field injection is not recommended
     * 构造器（构造函数）注入:类同名构造函数
     * setter 注入：字段 set 方法
     * field 字段注入：字段 field 注入
     * https://blog.csdn.net/Li_Ya_Fei/article/details/104448398?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param
     *
     *
     */

    /**
     *
     * mybatis eq 用法
     * https://blog.csdn.net/qq_41115103/article/details/107536997
     */


    /**
     *
     * git 推送分支
     *
     * https://www.cnblogs.com/everfight/p/git_push_local_branch.html
     *
     * 如果你本地的分支名称和远程名称相同，则使用以下命令：
     * git push origin branchName
     *
     *
     * 如果本地的分支跟远程的分支不一样，则指定本地和远程的分支的名称：
     * git push origin localBranchName:remoteBranchName
     *
     *
     * git 分支查看与切换
     * 1.查看所有分支
     * git branch -a
     *
     * 2.查看当前使用分支(结果列表中前面标*号的表示当前使用分支)
     * git branch
     *
     * 3.切换分支
     * git checkout 分支名
     *
     */


    /**
     *
     * sourcetree 分支使用
     * https://www.jianshu.com/p/ea9ebad692d2
     *
     */


    /**
     *
     * jakson 使用
     * https://www.cnblogs.com/guanbin-529/p/11488869.html
     *
     */


    /**
     *
     * mybatis 配置文件 头文件报红
     * https://blog.csdn.net/qq_29564213/article/details/88753292
     *
     */


    /**
     *
     * postMan 传 map  参数
     * https://blog.csdn.net/weixin_41288824/article/details/104810188
     *
     */

    /**
     *
     * idea 关闭 xml 文件黄色背景
     * https://blog.csdn.net/u010318957/article/details/72459183
     *
     * Mac 更改步骤
     * perferences > editors > inspections > 右侧选择 SQL >
     * 取消勾选 No data sources configured
     * 取消勾选 SQL dialect detection
     *
     */

    /**
     * 常见数据库连接地址代码
     * https://www.cnblogs.com/activiti/p/6703478.html
     *
     */


    /**
     *
     *nacos 服务注册demo
     * https://blog.csdn.net/xxh_1229/article/details/108813542
     *
     */

    /**
     * 2020-11-06
     *
     */


    /**
     * 解决 No qualifying bean of type 问题
     * https://blog.csdn.net/u010565545/article/details/100066824
     */

    /**
     * Spring事务7种传播行为
     * https://cloud.tencent.com/developer/article/1701449
     */


    /**
     * rest 接口
     * 规范 https://blog.csdn.net/h8y0bDJVUkwE1LboZlE/article/details/106654052
     * demo https://www.javazhiyin.com/29174.html
     * demo https://www.jianshu.com/p/e6b62b9f3b7b
     */


    /**
     *
     * idea Mac maven 默认仓库地址
     * /Users/liuyuhang/.m2/repository
     */

    /**
     * https://www.cnblogs.com/zhou-chao/p/7678899.html
     * git 本地分支和远程分支关联错误或者重新关联
     *
     */


    /**
     * git 删除分支
     * https://www.cnblogs.com/liyong888/p/9822410.html
     */

    /**
     * git There is no tracking information for the current branch.
     * https://blog.csdn.net/sinat_36246371/article/details/79738782
     */

    /**
     * git pull
     * https://www.runoob.com/git/git-push.html
     */

    /**
     * refusing to merge unrelated histories
     *
     * https://blog.csdn.net/u012145252/article/details/80628451
     */


    /**
     * Git错误non-fast-forward后的冲突解决
     * https://blog.csdn.net/sinat_25306771/article/details/55257901
     */

    /**
     * git无法pull仓库 报错refusing to merge unrelated histories
     * https://blog.csdn.net/weixin_41858542/article/details/81202972
     */




    /**
     * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
     * https://www.cnblogs.com/justlove/p/7637681.html
     */


    /**
     * @Requestmapping 映射多个 url
     * https://blog.csdn.net/single_wolf_wolf/article/details/82702320
     * demo
     * @Controller
     * @RequestMapping({"/params", "/"})
     * public class ParamsController {}
     */


    /**
     *
     * mysql 导入多个文件
     * 使用 source 命令
     * https://my.oschina.net/u/4406817/blog/3350411
     *
     * ⚠️：这个命令是要在系统的命令行窗口执行的，在 Navicate 自己本地没有测试成功
     */


    /**
     * lombok @SneakyThrows 注解
     * 该注解用来处理一些必须处理的异常，受检异常，每次都要去处理这些代码，这个注解可以骗过编译器
     * https://www.jianshu.com/p/7d0ed3aef34b
     */

    /**
     * http urlConnection
     * http://www.blogjava.net/supercrsky/articles/247449.html
     * https://www.cnblogs.com/zhuyeshen/p/11429576.html
     */


    /**
     * maven project>build>plugins
     *
     * https://segmentfault.com/a/1190000003019959
     */

    /**
     * maven 私附服设置
     * https://my.oschina.net/heweipo/blog/481047
     */

    @SneakyThrows
    @Test
    public void urlConnectionTest(){
        String message = "";

        URL url=new URL("http://www.baidu.com");
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5*1000);
        connection.connect();
        InputStream inputStream=connection.getInputStream();

        byte[] data=new byte[1024];
        StringBuffer sb=new StringBuffer();
        int length=0;
        while ((length=inputStream.read(data))!=-1){
            String s=new String(data, Charset.forName("utf-8"));
            sb.append(s);
        }
        message=sb.toString();

        System.out.println(message);
        inputStream.close();
        connection.disconnect();
    }


}
