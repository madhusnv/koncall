package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p001o.tej;

/* loaded from: classes3.dex */
public final class jej implements yra {

    /* renamed from: a */
    public final h7f f30301a;

    /* renamed from: b */
    public final tej f30302b;

    /* renamed from: c */
    public final oej f30303c;

    /* renamed from: d */
    public final boolean f30304d;

    public jej(h7f h7fVar, tej tejVar, oej oejVar, boolean z) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(tejVar, "xmlWriter");
        sq8.m48649h(oejVar, "xmlSerializer");
        this.f30301a = h7fVar;
        this.f30302b = tejVar;
        this.f30303c = oejVar;
        this.f30304d = z;
    }

    /* renamed from: A */
    public static final y3i m33667A(uk7 uk7Var, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        uk7Var.invoke();
        return y3i.f54824a;
    }

    /* renamed from: w */
    public static final y3i m33672w(jej jejVar, String str) {
        tej tejVar = jejVar.f30302b;
        if (str == null) {
            str = "";
        }
        tejVar.text(str);
        return y3i.f54824a;
    }

    /* renamed from: y */
    public static final y3i m33673y(eej eejVar, dej dejVar, sdj sdjVar, final String str, final uk7 uk7Var, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        qej.m45350g(tejVar, eejVar.m24885c(), dejVar, new xk7() { // from class: o.hej
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return jej.m33674z(str, (tej) obj);
            }
        });
        qej.m45350g(tejVar, eejVar.m24886d(), sdjVar, new xk7() { // from class: o.iej
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return jej.m33667A(uk7Var, (tej) obj);
            }
        });
        return y3i.f54824a;
    }

    /* renamed from: z */
    public static final y3i m33674z(String str, tej tejVar) {
        sq8.m48649h(tejVar, "$this$writeTag");
        tejVar.text(str);
        return y3i.f54824a;
    }

    @Override // p001o.yra
    /* renamed from: k */
    public void mo33675k(String str, final String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        m33677x(str, new uk7() { // from class: o.fej
            @Override // p001o.uk7
            public final Object invoke() {
                return jej.m33672w(this.f23198a, str2);
            }
        });
    }

    @Override // p001o.yra
    /* renamed from: l */
    public void mo33676l() {
        Set setM29948c = this.f30301a.m29948c();
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
        if (z || this.f30304d) {
            return;
        }
        tej.C17073a.m49796a(this.f30302b, xdj.m56099a(this.f30301a).m38864a(), null, 2, null);
    }

    /* renamed from: x */
    public final void m33677x(final String str, final uk7 uk7Var) {
        Object next;
        boolean z;
        String strM24884b;
        Object next2;
        Object next3;
        Iterator it = this.f30301a.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((hu6) next).getClass() == eej.class) {
                    break;
                }
            }
        }
        hu6 hu6Var = (hu6) next;
        if (!(hu6Var instanceof eej)) {
            hu6Var = null;
        }
        eej eejVarM24887a = (eej) hu6Var;
        if (eejVarM24887a == null) {
            eejVarM24887a = eej.f21507d.m24887a();
        }
        final eej eejVar = eejVarM24887a;
        Set setM29948c = this.f30301a.m29948c();
        if ((setM29948c instanceof Collection) && setM29948c.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = setM29948c.iterator();
            while (it2.hasNext()) {
                if (((hu6) it2.next()) instanceof m27) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            strM24884b = xdj.m56099a(this.f30301a).m38864a();
        } else {
            strM24884b = eejVar.m24884b();
            if (strM24884b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        Iterator it3 = this.f30301a.m29948c().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (((hu6) next2).getClass() == dej.class) {
                    break;
                }
            }
        }
        final dej dejVar = null;
        tq.m50332a(null);
        Iterator it4 = this.f30301a.m29948c().iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it4.next();
                if (((hu6) next3).getClass() == sdj.class) {
                    break;
                }
            }
        }
        final sdj sdjVar = null;
        tq.m50332a(null);
        qej.m45351h(this.f30302b, strM24884b, null, new xk7(dejVar, sdjVar, str, uk7Var) { // from class: o.gej

            /* renamed from: b */
            public final /* synthetic */ String f25053b;

            /* renamed from: c */
            public final /* synthetic */ uk7 f25054c;

            {
                this.f25053b = str;
                this.f25054c = uk7Var;
            }

            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return jej.m33673y(this.f25052a, null, null, this.f25053b, this.f25054c, (tej) obj);
            }
        }, 2, null);
    }

    public /* synthetic */ jej(h7f h7fVar, tej tejVar, oej oejVar, boolean z, int i, id5 id5Var) {
        this(h7fVar, tejVar, oejVar, (i & 8) != 0 ? false : z);
    }
}
