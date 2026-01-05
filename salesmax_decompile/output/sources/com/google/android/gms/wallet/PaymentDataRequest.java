package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
/* loaded from: classes3.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzx();

    @SafeParcelable.Field(id = 1)
    boolean zza;

    @SafeParcelable.Field(id = 2)
    boolean zzb;

    @SafeParcelable.Field(id = 3)
    CardRequirements zzc;

    @SafeParcelable.Field(id = 4)
    boolean zzd;

    @SafeParcelable.Field(id = 5)
    ShippingAddressRequirements zze;

    @SafeParcelable.Field(id = 6)
    ArrayList<Integer> zzf;

    @SafeParcelable.Field(id = 7)
    PaymentMethodTokenizationParameters zzg;

    @SafeParcelable.Field(id = 8)
    TransactionInfo zzh;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    boolean zzi;

    @SafeParcelable.Field(id = 10)
    String zzj;

    @SafeParcelable.Field(id = 11)
    Bundle zzk;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzw zzwVar) {
        }

        @RecentlyNonNull
        public Builder addAllowedPaymentMethod(int i) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList<>();
            }
            PaymentDataRequest.this.zzf.add(Integer.valueOf(i));
            return this;
        }

        @RecentlyNonNull
        public Builder addAllowedPaymentMethods(@RecentlyNonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList<>();
            }
            PaymentDataRequest.this.zzf.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzj == null) {
                Preconditions.checkNotNull(paymentDataRequest.zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.zzc, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.zzg != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        @RecentlyNonNull
        public Builder setCardRequirements(@RecentlyNonNull CardRequirements cardRequirements) {
            PaymentDataRequest.this.zzc = cardRequirements;
            return this;
        }

        @RecentlyNonNull
        public Builder setEmailRequired(boolean z) {
            PaymentDataRequest.this.zza = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setPaymentMethodTokenizationParameters(@RecentlyNonNull PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.zzg = paymentMethodTokenizationParameters;
            return this;
        }

        @RecentlyNonNull
        public Builder setPhoneNumberRequired(boolean z) {
            PaymentDataRequest.this.zzb = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setShippingAddressRequired(boolean z) {
            PaymentDataRequest.this.zzd = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setShippingAddressRequirements(@RecentlyNonNull ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.zze = shippingAddressRequirements;
            return this;
        }

        @RecentlyNonNull
        public Builder setTransactionInfo(@RecentlyNonNull TransactionInfo transactionInfo) {
            PaymentDataRequest.this.zzh = transactionInfo;
            return this;
        }

        @RecentlyNonNull
        public Builder setUiRequired(boolean z) {
            PaymentDataRequest.this.zzi = z;
            return this;
        }
    }

    private PaymentDataRequest() {
        this.zzi = true;
    }

    @RecentlyNonNull
    public static PaymentDataRequest fromJson(@RecentlyNonNull String str) {
        Builder builderNewBuilder = newBuilder();
        PaymentDataRequest.this.zzj = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @RecentlyNonNull
    @Deprecated
    public static Builder newBuilder() {
        return new PaymentDataRequest().new Builder(null);
    }

    @RecentlyNonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzf;
    }

    @RecentlyNullable
    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.zzc;
    }

    @RecentlyNonNull
    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzg;
    }

    @RecentlyNullable
    public Bundle getSavedState() {
        return this.zzk;
    }

    @RecentlyNullable
    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zze;
    }

    @RecentlyNonNull
    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.zzh;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.zza;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.zzb;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.zzd;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.zzi;
    }

    @RecentlyNonNull
    public String toJson() {
        return this.zzj;
    }

    @RecentlyNonNull
    public PaymentDataRequest withSavedState(Bundle bundle) {
        this.zzk = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(id = 4) boolean z3, @SafeParcelable.Param(id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(id = 6) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(id = 9) boolean z4, @SafeParcelable.Param(id = 10) String str, @SafeParcelable.Param(id = 11) Bundle bundle) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = cardRequirements;
        this.zzd = z3;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z4;
        this.zzj = str;
        this.zzk = bundle;
    }
}
