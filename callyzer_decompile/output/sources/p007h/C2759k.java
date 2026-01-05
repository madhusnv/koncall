package p007h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import gg.b0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h.k */
/* loaded from: classes.dex */
public final class C2759k implements Parcelable {
    public static final Parcelable.Creator<C2759k> CREATOR = new b0(25);

    /* renamed from: a */
    public final IntentSender f15315a;

    /* renamed from: b */
    public final Intent f15316b;

    /* renamed from: c */
    public final int f15317c;

    /* renamed from: d */
    public final int f15318d;

    public C2759k(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f15315a = intentSender;
        this.f15316b = intent;
        this.f15317c = i10;
        this.f15318d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeParcelable(this.f15315a, i10);
        dest.writeParcelable(this.f15316b, i10);
        dest.writeInt(this.f15317c);
        dest.writeInt(this.f15318d);
    }
}
