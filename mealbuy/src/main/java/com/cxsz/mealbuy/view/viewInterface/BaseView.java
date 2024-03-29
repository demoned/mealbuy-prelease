package com.cxsz.mealbuy.view.viewInterface;

public interface BaseView {
    void showLoadingView();

    void closeLoadingView();

    void showErrorInfo(String info);

    void showErrorInfo(String tag, String info);
}
