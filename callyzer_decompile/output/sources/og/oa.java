package og;

import a2.AbstractC0030c;
import android.os.Build;
import android.os.Trace;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import ca.C0930b;
import ca.C0931c;
import ca.C0932d;
import ca.C0933e;
import ca.C0934f;
import ca.C0935g;
import ca.C0936h;
import ja.C3616j;
import ja.C3617k;
import ja.EnumC3618l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o8.AbstractC5325a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class oa {

    /* renamed from: a */
    public static long f26701a;

    /* renamed from: b */
    public static Method f26702b;

    /* renamed from: c */
    public static Method f26703c;

    /* renamed from: d */
    public static Method f26704d;

    /* renamed from: e */
    public static Method f26705e;

    /* renamed from: a */
    public static final la m10791a(C3617k c3617k, C3616j c3616j) {
        String str;
        String str2;
        String str3;
        ma c0935g;
        Map map = c3617k.f19258b;
        String strM8168a = c3617k.m8168a("credential_source", null);
        String str4 = c3617k.f19257a;
        if (strM8168a != null) {
            return new C0931c(strM8168a);
        }
        String strM8168a2 = c3617k.m8168a("role_arn", null);
        String strM8168a3 = c3617k.m8168a("web_identity_token_file", null);
        ma c0935g2 = strM8168a3 == null ? null : strM8168a2 == null ? new C0935g(AbstractC5601a.m11238i("profile (", str4, ") missing `role_arn`")) : new C0936h(new C0934f(strM8168a2, strM8168a3, c3617k.m8168a("role_session_name", null)));
        if (c0935g2 != null) {
            str = ") missing `sso_role_name`";
            str2 = ") missing `sso_account_id`";
            str3 = ") missing `sso_region`";
        } else {
            String strM8168a4 = c3617k.m8168a("sso_session", null);
            if (strM8168a4 == null) {
                c0935g2 = null;
            } else {
                Map map2 = (Map) c3616j.f19255a.get(EnumC3618l.SSO_SESSION);
                if (map2 == null) {
                    map2 = C6669s.f31944a;
                }
                C3617k c3617k2 = (C3617k) map2.get(strM8168a4);
                if (c3617k2 == null) {
                    c0935g2 = new C0935g("profile (" + str4 + ") references non-existing sso_session = `" + strM8168a4 + '`');
                } else {
                    String strM8168a5 = c3617k2.m8168a("sso_start_url", null);
                    if (strM8168a5 == null) {
                        c0935g2 = new C0935g(AbstractC5601a.m11238i("sso-session (", strM8168a4, ") missing `sso_start_url`"));
                    } else {
                        String strM8168a6 = c3617k2.m8168a("sso_region", null);
                        if (strM8168a6 == null) {
                            c0935g2 = new C0935g(AbstractC5601a.m11238i("sso-session (", strM8168a4, ") missing `sso_region`"));
                        } else {
                            String strM8168a7 = c3617k.m8168a("sso_account_id", null);
                            if (strM8168a7 == null) {
                                c0935g2 = new C0935g(AbstractC5601a.m11238i("profile (", str4, ") missing `sso_account_id`"));
                            } else {
                                String strM8168a8 = c3617k.m8168a("sso_role_name", null);
                                if (strM8168a8 == null) {
                                    c0935g2 = new C0935g(AbstractC5601a.m11238i("profile (", str4, ") missing `sso_role_name`"));
                                } else {
                                    str = ") missing `sso_role_name`";
                                    String strM8168a9 = c3617k2.m8168a("sso_region", null);
                                    str2 = ") missing `sso_account_id`";
                                    String strM8168a10 = c3617k.m8168a("sso_region", null);
                                    if (strM8168a9 == null || strM8168a10 == null || strM8168a9.equals(strM8168a10)) {
                                        str3 = ") missing `sso_region`";
                                        String strM8168a11 = c3617k2.m8168a("sso_start_url", null);
                                        String strM8168a12 = c3617k.m8168a("sso_start_url", null);
                                        if (strM8168a11 == null || strM8168a12 == null || strM8168a11.equals(strM8168a12)) {
                                            c0935g2 = new C0936h(new C0933e(strM8168a4, strM8168a5, strM8168a6, strM8168a7, strM8168a8));
                                        } else {
                                            StringBuilder sbM127r = AbstractC0030c.m127r("sso-session (", strM8168a4, ") sso_start_url = `", strM8168a11, "` does not match profile (");
                                            sbM127r.append(str4);
                                            sbM127r.append(") sso_start_url = `");
                                            sbM127r.append(strM8168a12);
                                            sbM127r.append('`');
                                            c0935g2 = new C0935g(sbM127r.toString());
                                        }
                                    } else {
                                        str3 = ") missing `sso_region`";
                                        StringBuilder sbM127r2 = AbstractC0030c.m127r("sso-session (", strM8168a4, ") sso_region = `", strM8168a9, "` does not match profile (");
                                        sbM127r2.append(str4);
                                        sbM127r2.append(") sso_region = `");
                                        sbM127r2.append(strM8168a10);
                                        sbM127r2.append('`');
                                        c0935g2 = new C0935g(sbM127r2.toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str = ") missing `sso_role_name`";
            str2 = ") missing `sso_account_id`";
            str3 = ") missing `sso_region`";
        }
        if (c0935g2 == null) {
            if (map.containsKey("sso_account_id") || map.containsKey("sso_role_name")) {
                String strM8168a13 = c3617k.m8168a("sso_start_url", null);
                if (strM8168a13 == null) {
                    c0935g2 = new C0935g(AbstractC5601a.m11238i("profile (", str4, ") missing `sso_start_url`"));
                } else {
                    String strM8168a14 = c3617k.m8168a("sso_region", null);
                    if (strM8168a14 == null) {
                        c0935g2 = new C0935g(AbstractC5601a.m11238i("profile (", str4, str3));
                    } else {
                        String strM8168a15 = c3617k.m8168a("sso_account_id", null);
                        if (strM8168a15 == null) {
                            c0935g2 = new C0935g(AbstractC5601a.m11238i("profile (", str4, str2));
                        } else {
                            String strM8168a16 = c3617k.m8168a("sso_role_name", null);
                            c0935g2 = strM8168a16 == null ? new C0935g(AbstractC5601a.m11238i("profile (", str4, str)) : new C0936h(new C0930b(strM8168a13, strM8168a14, strM8168a15, strM8168a16));
                        }
                    }
                }
            } else {
                c0935g2 = null;
            }
        }
        if (c0935g2 == null) {
            if (map.containsKey("credential_process")) {
                String strM8168a17 = c3617k.m8168a("credential_process", null);
                if (strM8168a17 == null) {
                    c0935g = new C0935g(AbstractC5601a.m11238i("profile (", str4, ") missing `credential_process`"));
                } else {
                    c0935g2 = new C0936h(new C0932d(strM8168a17));
                }
            } else {
                c0935g = new C0935g(AbstractC5601a.m11238i("profile (", str4, ") did not contain credential information"));
            }
            c0935g2 = c0935g;
        }
        if (c0935g2 instanceof C0936h) {
            return ((C0936h) c0935g2).f5690a;
        }
        if (c0935g2 instanceof C0935g) {
            throw new ProviderConfigurationException(((C0935g) c0935g2).f5689a, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static void m10792b(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: c */
    public static boolean m10793c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC5325a.m10473c();
        }
        try {
            if (f26702b == null) {
                f26701a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f26702b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f26702b.invoke(null, Long.valueOf(f26701a))).booleanValue();
        } catch (Exception e2) {
            m10792b(e2);
            return false;
        }
    }

    /* renamed from: d */
    public static void m10794d(int i10, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC5325a.m10474d(i10, m10795e(str));
            return;
        }
        String strM10795e = m10795e(str);
        try {
            if (f26705e == null) {
                f26705e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f26705e.invoke(null, Long.valueOf(f26701a), strM10795e, Integer.valueOf(i10));
        } catch (Exception e2) {
            m10792b(e2);
        }
    }

    /* renamed from: e */
    public static String m10795e(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
