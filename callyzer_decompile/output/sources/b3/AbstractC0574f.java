package b3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import b2.C0566x;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import m2.C4640e;
import s3.AbstractC6744a;
import t3.c1;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.h1;
import v3.p1;
import v3.x1;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.f */
/* loaded from: classes.dex */
public abstract class AbstractC0574f {

    /* renamed from: a */
    public static final int[] f3907a = new int[2];

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af A[PHI: r0
      0x00af: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x00ad, B:57:0x00b2, B:60:0x00b6, B:63:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1710A(b3.e0 r10, int r11, ex.InterfaceC2139c r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0574f.m1710A(b3.e0, int, ex.c):java.lang.Object");
    }

    /* renamed from: B */
    public static final boolean m1711B(int i10, C0566x c0566x, e0 e0Var, C0848c c0848c) {
        e0 e0VarM1723h;
        C4640e c4640e = new C4640e(new e0[16]);
        if (!e0Var.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitChildren called on an unattached node");
        }
        C4640e c4640e2 = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q = e0Var.f37670a;
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        if (abstractC7878q2 == null) {
            AbstractC7634f.m14541b(c4640e2, abstractC7878q);
        } else {
            c4640e2.m9506b(abstractC7878q2);
        }
        while (true) {
            int i11 = c4640e2.f22886c;
            if (i11 == 0) {
                break;
            }
            AbstractC7878q abstractC7878qM14545f = (AbstractC7878q) c4640e2.m9515m(i11 - 1);
            if ((abstractC7878qM14545f.f37673d & 1024) == 0) {
                AbstractC7634f.m14541b(c4640e2, abstractC7878qM14545f);
            } else {
                while (true) {
                    if (abstractC7878qM14545f == null) {
                        break;
                    }
                    if ((abstractC7878qM14545f.f37672c & 1024) != 0) {
                        C4640e c4640e3 = null;
                        while (abstractC7878qM14545f != null) {
                            if (abstractC7878qM14545f instanceof e0) {
                                e0 e0Var2 = (e0) abstractC7878qM14545f;
                                if (e0Var2.f37683p) {
                                    c4640e.m9506b(e0Var2);
                                }
                            } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                int i12 = 0;
                                for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                    if ((abstractC7878q3.f37672c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC7878qM14545f = abstractC7878q3;
                                        } else {
                                            if (c4640e3 == null) {
                                                c4640e3 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e3.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e3.m9506b(abstractC7878q3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e3);
                        }
                    } else {
                        abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                    }
                }
            }
        }
        while (c4640e.f22886c != 0 && (e0VarM1723h = m1723h(c4640e, c0848c, i10)) != null) {
            if (e0VarM1723h.M0().f3952a) {
                return ((Boolean) c0566x.invoke(e0VarM1723h)).booleanValue();
            }
            if (m1727l(i10, c0566x, e0VarM1723h, c0848c)) {
                return true;
            }
            c4640e.m9514l(e0VarM1723h);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m1712C(b3.e0 r12, b3.e0 r13, int r14, b2.C0566x r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0574f.m1712C(b3.e0, b3.e0, int, b2.x):boolean");
    }

    /* renamed from: D */
    public static final Integer m1713D(int i10) {
        if (i10 == 5) {
            return 33;
        }
        if (i10 == 6) {
            return 130;
        }
        if (i10 == 3) {
            return 17;
        }
        if (i10 == 4) {
            return 66;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10 == 2 ? 1 : null;
    }

    /* renamed from: E */
    public static final C0572d m1714E(int i10) {
        if (i10 == 1) {
            return new C0572d(2);
        }
        if (i10 == 2) {
            return new C0572d(1);
        }
        if (i10 == 17) {
            return new C0572d(3);
        }
        if (i10 == 33) {
            return new C0572d(5);
        }
        if (i10 == 66) {
            return new C0572d(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new C0572d(6);
    }

    /* renamed from: F */
    public static final Boolean m1715F(int i10, C0566x c0566x, e0 e0Var, C0848c c0848c) {
        c0 c0VarN0 = e0Var.N0();
        int[] iArr = l0.f3928a;
        int i11 = iArr[c0VarN0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m1724i(e0Var, i10, c0566x));
            }
            if (i11 == 4) {
                return e0Var.M0().f3952a ? (Boolean) c0566x.invoke(e0Var) : c0848c == null ? Boolean.valueOf(m1724i(e0Var, i10, c0566x)) : Boolean.valueOf(m1711B(i10, c0566x, e0Var, c0848c));
            }
            throw new NoWhenBranchMatchedException();
        }
        e0 e0VarM1729n = m1729n(e0Var);
        if (e0VarM1729n == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[e0VarM1729n.N0().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                if (c0848c == null) {
                    c0848c = m1725j(e0VarM1729n);
                }
                return Boolean.valueOf(m1727l(i10, c0566x, e0Var, c0848c));
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        Boolean boolM1715F = m1715F(i10, c0566x, e0VarM1729n, c0848c);
        if (!AbstractC4154l.m8918a(boolM1715F, Boolean.FALSE)) {
            return boolM1715F;
        }
        if (c0848c == null) {
            if (e0VarM1729n.N0() != c0.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy");
            }
            e0 e0VarM1722g = m1722g(e0VarM1729n);
            if (e0VarM1722g == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            c0848c = m1725j(e0VarM1722g);
        }
        return Boolean.valueOf(m1727l(i10, c0566x, e0Var, c0848c));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m1716a(b3.e0 r9, b2.C0566x r10) {
        /*
            b3.c0 r0 = r9.N0()
            int[] r1 = b3.j0.f3920a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L41
            if (r0 == r5) goto L3c
            if (r0 == r3) goto L3c
            if (r0 != r2) goto L36
            boolean r0 = m1739x(r9, r10)
            if (r0 != 0) goto L8e
            b3.t r0 = r9.M0()
            boolean r0 = r0.f3952a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L8d
            goto L8e
        L36:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L3c:
            boolean r9 = m1739x(r9, r10)
            return r9
        L41:
            b3.e0 r0 = m1729n(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L8f
            b3.c0 r8 = r0.N0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L6c
            if (r1 == r5) goto L67
            if (r1 == r3) goto L67
            if (r1 == r2) goto L61
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L61:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r7)
            throw r9
        L67:
            boolean r9 = m1728m(r9, r0, r5, r10)
            return r9
        L6c:
            boolean r1 = m1716a(r0, r10)
            if (r1 != 0) goto L8e
            boolean r9 = m1728m(r9, r0, r5, r10)
            if (r9 != 0) goto L8e
            b3.t r9 = r0.M0()
            boolean r9 = r9.f3952a
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r10.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            goto L8e
        L8d:
            return r4
        L8e:
            return r6
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0574f.m1716a(b3.e0, b2.x):boolean");
    }

    /* renamed from: b */
    public static final boolean m1717b(C0848c c0848c, C0848c c0848c2, C0848c c0848c3, int i10) {
        float f6;
        float f10;
        boolean zM1718c = m1718c(i10, c0848c3, c0848c);
        float f11 = c0848c3.f5355b;
        float f12 = c0848c3.f5357d;
        float f13 = c0848c3.f5354a;
        float f14 = c0848c3.f5356c;
        float f15 = c0848c.f5357d;
        float f16 = c0848c.f5355b;
        float f17 = c0848c.f5356c;
        float f18 = c0848c.f5354a;
        if (zM1718c || !m1718c(i10, c0848c2, c0848c)) {
            return false;
        }
        if (i10 == 3) {
            if (f18 < f14) {
                return true;
            }
        } else if (i10 == 4) {
            if (f17 > f13) {
                return true;
            }
        } else if (i10 == 5) {
            if (f16 < f12) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f15 > f11) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f6 = f18 - c0848c2.f5356c;
        } else if (i10 == 4) {
            f6 = c0848c2.f5354a - f17;
        } else if (i10 == 5) {
            f6 = f16 - c0848c2.f5357d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = c0848c2.f5355b - f15;
        }
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (i10 == 3) {
            f10 = f18 - f13;
        } else if (i10 == 4) {
            f10 = f14 - f17;
        } else if (i10 == 5) {
            f10 = f16 - f11;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - f15;
        }
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        return f6 < f10;
    }

    /* renamed from: c */
    public static final boolean m1718c(int i10, C0848c c0848c, C0848c c0848c2) {
        if (i10 == 3 || i10 == 4) {
            return c0848c.f5357d > c0848c2.f5355b && c0848c.f5355b < c0848c2.f5357d;
        }
        if (i10 == 5 || i10 == 6) {
            return c0848c.f5356c > c0848c2.f5354a && c0848c.f5354a < c0848c2.f5356c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* renamed from: d */
    public static final C0848c m1719d(View view, C7904v c7904v) {
        int[] iArr = f3907a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        c7904v.getLocationInWindow(iArr);
        float f6 = i10 - iArr[0];
        float f10 = i11 - iArr[1];
        return new C0848c(f6, f10, view.getWidth() + f6, view.getHeight() + f10);
    }

    /* renamed from: e */
    public static final boolean m1720e(e0 e0Var, boolean z6) {
        int i10 = g0.f3909a[e0Var.N0().ordinal()];
        if (i10 == 1) {
            ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).m1748g(null);
            e0Var.L0(c0.Active, c0.Inactive);
            return true;
        }
        if (i10 == 2) {
            if (z6) {
                ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).m1748g(null);
                e0Var.L0(c0.Captured, c0.Inactive);
            }
            return z6;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        e0 e0VarM1729n = m1729n(e0Var);
        if (!(e0VarM1729n != null ? m1720e(e0VarM1729n, z6) : true)) {
            return false;
        }
        e0Var.L0(c0.ActiveParent, c0.Inactive);
        return true;
    }

    /* renamed from: f */
    public static final void m1721f(e0 e0Var, C4640e c4640e) {
        if (!e0Var.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitChildren called on an unattached node");
        }
        C4640e c4640e2 = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q = e0Var.f37670a;
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        if (abstractC7878q2 == null) {
            AbstractC7634f.m14541b(c4640e2, abstractC7878q);
        } else {
            c4640e2.m9506b(abstractC7878q2);
        }
        while (true) {
            int i10 = c4640e2.f22886c;
            if (i10 == 0) {
                return;
            }
            AbstractC7878q abstractC7878qM14545f = (AbstractC7878q) c4640e2.m9515m(i10 - 1);
            if ((abstractC7878qM14545f.f37673d & 1024) == 0) {
                AbstractC7634f.m14541b(c4640e2, abstractC7878qM14545f);
            } else {
                while (true) {
                    if (abstractC7878qM14545f == null) {
                        break;
                    }
                    if ((abstractC7878qM14545f.f37672c & 1024) != 0) {
                        C4640e c4640e3 = null;
                        while (abstractC7878qM14545f != null) {
                            if (abstractC7878qM14545f instanceof e0) {
                                e0 e0Var2 = (e0) abstractC7878qM14545f;
                                if (e0Var2.f37683p && !AbstractC7634f.m14563x(e0Var2).f44836h0) {
                                    if (e0Var2.M0().f3952a) {
                                        c4640e.m9506b(e0Var2);
                                    } else {
                                        m1721f(e0Var2, c4640e);
                                    }
                                }
                            } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                int i11 = 0;
                                for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                    if ((abstractC7878q3.f37672c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            abstractC7878qM14545f = abstractC7878q3;
                                        } else {
                                            if (c4640e3 == null) {
                                                c4640e3 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e3.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e3.m9506b(abstractC7878q3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e3);
                        }
                    } else {
                        abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static final e0 m1722g(e0 e0Var) {
        e0 e0Var2 = ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3947l;
        if (e0Var2 == null || !e0Var2.f37683p) {
            return null;
        }
        return e0Var2;
    }

    /* renamed from: h */
    public static final e0 m1723h(C4640e c4640e, C0848c c0848c, int i10) {
        C0848c c0848cM2286h;
        if (i10 == 3) {
            c0848cM2286h = c0848c.m2286h((c0848c.f5356c - c0848c.f5354a) + 1, DefinitionKt.NO_Float_VALUE);
        } else if (i10 == 4) {
            c0848cM2286h = c0848c.m2286h(-((c0848c.f5356c - c0848c.f5354a) + 1), DefinitionKt.NO_Float_VALUE);
        } else if (i10 == 5) {
            c0848cM2286h = c0848c.m2286h(DefinitionKt.NO_Float_VALUE, (c0848c.f5357d - c0848c.f5355b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c0848cM2286h = c0848c.m2286h(DefinitionKt.NO_Float_VALUE, -((c0848c.f5357d - c0848c.f5355b) + 1));
        }
        Object[] objArr = c4640e.f22884a;
        int i11 = c4640e.f22886c;
        e0 e0Var = null;
        for (int i12 = 0; i12 < i11; i12++) {
            e0 e0Var2 = (e0) objArr[i12];
            if (m1734s(e0Var2)) {
                C0848c c0848cM1725j = m1725j(e0Var2);
                if (m1731p(c0848cM1725j, c0848cM2286h, c0848c, i10)) {
                    e0Var = e0Var2;
                    c0848cM2286h = c0848cM1725j;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: i */
    public static final boolean m1724i(e0 e0Var, int i10, InterfaceC2139c interfaceC2139c) {
        C0848c c0848c;
        C4640e c4640e = new C4640e(new e0[16]);
        m1721f(e0Var, c4640e);
        int i11 = c4640e.f22886c;
        if (i11 <= 1) {
            e0 e0Var2 = (e0) (i11 == 0 ? null : c4640e.f22884a[0]);
            if (e0Var2 != null) {
                return ((Boolean) interfaceC2139c.invoke(e0Var2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                C0848c c0848cM1725j = m1725j(e0Var);
                float f6 = c0848cM1725j.f5354a;
                float f10 = c0848cM1725j.f5355b;
                c0848c = new C0848c(f6, f10, f6, f10);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C0848c c0848cM1725j2 = m1725j(e0Var);
                float f11 = c0848cM1725j2.f5356c;
                float f12 = c0848cM1725j2.f5357d;
                c0848c = new C0848c(f11, f12, f11, f12);
            }
            e0 e0VarM1723h = m1723h(c4640e, c0848c, i10);
            if (e0VarM1723h != null) {
                return ((Boolean) interfaceC2139c.invoke(e0VarM1723h)).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final C0848c m1725j(e0 e0Var) {
        h1 h1Var = e0Var.f37677h;
        return h1Var != null ? c1.m13279h(h1Var).mo13298S(h1Var, false) : C0848c.f5353e;
    }

    /* renamed from: k */
    public static final boolean m1726k(e0 e0Var, C0566x c0566x) {
        int i10 = j0.f3920a[e0Var.N0().ordinal()];
        if (i10 == 1) {
            e0 e0VarM1729n = m1729n(e0Var);
            if (e0VarM1729n != null) {
                return m1726k(e0VarM1729n, c0566x) || m1728m(e0Var, e0VarM1729n, 1, c0566x);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return m1740y(e0Var, c0566x);
        }
        if (i10 == 4) {
            return e0Var.M0().f3952a ? ((Boolean) c0566x.invoke(e0Var)).booleanValue() : m1740y(e0Var, c0566x);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: l */
    public static final boolean m1727l(int i10, C0566x c0566x, e0 e0Var, C0848c c0848c) {
        if (m1711B(i10, c0566x, e0Var, c0848c)) {
            return true;
        }
        f0 f0Var = ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3943h;
        f0Var.getClass();
        Boolean bool = (Boolean) m1710A(e0Var, i10, new k0(f0Var, ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3947l, e0Var, c0848c, i10, c0566x, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m1728m(e0 e0Var, e0 e0Var2, int i10, C0566x c0566x) {
        if (m1712C(e0Var, e0Var2, i10, c0566x)) {
            return true;
        }
        f0 f0Var = ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3943h;
        f0Var.getClass();
        Boolean bool = (Boolean) m1710A(e0Var, i10, new k0(f0Var, ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3947l, e0Var, e0Var2, i10, c0566x, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0026, code lost:
    
        continue;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b3.e0 m1729n(b3.e0 r8) {
        /*
            w2.q r0 = r8.f37670a
            boolean r0 = r0.f37683p
            r1 = 0
            if (r0 != 0) goto L9
            goto La8
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            s3.AbstractC6744a.m12907b(r0)
        L10:
            m2.e r0 = new m2.e
            r2 = 16
            w2.q[] r3 = new w2.AbstractC7878q[r2]
            r0.<init>(r3)
            w2.q r8 = r8.f37670a
            w2.q r3 = r8.f37675f
            if (r3 != 0) goto L23
            v3.AbstractC7634f.m14541b(r0, r8)
            goto L26
        L23:
            r0.m9506b(r3)
        L26:
            int r8 = r0.f22886c
            if (r8 == 0) goto La8
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.m9515m(r8)
            w2.q r8 = (w2.AbstractC7878q) r8
            int r3 = r8.f37673d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            v3.AbstractC7634f.m14541b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f37672c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La5
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof b3.e0
            r5 = 1
            if (r4 == 0) goto L6a
            b3.e0 r8 = (b3.e0) r8
            w2.q r4 = r8.f37670a
            boolean r4 = r4.f37683p
            if (r4 == 0) goto La0
            b3.c0 r4 = r8.N0()
            int[] r6 = b3.h0.f3917b
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L69
            r5 = 2
            if (r4 == r5) goto L69
            r5 = 3
            if (r4 == r5) goto L69
            goto La0
        L69:
            return r8
        L6a:
            int r4 = r8.f37672c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La0
            boolean r4 = r8 instanceof v3.AbstractC7642n
            if (r4 == 0) goto La0
            r4 = r8
            v3.n r4 = (v3.AbstractC7642n) r4
            w2.q r4 = r4.f36953r
            r6 = 0
        L7a:
            if (r4 == 0) goto L9d
            int r7 = r4.f37672c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9a
            int r6 = r6 + 1
            if (r6 != r5) goto L88
            r8 = r4
            goto L9a
        L88:
            if (r3 != 0) goto L91
            m2.e r3 = new m2.e
            w2.q[] r7 = new w2.AbstractC7878q[r2]
            r3.<init>(r7)
        L91:
            if (r8 == 0) goto L97
            r3.m9506b(r8)
            r8 = r1
        L97:
            r3.m9506b(r4)
        L9a:
            w2.q r4 = r4.f37675f
            goto L7a
        L9d:
            if (r6 != r5) goto La0
            goto L45
        La0:
            w2.q r8 = v3.AbstractC7634f.m14545f(r3)
            goto L45
        La5:
            w2.q r8 = r8.f37675f
            goto L3c
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0574f.m1729n(b3.e0):b3.e0");
    }

    /* renamed from: o */
    public static final void m1730o(e0 e0Var) {
        v3.g0 g0Var;
        p1 p1Var;
        h1 h1Var = e0Var.f37670a.f37677h;
        if (h1Var == null || (g0Var = h1Var.f36902m) == null || (p1Var = g0Var.f36855p) == null) {
            return;
        }
        ((C7904v) p1Var).getFocusOwner();
    }

    /* renamed from: p */
    public static final boolean m1731p(C0848c c0848c, C0848c c0848c2, C0848c c0848c3, int i10) {
        if (!m1732q(i10, c0848c, c0848c3)) {
            return false;
        }
        if (m1732q(i10, c0848c2, c0848c3) && !m1717b(c0848c3, c0848c, c0848c2, i10)) {
            return !m1717b(c0848c3, c0848c2, c0848c, i10) && m1733r(i10, c0848c3, c0848c) < m1733r(i10, c0848c3, c0848c2);
        }
        return true;
    }

    /* renamed from: q */
    public static final boolean m1732q(int i10, C0848c c0848c, C0848c c0848c2) {
        float f6 = c0848c.f5355b;
        float f10 = c0848c.f5357d;
        float f11 = c0848c.f5354a;
        float f12 = c0848c.f5356c;
        if (i10 == 3) {
            float f13 = c0848c2.f5356c;
            float f14 = c0848c2.f5354a;
            return (f13 > f12 || f14 >= f12) && f14 > f11;
        }
        if (i10 == 4) {
            float f15 = c0848c2.f5354a;
            float f16 = c0848c2.f5356c;
            return (f15 < f11 || f16 <= f11) && f16 < f12;
        }
        if (i10 == 5) {
            float f17 = c0848c2.f5357d;
            float f18 = c0848c2.f5355b;
            return (f17 > f10 || f18 >= f10) && f18 > f6;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f19 = c0848c2.f5355b;
        float f20 = c0848c2.f5357d;
        return (f19 < f6 || f20 <= f6) && f20 < f10;
    }

    /* renamed from: r */
    public static final long m1733r(int i10, C0848c c0848c, C0848c c0848c2) {
        float f6;
        float f10;
        float f11 = c0848c2.f5355b;
        float f12 = c0848c2.f5357d;
        float f13 = c0848c2.f5354a;
        float f14 = c0848c2.f5356c;
        if (i10 == 3) {
            f6 = c0848c.f5354a - f14;
        } else if (i10 == 4) {
            f6 = f13 - c0848c.f5356c;
        } else if (i10 == 5) {
            f6 = c0848c.f5355b - f12;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = f11 - c0848c.f5357d;
        }
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        long j6 = (long) f6;
        if (i10 == 3 || i10 == 4) {
            float f15 = c0848c.f5355b;
            float f16 = 2;
            f10 = (((c0848c.f5357d - f15) / f16) + f15) - (((f12 - f11) / f16) + f11);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f17 = c0848c.f5354a;
            float f18 = 2;
            f10 = (((c0848c.f5356c - f17) / f18) + f17) - (((f14 - f13) / f18) + f13);
        }
        long j10 = (long) f10;
        return (j10 * j10) + (13 * j6 * j6);
    }

    /* renamed from: s */
    public static final boolean m1734s(e0 e0Var) {
        v3.g0 g0Var;
        h1 h1Var;
        v3.g0 g0Var2;
        h1 h1Var2 = e0Var.f37677h;
        return (h1Var2 == null || (g0Var = h1Var2.f36902m) == null || !g0Var.m14579I() || (h1Var = e0Var.f37677h) == null || (g0Var2 = h1Var.f36902m) == null || !g0Var2.m14578H()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: t */
    public static final EnumC0570b m1735t(e0 e0Var, int i10) {
        int i11 = g0.f3909a[e0Var.N0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return EnumC0570b.Cancelled;
            }
            if (i11 == 3) {
                e0 e0VarM1729n = m1729n(e0Var);
                if (e0VarM1729n == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC0570b enumC0570bM1735t = m1735t(e0VarM1729n, i10);
                EnumC0570b enumC0570b = EnumC0570b.None;
                if (enumC0570bM1735t == enumC0570b) {
                    enumC0570bM1735t = null;
                }
                if (enumC0570bM1735t != null) {
                    return enumC0570bM1735t;
                }
                if (e0Var.f3904r) {
                    return enumC0570b;
                }
                e0Var.f3904r = true;
                try {
                    C0588t c0588tM0 = e0Var.M0();
                    C0569a c0569a = new C0569a(i10);
                    m1730o(e0Var);
                    InterfaceC0579k focusOwner = ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner();
                    e0 e0Var2 = ((C0585q) focusOwner).f3947l;
                    c0588tM0.f3962k.invoke(c0569a);
                    e0 e0Var3 = ((C0585q) focusOwner).f3947l;
                    if (!c0569a.f3896b) {
                        return (e0Var2 == e0Var3 || e0Var3 == null) ? enumC0570b : C0592x.f3967d == C0592x.f3966c ? EnumC0570b.Cancelled : EnumC0570b.Redirected;
                    }
                    C0592x c0592x = C0592x.f3965b;
                    return EnumC0570b.Cancelled;
                } finally {
                    e0Var.f3904r = false;
                }
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EnumC0570b.None;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: u */
    public static final EnumC0570b m1736u(e0 e0Var, int i10) {
        if (!e0Var.f3905s) {
            e0Var.f3905s = true;
            try {
                C0588t c0588tM0 = e0Var.M0();
                C0569a c0569a = new C0569a(i10);
                m1730o(e0Var);
                InterfaceC0579k focusOwner = ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner();
                e0 e0Var2 = ((C0585q) focusOwner).f3947l;
                c0588tM0.f3961j.invoke(c0569a);
                e0 e0Var3 = ((C0585q) focusOwner).f3947l;
                if (c0569a.f3896b) {
                    C0592x c0592x = C0592x.f3965b;
                    return EnumC0570b.Cancelled;
                }
                if (e0Var2 != e0Var3 && e0Var3 != null) {
                    return C0592x.f3967d == C0592x.f3966c ? EnumC0570b.Cancelled : EnumC0570b.Redirected;
                }
            } finally {
                e0Var.f3905s = false;
            }
        }
        return EnumC0570b.None;
    }

    /* renamed from: v */
    public static final EnumC0570b m1737v(e0 e0Var, int i10) {
        AbstractC7878q abstractC7878qM14545f;
        C4535g c4535g;
        int i11 = g0.f3909a[e0Var.N0().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return EnumC0570b.None;
        }
        if (i11 == 3) {
            e0 e0VarM1729n = m1729n(e0Var);
            if (e0VarM1729n != null) {
                return m1735t(e0VarM1729n, i10);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (!e0Var.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q = e0Var.f37670a.f37674e;
        v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0Var);
        loop0: while (true) {
            if (g0VarM14563x == null) {
                abstractC7878qM14545f = null;
                break;
            }
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 1024) != 0) {
                while (abstractC7878q != null) {
                    if ((abstractC7878q.f37672c & 1024) != 0) {
                        abstractC7878qM14545f = abstractC7878q;
                        C4640e c4640e = null;
                        while (abstractC7878qM14545f != null) {
                            if (abstractC7878qM14545f instanceof e0) {
                                break loop0;
                            }
                            if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                int i12 = 0;
                                for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                                    if ((abstractC7878q2.f37672c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        e0 e0Var2 = (e0) abstractC7878qM14545f;
        if (e0Var2 == null) {
            return EnumC0570b.None;
        }
        int i13 = g0.f3909a[e0Var2.N0().ordinal()];
        if (i13 == 1) {
            return m1736u(e0Var2, i10);
        }
        if (i13 == 2) {
            return EnumC0570b.Cancelled;
        }
        if (i13 == 3) {
            return m1737v(e0Var2, i10);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC0570b enumC0570bM1737v = m1737v(e0Var2, i10);
        EnumC0570b enumC0570b = enumC0570bM1737v != EnumC0570b.None ? enumC0570bM1737v : null;
        return enumC0570b == null ? m1736u(e0Var2, i10) : enumC0570b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0205 A[ADDED_TO_REGION, LOOP:9: B:138:0x0205->B:145:0x0217, LOOP_START, PHI: r12
      0x0205: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:137:0x0203, B:145:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0224  */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m1738w(b3.e0 r18) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0574f.m1738w(b3.e0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: x */
    public static final boolean m1739x(e0 e0Var, C0566x c0566x) {
        e0[] e0VarArr = new e0[16];
        if (!e0Var.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitChildren called on an unattached node");
        }
        C4640e c4640e = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q = e0Var.f37670a;
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        if (abstractC7878q2 == null) {
            AbstractC7634f.m14541b(c4640e, abstractC7878q);
        } else {
            c4640e.m9506b(abstractC7878q2);
        }
        int i10 = 0;
        while (true) {
            int i11 = c4640e.f22886c;
            if (i11 == 0) {
                break;
            }
            AbstractC7878q abstractC7878qM14545f = (AbstractC7878q) c4640e.m9515m(i11 - 1);
            if ((abstractC7878qM14545f.f37673d & 1024) == 0) {
                AbstractC7634f.m14541b(c4640e, abstractC7878qM14545f);
            } else {
                while (true) {
                    if (abstractC7878qM14545f == null) {
                        break;
                    }
                    if ((abstractC7878qM14545f.f37672c & 1024) != 0) {
                        C4640e c4640e2 = null;
                        while (abstractC7878qM14545f != null) {
                            if (abstractC7878qM14545f instanceof e0) {
                                e0 e0Var2 = (e0) abstractC7878qM14545f;
                                int i12 = i10 + 1;
                                if (e0VarArr.length < i12) {
                                    int length = e0VarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(e0VarArr, 0, r10, 0, length);
                                    e0VarArr = r10;
                                }
                                e0VarArr[i10] = e0Var2;
                                i10 = i12;
                            } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                int i13 = 0;
                                for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                    if ((abstractC7878q3.f37672c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            abstractC7878qM14545f = abstractC7878q3;
                                        } else {
                                            if (c4640e2 == null) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e2.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e2.m9506b(abstractC7878q3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e2);
                        }
                    } else {
                        abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                    }
                }
            }
        }
        Arrays.sort(e0VarArr, 0, i10, i0.f3918a);
        int i14 = i10 - 1;
        if (i14 < e0VarArr.length) {
            while (i14 >= 0) {
                e0 e0Var3 = e0VarArr[i14];
                if (m1734s(e0Var3) && m1716a(e0Var3, c0566x)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: y */
    public static final boolean m1740y(e0 e0Var, C0566x c0566x) {
        e0[] e0VarArr = new e0[16];
        if (!e0Var.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitChildren called on an unattached node");
        }
        C4640e c4640e = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q = e0Var.f37670a;
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        if (abstractC7878q2 == null) {
            AbstractC7634f.m14541b(c4640e, abstractC7878q);
        } else {
            c4640e.m9506b(abstractC7878q2);
        }
        int i10 = 0;
        while (true) {
            int i11 = c4640e.f22886c;
            if (i11 == 0) {
                break;
            }
            AbstractC7878q abstractC7878qM14545f = (AbstractC7878q) c4640e.m9515m(i11 - 1);
            if ((abstractC7878qM14545f.f37673d & 1024) == 0) {
                AbstractC7634f.m14541b(c4640e, abstractC7878qM14545f);
            } else {
                while (true) {
                    if (abstractC7878qM14545f == null) {
                        break;
                    }
                    if ((abstractC7878qM14545f.f37672c & 1024) != 0) {
                        C4640e c4640e2 = null;
                        while (abstractC7878qM14545f != null) {
                            if (abstractC7878qM14545f instanceof e0) {
                                e0 e0Var2 = (e0) abstractC7878qM14545f;
                                int i12 = i10 + 1;
                                if (e0VarArr.length < i12) {
                                    int length = e0VarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(e0VarArr, 0, r10, 0, length);
                                    e0VarArr = r10;
                                }
                                e0VarArr[i10] = e0Var2;
                                i10 = i12;
                            } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                int i13 = 0;
                                for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                    if ((abstractC7878q3.f37672c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            abstractC7878qM14545f = abstractC7878q3;
                                        } else {
                                            if (c4640e2 == null) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e2.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e2.m9506b(abstractC7878q3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e2);
                        }
                    } else {
                        abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                    }
                }
            }
        }
        Arrays.sort(e0VarArr, 0, i10, i0.f3918a);
        for (int i14 = 0; i14 < i10; i14++) {
            e0 e0Var3 = e0VarArr[i14];
            if (m1734s(e0Var3) && m1726k(e0Var3, c0566x)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m1741z(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C7904v) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
