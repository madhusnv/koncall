package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.e */
/* loaded from: classes.dex */
public final class C6450e {

    /* renamed from: b */
    public static final int f31105b = 66305;

    /* renamed from: a */
    public final int f31106a;

    /* renamed from: a */
    public static String m12441a(int i10) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & 255;
        String str = "Invalid";
        sb2.append((Object) (i11 == 1 ? "Strategy.Simple" : i11 == 2 ? "Strategy.HighQuality" : i11 == 3 ? "Strategy.Balanced" : i11 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i12 = (i10 >> 8) & 255;
        sb2.append((Object) (i12 == 1 ? "Strictness.None" : i12 == 2 ? "Strictness.Loose" : i12 == 3 ? "Strictness.Normal" : i12 == 4 ? "Strictness.Strict" : i12 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i13 = (i10 >> 16) & 255;
        if (i13 == 1) {
            str = "WordBreak.None";
        } else if (i13 == 2) {
            str = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6450e) {
            return this.f31106a == ((C6450e) obj).f31106a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31106a);
    }

    public final String toString() {
        return m12441a(this.f31106a);
    }
}
