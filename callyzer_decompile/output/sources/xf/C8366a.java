package xf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import pg.AbstractC5932m;
import qf.InterfaceC6210i;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.a */
/* loaded from: classes.dex */
public final class C8366a extends AbstractC7149a {
    public static final Parcelable.Creator<C8366a> CREATOR = new C8368c();

    /* renamed from: a */
    public final List f40024a;

    /* renamed from: b */
    public final boolean f40025b;

    /* renamed from: c */
    public final String f40026c;

    /* renamed from: d */
    public final String f40027d;

    public C8366a(ArrayList arrayList, boolean z6, String str, String str2) {
        AbstractC6840z.m13036g(arrayList);
        this.f40024a = arrayList;
        this.f40025b = z6;
        this.f40026c = str;
        this.f40027d = str2;
    }

    /* renamed from: b */
    public static C8366a m15539b(List list, boolean z6) {
        TreeSet treeSet = new TreeSet(C8367b.f40028a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC6210i) it.next()).mo433h());
        }
        return new C8366a(new ArrayList(treeSet), z6, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C8366a)) {
            return false;
        }
        C8366a c8366a = (C8366a) obj;
        return this.f40025b == c8366a.f40025b && AbstractC6840z.m13040k(this.f40024a, c8366a.f40024a) && AbstractC6840z.m13040k(this.f40026c, c8366a.f40026c) && AbstractC6840z.m13040k(this.f40027d, c8366a.f40027d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f40025b), this.f40024a, this.f40026c, this.f40027d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11782j(parcel, 1, this.f40024a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f40025b ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 3, this.f40026c);
        AbstractC5932m.m11778f(parcel, 4, this.f40027d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
