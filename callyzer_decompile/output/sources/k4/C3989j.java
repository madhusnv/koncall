package k4;

import a3.C0045d;
import bl.C0689a;
import c9.C0927v;
import com.sun.mail.imap.IMAPStore;
import e1.C1917s;
import h6.C2856l;
import i1.C3135n;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.j */
/* loaded from: classes.dex */
public final class C3989j implements InterfaceC3987h {

    /* renamed from: a */
    public final C2856l f20676a;

    /* renamed from: b */
    public final C3980a f20677b;

    /* renamed from: c */
    public final C0927v f20678c;

    /* renamed from: d */
    public final C3993n f20679d;

    /* renamed from: e */
    public final C4001v f20680e;

    /* renamed from: f */
    public final C0045d f20681f;

    public C3989j(C2856l c2856l, C3980a c3980a) {
        C0927v c0927v = AbstractC3990k.f20682a;
        C3993n c3993n = new C3993n(AbstractC3990k.f20683b);
        C4001v c4001v = new C4001v((byte) 0, 0);
        this.f20676a = c2856l;
        this.f20677b = c3980a;
        this.f20678c = c0927v;
        this.f20679d = c3993n;
        this.f20680e = c4001v;
        this.f20681f = new C0045d(22, this);
    }

    /* renamed from: a */
    public final h0 m8761a(e0 e0Var) {
        C0927v c0927v = this.f20678c;
        C3135n c3135n = new C3135n(12, this, e0Var);
        synchronized (((C0689a) c0927v.f5668b)) {
            h0 h0Var = (h0) ((C1917s) c0927v.f5669c).m5620h(e0Var);
            if (h0Var != null) {
                if (h0Var.mo8760a()) {
                    return h0Var;
                }
            }
            try {
                h0 h0Var2 = (h0) c3135n.invoke(new C3135n(13, c0927v, e0Var));
                synchronized (((C0689a) c0927v.f5668b)) {
                    if (((C1917s) c0927v.f5669c).m5620h(e0Var) == null && h0Var2.mo8760a()) {
                        ((C1917s) c0927v.f5669c).m5624l(e0Var, h0Var2);
                    }
                }
                return h0Var2;
            } catch (Exception e2) {
                throw new IllegalStateException("Could not load font", e2);
            }
        }
    }

    /* renamed from: b */
    public final h0 m8762b(AbstractC3988i abstractC3988i, C3998s c3998s, int i10, int i11) {
        C3980a c3980a = this.f20677b;
        c3980a.getClass();
        int i12 = c3980a.f20645a;
        C3998s c3998s2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? c3998s : new C3998s(w9.m11912c(c3998s.f20701a + i12, 1, IMAPStore.RESPONSE));
        this.f20676a.getClass();
        return m8761a(new e0(abstractC3988i, c3998s2, i10, i11, null));
    }
}
