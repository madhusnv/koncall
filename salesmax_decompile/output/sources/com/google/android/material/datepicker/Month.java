package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p001o.gqi;
import p001o.wz4;

/* loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C11031a();

    /* renamed from: a */
    public final Calendar f12481a;

    /* renamed from: b */
    public final int f12482b;

    /* renamed from: c */
    public final int f12483c;

    /* renamed from: d */
    public final int f12484d;

    /* renamed from: e */
    public final int f12485e;

    /* renamed from: f */
    public final long f12486f;

    /* renamed from: g */
    public String f12487g;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    public class C11031a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.m14504c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM29319e = gqi.m29319e(calendar);
        this.f12481a = calendarM29319e;
        this.f12482b = calendarM29319e.get(2);
        this.f12483c = calendarM29319e.get(1);
        this.f12484d = calendarM29319e.getMaximum(7);
        this.f12485e = calendarM29319e.getActualMaximum(5);
        this.f12486f = calendarM29319e.getTimeInMillis();
    }

    /* renamed from: c */
    public static Month m14504c(int i, int i2) {
        Calendar calendarM29327m = gqi.m29327m();
        calendarM29327m.set(1, i);
        calendarM29327m.set(2, i2);
        return new Month(calendarM29327m);
    }

    /* renamed from: d */
    public static Month m14505d(long j) {
        Calendar calendarM29327m = gqi.m29327m();
        calendarM29327m.setTimeInMillis(j);
        return new Month(calendarM29327m);
    }

    /* renamed from: e */
    public static Month m14506e() {
        return new Month(gqi.m29325k());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f12481a.compareTo(month.f12481a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f12482b == month.f12482b && this.f12483c == month.f12483c;
    }

    /* renamed from: g */
    public int m14508g(int i) {
        int i2 = this.f12481a.get(7);
        if (i <= 0) {
            i = this.f12481a.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.f12484d : i3;
    }

    /* renamed from: h */
    public long m14509h(int i) {
        Calendar calendarM29319e = gqi.m29319e(this.f12481a);
        calendarM29319e.set(5, i);
        return calendarM29319e.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12482b), Integer.valueOf(this.f12483c)});
    }

    /* renamed from: j */
    public int m14510j(long j) {
        Calendar calendarM29319e = gqi.m29319e(this.f12481a);
        calendarM29319e.setTimeInMillis(j);
        return calendarM29319e.get(5);
    }

    /* renamed from: m */
    public String m14511m() {
        if (this.f12487g == null) {
            this.f12487g = wz4.m55441l(this.f12481a.getTimeInMillis());
        }
        return this.f12487g;
    }

    /* renamed from: n */
    public long m14512n() {
        return this.f12481a.getTimeInMillis();
    }

    /* renamed from: o */
    public Month m14513o(int i) {
        Calendar calendarM29319e = gqi.m29319e(this.f12481a);
        calendarM29319e.add(2, i);
        return new Month(calendarM29319e);
    }

    /* renamed from: r */
    public int m14514r(Month month) {
        if (this.f12481a instanceof GregorianCalendar) {
            return ((month.f12483c - this.f12483c) * 12) + (month.f12482b - this.f12482b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12483c);
        parcel.writeInt(this.f12482b);
    }
}
