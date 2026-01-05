package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.u */
/* loaded from: classes.dex */
public final class C3567u extends c0 {

    /* renamed from: c */
    public final float f19108c;

    public C3567u(float f6) {
        super(3);
        this.f19108c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3567u) && Float.compare(this.f19108c, ((C3567u) obj).f19108c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19108c);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("RelativeHorizontalTo(dx="), this.f19108c, ')');
    }
}
