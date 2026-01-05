package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c9.C0910e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import lf.C4462m;
import mm.AbstractC4801l;
import org.bouncycastle.iana.AEADAlgorithm;
import pf.C5902b;
import pg.AbstractC5932m;
import qf.InterfaceC6211j;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Status extends AbstractC7149a implements InterfaceC6211j, ReflectedParcelable {

    /* renamed from: a */
    public final int f6007a;

    /* renamed from: b */
    public final String f6008b;

    /* renamed from: c */
    public final PendingIntent f6009c;

    /* renamed from: d */
    public final C5902b f6010d;

    /* renamed from: e */
    public static final Status f6002e = new Status(0, null, null, null);

    /* renamed from: f */
    public static final Status f6003f = new Status(14, null, null, null);

    /* renamed from: g */
    public static final Status f6004g = new Status(8, null, null, null);

    /* renamed from: h */
    public static final Status f6005h = new Status(15, null, null, null);

    /* renamed from: j */
    public static final Status f6006j = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C4462m(22);

    public Status(int i10, String str, PendingIntent pendingIntent, C5902b c5902b) {
        this.f6007a = i10;
        this.f6008b = str;
        this.f6009c = pendingIntent;
        this.f6010d = c5902b;
    }

    /* renamed from: b */
    public final boolean m3092b() {
        return this.f6007a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6007a == status.f6007a && AbstractC6840z.m13040k(this.f6008b, status.f6008b) && AbstractC6840z.m13040k(this.f6009c, status.f6009c) && AbstractC6840z.m13040k(this.f6010d, status.f6010d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6007a), this.f6008b, this.f6009c, this.f6010d});
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        String strM9730d = this.f6008b;
        if (strM9730d == null) {
            int i10 = this.f6007a;
            switch (i10) {
                case -1:
                    strM9730d = "SUCCESS_CACHE";
                    break;
                case 0:
                    strM9730d = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strM9730d = AbstractC4801l.m9730d(i10, "unknown status code: ");
                    break;
                case 2:
                    strM9730d = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strM9730d = "SERVICE_DISABLED";
                    break;
                case 4:
                    strM9730d = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strM9730d = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strM9730d = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strM9730d = "NETWORK_ERROR";
                    break;
                case 8:
                    strM9730d = "INTERNAL_ERROR";
                    break;
                case 10:
                    strM9730d = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strM9730d = "ERROR";
                    break;
                case 14:
                    strM9730d = "INTERRUPTED";
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    strM9730d = "TIMEOUT";
                    break;
                case 16:
                    strM9730d = "CANCELED";
                    break;
                case 17:
                    strM9730d = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strM9730d = "DEAD_CLIENT";
                    break;
                case 19:
                    strM9730d = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strM9730d = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strM9730d = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strM9730d = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c0910e.m2606p(strM9730d, "statusCode");
        c0910e.m2606p(this.f6009c, "resolution");
        return c0910e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6007a);
        AbstractC5932m.m11778f(parcel, 2, this.f6008b);
        AbstractC5932m.m11777e(parcel, 3, this.f6009c, i10);
        AbstractC5932m.m11777e(parcel, 4, this.f6010d, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    @Override // qf.InterfaceC6211j
    /* renamed from: a */
    public final Status mo3091a() {
        return this;
    }
}
