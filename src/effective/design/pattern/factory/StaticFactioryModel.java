package effective.design.pattern.factory;

import java.util.List;

public class StaticFactioryModel {
    private String data;
    private List<String> dataList;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }
}
