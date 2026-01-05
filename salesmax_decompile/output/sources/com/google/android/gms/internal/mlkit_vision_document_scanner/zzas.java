package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class zzas extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.zza += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
