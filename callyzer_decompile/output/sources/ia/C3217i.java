package ia;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.i */
/* loaded from: classes.dex */
public final class C3217i {

    /* renamed from: a */
    public final byte[] f17340a;

    /* renamed from: b */
    public final C7126c f17341b;

    public C3217i(byte[] bArr, C7126c c7126c) {
        this.f17340a = bArr;
        this.f17341b = c7126c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3217i.class != obj.getClass()) {
            return false;
        }
        C3217i c3217i = (C3217i) obj;
        return Arrays.equals(this.f17340a, c3217i.f17340a) && AbstractC4154l.m8918a(this.f17341b, c3217i.f17341b);
    }

    public final int hashCode() {
        return this.f17341b.f34346a.hashCode() + (Arrays.hashCode(this.f17340a) * 31);
    }

    public final String toString() {
        return "Token(value=" + Arrays.toString(this.f17340a) + ", expires=" + this.f17341b + ')';
    }
}
