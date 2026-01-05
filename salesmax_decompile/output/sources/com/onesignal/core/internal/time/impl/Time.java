package com.onesignal.core.internal.time.impl;

import com.onesignal.core.internal.time.ITime;

/* loaded from: classes6.dex */
public final class Time implements ITime {
    @Override // com.onesignal.core.internal.time.ITime
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
