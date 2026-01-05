package com.onesignal.common.threading;

import p001o.jg2;
import p001o.n64;
import p001o.tg2;
import p001o.vg2;

/* loaded from: classes6.dex */
public class WaiterWithValue<TType> {
    private final jg2 channel = tg2.m49824b(-1, null, null, 6, null);

    public final Object waitForWake(n64 n64Var) {
        return this.channel.mo23476m(n64Var);
    }

    public final void wake(TType ttype) {
        Object objMo23472g = this.channel.mo23472g(ttype);
        if (vg2.m52742h(objMo23472g)) {
            throw new Exception("WaiterWithValue.wait failed", vg2.m52739e(objMo23472g));
        }
    }
}
