package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzsc extends zzb implements zzsd {
    public zzsc() {
        super("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerCallbacks");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzry zzryVar = (zzry) zzc.zza(parcel, zzry.CREATOR);
            zzc.zzb(parcel);
            zzb(zzryVar);
        } else {
            if (i != 2) {
                return false;
            }
            zzc.zzb(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
        }
        return true;
    }
}
