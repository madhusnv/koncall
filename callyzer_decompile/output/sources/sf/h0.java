package sf;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d */
    public static final Uri f32432d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f32433a;

    /* renamed from: b */
    public final String f32434b;

    /* renamed from: c */
    public final boolean f32435c;

    public h0(String str, boolean z6) {
        AbstractC6840z.m13033d(str);
        this.f32433a = str;
        AbstractC6840z.m13033d("com.google.android.gms");
        this.f32434b = "com.google.android.gms";
        this.f32435c = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent m13014a(android.content.Context r5) throws com.google.android.gms.common.internal.zzaj, android.os.RemoteException {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f32433a
            if (r1 == 0) goto L83
            boolean r2 = r4.f32435c
            if (r2 == 0) goto L74
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "serviceActionBundleKey"
            r2.putString(r3, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            android.net.Uri r3 = sf.h0.f32432d     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            if (r5 == 0) goto L36
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r2 = r5.call(r3, r0, r2)     // Catch: java.lang.Throwable -> L2d
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L29 android.os.RemoteException -> L2b
            goto L48
        L29:
            r5 = move-exception
            goto L3f
        L2b:
            r5 = move-exception
            goto L3f
        L2d:
            r2 = move-exception
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            throw r2     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
        L32:
            r5 = move-exception
            goto L3e
        L34:
            r5 = move-exception
            goto L3e
        L36:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            java.lang.String r2 = "Failed to acquire ContentProviderClient"
            r5.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
            throw r5     // Catch: java.lang.IllegalArgumentException -> L32 android.os.RemoteException -> L34
        L3e:
            r2 = r0
        L3f:
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            r3.concat(r5)
        L48:
            if (r2 == 0) goto L6d
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            r0 = r5
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 != 0) goto L6d
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L60
            goto L6d
        L60:
            com.google.android.gms.common.internal.zzaj r0 = new com.google.android.gms.common.internal.zzaj
            pf.b r1 = new pf.b
            r2 = 25
            r1.<init>(r2, r5)
            r0.<init>(r1)
            throw r0
        L6d:
            if (r0 != 0) goto L74
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            r5.concat(r1)
        L74:
            if (r0 != 0) goto L82
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            java.lang.String r0 = r4.f32434b
            android.content.Intent r5 = r5.setPackage(r0)
            return r5
        L82:
            return r0
        L83:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Intent r5 = r5.setComponent(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.h0.m13014a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return AbstractC6840z.m13040k(this.f32433a, h0Var.f32433a) && AbstractC6840z.m13040k(this.f32434b, h0Var.f32434b) && AbstractC6840z.m13040k(null, null) && this.f32435c == h0Var.f32435c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32433a, this.f32434b, null, 4225, Boolean.valueOf(this.f32435c)});
    }

    public final String toString() {
        String str = this.f32433a;
        if (str != null) {
            return str;
        }
        AbstractC6840z.m13036g(null);
        throw null;
    }
}
