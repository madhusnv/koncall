package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ao.C0372k;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import qn.C6263l;
import t8.AbstractC7075u;
import t8.C7073s;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallNotesTemplatesWorkManager extends Worker {

    /* renamed from: a */
    public final C6263l f7439a;

    /* renamed from: b */
    public final C8803r f7440b;

    /* renamed from: c */
    public final InterfaceC7266z f7441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallNotesTemplatesWorkManager(Context mContext, WorkerParameters workerParams, C6263l callNotesTemplateUseCase, C8803r networkMonitorUtil, InterfaceC7266z mIoScope) {
        super(mContext, workerParams);
        AbstractC4154l.m8923f(mContext, "mContext");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(callNotesTemplateUseCase, "callNotesTemplateUseCase");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        AbstractC4154l.m8923f(mIoScope, "mIoScope");
        this.f7439a = callNotesTemplateUseCase;
        this.f7440b = networkMonitorUtil;
        this.f7441c = mIoScope;
    }

    @Override // androidx.work.Worker
    public final AbstractC7075u doWork() {
        C4168z c4168z = new C4168z();
        c4168z.f21164a = AbstractC7075u.m13370b();
        this.f7440b.m16221c();
        try {
            c0.m13502y(this.f7441c, null, null, new C0372k(this, c4168z, (InterfaceC7559c) null, 4), 3);
            return (AbstractC7075u) c4168z.f21164a;
        } catch (Exception unused) {
            return new C7073s();
        }
    }
}
