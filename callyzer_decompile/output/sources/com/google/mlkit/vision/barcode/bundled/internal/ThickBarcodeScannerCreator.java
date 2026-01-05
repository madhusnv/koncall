package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1336z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1331u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1334x;
import dl.BinderC1733a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@DynamiteApi
/* loaded from: classes.dex */
public class ThickBarcodeScannerCreator extends AbstractBinderC1336z {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0
    public InterfaceC1334x newBarcodeScanner(InterfaceC0968a interfaceC0968a, C1331u c1331u) {
        return new BinderC1733a((Context) BinderC0969b.m2727S(interfaceC0968a), c1331u);
    }
}
