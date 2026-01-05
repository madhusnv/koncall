package p001o;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.apache.http.protocol.HTTP;
import p001o.ul1;

/* loaded from: classes6.dex */
public abstract class yeb {

    /* renamed from: a */
    public static int f55359a = 15;

    /* renamed from: b */
    public static final ul1 f55360b;

    /* renamed from: c */
    public static final ul1.C17390a f55361c;

    /* renamed from: d */
    public static final ul1.C17390a f55362d;

    /* renamed from: e */
    public static final ul1.C17390a f55363e;

    /* renamed from: f */
    public static final ul1.C17390a f55364f;

    /* renamed from: g */
    public static final ul1.C17390a f55365g;

    /* renamed from: h */
    public static final ul1.C17390a f55366h;

    /* renamed from: i */
    public static final ul1.C17390a f55367i;

    /* renamed from: j */
    public static final ul1.C17390a f55368j;

    /* renamed from: k */
    public static final ul1.C17390a f55369k;

    /* renamed from: l */
    public static final ul1.C17390a f55370l;

    /* renamed from: m */
    public static final ul1.C17390a f55371m;

    /* renamed from: n */
    public static final ul1.C17390a f55372n;

    /* renamed from: o */
    public static final ul1.C17390a f55373o;

    /* renamed from: p */
    public static final ul1.C17390a f55374p;

    /* renamed from: q */
    public static final Map f55375q;

    /* renamed from: r */
    public static final Map f55376r;

