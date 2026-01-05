package wg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pf.C5902b;
import pg.AbstractC5931l;
import sf.C6832r;
import sf.C6833s;
import wj.C8089o;
import y7.C8583r;
import y7.a1;
import y7.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.g */
/* loaded from: classes.dex */
public final class C8034g implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f38558a;

    public /* synthetic */ C8034g(int i10) {
        this.f38558a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f38558a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                C6832r c6832r = null;
                int iM11750o = 0;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 1) {
                        iM11750o = AbstractC5931l.m11750o(parcel, i10);
                    } else if (c2 != 2) {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        c6832r = (C6832r) AbstractC5931l.m11740e(parcel, i10, C6832r.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C8033f(iM11750o, c6832r);
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                C5902b c5902b = null;
                int iM11750o2 = 0;
                C6833s c6833s = null;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iM11750o2 = AbstractC5931l.m11750o(parcel, i11);
                    } else if (c10 == 2) {
                        c5902b = (C5902b) AbstractC5931l.m11740e(parcel, i11, C5902b.CREATOR);
                    } else if (c10 != 3) {
                        AbstractC5931l.m11753r(parcel, i11);
                    } else {
                        c6833s = (C6833s) AbstractC5931l.m11740e(parcel, i11, C6833s.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C8035h(iM11750o2, c5902b, c6833s);
            case 2:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c = null;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        bundleM11738c = AbstractC5931l.m11738c(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C8089o(bundleM11738c);
            case 3:
                C8583r c8583r = new C8583r();
                c8583r.f41765a = parcel.readInt();
                c8583r.f41766b = parcel.readInt();
                c8583r.f41767c = parcel.readInt() == 1;
                return c8583r;
            case 4:
                z0 z0Var = new z0();
                z0Var.f41835a = parcel.readInt();
                z0Var.f41836b = parcel.readInt();
                z0Var.f41838d = parcel.readInt() == 1;
                int i13 = parcel.readInt();
                if (i13 > 0) {
                    int[] iArr = new int[i13];
                    z0Var.f41837c = iArr;
                    parcel.readIntArray(iArr);
                }
                return z0Var;
            default:
                a1 a1Var = new a1();
                a1Var.f41565a = parcel.readInt();
                a1Var.f41566b = parcel.readInt();
                int i14 = parcel.readInt();
                a1Var.f41567c = i14;
                if (i14 > 0) {
                    int[] iArr2 = new int[i14];
                    a1Var.f41568d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i15 = parcel.readInt();
                a1Var.f41569e = i15;
                if (i15 > 0) {
                    int[] iArr3 = new int[i15];
                    a1Var.f41570f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                a1Var.f41572h = parcel.readInt() == 1;
                a1Var.f41573j = parcel.readInt() == 1;
                a1Var.f41574k = parcel.readInt() == 1;
                a1Var.f41571g = parcel.readArrayList(z0.class.getClassLoader());
                return a1Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f38558a) {
            case 0:
                return new C8033f[i10];
            case 1:
                return new C8035h[i10];
            case 2:
                return new C8089o[i10];
            case 3:
                return new C8583r[i10];
            case 4:
                return new z0[i10];
            default:
                return new a1[i10];
        }
    }
}
