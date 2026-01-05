package ug;

import android.os.Bundle;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b */
    public static final AtomicReference f35761b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f35762c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f35763d = new AtomicReference();

    /* renamed from: a */
    public final g1 f35764a;

    public q0(g1 g1Var) {
        this.f35764a = g1Var;
    }

    /* renamed from: g */
    public static final String m14112g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC6840z.m13036g(atomicReference);
        AbstractC6840z.m13031b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m14113a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35764a.m13918C() ? str : m14112g(str, z1.f36027c, z1.f36025a, f35761b);
    }

    /* renamed from: b */
    public final String m14114b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35764a.m13918C() ? str : m14112g(str, z1.f36030f, z1.f36029e, f35762c);
    }

    /* renamed from: c */
    public final String m14115c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35764a.m13918C() ? str : str.startsWith("_exp_") ? AbstractC5601a.m11238i("experiment_id(", str, ")") : m14112g(str, z1.f36034j, z1.f36033i, f35763d);
    }

    /* renamed from: d */
    public final String m14116d(C7449t c7449t) {
        g1 g1Var = this.f35764a;
        if (!g1Var.m13918C()) {
            return c7449t.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(c7449t.f35829c);
        sb2.append(",name=");
        sb2.append(m14113a(c7449t.f35827a));
        sb2.append(",params=");
        C7448s c7448s = c7449t.f35828b;
        sb2.append(c7448s == null ? null : !g1Var.m13918C() ? c7448s.f35811a.toString() : m14117e(c7448s.m14134g()));
        return sb2.toString();
    }

    /* renamed from: e */
    public final String m14117e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f35764a.m13918C()) {
            return bundle.toString();
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM4568o.length() != 8) {
                sbM4568o.append(", ");
            }
            sbM4568o.append(m14114b(str));
            sbM4568o.append("=");
            Object obj = bundle.get(str);
            sbM4568o.append(obj instanceof Bundle ? m14118f(new Object[]{obj}) : obj instanceof Object[] ? m14118f((Object[]) obj) : obj instanceof ArrayList ? m14118f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbM4568o.append("}]");
        return sbM4568o.toString();
    }

    /* renamed from: f */
    public final String m14118f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("[");
        for (Object obj : objArr) {
            String strM14117e = obj instanceof Bundle ? m14117e((Bundle) obj) : String.valueOf(obj);
            if (strM14117e != null) {
                if (sbM4568o.length() != 1) {
                    sbM4568o.append(", ");
                }
                sbM4568o.append(strM14117e);
            }
        }
        sbM4568o.append("]");
        return sbM4568o.toString();
    }
}
