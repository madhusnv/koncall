package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Locale;
import p001o.l8i;

/* loaded from: classes2.dex */
public abstract class j81 {
    /* renamed from: b */
    public static final CharSequence m33396b(qse qseVar) {
        sq8.m48649h(qseVar, "it");
        String lowerCase = qseVar.name().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: c */
    public static final String m33397c(String str, String str2) {
        return kh3.p0(ch3.m21251p(str, str2), ".", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public static final Boolean m33398d(vq3 vq3Var, String str, String str2) {
        sq8.m48649h(vq3Var, "<this>");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        String strM53206c = vq3Var.m53206c(str, str2);
        if (strM53206c == null) {
            return null;
        }
        String lowerCase = strM53206c.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        Boolean boolY0 = f9g.Y0(lowerCase);
        if (boolY0 != null) {
            return Boolean.valueOf(boolY0.booleanValue());
        }
        throw new zq3("Failed to parse config property " + m33397c(str, str2) + " as a boolean");
    }

    /* renamed from: e */
    public static /* synthetic */ Boolean m33399e(vq3 vq3Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return m33398d(vq3Var, str, str2);
    }

    /* renamed from: f */
    public static final l8i m33400f(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return m33411q(vq3Var, "endpoint_url", null, 2, null);
    }

    /* renamed from: g */
    public static final Boolean m33401g(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return m33399e(vq3Var, "ignore_configured_endpoint_urls", null, 2, null);
    }

    /* renamed from: h */
    public static final Integer m33402h(vq3 vq3Var, String str, String str2) {
        sq8.m48649h(vq3Var, "<this>");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        String strM53206c = vq3Var.m53206c(str, str2);
        if (strM53206c == null) {
            return null;
        }
        Integer numM22638l = d9g.m22638l(strM53206c);
        if (numM22638l != null) {
            return Integer.valueOf(numM22638l.intValue());
        }
        throw new zq3("Failed to parse config property " + m33397c(str, str2) + " as an integer");
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m33403i(vq3 vq3Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return m33402h(vq3Var, str, str2);
    }

    /* renamed from: j */
    public static final Integer m33404j(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return m33403i(vq3Var, "max_attempts", null, 2, null);
    }

    /* renamed from: k */
    public static final String m33405k(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return vq3.m53203d(vq3Var, TransferTable.COLUMN_REGION, null, 2, null);
    }

    /* renamed from: l */
    public static final qse m33406l(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        qse qseVar = null;
        String strM53203d = vq3.m53203d(vq3Var, "retry_mode", null, 2, null);
        if (strM53203d != null) {
            qse[] qseVarArrValues = qse.values();
            int length = qseVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                qse qseVar2 = qseVarArrValues[i];
                if (e9g.m24606x(qseVar2.name(), strM53203d, true)) {
                    qseVar = qseVar2;
                    break;
                }
                i++;
            }
            if (qseVar == null) {
                throw new zq3("retry_mode " + strM53203d + " is not supported, should be one of: " + gp0.r0(qse.values(), ", ", null, null, 0, null, new xk7() { // from class: o.i81
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return j81.m33396b((qse) obj);
                    }
                }, 30, null));
            }
        }
        return qseVar;
    }

    /* renamed from: m */
    public static final String m33407m(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return vq3.m53203d(vq3Var, "sdk_ua_app_id", null, 2, null);
    }

    /* renamed from: n */
    public static final String m33408n(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return vq3.m53203d(vq3Var, "services", null, 2, null);
    }

    /* renamed from: o */
    public static final String m33409o(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return vq3.m53203d(vq3Var, "sigv4a_signing_region_set", null, 2, null);
    }

    /* renamed from: p */
    public static final l8i m33410p(vq3 vq3Var, String str, String str2) {
        sq8.m48649h(vq3Var, "<this>");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        String strM53206c = vq3Var.m53206c(str, str2);
        if (strM53206c == null) {
            return null;
        }
        try {
            return l8i.C15037b.m36787m(l8i.f33466k, strM53206c, null, 2, null);
        } catch (Exception e) {
            throw new zq3("Failed to parse config property " + m33397c(str, str2) + " as a URL", e);
        }
    }

    /* renamed from: q */
    public static /* synthetic */ l8i m33411q(vq3 vq3Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return m33410p(vq3Var, str, str2);
    }

    /* renamed from: r */
    public static final Boolean m33412r(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return m33399e(vq3Var, "use_dualstack_endpoint", null, 2, null);
    }

    /* renamed from: s */
    public static final Boolean m33413s(vq3 vq3Var) {
        sq8.m48649h(vq3Var, "<this>");
        return m33399e(vq3Var, "use_fips_endpoint", null, 2, null);
    }
}
