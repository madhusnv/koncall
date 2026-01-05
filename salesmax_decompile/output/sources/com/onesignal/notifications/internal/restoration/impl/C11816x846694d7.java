package com.onesignal.notifications.internal.restoration.impl;

import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import p001o.l75;
import p001o.n64;
import p001o.o64;

@l75(m36647c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker", m36648f = "NotificationRestoreWorkManager.kt", m36649l = {61}, m36650m = "doWork")
/* renamed from: com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 */
/* loaded from: classes6.dex */
public final class C11816x846694d7 extends o64 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationRestoreWorkManager.NotificationRestoreWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11816x846694d7(NotificationRestoreWorkManager.NotificationRestoreWorker notificationRestoreWorker, n64 n64Var) {
        super(n64Var);
        this.this$0 = notificationRestoreWorker;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
