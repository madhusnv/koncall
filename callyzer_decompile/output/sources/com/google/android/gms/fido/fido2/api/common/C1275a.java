package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import gg.AbstractC2592g;
import gg.b0;
import java.util.Arrays;
import l4.C4367l;
import mg.C4725d;
import pg.AbstractC5932m;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.a */
/* loaded from: classes.dex */
public final class C1275a extends AbstractC2592g {
    public static final Parcelable.Creator<C1275a> CREATOR = new b0(17);

    /* renamed from: a */
    public final ErrorCode f6023a;

    /* renamed from: b */
    public final String f6024b;

    /* renamed from: c */
    public final int f6025c;

    public C1275a(int i10, String str, int i11) {
        try {
            this.f6023a = ErrorCode.toErrorCode(i10);
            this.f6024b = str;
            this.f6025c = i11;
        } catch (ErrorCode.UnsupportedErrorCodeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1275a)) {
            return false;
        }
        C1275a c1275a = (C1275a) obj;
        return AbstractC6840z.m13040k(this.f6023a, c1275a.f6023a) && AbstractC6840z.m13040k(this.f6024b, c1275a.f6024b) && AbstractC6840z.m13040k(Integer.valueOf(this.f6025c), Integer.valueOf(c1275a.f6025c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6023a, this.f6024b, Integer.valueOf(this.f6025c)});
    }

    public final String toString() {
        C4367l c4367l = new C4367l(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.f6023a.getCode());
        C4725d c4725d = new C4725d(6, false);
        ((C4367l) c4367l.f21923d).f21923d = c4725d;
        c4367l.f21923d = c4725d;
        c4725d.f21922c = strValueOf;
        c4725d.f21921b = "errorCode";
        String str = this.f6024b;
        if (str != null) {
            c4367l.m9128O(str, "errorMessage");
        }
        return c4367l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int code = this.f6023a.getCode();
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(code);
        AbstractC5932m.m11778f(parcel, 3, this.f6024b);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f6025c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
