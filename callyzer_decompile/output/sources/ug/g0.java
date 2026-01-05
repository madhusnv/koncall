package ug;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1308x;
import com.google.android.gms.internal.measurement.AbstractC1310z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC1308x implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // ug.i0
    /* renamed from: B */
    public final List mo13893B(String str, String str2, boolean z6, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        ClassLoader classLoader = AbstractC1310z.f6461a;
        parcelM3750Q.writeInt(z6 ? 1 : 0);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM3749P.createTypedArrayList(j4.CREATOR);
        parcelM3749P.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ug.i0
    /* renamed from: C */
    public final void mo13894C(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 25);
    }

    @Override // ug.i0
    /* renamed from: D */
    public final void mo13895D(n4 n4Var, Bundle bundle, k0 k0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        AbstractC1310z.m3797c(parcelM3750Q, k0Var);
        m3752S(parcelM3750Q, 31);
    }

    @Override // ug.i0
    /* renamed from: F */
    public final void mo13896F(j4 j4Var, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, j4Var);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 2);
    }

    @Override // ug.i0
    /* renamed from: G */
    public final void mo13897G(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 6);
    }

    @Override // ug.i0
    /* renamed from: H */
    public final void mo13898H(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 26);
    }

    @Override // ug.i0
    /* renamed from: I */
    public final C7438i mo13899I(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 21);
        C7438i c7438i = (C7438i) AbstractC1310z.m3795a(parcelM3749P, C7438i.CREATOR);
        parcelM3749P.recycle();
        return c7438i;
    }

    @Override // ug.i0
    /* renamed from: J */
    public final byte[] mo13900J(String str, C7449t c7449t) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, c7449t);
        parcelM3750Q.writeString(str);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 9);
        byte[] bArrCreateByteArray = parcelM3749P.createByteArray();
        parcelM3749P.recycle();
        return bArrCreateByteArray;
    }

    @Override // ug.i0
    /* renamed from: N */
    public final void mo13901N(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 4);
    }

    @Override // ug.i0
    /* renamed from: h */
    public final List mo13902h(String str, String str2, String str3, boolean z6) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(null);
        parcelM3750Q.writeString(str2);
        parcelM3750Q.writeString(str3);
        ClassLoader classLoader = AbstractC1310z.f6461a;
        parcelM3750Q.writeInt(z6 ? 1 : 0);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM3749P.createTypedArrayList(j4.CREATOR);
        parcelM3749P.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ug.i0
    /* renamed from: i */
    public final void mo13903i(C7434e c7434e, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, c7434e);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 12);
    }

    @Override // ug.i0
    /* renamed from: j */
    public final void mo13904j(C7449t c7449t, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, c7449t);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 1);
    }

    @Override // ug.i0
    /* renamed from: k */
    public final void mo13905k(n4 n4Var, a4 a4Var, m0 m0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        AbstractC1310z.m3796b(parcelM3750Q, a4Var);
        AbstractC1310z.m3797c(parcelM3750Q, m0Var);
        m3752S(parcelM3750Q, 29);
    }

    @Override // ug.i0
    /* renamed from: l */
    public final void mo13906l(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 20);
    }

    @Override // ug.i0
    /* renamed from: n */
    public final String mo13907n(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 11);
        String string = parcelM3749P.readString();
        parcelM3749P.recycle();
        return string;
    }

    @Override // ug.i0
    /* renamed from: o */
    public final List mo13908o(String str, String str2, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM3749P.createTypedArrayList(C7434e.CREATOR);
        parcelM3749P.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ug.i0
    /* renamed from: p */
    public final void mo13909p(long j6, String str, String str2, String str3) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeLong(j6);
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        parcelM3750Q.writeString(str3);
        m3752S(parcelM3750Q, 10);
    }

    @Override // ug.i0
    /* renamed from: r */
    public final void mo13910r(Bundle bundle, n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 19);
    }

    @Override // ug.i0
    /* renamed from: t */
    public final List mo13911t(String str, String str2, String str3) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(null);
        parcelM3750Q.writeString(str2);
        parcelM3750Q.writeString(str3);
        Parcel parcelM3749P = m3749P(parcelM3750Q, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM3749P.createTypedArrayList(C7434e.CREATOR);
        parcelM3749P.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ug.i0
    /* renamed from: v */
    public final void mo13912v(n4 n4Var, C7433d c7433d) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        AbstractC1310z.m3796b(parcelM3750Q, c7433d);
        m3752S(parcelM3750Q, 30);
    }

    @Override // ug.i0
    /* renamed from: w */
    public final void mo13913w(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 27);
    }

    @Override // ug.i0
    /* renamed from: x */
    public final void mo13914x(n4 n4Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, n4Var);
        m3752S(parcelM3750Q, 18);
    }
}
