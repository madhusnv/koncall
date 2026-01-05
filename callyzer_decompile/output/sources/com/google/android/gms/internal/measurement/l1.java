package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.C4001v;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: g */
    public static volatile l1 f6275g;

    /* renamed from: a */
    public final ExecutorService f6276a;

    /* renamed from: b */
    public final C4001v f6277b;

    /* renamed from: c */
    public final ArrayList f6278c;

    /* renamed from: d */
    public int f6279d;

    /* renamed from: e */
    public boolean f6280e;

    /* renamed from: f */
    public volatile l0 f6281f;

    public l1(Context context, Bundle bundle) throws ClassNotFoundException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6276a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6277b = new C4001v(27, this);
        this.f6278c = new ArrayList();
        try {
            if (ug.z1.m14264b(context, ug.z1.m14263a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, l1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f6280e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m3482c(new a1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new k1(this));
    }

    /* renamed from: e */
    public static l1 m3479e(Context context, Bundle bundle) {
        AbstractC6840z.m13036g(context);
        if (f6275g == null) {
            synchronized (l1.class) {
                try {
                    if (f6275g == null) {
                        f6275g = new l1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f6275g;
    }

    /* renamed from: a */
    public final Map m3480a(String str, String str2, boolean z6) {
        i0 i0Var = new i0();
        m3482c(new f1(this, str, str2, z6, i0Var));
        Bundle bundleM3312f = i0Var.m3312f(5000L);
        if (bundleM3312f == null || bundleM3312f.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM3312f.size());
        for (String str3 : bundleM3312f.keySet()) {
            Object obj = bundleM3312f.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* renamed from: b */
    public final int m3481b(String str) {
        i0 i0Var = new i0();
        m3482c(new a1(this, str, i0Var));
        Integer num = (Integer) i0.m3310g(i0Var.m3312f(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final void m3482c(h1 h1Var) {
        this.f6276a.execute(h1Var);
    }

    /* renamed from: d */
    public final void m3483d(Exception exc, boolean z6, boolean z10) {
        this.f6280e |= z6;
        if (!z6 && z10) {
            m3482c(new x0(this, exc));
        }
    }

    /* renamed from: f */
    public final List m3484f(String str, String str2) {
        i0 i0Var = new i0();
        m3482c(new z0(this, str, str2, i0Var));
        List list = (List) i0.m3310g(i0Var.m3312f(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
