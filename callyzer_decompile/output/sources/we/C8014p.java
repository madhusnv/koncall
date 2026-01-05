package we;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.p */
/* loaded from: classes.dex */
public final class C8014p extends b0 {

    /* renamed from: a */
    public final byte[] f38519a;

    /* renamed from: b */
    public final byte[] f38520b;

    public C8014p(byte[] bArr, byte[] bArr2) {
        this.f38519a = bArr;
        this.f38520b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z6 = b0Var instanceof C8014p;
            C8014p c8014p = (C8014p) b0Var;
            if (Arrays.equals(this.f38519a, z6 ? c8014p.f38519a : c8014p.f38519a)) {
                C8014p c8014p2 = (C8014p) b0Var;
                if (Arrays.equals(this.f38520b, z6 ? c8014p2.f38520b : c8014p2.f38520b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f38519a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38520b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f38519a) + ", encryptedBlob=" + Arrays.toString(this.f38520b) + "}";
    }
}
