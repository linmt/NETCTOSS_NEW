package com.lmt.test_change_json;

import net.sf.json.JSONObject;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

/**
 * Created by 张洲徽 on 2018/12/28.
 */
public class PrintExcel {
    public static void main(String[] args) {
//        String data = "{'data':[{'名称':[{'2单元抽屉左侧板':'123','3单元抽屉左侧板':'456'},{'4单元抽屉左侧板':'123','5单元抽屉左侧板':'456'}]," +
//                "'部件编码':'8GCS.050.1159XD','柜体型号':'低电压配电柜','外购/自产':'自产','数量':'1','加工时间':'40','所属生产线':'钣金生产线（产线一)'},{'名称':'抽屉隔板','部件编码':'ctgb','柜体型号':'低电压配电柜','外购/自产':'自产','数量':'8','加工时间':'90','所属生产线':'钣金生产线（产线一)'},{'名称':'RC4-13二次动插件','部件编码':'RC4-13','柜体型号':'低电压配电柜','外购/自产':'外购','数量':'1','加工时间':'null','所属生产线':'钣金生产线（产线一)'}]}";

        String data = "{'data':"+
                "[{'名称':[{'2单元抽屉左侧板':'123','3单元抽屉左侧板':'456'},"+
                           "{'4单元抽屉左侧板':'123','5单元抽屉左侧板':'456'}]," +
                  "'部件编码':'8GCS.050.1159XD'},"+
                "{'名称':[{'A单元抽屉左侧板':'123','B单元抽屉左侧板':'456'},"+
                          "{'C单元抽屉左侧板':'123','D单元抽屉左侧板':'456'}]," +
                "'部件编码':'005151'}]}";

        print(data, "hhhhhhhh");
    }


    public static void print(String data,String name){
        //System.out.println(data);
        JSONObject jsonObject = JSONObject.fromObject(data);
        // 将函数调用的结果返回给result
        // 保存路径要改！！！！
        FileSystemView fsv  = FileSystemView.getFileSystemView();
        File path=fsv.getHomeDirectory();
        //C:\Users\热带雨林\Desktop
        String desktoppath = path.getPath();
        JSONObject result = Excel.createExcel(desktoppath+"\\"+name+".xls", jsonObject);
        // 输出结果
        System.out.println(result);
    }
}
