package gm;

import a7.C0060a;
import android.app.Application;
import b2.C0554l;
import com.websoptimization.callyzerbiz.CallyzerBizApp;
import gw.C2744f;
import iw.InterfaceC3359b;
import jn.AbstractC3802a;
import pg.m8;
import ug.C7439j;
import xm.o4;
import yv.C8803r;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.w */
/* loaded from: classes3.dex */
public abstract class AbstractApplicationC2654w extends Application implements InterfaceC3359b {

    /* renamed from: a */
    public boolean f14383a = false;

    /* renamed from: b */
    public final C2744f f14384b = new C2744f(new C8986c(16, this));

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        return this.f14384b.mo1432a();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f14383a) {
            this.f14383a = true;
            CallyzerBizApp callyzerBizApp = (CallyzerBizApp) this;
            C2651t c2651t = (C2651t) ((InterfaceC2634c) this.f14384b.mo1432a());
            c2651t.getClass();
            m8.m11791b(9, "expectedSize");
            C0554l c0554l = new C0554l(9);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.CallNotesTemplatesWorkManager", c2651t.f14294R);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.LogFileUploadManager", c2651t.f14297U);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.ReadContactWorker", c2651t.f14298V);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.RecordingCompressManager", c2651t.f44286a0);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.RecordingFindManager", c2651t.f44287b0);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.RecordingUploadManager", c2651t.f44288c0);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager", c2651t.f44289d0);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager", c2651t.f44291f0);
            c0554l.m1641k("com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager", c2651t.f44292g0);
            callyzerBizApp.f7253c = new C0060a(c0554l.m1634c());
            callyzerBizApp.f7254d = new C7439j((o4) c2651t.f44290e0.get(), c2651t.m6633w(), AbstractC3802a.m8397a(c2651t.f14307e));
            callyzerBizApp.f7255e = (C8803r) c2651t.f14293Q.get();
        }
        super.onCreate();
    }
}
