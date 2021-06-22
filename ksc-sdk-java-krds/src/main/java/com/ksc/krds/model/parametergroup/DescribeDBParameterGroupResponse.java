package com.ksc.krds.model.parametergroup;

import java.util.List;

public class DescribeDBParameterGroupResponse {

    private List<DBParameterGroup> DBParameterGroups;

    private String Source;

    private Integer MaxRecords;

    private Integer TotalCount;

    private Integer Marker;

    public List<DBParameterGroup> getDBParameterGroups() {
        return DBParameterGroups;
    }

    public void setDBParameterGroups(List<DBParameterGroup> DBParameterGroups) {
        this.DBParameterGroups = DBParameterGroups;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }
}
