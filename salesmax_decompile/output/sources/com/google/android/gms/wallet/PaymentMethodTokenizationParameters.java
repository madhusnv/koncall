package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaa();

    @SafeParcelable.Field(id = 2)
    int zza;

    @SafeParcelable.Field(id = 3)
    Bundle zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzz zzzVar) {
        }

        @RecentlyNonNull
        public Builder addParameter(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzb.putString(str, str2);
            return this;
        }

        @RecentlyNonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @RecentlyNonNull
        public Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.zza = i;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new PaymentMethodTokenizationParameters().new Builder(null);
    }

    @RecentlyNonNull
    public Bundle getParameters() {
        return new Bundle(this.zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.zzb = bundle;
    }
}
