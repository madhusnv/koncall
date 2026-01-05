package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.List;
import p001o.e9g;
import p001o.sq8;

@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({2, 5})
/* loaded from: classes3.dex */
public final class zze extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getUid", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getPackageName", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getAttributionTag", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getListenerId", id = 6)
    private final String zze;

    @SafeParcelable.Field(getter = "getClientFeatures", id = 8)
    private final List zzf;

    @SafeParcelable.Field(getter = "getImpersonator", id = 7)
    private final zze zzg;
    public static final zzd zza = new zzd(null);
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 8) List list, @SafeParcelable.Param(id = 7) zze zzeVar) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        if (zzeVar != null && zzeVar.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3 == null ? zzeVar != null ? zzeVar.zze : null : str3;
        if (list == null) {
            list = zzeVar != null ? zzeVar.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                sq8.m48648g(list, "of(...)");
            }
        }
        sq8.m48649h(list, "<this>");
        zzex zzexVarZzj = zzex.zzj(list);
        sq8.m48648g(zzexVarZzj, "copyOf(...)");
        this.zzf = zzexVarZzj;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zzb == zzeVar.zzb && sq8.m48644c(this.zzc, zzeVar.zzc) && sq8.m48644c(this.zzd, zzeVar.zzd) && sq8.m48644c(this.zze, zzeVar.zze) && sq8.m48644c(this.zzg, zzeVar.zzg) && sq8.m48644c(this.zzf, zzeVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        StringBuilder sb = new StringBuilder(length + (str != null ? str.length() : 0));
        sb.append(this.zzb);
        sb.append("/");
        sb.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb.append("[");
            if (e9g.m24597K(str2, this.zzc, false, 2, null)) {
                sb.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.zze != null) {
            sb.append("/");
            String str3 = this.zze;
            sb.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zzg != null;
    }
}
