package mf;

import android.content.Context;
import dg.C1716e;
import pf.C5905e;
import qf.AbstractC6206e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mf.a */
/* loaded from: classes.dex */
public final class C4718a extends AbstractC6206e {

    /* renamed from: k */
    public static int f23611k = 1;

    /* renamed from: c */
    public final synchronized int m9585c() {
        int i10;
        try {
            i10 = f23611k;
            if (i10 == 1) {
                Context context = this.f30187a;
                C5905e c5905e = C5905e.f28746d;
                int iM11516c = c5905e.m11516c(context, 12451000);
                if (iM11516c == 0) {
                    i10 = 4;
                    f23611k = 4;
                } else if (c5905e.m11515b(iM11516c, context, null) != null || C1716e.m5403a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f23611k = 2;
                } else {
                    i10 = 3;
                    f23611k = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
