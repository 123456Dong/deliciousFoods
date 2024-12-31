package com.example.service;

import com.example.pojo.ClassifyInfo;
import com.github.pagehelper.PageInfo;

/**
 * 菜谱大类信息Service接口
 *
 * @author dong
 *
 */
public interface ClassifyInfoService
{
    /**
     * 查询菜谱大类信息
     *
     * @param id 菜谱大类信息主键
     * @return 菜谱大类信息
     */
    public ClassifyInfo selectClassifyInfoById(Long id);

    /**
     * 查询菜谱大类信息列表
     *
     * @param classifyInfo 菜谱大类信息
     * @return 菜谱大类信息集合
     */
    public PageInfo<ClassifyInfo> selectClassifyInfoList(Integer pageNum, Integer pageSize, ClassifyInfo classifyInfo);

    /**
     * 新增菜谱大类信息
     *
     * @param classifyInfo 菜谱大类信息
     * @return 结果
     */
    public int insertClassifyInfo(ClassifyInfo classifyInfo);

    /**
     * 修改菜谱大类信息
     *
     * @param classifyInfo 菜谱大类信息
     * @return 结果
     */
    public int updateClassifyInfo(ClassifyInfo classifyInfo);



    /**
     * 删除菜谱大类信息信息
     *
     * @param id 菜谱大类信息主键
     * @return 结果
     */
    public int deleteClassifyInfoById(Long id);
}
