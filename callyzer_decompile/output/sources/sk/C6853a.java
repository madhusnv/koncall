package sk;

import com.google.i18n.phonenumbers.C1404a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C4001v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sk.a */
/* loaded from: classes.dex */
public final class C6853a {

    /* renamed from: t */
    public static final C6859g f32532t;

    /* renamed from: u */
    public static final Pattern f32533u;

    /* renamed from: v */
    public static final Pattern f32534v;

    /* renamed from: w */
    public static final Pattern f32535w;

    /* renamed from: a */
    public final StringBuilder f32536a = new StringBuilder();

    /* renamed from: b */
    public String f32537b = "";

    /* renamed from: c */
    public final StringBuilder f32538c = new StringBuilder();

    /* renamed from: d */
    public final StringBuilder f32539d = new StringBuilder();

    /* renamed from: e */
    public boolean f32540e = true;

    /* renamed from: f */
    public boolean f32541f = false;

    /* renamed from: g */
    public boolean f32542g = false;

    /* renamed from: h */
    public boolean f32543h = false;

    /* renamed from: i */
    public final C1404a f32544i;

    /* renamed from: j */
    public final String f32545j;

    /* renamed from: k */
    public final C6860h f32546k;

    /* renamed from: l */
    public C6860h f32547l;

    /* renamed from: m */
    public int f32548m;

    /* renamed from: n */
    public final StringBuilder f32549n;

    /* renamed from: o */
    public boolean f32550o;

    /* renamed from: p */
    public String f32551p;

    /* renamed from: q */
    public final StringBuilder f32552q;

    /* renamed from: r */
    public final ArrayList f32553r;

    /* renamed from: s */
    public final C4001v f32554s;

    static {
        C6859g c6859g = new C6859g();
        c6859g.f32574N = "<ignored>";
        c6859g.f32576T = "NA";
        f32532t = c6859g;
        f32533u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        f32534v = Pattern.compile("[- ]");
        f32535w = Pattern.compile("\u2008");
    }

    public C6853a(String str) {
        C1404a c1404aM4499e = C1404a.m4499e();
        this.f32544i = c1404aM4499e;
        this.f32548m = 0;
        this.f32549n = new StringBuilder();
        this.f32550o = false;
        this.f32551p = "";
        this.f32552q = new StringBuilder();
        this.f32553r = new ArrayList();
        this.f32554s = new C4001v(64);
        this.f32545j = str;
        C6860h c6860hM4509g = c1404aM4499e.m4509g(c1404aM4499e.m4511k(c1404aM4499e.m4507d(str)));
        c6860hM4509g = c6860hM4509g == null ? f32532t : c6860hM4509g;
        this.f32547l = c6860hM4509g;
        this.f32546k = c6860hM4509g;
    }

    /* renamed from: a */
    public final String m13051a(String str) {
        StringBuilder sb2 = this.f32549n;
        int length = sb2.length();
        if (!this.f32550o || length <= 0 || sb2.charAt(length - 1) == ' ') {
            return ((Object) sb2) + str;
        }
        return new String(sb2) + ' ' + str;
    }

