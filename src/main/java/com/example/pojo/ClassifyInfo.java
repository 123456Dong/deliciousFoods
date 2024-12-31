package com.example.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 菜谱大类信息对象 classify_info
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Classify_info")
public class ClassifyInfo
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String descroiption;


}
