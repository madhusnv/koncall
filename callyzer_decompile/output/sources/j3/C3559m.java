package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.m */
/* loaded from: classes.dex */
public final class C3559m extends c0 {

    /* renamed from: c */
    public final float f19080c;

    public C3559m(float f6) {
        super(3);
        this.f19080c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3559m) && Float.compare(this.f19080c, ((C3559m) obj).f19080c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19080c);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("HorizontalTo(x="), this.f19080c, ')');
    }
}
