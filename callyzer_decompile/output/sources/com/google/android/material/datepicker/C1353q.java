package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C1353q implements Comparable, Parcelable {
    public static final Parcelable.Creator<C1353q> CREATOR = new C0220a(16);

    /* renamed from: a */
    public final Calendar f6896a;

    /* renamed from: b */
    public final int f6897b;

    /* renamed from: c */
    public final int f6898c;

    /* renamed from: d */
    public final int f6899d;

    /* renamed from: e */
    public final int f6900e;

    /* renamed from: f */
    public final long f6901f;

    /* renamed from: g */
    public String f6902g;

    public C1353q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM4111a = AbstractC1361y.m4111a(calendar);
        this.f6896a = calendarM4111a;
        this.f6897b = calendarM4111a.get(2);
        this.f6898c = calendarM4111a.get(1);
        this.f6899d = calendarM4111a.getMaximum(7);
        this.f6900e = calendarM4111a.getActualMaximum(5);
        this.f6901f = calendarM4111a.getTimeInMillis();
    }

    /* renamed from: b */
    public static C1353q m4101b(int i10, int i11) {
        Calendar calendarM4113c = AbstractC1361y.m4113c(null);
        calendarM4113c.set(1, i10);
        calendarM4113c.set(2, i11);
        return new C1353q(calendarM4113c);
    }

    /* renamed from: c */
    public static C1353q m4102c(long j6) {
        Calendar calendarM4113c = AbstractC1361y.m4113c(null);
        calendarM4113c.setTimeInMillis(j6);
        return new C1353q(calendarM4113c);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1353q c1353q) {
        return this.f6896a.compareTo(c1353q.f6896a);
    }

    /* renamed from: d */
    public final int m4104d() {
        Calendar calendar = this.f6896a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f6899d : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m4105e(Context context) {
        if (this.f6902g == null) {
            this.f6902g = DateUtils.formatDateTime(context, this.f6896a.getTimeInMillis() - TimeZone.getDefault().getOffset(r0), 36);
        }
        return this.f6902g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353q)) {
            return false;
        }
        C1353q c1353q = (C1353q) obj;
        return this.f6897b == c1353q.f6897b && this.f6898c == c1353q.f6898c;
    }

    /* renamed from: f */
    public final int m4106f(C1353q c1353q) {
        if (!(this.f6896a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c1353q.f6897b - this.f6897b) + ((c1353q.f6898c - this.f6898c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6897b), Integer.valueOf(this.f6898c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6898c);
        parcel.writeInt(this.f6897b);
    }
}
