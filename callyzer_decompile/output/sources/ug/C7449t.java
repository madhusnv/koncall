package ug;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.t */
/* loaded from: classes.dex */
public final class C7449t extends AbstractC7149a {
    public static final Parcelable.Creator<C7449t> CREATOR = new sf.g0(18);

    /* renamed from: a */
    public final String f35827a;

    /* renamed from: b */
    public final C7448s f35828b;

    /* renamed from: c */
    public final String f35829c;

    /* renamed from: d */
    public final long f35830d;

    public C7449t(String str, C7448s c7448s, String str2, long j6) {
        this.f35827a = str;
        this.f35828b = c7448s;
        this.f35829c = str2;
        this.f35830d = j6;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f35828b);
        String str = this.f35829c;
        int length = String.valueOf(str).length();
        String str2 = this.f35827a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        p020v.a1.m14319B(sb2, "origin=", str, ",name=", str2);
        return AbstractC1452a.m4564k(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        sf.g0.m13012b(this, parcel, i10);
    }

    public C7449t(C7449t c7449t, long j6) {
        AbstractC6840z.m13036g(c7449t);
        this.f35827a = c7449t.f35827a;
        this.f35828b = c7449t.f35828b;
        this.f35829c = c7449t.f35829c;
        this.f35830d = j6;
    }
}
