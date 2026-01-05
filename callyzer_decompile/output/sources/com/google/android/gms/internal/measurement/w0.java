package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends AbstractC7149a {
    public static final Parcelable.Creator<w0> CREATOR = new v0(1);

    /* renamed from: a */
    public final int f6426a;

    /* renamed from: b */
    public final String f6427b;

    /* renamed from: c */
    public final Intent f6428c;

    public w0(int i10, String str, Intent intent) {
        this.f6426a = i10;
        this.f6427b = str;
        this.f6428c = intent;
    }

    /* renamed from: b */
    public static w0 m3730b(Activity activity) {
        return new w0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f6426a == w0Var.f6426a && Objects.equals(this.f6427b, w0Var.f6427b) && Objects.equals(this.f6428c, w0Var.f6428c);
    }

    public final int hashCode() {
        return this.f6426a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6426a);
        AbstractC5932m.m11778f(parcel, 2, this.f6427b);
        AbstractC5932m.m11777e(parcel, 3, this.f6428c, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
