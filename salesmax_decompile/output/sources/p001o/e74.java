package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.C18739a;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SM;

/* loaded from: classes6.dex */
public final class e74 {

    /* renamed from: k */
    public static final C13120a f21090k = new C13120a(null);

    /* renamed from: l */
    public static final Pattern f21091l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f21092m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n */
    public static final Pattern f21093n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o */
    public static final Pattern f21094o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f21095a;

    /* renamed from: b */
    public final String f21096b;

    /* renamed from: c */
    public final long f21097c;

    /* renamed from: d */
    public final String f21098d;

    /* renamed from: e */
    public final String f21099e;

    /* renamed from: f */
    public final boolean f21100f;

    /* renamed from: g */
    public final boolean f21101g;

    /* renamed from: h */
    public final boolean f21102h;

    /* renamed from: i */
    public final boolean f21103i;

    /* renamed from: j */
    public final String f21104j;

    /* renamed from: o.e74$a */
    public static final class C13120a {
        public C13120a() {
        }

        public /* synthetic */ C13120a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m24456a(String str, int i, int i2, boolean z) {
            boolean z2;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    z2 = false;
                    if ('0' <= cCharAt && cCharAt < ':') {
                        z2 = true;
                    } else {
                        if (!('a' <= cCharAt && cCharAt < '{')) {
                            if (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':') {
                            }
                        }
                    }
                }
                if (z2 == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        public final boolean m24457b(String str, String str2) {
            if (sq8.m48644c(str, str2)) {
                return true;
            }
            return e9g.m24605w(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !wfj.m54337a(str);
        }

        /* renamed from: c */
        public final e74 m24458c(w48 w48Var, String str) {
            sq8.m48649h(w48Var, ImagesContract.URL);
            sq8.m48649h(str, "setCookie");
            return m24459d(System.currentTimeMillis(), w48Var, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00e9 A[PHI: r1
          0x00e9: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:48:0x00e7, B:59:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final e74 m24459d(long j, w48 w48Var, String str) throws NumberFormatException {
            long j2;
            long j3;
            e74 e74Var;
            String str2;
            String str3;
            sq8.m48649h(w48Var, ImagesContract.URL);
            sq8.m48649h(str, "setCookie");
            int iM28630j = ggj.m28630j(str, ';', 0, 0, 6, null);
            int iM28630j2 = ggj.m28630j(str, '=', 0, iM28630j, 2, null);
            if (iM28630j2 == iM28630j) {
                return null;
            }
            String strM28618G = ggj.m28618G(str, 0, iM28630j2, 1, null);
            if ((strM28618G.length() == 0) || ggj.m28637q(strM28618G) != -1) {
                return null;
            }
            String strM28617F = ggj.m28617F(str, iM28630j2 + 1, iM28630j);
            if (ggj.m28637q(strM28617F) != -1) {
                return null;
            }
            int i = iM28630j + 1;
            int length = str.length();
            String strM24461f = null;
            String str4 = null;
            String str5 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long jM24463h = -1;
            long jM24462g = 253402300799999L;
            while (i < length) {
                int iM28628h = ggj.m28628h(str, ';', i, length);
                int iM28628h2 = ggj.m28628h(str, '=', i, iM28628h);
                String strM28617F2 = ggj.m28617F(str, i, iM28628h2);
                String strM28617F3 = iM28628h2 < iM28628h ? ggj.m28617F(str, iM28628h2 + 1, iM28628h) : "";
                if (e9g.m24606x(strM28617F2, ClientCookie.EXPIRES_ATTR, true)) {
                    try {
                        jM24462g = m24462g(strM28617F3, 0, strM28617F3.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (e9g.m24606x(strM28617F2, ClientCookie.MAX_AGE_ATTR, true)) {
                    jM24463h = m24463h(strM28617F3);
                    z3 = true;
                } else if (e9g.m24606x(strM28617F2, ClientCookie.DOMAIN_ATTR, true)) {
                    strM24461f = m24461f(strM28617F3);
                    z4 = false;
                } else if (e9g.m24606x(strM28617F2, ClientCookie.PATH_ATTR, true)) {
                    str5 = strM28617F3;
                } else if (e9g.m24606x(strM28617F2, ClientCookie.SECURE_ATTR, true)) {
                    z = true;
                } else if (e9g.m24606x(strM28617F2, "httponly", true)) {
                    z2 = true;
                } else if (e9g.m24606x(strM28617F2, "samesite", true)) {
                    str4 = strM28617F3;
                }
                i = iM28628h + 1;
            }
            long j4 = Long.MIN_VALUE;
            if (jM24463h != Long.MIN_VALUE) {
                if (jM24463h != -1) {
                    j4 = j + (jM24463h <= 9223372036854775L ? jM24463h * 1000 : Long.MAX_VALUE);
                    if (j4 >= j) {
                        j3 = 253402300799999L;
                        if (j4 <= 253402300799999L) {
                            j2 = j4;
                        }
                    } else {
                        j3 = 253402300799999L;
                    }
                    j2 = j3;
                } else {
                    j2 = jM24462g;
                }
            }
            String strM53877h = w48Var.m53877h();
            if (strM24461f == null) {
                str2 = strM53877h;
                e74Var = null;
            } else {
                if (!m24457b(strM53877h, strM24461f)) {
                    return null;
                }
                e74Var = null;
                str2 = strM24461f;
            }
            if (strM53877h.length() != str2.length() && C18739a.f57937g.m60189c().m60183c(str2) == null) {
                return e74Var;
            }
            String strSubstring = "/";
            String str6 = str5;
            if (str6 == null || !e9g.m24597K(str6, "/", false, 2, e74Var)) {
                String strM53873c = w48Var.m53873c();
                int iG0 = f9g.g0(strM53873c, '/', 0, false, 6, null);
                if (iG0 != 0) {
                    strSubstring = strM53873c.substring(0, iG0);
                    sq8.m48648g(strSubstring, "substring(...)");
                }
                str3 = strSubstring;
            } else {
                str3 = str6;
            }
            return new e74(strM28618G, strM28617F, j2, str2, str3, z, z2, z3, z4, str4, null);
        }

        /* renamed from: e */
        public final List m24460e(w48 w48Var, wx7 wx7Var) {
            sq8.m48649h(w48Var, ImagesContract.URL);
            sq8.m48649h(wx7Var, "headers");
            List listM55334y = wx7Var.m55334y(SM.SET_COOKIE);
            int size = listM55334y.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                e74 e74VarM24458c = m24458c(w48Var, (String) listM55334y.get(i));
                if (e74VarM24458c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e74VarM24458c);
                }
            }
            if (arrayList == null) {
                return ch3.m21246k();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            sq8.m48646e(listUnmodifiableList);
            return listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m24461f(String str) {
            if (!(!e9g.m24605w(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strM54347k = wfj.m54347k(f9g.u0(str, "."));
            if (strM54347k != null) {
                return strM54347k;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m24462g(String str, int i, int i2) throws NumberFormatException {
            int iM24456a = m24456a(str, i, i2, false);
            Matcher matcher = e74.f21094o.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int iB0 = -1;
            int i6 = -1;
            int i7 = -1;
            while (iM24456a < i2) {
                int iM24456a2 = m24456a(str, iM24456a + 1, i2, true);
                matcher.region(iM24456a, iM24456a2);
                if (i4 == -1 && matcher.usePattern(e74.f21094o).matches()) {
                    String strGroup = matcher.group(1);
                    sq8.m48648g(strGroup, "group(...)");
                    i4 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    sq8.m48648g(strGroup2, "group(...)");
                    i6 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    sq8.m48648g(strGroup3, "group(...)");
                    i7 = Integer.parseInt(strGroup3);
                } else if (i5 == -1 && matcher.usePattern(e74.f21093n).matches()) {
                    String strGroup4 = matcher.group(1);
                    sq8.m48648g(strGroup4, "group(...)");
                    i5 = Integer.parseInt(strGroup4);
                } else if (iB0 == -1 && matcher.usePattern(e74.f21092m).matches()) {
                    String strGroup5 = matcher.group(1);
                    sq8.m48648g(strGroup5, "group(...)");
                    Locale locale = Locale.US;
                    sq8.m48648g(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    String strPattern = e74.f21092m.pattern();
                    sq8.m48648g(strPattern, "pattern(...)");
                    iB0 = f9g.b0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(e74.f21091l).matches()) {
                    String strGroup6 = matcher.group(1);
                    sq8.m48648g(strGroup6, "group(...)");
                    i3 = Integer.parseInt(strGroup6);
                }
                iM24456a = m24456a(str, iM24456a2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (!(i3 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iB0 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i5 && i5 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && i4 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && i6 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && i7 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(jgj.f30420d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iB0 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m24463h(String str) throws NumberFormatException {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new mge("-?\\d+").m38995g(str)) {
                    return e9g.m24597K(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }
    }

    public /* synthetic */ e74(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, id5 id5Var) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }

    /* renamed from: e */
    public final String m24453e() {
        return this.f21095a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e74) {
            e74 e74Var = (e74) obj;
            if (sq8.m48644c(e74Var.f21095a, this.f21095a) && sq8.m48644c(e74Var.f21096b, this.f21096b) && e74Var.f21097c == this.f21097c && sq8.m48644c(e74Var.f21098d, this.f21098d) && sq8.m48644c(e74Var.f21099e, this.f21099e) && e74Var.f21100f == this.f21100f && e74Var.f21101g == this.f21101g && e74Var.f21102h == this.f21102h && e74Var.f21103i == this.f21103i && sq8.m48644c(e74Var.f21104j, this.f21104j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m24454f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21095a);
        sb.append('=');
        sb.append(this.f21096b);
        if (this.f21102h) {
            if (this.f21097c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(sz4.m49088b(new Date(this.f21097c)));
            }
        }
        if (!this.f21103i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f21098d);
        }
        sb.append("; path=");
        sb.append(this.f21099e);
        if (this.f21100f) {
            sb.append("; secure");
        }
        if (this.f21101g) {
            sb.append("; httponly");
        }
        if (this.f21104j != null) {
            sb.append("; samesite=");
            sb.append(this.f21104j);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: g */
    public final String m24455g() {
        return this.f21096b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f21095a.hashCode()) * 31) + this.f21096b.hashCode()) * 31) + Long.hashCode(this.f21097c)) * 31) + this.f21098d.hashCode()) * 31) + this.f21099e.hashCode()) * 31) + Boolean.hashCode(this.f21100f)) * 31) + Boolean.hashCode(this.f21101g)) * 31) + Boolean.hashCode(this.f21102h)) * 31) + Boolean.hashCode(this.f21103i)) * 31;
        String str = this.f21104j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return m24454f(false);
    }

    public e74(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f21095a = str;
        this.f21096b = str2;
        this.f21097c = j;
        this.f21098d = str3;
        this.f21099e = str4;
        this.f21100f = z;
        this.f21101g = z2;
        this.f21102h = z3;
        this.f21103i = z4;
        this.f21104j = str5;
    }
}
