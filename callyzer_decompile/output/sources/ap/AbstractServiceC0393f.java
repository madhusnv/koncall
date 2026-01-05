package ap;

import android.app.Service;
import c4.C0861k;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import gm.C2648q;
import gm.C2651t;
import gw.C2746h;
import iw.InterfaceC3359b;
import jn.AbstractC3802a;
import rn.h0;
import uo.C7476a;
import uo.C7481f;
import xm.C8418z;
import xm.y5;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ap.f */
/* loaded from: classes3.dex */
public abstract class AbstractServiceC0393f extends Service implements InterfaceC3359b {

    /* renamed from: a */
    public volatile C2746h f3085a;

    /* renamed from: b */
    public final Object f3086b = new Object();

    /* renamed from: c */
    public boolean f3087c = false;

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f3085a == null) {
            synchronized (this.f3086b) {
                try {
                    if (this.f3085a == null) {
                        this.f3085a = new C2746h(this);
                    }
                } finally {
                }
            }
        }
        return this.f3085a.mo1432a();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.f3087c) {
            this.f3087c = true;
            CallMonitorService callMonitorService = (CallMonitorService) this;
            C2651t c2651t = ((C2648q) ((InterfaceC0389b) mo1432a())).f14272a;
            c2651t.m6624n();
            callMonitorService.f7396e = AbstractC3802a.m8397a(c2651t.f14307e);
            callMonitorService.f7397f = c2651t.m6633w();
            callMonitorService.f7398g = (h0) c2651t.f14302Z.get();
            callMonitorService.f7399h = c2651t.m6631u();
            callMonitorService.f7400j = c2651t.m6634x();
            callMonitorService.f7401k = (C8803r) c2651t.f14293Q.get();
            callMonitorService.f7402l = (C7481f) c2651t.f44293h0.get();
            callMonitorService.f7403m = (C7476a) c2651t.f44295j0.get();
            callMonitorService.f7404n = c2651t.m6619i();
            callMonitorService.f7405p = (C8418z) c2651t.f14296T.get();
            callMonitorService.f7406q = (y5) c2651t.f14281E.get();
            callMonitorService.f7407r = c2651t.m6628r();
            callMonitorService.f7408s = c2651t.m6623m();
            c2651t.m6625o();
            callMonitorService.f7409t = new C0861k(c2651t.m6625o());
        }
        super.onCreate();
    }
}
