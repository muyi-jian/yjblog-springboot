package com.yjblog.admin.service;

import com.yjblog.admin.model.vo.FindCategoryPageListReqVO;
import com.yjblog.admin.model.vo.category.AddCategoryReqVO;
import com.yjblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.yjblog.common.utils.PageResponse;
import com.yjblog.common.utils.Response;

/**
 * @author 木白
 * @date 2024/6/2
 * @description
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);
    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);
    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();
}
