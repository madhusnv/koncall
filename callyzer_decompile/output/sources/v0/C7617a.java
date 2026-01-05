package v0;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C7617a implements Comparable {

    /* renamed from: e */
    public static final C7617a f36766e;

    /* renamed from: f */
    public static final C7617a f36767f;

    /* renamed from: g */
    public static final Pattern f36768g;

    /* renamed from: a */
    public final int f36769a;

    /* renamed from: b */
    public final int f36770b;

    /* renamed from: c */
    public final int f36771c;

    /* renamed from: d */
    public final String f36772d;

    static {
        new C7617a(1, 0, 0, "");
        new C7617a(1, 1, 0, "");
        new C7617a(1, 2, 0, "");
        f36766e = new C7617a(1, 3, 0, "");
        f36767f = new C7617a(1, 4, 0, "");
        new C7617a(1, 5, 0, "");
        f36768g = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    public C7617a(int i10, int i11, int i12, String str) {
        this.f36769a = i10;
        this.f36770b = i11;
        this.f36771c = i12;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f36772d = str;
    }

    /* renamed from: a */
    public static BigInteger m14502a(C7617a c7617a) {
        return BigInteger.valueOf(c7617a.f36769a).shiftLeft(32).or(BigInteger.valueOf(c7617a.f36770b)).shiftLeft(32).or(BigInteger.valueOf(c7617a.f36771c));
    }

    /* renamed from: b */
    public static C7617a m14503b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f36768g.matcher(str);
        if (matcher.matches()) {
            return new C7617a(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m14502a(this).compareTo(m14502a((C7617a) obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7617a)) {
            return false;
        }
        C7617a c7617a = (C7617a) obj;
        return Integer.valueOf(this.f36769a).equals(Integer.valueOf(c7617a.f36769a)) && Integer.valueOf(this.f36770b).equals(Integer.valueOf(c7617a.f36770b)) && Integer.valueOf(this.f36771c).equals(Integer.valueOf(c7617a.f36771c));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36769a), Integer.valueOf(this.f36770b), Integer.valueOf(this.f36771c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f36769a + "." + this.f36770b + "." + this.f36771c);
        String str = this.f36772d;
        if (!TextUtils.isEmpty(str)) {
            sb2.append("-" + str);
        }
        return sb2.toString();
    }
}
