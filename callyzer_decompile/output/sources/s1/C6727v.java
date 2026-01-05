package s1;

import cp.C1476g;
import ex.InterfaceC2141e;
import f2.C2187j;
import kotlin.jvm.internal.AbstractC4154l;
import s2.C6734c;
import t2.InterfaceC7003b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.v */
/* loaded from: classes.dex */
public final class C6727v {

    /* renamed from: a */
    public final InterfaceC7003b f32148a;

    /* renamed from: b */
    public final C2187j f32149b;

    /* renamed from: c */
    public final e1.j0 f32150c;

    public C6727v(InterfaceC7003b interfaceC7003b, C2187j c2187j) {
        this.f32148a = interfaceC7003b;
        this.f32149b = c2187j;
        long[] jArr = e1.r0.f9045a;
        this.f32150c = new e1.j0();
    }

    /* renamed from: a */
    public final InterfaceC2141e m12867a(int i10, Object obj, Object obj2) {
        e1.j0 j0Var = this.f32150c;
        C6726u c6726u = (C6726u) j0Var.m5574g(obj);
        if (c6726u != null && c6726u.f32140c == i10 && AbstractC4154l.m8918a(c6726u.f32139b, obj2)) {
            C6734c c6734c = c6726u.f32141d;
            if (c6734c != null) {
                return c6734c;
            }
            C6734c c6734c2 = new C6734c(new C1476g(20, c6726u.f32142e, c6726u), true, 1403994769);
            c6726u.f32141d = c6734c2;
            return c6734c2;
        }
        C6726u c6726u2 = new C6726u(this, i10, obj, obj2);
        j0Var.m5579l(obj, c6726u2);
        C6734c c6734c3 = c6726u2.f32141d;
        if (c6734c3 != null) {
            return c6734c3;
        }
        C6734c c6734c4 = new C6734c(new C1476g(20, this, c6726u2), true, 1403994769);
        c6726u2.f32141d = c6734c4;
        return c6734c4;
    }

    /* renamed from: b */
    public final Object m12868b(Object obj) {
        if (obj == null) {
            return null;
        }
        C6726u c6726u = (C6726u) this.f32150c.m5574g(obj);
        if (c6726u != null) {
            return c6726u.f32139b;
        }
        InterfaceC6728w interfaceC6728w = (InterfaceC6728w) this.f32149b.invoke();
        int iMo12104d = interfaceC6728w.mo12104d(obj);
        if (iMo12104d != -1) {
            return interfaceC6728w.mo12103c(iMo12104d);
        }
        return null;
    }
}
