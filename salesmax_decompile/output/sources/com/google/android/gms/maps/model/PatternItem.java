package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzq();
    private static final String zza = "PatternItem";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.zzb = i;
        this.zzc = f;
    }

    public static List zza(List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem dot = (PatternItem) it.next();
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.zzb;
                if (i == 0) {
                    Preconditions.checkState(dot.zzc != null, "length must not be null.");
                    dash = new Dash(dot.zzc.floatValue());
                } else if (i == 1) {
                    dot = new Dot();
                } else if (i != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown PatternItem type: ");
                    sb.append(i);
                } else {
                    Preconditions.checkState(dot.zzc != null, "length must not be null.");
                    dash = new Gap(dot.zzc.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
