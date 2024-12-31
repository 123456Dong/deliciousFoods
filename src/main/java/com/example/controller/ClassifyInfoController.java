package com.example.controller;

import com.example.common.Result;
import com.example.pojo.ClassifyInfo;
import com.example.service.ClassifyInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 菜谱大类信息Controller
 *
 * @author dong
 *
 */
@Controller
@RequestMapping("/classifyInfo")
public class ClassifyInfoController
{

    @Autowired
    private ClassifyInfoService classifyInfoService;



    /**
     * 查询菜谱大类信息列表
     */
    @PostMapping("/list")
    @ResponseBody
    public Result<PageInfo<ClassifyInfo>> list(@RequestParam(defaultValue = "1") Integer pageNum,
                                               @RequestParam(defaultValue = "5") Integer pageSize,
                                               ClassifyInfo classifyInfo)
    {
       return Result.success(classifyInfoService.selectClassifyInfoList(pageNum, pageNum,classifyInfo));
    }



    /**
     * 新增保存菜谱大类信息
     */
    @PostMapping("/add")
    @ResponseBody
    public Result addSave(ClassifyInfo classifyInfo)
    {
        return Result.success(classifyInfoService.insertClassifyInfo(classifyInfo));
    }



    /**
     * 修改保存菜谱大类信息
     */
    @PostMapping("/edit")
    @ResponseBody
    public Result editSave(ClassifyInfo classifyInfo)
    {
        return Result.success(classifyInfoService.updateClassifyInfo(classifyInfo));
    }

    /**
     * 删除菜谱大类信息
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long id)
    {
        return Result.success(classifyInfoService.deleteClassifyInfoById(id));
    }
}
