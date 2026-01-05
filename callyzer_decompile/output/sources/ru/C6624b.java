package ru;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ru.b */
/* loaded from: classes3.dex */
public final class C6624b {

    /* renamed from: a */
    public final int f31815a;

    /* renamed from: b */
    public final boolean f31816b;

    public C6624b(int i10, boolean z6) {
        this.f31815a = i10;
        this.f31816b = z6;
    }

    /* renamed from: a */
    public static C6624b m12672a(C6624b c6624b, boolean z6) {
        int i10 = c6624b.f31815a;
        c6624b.getClass();
        return new C6624b(i10, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6624b)) {
            return false;
        }
        C6624b c6624b = (C6624b) obj;
        return this.f31815a == c6624b.f31815a && this.f31816b == c6624b.f31816b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31816b) + (Integer.hashCode(this.f31815a) * 31);
    }

    public final String toString() {
        return "SettingsDefaultUIModel(title=" + this.f31815a + ", selected=" + this.f31816b + ")";
    }
}
