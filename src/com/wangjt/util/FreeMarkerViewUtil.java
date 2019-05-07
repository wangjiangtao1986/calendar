package com.wangjt.util;

import java.io.File;
import java.io.StringWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreeMarkerViewUtil {
    public static String genString(String templateFile,Map<String, String> dataModel) throws Exception {
        // 第一步：创建一个Configuration对象，直接new一个对象。构造方法的参数就是freemarker对于的版本号。
//        Configuration configuration = new Configuration(Configuration.getVersion());
        Configuration configuration = new Configuration();
        // 第二步：设置模板文件所在的路径。
        configuration.setDirectoryForTemplateLoading(new File(new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()).getParent()+"/ftl/"));
        // 第三步：设置模板文件使用的字符集。一般就是utf-8.
        configuration.setDefaultEncoding("utf-8");
        // 第四步：加载一个模板，创建一个模板对象。
        Template template = configuration.getTemplate(templateFile);
        // 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
        //向数据集中添加数据
        // 第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。
//        Writer out = new FileWriter(new File("D:/temp/term197/out/hello.html"));
        StringWriter out = new StringWriter();
        // 第七步：调用模板对象的process方法输出文件。
        template.process(dataModel, out);
        // 第八步：关闭流。
        return out.toString();  
    }
    
//    public static String genString() throws Exception {
//        // 第一步：创建一个Configuration对象，直接new一个对象。构造方法的参数就是freemarker对于的版本号。
////        Configuration configuration = new Configuration(Configuration.getVersion());
//        Configuration configuration = new Configuration();
//        // 第二步：设置模板文件所在的路径。
//        configuration.setDirectoryForTemplateLoading(new File("D:/wangjt/Workspaces10/calendar/WebRoot/WEB-INF/ftl/"));
//        // 第三步：设置模板文件使用的字符集。一般就是utf-8.
//        configuration.setDefaultEncoding("utf-8");
//        // 第四步：加载一个模板，创建一个模板对象。
//        Template template = configuration.getTemplate("email.htm");
//        // 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
//        Map dataModel = new HashMap<>();
//        //向数据集中添加数据
//        dataModel.put("msg", "this is my first freemarker test.");
//        // 第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。
////        Writer out = new FileWriter(new File("D:/temp/term197/out/hello.html"));
//        StringWriter out = new StringWriter();
//        // 第七步：调用模板对象的process方法输出文件。
//        template.process(dataModel, out);
//        // 第八步：关闭流。
//  
//        return out.toString();  
//    }
    
//    public static void genFile() throws Exception {
//        // 第一步：创建一个Configuration对象，直接new一个对象。构造方法的参数就是freemarker对于的版本号。
////        Configuration configuration = new Configuration(Configuration.getVersion());
//        Configuration configuration = new Configuration();
//        // 第二步：设置模板文件所在的路径。
//        configuration.setDirectoryForTemplateLoading(new File("D:/ftl"));
//        // 第三步：设置模板文件使用的字符集。一般就是utf-8.
//        configuration.setDefaultEncoding("utf-8");
//        // 第四步：加载一个模板，创建一个模板对象。
//        Template template = configuration.getTemplate("msg.htm");
//        // 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
//        Map dataModel = new HashMap<>();
//        //向数据集中添加数据
//        dataModel.put("msg", "this is my first freemarker test.");
//        // 第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。
////        Writer out = new FileWriter(new File("D:/temp/term197/out/hello.html"));
//        Writer out = new OutputStreamWriter(System.out);
//        // 第七步：调用模板对象的process方法输出文件。
//        template.process(dataModel, out);
//        // 第八步：关闭流。
//        out.close();
//    }

    public static void main(String[] args) throws Exception {
//    	genString();
    }
}