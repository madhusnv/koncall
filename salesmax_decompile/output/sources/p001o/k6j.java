package p001o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k6j {

    /* renamed from: f */
    public int f31554f;

    /* renamed from: h */
    public int f31556h;

    /* renamed from: o */
    public float f31563o;

    /* renamed from: a */
    public String f31549a = "";

    /* renamed from: b */
    public String f31550b = "";

    /* renamed from: c */
    public Set f31551c = Collections.emptySet();

    /* renamed from: d */
    public String f31552d = "";

    /* renamed from: e */
    public String f31553e = null;

    /* renamed from: g */
    public boolean f31555g = false;

    /* renamed from: i */
    public boolean f31557i = false;

    /* renamed from: j */
    public int f31558j = -1;

    /* renamed from: k */
    public int f31559k = -1;

    /* renamed from: l */
    public int f31560l = -1;

    /* renamed from: m */
    public int f31561m = -1;

    /* renamed from: n */
    public int f31562n = -1;

    /* renamed from: p */
    public int f31564p = -1;

    /* renamed from: q */
    public boolean f31565q = false;

    /* renamed from: B */
    public static int m35060B(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: A */
    public k6j m35061A(boolean z) {
        this.f31559k = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int m35062a() {
        if (this.f31557i) {
            return this.f31556h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m35063b() {
        return this.f31565q;
    }

    /* renamed from: c */
    public int m35064c() {
        if (this.f31555g) {
            return this.f31554f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m35065d() {
        return this.f31553e;
    }

    /* renamed from: e */
    public float m35066e() {
        return this.f31563o;
    }

    /* renamed from: f */
    public int m35067f() {
        return this.f31562n;
    }

    /* renamed from: g */
    public int m35068g() {
        return this.f31564p;
    }

    /* renamed from: h */
    public int m35069h(String str, String str2, Set set, String str3) {
        if (this.f31549a.isEmpty() && this.f31550b.isEmpty() && this.f31551c.isEmpty() && this.f31552d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM35060B = m35060B(m35060B(m35060B(0, this.f31549a, str, 1073741824), this.f31550b, str2, 2), this.f31552d, str3, 4);
        if (iM35060B == -1 || !set.containsAll(this.f31551c)) {
            return 0;
        }
        return iM35060B + (this.f31551c.size() * 4);
    }

    /* renamed from: i */
    public int m35070i() {
        int i = this.f31560l;
        if (i == -1 && this.f31561m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f31561m == 1 ? 2 : 0);
    }

    /* renamed from: j */
    public boolean m35071j() {
        return this.f31557i;
    }

    /* renamed from: k */
    public boolean m35072k() {
        return this.f31555g;
    }

    /* renamed from: l */
    public boolean m35073l() {
        return this.f31558j == 1;
    }

    /* renamed from: m */
    public boolean m35074m() {
        return this.f31559k == 1;
    }

    /* renamed from: n */
    public k6j m35075n(int i) {
        this.f31556h = i;
        this.f31557i = true;
        return this;
    }

    /* renamed from: o */
    public k6j m35076o(boolean z) {
        this.f31560l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public k6j m35077p(boolean z) {
        this.f31565q = z;
        return this;
    }

    /* renamed from: q */
    public k6j m35078q(int i) {
        this.f31554f = i;
        this.f31555g = true;
        return this;
    }

    /* renamed from: r */
    public k6j m35079r(String str) {
        this.f31553e = str == null ? null : kp0.m35995e(str);
        return this;
    }

    /* renamed from: s */
    public k6j m35080s(float f) {
        this.f31563o = f;
        return this;
    }

    /* renamed from: t */
    public k6j m35081t(int i) {
        this.f31562n = i;
        return this;
    }

    /* renamed from: u */
    public k6j m35082u(boolean z) {
        this.f31561m = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public k6j m35083v(int i) {
        this.f31564p = i;
        return this;
    }

    /* renamed from: w */
    public void m35084w(String[] strArr) {
        this.f31551c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void m35085x(String str) {
        this.f31549a = str;
    }

    /* renamed from: y */
    public void m35086y(String str) {
        this.f31550b = str;
    }

    /* renamed from: z */
    public void m35087z(String str) {
        this.f31552d = str;
    }
}
