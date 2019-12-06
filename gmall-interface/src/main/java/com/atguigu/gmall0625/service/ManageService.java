package com.atguigu.gmall0625.service;

import com.atguigu.gmall0625.bean.*;

import java.util.List;

public interface ManageService {
    //查询所有的一级分类信息
     List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类id查询二级分类id
     * @param catalog1Id
     * @return
     */

     List<BaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 根据二级节点id查询三级分类
     * @param catalog2Id
     * @return
     */
     List<BaseCatalog3> getCatalog3(String catalog2Id);

    /**
     * 根据三级节点id查询BaseAttrInfo
     * @param catalog3Id
     * @return
     */
     List<BaseAttrInfo> getBaseAttrInfo(String catalog3Id);


     void saveAttrInfo(BaseAttrInfo baseAttrInfo);

     List<BaseAttrValue> getAttrValueList(String attrId);
}
