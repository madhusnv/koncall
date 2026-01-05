package g2;

import com.sun.mail.util.AbstractC1452a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y9 {

    /* renamed from: a */
    public final float f13317a;

    /* renamed from: b */
    public final float f13318b;

    /* renamed from: c */
    public final float f13319c;

    /* renamed from: d */
    public final float f13320d;

    /* renamed from: e */
    public final float f13321e;

    /* renamed from: f */
    public final float f13322f;

    public y9(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f13317a = f6;
        this.f13318b = f10;
        this.f13319c = f11;
        this.f13320d = f12;
        this.f13321e = f13;
        this.f13322f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return C6750f.m12935a(this.f13317a, y9Var.f13317a) && C6750f.m12935a(this.f13318b, y9Var.f13318b) && C6750f.m12935a(this.f13319c, y9Var.f13319c) && C6750f.m12935a(this.f13320d, y9Var.f13320d) && C6750f.m12935a(this.f13322f, y9Var.f13322f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13322f) + AbstractC1452a.m4555b(this.f13320d, AbstractC1452a.m4555b(this.f13319c, AbstractC1452a.m4555b(this.f13318b, Float.hashCode(this.f13317a) * 31, 31), 31), 31);
    }
}
