package s4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.k */
/* loaded from: classes.dex */
public final class C6755k {

    /* renamed from: e */
    public static final C6755k f32205e = new C6755k(0, 0, 0, 0);

    /* renamed from: a */
    public final int f32206a;

    /* renamed from: b */
    public final int f32207b;

    /* renamed from: c */
    public final int f32208c;

    /* renamed from: d */
    public final int f32209d;

    public C6755k(int i10, int i11, int i12, int i13) {
        this.f32206a = i10;
        this.f32207b = i11;
        this.f32208c = i12;
        this.f32209d = i13;
    }

    /* renamed from: a */
    public final long m12944a() {
        return (((m12945b() / 2) + this.f32207b) & 4294967295L) | (((m12947d() / 2) + this.f32206a) << 32);
    }

    /* renamed from: b */
    public final int m12945b() {
        return this.f32209d - this.f32207b;
    }

    /* renamed from: c */
    public final long m12946c() {
        return (this.f32206a << 32) | (this.f32207b & 4294967295L);
    }

    /* renamed from: d */
    public final int m12947d() {
        return this.f32208c - this.f32206a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6755k)) {
            return false;
        }
        C6755k c6755k = (C6755k) obj;
        return this.f32206a == c6755k.f32206a && this.f32207b == c6755k.f32207b && this.f32208c == c6755k.f32208c && this.f32209d == c6755k.f32209d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32209d) + AbstractC1452a.m4556c(this.f32208c, AbstractC1452a.m4556c(this.f32207b, Integer.hashCode(this.f32206a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f32206a);
        sb2.append(", ");
        sb2.append(this.f32207b);
        sb2.append(", ");
        sb2.append(this.f32208c);
        sb2.append(", ");
        return AbstractC1452a.m4563j(sb2, this.f32209d, ')');
    }
}
