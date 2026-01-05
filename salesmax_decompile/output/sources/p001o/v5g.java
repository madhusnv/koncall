package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class v5g implements uja {

    /* renamed from: c */
    public static pz4 f49901c;

    /* renamed from: d */
    public static boolean f49902d;

    /* renamed from: a */
    public String f49903a;

    /* renamed from: b */
    public StringBuffer f49904b;

    static {
        f49902d = System.getProperty("DEBUG", null) != null;
        try {
            f49901c = new pz4("yyyy-MM-dd HH:mm:ss");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public v5g() {
        this(null);
    }

    @Override // p001o.uja
    /* renamed from: a */
    public void mo51652a(String str, Object obj, Object obj2) {
        String strM44358c = f49901c.m44358c();
        int iM44357b = f49901c.m44357b();
        synchronized (this.f49904b) {
            m52345h(strM44358c, iM44357b, ":WARN:");
            m52343f(str, obj, obj2);
            System.err.println(this.f49904b.toString());
        }
    }

    @Override // p001o.uja
    /* renamed from: b */
    public void mo51653b(String str, Throwable th) {
        if (f49902d) {
            String strM44358c = f49901c.m44358c();
            int iM44357b = f49901c.m44357b();
            synchronized (this.f49904b) {
                m52345h(strM44358c, iM44357b, ":DBUG:");
                m52342e(str);
                m52344g(th);
                System.err.println(this.f49904b.toString());
            }
        }
    }

    @Override // p001o.uja
    /* renamed from: c */
    public void mo51654c(String str, Object obj, Object obj2) {
        if (f49902d) {
            String strM44358c = f49901c.m44358c();
            int iM44357b = f49901c.m44357b();
            synchronized (this.f49904b) {
                m52345h(strM44358c, iM44357b, ":DBUG:");
                m52343f(str, obj, obj2);
                System.err.println(this.f49904b.toString());
            }
        }
    }

    @Override // p001o.uja
    /* renamed from: d */
    public void mo51655d(String str, Object obj, Object obj2) {
        String strM44358c = f49901c.m44358c();
        int iM44357b = f49901c.m44357b();
        synchronized (this.f49904b) {
            m52345h(strM44358c, iM44357b, ":INFO:");
            m52343f(str, obj, obj2);
            System.err.println(this.f49904b.toString());
        }
    }

    /* renamed from: e */
    public final void m52342e(String str) {
        if (str == null) {
            this.f49904b.append("null");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                this.f49904b.append(cCharAt);
            } else if (cCharAt == '\n') {
                this.f49904b.append('|');
            } else if (cCharAt == '\r') {
                this.f49904b.append('<');
            } else {
                this.f49904b.append('?');
            }
        }
    }

    /* renamed from: f */
    public final void m52343f(String str, Object obj, Object obj2) {
        int iIndexOf = str == null ? -1 : str.indexOf("{}");
        int iIndexOf2 = iIndexOf >= 0 ? str.indexOf("{}", iIndexOf + 2) : -1;
        if (iIndexOf < 0) {
            m52342e(str);
            if (obj != null) {
                this.f49904b.append(TokenParser.SP);
                m52342e(String.valueOf(obj));
            }
            if (obj2 != null) {
                this.f49904b.append(TokenParser.SP);
                m52342e(String.valueOf(obj2));
                return;
            }
            return;
        }
        m52342e(str.substring(0, iIndexOf));
        if (obj == null) {
            obj = "null";
        }
        m52342e(String.valueOf(obj));
        if (iIndexOf2 >= 0) {
            m52342e(str.substring(iIndexOf + 2, iIndexOf2));
            if (obj2 == null) {
                obj2 = "null";
            }
            m52342e(String.valueOf(obj2));
            m52342e(str.substring(iIndexOf2 + 2));
            return;
        }
        m52342e(str.substring(iIndexOf + 2));
        if (obj2 != null) {
            this.f49904b.append(TokenParser.SP);
            m52342e(String.valueOf(obj2));
        }
    }

    /* renamed from: g */
    public final void m52344g(Throwable th) {
        if (th == null) {
            this.f49904b.append("null");
            return;
        }
        this.f49904b.append('\n');
        m52342e(th.toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (int i = 0; stackTrace != null && i < stackTrace.length; i++) {
            this.f49904b.append("\n\tat ");
            m52342e(stackTrace[i].toString());
        }
    }

    /* renamed from: h */
    public final void m52345h(String str, int i, String str2) {
        this.f49904b.setLength(0);
        this.f49904b.append(str);
        if (i > 99) {
            this.f49904b.append('.');
        } else if (i > 9) {
            this.f49904b.append(".0");
        } else {
            this.f49904b.append(".00");
        }
        StringBuffer stringBuffer = this.f49904b;
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append(this.f49903a);
        stringBuffer.append(':');
    }

    @Override // p001o.uja
    public boolean isDebugEnabled() {
        return f49902d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("STDERR");
        stringBuffer.append(this.f49903a);
        return stringBuffer.toString();
    }

    @Override // p001o.uja
    public void warn(String str, Throwable th) {
        String strM44358c = f49901c.m44358c();
        int iM44357b = f49901c.m44357b();
        synchronized (this.f49904b) {
            m52345h(strM44358c, iM44357b, ":WARN:");
            m52342e(str);
            m52344g(th);
            System.err.println(this.f49904b.toString());
        }
    }

    public v5g(String str) {
        this.f49904b = new StringBuffer();
        this.f49903a = str == null ? "" : str;
    }
}
