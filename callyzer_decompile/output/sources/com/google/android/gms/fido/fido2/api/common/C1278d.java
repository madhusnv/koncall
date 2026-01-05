package com.google.android.gms.fido.fido2.api.common;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import java.util.List;
import mg.AbstractC4723b;
import mg.AbstractC4737p;
import mg.u0;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.d */
/* loaded from: classes.dex */
public final class C1278d extends AbstractC7149a {
    public static final Parcelable.Creator<C1278d> CREATOR;

    /* renamed from: a */
    public final PublicKeyCredentialType f6043a;

    /* renamed from: b */
    public final u0 f6044b;

    /* renamed from: c */
    public final List f6045c;

    static {
        AbstractC4737p.m9632h(2, AbstractC4723b.f23630c, AbstractC4723b.f23631d);
        CREATOR = new C0220a(29);
    }

    public C1278d(String str, List list, byte[] bArr) {
        u0 u0Var = u0.f23702c;
        u0 u0VarM9650k = u0.m9650k(bArr.length, bArr);
        AbstractC6840z.m13036g(str);
        try {
            this.f6043a = PublicKeyCredentialType.fromString(str);
            this.f6044b = u0VarM9650k;
            this.f6045c = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1278d)) {
            return false;
        }
        C1278d c1278d = (C1278d) obj;
        List list = c1278d.f6045c;
        if (!this.f6043a.equals(c1278d.f6043a) || !AbstractC6840z.m13040k(this.f6044b, c1278d.f6044b)) {
            return false;
        }
        List list2 = this.f6045c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6043a, this.f6044b, this.f6045c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6043a);
        String strM16426c = AbstractC8947b.m16426c(this.f6044b.m9652m());
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strM16426c, ", \n transports="), String.valueOf(this.f6045c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f6043a.toString());
        AbstractC5932m.m11775c(parcel, 3, this.f6044b.m9652m());
        AbstractC5932m.m11782j(parcel, 4, this.f6045c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
