package z2;

import b2.C0566x;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import pg.o9;
import pg.p9;
import uf.C7427b;
import v3.AbstractC7634f;
import v3.InterfaceC7651w;
import v3.a2;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z2.e */
/* loaded from: classes.dex */
public final class C8860e extends AbstractC7878q implements a2, InterfaceC7651w {

    /* renamed from: q */
    public C8860e f42639q;

    /* renamed from: r */
    public C8860e f42640r;

    /* renamed from: s */
    public long f42641s;

    @Override // w2.AbstractC7878q
    public final void E0() {
        this.f42640r = null;
        this.f42639q = null;
    }

    public final boolean L0(C7427b c7427b) {
        C8860e c8860e = this.f42639q;
        if (c8860e != null) {
            return c8860e.L0(c7427b);
        }
        C8860e c8860e2 = this.f42640r;
        if (c8860e2 != null) {
            return c8860e2.L0(c7427b);
        }
        return false;
    }

    public final void M0(C7427b c7427b) {
        C8860e c8860e = this.f42640r;
        if (c8860e != null) {
            c8860e.M0(c7427b);
            return;
        }
        C8860e c8860e2 = this.f42639q;
        if (c8860e2 != null) {
            c8860e2.M0(c7427b);
        }
    }

    public final void N0(C7427b c7427b) {
        C8860e c8860e = this.f42640r;
        if (c8860e != null) {
            c8860e.N0(c7427b);
        }
        C8860e c8860e2 = this.f42639q;
        if (c8860e2 != null) {
            c8860e2.N0(c7427b);
        }
        this.f42639q = null;
    }

    public final void O0(C7427b c7427b) {
        a2 a2Var;
        C8860e c8860e;
        C8860e c8860e2 = this.f42639q;
        if (c8860e2 == null || !o9.m11811a(c8860e2, p9.m11825a(c7427b))) {
            if (this.f37670a.f37683p) {
                C4168z c4168z = new C4168z();
                AbstractC7634f.m14539B(this, new C0566x(25, c4168z, this, c7427b));
                a2Var = (a2) c4168z.f21164a;
            } else {
                a2Var = null;
            }
            c8860e = (C8860e) a2Var;
        } else {
            c8860e = c8860e2;
        }
        if (c8860e != null && c8860e2 == null) {
            c8860e.M0(c7427b);
            c8860e.O0(c7427b);
            C8860e c8860e3 = this.f42640r;
            if (c8860e3 != null) {
                c8860e3.N0(c7427b);
            }
        } else if (c8860e == null && c8860e2 != null) {
            C8860e c8860e4 = this.f42640r;
            if (c8860e4 != null) {
                c8860e4.M0(c7427b);
                c8860e4.O0(c7427b);
            }
            c8860e2.N0(c7427b);
        } else if (!AbstractC4154l.m8918a(c8860e, c8860e2)) {
            if (c8860e != null) {
                c8860e.M0(c7427b);
                c8860e.O0(c7427b);
            }
            if (c8860e2 != null) {
                c8860e2.N0(c7427b);
            }
        } else if (c8860e != null) {
            c8860e.O0(c7427b);
        } else {
            C8860e c8860e5 = this.f42640r;
            if (c8860e5 != null) {
                c8860e5.O0(c7427b);
            }
        }
        this.f42639q = c8860e;
    }

    public final void P0(C7427b c7427b) {
        C8860e c8860e = this.f42640r;
        if (c8860e != null) {
            c8860e.P0(c7427b);
            return;
        }
        C8860e c8860e2 = this.f42639q;
        if (c8860e2 != null) {
            c8860e2.P0(c7427b);
        }
    }

    @Override // v3.a2
    /* renamed from: h */
    public final Object mo7492h() {
        return C8859d.f42638a;
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
        this.f42641s = j6;
    }
}
