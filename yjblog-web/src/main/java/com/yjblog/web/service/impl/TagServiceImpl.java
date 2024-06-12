package com.yjblog.web.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yjblog.common.domain.dos.TagDO;
import com.yjblog.common.domain.mapper.TagMapper;
import com.yjblog.common.utils.Response;
import com.yjblog.web.model.vo.tag.FindTagListRspVO;
import com.yjblog.web.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Service
@Slf4j
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    /**
     * 获取标签列表
     *
     * @return
     */
    @Override
    public Response findTagList() {
        // 查询所有标签
        List<TagDO> tagDOS = tagMapper.selectList(Wrappers.emptyWrapper());

        // DO 转 VO
        List<FindTagListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(tagDOS)) {
            vos = tagDOS.stream()
                    .map(tagDO -> FindTagListRspVO.builder()
                            .id(tagDO.getId())
                            .name(tagDO.getName())
                            .build())
                    .collect(Collectors.toList());
        }

        return Response.success(vos);
    }
}