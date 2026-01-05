package z1;

import android.graphics.Rect;
import android.view.View;
import b2.C0566x;
import c3.C0848c;
import g4.l0;
import g4.n0;
import gx.AbstractC2747a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import l4.InterfaceC4375t;
import n1.AbstractC4941a;
import p005f.C2154c;
import pg.n9;
import s1.C6725t;
import tx.b0;
import tx.s1;
import v3.AbstractC7634f;
import vx.EnumC7799a;
import w3.k1;
import w3.l1;
import w3.p2;
import wx.b1;
import wx.c1;
import wx.t0;
import x1.c0;
import y1.AbstractC8530b;
import yt.C8769a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.c */
/* loaded from: classes.dex */
public final class C8843c implements InterfaceC4375t {

    /* renamed from: a */
    public C8850j f42561a;

    /* renamed from: b */
    public s1 f42562b;

    /* renamed from: c */
    public C8854n f42563c;

    /* renamed from: d */
    public b1 f42564d;

    @Override // l4.InterfaceC4375t
    /* renamed from: a */
    public final void mo9093a() {
        m16308j(null);
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: b */
    public final void mo9094b() {
        p2 p2Var;
        C8850j c8850j = this.f42561a;
        if (c8850j == null || (p2Var = (p2) AbstractC7634f.m14548i(c8850j, k1.f37844p)) == null) {
            return;
        }
        ((l1) p2Var).m14976b();
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: c */
    public final void mo9095c() throws Throwable {
        s1 s1Var = this.f42562b;
        if (s1Var != null) {
            s1Var.mo13510j(null);
        }
        this.f42562b = null;
        t0 t0VarM16307i = m16307i();
        if (t0VarM16307i != null) {
            ((b1) t0VarM16307i).mo15351a();
        }
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: d */
    public final void mo9096d(C0848c c0848c) {
        Rect rect;
        C8854n c8854n = this.f42563c;
        if (c8854n != null) {
            c8854n.f42619l = new Rect(AbstractC2747a.m6747k(c0848c.f5354a), AbstractC2747a.m6747k(c0848c.f5355b), AbstractC2747a.m6747k(c0848c.f5356c), AbstractC2747a.m6747k(c0848c.f5357d));
            if (!c8854n.f42617j.isEmpty() || (rect = c8854n.f42619l) == null) {
                return;
            }
            c8854n.f42608a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: e */
    public final void mo9097e(C4381z c4381z, InterfaceC4374s interfaceC4374s, l0 l0Var, C6725t c6725t, C0848c c0848c, C0848c c0848c2) {
        C8854n c8854n = this.f42563c;
        if (c8854n != null) {
            C8851k c8851k = c8854n.f42620m;
            synchronized (c8851k.f42591c) {
                try {
                    c8851k.f42598j = c4381z;
                    c8851k.f42600l = interfaceC4374s;
                    c8851k.f42599k = l0Var;
                    c8851k.f42601m = c0848c;
                    c8851k.f42602n = c0848c2;
                    if (c8851k.f42593e || c8851k.f42592d) {
                        c8851k.m16328a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: f */
    public final void mo9098f(C4381z c4381z, C4381z c4381z2) {
        C8854n c8854n = this.f42563c;
        if (c8854n != null) {
            boolean z6 = (n0.m6454a(c8854n.f42615h.f21946b, c4381z2.f21946b) && AbstractC4154l.m8918a(c8854n.f42615h.f21947c, c4381z2.f21947c)) ? false : true;
            c8854n.f42615h = c4381z2;
            int size = c8854n.f42617j.size();
            for (int i10 = 0; i10 < size; i10++) {
                InputConnectionC8855o inputConnectionC8855o = (InputConnectionC8855o) ((WeakReference) c8854n.f42617j.get(i10)).get();
                if (inputConnectionC8855o != null) {
                    inputConnectionC8855o.f42627g = c4381z2;
                }
            }
            C8851k c8851k = c8854n.f42620m;
            synchronized (c8851k.f42591c) {
                c8851k.f42598j = null;
                c8851k.f42600l = null;
                c8851k.f42599k = null;
                c8851k.f42601m = null;
                c8851k.f42602n = null;
            }
            if (AbstractC4154l.m8918a(c4381z, c4381z2)) {
                if (z6) {
                    C8849i c8849i = c8854n.f42609b;
                    int iM6458e = n0.m6458e(c4381z2.f21946b);
                    int iM6457d = n0.m6457d(c4381z2.f21946b);
                    n0 n0Var = c8854n.f42615h.f21947c;
                    int iM6458e2 = n0Var != null ? n0.m6458e(n0Var.f13686a) : -1;
                    n0 n0Var2 = c8854n.f42615h.f21947c;
                    c8849i.m16322t().updateSelection((View) c8849i.f42583b, iM6458e, iM6457d, iM6458e2, n0Var2 != null ? n0.m6457d(n0Var2.f13686a) : -1);
                    return;
                }
                return;
            }
            if (c4381z != null && (!AbstractC4154l.m8918a(c4381z.f21945a.f13620b, c4381z2.f21945a.f13620b) || (n0.m6454a(c4381z.f21946b, c4381z2.f21946b) && !AbstractC4154l.m8918a(c4381z.f21947c, c4381z2.f21947c)))) {
                C8849i c8849i2 = c8854n.f42609b;
                c8849i2.m16322t().restartInput((View) c8849i2.f42583b);
                return;
            }
            int size2 = c8854n.f42617j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                InputConnectionC8855o inputConnectionC8855o2 = (InputConnectionC8855o) ((WeakReference) c8854n.f42617j.get(i11)).get();
                if (inputConnectionC8855o2 != null) {
                    C4381z c4381z3 = c8854n.f42615h;
                    C8849i c8849i3 = c8854n.f42609b;
                    if (inputConnectionC8855o2.f42631k) {
                        inputConnectionC8855o2.f42627g = c4381z3;
                        if (inputConnectionC8855o2.f42629i) {
                            c8849i3.m16322t().updateExtractedText((View) c8849i3.f42583b, inputConnectionC8855o2.f42628h, n9.m11803a(c4381z3));
                        }
                        n0 n0Var3 = c4381z3.f21947c;
                        long j6 = c4381z3.f21946b;
                        int iM6458e3 = n0Var3 != null ? n0.m6458e(n0Var3.f13686a) : -1;
                        n0 n0Var4 = c4381z3.f21947c;
                        c8849i3.m16322t().updateSelection((View) c8849i3.f42583b, n0.m6458e(j6), n0.m6457d(j6), iM6458e3, n0Var4 != null ? n0.m6457d(n0Var4.f13686a) : -1);
                    }
                }
            }
        }
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: g */
    public final void mo9099g() {
        p2 p2Var;
        C8850j c8850j = this.f42561a;
        if (c8850j == null || (p2Var = (p2) AbstractC7634f.m14548i(c8850j, k1.f37844p)) == null) {
            return;
        }
        ((l1) p2Var).m14975a();
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: h */
    public final void mo9100h(C4381z c4381z, C4366k c4366k, C0566x c0566x, c0 c0Var) {
        m16308j(new C2154c(c4381z, this, c4366k, c0566x, c0Var, 5));
    }

    /* renamed from: i */
    public final t0 m16307i() {
        b1 b1Var = this.f42564d;
        if (b1Var != null) {
            return b1Var;
        }
        if (!AbstractC8530b.f41455a) {
            return null;
        }
        b1 b1VarM15371b = c1.m15371b(1, 0, EnumC7799a.DROP_LATEST, 2);
        this.f42564d = b1VarM15371b;
        return b1VarM15371b;
    }

    /* renamed from: j */
    public final void m16308j(C2154c c2154c) {
        C8850j c8850j = this.f42561a;
        if (c8850j == null) {
            return;
        }
        this.f42562b = c8850j.f37683p ? tx.c0.m13502y(c8850j.z0(), null, b0.UNDISPATCHED, new C8769a(c8850j, new xm.s1(c2154c, this, c8850j, s1Var, 3), s1Var, 3), 1) : null;
    }

    /* renamed from: k */
    public final void m16309k(C8850j c8850j) {
        if (this.f42561a != c8850j) {
            AbstractC4941a.m9886c("Expected textInputModifierNode to be " + c8850j + " but was " + this.f42561a);
        }
        this.f42561a = null;
    }
}
