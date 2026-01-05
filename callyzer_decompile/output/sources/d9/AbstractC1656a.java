package d9;

import android.app.Application;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.a */
/* loaded from: classes.dex */
public abstract class AbstractC1656a {
    /* renamed from: a */
    public static C1664i m5367a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : iArr) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException unused) {
                C7077w c7077wM13371a = C7077w.m13371a();
                int i11 = C1664i.f8186b;
                int i12 = C1664i.f8186b;
                c7077wM13371a.getClass();
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = AbstractC1665j.f8188a[i13];
            if (!AbstractC6662l.m12712b(iArr, i14)) {
                try {
                    builder.removeCapability(i14);
                } catch (IllegalArgumentException unused2) {
                    C7077w c7077wM13371a2 = C7077w.m13371a();
                    int i15 = C1664i.f8186b;
                    int i16 = C1664i.f8186b;
                    c7077wM13371a2.getClass();
                }
            }
        }
        for (int i17 : iArr2) {
            builder.addTransportType(i17);
        }
        NetworkRequest networkRequestBuild = builder.build();
        AbstractC4154l.m8922e(networkRequestBuild, "networkRequest.build()");
        return new C1664i(networkRequestBuild);
    }

    /* renamed from: b */
    public static String m5368b() {
        String processName = Application.getProcessName();
        AbstractC4154l.m8922e(processName, "getProcessName()");
        return processName;
    }

    /* renamed from: c */
    public static boolean m5369c(NetworkRequest request, int i10) {
        AbstractC4154l.m8923f(request, "request");
        return request.hasCapability(i10);
    }

    /* renamed from: d */
    public static boolean m5370d(NetworkRequest request, int i10) {
        AbstractC4154l.m8923f(request, "request");
        return request.hasTransport(i10);
    }
}
