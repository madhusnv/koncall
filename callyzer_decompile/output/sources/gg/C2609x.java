package gg;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.x */
/* loaded from: classes.dex */
public final class C2609x extends AbstractC7149a {
    public static final Parcelable.Creator<C2609x> CREATOR = new C0220a(22);

    /* renamed from: a */
    public final boolean f14148a;

    public C2609x(boolean z6) {
        this.f14148a = Boolean.valueOf(z6).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2609x) && this.f14148a == ((C2609x) obj).f14148a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14148a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f14148a ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
