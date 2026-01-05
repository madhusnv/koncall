package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzse extends zza implements zzsg {
    public zzse(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzsg
    public final void zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(1, parcelZza);
    }
}
