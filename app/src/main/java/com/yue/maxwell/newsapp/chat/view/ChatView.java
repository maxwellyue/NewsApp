package com.yue.maxwell.newsapp.chat.view;

import android.os.Parcelable;

import com.yue.maxwell.newsapp.bean.ChatMsg;

import java.util.List;

/**
 * 2016/10/3 0003，由 Administrator 创建 .
 * <p>
 * 功能描述：
 * <p>
 * 说明：
 * ---------------------------
 * 修改时间：
 * 修改说明：
 * 修改人：
 */

public interface ChatView<T> {

    void addMsgItem(ChatMsg<T> replyMsg);

    void addMsgItem(List<ChatMsg<T>> replyMsg);

    void showErrorMsg(String errorMsg);

    void clearMsg();
}
