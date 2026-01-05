package com.google.mlkit.vision.documentscanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;

/* renamed from: com.google.mlkit.vision.documentscanner.a */
/* loaded from: classes6.dex */
public final class C11540a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zze(parcel.readArrayList(GmsDocumentScanningResult.class.getClassLoader()), (GmsDocumentScanningResult.Pdf) parcel.readParcelable(GmsDocumentScanningResult.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
