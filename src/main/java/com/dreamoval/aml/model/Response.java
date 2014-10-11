package com.dreamoval.aml.model;

import java.util.List;

/**
 * Created by dreamadmin on 10/11/14.
 */
public class Response {
    private List<Object> columns;
    private List<Object> data;

    public List<Object> getColumns() {
        return columns;
    }

    public void setColumns(List<Object> columns) {
        this.columns = columns;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
