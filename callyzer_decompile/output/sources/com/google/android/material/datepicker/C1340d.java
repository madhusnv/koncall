package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C1340d implements Parcelable {
    public static final Parcelable.Creator<C1340d> CREATOR = new C0220a(15);

    /* renamed from: a */
    public final long f6851a;

    public C1340d(long j6) {
        this.f6851a = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1340d) && this.f6851a == ((C1340d) obj).f6851a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6851a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6851a);
    }
}
