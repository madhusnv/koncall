package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "CallbackInputCreator")
/* loaded from: classes3.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CallbackInput> CREATOR = new zzh();

    @SafeParcelable.Field(id = 1)
    int zza;

    @SafeParcelable.Field(id = 2)
    byte[] zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @RecentlyNonNull
        public CallbackInput build() {
            return CallbackInput.this;
        }

        @RecentlyNonNull
        public Builder setCallbackType(int i) {
            CallbackInput.this.zza = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestBytes(@RecentlyNonNull byte[] bArr) {
            CallbackInput.this.zzb = bArr;
            return this;
        }
    }

    private CallbackInput() {
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new CallbackInput().new Builder(null);
    }

    @RecentlyNullable
    public <T extends AbstractSafeParcelable> T deserializeRequest(@RecentlyNonNull Parcelable.Creator<T> creator) {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return (T) SafeParcelableSerializer.deserializeFromBytes(bArr, creator);
    }

    public int getCallbackType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CallbackInput(@SafeParcelable.Param(id = 1) int i, @RecentlyNonNull @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }
}
