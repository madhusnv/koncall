package com.onesignal.inAppMessages.internal.lifecycle;

import com.onesignal.common.events.IEventNotifier;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessagePage;

/* loaded from: classes6.dex */
public interface IInAppLifecycleService extends IEventNotifier<IInAppLifecycleEventHandler> {
    void messageActionOccurredOnMessage(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult);

    void messageActionOccurredOnPreview(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult);

    void messagePageChanged(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage);

    void messageWasDismissed(InAppMessage inAppMessage);

    void messageWasDisplayed(InAppMessage inAppMessage);

    void messageWillDismiss(InAppMessage inAppMessage);

    void messageWillDisplay(InAppMessage inAppMessage);
}
