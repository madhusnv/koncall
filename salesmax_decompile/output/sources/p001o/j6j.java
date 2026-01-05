package p001o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j6j {

    /* renamed from: c */
    public static final Pattern f29867c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f29868d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final zwc f29869a = new zwc();

    /* renamed from: b */
    public final StringBuilder f29870b = new StringBuilder();

    /* renamed from: b */
    public static boolean m33304b(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        byte[] bArrM60024e = zwcVar.m60024e();
        if (iM60025f + 2 > iM60026g) {
            return false;
        }
        int i = iM60025f + 1;
        if (bArrM60024e[iM60025f] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArrM60024e[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM60026g) {
                zwcVar.m60018V(iM60026g - zwcVar.m60025f());
                return true;
            }
            if (((char) bArrM60024e[i2]) == '*' && ((char) bArrM60024e[i3]) == '/') {
                i2 = i3 + 1;
                iM60026g = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    public static boolean m33305c(zwc zwcVar) {
        char cM33312k = m33312k(zwcVar, zwcVar.m60025f());
        if (cM33312k != '\t' && cM33312k != '\n' && cM33312k != '\f' && cM33312k != '\r' && cM33312k != ' ') {
            return false;
        }
        zwcVar.m60018V(1);
        return true;
    }

    /* renamed from: e */
    public static void m33306e(String str, k6j k6jVar) {
        Matcher matcher = f29868d.matcher(kp0.m35995e(str));
        if (!matcher.matches()) {
            ria.m46824h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) op0.m42515e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                k6jVar.m35081t(3);
                break;
            case "em":
                k6jVar.m35081t(2);
                break;
            case "px":
                k6jVar.m35081t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        k6jVar.m35080s(Float.parseFloat((String) op0.m42515e(matcher.group(1))));
    }

    /* renamed from: f */
    public static String m33307f(zwc zwcVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        while (iM60025f < iM60026g && !z) {
            char c = (char) zwcVar.m60024e()[iM60025f];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iM60025f++;
                sb.append(c);
            }
        }
        zwcVar.m60018V(iM60025f - zwcVar.m60025f());
        return sb.toString();
    }

    /* renamed from: g */
    public static String m33308g(zwc zwcVar, StringBuilder sb) {
        m33315n(zwcVar);
        if (zwcVar.m60020a() == 0) {
            return null;
        }
        String strM33307f = m33307f(zwcVar, sb);
        if (!"".equals(strM33307f)) {
            return strM33307f;
        }
        return "" + ((char) zwcVar.m60004H());
    }

    /* renamed from: h */
    public static String m33309h(zwc zwcVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iM60025f = zwcVar.m60025f();
            String strM33308g = m33308g(zwcVar, sb);
            if (strM33308g == null) {
                return null;
            }
            if ("}".equals(strM33308g) || ";".equals(strM33308g)) {
                zwcVar.m60017U(iM60025f);
                z = true;
            } else {
                sb2.append(strM33308g);
            }
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m33310i(zwc zwcVar, StringBuilder sb) {
        m33315n(zwcVar);
        if (zwcVar.m60020a() < 5 || !"::cue".equals(zwcVar.m60001E(5))) {
            return null;
        }
        int iM60025f = zwcVar.m60025f();
        String strM33308g = m33308g(zwcVar, sb);
        if (strM33308g == null) {
            return null;
        }
        if ("{".equals(strM33308g)) {
            zwcVar.m60017U(iM60025f);
            return "";
        }
        String strM33313l = "(".equals(strM33308g) ? m33313l(zwcVar) : null;
        if (")".equals(m33308g(zwcVar, sb))) {
            return strM33313l;
        }
        return null;
    }

    /* renamed from: j */
    public static void m33311j(zwc zwcVar, k6j k6jVar, StringBuilder sb) {
        m33315n(zwcVar);
        String strM33307f = m33307f(zwcVar, sb);
        if (!"".equals(strM33307f) && ":".equals(m33308g(zwcVar, sb))) {
            m33315n(zwcVar);
            String strM33309h = m33309h(zwcVar, sb);
            if (strM33309h == null || "".equals(strM33309h)) {
                return;
            }
            int iM60025f = zwcVar.m60025f();
            String strM33308g = m33308g(zwcVar, sb);
            if (!";".equals(strM33308g)) {
                if (!"}".equals(strM33308g)) {
                    return;
                } else {
                    zwcVar.m60017U(iM60025f);
                }
            }
            if ("color".equals(strM33307f)) {
                k6jVar.m35078q(vh3.m52768b(strM33309h));
                return;
            }
            if ("background-color".equals(strM33307f)) {
                k6jVar.m35075n(vh3.m52768b(strM33309h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strM33307f)) {
                if ("over".equals(strM33309h)) {
                    k6jVar.m35083v(1);
                    return;
                } else {
                    if ("under".equals(strM33309h)) {
                        k6jVar.m35083v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strM33307f)) {
                if (!"all".equals(strM33309h) && !strM33309h.startsWith("digits")) {
                    z = false;
                }
                k6jVar.m35077p(z);
                return;
            }
            if ("text-decoration".equals(strM33307f)) {
                if ("underline".equals(strM33309h)) {
                    k6jVar.m35061A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strM33307f)) {
                k6jVar.m35079r(strM33309h);
                return;
            }
            if ("font-weight".equals(strM33307f)) {
                if ("bold".equals(strM33309h)) {
                    k6jVar.m35076o(true);
                }
            } else if ("font-style".equals(strM33307f)) {
                if ("italic".equals(strM33309h)) {
                    k6jVar.m35082u(true);
                }
            } else if ("font-size".equals(strM33307f)) {
                m33306e(strM33309h, k6jVar);
            }
        }
    }

    /* renamed from: k */
    public static char m33312k(zwc zwcVar, int i) {
        return (char) zwcVar.m60024e()[i];
    }

    /* renamed from: l */
    public static String m33313l(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        boolean z = false;
        while (iM60025f < iM60026g && !z) {
            int i = iM60025f + 1;
            z = ((char) zwcVar.m60024e()[iM60025f]) == ')';
            iM60025f = i;
        }
        return zwcVar.m60001E((iM60025f - 1) - zwcVar.m60025f()).trim();
    }

    /* renamed from: m */
    public static void m33314m(zwc zwcVar) {
        while (!TextUtils.isEmpty(zwcVar.m60038s())) {
        }
    }

    /* renamed from: n */
    public static void m33315n(zwc zwcVar) {
        while (true) {
            for (boolean z = true; zwcVar.m60020a() > 0 && z; z = false) {
                if (m33305c(zwcVar) || m33304b(zwcVar)) {
                    break;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m33316a(k6j k6jVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f29867c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                k6jVar.m35087z((String) op0.m42515e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrI1 = sqi.i1(str, "\\.");
        String str2 = strArrI1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            k6jVar.m35086y(str2.substring(0, iIndexOf2));
            k6jVar.m35085x(str2.substring(iIndexOf2 + 1));
        } else {
            k6jVar.m35086y(str2);
        }
        if (strArrI1.length > 1) {
            k6jVar.m35084w((String[]) sqi.T0(strArrI1, 1, strArrI1.length));
        }
    }

    /* renamed from: d */
    public List m33317d(zwc zwcVar) {
        this.f29870b.setLength(0);
        int iM60025f = zwcVar.m60025f();
        m33314m(zwcVar);
        this.f29869a.m60015S(zwcVar.m60024e(), zwcVar.m60025f());
        this.f29869a.m60017U(iM60025f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM33310i = m33310i(this.f29869a, this.f29870b);
            if (strM33310i == null) {
                return arrayList;
            }
            if (!"{".equals(m33308g(this.f29869a, this.f29870b))) {
                return arrayList;
            }
            k6j k6jVar = new k6j();
            m33316a(k6jVar, strM33310i);
            String str = null;
            boolean z = false;
            while (!z) {
                int iM60025f2 = this.f29869a.m60025f();
                String strM33308g = m33308g(this.f29869a, this.f29870b);
                boolean z2 = strM33308g == null || "}".equals(strM33308g);
                if (!z2) {
                    this.f29869a.m60017U(iM60025f2);
                    m33311j(this.f29869a, k6jVar, this.f29870b);
                }
                str = strM33308g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(k6jVar);
            }
        }
    }
}
