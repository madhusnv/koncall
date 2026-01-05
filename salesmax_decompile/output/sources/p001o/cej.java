package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p001o.tej;

/* loaded from: classes3.dex */
public final class cej implements gfa {

    /* renamed from: a */
    public final h7f f18015a;

    /* renamed from: b */
    public final tej f18016b;

    /* renamed from: c */
    public final oej f18017c;

    public cej(h7f h7fVar, tej tejVar, oej oejVar) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(tejVar, "xmlWriter");
        sq8.m48649h(oejVar, "xmlSerializer");
        this.f18015a = h7fVar;
        this.f18016b = tejVar;
        this.f18017c = oejVar;
    }

    /* renamed from: w */
    public static final y3i m21106w(Object obj, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        tejVar.text(obj.toString());
        return y3i.f54824a;
    }

    /* renamed from: x */
    public static final y3i m21107x(c8f c8fVar, cej cejVar, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        c8fVar.mo20495a(cejVar.f18017c);
        return y3i.f54824a;
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        m21112v(str);
    }

    @Override // p001o.zhd
    /* renamed from: e */
    public void mo21109e(final c8f c8fVar) {
        Object next;
        sq8.m48649h(c8fVar, "value");
        t2g.m49207c(this.f18017c.m42154u(), this.f18015a);
        Iterator it = this.f18015a.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((hu6) next).getClass() == sdj.class) {
                    break;
                }
            }
        }
        tq.m50332a(null);
        qej.m45350g(this.f18016b, m21111u(), null, new xk7() { // from class: o.bej
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return cej.m21107x(c8fVar, this, (tej) obj);
            }
        });
        t2g.m49205a(this.f18017c.m42154u());
    }

    @Override // p001o.gfa
    /* renamed from: f */
    public void mo21110f() {
        Set setM29948c = this.f18015a.m29948c();
        boolean z = false;
        if (!(setM29948c instanceof Collection) || !setM29948c.isEmpty()) {
            Iterator it = setM29948c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((hu6) it.next()) instanceof m27) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        tej.C17073a.m49796a(this.f18016b, xdj.m56099a(this.f18015a).m38864a(), null, 2, null);
    }

    /* renamed from: u */
    public final String m21111u() {
        boolean z;
        Object next;
        String strM46571b;
        Set setM29948c = this.f18015a.m29948c();
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
        if (z) {
            return xdj.m56099a(this.f18015a).m38864a();
        }
        Iterator it2 = this.f18015a.m29948c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((hu6) next).getClass() == rdj.class) {
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        rdj rdjVar = (rdj) (hu6Var instanceof rdj ? hu6Var : null);
        return (rdjVar == null || (strM46571b = rdjVar.m46571b()) == null) ? rdj.f43424b.m46572a().m46571b() : strM46571b;
    }

    /* renamed from: v */
    public final void m21112v(final Object obj) {
        Object next;
        Iterator it = this.f18015a.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((hu6) next).getClass() == sdj.class) {
                    break;
                }
            }
        }
        tq.m50332a(null);
        qej.m45350g(this.f18016b, m21111u(), null, new xk7() { // from class: o.aej
            @Override // p001o.xk7
            public final Object invoke(Object obj2) {
                return cej.m21106w(obj, (tej) obj2);
            }
        });
    }
}
