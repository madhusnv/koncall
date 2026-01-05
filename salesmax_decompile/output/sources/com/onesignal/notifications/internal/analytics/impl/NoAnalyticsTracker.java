package com.onesignal.notifications.internal.analytics.impl;

import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NoAnalyticsTracker implements IAnalyticsTracker {
    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackInfluenceOpenEvent() {
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackOpenedEvent(String str, String str2) {
        sq8.m48649h(str, "notificationId");
        sq8.m48649h(str2, "campaign");
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackReceivedEvent(String str, String str2) {
        sq8.m48649h(str, "notificationId");
        sq8.m48649h(str2, "campaign");
    }
}
