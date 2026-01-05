package p001o;

import java.util.List;
import p001o.tn8;

/* loaded from: classes6.dex */
public final class cde implements tn8.InterfaceC17165a {

    /* renamed from: a */
    public final yce f17960a;

    /* renamed from: b */
    public final List f17961b;

    /* renamed from: c */
    public final int f17962c;

    /* renamed from: d */
    public final dl6 f17963d;

    /* renamed from: e */
    public final ule f17964e;

    /* renamed from: f */
    public final int f17965f;

    /* renamed from: g */
    public final int f17966g;

    /* renamed from: h */
    public final int f17967h;

    /* renamed from: i */
    public int f17968i;

    public cde(yce yceVar, List list, int i, dl6 dl6Var, ule uleVar, int i2, int i3, int i4) {
        sq8.m48649h(yceVar, "call");
        sq8.m48649h(list, "interceptors");
        sq8.m48649h(uleVar, "request");
        this.f17960a = yceVar;
        this.f17961b = list;
        this.f17962c = i;
        this.f17963d = dl6Var;
        this.f17964e = uleVar;
        this.f17965f = i2;
        this.f17966g = i3;
        this.f17967h = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ cde m20971d(cde cdeVar, int i, dl6 dl6Var, ule uleVar, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cdeVar.f17962c;
        }
        if ((i5 & 2) != 0) {
            dl6Var = cdeVar.f17963d;
        }
        dl6 dl6Var2 = dl6Var;
        if ((i5 & 4) != 0) {
            uleVar = cdeVar.f17964e;
        }
        ule uleVar2 = uleVar;
        if ((i5 & 8) != 0) {
            i2 = cdeVar.f17965f;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = cdeVar.f17966g;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = cdeVar.f17967h;
        }
        return cdeVar.m20974c(i, dl6Var2, uleVar2, i6, i7, i4);
    }

    @Override // p001o.tn8.InterfaceC17165a
    /* renamed from: a */
    public zqe mo20972a(ule uleVar) {
        sq8.m48649h(uleVar, "request");
        if (!(this.f17962c < this.f17961b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f17968i++;
        dl6 dl6Var = this.f17963d;
        if (dl6Var != null) {
            if (!dl6Var.m23395j().mo27016b().mo24816a(uleVar.m51741l())) {
                throw new IllegalStateException(("network interceptor " + this.f17961b.get(this.f17962c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f17968i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f17961b.get(this.f17962c - 1) + " must call proceed() exactly once").toString());
            }
        }
        cde cdeVarM20971d = m20971d(this, this.f17962c + 1, null, uleVar, 0, 0, 0, 58, null);
        tn8 tn8Var = (tn8) this.f17961b.get(this.f17962c);
        zqe zqeVarIntercept = tn8Var.intercept(cdeVarM20971d);
        if (zqeVarIntercept == null) {
            throw new NullPointerException("interceptor " + tn8Var + " returned null");
        }
        if (this.f17963d != null) {
            if (!(this.f17962c + 1 >= this.f17961b.size() || cdeVarM20971d.f17968i == 1)) {
                throw new IllegalStateException(("network interceptor " + tn8Var + " must call proceed() exactly once").toString());
            }
        }
        return zqeVarIntercept;
    }

    @Override // p001o.tn8.InterfaceC17165a
    /* renamed from: b */
    public xr3 mo20973b() {
        dl6 dl6Var = this.f17963d;
        if (dl6Var != null) {
            return dl6Var.m23393h();
        }
        return null;
    }

    /* renamed from: c */
    public final cde m20974c(int i, dl6 dl6Var, ule uleVar, int i2, int i3, int i4) {
        sq8.m48649h(uleVar, "request");
        return new cde(this.f17960a, this.f17961b, i, dl6Var, uleVar, i2, i3, i4);
    }

    @Override // p001o.tn8.InterfaceC17165a
    public bt1 call() {
        return this.f17960a;
    }

    /* renamed from: e */
    public final yce m20975e() {
        return this.f17960a;
    }

    /* renamed from: f */
    public final int m20976f() {
        return this.f17965f;
    }

    /* renamed from: g */
    public final dl6 m20977g() {
        return this.f17963d;
    }

    /* renamed from: h */
    public final int m20978h() {
        return this.f17966g;
    }

    /* renamed from: i */
    public final ule m20979i() {
        return this.f17964e;
    }

    /* renamed from: j */
    public final int m20980j() {
        return this.f17967h;
    }

    /* renamed from: k */
    public int m20981k() {
        return this.f17966g;
    }

    @Override // p001o.tn8.InterfaceC17165a
    public ule request() {
        return this.f17964e;
    }
}
