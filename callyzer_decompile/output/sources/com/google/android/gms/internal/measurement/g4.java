package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: i */
    public static final ConcurrentHashMap f6203i = new ConcurrentHashMap();

    /* renamed from: j */
    public static final String[] f6204j = {TransferTable.COLUMN_KEY, "value"};

    /* renamed from: a */
    public final ContentResolver f6205a;

    /* renamed from: b */
    public final Uri f6206b;

    /* renamed from: c */
    public final Runnable f6207c;

    /* renamed from: g */
    public volatile Map f6211g;

    /* renamed from: d */
    public c4 f6208d = null;

    /* renamed from: e */
    public volatile boolean f6209e = true;

    /* renamed from: f */
    public final Object f6210f = new Object();

    /* renamed from: h */
    public final ArrayList f6212h = new ArrayList();

    public g4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f6205a = contentResolver;
        this.f6206b = uri;
        this.f6207c = runnable;
    }

    /* renamed from: a */
    public static g4 m3291a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        g4 g4Var = (g4) f6203i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.f4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new g4(contentResolver, uri, runnable);
            }
        });
        try {
            if (!g4Var.f6209e) {
                return g4Var;
            }
            synchronized (g4Var) {
                try {
                    if (g4Var.f6209e) {
                        c4 c4Var = new c4(g4Var);
                        g4Var.f6205a.registerContentObserver(g4Var.f6206b, false, c4Var);
                        g4Var.f6208d = c4Var;
                        g4Var.f6209e = false;
                    }
                } finally {
                }
            }
            return g4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m3292c() {
        Iterator it = f6203i.values().iterator();
        while (it.hasNext()) {
            g4 g4Var = (g4) it.next();
            synchronized (g4Var) {
                try {
                    if (g4Var.f6209e) {
                        g4Var.f6209e = false;
                    } else {
                        c4 c4Var = g4Var.f6208d;
                        if (c4Var != null) {
                            g4Var.f6205a.unregisterContentObserver(c4Var);
                            g4Var.f6208d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* renamed from: b */
    public final Map m3293b() {
        Map map;
        Map map2;
        Object objM3727c;
        Map map3 = this.f6211g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f6210f) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = this.f6211g;
                map2 = threadPolicyAllowThreadDiskReads;
                if (threadPolicyAllowThreadDiskReads == 0) {
                    try {
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            v5 v5Var = new v5(this);
                            try {
                                objM3727c = v5Var.m3727c();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objM3727c = v5Var.m3727c();
                                } finally {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                }
                            }
                            map = (Map) objM3727c;
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            map = Collections.EMPTY_MAP;
                        }
                        this.f6211g = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        return map4 != null ? map4 : Collections.EMPTY_MAP;
    }
}
