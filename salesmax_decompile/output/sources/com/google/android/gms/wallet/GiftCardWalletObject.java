package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzm();

    @SafeParcelable.Field(id = 2)
    CommonWalletObject zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    String zzd;

    @SafeParcelable.Field(id = 6)
    long zze;

    @SafeParcelable.Field(id = 7)
    String zzf;

    @SafeParcelable.Field(id = 8)
    long zzg;

    @SafeParcelable.Field(id = 9)
    String zzh;

    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzl zzlVar) {
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUri(@RecentlyNonNull UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUris(@RecentlyNonNull Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabelValueRow(@RecentlyNonNull LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabelValueRows(@RecentlyNonNull Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUri(@RecentlyNonNull UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUris(@RecentlyNonNull Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocation(@RecentlyNonNull LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocations(@RecentlyNonNull Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessage(@RecentlyNonNull WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessages(@RecentlyNonNull Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModuleData(@RecentlyNonNull TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModulesData(@RecentlyNonNull Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        @RecentlyNonNull
        public GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzb), "Card number is required.");
            GiftCardWalletObject.this.zza = this.zzb.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        @RecentlyNonNull
        public Builder setBalanceCurrencyCode(@RecentlyNonNull String str) {
            GiftCardWalletObject.this.zzf = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setBalanceMicros(long j) {
            GiftCardWalletObject.this.zze = j;
            return this;
        }

        @RecentlyNonNull
        public Builder setBalanceUpdateTime(long j) {
            GiftCardWalletObject.this.zzg = j;
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeAlternateText(@RecentlyNonNull String str) {
            this.zzb.zzm(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setBarcodeLabel(@RecentlyNonNull String str) {
            this.zzb.zzn(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeType(@RecentlyNonNull String str) {
            this.zzb.zzo(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeValue(@RecentlyNonNull String str) {
            this.zzb.zzp(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setCardIdentifier(@RecentlyNonNull String str) {
            GiftCardWalletObject.this.zzd = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardNumber(@RecentlyNonNull String str) {
            GiftCardWalletObject.this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setClassId(@RecentlyNonNull String str) {
            this.zzb.zzq(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setEventNumber(@RecentlyNonNull String str) {
            GiftCardWalletObject.this.zzh = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(@RecentlyNonNull String str) {
            this.zzb.zzr(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@RecentlyNonNull String str) {
            this.zzb.zzs(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@RecentlyNonNull String str) {
            this.zzb.zzt(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.zzb.zzu(z);
            return this;
        }

        @RecentlyNonNull
        public Builder setIssuerName(@RecentlyNonNull String str) {
            this.zzb.zzv(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setPin(@RecentlyNonNull String str) {
            GiftCardWalletObject.this.zzc = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setState(int i) {
            this.zzb.zzx(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setTitle(@RecentlyNonNull String str) {
            this.zzb.zzw(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setValidTimeInterval(@RecentlyNonNull TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }
    }

    public GiftCardWalletObject() {
        this.zza = CommonWalletObject.zzb().zzz();
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new GiftCardWalletObject().new Builder(null);
    }

    @RecentlyNonNull
    public String getBalanceCurrencyCode() {
        return this.zzf;
    }

    public long getBalanceMicros() {
        return this.zze;
    }

    public long getBalanceUpdateTime() {
        return this.zzg;
    }

    @RecentlyNonNull
    public String getBarcodeAlternateText() {
        return this.zza.zzd();
    }

    @RecentlyNonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zza.zze();
    }

    @RecentlyNonNull
    public String getBarcodeType() {
        return this.zza.zzf();
    }

    @RecentlyNonNull
    public String getBarcodeValue() {
        return this.zza.zzg();
    }

    @RecentlyNonNull
    @Deprecated
    public String getCardIdentifier() {
        return this.zzd;
    }

    @RecentlyNonNull
    public String getCardNumber() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getClassId() {
        return this.zza.zzh();
    }

    @RecentlyNonNull
    public String getEventNumber() {
        return this.zzh;
    }

    @RecentlyNonNull
    public String getId() {
        return this.zza.zzi();
    }

    @RecentlyNonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zza.zzn();
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zza.zzj();
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zza.zzk();
    }

    @RecentlyNonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zza.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zza.zzt();
    }

    @RecentlyNonNull
    public String getIssuerName() {
        return this.zza.zzl();
    }

    @RecentlyNonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zza.zzp();
    }

    @RecentlyNonNull
    public ArrayList<LatLng> getLocations() {
        return this.zza.zzq();
    }

    @RecentlyNonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zza.zzr();
    }

    @RecentlyNonNull
    public String getPin() {
        return this.zzc;
    }

    public int getState() {
        return this.zza.zza();
    }

    @RecentlyNonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zza.zzs();
    }

    @RecentlyNonNull
    public String getTitle() {
        return this.zza.zzm();
    }

    @RecentlyNonNull
    public TimeInterval getValidTimeInterval() {
        return this.zza.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GiftCardWalletObject(@SafeParcelable.Param(id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) String str5) {
        CommonWalletObject.zzb();
        this.zza = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }
}
