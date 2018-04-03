package com.dx.dto;

/**
 * Created by 14571 on 2018/4/2.
 */
public class PageDTO {
    private int currPage=1;
    private int maxPage;
    private int rows=3;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
