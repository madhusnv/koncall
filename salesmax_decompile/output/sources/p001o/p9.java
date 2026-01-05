package p001o;

import java.util.Arrays;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class p9 {

    /* renamed from: a */
    public r9[] f39633a;

    /* renamed from: b */
    public int f39634b;

    /* renamed from: c */
    public int f39635c;

    /* renamed from: d */
    public tag f39636d;

    /* renamed from: c */
    public final q4g m43195c() {
        tag tagVar;
        synchronized (this) {
            tagVar = this.f39636d;
            if (tagVar == null) {
                tagVar = new tag(this.f39634b);
                this.f39636d = tagVar;
            }
        }
        return tagVar;
    }

    /* renamed from: h */
    public final r9 m43196h() {
        r9 r9VarMo17501i;
        tag tagVar;
        synchronized (this) {
            r9[] r9VarArrMo17502j = this.f39633a;
            if (r9VarArrMo17502j == null) {
                r9VarArrMo17502j = mo17502j(2);
                this.f39633a = r9VarArrMo17502j;
            } else if (this.f39634b >= r9VarArrMo17502j.length) {
                Object[] objArrCopyOf = Arrays.copyOf(r9VarArrMo17502j, r9VarArrMo17502j.length * 2);
                sq8.m48648g(objArrCopyOf, "copyOf(...)");
                this.f39633a = (r9[]) objArrCopyOf;
                r9VarArrMo17502j = (r9[]) objArrCopyOf;
            }
            int i = this.f39635c;
            do {
                r9VarMo17501i = r9VarArrMo17502j[i];
                if (r9VarMo17501i == null) {
                    r9VarMo17501i = mo17501i();
                    r9VarArrMo17502j[i] = r9VarMo17501i;
                }
                i++;
                if (i >= r9VarArrMo17502j.length) {
                    i = 0;
                }
                sq8.m48647f(r9VarMo17501i, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!r9VarMo17501i.mo21435a(this));
            this.f39635c = i;
            this.f39634b++;
            tagVar = this.f39636d;
        }
        if (tagVar != null) {
            tagVar.m49661Z(1);
        }
        return r9VarMo17501i;
    }

    /* renamed from: i */
    public abstract r9 mo17501i();

    /* renamed from: j */
    public abstract r9[] mo17502j(int i);

    /* renamed from: k */
    public final void m43197k(r9 r9Var) {
        tag tagVar;
        int i;
        n64[] n64VarArrMo21436b;
        synchronized (this) {
            int i2 = this.f39634b - 1;
            this.f39634b = i2;
            tagVar = this.f39636d;
            if (i2 == 0) {
                this.f39635c = 0;
            }
            sq8.m48647f(r9Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            n64VarArrMo21436b = r9Var.mo21436b(this);
        }
        for (n64 n64Var : n64VarArrMo21436b) {
            if (n64Var != null) {
                vre.C17665a c17665a = vre.f50797b;
                n64Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
        if (tagVar != null) {
            tagVar.m49661Z(-1);
        }
    }

    /* renamed from: l */
    public final int m43198l() {
        return this.f39634b;
    }

    /* renamed from: m */
    public final r9[] m43199m() {
        return this.f39633a;
    }
}
