package p001o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpHost;

/* loaded from: classes6.dex */
public class vle implements o48 {

    /* renamed from: G */
    public static final Collection f50493G = Collections.singleton(Locale.getDefault());

    /* renamed from: A */
    public BufferedReader f50494A;

    /* renamed from: B */
    public boolean f50495B;

    /* renamed from: D */
    public long f50497D;

    /* renamed from: E */
    public sl1 f50498E;

    /* renamed from: F */
    public Map f50499F;

    /* renamed from: b */
    public f28 f50501b;

    /* renamed from: c */
    public y76 f50502c;

    /* renamed from: d */
    public px0 f50503d;

    /* renamed from: e */
    public String f50504e;

    /* renamed from: f */
    public String f50505f;

    /* renamed from: g */
    public String f50506g;

    /* renamed from: h */
    public String f50507h;

    /* renamed from: i */
    public String f50508i;

    /* renamed from: j */
    public String f50509j;

    /* renamed from: k */
    public String f50510k;

    /* renamed from: l */
    public String f50511l;

    /* renamed from: m */
    public int f50512m;

    /* renamed from: o */
    public String f50514o;

    /* renamed from: p */
    public String f50515p;

    /* renamed from: r */
    public String f50517r;

    /* renamed from: t */
    public String f50519t;

    /* renamed from: u */
    public v48 f50520u;

    /* renamed from: v */
    public Principal f50521v;

    /* renamed from: w */
    public cob f50522w;

    /* renamed from: x */
    public cob f50523x;

    /* renamed from: y */
    public boolean f50524y;

    /* renamed from: a */
    public boolean f50500a = false;

    /* renamed from: n */
    public String f50513n = "HTTP/1.1";

    /* renamed from: q */
    public boolean f50516q = false;

    /* renamed from: s */
    public String f50518s = HttpHost.DEFAULT_SCHEME_NAME;

    /* renamed from: z */
    public int f50525z = 0;

    /* renamed from: C */
    public boolean f50496C = false;

    public vle(f28 f28Var) {
        this.f50495B = false;
        this.f50501b = f28Var;
        this.f50502c = f28Var.m25996r();
        this.f50495B = this.f50501b.m26004z();
    }

    /* renamed from: A */
    public void m52915A(String str) {
        this.f50511l = str;
    }

    /* renamed from: B */
    public void m52916B(String str) {
        this.f50513n = str;
    }

    /* renamed from: C */
    public void m52917C(String str) {
        this.f50508i = str;
    }

    /* renamed from: D */
    public void m52918D(String str) {
        this.f50509j = str;
    }

    /* renamed from: E */
    public void m52919E(String str) {
        this.f50507h = str;
    }

    /* renamed from: F */
    public void m52920F(int i) {
        this.f50512m = i;
    }

    /* renamed from: G */
    public void m52921G(long j) {
        this.f50497D = j;
    }

    /* renamed from: H */
    public void m52922H(v48 v48Var) {
        this.f50520u = v48Var;
    }

