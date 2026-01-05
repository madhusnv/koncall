package pg;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import ay.C0496f;
import ay.ExecutorC0495e;
import b00.AbstractC0532q;
import b00.C0539x;
import b00.a0;
import bx.AbstractC0801k;
import c9.C0908c;
import ee.C2035c;
import ee.C2039g;
import ex.InterfaceC2137a;
import ge.C2571c;
import java.io.File;
import ke.AbstractC4066g;
import ke.C4069j;
import ke.C4070k;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.w9;
import qw.C6366p;
import rw.C6668r;
import tx.m0;
import ug.C7439j;
import wd.C7994b;
import wd.C7998f;
import yk.C8687a;
import zd.C8943g;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t6 {
    /* renamed from: a */
    public static final C7998f m11868a(Context context) {
        final C7439j c7439j = new C7439j(context);
        Context context2 = (Context) c7439j.f35537b;
        C2571c c2571c = (C2571c) c7439j.f35538c;
        final int i10 = 0;
        C6366p c6366pM10782c = nd.m10782c(new InterfaceC2137a() { // from class: wd.d
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int largeMemoryClass;
                C8943g c8943g;
                switch (i10) {
                    case 0:
                        Context context3 = (Context) c7439j.f35537b;
                        Bitmap.Config[] configArr = AbstractC4066g.f20920a;
                        double d2 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC4154l.m8920c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d2 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        C2039g c2039g = new C2039g((byte) 0, 0);
                        if (d2 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC4066g.f20920a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC4154l.m8920c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d10 = d2 * largeMemoryClass;
                            double d11 = 1024;
                            i11 = (int) (d10 * d11 * d11);
                        }
                        return new C2035c(i11 > 0 ? new C0908c(i11, c2039g) : new C8989c(9, c2039g), c2039g);
                    default:
                        C7439j c7439j2 = c7439j;
                        C4070k c4070k = C4070k.f20933a;
                        Context context4 = (Context) c7439j2.f35537b;
                        synchronized (c4070k) {
                            try {
                                c8943g = C4070k.f20934b;
                                if (c8943g == null) {
                                    C0539x c0539x = AbstractC0532q.f3663a;
                                    C0496f c0496f = m0.f34659a;
                                    ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
                                    Bitmap.Config[] configArr3 = AbstractC4066g.f20920a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM2130e = AbstractC0801k.m2130e(cacheDir);
                                    String str = a0.f3585b;
                                    a0 a0VarM16038o = C8687a.m16038o(fileM2130e);
                                    long jM11913d = 10485760;
                                    try {
                                        File file = a0VarM16038o.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM11913d = w9.m11913d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C8943g c8943g2 = new C8943g(jM11913d, c0539x, a0VarM16038o, executorC0495e);
                                    C4070k.f20934b = c8943g2;
                                    c8943g = c8943g2;
                                }
                            } finally {
                            }
                        }
                        return c8943g;
                }
            }
        });
        final int i11 = 1;
        C6366p c6366pM10782c2 = nd.m10782c(new InterfaceC2137a() { // from class: wd.d
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                int largeMemoryClass;
                C8943g c8943g;
                switch (i11) {
                    case 0:
                        Context context3 = (Context) c7439j.f35537b;
                        Bitmap.Config[] configArr = AbstractC4066g.f20920a;
                        double d2 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC4154l.m8920c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d2 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i112 = 0;
                        C2039g c2039g = new C2039g((byte) 0, 0);
                        if (d2 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC4066g.f20920a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC4154l.m8920c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d10 = d2 * largeMemoryClass;
                            double d11 = 1024;
                            i112 = (int) (d10 * d11 * d11);
                        }
                        return new C2035c(i112 > 0 ? new C0908c(i112, c2039g) : new C8989c(9, c2039g), c2039g);
                    default:
                        C7439j c7439j2 = c7439j;
                        C4070k c4070k = C4070k.f20933a;
                        Context context4 = (Context) c7439j2.f35537b;
                        synchronized (c4070k) {
                            try {
                                c8943g = C4070k.f20934b;
                                if (c8943g == null) {
                                    C0539x c0539x = AbstractC0532q.f3663a;
                                    C0496f c0496f = m0.f34659a;
                                    ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
                                    Bitmap.Config[] configArr3 = AbstractC4066g.f20920a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM2130e = AbstractC0801k.m2130e(cacheDir);
                                    String str = a0.f3585b;
                                    a0 a0VarM16038o = C8687a.m16038o(fileM2130e);
                                    long jM11913d = 10485760;
                                    try {
                                        File file = a0VarM16038o.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM11913d = w9.m11913d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C8943g c8943g2 = new C8943g(jM11913d, c0539x, a0VarM16038o, executorC0495e);
                                    C4070k.f20934b = c8943g2;
                                    c8943g = c8943g2;
                                }
                            } finally {
                            }
                        }
                        return c8943g;
                }
            }
        });
        C6366p c6366pM10782c3 = nd.m10782c(new sq.n2(12));
        C6668r c6668r = C6668r.f31943a;
        return new C7998f(context2, c2571c, c6366pM10782c, c6366pM10782c2, c6366pM10782c3, new C7994b(c6668r, c6668r, c6668r, c6668r, c6668r), (C4069j) c7439j.f35539d);
    }
}
