package dg;

import android.os.Parcel;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import com.google.android.gms.internal.measurement.AbstractC1308x;
import lg.AbstractC4464a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dg.k */
/* loaded from: classes.dex */
public final class C1722k extends AbstractC1308x {
    /* renamed from: U */
    public final InterfaceC0968a m5417U(BinderC0969b binderC0969b, String str, int i10, BinderC0969b binderC0969b2) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC4464a.m9311c(parcelM3750Q, binderC0969b);
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeInt(i10);
        AbstractC4464a.m9311c(parcelM3750Q, binderC0969b2);
        Parcel parcelM3748O = m3748O(parcelM3750Q, 2);
        InterfaceC0968a interfaceC0968aM2726R = BinderC0969b.m2726R(parcelM3748O.readStrongBinder());
        parcelM3748O.recycle();
        return interfaceC0968aM2726R;
    }

    /* renamed from: V */
    public final InterfaceC0968a m5418V(BinderC0969b binderC0969b, String str, int i10, BinderC0969b binderC0969b2) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC4464a.m9311c(parcelM3750Q, binderC0969b);
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeInt(i10);
        AbstractC4464a.m9311c(parcelM3750Q, binderC0969b2);
        Parcel parcelM3748O = m3748O(parcelM3750Q, 3);
        InterfaceC0968a interfaceC0968aM2726R = BinderC0969b.m2726R(parcelM3748O.readStrongBinder());
        parcelM3748O.recycle();
        return interfaceC0968aM2726R;
    }
}
