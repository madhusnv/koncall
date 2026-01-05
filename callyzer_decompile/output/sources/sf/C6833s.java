package sf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import pf.C5902b;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.s */
/* loaded from: classes.dex */
public final class C6833s extends AbstractC7149a {
    public static final Parcelable.Creator<C6833s> CREATOR = new C4462m(27);

    /* renamed from: a */
    public final int f32487a;

    /* renamed from: b */
    public final IBinder f32488b;

    /* renamed from: c */
    public final C5902b f32489c;

    /* renamed from: d */
    public final boolean f32490d;

    /* renamed from: e */
    public final boolean f32491e;

    public C6833s(int i10, IBinder iBinder, C5902b c5902b, boolean z6, boolean z10) {
        this.f32487a = i10;
        this.f32488b = iBinder;
        this.f32489c = c5902b;
        this.f32490d = z6;
        this.f32491e = z10;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6833s)) {
            return false;
        }
        C6833s c6833s = (C6833s) obj;
        if (!this.f32489c.equals(c6833s.f32489c)) {
            return false;
        }
        Object m0Var2 = null;
        IBinder iBinder = this.f32488b;
        if (iBinder == null) {
            m0Var = null;
        } else {
            int i10 = AbstractBinderC6815a.f32371f;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            m0Var = iInterfaceQueryLocalInterface instanceof InterfaceC6823i ? (InterfaceC6823i) iInterfaceQueryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = c6833s.f32488b;
        if (iBinder2 != null) {
            int i11 = AbstractBinderC6815a.f32371f;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            m0Var2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC6823i ? (InterfaceC6823i) iInterfaceQueryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return AbstractC6840z.m13040k(m0Var, m0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f32487a);
        AbstractC5932m.m11776d(parcel, 2, this.f32488b);
        AbstractC5932m.m11777e(parcel, 3, this.f32489c, i10);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f32490d ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f32491e ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
