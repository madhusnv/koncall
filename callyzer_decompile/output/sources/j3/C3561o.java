package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.o */
/* loaded from: classes.dex */
public final class C3561o extends c0 {

    /* renamed from: c */
    public final float f19083c;

    /* renamed from: d */
    public final float f19084d;

    public C3561o(float f6, float f10) {
        super(3);
        this.f19083c = f6;
        this.f19084d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3561o)) {
            return false;
        }
        C3561o c3561o = (C3561o) obj;
        return Float.compare(this.f19083c, c3561o.f19083c) == 0 && Float.compare(this.f19084d, c3561o.f19084d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19084d) + (Float.hashCode(this.f19083c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f19083c);
        sb2.append(", y=");
        return AbstractC1452a.m4562i(sb2, this.f19084d, ')');
    }
}
