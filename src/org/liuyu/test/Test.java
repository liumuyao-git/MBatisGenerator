package org.liuyu.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<>();//创建存放警告信息的集合
        ConfigurationParser cp = new ConfigurationParser(warnings);//将警告信息放入ConfigurationParser

        File file = new File("/Users/liuyu/IDEA-workspace/MyBatisGenerator/src/generator.xml");//导入generator.xml配置文件信息
        Configuration configuration = cp.parseConfiguration(file);//将generator.xml导入parseConfiguration中

        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, warnings);
        generator.generate(null);
        System.out.println("执行成功");

    }
}
