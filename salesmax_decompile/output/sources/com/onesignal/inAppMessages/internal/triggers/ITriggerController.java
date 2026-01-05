package com.onesignal.inAppMessages.internal.triggers;

import com.onesignal.common.events.IEventNotifier;
import com.onesignal.inAppMessages.internal.InAppMessage;
import java.util.Collection;

/* loaded from: classes6.dex */
public interface ITriggerController extends IEventNotifier<ITriggerHandler> {
    boolean evaluateMessageTriggers(InAppMessage inAppMessage);

    boolean isTriggerOnMessage(InAppMessage inAppMessage, Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(InAppMessage inAppMessage);
}
