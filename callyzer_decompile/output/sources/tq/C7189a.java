package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.a */
/* loaded from: classes3.dex */
public final class C7189a extends AbstractC7201m {

    /* renamed from: e */
    public static final C7189a f34479e = new C7189a(R.string.add_lead, R.drawable.ic_add_contact, 1, false);
    public static final Parcelable.Creator<C7189a> CREATOR = new g0(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7189a);
    }

    public final int hashCode() {
        return -376667476;
    }

    public final String toString() {
        return "AddLead";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
