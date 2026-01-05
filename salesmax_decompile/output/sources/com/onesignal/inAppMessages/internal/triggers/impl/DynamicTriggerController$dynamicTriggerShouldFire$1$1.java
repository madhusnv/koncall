package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class DynamicTriggerController$dynamicTriggerShouldFire$1$1 extends kf9 implements xk7 {
    final /* synthetic */ String $triggerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTriggerController$dynamicTriggerShouldFire$1$1(String str) {
        super(1);
        this.$triggerId = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ITriggerHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(ITriggerHandler iTriggerHandler) {
        sq8.m48649h(iTriggerHandler, "it");
        iTriggerHandler.onTriggerCompleted(this.$triggerId);
    }
}
