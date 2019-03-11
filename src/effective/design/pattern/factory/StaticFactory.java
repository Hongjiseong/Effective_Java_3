package effective.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class StaticFactory{
    private String id;
    private static StaticFactory staticFactory = new StaticFactory();

    public final static int MAX_SIZE = 20;
    public final static int MIN_SIZE = 10;

    private StaticFactory(){}
    private StaticFactory (String id){
        this.id = id;
    }

    public static StaticFactory from(String id){
        return new StaticFactory(id);
    }
    public static StaticFactioryModel of(String data1, String data2){
        StaticFactioryModel dataModel = new StaticFactioryModel();
        List<String> dataList = new ArrayList<>();

        dataList.add(data1);
        dataList.add(data2);
        dataModel.setDataList(dataList);

        return dataModel;
    }
    public static String[] valueOf(int size){
        String[] stringArray = new String[size];
        return stringArray;
    }
    public static StaticFactory getInstance(String id){
        return staticFactory;
    }
    public static StaticFactory newInstance(){
        return new StaticFactory();
    }
}
