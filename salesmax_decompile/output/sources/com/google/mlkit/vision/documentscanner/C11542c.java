package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;

/* renamed from: com.google.mlkit.vision.documentscanner.c */
/* loaded from: classes6.dex */
public final class C11542c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzi((Uri) parcel.readParcelable(GmsDocumentScanningResult.Pdf.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