    static {
        ul1 ul1Var = new ul1();
        f55360b = ul1Var;
        f55361c = ul1Var.m51689a("application/x-www-form-urlencoded", 1);
        f55362d = ul1Var.m51689a("message/http", 2);
        f55363e = ul1Var.m51689a("multipart/byteranges", 3);
        f55364f = ul1Var.m51689a("text/html", 4);
        f55365g = ul1Var.m51689a(HTTP.PLAIN_TEXT_TYPE, 5);
        f55366h = ul1Var.m51689a("text/xml", 6);
        f55367i = new ul1.C17390a("text/html; charset=iso-8859-1", 7);
        f55368j = new ul1.C17390a("text/plain; charset=iso-8859-1", 8);
        f55369k = new ul1.C17390a("text/xml; charset=iso-8859-1", 9);
        f55370l = new ul1.C17390a("text/html; charset=utf-8", 10);
        f55371m = new ul1.C17390a("text/plain; charset=utf-8", 11);
        f55372n = new ul1.C17390a("text/xml; charset=utf-8", 12);
        f55373o = ul1Var.m51689a("text/json", 13);
        f55374p = ul1Var.m51689a("text/json;charset=UTF-8", 14);
        f55375q = new HashMap();
        f55376r = new HashMap();
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("org/mortbay/jetty/mime");
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String strNextElement = keys.nextElement();
                f55375q.put(s8g.m47995b(strNextElement), m57703b(bundle.getString(strNextElement)));
            }
        } catch (MissingResourceException e) {
            tia.m49928j(e.toString());
            tia.m49922d(e);
        }
        try {
            ResourceBundle bundle2 = ResourceBundle.getBundle("org/mortbay/jetty/encoding");
            Enumeration<String> keys2 = bundle2.getKeys();
            while (keys2.hasMoreElements()) {
                sl1 sl1VarM57703b = m57703b(keys2.nextElement());
                f55376r.put(sl1VarM57703b, bundle2.getString(sl1VarM57703b.toString()));
            }
        } catch (MissingResourceException e2) {
            tia.m49928j(e2.toString());
            tia.m49922d(e2);
        }
        ul1.C17390a c17390a = f55364f;
        ul1.C17390a c17390a2 = f55367i;
        c17390a.m51699k("ISO-8859-1", c17390a2);
        c17390a.m51699k("ISO_8859_1", c17390a2);
        c17390a.m51699k("iso-8859-1", c17390a2);
        ul1.C17390a c17390a3 = f55365g;
        ul1.C17390a c17390a4 = f55368j;
        c17390a3.m51699k("ISO-8859-1", c17390a4);
        c17390a3.m51699k("ISO_8859_1", c17390a4);
        c17390a3.m51699k("iso-8859-1", c17390a4);
        ul1.C17390a c17390a5 = f55366h;
        ul1.C17390a c17390a6 = f55369k;
        c17390a5.m51699k("ISO-8859-1", c17390a6);
        c17390a5.m51699k("ISO_8859_1", c17390a6);
        c17390a5.m51699k("iso-8859-1", c17390a6);
        ul1.C17390a c17390a7 = f55370l;
        c17390a.m51699k(HTTP.UTF_8, c17390a7);
        c17390a.m51699k("UTF8", c17390a7);
        c17390a.m51699k("utf8", c17390a7);
        c17390a.m51699k("utf-8", c17390a7);
        ul1.C17390a c17390a8 = f55371m;
        c17390a3.m51699k(HTTP.UTF_8, c17390a8);
        c17390a3.m51699k("UTF8", c17390a8);
        c17390a3.m51699k("utf-8", c17390a8);
        ul1.C17390a c17390a9 = f55372n;
        c17390a5.m51699k(HTTP.UTF_8, c17390a9);
        c17390a5.m51699k("utf8", c17390a9);
        c17390a5.m51699k("UTF8", c17390a9);
        c17390a5.m51699k("utf-8", c17390a9);
        ul1.C17390a c17390a10 = f55373o;
        ul1.C17390a c17390a11 = f55374p;
        c17390a10.m51699k(HTTP.UTF_8, c17390a11);
        c17390a10.m51699k("utf8", c17390a11);
        c17390a10.m51699k("UTF8", c17390a11);
        c17390a10.m51699k("utf-8", c17390a11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a6, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m57702a(sl1 sl1Var) {
        if (sl1Var instanceof ul1.C17390a) {
            switch (((ul1.C17390a) sl1Var).m51698j()) {
                case 7:
                case 8:
                case 9:
                    return s8g.f44982b;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    return HTTP.UTF_8;
            }
        }
        int iMo48451r = sl1Var.mo48451r();
        int iY2 = sl1Var.Y2();
        char c = 0;
        boolean z = false;
        int i = 0;
        while (iMo48451r < iY2) {
            byte bMo41185o = sl1Var.mo41185o(iMo48451r);
            if (!z || c == '\n') {
                switch (c) {
                    case 0:
                        if (34 != bMo41185o) {
                            if (59 != bMo41185o) {
                                break;
                            } else {
                                c = 1;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    case 1:
                        if (99 != bMo41185o) {
                            if (32 == bMo41185o) {
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        } else {
                            c = 2;
                            break;
                        }
                    case 2:
                        if (104 == bMo41185o) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3:
                        if (97 == bMo41185o) {
                            c = 4;
                            break;
                        }
                        break;
                    case 4:
                        if (114 == bMo41185o) {
                            c = 5;
                            break;
                        }
                        break;
                    case 5:
                        if (115 == bMo41185o) {
                            c = 6;
                            break;
                        }
                        break;
                    case 6:
                        if (101 == bMo41185o) {
                            c = 7;
                            break;
                        }
                        break;
                    case 7:
                        if (116 == bMo41185o) {
                            c = '\b';
                            break;
                        }
                        break;
                    case '\b':
                        if (61 != bMo41185o) {
                            if (32 == bMo41185o) {
                                break;
                            }
                        } else {
                            c = '\t';
                            break;
                        }
                        break;
                    case '\t':
                        if (32 == bMo41185o) {
                            break;
                        } else if (34 != bMo41185o) {
                            i = iMo48451r;
                            c = '\n';
                            break;
                        } else {
                            i = iMo48451r + 1;
                            c = '\n';
                            z = true;
                            break;
                        }
                    case '\n':
                        if ((!z && (59 == bMo41185o || 32 == bMo41185o)) || (z && 34 == bMo41185o)) {
                            return f55360b.m51696h(sl1Var.O1(i, iMo48451r - i)).toString();
                        }
                        break;
                }
            } else if (34 == bMo41185o) {
                z = false;
            }
            iMo48451r++;
        }
        if (c == '\n') {
            return f55360b.m51696h(sl1Var.O1(i, iMo48451r - i)).toString();
        }
        return null;
    }

    /* renamed from: b */
    public static synchronized sl1 m57703b(String str) {
        ul1.C17390a c17390aM51691c;
        ul1 ul1Var = f55360b;
        c17390aM51691c = ul1Var.m51691c(str);
        if (c17390aM51691c == null) {
            int i = f55359a;
            f55359a = i + 1;
            c17390aM51691c = ul1Var.m51689a(str, i);
        }
        return c17390aM51691c;
    }
}
