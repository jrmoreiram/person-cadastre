package com.junior.personcadastre.api.param;

import io.swagger.annotations.ApiParam;

/**
 * Default pagination object.
 *
 * @author Júnior Moreira Martins
 */
public class PaginationParam {

    @ApiParam(name = "page", defaultValue = "0", value = "Page number")
    private Integer page = 0;

    @ApiParam(name = "pageSize", defaultValue = "1000", value = "Number of information per page")
    private Integer pageSize = 1000;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
