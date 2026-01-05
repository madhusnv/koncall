package p001o;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes2.dex */
public abstract class swc {
    /* renamed from: a */
    public static xti m48964a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).m9961a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static xti m48965b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(swc.class.getClassLoader());
            return m48964a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m48966c(Bundle bundle, String str, xti xtiVar) {
        if (xtiVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", m48967d(xtiVar));
        bundle.putParcelable(str, bundle2);
    }

    /* renamed from: d */
    public static Parcelable m48967d(xti xtiVar) {
        return new ParcelImpl(xtiVar);
    }
}
