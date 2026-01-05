package p001o;

import p001o.rej;
import p001o.xej;

/* loaded from: classes3.dex */
public final class vej {

    /* renamed from: a */
    public final xej.C18134a f50251a;

    /* renamed from: b */
    public final rej f50252b;

    /* renamed from: c */
    public vej f50253c;

    /* renamed from: d */
    public boolean f50254d;

    public vej(xej.C18134a c18134a, rej rejVar) {
        sq8.m48649h(c18134a, "tag");
        sq8.m48649h(rejVar, "reader");
        this.f50251a = c18134a;
        this.f50252b = rejVar;
    }

    /* renamed from: a */
    public final void m52681a() {
        while (m52685e() != null) {
        }
    }

    /* renamed from: b */
    public final xej.C18134a m52682b() {
        return this.f50251a;
    }

    /* renamed from: c */
    public final String m52683c() {
        return this.f50251a.m56197b().toString();
    }

    /* renamed from: d */
    public final vej m52684d() {
        vej vejVar = this.f50253c;
        if (vejVar != null) {
            vejVar.m52681a();
        }
        xej xejVarM52685e = m52685e();
        while (xejVarM52685e != null && !(xejVarM52685e instanceof xej.C18134a)) {
            xejVarM52685e = m52685e();
        }
        xej.C18134a c18134a = xejVarM52685e instanceof xej.C18134a ? (xej.C18134a) xejVarM52685e : null;
        vej vejVarM54281c = c18134a != null ? wej.m54281c(c18134a, this.f50252b) : null;
        this.f50253c = vejVarM54281c;
        return vejVarM54281c;
    }

    /* renamed from: e */
    public final xej m52685e() {
        if (this.f50254d) {
            return null;
        }
        if (!yej.m57708a(rej.C16597a.m46629a(this.f50252b, 0, 1, null), this.f50251a)) {
            return this.f50252b.nextToken();
        }
        this.f50252b.nextToken();
        this.f50254d = true;
        return null;
    }
}
