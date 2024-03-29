package com.cxsz.mealbuy.presenter.presenterInterface;

import android.content.Context;

import com.cxsz.mealbuy.bean.ConfirmOrderResultBean;
import com.cxsz.mealbuy.bean.CreateOrderResultBean;
import com.cxsz.mealbuy.bean.MealGoodsBean;
import com.tencent.mm.opensdk.openapi.IWXAPI;

public interface MealDetailPresenter {
    void RequestConfirmOrder( MealGoodsBean.MealGoodsBodyBean mealGoodsBodyBean);

    void RequestCreateOrder( MealGoodsBean.MealGoodsBodyBean mealGoodsBodyBean, ConfirmOrderResultBean confirmOrderResultBean);

    void RequestPayForOrder(IWXAPI api, String weChatAppId, CreateOrderResultBean createOrderResultBean);

}
