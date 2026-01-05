package androidx.work.impl.utils;

import android.app.Application;
import p001o.sq8;

/* loaded from: classes2.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final String getProcessName() {
        String processName = Application.getProcessName();
        sq8.m48648g(processName, "getProcessName()");
        return processName;
    }
}
