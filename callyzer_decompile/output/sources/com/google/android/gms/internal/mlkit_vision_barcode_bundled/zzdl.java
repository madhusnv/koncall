package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class zzdl extends IOException {
    public zzdl() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzdl(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public zzdl(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
