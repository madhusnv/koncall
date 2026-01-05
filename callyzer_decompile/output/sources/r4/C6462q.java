package r4;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.q */
/* loaded from: classes.dex */
public final class C6462q {

    /* renamed from: c */
    public static final C6462q f31124c = new C6462q(1.0f, DefinitionKt.NO_Float_VALUE);

    /* renamed from: a */
    public final float f31125a;

    /* renamed from: b */
    public final float f31126b;

    public C6462q(float f6, float f10) {
        this.f31125a = f6;
        this.f31126b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6462q)) {
            return false;
        }
        C6462q c6462q = (C6462q) obj;
        return this.f31125a == c6462q.f31125a && this.f31126b == c6462q.f31126b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31126b) + (Float.hashCode(this.f31125a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f31125a);
        sb2.append(", skewX=");
        return AbstractC1452a.m4562i(sb2, this.f31126b, ')');
    }
}
