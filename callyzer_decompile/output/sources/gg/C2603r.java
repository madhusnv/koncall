package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;
import mg.AbstractC4723b;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.r */
/* loaded from: classes.dex */
public final class C2603r extends AbstractC7149a {
    public static final Parcelable.Creator<C2603r> CREATOR = new b0(5);

    /* renamed from: a */
    public final EnumC2602q f14140a;

    /* renamed from: b */
    public final String f14141b;

    static {
        new C2603r(EnumC2602q.SUPPORTED.toString(), null);
        new C2603r(EnumC2602q.NOT_SUPPORTED.toString(), null);
    }

    public C2603r(String str, String str2) {
        AbstractC6840z.m13036g(str);
        try {
            this.f14140a = EnumC2602q.fromString(str);
            this.f14141b = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2603r)) {
            return false;
        }
        C2603r c2603r = (C2603r) obj;
        return AbstractC4723b.m9606h(this.f14140a, c2603r.f14140a) && AbstractC4723b.m9606h(this.f14141b, c2603r.f14141b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14140a, this.f14141b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f14140a.toString());
        AbstractC5932m.m11778f(parcel, 3, this.f14141b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