    /* renamed from: a */
    public final void m52923a() {
        int iM52926d;
        if (this.f50523x == null) {
            this.f50523x = new cob(16);
        }
        if (this.f50524y) {
            if (this.f50522w == null) {
                this.f50522w = this.f50523x;
                return;
            }
            return;
        }
        this.f50524y = true;
        v48 v48Var = this.f50520u;
        if (v48Var != null && v48Var.mo20372j()) {
            String str = this.f50506g;
            if (str == null) {
                this.f50520u.mo20364b(this.f50523x);
            } else {
                try {
                    this.f50520u.mo20365c(this.f50523x, str);
                } catch (UnsupportedEncodingException e) {
                    if (tia.m49926h()) {
                        tia.m49931m(e);
                    } else {
                        tia.m49928j(e.toString());
                    }
                }
            }
        }
        String strM52924b = m52924b();
        String strM52927e = m52927e();
        if (strM52927e != null && strM52927e.length() > 0 && "application/x-www-form-urlencoded".equalsIgnoreCase(e38.m24173t(strM52927e, null)) && this.f50525z == 0 && (("POST".equals(m52934l()) || "PUT".equals(m52934l())) && (iM52926d = m52926d()) != 0)) {
            try {
                Integer num = (Integer) this.f50501b.m25995q().getServer().m18893G("org.mortbay.jetty.Request.maxFormContentSize");
                int iIntValue = num != null ? num.intValue() : -1;
                if (iM52926d > iIntValue && iIntValue > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Form too large");
                    stringBuffer.append(iM52926d);
                    stringBuffer.append(">");
                    stringBuffer.append(iIntValue);
                    throw new IllegalStateException(stringBuffer.toString());
                }
                o8i.m41778h(m52931i(), this.f50523x, strM52924b, iM52926d < 0 ? iIntValue : -1);
            } catch (IOException e2) {
                if (tia.m49926h()) {
                    tia.m49931m(e2);
                } else {
                    tia.m49928j(e2.toString());
                }
            }
        }
        cob cobVar = this.f50522w;
        if (cobVar == null) {
            this.f50522w = this.f50523x;
            return;
        }
        cob cobVar2 = this.f50523x;
        if (cobVar != cobVar2) {
            Iterator it = cobVar2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                for (int i = 0; i < ti9.m49917k(value); i++) {
                    this.f50522w.m21555a(str2, ti9.m49913g(value, i));
                }
            }
        }
    }

    /* renamed from: b */
    public String m52924b() {
        return this.f50505f;
    }

    /* renamed from: c */
    public f28 m52925c() {
        return this.f50501b;
    }

    /* renamed from: d */
    public int m52926d() {
        return (int) this.f50501b.m26002x().m24182k(j38.f29705j);
    }

    /* renamed from: e */
    public String m52927e() {
        return this.f50501b.m26002x().m24184m(j38.f29721z);
    }

    /* renamed from: f */
    public e64 m52928f() {
        return null;
    }

    /* renamed from: g */
    public m64 m52929g() {
        return null;
    }

    @Override // p001o.zgf
    public String getParameter(String str) {
        if (!this.f50524y) {
            m52923a();
        }
        return (String) this.f50522w.m21556c(str, 0);
    }

    /* renamed from: h */
    public String m52930h(String str) {
        return this.f50501b.m26002x().m24183l(str);
    }

    /* renamed from: i */
    public xgf m52931i() {
        int i = this.f50525z;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("READER");
        }
        this.f50525z = 1;
        return this.f50501b.m25998t();
    }

    /* renamed from: j */
    public String m52932j() {
        if (this.f50495B) {
            y76 y76Var = this.f50502c;
            if (y76Var == null) {
                return null;
            }
            return y76Var.mo29644b();
        }
        y76 y76Var2 = this.f50502c;
        if (y76Var2 == null) {
            return null;
        }
        return y76Var2.mo29645d();
    }

    /* renamed from: k */
    public int m52933k() {
        y76 y76Var = this.f50502c;
        if (y76Var == null) {
            return 0;
        }
        return y76Var.getLocalPort();
    }

    /* renamed from: l */
    public String m52934l() {
        return this.f50510k;
    }

    /* renamed from: m */
    public String m52935m() {
        return this.f50511l;
    }

    /* renamed from: n */
    public String m52936n() {
        return this.f50513n;
    }

    /* renamed from: o */
    public String m52937o() {
        v48 v48Var;
        if (this.f50517r == null && (v48Var = this.f50520u) != null) {
            this.f50517r = v48Var.mo20369g();
        }
        return this.f50517r;
    }

    /* renamed from: p */
    public StringBuffer m52938p() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            String strM52939q = m52939q();
            int iM52941s = m52941s();
            stringBuffer.append(strM52939q);
            stringBuffer.append("://");
            stringBuffer.append(m52940r());
            if (iM52941s > 0 && ((strM52939q.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME) && iM52941s != 80) || (strM52939q.equalsIgnoreCase("https") && iM52941s != 443))) {
                stringBuffer.append(':');
                stringBuffer.append(iM52941s);
            }
        }
        return stringBuffer;
    }

    /* renamed from: q */
    public String m52939q() {
        return this.f50518s;
    }

    /* renamed from: r */
    public String m52940r() {
        String str = this.f50507h;
        if (str != null) {
            return str;
        }
        this.f50507h = this.f50520u.mo20368f();
        this.f50512m = this.f50520u.mo20370h();
        String str2 = this.f50507h;
        if (str2 != null) {
            return str2;
        }
        sl1 sl1VarM24178g = this.f50501b.m26002x().m24178g(j38.f29700e);
        if (sl1VarM24178g == null) {
            if (this.f50501b != null) {
                this.f50507h = m52932j();
                this.f50512m = m52933k();
                String str3 = this.f50507h;
                if (str3 != null && !"0.0.0.0".equals(str3)) {
                    return this.f50507h;
                }
            }
            try {
                this.f50507h = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                tia.m49923e(e);
            }
            return this.f50507h;
        }
        int length = sl1VarM24178g.length();
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                if (this.f50507h == null || this.f50512m < 0) {
                    this.f50507h = zl1.m59576f(sl1VarM24178g);
                    this.f50512m = 0;
                }
                return this.f50507h;
            }
            if (sl1VarM24178g.mo41185o(sl1VarM24178g.mo48451r() + i) == 58) {
                this.f50507h = zl1.m59576f(sl1VarM24178g.O1(sl1VarM24178g.mo48451r(), i));
                this.f50512m = zl1.m59578h(sl1VarM24178g.O1(sl1VarM24178g.mo48451r() + i + 1, (sl1VarM24178g.length() - i) - 1));
                return this.f50507h;
            }
            length = i;
        }
    }

    /* renamed from: s */
    public int m52941s() {
        v48 v48Var;
        if (this.f50512m <= 0) {
            if (this.f50507h == null) {
                m52940r();
            }
            if (this.f50512m <= 0) {
                if (this.f50507h == null || (v48Var = this.f50520u) == null) {
                    y76 y76Var = this.f50502c;
                    this.f50512m = y76Var == null ? 0 : y76Var.getLocalPort();
                } else {
                    this.f50512m = v48Var.mo20370h();
                }
            }
        }
        int i = this.f50512m;
        return i <= 0 ? m52939q().equalsIgnoreCase("https") ? 443 : 80 : i;
    }

    /* renamed from: t */
    public long m52942t() {
        return this.f50497D;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m52934l());
        stringBuffer.append(" ");
        stringBuffer.append(this.f50520u);
        stringBuffer.append(" ");
        stringBuffer.append(m52936n());
        stringBuffer.append("\n");
        stringBuffer.append(this.f50501b.m26002x().toString());
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public sl1 m52943u() {
        if (this.f50498E == null) {
            long j = this.f50497D;
            if (j > 0) {
                this.f50498E = e38.f20861j.m52904g(j);
            }
        }
        return this.f50498E;
    }

    /* renamed from: v */
    public boolean m52944v() {
        return this.f50500a;
    }

    /* renamed from: w */
    public void m52945w() throws IOException {
        if (this.f50525z == 2) {
            try {
                int i = this.f50494A.read();
                while (i != -1) {
                    i = this.f50494A.read();
                }
            } catch (Exception e) {
                tia.m49923e(e);
                this.f50494A = null;
            }
        }
        this.f50500a = false;
        px0 px0Var = this.f50503d;
        if (px0Var != null) {
            px0Var.mo18902r();
        }
        this.f50504e = null;
        this.f50505f = null;
        this.f50506g = null;
        this.f50507h = null;
        this.f50510k = null;
        this.f50511l = null;
        this.f50512m = 0;
        this.f50513n = "HTTP/1.1";
        this.f50514o = null;
        this.f50515p = null;
        this.f50516q = false;
        this.f50517r = null;
        this.f50518s = HttpHost.DEFAULT_SCHEME_NAME;
        this.f50519t = null;
        this.f50497D = 0L;
        this.f50498E = null;
        this.f50520u = null;
        this.f50521v = null;
        cob cobVar = this.f50523x;
        if (cobVar != null) {
            cobVar.clear();
        }
        this.f50522w = null;
        this.f50524y = false;
        this.f50525z = 0;
        this.f50496C = false;
        Map map = this.f50499F;
        if (map != null) {
            map.clear();
        }
        this.f50499F = null;
    }

    /* renamed from: x */
    public void m52946x(String str) {
        this.f50505f = str;
    }

    /* renamed from: y */
    public void m52947y(boolean z) {
        this.f50500a = z;
    }

    /* renamed from: z */
    public void m52948z(String str) {
        this.f50510k = str;
    }
}
