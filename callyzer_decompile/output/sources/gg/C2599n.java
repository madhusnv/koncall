package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.n */
/* loaded from: classes.dex */
public final class C2599n extends AbstractC7149a {
    public static final Parcelable.Creator<C2599n> CREATOR = new b0(1);

    /* renamed from: a */
    public final String f14133a;

    /* renamed from: b */
    public final String f14134b;

    /* renamed from: c */
    public final String f14135c;

    public C2599n(String str, String str2, String str3) {
        AbstractC6840z.m13036g(str);
        this.f14133a = str;
        AbstractC6840z.m13036g(str2);
        this.f14134b = str2;
        this.f14135c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2599n)) {
            return false;
        }
        C2599n c2599n = (C2599n) obj;
        return AbstractC6840z.m13040k(this.f14133a, c2599n.f14133a) && AbstractC6840z.m13040k(this.f14134b, c2599n.f14134b) && AbstractC6840z.m13040k(this.f14135c, c2599n.f14135c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14133a, this.f14134b, this.f14135c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f14133a);
        sb2.append("', \n name='");
        sb2.append(this.f14134b);
        sb2.append("', \n icon='");
        return AbstractC1452a.m4564k(sb2, this.f14135c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f14133a);
        AbstractC5932m.m11778f(parcel, 3, this.f14134b);
        AbstractC5932m.m11778f(parcel, 4, this.f14135c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
