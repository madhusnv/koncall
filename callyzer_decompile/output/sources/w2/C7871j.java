package w2;

import com.sun.mail.util.AbstractC1452a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.j */
/* loaded from: classes.dex */
public final class C7871j implements InterfaceC7866e {

    /* renamed from: a */
    public final float f37662a;

    /* renamed from: b */
    public final float f37663b;

    public C7871j(float f6, float f10) {
        this.f37662a = f6;
        this.f37663b = f10;
    }

    @Override // w2.InterfaceC7866e
    /* renamed from: a */
    public final long mo14848a(long j6, long j10, EnumC6757m enumC6757m) {
        float f6 = (((int) (j10 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float f10 = (((int) (j10 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        EnumC6757m enumC6757m2 = EnumC6757m.Ltr;
        float f11 = this.f37662a;
        if (enumC6757m != enumC6757m2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f6;
        float f14 = (f12 + this.f37663b) * f10;
        return (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7871j)) {
            return false;
        }
        C7871j c7871j = (C7871j) obj;
        return Float.compare(this.f37662a, c7871j.f37662a) == 0 && Float.compare(this.f37663b, c7871j.f37663b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37663b) + (Float.hashCode(this.f37662a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f37662a);
        sb2.append(", verticalBias=");
        return AbstractC1452a.m4562i(sb2, this.f37663b, ')');
    }
}
