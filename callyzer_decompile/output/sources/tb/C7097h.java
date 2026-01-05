package tb;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.h */
/* loaded from: classes.dex */
public final class C7097h {

    /* renamed from: a */
    public final Object f34262a;

    /* renamed from: b */
    public final byte[] f34263b;

    public C7097h(Object obj, byte[] bArr) {
        this.f34262a = obj;
        this.f34263b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7097h.class != obj.getClass()) {
            return false;
        }
        C7097h c7097h = (C7097h) obj;
        return AbstractC4154l.m8918a(this.f34262a, c7097h.f34262a) && Arrays.equals(this.f34263b, c7097h.f34263b);
    }

    public final int hashCode() {
        Object obj = this.f34262a;
        return Arrays.hashCode(this.f34263b) + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "AwsSigningResult(output=" + this.f34262a + ", signature=" + Arrays.toString(this.f34263b) + ')';
    }
}
