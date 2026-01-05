package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4462m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.e */
/* loaded from: classes3.dex */
public final class C6005e extends AbstractC6007g {

    /* renamed from: c */
    public static final C6005e f29347c = new C6005e("lead", new C6001a(R.string.my_lead, "lead", R.drawable.icon_mylead));
    public static final Parcelable.Creator<C6005e> CREATOR = new C4462m(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6005e);
    }

    public final int hashCode() {
        return 600171839;
    }

    public final String toString() {
        return "Leads";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
