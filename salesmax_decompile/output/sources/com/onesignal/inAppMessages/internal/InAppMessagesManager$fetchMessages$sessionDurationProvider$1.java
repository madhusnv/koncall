package com.onesignal.inAppMessages.internal;

import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class InAppMessagesManager$fetchMessages$sessionDurationProvider$1 extends kf9 implements uk7 {
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$fetchMessages$sessionDurationProvider$1(InAppMessagesManager inAppMessagesManager) {
        super(0);
        this.this$0 = inAppMessagesManager;
    }

    @Override // p001o.uk7
    public final Long invoke() {
        return Long.valueOf(this.this$0._time.getCurrentTimeMillis() - this.this$0._sessionService.getStartTime());
    }
}
