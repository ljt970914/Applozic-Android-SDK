package com.applozic.mobicomkit.uiwidgets.conversation.fragment;

import android.os.Environment;

import java.io.File;

public  class FileURL {

    private static String path = Environment.getExternalStorageDirectory().toString() + "/tessdata";
    /**
     * 创建一个文件
     * @param FileName 文件名
     * @return
     */
    public static File createFile(String FileName) {
        return new File(path, FileName);
    }
}