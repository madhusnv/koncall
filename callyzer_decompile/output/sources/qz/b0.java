package qz;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a */
    public int f30791a;

    /* renamed from: b */
    public final int[] f30792b = new int[10];

    /* renamed from: a */
    public final int m12369a() {
        return (this.f30791a & 16) != 0 ? this.f30792b[4] : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    /* renamed from: b */
    public final void m12370b(b0 other) {
        AbstractC4154l.m8923f(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f30791a) != 0) {
                m12371c(i10, other.f30792b[i10]);
            }
        }
    }

    /* renamed from: c */
    public final void m12371c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f30792b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f30791a = (1 << i10) | this.f30791a;
            iArr[i10] = i11;
        }
    }
}
