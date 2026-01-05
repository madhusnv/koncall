package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p001o.gqi;
import p001o.s6c;

/* loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C11005a();

    /* renamed from: a */
    public final Month f12378a;

    /* renamed from: b */
    public final Month f12379b;

    /* renamed from: c */
    public final DateValidator f12380c;

    /* renamed from: d */
    public Month f12381d;

    /* renamed from: e */
    public final int f12382e;

    /* renamed from: f */
    public final int f12383f;

    /* renamed from: g */
    public final int f12384g;

    public interface DateValidator extends Parcelable {
        boolean L0(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public class C11005a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, C11005a c11005a) {
        this(month, month2, dateValidator, month3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f12378a.equals(calendarConstraints.f12378a) && this.f12379b.equals(calendarConstraints.f12379b) && s6c.m47909a(this.f12381d, calendarConstraints.f12381d) && this.f12382e == calendarConstraints.f12382e && this.f12380c.equals(calendarConstraints.f12380c);
    }

    /* renamed from: f */
    public Month m14451f(Month month) {
        return month.compareTo(this.f12378a) < 0 ? this.f12378a : month.compareTo(this.f12379b) > 0 ? this.f12379b : month;
    }

    /* renamed from: g */
    public DateValidator m14452g() {
        return this.f12380c;
    }

    /* renamed from: h */
    public Month m14453h() {
        return this.f12379b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12378a, this.f12379b, this.f12381d, Integer.valueOf(this.f12382e), this.f12380c});
    }

    /* renamed from: i */
    public int m14454i() {
        return this.f12382e;
    }

    /* renamed from: j */
    public int m14455j() {
        return this.f12384g;
    }

    /* renamed from: k */
    public Month m14456k() {
        return this.f12381d;
    }

    /* renamed from: l */
    public Month m14457l() {
        return this.f12378a;
    }

    /* renamed from: m */
    public int m14458m() {
        return this.f12383f;
    }

    /* renamed from: n */
    public boolean m14459n(long j) {
        if (this.f12378a.m14509h(1) <= j) {
            Month month = this.f12379b;
            if (j <= month.m14509h(month.f12485e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void m14460o(Month month) {
        this.f12381d = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12378a, 0);
        parcel.writeParcelable(this.f12379b, 0);
        parcel.writeParcelable(this.f12381d, 0);
        parcel.writeParcelable(this.f12380c, 0);
        parcel.writeInt(this.f12382e);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f12378a = month;
        this.f12379b = month2;
        this.f12381d = month3;
        this.f12382e = i;
        this.f12380c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > gqi.m29327m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f12384g = month.m14514r(month2) + 1;
        this.f12383f = (month2.f12483c - month.f12483c) + 1;
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C11006b {

        /* renamed from: f */
        public static final long f12385f = gqi.m29315a(Month.m14504c(1900, 0).f12486f);

        /* renamed from: g */
        public static final long f12386g = gqi.m29315a(Month.m14504c(2100, 11).f12486f);

        /* renamed from: a */
        public long f12387a;

        /* renamed from: b */
        public long f12388b;

        /* renamed from: c */
        public Long f12389c;

        /* renamed from: d */
        public int f12390d;

        /* renamed from: e */
        public DateValidator f12391e;

        public C11006b() {
            this.f12387a = f12385f;
            this.f12388b = f12386g;
            this.f12391e = DateValidatorPointForward.m14476a(Long.MIN_VALUE);
        }

        /* renamed from: a */
        public CalendarConstraints m14463a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f12391e);
            Month monthM14505d = Month.m14505d(this.f12387a);
            Month monthM14505d2 = Month.m14505d(this.f12388b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f12389c;
            return new CalendarConstraints(monthM14505d, monthM14505d2, dateValidator, l == null ? null : Month.m14505d(l.longValue()), this.f12390d, null);
        }

        /* renamed from: b */
        public C11006b m14464b(long j) {
            this.f12389c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C11006b m14465c(DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f12391e = dateValidator;
            return this;
        }

        public C11006b(CalendarConstraints calendarConstraints) {
            this.f12387a = f12385f;
            this.f12388b = f12386g;
            this.f12391e = DateValidatorPointForward.m14476a(Long.MIN_VALUE);
            this.f12387a = calendarConstraints.f12378a.f12486f;
            this.f12388b = calendarConstraints.f12379b.f12486f;
            this.f12389c = Long.valueOf(calendarConstraints.f12381d.f12486f);
            this.f12390d = calendarConstraints.f12382e;
            this.f12391e = calendarConstraints.f12380c;
        }
    }
}
