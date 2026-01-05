package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessagePromptFactory implements IInAppMessagePromptFactory {
    private final ILocationManager _locationManager;
    private final INotificationsManager _notificationsManager;

    public InAppMessagePromptFactory(INotificationsManager iNotificationsManager, ILocationManager iLocationManager) {
        sq8.m48649h(iNotificationsManager, "_notificationsManager");
        sq8.m48649h(iLocationManager, "_locationManager");
        this._notificationsManager = iNotificationsManager;
        this._locationManager = iLocationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory
    public InAppMessagePrompt createPrompt(String str) {
        sq8.m48649h(str, "promptType");
        if (sq8.m48644c(str, InAppMessagePromptTypes.PUSH_PROMPT_KEY)) {
            return new InAppMessagePushPrompt(this._notificationsManager);
        }
        if (sq8.m48644c(str, "location")) {
            return new InAppMessageLocationPrompt(this._locationManager);
        }
        return null;
    }
}
