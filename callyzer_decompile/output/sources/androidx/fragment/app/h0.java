package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import fh.C2289d;
import gh.C2613b;
import l6.AbstractC4400b;
import lh.C4465a;
import o5.C5297f;
import rh.C6542u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f2543a;

    public /* synthetic */ h0(int i10) {
        this.f2543a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2543a) {
            case 0:
                return new i0(parcel, classLoader);
            case 1:
                return new C2289d(parcel, classLoader);
            case 2:
                return new C2613b(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC4400b.f21991b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C4465a(parcel, classLoader);
            case 5:
                return new p013o.d2(parcel, classLoader);
            case 6:
                return new C5297f(parcel, classLoader);
            case 7:
                return new C6542u(parcel, classLoader);
            default:
                return new y7.n0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f2543a) {
            case 0:
                return new i0[i10];
            case 1:
                return new C2289d[i10];
            case 2:
                return new C2613b[i10];
            case 3:
                return new AbstractC4400b[i10];
            case 4:
                return new C4465a[i10];
            case 5:
                return new p013o.d2[i10];
            case 6:
                return new C5297f[i10];
            case 7:
                return new C6542u[i10];
            default:
                return new y7.n0[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2543a) {
            case 0:
                return new i0(parcel, null);
            case 1:
                return new C2289d(parcel, null);
            case 2:
                return new C2613b(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC4400b.f21991b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C4465a(parcel, null);
            case 5:
                return new p013o.d2(parcel, null);
            case 6:
                return new C5297f(parcel, null);
            case 7:
                return new C6542u(parcel, null);
            default:
                return new y7.n0(parcel, null);
        }
    }
}
