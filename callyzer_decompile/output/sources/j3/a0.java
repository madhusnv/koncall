package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends c0 {

    /* renamed from: c */
    public final float f18939c;

    public a0(float f6) {
        super(3);
        this.f18939c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f18939c, ((a0) obj).f18939c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18939c);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("RelativeVerticalTo(dy="), this.f18939c, ')');
    }
}
