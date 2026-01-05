package com.onesignal.inAppMessages.internal.lifecycle;

import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessagePage;

/* loaded from: classes6.dex */
public interface IInAppLifecycleEventHandler {
    void onMessageActionOccurredOnMessage(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult);

    void onMessageActionOccurredOnPreview(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult);

    void onMessagePageChanged(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage);

    void onMessageWasDismissed(InAppMessage inAppMessage);

    void onMessageWasDisplayed(InAppMessage inAppMessage);

    void onMessageWillDismiss(InAppMessage inAppMessage);

    void onMessageWillDisplay(InAppMessage inAppMessage);
}
