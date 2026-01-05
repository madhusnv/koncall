package ug;

import android.os.Parcel;
import android.os.Parcelable;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j4 extends AbstractC7149a {
    public static final Parcelable.Creator<j4> CREATOR = new sf.g0(23);

    /* renamed from: a */
    public final int f35548a;

    /* renamed from: b */
    public final String f35549b;

    /* renamed from: c */
    public final long f35550c;

    /* renamed from: d */
    public final Long f35551d;

    /* renamed from: e */
    public final String f35552e;

    /* renamed from: f */
    public final String f35553f;

    /* renamed from: g */
    public final Double f35554g;

    public j4(int i10, String str, long j6, Long l9, Float f6, String str2, String str3, Double d2) {
        this.f35548a = i10;
        this.f35549b = str;
        this.f35550c = j6;
        this.f35551d = l9;
        this.f35554g = i10 == 1 ? f6 != null ? Double.valueOf(f6.doubleValue()) : null : d2;
        this.f35552e = str2;
        this.f35553f = str3;
    }

    /* renamed from: b */
    public final Object m14016b() {
        Long l9 = this.f35551d;
        if (l9 != null) {
            return l9;
        }
        Double d2 = this.f35554g;
        if (d2 != null) {
            return d2;
        }
        String str = this.f35552e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        sf.g0.m13013c(this, parcel);
    }

    public j4(long j6, Object obj, String str, String str2) {
        AbstractC6840z.m13033d(str);
        this.f35548a = 2;
        this.f35549b = str;
        this.f35550c = j6;
        this.f35553f = str2;
        if (obj == null) {
            this.f35551d = null;
            this.f35554g = null;
            this.f35552e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f35551d = (Long) obj;
            this.f35554g = null;
            this.f35552e = null;
        } else if (obj instanceof String) {
            this.f35551d = null;
            this.f35554g = null;
            this.f35552e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f35551d = null;
                this.f35554g = (Double) obj;
                this.f35552e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public j4(k4 k4Var) {
        this(k4Var.f35580d, k4Var.f35581e, k4Var.f35579c, k4Var.f35578b);
    }
}
