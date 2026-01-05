package pf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c9.C0910e;
import java.util.Arrays;
import lf.C4462m;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.b */
/* loaded from: classes.dex */
public final class C5902b extends AbstractC7149a {

    /* renamed from: a */
    public final int f28735a;

    /* renamed from: b */
    public final int f28736b;

    /* renamed from: c */
    public final PendingIntent f28737c;

    /* renamed from: d */
    public final String f28738d;

    /* renamed from: e */
    public static final C5902b f28734e = new C5902b(0);
    public static final Parcelable.Creator<C5902b> CREATOR = new C4462m(12);

    public C5902b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f28735a = i10;
        this.f28736b = i11;
        this.f28737c = pendingIntent;
        this.f28738d = str;
    }

    /* renamed from: b */
    public static String m11507b(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return AbstractC5601a.m11232c(i10, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5902b)) {
            return false;
        }
        C5902b c5902b = (C5902b) obj;
        return this.f28736b == c5902b.f28736b && AbstractC6840z.m13040k(this.f28737c, c5902b.f28737c) && AbstractC6840z.m13040k(this.f28738d, c5902b.f28738d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28736b), this.f28737c, this.f28738d});
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        c0910e.m2606p(m11507b(this.f28736b), "statusCode");
        c0910e.m2606p(this.f28737c, "resolution");
        c0910e.m2606p(this.f28738d, "message");
        return c0910e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f28735a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f28736b);
        AbstractC5932m.m11777e(parcel, 3, this.f28737c, i10);
        AbstractC5932m.m11778f(parcel, 4, this.f28738d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    public C5902b(int i10) {
        this(1, i10, null, null);
    }

    public C5902b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
