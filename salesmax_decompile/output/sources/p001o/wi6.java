package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.http.message.TokenParser;
import p001o.l8i;
import p001o.u2e;

/* loaded from: classes3.dex */
public abstract class wi6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final g0c m54569d(String str) {
        List listC0 = f9g.C0(str, new char[]{':'}, false, 2, 2, null);
        int size = listC0.size();
        int i = 2;
        if (size == 1) {
            return new g0c((String) listC0.get(0), null, i, 0 == true ? 1 : 0);
        }
        if (size == 2) {
            return new g0c((String) listC0.get(0), Integer.valueOf(Integer.parseInt((String) listC0.get(1))));
        }
        throw new IllegalStateException(("invalid non proxy host: " + str).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Set m54570e(f9d f9dVar) {
        Set setM40664e;
        List listC0;
        String strMo26796e = f9dVar.mo26796e("http.nonProxyHosts");
        if (strMo26796e == null) {
            strMo26796e = f9dVar.mo26796e("http.noProxyHosts");
        }
        String str = strMo26796e;
        if (str == null || (listC0 = f9g.C0(str, new char[]{'|'}, false, 0, 6, null)) == null) {
            setM40664e = nif.m40664e();
        } else {
            ArrayList arrayList = new ArrayList(dh3.m23088v(listC0, 10));
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add(f9g.Z0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f9g.c1((String) it2.next(), '.'));
            }
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(m54569d((String) it3.next()));
            }
            setM40664e = kh3.V0(arrayList3);
            if (setM40664e == null) {
            }
        }
        List listM21249n = ch3.m21249n("no_proxy", "NO_PROXY");
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listM21249n.iterator();
        while (it4.hasNext()) {
            String strMo26798i = f9dVar.mo26798i((String) it4.next());
            if (strMo26798i != null) {
                arrayList4.add(strMo26798i);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            hh3.m30441A(arrayList5, f9g.C0((String) it5.next(), new char[]{',', TokenParser.SP}, false, 0, 6, null));
        }
        ArrayList arrayList6 = new ArrayList(dh3.m23088v(arrayList5, 10));
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList6.add(f9g.Z0((String) it6.next()).toString());
        }
        ArrayList arrayList7 = new ArrayList(dh3.m23088v(arrayList6, 10));
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            arrayList7.add(f9g.c1((String) it7.next(), '.'));
        }
        ArrayList arrayList8 = new ArrayList(dh3.m23088v(arrayList7, 10));
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            arrayList8.add(m54569d((String) it8.next()));
        }
        return oif.m42272l(setM40664e, kh3.V0(arrayList8));
    }

    /* renamed from: f */
    public static final u2e m54571f(ri6 ri6Var, a6f a6fVar) {
        u2e.C17286b c17286b;
        StringBuilder sb = new StringBuilder();
        String strM16522e = a6fVar.m16522e();
        Locale locale = Locale.ROOT;
        String lowerCase = strM16522e.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        sb.append("_proxy");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String upperCase = a6fVar.m16522e().toUpperCase(locale);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        sb2.append(upperCase);
        sb2.append("_PROXY");
        Iterator it = ch3.m21249n(string, sb2.toString()).iterator();
        do {
            c17286b = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String strMo26798i = ri6Var.mo26798i(str);
            if (strMo26798i == null || f9g.d0(strMo26798i)) {
                strMo26798i = null;
            }
            if (strMo26798i != null) {
                try {
                    c17286b = new u2e.C17286b(l8i.C15037b.m36787m(l8i.f33466k, strMo26798i, null, 2, null));
                } catch (Exception e) {
                    throw new xa3("Could not parse " + (str + "=\"" + strMo26798i + TokenParser.DQUOTE) + " into a valid proxy URL", e);
                }
            }
        } while (c17286b == null);
        return c17286b;
    }

    /* renamed from: g */
    public static final u2e m54572g(srd srdVar, a6f a6fVar) {
        String str = a6fVar.m16522e() + ".proxyHost";
        String str2 = a6fVar.m16522e() + ".proxyPort";
        String strMo26796e = srdVar.mo26796e(str);
        if (strMo26796e == null || f9g.d0(strMo26796e)) {
            strMo26796e = null;
        }
        String strMo26796e2 = srdVar.mo26796e(str2);
        if (strMo26796e2 == null || f9g.d0(strMo26796e2)) {
            strMo26796e2 = null;
        }
        if (strMo26796e == null) {
            return null;
        }
        a6f a6fVarM16524b = a6f.f14208c.m16524b();
        try {
            l8i.C15037b c15037b = l8i.f33466k;
            l8i.C15036a c15036a = new l8i.C15036a();
            c15036a.m36775p(a6fVarM16524b);
            c15036a.m36773n(y08.f54673a.m57086a(strMo26796e));
            if (strMo26796e2 != null) {
                c15036a.m36774o(Integer.valueOf(Integer.parseInt(strMo26796e2)));
            }
            return new u2e.C17286b(c15036a.m36761b());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str + "=\"" + strMo26796e + TokenParser.DQUOTE);
            if (strMo26796e2 != null) {
                sb.append(", " + str2 + "=\"" + strMo26796e2 + TokenParser.DQUOTE);
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            throw new xa3("Could not parse " + string + " into a valid proxy URL", e);
        }
    }
}
