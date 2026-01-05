package s1;

import a2.C0037j;
import kotlin.NoWhenBranchMatchedException;
import pg.AbstractC5940u;
import rw.C6669s;
import t3.AbstractC7019f;
import u3.C7337h;
import u3.InterfaceC7334e;
import v3.AbstractC7634f;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.n */
/* loaded from: classes.dex */
public final class C6719n extends AbstractC7878q implements InterfaceC7334e, InterfaceC7652x {

    /* renamed from: t */
    public static final C6716k f32110t = new C6716k();

    /* renamed from: q */
    public InterfaceC6720o f32111q;

    /* renamed from: r */
    public l4.d0 f32112r;

    /* renamed from: s */
    public k1.x0 f32113s;

    public final boolean L0(C6715j c6715j, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.f32113s == k1.x0.Horizontal) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.f32113s == k1.x0.Vertical) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (M0(i10)) {
            if (c6715j.f32079b >= this.f32111q.mo12089a() - 1) {
                return false;
            }
        } else if (c6715j.f32078a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean M0(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int i11 = AbstractC6717l.f32084a[AbstractC7634f.m14563x(this).f36826D.ordinal()];
            if (i11 == 1) {
                return false;
            }
            if (i11 == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int i12 = AbstractC6717l.f32084a[AbstractC7634f.m14563x(this).f36826D.ordinal()];
        if (i12 == 1) {
            return true;
        }
        if (i12 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // u3.InterfaceC7334e
    /* renamed from: N */
    public final AbstractC5940u mo12851N() {
        C7337h c7337h = new C7337h(AbstractC7019f.f33978a);
        c7337h.f34955b.setValue(this);
        return c7337h;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 13));
    }
}
