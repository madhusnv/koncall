package c3;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import og.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c3.c */
/* loaded from: classes.dex */
public final class C0848c {

    /* renamed from: e */
    public static final C0848c f5353e = new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);

    /* renamed from: a */
    public final float f5354a;

    /* renamed from: b */
    public final float f5355b;

    /* renamed from: c */
    public final float f5356c;

    /* renamed from: d */
    public final float f5357d;

    public C0848c(float f6, float f10, float f11, float f12) {
        this.f5354a = f6;
        this.f5355b = f10;
        this.f5356c = f11;
        this.f5357d = f12;
    }

    /* renamed from: a */
    public final boolean m2279a(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (fIntBitsToFloat >= this.f5354a) & (fIntBitsToFloat < this.f5356c) & (fIntBitsToFloat2 >= this.f5355b) & (fIntBitsToFloat2 < this.f5357d);
    }

    /* renamed from: b */
    public final long m2280b() {
        float f6 = this.f5356c;
        float f10 = this.f5354a;
        float f11 = ((f6 - f10) / 2.0f) + f10;
        float f12 = this.f5357d;
        float f13 = this.f5355b;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    /* renamed from: c */
    public final long m2281c() {
        float f6 = this.f5356c - this.f5354a;
        float f10 = this.f5357d - this.f5355b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* renamed from: d */
    public final long m2282d() {
        return (Float.floatToRawIntBits(this.f5354a) << 32) | (Float.floatToRawIntBits(this.f5355b) & 4294967295L);
    }

    /* renamed from: e */
    public final C0848c m2283e(C0848c c0848c) {
        return new C0848c(Math.max(this.f5354a, c0848c.f5354a), Math.max(this.f5355b, c0848c.f5355b), Math.min(this.f5356c, c0848c.f5356c), Math.min(this.f5357d, c0848c.f5357d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0848c)) {
            return false;
        }
        C0848c c0848c = (C0848c) obj;
        return Float.compare(this.f5354a, c0848c.f5354a) == 0 && Float.compare(this.f5355b, c0848c.f5355b) == 0 && Float.compare(this.f5356c, c0848c.f5356c) == 0 && Float.compare(this.f5357d, c0848c.f5357d) == 0;
    }

    /* renamed from: f */
    public final boolean m2284f() {
        return (this.f5354a >= this.f5356c) | (this.f5355b >= this.f5357d);
    }

    /* renamed from: g */
    public final boolean m2285g(C0848c c0848c) {
        return (this.f5354a < c0848c.f5356c) & (c0848c.f5354a < this.f5356c) & (this.f5355b < c0848c.f5357d) & (c0848c.f5355b < this.f5357d);
    }

    /* renamed from: h */
    public final C0848c m2286h(float f6, float f10) {
        return new C0848c(this.f5354a + f6, this.f5355b + f10, this.f5356c + f6, this.f5357d + f10);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5357d) + AbstractC1452a.m4555b(this.f5356c, AbstractC1452a.m4555b(this.f5355b, Float.hashCode(this.f5354a) * 31, 31), 31);
    }

    /* renamed from: i */
    public final C0848c m2287i(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        return new C0848c(Float.intBitsToFloat(i10) + this.f5354a, Float.intBitsToFloat(i11) + this.f5355b, Float.intBitsToFloat(i10) + this.f5356c, Float.intBitsToFloat(i11) + this.f5357d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + z1.m11079a(this.f5354a) + ", " + z1.m11079a(this.f5355b) + ", " + z1.m11079a(this.f5356c) + ", " + z1.m11079a(this.f5357d) + ')';
    }
}
