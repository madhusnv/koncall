package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.q */
/* loaded from: classes.dex */
public final class C3563q extends c0 {

    /* renamed from: c */
    public final float f19089c;

    /* renamed from: d */
    public final float f19090d;

    /* renamed from: e */
    public final float f19091e;

    /* renamed from: f */
    public final float f19092f;

    public C3563q(float f6, float f10, float f11, float f12) {
        super(2);
        this.f19089c = f6;
        this.f19090d = f10;
        this.f19091e = f11;
        this.f19092f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3563q)) {
            return false;
        }
        C3563q c3563q = (C3563q) obj;
        return Float.compare(this.f19089c, c3563q.f19089c) == 0 && Float.compare(this.f19090d, c3563q.f19090d) == 0 && Float.compare(this.f19091e, c3563q.f19091e) == 0 && Float.compare(this.f19092f, c3563q.f19092f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19092f) + AbstractC1452a.m4555b(this.f19091e, AbstractC1452a.m4555b(this.f19090d, Float.hashCode(this.f19089c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f19089c);
        sb2.append(", y1=");
        sb2.append(this.f19090d);
        sb2.append(", x2=");
        sb2.append(this.f19091e);
        sb2.append(", y2=");
        return AbstractC1452a.m4562i(sb2, this.f19092f, ')');
    }
}
