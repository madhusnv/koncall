package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import lf.C4462m;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Scope extends AbstractC7149a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C4462m(21);

    /* renamed from: a */
    public final int f6000a;

    /* renamed from: b */
    public final String f6001b;

    public Scope(int i10, String str) {
        AbstractC6840z.m13034e(str, "scopeUri must not be null or empty");
        this.f6000a = i10;
        this.f6001b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6001b.equals(((Scope) obj).f6001b);
    }

    public final int hashCode() {
        return this.f6001b.hashCode();
    }

    public final String toString() {
        return this.f6001b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6000a);
        AbstractC5932m.m11778f(parcel, 2, this.f6001b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
