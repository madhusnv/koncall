package ti;

import a1.c0;
import java.util.concurrent.atomic.AtomicReference;
import qi.C6232o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ti.b */
/* loaded from: classes.dex */
public final class C7162b {

    /* renamed from: c */
    public static final C7161a f34410c = new C7161a();

    /* renamed from: a */
    public final C6232o f34411a;

    /* renamed from: b */
    public final AtomicReference f34412b = new AtomicReference(null);

    public C7162b(C6232o c6232o) {
        this.f34411a = c6232o;
        c6232o.m12249a(new c0(22, this));
    }

    /* renamed from: a */
    public final C7161a m13420a(String str) {
        C7162b c7162b = (C7162b) this.f34412b.get();
        return c7162b == null ? f34410c : c7162b.m13420a(str);
    }

    /* renamed from: b */
    public final boolean m13421b() {
        C7162b c7162b = (C7162b) this.f34412b.get();
        return c7162b != null && c7162b.m13421b();
    }

    /* renamed from: c */
    public final boolean m13422c(String str) {
        C7162b c7162b = (C7162b) this.f34412b.get();
        return c7162b != null && c7162b.m13422c(str);
    }
}
