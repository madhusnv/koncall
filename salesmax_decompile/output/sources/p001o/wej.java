package p001o;

import p001o.vre;
import p001o.xej;

/* loaded from: classes3.dex */
public abstract class wej {
    /* renamed from: a */
    public static final String m54279a(vej vejVar) {
        sq8.m48649h(vejVar, "<this>");
        xej xejVarM52685e = vejVar.m52685e();
        if (xejVarM52685e instanceof xej.C18138e) {
            String strM56203b = ((xej.C18138e) xejVarM52685e).m56203b();
            return strM56203b == null ? "" : strM56203b;
        }
        if (xejVarM52685e == null || (xejVarM52685e instanceof xej.C18135b)) {
            return "";
        }
        throw new an5("expected XmlToken.Text element, found " + xejVarM52685e);
    }

    /* renamed from: b */
    public static final vej m54280b(rej rejVar) {
        boolean z;
        xej xejVarMo36943a = rejVar.mo36943a();
        do {
            z = xejVarMo36943a instanceof xej.C18134a;
            if (!z) {
                xejVarMo36943a = rejVar.nextToken();
            }
            if (xejVarMo36943a == null) {
                break;
            }
        } while (!z);
        xej.C18134a c18134a = (xej.C18134a) xejVarMo36943a;
        if (c18134a != null) {
            return m54281c(c18134a, rejVar);
        }
        throw new IllegalStateException(("expected start tag: last = " + rejVar.mo36943a()).toString());
    }

    /* renamed from: c */
    public static final vej m54281c(xej.C18134a c18134a, rej rejVar) {
        sq8.m48649h(c18134a, "<this>");
        sq8.m48649h(rejVar, "reader");
        xej xejVarMo36943a = rejVar.mo36943a();
        xej.C18134a c18134a2 = xejVarMo36943a instanceof xej.C18134a ? (xej.C18134a) xejVarMo36943a : null;
        if (c18134a2 == null) {
            throw new IllegalStateException(("expected start tag found " + rejVar.mo36943a()).toString());
        }
        if (sq8.m48644c(c18134a.m56197b(), c18134a2.m56197b())) {
            return new vej(c18134a, rejVar);
        }
        throw new IllegalStateException(("expected start tag " + c18134a.m56197b() + " but current reader state is on " + c18134a2.m56197b()).toString());
    }

    /* renamed from: d */
    public static final Object m54282d(vej vejVar) {
        sq8.m48649h(vejVar, "<this>");
        try {
            vre.C17665a c17665a = vre.f50797b;
            return vre.m53351b(m54279a(vejVar));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            return vre.m53351b(wre.m54933a(th));
        }
    }

    /* renamed from: e */
    public static final vej m54283e(byte[] bArr) {
        sq8.m48649h(bArr, "payload");
        return m54280b(sej.m48286a(bArr));
    }
}
