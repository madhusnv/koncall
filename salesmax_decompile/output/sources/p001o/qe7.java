package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p001o.u6f;

/* loaded from: classes3.dex */
public final class qe7 implements gfa {

    /* renamed from: a */
    public final h7f f41776a;

    /* renamed from: b */
    public final t6f f41777b;

    /* renamed from: c */
    public final long f41778c;

    /* renamed from: d */
    public int f41779d;

    public qe7(ye7 ye7Var, h7f h7fVar) {
        sq8.m48649h(ye7Var, "parent");
        sq8.m48649h(h7fVar, "descriptor");
        this.f41776a = h7fVar;
        t6f t6fVarM57685v = ye7Var.m57685v();
        this.f41777b = t6fVarM57685v;
        this.f41778c = t6fVarM57685v.m49489c();
    }

    /* renamed from: u */
    public static final y3i m45269u(String str, t6f t6fVar) {
        sq8.m48649h(t6fVar, "$this$writePrefixed");
        u6f.C17307a.m51045b(t6fVar, ze7.m59342i(str), 0, 0, 6, null);
        return y3i.f54824a;
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(final String str) {
        sq8.m48649h(str, "value");
        m45271v(new xk7() { // from class: o.pe7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return qe7.m45269u(str, (t6f) obj);
            }
        });
    }

    @Override // p001o.zhd
    /* renamed from: e */
    public void mo21109e(c8f c8fVar) {
        sq8.m48649h(c8fVar, "value");
        this.f41779d++;
        c8fVar.mo20495a(new ye7(this.f41777b, m45270t() + '.'));
    }

    @Override // p001o.gfa
    /* renamed from: f */
    public void mo21110f() {
        if (this.f41777b.m49489c() == this.f41778c) {
            if (this.f41777b.m49489c() > 0) {
                u6f.C17307a.m51045b(this.f41777b, "&", 0, 0, 6, null);
            }
            u6f.C17307a.m51045b(this.f41777b, ze7.m59343j(this.f41776a), 0, 0, 6, null);
            u6f.C17307a.m51045b(this.f41777b, "=", 0, 0, 6, null);
        }
    }

    /* renamed from: t */
    public final String m45270t() {
        Object next;
        Set<hu6> setM29948c = this.f41776a.m29948c();
        if (!(setM29948c instanceof Collection) || !setM29948c.isEmpty()) {
            for (hu6 hu6Var : setM29948c) {
            }
        }
        Iterator it = this.f41776a.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hu6) next).getClass() == oe7.class) {
                break;
            }
        }
        hu6 hu6Var2 = (hu6) next;
        oe7 oe7VarM42118a = (oe7) (hu6Var2 instanceof oe7 ? hu6Var2 : null);
        if (oe7VarM42118a == null) {
            oe7VarM42118a = oe7.f38213b.m42118a();
        }
        return ze7.m59343j(this.f41776a) + '.' + oe7VarM42118a.m42117b() + '.' + this.f41779d;
    }

    /* renamed from: v */
    public final void m45271v(xk7 xk7Var) {
        this.f41779d++;
        if (this.f41777b.m49489c() > 0) {
            u6f.C17307a.m51045b(this.f41777b, "&", 0, 0, 6, null);
        }
        u6f.C17307a.m51045b(this.f41777b, m45270t(), 0, 0, 6, null);
        u6f.C17307a.m51045b(this.f41777b, "=", 0, 0, 6, null);
        xk7Var.invoke(this.f41777b);
    }
}
