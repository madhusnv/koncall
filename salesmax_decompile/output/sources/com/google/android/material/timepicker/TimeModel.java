package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.v9e;
import p001o.yza;

/* loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C11166a();

    /* renamed from: a */
    public final yza f13204a;

    /* renamed from: b */
    public final yza f13205b;

    /* renamed from: c */
    public final int f13206c;

    /* renamed from: d */
    public int f13207d;

    /* renamed from: e */
    public int f13208e;

    /* renamed from: f */
    public int f13209f;

    /* renamed from: g */
    public int f13210g;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    public class C11166a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m15523a(Resources resources, CharSequence charSequence) {
        return m15524b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m15524b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static int m15525g(int i) {
        return i >= 12 ? 1 : 0;
    }

    /* renamed from: c */
    public int m15526c() {
        return this.f13206c == 1 ? v9e.material_hour_24h_suffix : v9e.material_hour_suffix;
    }

    /* renamed from: d */
    public int m15527d() {
        if (this.f13206c == 1) {
            return this.f13207d % 24;
        }
        int i = this.f13207d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f13210g == 1 ? i - 12 : i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public yza m15528e() {
        return this.f13205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f13207d == timeModel.f13207d && this.f13208e == timeModel.f13208e && this.f13206c == timeModel.f13206c && this.f13209f == timeModel.f13209f;
    }

    /* renamed from: f */
    public yza m15529f() {
        return this.f13204a;
    }

    /* renamed from: h */
    public void m15530h(int i) {
        if (this.f13206c == 1) {
            this.f13207d = i;
        } else {
            this.f13207d = (i % 12) + (this.f13210g != 1 ? 0 : 12);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13206c), Integer.valueOf(this.f13207d), Integer.valueOf(this.f13208e), Integer.valueOf(this.f13209f)});
    }

    /* renamed from: i */
    public void m15531i(int i) {
        this.f13210g = m15525g(i);
        this.f13207d = i;
    }

    /* renamed from: j */
    public void m15532j(int i) {
        this.f13208e = i % 60;
    }

    /* renamed from: k */
    public void m15533k(int i) {
        if (i != this.f13210g) {
            this.f13210g = i;
            int i2 = this.f13207d;
            if (i2 < 12 && i == 1) {
                this.f13207d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.f13207d = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13207d);
        parcel.writeInt(this.f13208e);
        parcel.writeInt(this.f13209f);
        parcel.writeInt(this.f13206c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f13207d = i;
        this.f13208e = i2;
        this.f13209f = i3;
        this.f13206c = i4;
        this.f13210g = m15525g(i);
        this.f13204a = new yza(59);
        this.f13205b = new yza(i4 == 1 ? 23 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
