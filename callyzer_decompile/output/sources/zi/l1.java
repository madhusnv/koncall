package zi;

import c9.C0910e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a */
    public final String f43172a;

    /* renamed from: b */
    public final String f43173b;

    /* renamed from: c */
    public final String f43174c;

    /* renamed from: d */
    public final String f43175d;

    /* renamed from: e */
    public final int f43176e;

    /* renamed from: f */
    public final C0910e f43177f;

    public l1(String str, String str2, String str3, String str4, int i10, C0910e c0910e) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f43172a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f43173b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f43174c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f43175d = str4;
        this.f43176e = i10;
        this.f43177f = c0910e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f43172a.equals(l1Var.f43172a) && this.f43173b.equals(l1Var.f43173b) && this.f43174c.equals(l1Var.f43174c) && this.f43175d.equals(l1Var.f43175d) && this.f43176e == l1Var.f43176e && this.f43177f.equals(l1Var.f43177f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f43172a.hashCode() ^ 1000003) * 1000003) ^ this.f43173b.hashCode()) * 1000003) ^ this.f43174c.hashCode()) * 1000003) ^ this.f43175d.hashCode()) * 1000003) ^ this.f43176e) * 1000003) ^ this.f43177f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f43172a + ", versionCode=" + this.f43173b + ", versionName=" + this.f43174c + ", installUuid=" + this.f43175d + ", deliveryMechanism=" + this.f43176e + ", developmentPlatformProvider=" + this.f43177f + "}";
    }
}
