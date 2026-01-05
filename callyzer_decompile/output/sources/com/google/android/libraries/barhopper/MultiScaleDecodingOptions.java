package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    /* renamed from: a */
    public final void m4024a(float[] fArr) {
        this.extraScales = fArr;
    }

    /* renamed from: b */
    public final void m4025b(int i10) {
        this.minimumDetectedDimension = i10;
    }

    /* renamed from: c */
    public final void m4026c(boolean z6) {
        this.skipProcessingIfBarcodeFound = z6;
    }
}
