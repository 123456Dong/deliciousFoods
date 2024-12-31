package com.example.service.impl;

import java.util.List;

import com.example.dao.ClassifyInfoDao;
import com.example.pojo.ClassifyInfo;
import com.example.service.ClassifyInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 菜谱大类信息Service业务层处理
 *
 * @author dong
 *
 */
@Service
public class ClassifyInfoServiceImpl implements ClassifyInfoService
{
    @Autowired
    private ClassifyInfoDao classifyInfoDao;

    /**
     * 查询菜谱大类信息
     *
     * @param id 菜谱大类信息主键
     * @return 菜谱大类信息
     */
    @Override
    public ClassifyInfo selectClassifyInfoById(Long id)
    {
        return classifyInfoDao.selectClassifyInfoById(id);
    }

    /**
     * 查询菜谱大类信息列表
     *
     * @param classifyInfo 菜谱大类信息
     * @return 菜谱大类信息
     */
    @Override
    public PageInfo<ClassifyInfo> selectClassifyInfoList(Integer pageNum, Integer pageSize,ClassifyInfo classifyInfo)
    {
        PageHelper.startPage(pageNum, pageSize);
        List<ClassifyInfo> all = classifyInfoDao.selectClassifyInfoList(classifyInfo);
        return PageInfo.of(all);
    }

    /**
     * 新增菜谱大类信息
     *
     * @param classifyInfo 菜谱大类信息
     * @return 结果
     */
    @Override
    public int insertClassifyInfo(ClassifyInfo classifyInfo)
    {
        return classifyInfoDao.insertClassifyInfo(classifyInfo);
    }

    /**
     * 修改菜谱大类信息
     *
     * @param classifyInfo 菜谱大类信息
     * @return 结果
     */
    @Override
    public int updateClassifyInfo(ClassifyInfo classifyInfo)
    {
        return classifyInfoDao.updateClassifyInfo(classifyInfo);
    }



    /**
     * 删除菜谱大类信息信息
     *
     * @param id 菜谱大类信息主键
     * @return 结果
     */
    @Override
    public int deleteClassifyInfoById(Long id)
    {
        return classifyInfoDao.deleteClassifyInfoById(id);
    }
}
