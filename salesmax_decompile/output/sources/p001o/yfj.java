package p001o;

import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class yfj {

    /* renamed from: a */
    public static final mge f55474a = new mge("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    public static final mge f55475b = new mge(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public static final boolean m57764a(y9b y9bVar, Object obj) {
        sq8.m48649h(y9bVar, "<this>");
        return (obj instanceof y9b) && sq8.m48644c(((y9b) obj).m57399d(), y9bVar.m57399d());
    }

    /* renamed from: b */
    public static final int m57765b(y9b y9bVar) {
        sq8.m48649h(y9bVar, "<this>");
        return y9bVar.m57399d().hashCode();
    }

    /* renamed from: c */
    public static final String m57766c(y9b y9bVar, String str) {
        sq8.m48649h(y9bVar, "<this>");
        sq8.m48649h(str, "name");
        int i = 0;
        int iM21478c = cnd.m21478c(0, y9bVar.m57400e().length - 1, 2);
        if (iM21478c < 0) {
            return null;
        }
        while (!e9g.m24606x(y9bVar.m57400e()[i], str, true)) {
            if (i == iM21478c) {
                return null;
            }
            i += 2;
        }
        return y9bVar.m57400e()[i + 1];
    }

    /* renamed from: d */
    public static final y9b m57767d(String str) {
        sq8.m48649h(str, "<this>");
        jta jtaVarM28646z = ggj.m28646z(f55474a, str, 0);
        if (jtaVarM28646z == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + TokenParser.DQUOTE);
        }
        String str2 = (String) jtaVarM28646z.mo34493b().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) jtaVarM28646z.mo34493b().get(2)).toLowerCase(locale);
        sq8.m48648g(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int iM32261j = jtaVarM28646z.getRange().m32261j();
        while (true) {
            int i = iM32261j + 1;
            if (i >= str.length()) {
                return new y9b(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            jta jtaVarM28646z2 = ggj.m28646z(f55475b, str, i);
            if (!(jtaVarM28646z2 != null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i);
                sq8.m48648g(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append(TokenParser.DQUOTE);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            hta htaVar = jtaVarM28646z2.mo34494c().get(1);
            String strM31119a = htaVar != null ? htaVar.m31119a() : null;
            if (strM31119a == null) {
                iM32261j = jtaVarM28646z2.getRange().m32261j();
            } else {
                hta htaVar2 = jtaVarM28646z2.mo34494c().get(2);
                String strM31119a2 = htaVar2 != null ? htaVar2.m31119a() : null;
                if (strM31119a2 == null) {
                    hta htaVar3 = jtaVarM28646z2.mo34494c().get(3);
                    sq8.m48646e(htaVar3);
                    strM31119a2 = htaVar3.m31119a();
                } else if (e9g.m24597K(strM31119a2, "'", false, 2, null) && e9g.m24605w(strM31119a2, "'", false, 2, null) && strM31119a2.length() > 2) {
                    strM31119a2 = strM31119a2.substring(1, strM31119a2.length() - 1);
                    sq8.m48648g(strM31119a2, "substring(...)");
                }
                arrayList.add(strM31119a);
                arrayList.add(strM31119a2);
                iM32261j = jtaVarM28646z2.getRange().m32261j();
            }
        }
    }

    /* renamed from: e */
    public static final y9b m57768e(String str) {
        sq8.m48649h(str, "<this>");
        try {
            return m57767d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static final String m57769f(y9b y9bVar) {
        sq8.m48649h(y9bVar, "<this>");
        return y9bVar.m57399d();
    }
}
