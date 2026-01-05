package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.tej;

/* loaded from: classes3.dex */
public final class oej implements tff, l9g {

    /* renamed from: a */
    public final tej f38264a;

    /* renamed from: b */
    public List f38265b;

    /* renamed from: c */
    public List f38266c;

    /* renamed from: o.oej$a */
    public /* synthetic */ class C15785a extends dm7 implements xk7 {
        public C15785a(Object obj) {
            super(1, obj, oej.class, "serializeBoolean", "serializeBoolean(Z)V", 0);
        }

        /* renamed from: b */
        public final void m42159b(boolean z) {
            ((oej) this.receiver).m42156w(z);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42159b(((Boolean) obj).booleanValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: o.oej$b */
    public /* synthetic */ class C15786b extends dm7 implements xk7 {
        public C15786b(Object obj) {
            super(1, obj, oej.class, "serializeString", "serializeString(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void m42160b(String str) {
            sq8.m48649h(str, "p0");
            ((oej) this.receiver).mo21108d(str);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42160b((String) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.oej$c */
    public /* synthetic */ class C15787c extends dm7 implements xk7 {
        public C15787c(Object obj) {
            super(1, obj, oej.class, "serializeNumber", "serializeNumber(Ljava/lang/Number;)V", 0);
        }

        /* renamed from: b */
        public final void m42161b(Number number) {
            sq8.m48649h(number, "p0");
            ((oej) this.receiver).m42157x(number);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42161b((Number) obj);
            return y3i.f54824a;
        }
    }

    public oej(tej tejVar) {
        sq8.m48649h(tejVar, "xmlWriter");
        this.f38264a = tejVar;
        this.f38265b = new ArrayList();
        this.f38266c = new ArrayList();
    }

    /* renamed from: z */
    public static final y3i m42153z(xk7 xk7Var, Object obj, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        xk7Var.invoke(obj);
        return y3i.f54824a;
    }

    @Override // p001o.tff
    /* renamed from: a */
    public byte[] mo41870a() {
        return this.f38264a.mo35893a();
    }

    @Override // p001o.l9g
    /* renamed from: b */
    public void mo26539b(h7f h7fVar, vv5 vv5Var) {
        sq8.m48649h(h7fVar, "descriptor");
        throw new hff("cannot serialize field " + xdj.m56099a(h7fVar) + "; Document type is not supported by xml encoding");
    }

    @Override // p001o.l9g
    /* renamed from: c */
    public void mo26540c(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        gfa gfaVarMo41873o = mo41873o(h7fVar);
        xk7Var.invoke(gfaVarMo41873o);
        gfaVarMo41873o.mo21110f();
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        this.f38264a.text(str);
    }

    @Override // p001o.l9g
    /* renamed from: g */
    public void mo26541g(h7f h7fVar, String str) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(str, "value");
        m42158y(h7fVar, str, new C15786b(this));
    }

    @Override // p001o.tff
    /* renamed from: h */
    public l9g mo41871h(h7f h7fVar) {
        Object next;
        sq8.m48649h(h7fVar, "descriptor");
        h7f h7fVar2 = (h7f) t2g.m49210f(this.f38266c);
        if (h7fVar2 != null) {
            h7fVar = h7fVar2;
        }
        boolean zIsEmpty = this.f38265b.isEmpty();
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hu6) next).getClass() == kej.class) {
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        if (!(hu6Var instanceof kej)) {
            hu6Var = null;
        }
        kej kejVar = (kej) hu6Var;
        if (kejVar != null && (zIsEmpty || kejVar.m16707a() != null)) {
            this.f38264a.mo35895c(kejVar.m16708b(), kejVar.m16707a());
        }
        String strM38864a = xdj.m56099a(h7fVar).m38864a();
        if (!qej.m45348e(h7fVar)) {
            tej.C17073a.m49797b(this.f38264a, strM38864a, null, 2, null);
        }
        t2g.m49207c(this.f38265b, strM38864a);
        return this;
    }

    @Override // p001o.l9g
    /* renamed from: i */
    public void mo26542i(h7f h7fVar, boolean z) {
        sq8.m48649h(h7fVar, "descriptor");
        m42158y(h7fVar, Boolean.valueOf(z), new C15785a(this));
    }

    @Override // p001o.l9g
    /* renamed from: j */
    public void mo26543j() {
        if (!(!this.f38265b.isEmpty())) {
            throw new IllegalStateException("Expected nodeStack to have a value, but was empty.".toString());
        }
        String str = (String) t2g.m49205a(this.f38265b);
        if (!(!this.f38266c.isEmpty()) || qej.m45348e((h7f) t2g.m49209e(this.f38266c))) {
            return;
        }
        tej.C17073a.m49796a(this.f38264a, str, null, 2, null);
    }

    @Override // p001o.tff
    /* renamed from: m */
    public yra mo41872m(h7f h7fVar) {
        boolean z;
        Object next;
        sq8.m48649h(h7fVar, "descriptor");
        Set setM29948c = h7fVar.m29948c();
        if ((setM29948c instanceof Collection) && setM29948c.isEmpty()) {
            z = false;
        } else {
            Iterator it = setM29948c.iterator();
            while (it.hasNext()) {
                if (((hu6) it.next()) instanceof m27) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            Iterator it2 = h7fVar.m29948c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((hu6) next).getClass() == kej.class) {
                    break;
                }
            }
            hu6 hu6Var = (hu6) next;
            qej.m45349f(this.f38264a, xdj.m56099a(h7fVar).m38864a(), (kej) (hu6Var instanceof kej ? hu6Var : null));
        }
        return new jej(h7fVar, this.f38264a, this, false, 8, null);
    }

    @Override // p001o.l9g
    /* renamed from: n */
    public void mo26544n(h7f h7fVar, c8f c8fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(c8fVar, "value");
        t2g.m49207c(this.f38266c, h7fVar);
        c8fVar.mo20495a(this);
        t2g.m49205a(this.f38266c);
    }

    @Override // p001o.tff
    /* renamed from: o */
    public gfa mo41873o(h7f h7fVar) {
        boolean z;
        Object next;
        sq8.m48649h(h7fVar, "descriptor");
        Set setM29948c = h7fVar.m29948c();
        if ((setM29948c instanceof Collection) && setM29948c.isEmpty()) {
            z = false;
        } else {
            Iterator it = setM29948c.iterator();
            while (it.hasNext()) {
                if (((hu6) it.next()) instanceof m27) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            Iterator it2 = h7fVar.m29948c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((hu6) next).getClass() == kej.class) {
                    break;
                }
            }
            hu6 hu6Var = (hu6) next;
            qej.m45349f(this.f38264a, xdj.m56099a(h7fVar).m38864a(), (kej) (hu6Var instanceof kej ? hu6Var : null));
        }
        return new cej(h7fVar, this.f38264a, this);
    }

    @Override // p001o.l9g
    /* renamed from: p */
    public void mo26545p(h7f h7fVar, float f) {
        sq8.m48649h(h7fVar, "descriptor");
        m42155v(h7fVar, Float.valueOf(f));
    }

    @Override // p001o.l9g
    /* renamed from: q */
    public void mo26546q(h7f h7fVar, int i) {
        sq8.m48649h(h7fVar, "descriptor");
        m42155v(h7fVar, Integer.valueOf(i));
    }

    @Override // p001o.l9g
    /* renamed from: r */
    public void mo26547r(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        yra yraVarMo41872m = mo41872m(h7fVar);
        xk7Var.invoke(yraVarMo41872m);
        yraVarMo41872m.mo33676l();
    }

    /* renamed from: u */
    public final List m42154u() {
        return this.f38266c;
    }

    /* renamed from: v */
    public final void m42155v(h7f h7fVar, Number number) {
        m42158y(h7fVar, number, new C15787c(this));
    }

    /* renamed from: w */
    public void m42156w(boolean z) {
        this.f38264a.text(String.valueOf(z));
    }

    /* renamed from: x */
    public final void m42157x(Number number) {
        uej.m51500a(this.f38264a, number);
    }

    /* renamed from: y */
    public final void m42158y(h7f h7fVar, final Object obj, final xk7 xk7Var) {
        Object next;
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((hu6) next).getClass() == kej.class) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        kej kejVar = (kej) (hu6Var instanceof kej ? hu6Var : null);
        Set<hu6> setM29948c = h7fVar.m29948c();
        if (!(setM29948c instanceof Collection) || !setM29948c.isEmpty()) {
            for (hu6 hu6Var2 : setM29948c) {
            }
        }
        qej.m45350g(this.f38264a, xdj.m56099a(h7fVar).m38864a(), kejVar, new xk7() { // from class: o.nej
            @Override // p001o.xk7
            public final Object invoke(Object obj2) {
                return oej.m42153z(xk7Var, obj, (tej) obj2);
            }
        });
    }

    public /* synthetic */ oej(tej tejVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? uej.m51502c(false, 1, null) : tejVar);
    }
}
