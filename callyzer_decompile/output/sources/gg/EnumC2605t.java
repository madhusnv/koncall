package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.t */
/* loaded from: classes.dex */
public enum EnumC2605t implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC2605t> CREATOR = new b0(7);
    private final String zze;

    EnumC2605t(String str) {
        this.zze = str;
    }

    public static EnumC2605t fromString(String str) throws zzbc {
        for (EnumC2605t enumC2605t : values()) {
            if (str.equals(enumC2605t.zze)) {
                return enumC2605t;
            }
        }
        throw new zzbc(AbstractC5601a.m11238i("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zze);
    }
}
