package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
/* loaded from: classes3.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    LoyaltyPointsBalance zzb;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    TimeInterval zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @RecentlyNonNull
        public LoyaltyPoints build() {
            return LoyaltyPoints.this;
        }

        @RecentlyNonNull
        public Builder setBalance(@RecentlyNonNull LoyaltyPointsBalance loyaltyPointsBalance) {
            LoyaltyPoints.this.zzb = loyaltyPointsBalance;
            return this;
        }

        @RecentlyNonNull
        public Builder setLabel(@RecentlyNonNull String str) {
            LoyaltyPoints.this.zza = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setType(@RecentlyNonNull String str) {
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setValidTimeInterval(@RecentlyNonNull TimeInterval timeInterval) {
            LoyaltyPoints.this.zzc = timeInterval;
            return this;
        }
    }

    public LoyaltyPoints() {
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new LoyaltyPoints().new Builder(null);
    }

    @RecentlyNonNull
    public LoyaltyPointsBalance getBalance() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getLabel() {
        return this.zza;
    }

    @RecentlyNonNull
    @Deprecated
    public String getType() {
        return "";
    }

    @RecentlyNonNull
    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPoints(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) LoyaltyPointsBalance loyaltyPointsBalance, @SafeParcelable.Param(id = 5) TimeInterval timeInterval) {
        this.zza = str;
        this.zzb = loyaltyPointsBalance;
        this.zzc = timeInterval;
    }
}
