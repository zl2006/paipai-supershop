package org.yy.paipai.request.yingxiao;

/*
* 文 件 名:  GetLtdItemRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询参加限时活动商品信息 请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.yingxiao.GetLtdItemResponse;

/**
* 查询参加限时活动商品信息 请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetLtdItemRequest extends AbstractPaiPaiRequest<GetLtdItemResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/getLtdItem.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetLtdItemResponse> getResponseClass() {
        return GetLtdItemResponse.class;
    }
    
    /**
    *活动ID
    */
    public String getActivityId() {
        return textMap.get("activityId");
    }
    
    /**
    *
    */
    public void setActivityId(String activityId) {
        textMap.put("activityId", activityId);
    }
    
}
