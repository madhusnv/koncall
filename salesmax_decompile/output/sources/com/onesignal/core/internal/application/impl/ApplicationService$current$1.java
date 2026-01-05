package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ApplicationService$current$1 extends kf9 implements xk7 {
    final /* synthetic */ Activity $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationService$current$1(Activity activity) {
        super(1);
        this.$value = activity;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IActivityLifecycleHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
        sq8.m48649h(iActivityLifecycleHandler, "it");
        iActivityLifecycleHandler.onActivityAvailable(this.$value);
    }
}
