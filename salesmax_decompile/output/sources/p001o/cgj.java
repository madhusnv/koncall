package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.ule;

/* loaded from: classes6.dex */
public abstract class cgj {
    /* renamed from: a */
    public static final String m21223a(String str) {
        sq8.m48649h(str, ImagesContract.URL);
        if (e9g.m24595I(str, "ws:", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("http:");
            String strSubstring = str.substring(3);
            sq8.m48648g(strSubstring, "substring(...)");
            sb.append(strSubstring);
            return sb.toString();
        }
        if (!e9g.m24595I(str, "wss:", true)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https:");
        String strSubstring2 = str.substring(4);
        sq8.m48648g(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final ule.C17397a m21224b(ule.C17397a c17397a, String str, String str2) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        c17397a.m51752i().m55335a(str, str2);
        return c17397a;
    }

    /* renamed from: c */
    public static final ule.C17397a m21225c(ule.C17397a c17397a, xle xleVar) {
        sq8.m48649h(c17397a, "<this>");
        return c17397a.m51759p("DELETE", xleVar);
    }

    /* renamed from: d */
    public static final ule.C17397a m21226d(ule.C17397a c17397a) {
        sq8.m48649h(c17397a, "<this>");
        return c17397a.m51759p("GET", null);
    }

    /* renamed from: e */
    public static final ule.C17397a m21227e(ule.C17397a c17397a) {
        sq8.m48649h(c17397a, "<this>");
        return c17397a.m51759p("HEAD", null);
    }

    /* renamed from: f */
    public static final String m21228f(ule uleVar, String str) {
        sq8.m48649h(uleVar, "<this>");
        sq8.m48649h(str, "name");
        return uleVar.m51735f().m55327d(str);
    }

    /* renamed from: g */
    public static final ule.C17397a m21229g(ule.C17397a c17397a, String str, String str2) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        c17397a.m51752i().m55343i(str, str2);
        return c17397a;
    }

    /* renamed from: h */
    public static final ule.C17397a m21230h(ule.C17397a c17397a, wx7 wx7Var) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(wx7Var, "headers");
        c17397a.m51765v(wx7Var.m55331o());
        return c17397a;
    }

    /* renamed from: i */
    public static final ule.C17397a m21231i(ule.C17397a c17397a, String str, xle xleVar) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (xleVar == null) {
            if (!(true ^ q38.m44763d(str))) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!q38.m44762a(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        c17397a.m51766w(str);
        c17397a.m51764u(xleVar);
        return c17397a;
    }

    /* renamed from: j */
    public static final ule.C17397a m21232j(ule.C17397a c17397a, xle xleVar) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(xleVar, "body");
        return c17397a.m51759p("PATCH", xleVar);
    }

    /* renamed from: k */
    public static final ule.C17397a m21233k(ule.C17397a c17397a, xle xleVar) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(xleVar, "body");
        return c17397a.m51759p("POST", xleVar);
    }

    /* renamed from: l */
    public static final ule.C17397a m21234l(ule.C17397a c17397a, xle xleVar) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(xleVar, "body");
        return c17397a.m51759p("PUT", xleVar);
    }

    /* renamed from: m */
    public static final ule.C17397a m21235m(ule.C17397a c17397a, String str) {
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(str, "name");
        c17397a.m51752i().m55342h(str);
        return c17397a;
    }

    /* renamed from: n */
    public static final ule.C17397a m21236n(ule.C17397a c17397a, ob9 ob9Var, Object obj) {
        Map mapM18051d;
        sq8.m48649h(c17397a, "<this>");
        sq8.m48649h(ob9Var, "type");
        if (obj != null) {
            if (c17397a.m51754k().isEmpty()) {
                mapM18051d = new LinkedHashMap();
                c17397a.m51767x(mapM18051d);
            } else {
                Map mapM51754k = c17397a.m51754k();
                sq8.m48647f(mapM51754k, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapM18051d = azh.m18051d(mapM51754k);
            }
            mapM18051d.put(ob9Var, obj);
        } else if (!c17397a.m51754k().isEmpty()) {
            Map mapM51754k2 = c17397a.m51754k();
            sq8.m48647f(mapM51754k2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
            azh.m18051d(mapM51754k2).remove(ob9Var);
        }
        return c17397a;
    }

    /* renamed from: o */
    public static final String m21237o(ule uleVar) {
        sq8.m48649h(uleVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(uleVar.m51737h());
        sb.append(", url=");
        sb.append(uleVar.m51741l());
        if (uleVar.m51735f().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : uleVar.m51735f()) {
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                hwc hwcVar = (hwc) obj;
                String str = (String) hwcVar.m31227a();
                String str2 = (String) hwcVar.m31228b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (ggj.m28645y(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!uleVar.m51733d().isEmpty()) {
            sb.append(", tags=");
            sb.append(uleVar.m51733d());
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
