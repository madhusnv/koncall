package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new C1284j();
    private final int zzb;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class UnsupportedErrorCodeException extends Exception {
    }

    ErrorCode(int i10) {
        this.zzb = i10;
    }

    public static ErrorCode toErrorCode(int i10) throws UnsupportedErrorCodeException {
        for (ErrorCode errorCode : values()) {
            if (i10 == errorCode.zzb) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        throw new UnsupportedErrorCodeException(AbstractC5601a.m11232c(i10, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
