package b3;

import a3.C0043b;
import android.os.Trace;
import ex.InterfaceC2141e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import lv.C4535g;
import m2.C4640e;
import m3.C4643a;
import m3.C4645c;
import m3.InterfaceC4644b;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s3.AbstractC6744a;
import u3.InterfaceC7334e;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7640l;
import v3.InterfaceC7641m;
import v3.l1;
import v3.x1;
import w2.AbstractC7878q;
import w3.C7904v;
import w3.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC7878q implements InterfaceC7640l, l1, InterfaceC7334e, InterfaceC7641m {

    /* renamed from: q */
    public final InterfaceC2141e f3903q;

    /* renamed from: r */
    public boolean f3904r;

    /* renamed from: s */
    public boolean f3905s;

    /* renamed from: t */
    public final int f3906t;

    public e0(int i10, int i11, InterfaceC2141e interfaceC2141e) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        this.f3903q = (i11 & 2) != 0 ? null : interfaceC2141e;
        this.f3906t = i10;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        int i10 = d0.f3902b[N0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C0585q c0585q = (C0585q) ((C7904v) AbstractC7634f.m14564y(this)).getFocusOwner();
            c0585q.m1744c(8, true, false);
            C0576h c0576h = c0585q.f3942g;
            if (c0576h.f3915f) {
                return;
            }
            c0576h.f3910a.invoke(new C0575g(0, c0576h, C0576h.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
            c0576h.f3915f = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [m2.e] */
    public final void L0(c0 c0Var, c0 c0Var2) {
        C4535g c4535g;
        InterfaceC2141e interfaceC2141e;
        C0585q c0585q = (C0585q) ((C7904v) AbstractC7634f.m14564y(this)).getFocusOwner();
        e0 e0Var = c0585q.f3947l;
        if (!AbstractC4154l.m8918a(c0Var, c0Var2) && (interfaceC2141e = this.f3903q) != null) {
            interfaceC2141e.invoke(c0Var, c0Var2);
        }
        AbstractC7878q abstractC7878q = this.f37670a;
        if (!abstractC7878q.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q2 = this.f37670a;
        v3.g0 g0VarM14563x = AbstractC7634f.m14563x(this);
        while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 5120) != 0) {
                while (abstractC7878q2 != null) {
                    int i10 = abstractC7878q2.f37672c;
                    if ((i10 & 5120) != 0) {
                        if (abstractC7878q2 != abstractC7878q && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                            ?? c4640e = 0;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof InterfaceC0573e) {
                                    InterfaceC0573e interfaceC0573e = (InterfaceC0573e) abstractC7642nM14545f;
                                    if (e0Var == c0585q.f3947l) {
                                        interfaceC0573e.mo1708r(c0Var2);
                                    }
                                } else if ((abstractC7642nM14545f.f37672c & 4096) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q3 = abstractC7642nM14545f.f36953r;
                                    int i11 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q3 != null) {
                                        if ((abstractC7878q3.f37672c & 4096) != 0) {
                                            i11++;
                                            c4640e = c4640e;
                                            if (i11 == 1) {
                                                abstractC7642nM14545f = abstractC7878q3;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = 0;
                                                }
                                                c4640e.m9506b(abstractC7878q3);
                                            }
                                        }
                                        abstractC7878q3 = abstractC7878q3.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                    }
                    abstractC7878q2 = abstractC7878q2.f37674e;
                }
            }
            g0VarM14563x = g0VarM14563x.m14609v();
            abstractC7878q2 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [m2.e] */
    public final C0588t M0() {
        boolean z6;
        C4535g c4535g;
        C0588t c0588t = new C0588t();
        c0588t.f3952a = true;
        C0592x c0592x = C0592x.f3965b;
        c0588t.f3953b = c0592x;
        c0588t.f3954c = c0592x;
        c0588t.f3955d = c0592x;
        c0588t.f3956e = c0592x;
        c0588t.f3957f = c0592x;
        c0588t.f3958g = c0592x;
        c0588t.f3959h = c0592x;
        c0588t.f3960i = c0592x;
        c0588t.f3961j = C0587s.f3948b;
        c0588t.f3962k = C0587s.f3949c;
        int i10 = this.f3906t;
        if (i10 == 1) {
            z6 = true;
        } else if (i10 == 0) {
            z6 = !(((C4643a) ((C4645c) ((InterfaceC4644b) AbstractC7634f.m14548i(this, k1.f37841m))).f22889a.getValue()).f22888a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z6 = false;
        }
        c0588t.f3952a = z6;
        AbstractC7878q abstractC7878q = this.f37670a;
        if (!abstractC7878q.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q2 = this.f37670a;
        v3.g0 g0VarM14563x = AbstractC7634f.m14563x(this);
        loop0: while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 3072) != 0) {
                while (abstractC7878q2 != null) {
                    int i11 = abstractC7878q2.f37672c;
                    if ((i11 & 3072) != 0) {
                        if (abstractC7878q2 != abstractC7878q && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & NewHope.SENDB_BYTES) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                            ?? c4640e = 0;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof InterfaceC0590v) {
                                    ((InterfaceC0590v) abstractC7642nM14545f).mo1756D(c0588t);
                                } else if ((abstractC7642nM14545f.f37672c & NewHope.SENDB_BYTES) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q3 = abstractC7642nM14545f.f36953r;
                                    int i12 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q3 != null) {
                                        if ((abstractC7878q3.f37672c & NewHope.SENDB_BYTES) != 0) {
                                            i12++;
                                            c4640e = c4640e;
                                            if (i12 == 1) {
                                                abstractC7642nM14545f = abstractC7878q3;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = 0;
                                                }
                                                c4640e.m9506b(abstractC7878q3);
                                            }
                                        }
                                        abstractC7878q3 = abstractC7878q3.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                    }
                    abstractC7878q2 = abstractC7878q2.f37674e;
                }
            }
            g0VarM14563x = g0VarM14563x.m14609v();
            abstractC7878q2 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
        }
        return c0588t;
    }

    public final c0 N0() {
        C4535g c4535g;
        if (!this.f37683p) {
            return c0.Inactive;
        }
        C0585q c0585q = (C0585q) ((C7904v) AbstractC7634f.m14564y(this)).getFocusOwner();
        e0 e0Var = c0585q.f3947l;
        if (e0Var == null) {
            return c0.Inactive;
        }
        if (this == e0Var) {
            c0585q.getClass();
            return c0.Active;
        }
        if (e0Var.f37683p) {
            if (!e0Var.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q = e0Var.f37670a.f37674e;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0Var);
            while (g0VarM14563x != null) {
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 1024) != 0) {
                    while (abstractC7878q != null) {
                        if ((abstractC7878q.f37672c & 1024) != 0) {
                            AbstractC7878q abstractC7878qM14545f = abstractC7878q;
                            C4640e c4640e = null;
                            while (abstractC7878qM14545f != null) {
                                if (abstractC7878qM14545f instanceof e0) {
                                    if (this == ((e0) abstractC7878qM14545f)) {
                                        return c0.ActiveParent;
                                    }
                                } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                    int i10 = 0;
                                    for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                                        if ((abstractC7878q2.f37672c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC7878qM14545f = abstractC7878q2;
                                            } else {
                                                if (c4640e == null) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7878qM14545f != null) {
                                                    c4640e.m9506b(abstractC7878qM14545f);
                                                    abstractC7878qM14545f = null;
                                                }
                                                c4640e.m9506b(abstractC7878q2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        abstractC7878q = abstractC7878q.f37674e;
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                abstractC7878q = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
            }
        }
        return c0.Inactive;
    }

    public final void O0() {
        int i10 = d0.f3902b[N0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C4168z c4168z = new C4168z();
            AbstractC7634f.m14559t(this, new C0043b(3, c4168z, this));
            Object obj = c4168z.f21164a;
            if (obj == null) {
                AbstractC4154l.m8928k("focusProperties");
                throw null;
            }
            if (((InterfaceC0586r) obj).mo1751b()) {
                return;
            }
            ((C0585q) ((C7904v) AbstractC7634f.m14564y(this)).getFocusOwner()).m1744c(8, true, true);
        }
    }

    public final boolean P0(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zM1738w = false;
            if (!M0().f3952a) {
                Trace.endSection();
                return false;
            }
            int i11 = d0.f3901a[AbstractC0574f.m1737v(this, i10).ordinal()];
            if (i11 == 1) {
                zM1738w = AbstractC0574f.m1738w(this);
            } else if (i11 == 2) {
                zM1738w = true;
            } else if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return zM1738w;
        } finally {
            Trace.endSection();
        }
    }

    @Override // v3.l1
    public final void c0() {
        O0();
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
    }
}
