package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C1338b implements Parcelable {
    public static final Parcelable.Creator<C1338b> CREATOR = new C0220a(14);

    /* renamed from: a */
    public final C1353q f6839a;

    /* renamed from: b */
    public final C1353q f6840b;

    /* renamed from: c */
    public final C1340d f6841c;

    /* renamed from: d */
    public final C1353q f6842d;

    /* renamed from: e */
    public final int f6843e;

    /* renamed from: f */
    public final int f6844f;

    public C1338b(C1353q c1353q, C1353q c1353q2, C1340d c1340d, C1353q c1353q3) {
        this.f6839a = c1353q;
        this.f6840b = c1353q2;
        this.f6842d = c1353q3;
        this.f6841c = c1340d;
        if (c1353q3 != null && c1353q.f6896a.compareTo(c1353q3.f6896a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c1353q3 != null && c1353q3.compareTo(c1353q2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f6844f = c1353q.m4106f(c1353q2) + 1;
        this.f6843e = (c1353q2.f6898c - c1353q.f6898c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1338b)) {
            return false;
        }
        C1338b c1338b = (C1338b) obj;
        return this.f6839a.equals(c1338b.f6839a) && this.f6840b.equals(c1338b.f6840b) && Objects.equals(this.f6842d, c1338b.f6842d) && this.f6841c.equals(c1338b.f6841c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6839a, this.f6840b, this.f6842d, this.f6841c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6839a, 0);
        parcel.writeParcelable(this.f6840b, 0);
        parcel.writeParcelable(this.f6842d, 0);
        parcel.writeParcelable(this.f6841c, 0);
    }
}
