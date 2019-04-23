package com.sspu;

import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
public class GeneratorMybatis {
	   public static void main(String[] args) throws Exception{  
		   List<String> warnings = new ArrayList<String>();
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(GeneratorMybatis.class.getClassLoader().getResourceAsStream("mybatis/generatorConfig.xml"));
		   DefaultShellCallback shellCallback = new DefaultShellCallback(true);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
		   myBatisGenerator.generate(null);	
		   System.out.println(warnings+",");
	   }
	   
	    
}
