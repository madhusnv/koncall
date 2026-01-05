package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4462m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.c */
/* loaded from: classes3.dex */
public final class C6003c extends AbstractC6007g {

    /* renamed from: c */
    public static final C6003c f29336c = new C6003c("callHistory", new C6001a(R.string.call_history, "callHistory", R.drawable.icon_call_history));
    public static final Parcelable.Creator<C6003c> CREATOR = new C4462m(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6003c);
    }

    public final int hashCode() {
        return -612059394;
    }

    public final String toString() {
        return "CallHistory";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
