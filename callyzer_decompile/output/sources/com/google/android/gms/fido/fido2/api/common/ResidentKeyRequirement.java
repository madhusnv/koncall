package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new C1282h();
    private final String zzb;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class UnsupportedResidentKeyRequirementException extends Exception {
    }

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    public static ResidentKeyRequirement fromString(String str) throws UnsupportedResidentKeyRequirementException {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(AbstractC5601a.m11238i("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
