package zi;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends r1 {

    /* renamed from: a */
    public final String f43090a;

    /* renamed from: b */
    public final byte[] f43091b;

    public h0(String str, byte[] bArr) {
        this.f43090a = str;
        this.f43091b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f43090a.equals(h0Var.f43090a)) {
                if (Arrays.equals(this.f43091b, r1Var instanceof h0 ? ((h0) r1Var).f43091b : h0Var.f43091b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43090a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43091b);
    }

    public final String toString() {
        return "File{filename=" + this.f43090a + ", contents=" + Arrays.toString(this.f43091b) + "}";
    }
}
