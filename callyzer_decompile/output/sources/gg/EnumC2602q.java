package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.q */
/* loaded from: classes.dex */
public enum EnumC2602q implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<EnumC2602q> CREATOR = new b0(4);
    private final String zzb;

    EnumC2602q(String str) {
        this.zzb = str;
    }

    public static EnumC2602q fromString(String str) throws TokenBinding$UnsupportedTokenBindingStatusException {
        for (EnumC2602q enumC2602q : values()) {
            if (str.equals(enumC2602q.zzb)) {
                return enumC2602q;
            }
        }
        throw new TokenBinding$UnsupportedTokenBindingStatusException(AbstractC5601a.m11238i("TokenBindingStatus ", str, " not supported"));
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
