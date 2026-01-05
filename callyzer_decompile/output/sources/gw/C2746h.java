package gw;

import android.app.Application;
import android.app.Service;
import gm.C2648q;
import gm.C2651t;
import iw.InterfaceC3359b;
import og.o1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gw.h */
/* loaded from: classes3.dex */
public final class C2746h implements InterfaceC3359b {

    /* renamed from: a */
    public final Service f15290a;

    /* renamed from: b */
    public C2648q f15291b;

    public C2746h(Service service) {
        this.f15290a = service;
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f15291b == null) {
            Application application = this.f15290a.getApplication();
            boolean z6 = application instanceof InterfaceC3359b;
            Class<?> cls = application.getClass();
            if (!z6) {
                throw new IllegalStateException("Hilt service must be attached to an @HiltAndroidApp Application. Found: " + cls);
            }
            this.f15291b = new C2648q(((C2651t) ((InterfaceC2745g) o1.m10790b(InterfaceC2745g.class, application))).f14308f);
        }
        return this.f15291b;
    }
}
