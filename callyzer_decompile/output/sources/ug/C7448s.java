package ug;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.s */
/* loaded from: classes.dex */
public final class C7448s extends AbstractC7149a implements Iterable {
    public static final Parcelable.Creator<C7448s> CREATOR = new sf.g0(17);

    /* renamed from: a */
    public final Bundle f35811a;

    public C7448s(Bundle bundle) {
        this.f35811a = bundle;
    }

    /* renamed from: b */
    public final Object m14131b(String str) {
        return this.f35811a.get(str);
    }

    /* renamed from: c */
    public final Double m14132c() {
        return Double.valueOf(this.f35811a.getDouble("value"));
    }

    /* renamed from: e */
    public final String m14133e() {
        return this.f35811a.getString("currency");
    }

    /* renamed from: g */
    public final Bundle m14134g() {
        return new Bundle(this.f35811a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new og.c0(this);
    }

    public final String toString() {
        return this.f35811a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11774b(parcel, 2, m14134g());
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
