package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LoyaltyWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzr();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    String zze;

    @SafeParcelable.Field(id = 7)
    String zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @SafeParcelable.Field(id = 9)
    String zzh;

    @SafeParcelable.Field(id = 10)
    @Deprecated
    String zzi;

    @SafeParcelable.Field(id = 11)
    String zzj;

    @SafeParcelable.Field(id = 12)
    int zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 13)
    ArrayList<WalletObjectMessage> zzl;

    @SafeParcelable.Field(id = 14)
    TimeInterval zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 15)
    ArrayList<LatLng> zzn;

    @SafeParcelable.Field(id = 16)
    @Deprecated
    String zzo;

    @SafeParcelable.Field(id = 17)
    @Deprecated
    String zzp;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 18)
    ArrayList<LabelValueRow> zzq;

    @SafeParcelable.Field(id = 19)
    boolean zzr;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 20)
    ArrayList<UriData> zzs;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 21)
    ArrayList<TextModuleData> zzt;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 22)
    ArrayList<UriData> zzu;

    @SafeParcelable.Field(id = 23)
    LoyaltyPoints zzv;

    public final class Builder {
        public /* synthetic */ Builder(zzq zzqVar) {
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUri(@RecentlyNonNull UriData uriData) {
            LoyaltyWalletObject.this.zzs.add(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addImageModuleDataMainImageUris(@RecentlyNonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzs.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabeValueRow(@RecentlyNonNull LabelValueRow labelValueRow) {
            LoyaltyWalletObject.this.zzq.add(labelValueRow);
            return this;
        }

        @RecentlyNonNull
        public Builder addInfoModuleDataLabelValueRows(@RecentlyNonNull Collection<LabelValueRow> collection) {
            LoyaltyWalletObject.this.zzq.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUri(@RecentlyNonNull UriData uriData) {
            LoyaltyWalletObject.this.zzu.add(uriData);
            return this;
        }

        @RecentlyNonNull
        public Builder addLinksModuleDataUris(@RecentlyNonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzu.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocation(@RecentlyNonNull LatLng latLng) {
            LoyaltyWalletObject.this.zzn.add(latLng);
            return this;
        }

        @RecentlyNonNull
        public Builder addLocations(@RecentlyNonNull Collection<LatLng> collection) {
            LoyaltyWalletObject.this.zzn.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessage(@RecentlyNonNull WalletObjectMessage walletObjectMessage) {
            LoyaltyWalletObject.this.zzl.add(walletObjectMessage);
            return this;
        }

        @RecentlyNonNull
        public Builder addMessages(@RecentlyNonNull Collection<WalletObjectMessage> collection) {
            LoyaltyWalletObject.this.zzl.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModuleData(@RecentlyNonNull TextModuleData textModuleData) {
            LoyaltyWalletObject.this.zzt.add(textModuleData);
            return this;
        }

        @RecentlyNonNull
        public Builder addTextModulesData(@RecentlyNonNull Collection<TextModuleData> collection) {
            LoyaltyWalletObject.this.zzt.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public LoyaltyWalletObject build() {
            return LoyaltyWalletObject.this;
        }

        @RecentlyNonNull
        public Builder setAccountId(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setAccountName(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zze = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeAlternateText(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzf = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setBarcodeLabel(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzi = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeType(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzg = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setBarcodeValue(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzh = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setClassId(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzj = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zza = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzp = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzo = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            LoyaltyWalletObject.this.zzr = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setIssuerName(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzc = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setLoyaltyPoints(@RecentlyNonNull LoyaltyPoints loyaltyPoints) {
            LoyaltyWalletObject.this.zzv = loyaltyPoints;
            return this;
        }

        @RecentlyNonNull
        public Builder setProgramName(@RecentlyNonNull String str) {
            LoyaltyWalletObject.this.zzd = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setState(int i) {
            LoyaltyWalletObject.this.zzk = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setValidTimeInterval(@RecentlyNonNull TimeInterval timeInterval) {
            LoyaltyWalletObject.this.zzm = timeInterval;
            return this;
        }
    }

    public LoyaltyWalletObject() {
        this.zzl = ArrayUtils.newArrayList();
        this.zzn = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
        this.zzt = ArrayUtils.newArrayList();
        this.zzu = ArrayUtils.newArrayList();
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new LoyaltyWalletObject().new Builder(null);
    }

    @RecentlyNonNull
    public String getAccountId() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getAccountName() {
        return this.zze;
    }

    @RecentlyNonNull
    public String getBarcodeAlternateText() {
        return this.zzf;
    }

    @RecentlyNonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zzi;
    }

    @RecentlyNonNull
    public String getBarcodeType() {
        return this.zzg;
    }

    @RecentlyNonNull
    public String getBarcodeValue() {
        return this.zzh;
    }

    @RecentlyNonNull
    public String getClassId() {
        return this.zzj;
    }

    @RecentlyNonNull
    public String getId() {
        return this.zza;
    }

    @RecentlyNonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzs;
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzp;
    }

    @RecentlyNonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzo;
    }

    @RecentlyNonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzq;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzr;
    }

    @RecentlyNonNull
    public String getIssuerName() {
        return this.zzc;
    }

    @RecentlyNonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzu;
    }

    @RecentlyNonNull
    public ArrayList<LatLng> getLocations() {
        return this.zzn;
    }

    @RecentlyNonNull
    public LoyaltyPoints getLoyaltyPoints() {
        return this.zzv;
    }

    @RecentlyNonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzl;
    }

    @RecentlyNonNull
    public String getProgramName() {
        return this.zzd;
    }

    public int getState() {
        return this.zzk;
    }

    @RecentlyNonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzt;
    }

    @RecentlyNonNull
    public TimeInterval getValidTimeInterval() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzr);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzs, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.zzu, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzv, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyWalletObject(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) int i, @SafeParcelable.Param(id = 13) ArrayList<WalletObjectMessage> arrayList, @SafeParcelable.Param(id = 14) TimeInterval timeInterval, @SafeParcelable.Param(id = 15) ArrayList<LatLng> arrayList2, @SafeParcelable.Param(id = 16) String str11, @SafeParcelable.Param(id = 17) String str12, @SafeParcelable.Param(id = 18) ArrayList<LabelValueRow> arrayList3, @SafeParcelable.Param(id = 19) boolean z, @SafeParcelable.Param(id = 20) ArrayList<UriData> arrayList4, @SafeParcelable.Param(id = 21) ArrayList<TextModuleData> arrayList5, @SafeParcelable.Param(id = 22) ArrayList<UriData> arrayList6, @SafeParcelable.Param(id = 23) LoyaltyPoints loyaltyPoints) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }
}
