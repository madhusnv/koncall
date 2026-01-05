package p001o;

import com.google.android.gms.common.api.Api;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.message.TokenParser;
import p001o.k16;
import p001o.wr1;

/* loaded from: classes6.dex */
public abstract class tfj {
    /* renamed from: a */
    public static final wr1 m49813a(wr1.C17952a c17952a) {
        sq8.m48649h(c17952a, "<this>");
        return new wr1(c17952a.m54907f(), c17952a.m54908g(), c17952a.m54904c(), -1, false, false, false, c17952a.m54905d(), c17952a.m54906e(), c17952a.m54910i(), c17952a.m54909h(), c17952a.m54903b(), null);
    }

    /* renamed from: b */
    public static final int m49814b(long j) {
        return j > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j;
    }

    /* renamed from: c */
    public static final wr1 m49815c(wr1.C17953b c17953b) {
        sq8.m48649h(c17953b, "<this>");
        wr1.C17952a c17952aM54913l = new wr1.C17952a().m54913l();
        k16.C14700a c14700a = k16.f31358b;
        return c17952aM54913l.m54911j(m16.m38175s(Api.BaseClientBuilder.API_PRIORITY_OTHER, o16.SECONDS)).m54902a();
    }

    /* renamed from: d */
    public static final wr1 m49816d(wr1.C17953b c17953b) {
        sq8.m48649h(c17953b, "<this>");
        return new wr1.C17952a().m54912k().m54902a();
    }

    /* renamed from: e */
    public static final wr1.C17952a m49817e(wr1.C17952a c17952a) {
        sq8.m48649h(c17952a, "<this>");
        c17952a.m54914m(true);
        return c17952a;
    }

