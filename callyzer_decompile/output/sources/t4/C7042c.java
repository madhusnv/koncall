package t4;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t4.c */
/* loaded from: classes.dex */
public final class C7042c implements InterfaceC7040a {

    /* renamed from: a */
    public final float[] f34058a;

    /* renamed from: b */
    public final float[] f34059b;

    public C7042c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f34058a = fArr;
        this.f34059b = fArr2;
    }

    @Override // t4.InterfaceC7040a
    /* renamed from: a */
    public final float mo12950a(float f6) {
        return C8687a.m16034j(f6, this.f34059b, this.f34058a);
    }

    @Override // t4.InterfaceC7040a
    /* renamed from: b */
    public final float mo12951b(float f6) {
        return C8687a.m16034j(f6, this.f34058a, this.f34059b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7042c)) {
            return false;
        }
        C7042c c7042c = (C7042c) obj;
        return Arrays.equals(this.f34058a, c7042c.f34058a) && Arrays.equals(this.f34059b, c7042c.f34059b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34059b) + (Arrays.hashCode(this.f34058a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f34058a);
        AbstractC4154l.m8922e(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f34059b);
        AbstractC4154l.m8922e(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
