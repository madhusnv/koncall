package ty;

import g4.n0;
import og.yf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.n */
/* loaded from: classes3.dex */
public abstract class AbstractC7280n {
    /* renamed from: a */
    public static final long m13603a(long j6, long j10) {
        int iM6456c;
        int iM6458e = n0.m6458e(j6);
        int iM6457d = n0.m6457d(j6);
        if ((n0.m6458e(j10) < n0.m6457d(j6)) && (n0.m6458e(j6) < n0.m6457d(j10))) {
            if ((n0.m6458e(j10) <= n0.m6458e(j6)) && (n0.m6457d(j6) <= n0.m6457d(j10))) {
                iM6458e = n0.m6458e(j10);
                iM6457d = iM6458e;
            } else {
                if ((n0.m6458e(j6) <= n0.m6458e(j10)) && (n0.m6457d(j10) <= n0.m6457d(j6))) {
                    iM6456c = n0.m6456c(j10);
                } else {
                    int iM6458e2 = n0.m6458e(j10);
                    if (iM6458e >= n0.m6457d(j10) || iM6458e2 > iM6458e) {
                        iM6457d = n0.m6458e(j10);
                    } else {
                        iM6458e = n0.m6458e(j10);
                        iM6456c = n0.m6456c(j10);
                    }
                }
                iM6457d -= iM6456c;
            }
        } else if (iM6457d > n0.m6458e(j10)) {
            iM6458e -= n0.m6456c(j10);
            iM6456c = n0.m6456c(j10);
            iM6457d -= iM6456c;
        }
        return yf.m11072a(iM6458e, iM6457d);
    }
}
