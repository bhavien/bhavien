package com.example.mvpsampledemo.ui.base;

import com.example.mvpsampledemo.data.DataManager;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {
    DataManager mDataManager;
    private V mMvpView;
    public BasePresenter(DataManager dataManager) { mDataManager = dataManager; }
    @Override
    public void onAttach(V mvpView) { mMvpView = mvpView; }
    public V getMvpView() { return mMvpView; }
    public DataManager getDataManager() { return mDataManager; }
}
