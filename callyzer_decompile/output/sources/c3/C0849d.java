package c3;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import og.c2;
import og.x1;
import og.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c3.d */
/* loaded from: classes.dex */
public final class C0849d {

    /* renamed from: a */
    public final float f5358a;

    /* renamed from: b */
    public final float f5359b;

    /* renamed from: c */
    public final float f5360c;

    /* renamed from: d */
    public final float f5361d;

    /* renamed from: e */
    public final long f5362e;

    /* renamed from: f */
    public final long f5363f;

    /* renamed from: g */
    public final long f5364g;

    /* renamed from: h */
    public final long f5365h;

    static {
        c2.m10570a(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0L);
    }

    public C0849d(float f6, float f10, float f11, float f12, long j6, long j10, long j11, long j12) {
        this.f5358a = f6;
        this.f5359b = f10;
        this.f5360c = f11;
        this.f5361d = f12;
        this.f5362e = j6;
        this.f5363f = j10;
        this.f5364g = j11;
        this.f5365h = j12;
    }

    /* renamed from: a */
    public final float m2288a() {
        return this.f5361d - this.f5359b;
    }

    /* renamed from: b */
    public final float m2289b() {
        return this.f5360c - this.f5358a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849d)) {
            return false;
        }
        C0849d c0849d = (C0849d) obj;
        return Float.compare(this.f5358a, c0849d.f5358a) == 0 && Float.compare(this.f5359b, c0849d.f5359b) == 0 && Float.compare(this.f5360c, c0849d.f5360c) == 0 && Float.compare(this.f5361d, c0849d.f5361d) == 0 && x1.m11035a(this.f5362e, c0849d.f5362e) && x1.m11035a(this.f5363f, c0849d.f5363f) && x1.m11035a(this.f5364g, c0849d.f5364g) && x1.m11035a(this.f5365h, c0849d.f5365h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5365h) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4555b(this.f5361d, AbstractC1452a.m4555b(this.f5360c, AbstractC1452a.m4555b(this.f5359b, Float.hashCode(this.f5358a) * 31, 31), 31), 31), 31, this.f5362e), 31, this.f5363f), 31, this.f5364g);
    }

    public final String toString() {
        String str = z1.m11079a(this.f5358a) + ", " + z1.m11079a(this.f5359b) + ", " + z1.m11079a(this.f5360c) + ", " + z1.m11079a(this.f5361d);
        long j6 = this.f5362e;
        long j10 = this.f5363f;
        boolean zM11035a = x1.m11035a(j6, j10);
        long j11 = this.f5364g;
        long j12 = this.f5365h;
        if (!zM11035a || !x1.m11035a(j10, j11) || !x1.m11035a(j11, j12)) {
            StringBuilder sbM7383p = m0.m7383p("RoundRect(rect=", str, ", topLeft=");
            sbM7383p.append((Object) x1.m11036b(j6));
            sbM7383p.append(", topRight=");
            sbM7383p.append((Object) x1.m11036b(j10));
            sbM7383p.append(", bottomRight=");
            sbM7383p.append((Object) x1.m11036b(j11));
            sbM7383p.append(", bottomLeft=");
            sbM7383p.append((Object) x1.m11036b(j12));
            sbM7383p.append(')');
            return sbM7383p.toString();
        }
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbM7383p2 = m0.m7383p("RoundRect(rect=", str, ", radius=");
            sbM7383p2.append(z1.m11079a(Float.intBitsToFloat(i10)));
            sbM7383p2.append(')');
            return sbM7383p2.toString();
        }
        StringBuilder sbM7383p3 = m0.m7383p("RoundRect(rect=", str, ", x=");
        sbM7383p3.append(z1.m11079a(Float.intBitsToFloat(i10)));
        sbM7383p3.append(", y=");
        sbM7383p3.append(z1.m11079a(Float.intBitsToFloat(i11)));
        sbM7383p3.append(')');
        return sbM7383p3.toString();
    }
}
