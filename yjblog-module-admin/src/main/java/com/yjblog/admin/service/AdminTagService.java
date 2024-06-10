package com.yjblog.admin.service;


import com.yjblog.admin.model.vo.tag.AddTagReqVO;
import com.yjblog.admin.model.vo.tag.DeleteTagReqVO;
import com.yjblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.yjblog.admin.model.vo.tag.SearchTagsReqVO;
import com.yjblog.common.utils.PageResponse;
import com.yjblog.common.utils.Response;

/**
 * @author 木白
 * @date 2024/6/5
 * @description TODO
 **/
public interface AdminTagService {

    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);
}
