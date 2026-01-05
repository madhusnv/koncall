package xe;

import java.util.Arrays;
import ue.C7421c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.l */
/* loaded from: classes.dex */
public final class C8360l {

    /* renamed from: a */
    public final C7421c f40007a;

    /* renamed from: b */
    public final byte[] f40008b;

    public C8360l(C7421c c7421c, byte[] bArr) {
        if (c7421c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f40007a = c7421c;
        this.f40008b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8360l)) {
            return false;
        }
        C8360l c8360l = (C8360l) obj;
        if (this.f40007a.equals(c8360l.f40007a)) {
            return Arrays.equals(this.f40008b, c8360l.f40008b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40007a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40008b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f40007a + ", bytes=[...]}";
    }
}
