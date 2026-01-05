package com.onesignal.inAppMessages;

/* loaded from: classes6.dex */
public interface IInAppMessageClickResult {
    String getActionId();

    boolean getClosingMessage();

    String getUrl();

    InAppMessageActionUrlType getUrlTarget();
}
