package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.r */
/* loaded from: classes.dex */
public final class C3564r extends c0 {

    /* renamed from: c */
    public final float f19093c;

    /* renamed from: d */
    public final float f19094d;

    public C3564r(float f6, float f10) {
        super(1);
        this.f19093c = f6;
        this.f19094d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3564r)) {
            return false;
        }
        C3564r c3564r = (C3564r) obj;
        return Float.compare(this.f19093c, c3564r.f19093c) == 0 && Float.compare(this.f19094d, c3564r.f19094d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19094d) + (Float.hashCode(this.f19093c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f19093c);
        sb2.append(", y=");
        return AbstractC1452a.m4562i(sb2, this.f19094d, ')');
    }
}
