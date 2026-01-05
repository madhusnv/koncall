package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public class RecognitionOptions {

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;

    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = true;

    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = true;

    @UsedByNative("jni_common.cc")
    private boolean useHalideAffineCrop = false;

    @UsedByNative("jni_common.cc")
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();

    @UsedByNative("jni_common.cc")
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    @UsedByNative("jni_common.cc")
    private boolean qrEnableFourthCornerApproximation = false;

    /* renamed from: a */
    public final void m4028a(int i10) {
        this.barcodeFormats = i10;
    }

    /* renamed from: b */
    public final void m4029b() {
        this.enableQrAlignmentGrid = true;
    }

    /* renamed from: c */
    public final void m4030c() {
        this.enableUseKeypointAsFinderPattern = true;
    }

    /* renamed from: d */
    public final void m4031d(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    /* renamed from: e */
    public final void m4032e(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    /* renamed from: f */
    public final void m4033f(boolean z6) {
        this.outputUnrecognizedBarcodes = z6;
    }

    /* renamed from: g */
    public final void m4034g(boolean z6) {
        this.qrEnableFourthCornerApproximation = z6;
    }
}
