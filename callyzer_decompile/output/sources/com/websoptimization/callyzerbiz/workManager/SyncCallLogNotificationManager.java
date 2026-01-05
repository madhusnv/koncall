package com.websoptimization.callyzerbiz.workManager;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ao.c0;
import aw.C0466f;
import aw.e0;
import aw.f0;
import aw.g0;
import ay.C0496f;
import ay.ExecutorC0495e;
import im.EnumC3320v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nn.C5113e;
import og.nd;
import po.C5984e;
import qw.C6366p;
import t8.AbstractC7075u;
import tx.m0;
import uw.InterfaceC7559c;
import wo.C8134s;
import xm.y5;
import yv.C8791f;
import yv.C8800o;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncCallLogNotificationManager extends Worker {

    /* renamed from: a */
    public final Context f7508a;

    /* renamed from: b */
    public final C8805t f7509b;

    /* renamed from: c */
    public final C9000c f7510c;

    /* renamed from: d */
    public final C5113e f7511d;

    /* renamed from: e */
    public final c0 f7512e;

    /* renamed from: f */
    public final C8134s f7513f;

    /* renamed from: g */
    public final C8803r f7514g;

    /* renamed from: h */
    public final y5 f7515h;

    /* renamed from: i */
    public final C5984e f7516i;

    /* renamed from: j */
    public final C6366p f7517j;

    /* renamed from: k */
    public EnumC3320v f7518k;

    /* renamed from: l */
    public final C8810d f7519l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCallLogNotificationManager(Context mContext, WorkerParameters workerParams, C8805t traceLogs, C9000c workManagerUseCase, C5113e appPreferencesUseCase, c0 fetchCallLogUseCase, C8134s syncCallLogUseCase, C8803r networkState, y5 userSIMRepository, C5984e notificationUseCase) {
        super(mContext, workerParams);
        AbstractC4154l.m8923f(mContext, "mContext");
        AbstractC4154l.m8923f(workerParams, "workerParams");
        AbstractC4154l.m8923f(traceLogs, "traceLogs");
        AbstractC4154l.m8923f(workManagerUseCase, "workManagerUseCase");
        AbstractC4154l.m8923f(appPreferencesUseCase, "appPreferencesUseCase");
        AbstractC4154l.m8923f(fetchCallLogUseCase, "fetchCallLogUseCase");
        AbstractC4154l.m8923f(syncCallLogUseCase, "syncCallLogUseCase");
        AbstractC4154l.m8923f(networkState, "networkState");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        this.f7508a = mContext;
        this.f7509b = traceLogs;
        this.f7510c = workManagerUseCase;
        this.f7511d = appPreferencesUseCase;
        this.f7512e = fetchCallLogUseCase;
        this.f7513f = syncCallLogUseCase;
        this.f7514g = networkState;
        this.f7515h = userSIMRepository;
        this.f7516i = notificationUseCase;
        this.f7517j = nd.m10782c(new C0466f(1));
        C0496f c0496f = m0.f34659a;
        this.f7519l = tx.c0.m13479b(ExecutorC0495e.f3538c);
    }

    /* renamed from: a */
    public final StringBuilder m5056a() {
        return (StringBuilder) this.f7517j.getValue();
    }

    @Override // androidx.work.Worker
    public final AbstractC7075u doWork() throws Exception {
        EnumC3320v enumC3320vValueOf;
        String strM13367d = getInputData().m13367d("SyncManagerWorkType");
        m5056a().append(" >>> tag is := " + strM13367d);
        String string = m5056a().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this.f7509b.m16231f(string);
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(strM13367d)) {
            try {
                AbstractC4154l.m8920c(strM13367d);
                enumC3320vValueOf = EnumC3320v.valueOf(strM13367d);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                m5056a().append(" >>> NoSynWorkMangerType found , tag is := " + strM13367d);
                enumC3320vValueOf = EnumC3320v.SCHEDULE_HOUR_SYNC;
            }
        } else {
            m5056a().append(" >>> NoSynWorkMangerType found , tag is empty or null");
            enumC3320vValueOf = EnumC3320v.SCHEDULE_HOUR_SYNC;
        }
        this.f7518k = enumC3320vValueOf;
        InterfaceC7559c interfaceC7559c = null;
        if (enumC3320vValueOf == null) {
            AbstractC4154l.m8928k("synWorkMangerType");
            throw null;
        }
        int i10 = e0.f3346a[enumC3320vValueOf.ordinal()];
        C8810d c8810d = this.f7519l;
        if (i10 == 1) {
            tx.c0.m13502y(c8810d, null, null, new g0(this, interfaceC7559c, 0), 3);
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sbM5056a = m5056a();
            EnumC3320v enumC3320v = this.f7518k;
            if (enumC3320v == null) {
                AbstractC4154l.m8928k("synWorkMangerType");
                throw null;
            }
            String strName = enumC3320v.name();
            C8800o c8800o = C8800o.f42459a;
            sbM5056a.append(" " + strName + " >>> syncWorkManager Called >>> Time:= " + C8800o.m16211t(System.currentTimeMillis()));
            sbM5056a.append(" >>> ");
            tx.c0.m13502y(c8810d, null, null, new f0(this, null), 3);
        }
        return AbstractC7075u.m13370b();
    }
}
