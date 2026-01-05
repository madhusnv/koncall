package com.onesignal.session.internal.session;

import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class SessionModel$startTime$2 extends kf9 implements uk7 {
    public static final SessionModel$startTime$2 INSTANCE = new SessionModel$startTime$2();

    public SessionModel$startTime$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
