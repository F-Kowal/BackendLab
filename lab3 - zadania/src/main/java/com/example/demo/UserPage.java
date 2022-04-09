package com.example.demo;

import java.util.*;


public class UserPage {
    private int pageNumber;
    private int pageCount;
    private int pageSize;
    private int totalCount;
    private List<Object> users;

    public UserPage() {

    }

    public UserPage(int pageNumber, int pageCount, int pageSize, int totalCount, List<Object> users) {
        this.pageNumber = pageNumber;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.users = users;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Object> getUsers() {
        return users;
    }

    public void setUsers(List<Object> users) {
        this.users = users;
    }
}
