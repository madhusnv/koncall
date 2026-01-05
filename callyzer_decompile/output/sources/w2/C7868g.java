package w2;

import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.g */
/* loaded from: classes.dex */
public final class C7868g implements InterfaceC7866e {

    /* renamed from: a */
    public final float f37659a;

    public C7868g(float f6) {
        this.f37659a = f6;
    }

    @Override // w2.InterfaceC7866e
    /* renamed from: a */
    public final long mo14848a(long j6, long j10, EnumC6757m enumC6757m) {
        long j11 = ((((int) (j10 >> 32)) - ((int) (j6 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L);
        float f6 = 1;
        float f10 = (this.f37659a + f6) * (((int) (j11 >> 32)) / 2.0f);
        float f11 = (f6 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f);
        return (Math.round(f11) & 4294967295L) | (Math.round(f10) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7868g) && Float.compare(this.f37659a, ((C7868g) obj).f37659a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f37659a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f37659a + ", verticalBias=-1.0)";
    }
}
