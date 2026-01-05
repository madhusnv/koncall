package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
import p001o.gqi;

/* loaded from: classes3.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C11011a();

    /* renamed from: a */
    public final long f12396a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    public class C11011a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j, C11011a c11011a) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointBackward m14472a(long j) {
        return new DateValidatorPointBackward(j);
    }

    /* renamed from: b */
    public static DateValidatorPointBackward m14473b() {
        return m14472a(gqi.m29325k().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean L0(long j) {
        return j <= this.f12396a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f12396a == ((DateValidatorPointBackward) obj).f12396a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12396a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12396a);
    }

    public DateValidatorPointBackward(long j) {
        this.f12396a = j;
    }
}
