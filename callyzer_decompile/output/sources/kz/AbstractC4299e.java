package kz;

import b00.C0526k;
import b00.InterfaceC0528m;
import b00.i0;
import eb.i3;
import iz.C3389v;
import iz.C3391x;
import iz.d0;
import iz.k0;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import p020v.a1;
import qz.C6386d;
import rw.AbstractC6662l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kz.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4299e {

    /* renamed from: a */
    public static final TimeZone f21707a;

    /* renamed from: b */
    public static final String f21708b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC4154l.m8920c(timeZone);
        f21707a = timeZone;
        f21708b = AbstractC5178p.m10108S(AbstractC5178p.m10107R(d0.class.getName(), "okhttp3."), "Client");
    }

    /* renamed from: a */
    public static final boolean m9012a(C3391x c3391x, C3391x other) {
        AbstractC4154l.m8923f(c3391x, "<this>");
        AbstractC4154l.m8923f(other, "other");
        return AbstractC4154l.m8918a(c3391x.f17994d, other.f17994d) && c3391x.f17995e == other.f17995e && AbstractC4154l.m8918a(c3391x.f17991a, other.f17991a);
    }

    /* renamed from: b */
    public static final int m9013b(long j6, TimeUnit unit) {
        AbstractC4154l.m8923f(unit, "unit");
        if (j6 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j6);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    /* renamed from: c */
    public static final void m9014c(Socket socket) {
        AbstractC4154l.m8923f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e10) {
            if (!AbstractC4154l.m8918a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final String m9015d(String format, Object... objArr) {
        AbstractC4154l.m8923f(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: e */
    public static final long m9016e(k0 k0Var) {
        String strM7787b = k0Var.f17922f.m7787b("Content-Length");
        if (strM7787b == null) {
            return -1L;
        }
        byte[] bArr = AbstractC4297c.f21703a;
        try {
            return Long.parseLong(strM7787b);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: f */
    public static final Charset m9017f(InterfaceC0528m interfaceC0528m, Charset charset) {
        AbstractC4154l.m8923f(interfaceC0528m, "<this>");
        AbstractC4154l.m8923f(charset, "default");
        int iMo1542D = interfaceC0528m.mo1542D(AbstractC4297c.f21704b);
        if (iMo1542D == -1) {
            return charset;
        }
        if (iMo1542D == 0) {
            return AbstractC5163a.f25245a;
        }
        if (iMo1542D == 1) {
            return AbstractC5163a.f25246b;
        }
        if (iMo1542D == 2) {
            Charset charset2 = AbstractC5163a.f25245a;
            Charset charset3 = AbstractC5163a.f25249e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            AbstractC4154l.m8922e(charsetForName, "forName(...)");
            AbstractC5163a.f25249e = charsetForName;
            return charsetForName;
        }
        if (iMo1542D == 3) {
            return AbstractC5163a.f25247c;
        }
        if (iMo1542D != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC5163a.f25245a;
        Charset charset5 = AbstractC5163a.f25250f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        AbstractC4154l.m8922e(charsetForName2, "forName(...)");
        AbstractC5163a.f25250f = charsetForName2;
        return charsetForName2;
    }

    /* renamed from: g */
    public static final boolean m9018g(i0 i0Var, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC4154l.m8923f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo1598c = i0Var.mo1532f().mo1599e() ? i0Var.mo1532f().mo1598c() - jNanoTime : Long.MAX_VALUE;
        i0Var.mo1532f().mo1583d(Math.min(jMo1598c, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C0526k c0526k = new C0526k();
            while (i0Var.g0(c0526k, 8192L) != -1) {
                c0526k.m1593n();
            }
            if (jMo1598c == Long.MAX_VALUE) {
                i0Var.mo1532f().mo1596a();
                return true;
            }
            i0Var.mo1532f().mo1583d(jNanoTime + jMo1598c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo1598c == Long.MAX_VALUE) {
                i0Var.mo1532f().mo1596a();
                return false;
            }
            i0Var.mo1532f().mo1583d(jNanoTime + jMo1598c);
            return false;
        } catch (Throwable th2) {
            if (jMo1598c == Long.MAX_VALUE) {
                i0Var.mo1532f().mo1596a();
            } else {
                i0Var.mo1532f().mo1583d(jNanoTime + jMo1598c);
            }
            throw th2;
        }
    }

    /* renamed from: h */
    public static final C3389v m9019h(List list) {
        i3 i3Var = new i3(2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6386d c6386d = (C6386d) it.next();
            i3Var.m5724b(c6386d.f30800a.m1613r(), c6386d.f30801b.m1613r());
        }
        return i3Var.m5727e();
    }

    /* renamed from: i */
    public static final String m9020i(C3391x c3391x, boolean z6) {
        AbstractC4154l.m8923f(c3391x, "<this>");
        int i10 = c3391x.f17995e;
        String strM14328h = c3391x.f17994d;
        if (AbstractC5178p.m10116x(strM14328h, ":", false)) {
            strM14328h = a1.m14328h(']', "[", strM14328h);
        }
        if (!z6) {
            String scheme = c3391x.f17991a;
            AbstractC4154l.m8923f(scheme, "scheme");
            if (i10 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return strM14328h;
            }
        }
        return strM14328h + ':' + i10;
    }

    /* renamed from: j */
    public static final List m9021j(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            return C6668r.f31943a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            AbstractC4154l.m8922e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        AbstractC4154l.m8922e(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC6662l.m12711a(array));
        AbstractC4154l.m8922e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* renamed from: k */
    public static final List m9022k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C6668r.f31943a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            AbstractC4154l.m8922e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC6662l.m12711a((Object[]) objArr.clone()));
        AbstractC4154l.m8922e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
