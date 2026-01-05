package w3;

import kotlin.jvm.internal.AbstractC4154l;
import p021w.AbstractC7848n;
import r4.EnumC6455j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.c */
/* loaded from: classes.dex */
public final class C7885c extends AbstractC7848n {

    /* renamed from: d */
    public static C7885c f37748d;

    /* renamed from: e */
    public static final EnumC6455j f37749e = EnumC6455j.Rtl;

    /* renamed from: f */
    public static final EnumC6455j f37750f = EnumC6455j.Ltr;

    /* renamed from: c */
    public g4.l0 f37751c;

    @Override // p021w.AbstractC7848n
    /* renamed from: a */
    public final int[] mo14830a(int i10) {
        int iM6471d;
        if (m14832c().length() <= 0 || i10 >= m14832c().length()) {
            return null;
        }
        EnumC6455j enumC6455j = f37749e;
        if (i10 < 0) {
            g4.l0 l0Var = this.f37751c;
            if (l0Var == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            iM6471d = l0Var.f13671b.m6471d(0);
        } else {
            g4.l0 l0Var2 = this.f37751c;
            if (l0Var2 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            int iM6471d2 = l0Var2.f13671b.m6471d(i10);
            iM6471d = m14899e(iM6471d2, enumC6455j) == i10 ? iM6471d2 : iM6471d2 + 1;
        }
        g4.l0 l0Var3 = this.f37751c;
        if (l0Var3 == null) {
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        if (iM6471d >= l0Var3.f13671b.f13702f) {
            return null;
        }
        return m14831b(m14899e(iM6471d, enumC6455j), m14899e(iM6471d, f37750f) + 1);
    }

    @Override // p021w.AbstractC7848n
    /* renamed from: d */
    public final int[] mo14833d(int i10) {
        int iM6471d;
        if (m14832c().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = m14832c().length();
        EnumC6455j enumC6455j = f37750f;
        if (i10 > length) {
            g4.l0 l0Var = this.f37751c;
            if (l0Var == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            iM6471d = l0Var.f13671b.m6471d(m14832c().length());
        } else {
            g4.l0 l0Var2 = this.f37751c;
            if (l0Var2 == null) {
                AbstractC4154l.m8928k("layoutResult");
                throw null;
            }
            int iM6471d2 = l0Var2.f13671b.m6471d(i10);
            iM6471d = m14899e(iM6471d2, enumC6455j) + 1 == i10 ? iM6471d2 : iM6471d2 - 1;
        }
        if (iM6471d < 0) {
            return null;
        }
        return m14831b(m14899e(iM6471d, f37749e), m14899e(iM6471d, enumC6455j) + 1);
    }

    /* renamed from: e */
    public final int m14899e(int i10, EnumC6455j enumC6455j) {
        g4.l0 l0Var = this.f37751c;
        if (l0Var == null) {
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        int iM6449g = l0Var.m6449g(i10);
        g4.l0 l0Var2 = this.f37751c;
        if (l0Var2 == null) {
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        if (enumC6455j != l0Var2.m6450h(iM6449g)) {
            g4.l0 l0Var3 = this.f37751c;
            if (l0Var3 != null) {
                return l0Var3.m6449g(i10);
            }
            AbstractC4154l.m8928k("layoutResult");
            throw null;
        }
        if (this.f37751c != null) {
            return r6.f13671b.m6470c(i10, false) - 1;
        }
        AbstractC4154l.m8928k("layoutResult");
        throw null;
    }
}