    /* renamed from: b */
    public final String m13052b() {
        StringBuilder sb2 = this.f32552q;
        if (sb2.length() < 3) {
            return m13051a(sb2.toString());
        }
        String string = sb2.toString();
        ArrayList arrayList = (this.f32542g && this.f32551p.length() == 0 && this.f32547l.f44791d1.size() > 0) ? this.f32547l.f44791d1 : this.f32547l.f44790c1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C6858f c6858f = (C6858f) obj;
            if (this.f32551p.length() > 0) {
                String str = c6858f.f32559e;
                if ((str.length() == 0 || C1404a.f7199v.matcher(str).matches()) && !c6858f.f32560f && !c6858f.f32561g) {
                }
            }
            if (this.f32551p.length() == 0 && !this.f32542g) {
                String str2 = c6858f.f32559e;
                if (str2.length() == 0 || C1404a.f7199v.matcher(str2).matches() || c6858f.f32560f) {
                }
            }
            if (f32533u.matcher(c6858f.f32556b).matches()) {
                this.f32553r.add(c6858f);
            }
        }
        m13060j(string);
        String strM13055e = m13055e();
        return strM13055e.length() > 0 ? strM13055e : m13059i() ? m13056f() : this.f32538c.toString();
    }

    /* renamed from: c */
    public final boolean m13053c() {
        StringBuilder sb2;
        C1404a c1404a;
        int iM4506c;
        StringBuilder sb3 = this.f32552q;
        if (sb3.length() == 0 || (iM4506c = (c1404a = this.f32544i).m4506c(sb3, (sb2 = new StringBuilder()))) == 0) {
            return false;
        }
        sb3.setLength(0);
        sb3.append((CharSequence) sb2);
        String strM4511k = c1404a.m4511k(iM4506c);
        if ("001".equals(strM4511k)) {
            this.f32547l = c1404a.m4508f(iM4506c);
        } else if (!strM4511k.equals(this.f32545j)) {
            C6860h c6860hM4509g = c1404a.m4509g(c1404a.m4511k(c1404a.m4507d(strM4511k)));
            if (c6860hM4509g == null) {
                c6860hM4509g = f32532t;
            }
            this.f32547l = c6860hM4509g;
        }
        String string = Integer.toString(iM4506c);
        StringBuilder sb4 = this.f32549n;
        sb4.append(string);
        sb4.append(' ');
        this.f32551p = "";
        return true;
    }

    /* renamed from: d */
    public final boolean m13054d() {
        Pattern patternM8777r = this.f32554s.m8777r("\\+|" + this.f32547l.f32576T);
        StringBuilder sb2 = this.f32539d;
        Matcher matcher = patternM8777r.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f32542g = true;
        int iEnd = matcher.end();
        StringBuilder sb3 = this.f32552q;
        sb3.setLength(0);
        sb3.append(sb2.substring(iEnd));
        StringBuilder sb4 = this.f32549n;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, iEnd));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    /* renamed from: e */
    public final String m13055e() {
        ArrayList arrayList = this.f32553r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C6858f c6858f = (C6858f) obj;
            Matcher matcher = this.f32554s.m8777r(c6858f.f32555a).matcher(this.f32552q);
            if (matcher.matches()) {
                this.f32550o = f32534v.matcher(c6858f.f32559e).find();
                String strM13051a = m13051a(matcher.replaceAll(c6858f.f32556b));
                if (C1404a.m4504s(strM13051a, C1404a.f7186i).contentEquals(this.f32539d)) {
                    return strM13051a;
                }
            }
        }
        return "";
    }

    /* renamed from: f */
    public final String m13056f() {
        StringBuilder sb2 = this.f32552q;
        int length = sb2.length();
        if (length <= 0) {
            return this.f32549n.toString();
        }
        String strM13057g = "";
        for (int i10 = 0; i10 < length; i10++) {
            strM13057g = m13057g(sb2.charAt(i10));
        }
        return this.f32540e ? m13051a(strM13057g) : this.f32538c.toString();
    }

    /* renamed from: g */
    public final String m13057g(char c2) {
        Pattern pattern = f32535w;
        StringBuilder sb2 = this.f32536a;
        Matcher matcher = pattern.matcher(sb2);
        if (!matcher.find(this.f32548m)) {
            if (this.f32553r.size() == 1) {
                this.f32540e = false;
            }
            this.f32537b = "";
            return this.f32538c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c2));
        sb2.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.f32548m = iStart;
        return sb2.substring(0, iStart + 1);
    }

    /* renamed from: h */
    public final String m13058h(char c2, boolean z6) {
        StringBuilder sb2 = this.f32538c;
        sb2.append(c2);
        if (z6) {
            sb2.length();
        }
        boolean zIsDigit = Character.isDigit(c2);
        StringBuilder sb3 = this.f32539d;
        StringBuilder sb4 = this.f32552q;
        if (zIsDigit || (sb2.length() == 1 && C1404a.f7189l.matcher(Character.toString(c2)).matches())) {
            if (c2 == '+') {
                sb3.append(c2);
            } else {
                c2 = Character.forDigit(Character.digit(c2, 10), 10);
                sb3.append(c2);
                sb4.append(c2);
            }
            if (z6) {
                sb3.length();
            }
        } else {
            this.f32540e = false;
            this.f32541f = true;
        }
        boolean z10 = this.f32540e;
        ArrayList arrayList = this.f32553r;
        StringBuilder sb5 = this.f32549n;
        if (z10) {
            int length = sb3.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb2.toString();
            }
            if (length == 3) {
                if (!m13054d()) {
                    this.f32551p = m13061k();
                    return m13052b();
                }
                this.f32543h = true;
            }
            if (this.f32543h) {
                if (m13053c()) {
                    this.f32543h = false;
                }
                return ((Object) sb5) + sb4.toString();
            }
            if (arrayList.size() <= 0) {
                return m13052b();
            }
            String strM13057g = m13057g(c2);
            String strM13055e = m13055e();
            if (strM13055e.length() > 0) {
                return strM13055e;
            }
            m13060j(sb4.toString());
            return m13059i() ? m13056f() : this.f32540e ? m13051a(strM13057g) : sb2.toString();
        }
        if (this.f32541f) {
            return sb2.toString();
        }
        boolean zM13054d = m13054d();
        StringBuilder sb6 = this.f32536a;
        if (!zM13054d) {
            if (this.f32551p.length() > 0) {
                sb4.insert(0, this.f32551p);
                sb5.setLength(sb5.lastIndexOf(this.f32551p));
            }
            if (!this.f32551p.equals(m13061k())) {
                sb5.append(' ');
                this.f32540e = true;
                this.f32543h = false;
                arrayList.clear();
                this.f32548m = 0;
                sb6.setLength(0);
                this.f32537b = "";
                return m13052b();
            }
        } else if (m13053c()) {
            this.f32540e = true;
            this.f32543h = false;
            arrayList.clear();
            this.f32548m = 0;
            sb6.setLength(0);
            this.f32537b = "";
            return m13052b();
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public final boolean m13059i() {
        Iterator it = this.f32553r.iterator();
        while (it.hasNext()) {
            C6858f c6858f = (C6858f) it.next();
            String str = c6858f.f32555a;
            if (this.f32537b.equals(str)) {
                return false;
            }
            String str2 = c6858f.f32555a;
            StringBuilder sb2 = this.f32536a;
            sb2.setLength(0);
            String str3 = c6858f.f32556b;
            Matcher matcher = this.f32554s.m8777r(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.f32552q.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb2.append(strReplaceAll);
                this.f32537b = str;
                this.f32550o = f32534v.matcher(c6858f.f32559e).find();
                this.f32548m = 0;
                return true;
            }
            it.remove();
        }
        this.f32540e = false;
        return false;
    }

    /* renamed from: j */
    public final void m13060j(String str) {
        int length = str.length() - 3;
        Iterator it = this.f32553r.iterator();
        while (it.hasNext()) {
            C6858f c6858f = (C6858f) it.next();
            ArrayList arrayList = c6858f.f32557c;
            ArrayList arrayList2 = c6858f.f32557c;
            if (arrayList.size() != 0) {
                if (!this.f32554s.m8777r((String) arrayList2.get(Math.min(length, arrayList2.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m13061k() {
        /*
            r7 = this;
            sk.h r0 = r7.f32547l
            int r0 = r0.f32575O
            java.lang.StringBuilder r1 = r7.f32549n
            r2 = 0
            java.lang.StringBuilder r3 = r7.f32552q
            r4 = 1
            if (r0 != r4) goto L2d
            char r0 = r3.charAt(r2)
            r5 = 49
            if (r0 != r5) goto L2d
            char r0 = r3.charAt(r4)
            r6 = 48
            if (r0 == r6) goto L2d
            char r0 = r3.charAt(r4)
            if (r0 == r5) goto L2d
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.f32542g = r4
            goto L5a
        L2d:
            sk.h r0 = r7.f32547l
            boolean r5 = r0.X0
            if (r5 == 0) goto L59
            k4.v r5 = r7.f32554s
            java.lang.String r0 = r0.Y0
            java.util.regex.Pattern r0 = r5.m8777r(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L59
            int r5 = r0.end()
            if (r5 <= 0) goto L59
            r7.f32542g = r4
            int r4 = r0.end()
            java.lang.String r0 = r3.substring(r2, r4)
            r1.append(r0)
            goto L5a
        L59:
            r4 = r2
        L5a:
            java.lang.String r0 = r3.substring(r2, r4)
            r3.delete(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.C6853a.m13061k():java.lang.String");
    }
}
