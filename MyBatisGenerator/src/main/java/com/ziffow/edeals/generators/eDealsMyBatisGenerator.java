package com.ziffow.edeals.generators;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import sun.rmi.rmic.iiop.ClassPathLoader;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zffow on 12/7/14.
 */
public class eDealsMyBatisGenerator {
    public static  void main(String[] args)throws  Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream st= ClassPathLoader.getSystemResourceAsStream("eDealsConfig.xml");
       // File configFile = new File(st);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(st);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
