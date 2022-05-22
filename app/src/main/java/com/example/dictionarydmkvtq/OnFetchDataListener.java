package com.example.dictionarydmkvtq;

import com.example.dictionarydmkvtq.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
