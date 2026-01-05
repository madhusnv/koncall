package v3;

import android.view.View;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import k2.C3953b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kp.C4170b;
import lv.C4535g;
import m2.C4637b;
import m2.C4640e;
import s2.C6738g;
import s3.AbstractC6744a;
import t3.C7027n;
import t3.InterfaceC7028o;
import w2.AbstractC7878q;
import w3.C7904v;
import x2.C8279c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.f */
/* loaded from: classes.dex */
public abstract class AbstractC7634f {

    /* renamed from: a */
    public static final C7632d f36810a = new C7632d(0);

    /* renamed from: b */
    public static final n1 f36811b = new n1(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, v3.a2, v3.m] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: A */
    public static final void m14538A(a2 a2Var, InterfaceC2139c interfaceC2139c) {
        C4535g c4535g;
        AbstractC7878q abstractC7878q = (AbstractC7878q) a2Var;
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a.f37674e;
        g0 g0VarM14563x = m14563x(a2Var);
        while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 262144) != 0) {
                while (abstractC7878q2 != null) {
                    if ((abstractC7878q2.f37672c & 262144) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                        ?? c4640e = 0;
                        while (abstractC7642nM14545f != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC7642nM14545f instanceof a2) {
                                a2 a2Var2 = (a2) abstractC7642nM14545f;
                                if (AbstractC4154l.m8918a(a2Var.mo7492h(), a2Var2.mo7492h()) && a2Var.getClass() == a2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC2139c.invoke(a2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC7642nM14545f.f37672c & 262144) != 0) && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q3 = abstractC7642nM14545f.f36953r;
                                    int i10 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q3 != null) {
                                        if ((abstractC7878q3.f37672c & 262144) != 0) {
                                            i10++;
                                            c4640e = c4640e;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC7642nM14545f = m14545f(c4640e);
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
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, v3.a2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: B */
    public static final void m14539B(a2 a2Var, InterfaceC2139c interfaceC2139c) {
        AbstractC7878q abstractC7878q = (AbstractC7878q) a2Var;
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitSubtreeIf called on an unattached node");
        }
        C4640e c4640e = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a;
        AbstractC7878q abstractC7878q3 = abstractC7878q2.f37675f;
        if (abstractC7878q3 == null) {
            m14541b(c4640e, abstractC7878q2);
        } else {
            c4640e.m9506b(abstractC7878q3);
        }
        while (true) {
            int i10 = c4640e.f22886c;
            if (i10 == 0) {
                return;
            }
            AbstractC7878q abstractC7878q4 = (AbstractC7878q) c4640e.m9515m(i10 - 1);
            if ((abstractC7878q4.f37673d & 262144) != 0) {
                for (AbstractC7878q abstractC7878q5 = abstractC7878q4; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                    if ((abstractC7878q5.f37672c & 262144) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q5;
                        ?? c4640e2 = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof a2) {
                                a2 a2Var2 = (a2) abstractC7642nM14545f;
                                z1 z1Var = (AbstractC4154l.m8918a(a2Var.mo7492h(), a2Var2.mo7492h()) && a2Var.getClass() == a2Var2.getClass()) ? (z1) interfaceC2139c.invoke(a2Var2) : z1.ContinueTraversal;
                                if (z1Var == z1.CancelTraversal) {
                                    return;
                                }
                                if (z1Var == z1.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 262144) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q6 = abstractC7642nM14545f.f36953r;
                                int i11 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e2 = c4640e2;
                                while (abstractC7878q6 != null) {
                                    if ((abstractC7878q6.f37672c & 262144) != 0) {
                                        i11++;
                                        c4640e2 = c4640e2;
                                        if (i11 == 1) {
                                            abstractC7642nM14545f = abstractC7878q6;
                                        } else {
                                            if (c4640e2 == 0) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e2.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e2.m9506b(abstractC7878q6);
                                        }
                                    }
                                    abstractC7878q6 = abstractC7878q6.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e2 = c4640e2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC7642nM14545f = m14545f(c4640e2);
                        }
                    }
                }
            }
            m14541b(c4640e, abstractC7878q4);
        }
    }

    /* renamed from: a */
    public static final long m14540a(float f6, boolean z6, boolean z10) {
        return (((z6 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* renamed from: b */
    public static final void m14541b(C4640e c4640e, AbstractC7878q abstractC7878q) {
        C4640e c4640eM14613z = m14563x(abstractC7878q).m14613z();
        int i10 = c4640eM14613z.f22886c - 1;
        Object[] objArr = c4640eM14613z.f22884a;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                c4640e.m9506b((AbstractC7878q) ((g0) objArr[i10]).f36832K.f22542f);
                i10--;
            }
        }
    }

    /* renamed from: c */
    public static final int m14542c(n0 n0Var, C7027n c7027n) {
        n0 n0VarX0 = n0Var.x0();
        if (n0VarX0 == null) {
            AbstractC6744a.m12907b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.C0().mo12109c().containsKey(c7027n)) {
            Integer num = (Integer) n0Var.C0().mo12109c().get(c7027n);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iD0 = n0VarX0.d0(c7027n);
            if (iD0 != Integer.MIN_VALUE) {
                n0VarX0.f36955g = true;
                n0Var.f36956h = true;
                n0Var.G0();
                n0VarX0.f36955g = false;
                n0Var.f36956h = false;
                return iD0 + ((int) (c7027n instanceof C7027n ? n0VarX0.E0() & 4294967295L : n0VarX0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public static final boolean m14543d(C7631c c7631c) {
        x1 x1Var = (x1) m14563x(c7631c).f36832K.f22541e;
        AbstractC4154l.m8921d(x1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return x1Var.f37041q;
    }

    /* renamed from: e */
    public static final AbstractC7878q m14544e(InterfaceC7641m interfaceC7641m, int i10) {
        AbstractC7878q abstractC7878q = ((AbstractC7878q) interfaceC7641m).f37670a.f37675f;
        if (abstractC7878q == null || (abstractC7878q.f37673d & i10) == 0) {
            return null;
        }
        while (abstractC7878q != null) {
            int i11 = abstractC7878q.f37672c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return abstractC7878q;
            }
            abstractC7878q = abstractC7878q.f37675f;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC7878q m14545f(C4640e c4640e) {
        int i10;
        if (c4640e == null || (i10 = c4640e.f22886c) == 0) {
            return null;
        }
        return (AbstractC7878q) c4640e.m9515m(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final InterfaceC7652x m14546g(AbstractC7878q abstractC7878q) {
        if ((abstractC7878q.f37672c & 2) != 0) {
            if (abstractC7878q instanceof InterfaceC7652x) {
                return (InterfaceC7652x) abstractC7878q;
            }
            if (abstractC7878q instanceof AbstractC7642n) {
                AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878q).f36953r;
                while (abstractC7878q2 != 0) {
                    if (abstractC7878q2 instanceof InterfaceC7652x) {
                        return (InterfaceC7652x) abstractC7878q2;
                    }
                    abstractC7878q2 = (!(abstractC7878q2 instanceof AbstractC7642n) || (abstractC7878q2.f37672c & 2) == 0) ? abstractC7878q2.f37675f : ((AbstractC7642n) abstractC7878q2).f36953r;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final int m14547h(long j6, long j10) {
        boolean zM14556q = m14556q(j6);
        if (zM14556q != m14556q(j10)) {
            return zM14556q ? -1 : 1;
        }
        return (Math.min(m14551l(j6), m14551l(j10)) >= DefinitionKt.NO_Float_VALUE && m14555p(j6) != m14555p(j10)) ? m14555p(j6) ? -1 : 1 : (int) Math.signum(m14551l(j6) - m14551l(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final Object m14548i(InterfaceC7640l interfaceC7640l, k2.l1 l1Var) {
        if (!((AbstractC7878q) interfaceC7640l).f37670a.f37683p) {
            AbstractC6744a.m12907b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C6738g c6738g = (C6738g) m14563x(interfaceC7640l).f36828F;
        c6738g.getClass();
        return C3953b.m8518u(c6738g, l1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, v3.a2, v3.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: j */
    public static final a2 m14549j(a2 a2Var) {
        C4535g c4535g;
        AbstractC7878q abstractC7878q = (AbstractC7878q) a2Var;
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a.f37674e;
        g0 g0VarM14563x = m14563x(a2Var);
        while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 262144) != 0) {
                while (abstractC7878q2 != null) {
                    if ((abstractC7878q2.f37672c & 262144) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                        ?? c4640e = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof a2) {
                                a2 a2Var2 = (a2) abstractC7642nM14545f;
                                if (AbstractC4154l.m8918a(a2Var.mo7492h(), a2Var2.mo7492h()) && a2Var.getClass() == a2Var2.getClass()) {
                                    return a2Var2;
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 262144) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q3 = abstractC7642nM14545f.f36953r;
                                int i10 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                                while (abstractC7878q3 != null) {
                                    if ((abstractC7878q3.f37672c & 262144) != 0) {
                                        i10++;
                                        c4640e = c4640e;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            abstractC7642nM14545f = m14545f(c4640e);
                        }
                    }
                    abstractC7878q2 = abstractC7878q2.f37674e;
                }
            }
            g0VarM14563x = g0VarM14563x.m14609v();
            abstractC7878q2 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
        }
        return null;
    }

    /* renamed from: k */
    public static final ArrayList m14550k(InterfaceC7028o interfaceC7028o) {
        AbstractC4154l.m8921d(interfaceC7028o, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        g0 g0VarB0 = ((n0) interfaceC7028o).B0();
        boolean zM14557r = m14557r(g0VarB0);
        C4637b c4637b = (C4637b) g0VarB0.m14604q();
        C4640e c4640e = c4637b.f22878a;
        ArrayList arrayList = new ArrayList(c4640e.f22886c);
        int i10 = c4640e.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) c4637b.get(i11);
            arrayList.add(zM14557r ? g0Var.m14601m() : g0Var.m14602o());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final float m14551l(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m14552m(InterfaceC7644p interfaceC7644p) {
        if (((AbstractC7878q) interfaceC7644p).f37670a.f37683p) {
            m14561v(interfaceC7644p, 1).a1();
        }
    }

    /* renamed from: n */
    public static final void m14553n(InterfaceC7652x interfaceC7652x) {
        m14563x(interfaceC7652x).m14575E();
    }

    /* renamed from: o */
    public static final void m14554o(w1 w1Var) {
        m14563x(w1Var).m14576F();
    }

    /* renamed from: p */
    public static final boolean m14555p(long j6) {
        return (j6 & 2) != 0;
    }

    /* renamed from: q */
    public static final boolean m14556q(long j6) {
        return (j6 & 1) != 0;
    }

    /* renamed from: r */
    public static final boolean m14557r(g0 g0Var) {
        int i10 = z0.f37080a[g0Var.f36833L.f36931d.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        g0 g0VarM14609v = g0Var.m14609v();
        if (g0VarM14609v != null) {
            return m14557r(g0VarM14609v);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }

    /* renamed from: s */
    public static final boolean m14558s(g0 g0Var) {
        if (g0Var.f36849h == null) {
            return false;
        }
        g0 g0VarM14609v = g0Var.m14609v();
        return (g0VarM14609v != null ? g0VarM14609v.f36849h : null) == null || g0Var.f36833L.f36929b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static final void m14559t(AbstractC7878q abstractC7878q, InterfaceC2137a interfaceC2137a) {
        m1 m1Var = abstractC7878q.f37676g;
        if (m1Var == null) {
            m1Var = new m1((l1) abstractC7878q);
            abstractC7878q.f37676g = m1Var;
        }
        ((C7904v) m14564y(abstractC7878q)).getSnapshotObserver().m14657a(m1Var, C7633e.f36799f, interfaceC2137a);
    }

    /* renamed from: u */
    public static final void m14560u(InterfaceC7641m interfaceC7641m) {
        C8279c c8279c;
        g0 g0VarM14563x = m14563x(interfaceC7641m);
        if (g0VarM14563x.f36861w) {
            return;
        }
        C7904v c7904v = (C7904v) j0.m14636a(g0VarM14563x);
        if (!C7904v.m15013g() || (c8279c = c7904v.f38008G) == null) {
            return;
        }
        c8279c.f39806d.f9178a.m1644n(g0VarM14563x.f36843b, new C4170b(3, c8279c, g0VarM14563x));
    }

    /* renamed from: v */
    public static final h1 m14561v(InterfaceC7641m interfaceC7641m, int i10) {
        h1 h1Var = ((AbstractC7878q) interfaceC7641m).f37670a.f37677h;
        AbstractC4154l.m8920c(h1Var);
        if (h1Var.T0() != interfaceC7641m || !i1.m14630g(i10)) {
            return h1Var;
        }
        h1 h1Var2 = h1Var.f36903n;
        AbstractC4154l.m8920c(h1Var2);
        return h1Var2;
    }

    /* renamed from: w */
    public static final h1 m14562w(InterfaceC7641m interfaceC7641m) {
        if (!((AbstractC7878q) interfaceC7641m).f37670a.f37683p) {
            AbstractC6744a.m12907b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        h1 h1VarM14561v = m14561v(interfaceC7641m, 2);
        if (!h1VarM14561v.T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinates is not attached.");
        }
        return h1VarM14561v;
    }

    /* renamed from: x */
    public static final g0 m14563x(InterfaceC7641m interfaceC7641m) {
        h1 h1Var = ((AbstractC7878q) interfaceC7641m).f37670a.f37677h;
        if (h1Var != null) {
            return h1Var.f36902m;
        }
        throw p020v.a1.m14342v("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* renamed from: y */
    public static final p1 m14564y(InterfaceC7641m interfaceC7641m) {
        p1 p1Var = m14563x(interfaceC7641m).f36855p;
        if (p1Var != null) {
            return p1Var;
        }
        throw p020v.a1.m14342v("This node does not have an owner.");
    }

    /* renamed from: z */
    public static final View m14565z(InterfaceC7641m interfaceC7641m) {
        if (!((AbstractC7878q) interfaceC7641m).f37670a.f37683p) {
            AbstractC6744a.m12907b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) j0.m14636a(m14563x(interfaceC7641m));
    }
}
