package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class LabelValueRow extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    @SafeParcelable.Field(id = 2)
    @Deprecated
    String zza;

    @SafeParcelable.Field(id = 3)
    @Deprecated
    String zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 4)
    ArrayList<LabelValue> zzc;

    public final class Builder {
        public /* synthetic */ Builder(zze zzeVar) {
        }

        @RecentlyNonNull
        public Builder addColumn(@RecentlyNonNull LabelValue labelValue) {
            LabelValueRow.this.zzc.add(labelValue);
            return this;
        }

        @RecentlyNonNull
        public Builder addColumns(@RecentlyNonNull Collection<LabelValue> collection) {
            LabelValueRow.this.zzc.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setHexBackgroundColor(@RecentlyNonNull String str) {
            LabelValueRow.this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setHexFontColor(@RecentlyNonNull String str) {
            LabelValueRow.this.zza = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.zzc = ArrayUtils.newArrayList();
    }

    @RecentlyNonNull
    public static Builder newBuilder() {
        return new LabelValueRow().new Builder(null);
    }

    @RecentlyNonNull
    public ArrayList<LabelValue> getColumns() {
        return this.zzc;
    }

    @RecentlyNonNull
    @Deprecated
    public String getHexBackgroundColor() {
        return this.zzb;
    }

    @RecentlyNonNull
    @Deprecated
    public String getHexFontColor() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) ArrayList<LabelValue> arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }
}
