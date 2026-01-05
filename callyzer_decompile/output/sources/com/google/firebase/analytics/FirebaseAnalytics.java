package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.z0;
import com.google.firebase.installations.C1401a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ji.C3773g;
import mi.C4752a;
import pg.l8;
import rj.InterfaceC6558d;
import sf.AbstractC6840z;
import ug.r2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f7132b;

    /* renamed from: a */
    public final l1 f7133a;

    public FirebaseAnalytics(l1 l1Var) {
        AbstractC6840z.m13036g(l1Var);
        this.f7133a = l1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f7132b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f7132b == null) {
                        f7132b = new FirebaseAnalytics(l1.m3479e(context, null));
                    }
                } finally {
                }
            }
        }
        return f7132b;
    }

    @Keep
    public static r2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        l1 l1VarM3479e = l1.m3479e(context, bundle);
        if (l1VarM3479e == null) {
            return null;
        }
        return new C4752a(l1VarM3479e);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C1401a.f7144m;
            return (String) l8.m11761b(((C1401a) C3773g.m8291c().m8294b(InterfaceC6558d.class)).m4471c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        w0 w0VarM3730b = w0.m3730b(activity);
        l1 l1Var = this.f7133a;
        l1Var.getClass();
        l1Var.m3482c(new z0(l1Var, w0VarM3730b, str, str2));
    }
}
