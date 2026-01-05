package ji;

import g4.C2501q;
import g4.k0;
import g4.l0;
import mb.AbstractC4701q;
import mb.C4698n;
import mb.C4699o;
import mb.C4700p;
import r4.EnumC6455j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.b */
/* loaded from: classes.dex */
public abstract class AbstractC3768b {
    /* renamed from: a */
    public static AbstractC4701q m8289a(String str) {
        return str.equals("COMPOSITE") ? C4698n.f23357b : str.equals("FULL_OBJECT") ? C4699o.f23367b : new C4700p(str);
    }

    /* renamed from: b */
    public static final EnumC6455j m8290b(l0 l0Var, int i10) {
        k0 k0Var = l0Var.f13670a;
        C2501q c2501q = l0Var.f13671b;
        if (k0Var.f13660a.f13620b.length() != 0) {
            int iM6471d = c2501q.m6471d(i10);
            if ((i10 != 0 && iM6471d == c2501q.m6471d(i10 - 1)) || (i10 != k0Var.f13660a.f13620b.length() && iM6471d == c2501q.m6471d(i10 + 1))) {
                return l0Var.m6443a(i10);
            }
        }
        return l0Var.m6450h(i10);
    }
}
