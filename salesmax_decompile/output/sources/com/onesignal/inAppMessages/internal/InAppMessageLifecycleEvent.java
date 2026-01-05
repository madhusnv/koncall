package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.IInAppMessage;
import com.onesignal.inAppMessages.IInAppMessageDidDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageDidDisplayEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDisplayEvent;
import p001o.sq8;

/* loaded from: classes6.dex */
public class InAppMessageLifecycleEvent implements IInAppMessageWillDisplayEvent, IInAppMessageWillDismissEvent, IInAppMessageDidDisplayEvent, IInAppMessageDidDismissEvent {
    private final IInAppMessage message;

    public InAppMessageLifecycleEvent(IInAppMessage iInAppMessage) {
        sq8.m48649h(iInAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.message = iInAppMessage;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageWillDisplayEvent, com.onesignal.inAppMessages.IInAppMessageWillDismissEvent, com.onesignal.inAppMessages.IInAppMessageDidDisplayEvent, com.onesignal.inAppMessages.IInAppMessageDidDismissEvent
    public IInAppMessage getMessage() {
        return this.message;
    }
}
