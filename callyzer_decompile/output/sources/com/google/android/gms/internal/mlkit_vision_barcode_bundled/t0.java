package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    public final Object f6665a;

    /* renamed from: b */
    public final int f6666b;

    public t0(j0 j0Var, int i10) {
        this.f6665a = j0Var;
        this.f6666b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f6665a == t0Var.f6665a && this.f6666b == t0Var.f6666b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6665a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f6666b;
    }
}
