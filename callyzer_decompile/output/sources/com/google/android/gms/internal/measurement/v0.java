package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f6420a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6420a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c = null;
                String strM11741f = null;
                boolean zM11747l = false;
                long jM11751p = 0;
                long jM11751p2 = 0;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 1) {
                        jM11751p = AbstractC5931l.m11751p(parcel, i10);
                    } else if (c2 == 2) {
                        jM11751p2 = AbstractC5931l.m11751p(parcel, i10);
                    } else if (c2 == 3) {
                        zM11747l = AbstractC5931l.m11747l(parcel, i10);
                    } else if (c2 == 7) {
                        bundleM11738c = AbstractC5931l.m11738c(parcel, i10);
                    } else if (c2 != '\b') {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        strM11741f = AbstractC5931l.m11741f(parcel, i10);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new u0(jM11751p, jM11751p2, zM11747l, bundleM11738c, strM11741f);
            default:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                String strM11741f2 = null;
                int iM11750o = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iM11750o = AbstractC5931l.m11750o(parcel, i11);
                    } else if (c10 == 2) {
                        strM11741f2 = AbstractC5931l.m11741f(parcel, i11);
                    } else if (c10 != 3) {
                        AbstractC5931l.m11753r(parcel, i11);
                    } else {
                        intent = (Intent) AbstractC5931l.m11740e(parcel, i11, Intent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new w0(iM11750o, strM11741f2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f6420a) {
            case 0:
                return new u0[i10];
            default:
                return new w0[i10];
        }
    }
}