    /* renamed from: f */
    public static final wr1.C17952a m49818f(wr1.C17952a c17952a) {
        sq8.m48649h(c17952a, "<this>");
        c17952a.m54915n(true);
        return c17952a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wr1 m49819g(wr1.C17953b c17953b, wx7 wx7Var) throws NumberFormatException {
        int i;
        int i2;
        int iM49821i;
        String string;
        wx7 wx7Var2 = wx7Var;
        sq8.m48649h(c17953b, "<this>");
        sq8.m48649h(wx7Var2, "headers");
        int size = wx7Var.size();
        boolean z = true;
        boolean z2 = true;
        int i3 = 0;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iM28616E = -1;
        int iM28616E2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iM28616E3 = -1;
        int iM28616E4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i3 < size) {
            String strM55329j = wx7Var2.m55329j(i3);
            String strM55333w = wx7Var2.m55333w(i3);
            if (e9g.m24606x(strM55329j, "Cache-Control", z)) {
                if (str == null) {
                    str = strM55333w;
                }
                i = 0;
                while (i < strM55333w.length()) {
                    int iM49821i2 = m49821i(strM55333w, "=,;", i);
                    String strSubstring = strM55333w.substring(i, iM49821i2);
                    sq8.m48648g(strSubstring, "substring(...)");
                    String string2 = f9g.Z0(strSubstring).toString();
                    if (iM49821i2 != strM55333w.length()) {
                        i2 = size;
                        if (strM55333w.charAt(iM49821i2) != ',' && strM55333w.charAt(iM49821i2) != ';') {
                            int iM28642v = ggj.m28642v(strM55333w, iM49821i2 + 1);
                            if (iM28642v >= strM55333w.length() || strM55333w.charAt(iM28642v) != '\"') {
                                iM49821i = m49821i(strM55333w, ",;", iM28642v);
                                String strSubstring2 = strM55333w.substring(iM28642v, iM49821i);
                                sq8.m48648g(strSubstring2, "substring(...)");
                                string = f9g.Z0(strSubstring2).toString();
                            } else {
                                int i4 = iM28642v + 1;
                                int iA0 = f9g.a0(strM55333w, TokenParser.DQUOTE, i4, false, 4, null);
                                string = strM55333w.substring(i4, iA0);
                                sq8.m48648g(string, "substring(...)");
                                iM49821i = iA0 + 1;
                            }
                        }
                        z = true;
                        if (!e9g.m24606x("no-cache", string2, true)) {
                            i = iM49821i;
                            z3 = true;
                        } else if (e9g.m24606x("no-store", string2, true)) {
                            i = iM49821i;
                            z4 = true;
                        } else {
                            if (e9g.m24606x(ClientCookie.MAX_AGE_ATTR, string2, true)) {
                                iM28616E = ggj.m28616E(string, -1);
                            } else if (e9g.m24606x("s-maxage", string2, true)) {
                                iM28616E2 = ggj.m28616E(string, -1);
                            } else if (e9g.m24606x("private", string2, true)) {
                                i = iM49821i;
                                z5 = true;
                            } else if (e9g.m24606x("public", string2, true)) {
                                i = iM49821i;
                                z6 = true;
                            } else if (e9g.m24606x("must-revalidate", string2, true)) {
                                i = iM49821i;
                                z7 = true;
                            } else if (e9g.m24606x("max-stale", string2, true)) {
                                iM28616E3 = ggj.m28616E(string, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                            } else if (e9g.m24606x("min-fresh", string2, true)) {
                                iM28616E4 = ggj.m28616E(string, -1);
                            } else if (e9g.m24606x("only-if-cached", string2, true)) {
                                i = iM49821i;
                                z8 = true;
                            } else if (e9g.m24606x("no-transform", string2, true)) {
                                i = iM49821i;
                                z9 = true;
                            } else if (e9g.m24606x("immutable", string2, true)) {
                                i = iM49821i;
                                z10 = true;
                            }
                            i = iM49821i;
                        }
                        size = i2;
                    } else {
                        i2 = size;
                    }
                    iM49821i = iM49821i2 + 1;
                    string = null;
                    z = true;
                    if (!e9g.m24606x("no-cache", string2, true)) {
                    }
                    size = i2;
                }
                i3++;
                wx7Var2 = wx7Var;
                size = size;
            } else if (!e9g.m24606x(strM55329j, HttpHeaders.PRAGMA, z)) {
                i3++;
                wx7Var2 = wx7Var;
                size = size;
            }
            z2 = false;
            i = 0;
            while (i < strM55333w.length()) {
            }
            i3++;
            wx7Var2 = wx7Var;
            size = size;
        }
        return new wr1(z3, z4, iM28616E, iM28616E2, z5, z6, z7, iM28616E3, iM28616E4, z8, z9, z10, !z2 ? null : str);
    }

    /* renamed from: h */
    public static final String m49820h(wr1 wr1Var) {
        sq8.m48649h(wr1Var, "<this>");
        String strM54888a = wr1Var.m54888a();
        if (strM54888a != null) {
            return strM54888a;
        }
        StringBuilder sb = new StringBuilder();
        if (wr1Var.m54896i()) {
            sb.append("no-cache, ");
        }
        if (wr1Var.m54897j()) {
            sb.append("no-store, ");
        }
        if (wr1Var.m54892e() != -1) {
            sb.append("max-age=");
            sb.append(wr1Var.m54892e());
            sb.append(", ");
        }
        if (wr1Var.m54900m() != -1) {
            sb.append("s-maxage=");
            sb.append(wr1Var.m54900m());
            sb.append(", ");
        }
        if (wr1Var.m54890c()) {
            sb.append("private, ");
        }
        if (wr1Var.m54891d()) {
            sb.append("public, ");
        }
        if (wr1Var.m54895h()) {
            sb.append("must-revalidate, ");
        }
        if (wr1Var.m54893f() != -1) {
            sb.append("max-stale=");
            sb.append(wr1Var.m54893f());
            sb.append(", ");
        }
        if (wr1Var.m54894g() != -1) {
            sb.append("min-fresh=");
            sb.append(wr1Var.m54894g());
            sb.append(", ");
        }
        if (wr1Var.m54899l()) {
            sb.append("only-if-cached, ");
        }
        if (wr1Var.m54898k()) {
            sb.append("no-transform, ");
        }
        if (wr1Var.m54889b()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sq8.m48648g(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        wr1Var.m54901n(string);
        return string;
    }

    /* renamed from: i */
    public static final int m49821i(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (f9g.m26305O(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
