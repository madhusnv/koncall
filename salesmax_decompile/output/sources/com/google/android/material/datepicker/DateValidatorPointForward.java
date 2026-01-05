package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
import p001o.gqi;

/* loaded from: classes3.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C11012a();

    /* renamed from: a */
    public final long f12397a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    public class C11012a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, C11012a c11012a) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m14476a(long j) {
        return new DateValidatorPointForward(j);
    }

    /* renamed from: b */
    public static DateValidatorPointForward m14477b() {
        return m14476a(gqi.m29325k().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean L0(long j) {
        return j >= this.f12397a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f12397a == ((DateValidatorPointForward) obj).f12397a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12397a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12397a);
    }

    public DateValidatorPointForward(long j) {
        this.f12397a = j;
    }
}
