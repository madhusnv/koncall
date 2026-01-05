package com.onesignal.core.internal.background;

import p001o.n64;

/* loaded from: classes6.dex */
public interface IBackgroundManager {
    boolean cancelRunBackgroundServices();

    boolean getNeedsJobReschedule();

    Object runBackgroundServices(n64 n64Var);

    void setNeedsJobReschedule(boolean z);
}
