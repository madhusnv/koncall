package i9;

import ec.InterfaceC2004b;
import ia.C3211c;
import ia.C3220l;
import kotlin.jvm.internal.AbstractC4154l;
import nc.AbstractC4992c;
import nc.InterfaceC4991b;
import og.gf;
import sb.C6774a;
import sb.C6780g;
import sb.InterfaceC6775b;
import ud.C7410n;
import ud.C7416t;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import wc.AbstractC7984r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.b */
/* loaded from: classes.dex */
public final class C3184b implements InterfaceC6775b {

    /* renamed from: a */
    public final InterfaceC7411o f17118a;

    /* renamed from: b */
    public final boolean f17119b;

    /* renamed from: c */
    public final InterfaceC4991b f17120c;

    /* renamed from: d */
    public final C3211c f17121d;

    /* renamed from: e */
    public final C6780g f17122e;

    /* renamed from: f */
    public final C6774a f17123f;

    public C3184b(InterfaceC4991b interfaceC4991b, String str) {
        InterfaceC7411o.f35200a.getClass();
        C7416t platformProvider = C7410n.f35199b;
        AbstractC4154l.m8923f(platformProvider, "platformProvider");
        this.f17118a = platformProvider;
        this.f17119b = interfaceC4991b == null;
        InterfaceC4991b interfaceC4991bM9900a = interfaceC4991b == null ? AbstractC4992c.m9900a(null) : interfaceC4991b;
        this.f17120c = interfaceC4991bM9900a;
        C3220l c3220l = new C3220l();
        InterfaceC7411o interfaceC7411o = this.f17118a;
        AbstractC4154l.m8923f(interfaceC7411o, "<set-?>");
        c3220l.f17358e = interfaceC7411o;
        c3220l.f17356c = this.f17120c;
        C3211c c3211c = new C3211c(c3220l);
        this.f17121d = c3211c;
        int i10 = 0;
        C6780g c6780g = new C6780g(new v0(new C3183a(1, platformProvider, InterfaceC7411o.class, "getProperty", "getProperty(Ljava/lang/String;)Ljava/lang/String;", i10, 0)), new C3192j(new C3183a(1, platformProvider, InterfaceC7411o.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", i10, 1)), new u0(str, interfaceC4991bM9900a, platformProvider), new C3208z(str, interfaceC4991bM9900a, platformProvider), new C3190h(platformProvider, interfaceC4991bM9900a), new C3199q(c3211c, platformProvider));
        this.f17122e = c6780g;
        this.f17123f = new C6774a(c6780g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17123f.close();
        this.f17121d.close();
        if (this.f17119b) {
            AbstractC7984r.m15160d(this.f17120c);
        }
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        return this.f17123f.resolve(interfaceC2004b, interfaceC7559c);
    }

    public final String toString() {
        return gf.m10673a(this) + ": " + this.f17122e;
    }
}
