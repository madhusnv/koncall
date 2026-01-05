package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends c0 {

    /* renamed from: c */
    public final float f18942c;

    public b0(float f6) {
        super(3);
        this.f18942c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Float.compare(this.f18942c, ((b0) obj).f18942c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18942c);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("VerticalTo(y="), this.f18942c, ')');
    }
}
