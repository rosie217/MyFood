package com.food.myfood.ui.signup;

import androidx.lifecycle.MutableLiveData;

import com.food.myfood.ui.base.BaseViewModel;

public class SignUpViewModel extends BaseViewModel {
    public MutableLiveData<Boolean> showRequire = new MutableLiveData<>();
    public MutableLiveData<Boolean> hasNumber = new MutableLiveData<>();
    public MutableLiveData<Boolean> biggerThanSix = new MutableLiveData<>();

    public void setShowRequire(Boolean isShow) {
        showRequire.setValue(isShow);
    }
    public void setIsNumber(Boolean isNumber) {
        hasNumber.setValue(isNumber);
    }
    public void setValidText(Boolean isValid) {
        biggerThanSix.setValue(isValid);
    }
}