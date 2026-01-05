package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import gg.C2593h;
import gg.b0;
import java.util.Arrays;
import p020v.a1;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.e */
/* loaded from: classes.dex */
public final class C1279e extends AbstractC7149a {
    public static final Parcelable.Creator<C1279e> CREATOR = new b0(0);

    /* renamed from: a */
    public final PublicKeyCredentialType f6046a;

    /* renamed from: b */
    public final C2593h f6047b;

    public C1279e(String str, int i10) {
        AbstractC6840z.m13036g(str);
        try {
            this.f6046a = PublicKeyCredentialType.fromString(str);
            try {
                this.f6047b = C2593h.m6586a(i10);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1279e)) {
            return false;
        }
        C1279e c1279e = (C1279e) obj;
        return this.f6046a.equals(c1279e.f6046a) && this.f6047b.equals(c1279e.f6047b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6046a, this.f6047b});
    }

    public final String toString() {
        return a1.m14333m("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f6046a), ", \n algorithm=", String.valueOf(this.f6047b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f6046a.toString());
        int algoValue = this.f6047b.f14112a.getAlgoValue();
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(algoValue);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
