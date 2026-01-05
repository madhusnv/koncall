package p001o;

import com.google.android.gms.cast.MediaStatus;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.config.CookieSpecs;
import p001o.dk6;
import p001o.wx7;

/* loaded from: classes6.dex */
public abstract class jgj {

    /* renamed from: a */
    public static final wx7 f30417a = ggj.m28631k();

    /* renamed from: b */
    public static final xle f30418b = ggj.m28632l();

    /* renamed from: c */
    public static final cre f30419c = ggj.m28633m();

    /* renamed from: d */
    public static final TimeZone f30420d;

    /* renamed from: e */
    public static final boolean f30421e;

    /* renamed from: f */
    public static final String f30422f;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        sq8.m48646e(timeZone);
        f30420d = timeZone;
        f30421e = false;
        String name = hac.class.getName();
        sq8.m48648g(name, "getName(...)");
        f30422f = f9g.v0(f9g.u0(name, "okhttp3."), "Client");
    }

    /* renamed from: c */
    public static final dk6.InterfaceC12980c m33809c(final dk6 dk6Var) {
        sq8.m48649h(dk6Var, "<this>");
        return new dk6.InterfaceC12980c() { // from class: o.igj
            @Override // p001o.dk6.InterfaceC12980c
            /* renamed from: a */
            public final dk6 mo23359a(bt1 bt1Var) {
                return jgj.m33810d(dk6Var, bt1Var);
            }
        };
    }

    /* renamed from: d */
    public static final dk6 m33810d(dk6 dk6Var, bt1 bt1Var) {
        sq8.m48649h(dk6Var, "$this_asFactory");
        sq8.m48649h(bt1Var, "it");
        return dk6Var;
    }

    /* renamed from: e */
    public static final boolean m33811e(w48 w48Var, w48 w48Var2) {
        sq8.m48649h(w48Var, "<this>");
        sq8.m48649h(w48Var2, "other");
        return sq8.m48644c(w48Var.m53877h(), w48Var2.m53877h()) && w48Var.m53882n() == w48Var2.m53882n() && sq8.m48644c(w48Var.m53886r(), w48Var2.m53886r());
    }

    /* renamed from: f */
    public static final int m33812f(String str, long j, TimeUnit timeUnit) {
        sq8.m48649h(str, "name");
        sq8.m48649h(timeUnit, "unit");
        boolean z = true;
        if (!(j >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException((str + " too large").toString());
        }
        if (millis == 0 && j > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small").toString());
    }

    /* renamed from: g */
    public static final void m33813g(Socket socket) throws IOException {
        sq8.m48649h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!sq8.m48644c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final boolean m33814h(lzf lzfVar, int i, TimeUnit timeUnit) {
        sq8.m48649h(lzfVar, "<this>");
        sq8.m48649h(timeUnit, "timeUnit");
        try {
            return m33820n(lzfVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static final String m33815i(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        h8g h8gVar = h8g.f26398a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        sq8.m48648g(str2, "format(...)");
        return str2;
    }

    /* renamed from: j */
    public static final long m33816j(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        String strM55327d = zqeVar.m59744u().m55327d("Content-Length");
        if (strM55327d != null) {
            return ggj.m28615D(strM55327d, -1L);
        }
        return -1L;
    }

    /* renamed from: k */
    public static final List m33817k(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(ch3.m21249n(Arrays.copyOf(objArr2, objArr2.length)));
        sq8.m48648g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* renamed from: l */
    public static final boolean m33818l(Socket socket, im1 im1Var) throws SocketException {
        sq8.m48649h(socket, "<this>");
        sq8.m48649h(im1Var, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !im1Var.mo32311n();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: m */
    public static final Charset m33819m(im1 im1Var, Charset charset) {
        sq8.m48649h(im1Var, "<this>");
        sq8.m48649h(charset, CookieSpecs.DEFAULT);
        int iN3 = im1Var.n3(ggj.m28634n());
        if (iN3 == -1) {
            return charset;
        }
        if (iN3 == 0) {
            return sh2.f45422b;
        }
        if (iN3 == 1) {
            return sh2.f45424d;
        }
        if (iN3 == 2) {
            return sh2.f45425e;
        }
        if (iN3 == 3) {
            return sh2.f45421a.m48347a();
        }
        if (iN3 == 4) {
            return sh2.f45421a.m48348b();
        }
        throw new AssertionError();
    }

    /* renamed from: n */
    public static final boolean m33820n(lzf lzfVar, int i, TimeUnit timeUnit) {
        sq8.m48649h(lzfVar, "<this>");
        sq8.m48649h(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo40792c = lzfVar.timeout().mo40794e() ? lzfVar.timeout().mo40792c() - jNanoTime : Long.MAX_VALUE;
        lzfVar.timeout().mo40793d(Math.min(jMo40792c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            rl1 rl1Var = new rl1();
            while (lzfVar.N0(rl1Var, MediaStatus.COMMAND_PLAYBACK_RATE) != -1) {
                rl1Var.clear();
            }
            if (jMo40792c == Long.MAX_VALUE) {
                lzfVar.timeout().mo40790a();
            } else {
                lzfVar.timeout().mo40793d(jNanoTime + jMo40792c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo40792c == Long.MAX_VALUE) {
                lzfVar.timeout().mo40790a();
            } else {
                lzfVar.timeout().mo40793d(jNanoTime + jMo40792c);
            }
            return false;
        } catch (Throwable th) {
            if (jMo40792c == Long.MAX_VALUE) {
                lzfVar.timeout().mo40790a();
            } else {
                lzfVar.timeout().mo40793d(jNanoTime + jMo40792c);
            }
            throw th;
        }
    }

    /* renamed from: o */
    public static final ThreadFactory m33821o(final String str, final boolean z) {
        sq8.m48649h(str, "name");
        return new ThreadFactory() { // from class: o.hgj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return jgj.m33822p(str, z, runnable);
            }
        };
    }

    /* renamed from: p */
    public static final Thread m33822p(String str, boolean z, Runnable runnable) {
        sq8.m48649h(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: q */
    public static final List m33823q(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "<this>");
        kl8 kl8VarM18616s = bce.m18616s(0, wx7Var.size());
        ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
        Iterator it = kl8VarM18616s.iterator();
        while (it.hasNext()) {
            int iMo23412a = ((dl8) it).mo23412a();
            arrayList.add(new sx7(wx7Var.m55329j(iMo23412a), wx7Var.m55333w(iMo23412a)));
        }
        return arrayList;
    }

    /* renamed from: r */
    public static final wx7 m33824r(List list) {
        sq8.m48649h(list, "<this>");
        wx7.C17997a c17997a = new wx7.C17997a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sx7 sx7Var = (sx7) it.next();
            c17997a.m55338d(sx7Var.m49070a().m59696R(), sx7Var.m49071b().m59696R());
        }
        return c17997a.m55340f();
    }

    /* renamed from: s */
    public static final String m33825s(int i) {
        String hexString = Integer.toHexString(i);
        sq8.m48648g(hexString, "toHexString(...)");
        return hexString;
    }

    /* renamed from: t */
    public static final String m33826t(long j) {
        String hexString = Long.toHexString(j);
        sq8.m48648g(hexString, "toHexString(...)");
        return hexString;
    }

    /* renamed from: u */
    public static final String m33827u(w48 w48Var, boolean z) {
        String strM53877h;
        sq8.m48649h(w48Var, "<this>");
        if (f9g.m26306P(w48Var.m53877h(), ":", false, 2, null)) {
            strM53877h = '[' + w48Var.m53877h() + ']';
        } else {
            strM53877h = w48Var.m53877h();
        }
        if (!z && w48Var.m53882n() == w48.f51415j.m53925b(w48Var.m53886r())) {
            return strM53877h;
        }
        return strM53877h + ':' + w48Var.m53882n();
    }

    /* renamed from: v */
    public static /* synthetic */ String m33828v(w48 w48Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m33827u(w48Var, z);
    }

    /* renamed from: w */
    public static final List m33829w(List list) {
        sq8.m48649h(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(kh3.T0(list));
        sq8.m48648g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
