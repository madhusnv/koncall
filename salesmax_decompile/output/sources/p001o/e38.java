package p001o;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.onesignal.session.internal.session.impl.SessionListener;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.message.TokenParser;
import p001o.ul1;

/* loaded from: classes6.dex */
public class e38 {

    /* renamed from: g */
    public static String[] f20858g = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    /* renamed from: h */
    public static String[] f20859h = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};

    /* renamed from: i */
    public static TimeZone f20860i = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: j */
    public static final vl1 f20861j;

    /* renamed from: k */
    public static final String[] f20862k;

    /* renamed from: l */
    public static int f20863l;

    /* renamed from: m */
    public static SimpleDateFormat[] f20864m;

    /* renamed from: n */
    public static final String f20865n;

    /* renamed from: o */
    public static final sl1 f20866o;

    /* renamed from: p */
    public static Float f20867p;

    /* renamed from: q */
    public static Float f20868q;

    /* renamed from: r */
    public static m8g f20869r;

    /* renamed from: b */
    public int f20871b;

    /* renamed from: e */
    public StringBuffer f20874e;

    /* renamed from: f */
    public Calendar f20875f;

    /* renamed from: a */
    public ArrayList f20870a = new ArrayList(20);

    /* renamed from: c */
    public HashMap f20872c = new HashMap(32);

    /* renamed from: d */
    public SimpleDateFormat[] f20873d = new SimpleDateFormat[f20864m.length];

    /* renamed from: o.e38$a */
    public static final class C13091a {

        /* renamed from: a */
        public sl1 f20876a;

        /* renamed from: b */
        public sl1 f20877b;

        /* renamed from: c */
        public String f20878c;

        /* renamed from: d */
        public long f20879d;

        /* renamed from: e */
        public C13091a f20880e;

        /* renamed from: f */
        public C13091a f20881f;

        /* renamed from: g */
        public int f20882g;

        public /* synthetic */ C13091a(sl1 sl1Var, sl1 sl1Var2, long j, int i, c38 c38Var) {
            this(sl1Var, sl1Var2, j, i);
        }

        /* renamed from: i */
        public final void m24199i() {
            this.f20882g = -1;
        }

        /* renamed from: j */
        public final void m24200j() {
            this.f20876a = null;
            this.f20877b = null;
            this.f20880e = null;
            this.f20881f = null;
            this.f20878c = null;
        }

        /* renamed from: k */
        public long m24201k() {
            if (this.f20879d == -1) {
                this.f20879d = zl1.m59579i(this.f20877b);
            }
            return this.f20879d;
        }

        /* renamed from: l */
        public String m24202l() {
            return zl1.m59576f(this.f20876a);
        }

        /* renamed from: m */
        public sl1 m24203m() {
            return this.f20876a;
        }

        /* renamed from: n */
        public int m24204n() {
            return j38.f29699d.m51694f(this.f20876a);
        }

        /* renamed from: o */
        public String m24205o() {
            if (this.f20878c == null) {
                this.f20878c = zl1.m59576f(this.f20877b);
            }
            return this.f20878c;
        }

        /* renamed from: p */
        public sl1 m24206p() {
            return this.f20877b;
        }

        /* renamed from: q */
        public int m24207q() {
            return i38.f27983d.m51694f(this.f20877b);
        }

        /* renamed from: r */
        public void m24208r(sl1 sl1Var) {
            sl1 sl1Var2 = this.f20876a;
            if ((sl1Var2 instanceof ul1.C17390a ? ((ul1.C17390a) sl1Var2).m51698j() : -1) >= 0) {
                sl1Var.s2(this.f20876a);
            } else {
                int iMo48451r = this.f20876a.mo48451r();
                int iY2 = this.f20876a.Y2();
                while (iMo48451r < iY2) {
                    int i = iMo48451r + 1;
                    byte bMo41185o = this.f20876a.mo41185o(iMo48451r);
                    if (bMo41185o != 10 && bMo41185o != 13 && bMo41185o != 58) {
                        sl1Var.d1(bMo41185o);
                    }
                    iMo48451r = i;
                }
            }
            sl1Var.d1((byte) 58);
            sl1Var.d1((byte) 32);
            sl1 sl1Var3 = this.f20877b;
            if ((sl1Var3 instanceof ul1.C17390a ? ((ul1.C17390a) sl1Var3).m51698j() : -1) >= 0 || this.f20879d >= 0) {
                sl1Var.s2(this.f20877b);
            } else {
                int iMo48451r2 = this.f20877b.mo48451r();
                int iY22 = this.f20877b.Y2();
                while (iMo48451r2 < iY22) {
                    int i2 = iMo48451r2 + 1;
                    byte bMo41185o2 = this.f20877b.mo41185o(iMo48451r2);
                    if (bMo41185o2 != 10 && bMo41185o2 != 13) {
                        sl1Var.d1(bMo41185o2);
                    }
                    iMo48451r2 = i2;
                }
            }
            zl1.m59573c(sl1Var);
        }

        /* renamed from: s */
        public final void m24209s(sl1 sl1Var, long j, int i) {
            this.f20882g = i;
            if (this.f20877b == null) {
                if (!sl1Var.y0()) {
                    sl1Var = new nvi(sl1Var);
                }
                this.f20877b = sl1Var;
                this.f20879d = j;
                this.f20878c = null;
                return;
            }
            if (sl1Var.y0()) {
                this.f20877b = sl1Var;
                this.f20879d = j;
                this.f20878c = null;
                return;
            }
            sl1 sl1Var2 = this.f20877b;
            if (sl1Var2 instanceof nvi) {
                ((nvi) sl1Var2).m41184h(sl1Var);
            } else {
                this.f20877b = new nvi(sl1Var);
            }
            this.f20879d = j;
            String str = this.f20878c;
            if (str == null) {
                return;
            }
            if (str.length() != sl1Var.length()) {
                this.f20878c = null;
                return;
            }
            int length = sl1Var.length();
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    return;
                }
                if (sl1Var.mo41185o(sl1Var.mo48451r() + i2) != this.f20878c.charAt(i2)) {
                    this.f20878c = null;
                    return;
                }
                length = i2;
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(this.f20881f == null ? "" : "<-");
            stringBuffer.append(m24202l());
            stringBuffer.append("=");
            stringBuffer.append(this.f20882g);
            stringBuffer.append("=");
            stringBuffer.append(this.f20877b);
            stringBuffer.append(this.f20880e != null ? "->" : "");
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        public C13091a(sl1 sl1Var, sl1 sl1Var2, long j, int i) {
            this.f20876a = sl1Var.k3();
            this.f20877b = sl1Var2.y0() ? sl1Var2 : new nvi(sl1Var2);
            this.f20880e = null;
            this.f20881f = null;
            this.f20882g = i;
            this.f20879d = j;
            this.f20878c = null;
        }
    }

    static {
        vl1 vl1Var = new vl1("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f20861j = vl1Var;
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};
        f20862k = strArr;
        f20863l = 3;
        f20860i.setID("GMT");
        vl1Var.m44360e(f20860i);
        f20864m = new SimpleDateFormat[strArr.length];
        for (int i = 0; i < f20863l; i++) {
            f20864m[i] = new SimpleDateFormat(f20862k[i], Locale.US);
            f20864m[i].setTimeZone(f20860i);
        }
        String strTrim = m24171e(0L, true).trim();
        f20865n = strTrim;
        f20866o = new pp1(strTrim);
        f20867p = new Float("1.0");
        f20868q = new Float(IdManager.DEFAULT_VERSION_NAME);
        m8g m8gVar = new m8g();
        f20869r = m8gVar;
        m8gVar.m38567e(null, f20867p);
        f20869r.m38567e("1.0", f20867p);
        f20869r.m38567e("1", f20867p);
        f20869r.m38567e("0.9", new Float("0.9"));
        f20869r.m38567e("0.8", new Float("0.8"));
        f20869r.m38567e("0.7", new Float("0.7"));
        f20869r.m38567e("0.66", new Float("0.66"));
        f20869r.m38567e("0.6", new Float("0.6"));
        f20869r.m38567e("0.5", new Float("0.5"));
        f20869r.m38567e("0.4", new Float("0.4"));
        f20869r.m38567e("0.33", new Float("0.33"));
        f20869r.m38567e("0.3", new Float("0.3"));
        f20869r.m38567e("0.2", new Float("0.2"));
        f20869r.m38567e("0.1", new Float("0.1"));
        f20869r.m38567e("0", f20868q);
        f20869r.m38567e(IdManager.DEFAULT_VERSION_NAME, f20868q);
    }

    /* renamed from: e */
    public static String m24171e(long j, boolean z) {
        StringBuffer stringBuffer = new StringBuffer(32);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f20860i);
        gregorianCalendar.setTimeInMillis(j);
        m24172f(stringBuffer, gregorianCalendar, z);
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static void m24172f(StringBuffer stringBuffer, Calendar calendar, boolean z) {
        int i = calendar.get(7);
        int i2 = calendar.get(5);
        int i3 = calendar.get(2);
        int i4 = calendar.get(1);
        int i5 = i4 / 100;
        int i6 = i4 % 100;
        int timeInMillis = (int) ((calendar.getTimeInMillis() / 1000) % SessionListener.SECONDS_IN_A_DAY);
        int i7 = timeInMillis % 60;
        int i8 = timeInMillis / 60;
        int i9 = i8 % 60;
        int i10 = i8 / 60;
        stringBuffer.append(f20858g[i]);
        stringBuffer.append(',');
        stringBuffer.append(TokenParser.SP);
        s8g.m47994a(stringBuffer, i2);
        if (z) {
            stringBuffer.append('-');
            stringBuffer.append(f20859h[i3]);
            stringBuffer.append('-');
            s8g.m47994a(stringBuffer, i5);
            s8g.m47994a(stringBuffer, i6);
        } else {
            stringBuffer.append(TokenParser.SP);
            stringBuffer.append(f20859h[i3]);
            stringBuffer.append(TokenParser.SP);
            s8g.m47994a(stringBuffer, i5);
            s8g.m47994a(stringBuffer, i6);
        }
        stringBuffer.append(TokenParser.SP);
        s8g.m47994a(stringBuffer, i10);
        stringBuffer.append(':');
        s8g.m47994a(stringBuffer, i9);
        stringBuffer.append(':');
        s8g.m47994a(stringBuffer, i7);
        stringBuffer.append(" GMT");
    }

    /* renamed from: t */
    public static String m24173t(String str, Map map) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            return str;
        }
        if (map == null) {
            return str.substring(0, iIndexOf).trim();
        }
        n5e n5eVar = new n5e(str.substring(iIndexOf), ";", false, true);
        while (n5eVar.hasMoreTokens()) {
            n5e n5eVar2 = new n5e(n5eVar.nextToken(), "= ");
            if (n5eVar2.hasMoreTokens()) {
                map.put(n5eVar2.nextToken(), n5eVar2.hasMoreTokens() ? n5eVar2.nextToken() : null);
            }
        }
        return str.substring(0, iIndexOf).trim();
    }

    /* renamed from: a */
    public void m24174a(sl1 sl1Var, sl1 sl1Var2) {
        m24175b(sl1Var, sl1Var2, -1L);
    }

    /* renamed from: b */
    public final void m24175b(sl1 sl1Var, sl1 sl1Var2, long j) {
        if (sl1Var2 == null) {
            throw new IllegalArgumentException("null value");
        }
        if (!(sl1Var instanceof ul1.C17390a)) {
            sl1Var = j38.f29699d.m51696h(sl1Var);
        }
        sl1 sl1Var3 = sl1Var;
        C13091a c13091a = (C13091a) this.f20872c.get(sl1Var3);
        C13091a c13091a2 = null;
        if (c13091a != null) {
            while (c13091a != null && c13091a.f20882g == this.f20871b) {
                c13091a2 = c13091a;
                c13091a = c13091a.f20880e;
            }
        }
        C13091a c13091a3 = c13091a2;
        if (c13091a != null) {
            c13091a.m24209s(sl1Var2, j, this.f20871b);
            return;
        }
        C13091a c13091a4 = new C13091a(sl1Var3, sl1Var2, j, this.f20871b, null);
        if (c13091a3 != null) {
            c13091a4.f20881f = c13091a3;
            c13091a3.f20880e = c13091a4;
        } else {
            this.f20872c.put(c13091a4.m24203m(), c13091a4);
        }
        this.f20870a.add(c13091a4);
    }

    /* renamed from: c */
    public void m24176c() {
        int i = this.f20871b + 1;
        this.f20871b = i;
        if (i <= 1000000) {
            return;
        }
        this.f20871b = 0;
        int size = this.f20870a.size();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            C13091a c13091a = (C13091a) this.f20870a.get(i2);
            if (c13091a != null) {
                c13091a.m24199i();
            }
            size = i2;
        }
    }

    /* renamed from: d */
    public void m24177d() {
        ArrayList arrayList = this.f20870a;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                C13091a c13091a = (C13091a) this.f20870a.get(i);
                if (c13091a != null) {
                    this.f20872c.remove(c13091a.m24203m());
                    c13091a.m24200j();
                }
                size = i;
            }
        }
        this.f20870a = null;
        this.f20874e = null;
        this.f20875f = null;
        this.f20873d = null;
    }

    /* renamed from: g */
    public sl1 m24178g(sl1 sl1Var) {
        C13091a c13091aM24180i = m24180i(sl1Var);
        if (c13091aM24180i == null || c13091aM24180i.f20882g != this.f20871b) {
            return null;
        }
        return c13091aM24180i.f20877b;
    }

    /* renamed from: h */
    public final C13091a m24179h(String str) {
        return (C13091a) this.f20872c.get(j38.f29699d.m51695g(str));
    }

    /* renamed from: i */
    public final C13091a m24180i(sl1 sl1Var) {
        return (C13091a) this.f20872c.get(sl1Var);
    }

    /* renamed from: j */
    public Iterator m24181j() {
        return new d38(this, this.f20871b);
    }

    /* renamed from: k */
    public long m24182k(sl1 sl1Var) {
        C13091a c13091aM24180i = m24180i(sl1Var);
        if (c13091aM24180i == null || c13091aM24180i.f20882g != this.f20871b) {
            return -1L;
        }
        return c13091aM24180i.m24201k();
    }

    /* renamed from: l */
    public String m24183l(String str) {
        C13091a c13091aM24179h = m24179h(str);
        if (c13091aM24179h == null || c13091aM24179h.f20882g != this.f20871b) {
            return null;
        }
        return c13091aM24179h.m24205o();
    }

    /* renamed from: m */
    public String m24184m(sl1 sl1Var) {
        C13091a c13091aM24180i = m24180i(sl1Var);
        if (c13091aM24180i == null || c13091aM24180i.f20882g != this.f20871b) {
            return null;
        }
        return zl1.m59576f(c13091aM24180i.f20877b);
    }

    /* renamed from: n */
    public void m24185n(String str, String str2) {
        m24188q(j38.f29699d.m51695g(str), str2 != null ? i38.f27983d.m51695g(str2) : null, -1L);
    }

    /* renamed from: o */
    public void m24186o(sl1 sl1Var, String str) {
        m24188q(sl1Var, i38.f27983d.m51695g(str), -1L);
    }

    /* renamed from: p */
    public void m24187p(sl1 sl1Var, sl1 sl1Var2) {
        m24188q(sl1Var, sl1Var2, -1L);
    }

    /* renamed from: q */
    public void m24188q(sl1 sl1Var, sl1 sl1Var2, long j) {
        if (sl1Var2 == null) {
            m24190s(sl1Var);
            return;
        }
        if (!(sl1Var instanceof ul1.C17390a)) {
            sl1Var = j38.f29699d.m51696h(sl1Var);
        }
        sl1 sl1Var3 = sl1Var;
        C13091a c13091a = (C13091a) this.f20872c.get(sl1Var3);
        if (c13091a == null) {
            C13091a c13091a2 = new C13091a(sl1Var3, sl1Var2, j, this.f20871b, null);
            this.f20870a.add(c13091a2);
            this.f20872c.put(c13091a2.m24203m(), c13091a2);
        } else {
            c13091a.m24209s(sl1Var2, j, this.f20871b);
            for (C13091a c13091a3 = c13091a.f20880e; c13091a3 != null; c13091a3 = c13091a3.f20880e) {
                c13091a3.m24199i();
            }
        }
    }

    /* renamed from: r */
    public void m24189r(String str, long j) {
        m24188q(j38.f29699d.m51695g(str), zl1.m59577g(j), j);
    }

    /* renamed from: s */
    public void m24190s(sl1 sl1Var) {
        C13091a c13091a = (C13091a) this.f20872c.get(sl1Var);
        if (c13091a != null) {
            while (c13091a != null) {
                c13091a.m24199i();
                c13091a = c13091a.f20880e;
            }
        }
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < this.f20870a.size(); i++) {
                C13091a c13091a = (C13091a) this.f20870a.get(i);
                if (c13091a != null && c13091a.f20882g == this.f20871b) {
                    String strM24202l = c13091a.m24202l();
                    if (strM24202l != null) {
                        stringBuffer.append(strM24202l);
                    }
                    stringBuffer.append(": ");
                    String strM24205o = c13091a.m24205o();
                    if (strM24205o != null) {
                        stringBuffer.append(strM24205o);
                    }
                    stringBuffer.append("\r\n");
                }
            }
            stringBuffer.append("\r\n");
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
