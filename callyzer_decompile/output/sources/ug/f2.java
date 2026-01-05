package ug;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35433a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f35434b;

    /* renamed from: c */
    public final /* synthetic */ Object f35435c;

    /* renamed from: d */
    public final /* synthetic */ boolean f35436d;

    /* renamed from: e */
    public final /* synthetic */ Object f35437e;

    /* renamed from: f */
    public final /* synthetic */ Object f35438f;

    public f2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, String str, String str2, boolean z6) {
        this.f35437e = n0Var;
        this.f35434b = str;
        this.f35435c = str2;
        this.f35436d = z6;
        this.f35438f = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.f2.run():void");
    }

    public f2(m2 m2Var, boolean z6, Uri uri, String str, String str2) {
        this.f35436d = z6;
        this.f35437e = uri;
        this.f35434b = str;
        this.f35435c = str2;
        this.f35438f = m2Var;
    }

    public f2(q2 q2Var, AtomicReference atomicReference, String str, String str2, boolean z6) {
        this.f35437e = atomicReference;
        this.f35434b = str;
        this.f35435c = str2;
        this.f35436d = z6;
        Objects.requireNonNull(q2Var);
        this.f35438f = q2Var;
    }

    public f2(k3 k3Var, n4 n4Var, boolean z6, C7448s c7448s, Bundle bundle) {
        this.f35437e = n4Var;
        this.f35436d = z6;
        this.f35434b = c7448s;
        this.f35435c = bundle;
        Objects.requireNonNull(k3Var);
        this.f35438f = k3Var;
    }
}
