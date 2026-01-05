package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.h */
/* loaded from: classes.dex */
public final class C1282h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        try {
            return ResidentKeyRequirement.fromString(string);
        } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ResidentKeyRequirement[i10];
    }
}
