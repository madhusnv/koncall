package p001o;

import p001o.vg2;

/* loaded from: classes6.dex */
public class sr3 extends dm1 {

    /* renamed from: H */
    public final int f45823H;

    /* renamed from: L */
    public final wl1 f45824L;

    public sr3(int i, wl1 wl1Var, xk7 xk7Var) {
        super(i, xk7Var);
        this.f45823H = i;
        this.f45824L = wl1Var;
        if (!(wl1Var != wl1.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kge.m35689b(dm1.class).mo26337d() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ Object m1(sr3 sr3Var, Object obj, n64 n64Var) throws Throwable {
        f3i f3iVarM36949c;
        Object objO1 = sr3Var.o1(obj, true);
        if (!(objO1 instanceof vg2.C17574a)) {
            return y3i.f54824a;
        }
        vg2.m52739e(objO1);
        xk7 xk7Var = sr3Var.f20212b;
        if (xk7Var == null || (f3iVarM36949c = lcc.m36949c(xk7Var, obj, null, 2, null)) == null) {
            throw sr3Var.h0();
        }
        cl6.m21376a(f3iVarM36949c, sr3Var.h0());
        throw f3iVarM36949c;
    }

    @Override // p001o.dm1, p001o.fdf
    /* renamed from: g */
    public Object mo23472g(Object obj) {
        return o1(obj, false);
    }

    @Override // p001o.dm1, p001o.fdf
    /* renamed from: l */
    public Object mo23475l(Object obj, n64 n64Var) {
        return m1(this, obj, n64Var);
    }

    public final Object n1(Object obj, boolean z) {
        xk7 xk7Var;
        f3i f3iVarM36949c;
        Object objMo23472g = super.mo23472g(obj);
        if (vg2.m52743i(objMo23472g) || vg2.m52741g(objMo23472g)) {
            return objMo23472g;
        }
        if (!z || (xk7Var = this.f20212b) == null || (f3iVarM36949c = lcc.m36949c(xk7Var, obj, null, 2, null)) == null) {
            return vg2.f50294b.m52748c(y3i.f54824a);
        }
        throw f3iVarM36949c;
    }

    public final Object o1(Object obj, boolean z) {
        return this.f45824L == wl1.DROP_LATEST ? n1(obj, z) : c1(obj);
    }

    @Override // p001o.dm1
    public boolean v0() {
        return this.f45824L == wl1.DROP_OLDEST;
    }
}
