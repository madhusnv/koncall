package w3;

import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.C1589q;
import kotlin.jvm.internal.AbstractC4154l;
import p021w.AbstractC7848n;
import r4.EnumC6455j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.d */
/* loaded from: classes.dex */
public final class C7886d extends AbstractC7848n {

    /* renamed from: e */
    public static C7886d f37764e;

    /* renamed from: f */
    public static final EnumC6455j f37765f = EnumC6455j.Rtl;

    /* renamed from: g */
    public static final EnumC6455j f37766g = EnumC6455j.Ltr;

    /* renamed from: c */
    public g4.l0 f37767c;

    /* renamed from: d */
    public C1589q f37768d;

    @Override // p021w.AbstractC7848n
    /* renamed from: a */
    public final int[] mo14830a(int i10) {
        int iM6472e;
        if (m14832c().length() <= 0 || i10 >= m14832c().length()) {
            return null;
        }
        try {
            C1589q c1589q = this.f37768d;
            if (c1589q == null) {
                AbstractC4154l.m8928k("node");
                throw null;
            }
            C0848c c0848cM5211e = c1589q.m5211e();
            int iRound = Math.round(c0848cM5211e.f5357d - c0848cM5211e.f5355b);
            if (i10 <= 0) {
                i10 = 0;
            }
            g4.l0 l0Var = this.f37767c;
            if (l0Var == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            int iM6471d = l0Var.f13671b.m6471d(i10);
            g4.l0 l0Var2 = this.f37767c;
            if (l0Var2 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            float fM6473f = l0Var2.f13671b.m6473f(iM6471d) + iRound;
            g4.l0 l0Var3 = this.f37767c;
            if (l0Var3 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            if (l0Var3 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            if (fM6473f < l0Var3.f13671b.m6473f(r0.f13702f - 1)) {
                g4.l0 l0Var4 = this.f37767c;
                if (l0Var4 == null) {
                    AbstractC4154l.m8928k("layoutResult");
                    throw null;
                }
                iM6472e = l0Var4.f13671b.m6472e(fM6473f);
            } else {
                g4.l0 l0Var5 = this.f37767c;
                if (l0Var5 == null) {
                    AbstractC4154l.m8928k("layoutResult");
                    throw null;
                }
                iM6472e = l0Var5.f13671b.f13702f;
            }
            return m14831b(i10, m14901e(iM6472e - 1, f37766g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p021w.AbstractC7848n
    /* renamed from: d */
    public final int[] mo14833d(int i10) {
        int iM6472e;
        if (m14832c().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            C1589q c1589q = this.f37768d;
            if (c1589q == null) {
                AbstractC4154l.m8928k("node");
                throw null;
            }
            C0848c c0848cM5211e = c1589q.m5211e();
            int iRound = Math.round(c0848cM5211e.f5357d - c0848cM5211e.f5355b);
            int length = m14832c().length();
            if (length <= i10) {
                i10 = length;
            }
            g4.l0 l0Var = this.f37767c;
            if (l0Var == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            int iM6471d = l0Var.f13671b.m6471d(i10);
            g4.l0 l0Var2 = this.f37767c;
            if (l0Var2 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            float fM6473f = l0Var2.f13671b.m6473f(iM6471d) - iRound;
            if (fM6473f > DefinitionKt.NO_Float_VALUE) {
                g4.l0 l0Var3 = this.f37767c;
                if (l0Var3 == null) {
                    AbstractC4154l.m8928k("layoutResult");
                    throw null;
                }
                iM6472e = l0Var3.f13671b.m6472e(fM6473f);
            } else {
                iM6472e = 0;
            }
            if (i10 == m14832c().length() && iM6472e < iM6471d) {
                iM6472e++;
            }
            return m14831b(m14901e(iM6472e, f37765f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final int m14901e(int i10, EnumC6455j enumC6455j) {
        g4.l0 l0Var = this.f37767c;
        if (l0Var == null) {
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        int iM6449g = l0Var.m6449g(i10);
        g4.l0 l0Var2 = this.f37767c;
        if (l0Var2 == null) {
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        if (enumC6455j != l0Var2.m6450h(iM6449g)) {
            g4.l0 l0Var3 = this.f37767c;
            if (l0Var3 != null) {
                return l0Var3.m6449g(i10);
            }
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        if (this.f37767c != null) {
            return r6.f13671b.m6470c(i10, false) - 1;
        }
        AbstractC4154l.m8928k("layoutResult");
        throw null;
    }
}
