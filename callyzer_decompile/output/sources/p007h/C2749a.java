package p007h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gg.b0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h.a */
/* loaded from: classes.dex */
public final class C2749a implements Parcelable {
    public static final Parcelable.Creator<C2749a> CREATOR = new b0(24);

    /* renamed from: a */
    public final int f15293a;

    /* renamed from: b */
    public final Intent f15294b;

    public C2749a(Intent intent, int i10) {
        this.f15293a = i10;
        this.f15294b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f15293a;
        sb2.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f15294b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(this.f15293a);
        Intent intent = this.f15294b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }
}
