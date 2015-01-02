package org.yy.paipai.response.message;

/*
* 文 件 名:  GetShopMsgListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺留言列表 ,http://pop.paipai.com/api/paipai/message/getShopMsgList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ItemMsg;

/**
* 查询店铺留言列表 ,http://pop.paipai.com/api/paipai/message/getShopMsgList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopMsgListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 3957150228375547955L;
    
    /**
     * l 	number 		总数
     */
    private Long total;
    
    /**
     *  	number 		页数索引，默认从1开始
     */
    private Long pageIndex;
    
    /**
     *  	number 		总页数
     */
    private Long pageTotal;
    
    /**
     *  	list 		消息列表结构体
     */
    private List<ItemMsg> itemMsgList;
    
    /**
    * l 	number 		总数
    */
    public Long getTotal() {
        return total;
    }
    
    /**
    */
    public void setTotal(Long total) {
        this.total = total;
    }
    
    /**
    *  	number 		页数索引，默认从1开始
    */
    public Long getPageIndex() {
        return pageIndex;
    }
    
    /**
    */
    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    *  	number 		总页数
    */
    public Long getPageTotal() {
        return pageTotal;
    }
    
    /**
    */
    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }
    
    /**
    *  	list 		消息列表结构体
    */
    public List<ItemMsg> getItemMsgList() {
        return itemMsgList;
    }
    
    /**
    */
    public void setItemMsgList(List<ItemMsg> itemMsgList) {
        this.itemMsgList = itemMsgList;
    }
    
}
