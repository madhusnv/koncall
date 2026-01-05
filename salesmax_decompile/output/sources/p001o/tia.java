package p001o;

import java.security.AccessController;

/* loaded from: classes6.dex */
public abstract class tia {

    /* renamed from: a */
    public static final String[] f47195a = {"getTargetException", "getTargetError", "getException", "getRootCause"};

    /* renamed from: b */
    public static final Class[] f47196b = new Class[0];

    /* renamed from: c */
    public static String f47197c;

    /* renamed from: d */
    public static boolean f47198d;

    /* renamed from: e */
    public static boolean f47199e;

    /* renamed from: f */
    public static uja f47200f;

    /* renamed from: g */
    public static /* synthetic */ Class f47201g;

    /* renamed from: h */
    public static /* synthetic */ Class f47202h;

    static {
        Class clsM57780a;
        AccessController.doPrivileged(new qia());
        try {
            Class clsM49919a = f47201g;
            if (clsM49919a == null) {
                clsM49919a = m49919a("org.mortbay.log.Log");
                f47201g = clsM49919a;
            }
            clsM57780a = yga.m57780a(clsM49919a, f47197c);
            f47200f = (uja) clsM57780a.newInstance();
        } catch (Throwable th) {
            Class clsM49919a2 = f47202h;
            if (clsM49919a2 == null) {
                clsM49919a2 = m49919a("org.mortbay.log.StdErrLog");
                f47202h = clsM49919a2;
            }
            f47200f = new v5g();
            f47197c = clsM49919a2.getName();
            if (f47198d) {
                th.printStackTrace();
            }
            clsM57780a = clsM49919a2;
        }
        uja ujaVar = f47200f;
        ujaVar.mo51655d("Logging to {} via {}", ujaVar, clsM57780a.getName());
    }

    /* renamed from: a */
    public static /* synthetic */ Class m49919a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: b */
    public static void m49920b(String str) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51654c(str, null, null);
    }

    /* renamed from: c */
    public static void m49921c(String str, Object obj) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51654c(str, obj, null);
    }

    /* renamed from: d */
    public static void m49922d(Throwable th) {
        if (f47200f == null || !m49926h()) {
            return;
        }
        f47200f.mo51653b("EXCEPTION ", th);
        m49927i(th);
    }

    /* renamed from: e */
    public static void m49923e(Throwable th) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        if (f47199e) {
            ujaVar.warn("IGNORED", th);
            m49927i(th);
        } else if (f47198d) {
            ujaVar.mo51653b("IGNORED", th);
            m49927i(th);
        }
    }

    /* renamed from: f */
    public static void m49924f(String str) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51655d(str, null, null);
    }

    /* renamed from: g */
    public static void m49925g(String str, Object obj) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51655d(str, obj, null);
    }

    /* renamed from: h */
    public static boolean m49926h() {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return false;
        }
        return ujaVar.isDebugEnabled();
    }

    /* renamed from: i */
    public static void m49927i(Throwable th) {
        if (th == null) {
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = f47195a;
            if (i >= strArr.length) {
                return;
            }
            try {
                Throwable th2 = (Throwable) th.getClass().getMethod(strArr[i], f47196b).invoke(th, null);
                if (th2 != null && th2 != th) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Nested in ");
                    stringBuffer.append(th);
                    stringBuffer.append(":");
                    m49930l(stringBuffer.toString(), th2);
                }
            } catch (Exception unused) {
            }
            i++;
        }
    }

    /* renamed from: j */
    public static void m49928j(String str) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51652a(str, null, null);
    }

    /* renamed from: k */
    public static void m49929k(String str, Object obj) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.mo51652a(str, obj, null);
    }

    /* renamed from: l */
    public static void m49930l(String str, Throwable th) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.warn(str, th);
        m49927i(th);
    }

    /* renamed from: m */
    public static void m49931m(Throwable th) {
        uja ujaVar = f47200f;
        if (ujaVar == null) {
            return;
        }
        ujaVar.warn("EXCEPTION ", th);
        m49927i(th);
    }
}
