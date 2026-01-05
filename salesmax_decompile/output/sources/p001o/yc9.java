package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class yc9 {

    /* renamed from: c */
    public static final yc9 f55214c = new yc9("COMPOSITION");

    /* renamed from: a */
    public final List f55215a;

    /* renamed from: b */
    public zc9 f55216b;

    public yc9(String... strArr) {
        this.f55215a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public yc9 m57512a(String str) {
        yc9 yc9Var = new yc9(this);
        yc9Var.f55215a.add(str);
        return yc9Var;
    }

    /* renamed from: b */
    public final boolean m57513b() {
        return ((String) this.f55215a.get(r0.size() - 1)).equals("**");
    }

    /* renamed from: c */
    public boolean m57514c(String str, int i) {
        if (i >= this.f55215a.size()) {
            return false;
        }
        boolean z = i == this.f55215a.size() - 1;
        String str2 = (String) this.f55215a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f55215a.size() + (-2) && m57513b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) this.f55215a.get(i + 1)).equals(str)) {
            return i == this.f55215a.size() + (-2) || (i == this.f55215a.size() + (-3) && m57513b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f55215a.size() - 1) {
            return false;
        }
        return ((String) this.f55215a.get(i2)).equals(str);
    }

    /* renamed from: d */
    public zc9 m57515d() {
        return this.f55216b;
    }

    /* renamed from: e */
    public int m57516e(String str, int i) {
        if (m57517f(str)) {
            return 0;
        }
        if (((String) this.f55215a.get(i)).equals("**")) {
            return (i != this.f55215a.size() - 1 && ((String) this.f55215a.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: f */
    public final boolean m57517f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: g */
    public boolean m57518g(String str, int i) {
        if (m57517f(str)) {
            return true;
        }
        if (i >= this.f55215a.size()) {
            return false;
        }
        return ((String) this.f55215a.get(i)).equals(str) || ((String) this.f55215a.get(i)).equals("**") || ((String) this.f55215a.get(i)).equals("*");
    }

    /* renamed from: h */
    public boolean m57519h(String str, int i) {
        return "__container".equals(str) || i < this.f55215a.size() - 1 || ((String) this.f55215a.get(i)).equals("**");
    }

    /* renamed from: i */
    public yc9 m57520i(zc9 zc9Var) {
        yc9 yc9Var = new yc9(this);
        yc9Var.f55216b = zc9Var;
        return yc9Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f55215a);
        sb.append(",resolved=");
        sb.append(this.f55216b != null);
        sb.append('}');
        return sb.toString();
    }

    public yc9(yc9 yc9Var) {
        this.f55215a = new ArrayList(yc9Var.f55215a);
        this.f55216b = yc9Var.f55216b;
    }
}
