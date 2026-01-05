package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.y1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import jl.C3782a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import wh.C8036a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: a */
    public long f6717a;

    private native void closeNative(long j6);

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j6, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j6, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j6, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: w */
    public static C3782a m4019w(byte[] bArr) {
        bArr.getClass();
        try {
            u0 u0Var = u0.f6669b;
            y1 y1Var = y1.f6701c;
            return C3782a.m8308n(bArr, u0.f6669b);
        } catch (zzer e2) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6 = this.f6717a;
        if (j6 != 0) {
            closeNative(j6);
            this.f6717a = 0L;
        }
    }

    /* renamed from: h */
    public final void m4020h(C8036a c8036a) {
        if (this.f6717a != 0) {
            return;
        }
        try {
            int iM3836c = c8036a.m3836c();
            byte[] bArr = new byte[iM3836c];
            s0 s0Var = new s0(bArr, iM3836c);
            c8036a.m3841l(s0Var);
            if (iM3836c - s0Var.f6664e != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.f6717a = jCreateNativeWithClientOptions;
            if (jCreateNativeWithClientOptions == 0) {
                throw new IllegalArgumentException("Failed to create native pointer with client options.");
            }
        } catch (IOException e2) {
            throw new RuntimeException(AbstractC5601a.m11238i("Serializing ", C8036a.class.getName(), " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    /* renamed from: j */
    public final C3782a m4021j(int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j6 = this.f6717a;
        if (j6 != 0) {
            return m4019w(recognizeBufferNative(j6, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    /* renamed from: n */
    public final C3782a m4022n(int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j6 = this.f6717a;
        if (j6 != 0) {
            return m4019w(recognizeNative(j6, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    /* renamed from: u */
    public final C3782a m4023u(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f6717a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return m4019w(recognizeBitmapNative(this.f6717a, bitmap, recognitionOptions));
    }
}
