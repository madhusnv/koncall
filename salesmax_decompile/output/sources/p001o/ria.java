package p001o;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public abstract class ria {

    /* renamed from: b */
    public static int f43675b = 0;

    /* renamed from: c */
    public static boolean f43676c = true;

    /* renamed from: a */
    public static final Object f43674a = new Object();

    /* renamed from: d */
    public static InterfaceC16616a f43677d = InterfaceC16616a.f43678a;

    /* renamed from: o.ria$a */
    public interface InterfaceC16616a {

        /* renamed from: a */
        public static final InterfaceC16616a f43678a = new a();

        /* renamed from: o.ria$a$a */
        public class a implements InterfaceC16616a {
            @Override // p001o.ria.InterfaceC16616a
            /* renamed from: a */
            public void mo46826a(String str, String str2, Throwable th) {
                ria.m46817a(str2, th);
            }

            @Override // p001o.ria.InterfaceC16616a
            /* renamed from: b */
            public void mo46827b(String str, String str2, Throwable th) {
                ria.m46817a(str2, th);
            }

            @Override // p001o.ria.InterfaceC16616a
            /* renamed from: c */
            public void mo46828c(String str, String str2, Throwable th) {
                ria.m46817a(str2, th);
            }

            @Override // p001o.ria.InterfaceC16616a
            /* renamed from: d */
            public void mo46829d(String str, String str2, Throwable th) {
                ria.m46817a(str2, th);
            }
        }

        /* renamed from: a */
        void mo46826a(String str, String str2, Throwable th);

        /* renamed from: b */
        void mo46827b(String str, String str2, Throwable th);

        /* renamed from: c */
        void mo46828c(String str, String str2, Throwable th);

        /* renamed from: d */
        void mo46829d(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static String m46817a(String str, Throwable th) {
        String strM46821e = m46821e(th);
        if (TextUtils.isEmpty(strM46821e)) {
            return str;
        }
        return str + "\n  " + strM46821e.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m46818b(String str, String str2) {
        synchronized (f43674a) {
            if (f43675b == 0) {
                f43677d.mo46826a(str, str2, null);
            }
        }
    }

    /* renamed from: c */
    public static void m46819c(String str, String str2) {
        synchronized (f43674a) {
            if (f43675b <= 3) {
                f43677d.mo46828c(str, str2, null);
            }
        }
    }

    /* renamed from: d */
    public static void m46820d(String str, String str2, Throwable th) {
        synchronized (f43674a) {
            if (f43675b <= 3) {
                f43677d.mo46828c(str, str2, th);
            }
        }
    }

    /* renamed from: e */
    public static String m46821e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f43674a) {
            if (m46823g(th)) {
                return "UnknownHostException (no network)";
            }
            if (f43676c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    /* renamed from: f */
    public static void m46822f(String str, String str2) {
        synchronized (f43674a) {
            if (f43675b <= 1) {
                f43677d.mo46829d(str, str2, null);
            }
        }
    }

    /* renamed from: g */
    public static boolean m46823g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: h */
    public static void m46824h(String str, String str2) {
        synchronized (f43674a) {
            if (f43675b <= 2) {
                f43677d.mo46827b(str, str2, null);
            }
        }
    }

    /* renamed from: i */
    public static void m46825i(String str, String str2, Throwable th) {
        synchronized (f43674a) {
            if (f43675b <= 2) {
                f43677d.mo46827b(str, str2, th);
            }
        }
    }
}
