package com.google.firebase.concurrent;

import ak.C0169h;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import mk.C4764c;
import og.fd;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import pi.InterfaceC5968c;
import pi.InterfaceC5969d;
import qi.C6218a;
import qi.C6219b;
import qi.C6230m;
import qi.C6234q;
import ri.ScheduledExecutorServiceC6548f;
import ri.ThreadFactoryC6543a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C6230m f7134a = new C6230m(new C0169h(3));

    /* renamed from: b */
    public static final C6230m f7135b = new C6230m(new C0169h(4));

    /* renamed from: c */
    public static final C6230m f7136c = new C6230m(new C0169h(5));

    /* renamed from: d */
    public static final C6230m f7137d = new C6230m(new C0169h(6));

    /* renamed from: a */
    public static ScheduledExecutorServiceC6548f m4463a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new ScheduledExecutorServiceC6548f(Executors.newFixedThreadPool(4, new ThreadFactoryC6543a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f7137d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6234q c6234q = new C6234q(InterfaceC5966a.class, ScheduledExecutorService.class);
        C6234q[] c6234qArr = {new C6234q(InterfaceC5966a.class, ExecutorService.class), new C6234q(InterfaceC5966a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c6234q);
        for (C6234q c6234q2 : c6234qArr) {
            fd.m10650a(c6234q2, "Null interface");
        }
        Collections.addAll(hashSet, c6234qArr);
        C6219b c6219b = new C6219b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C4764c(4), hashSet3);
        C6234q c6234q3 = new C6234q(InterfaceC5967b.class, ScheduledExecutorService.class);
        C6234q[] c6234qArr2 = {new C6234q(InterfaceC5967b.class, ExecutorService.class), new C6234q(InterfaceC5967b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c6234q3);
        for (C6234q c6234q4 : c6234qArr2) {
            fd.m10650a(c6234q4, "Null interface");
        }
        Collections.addAll(hashSet4, c6234qArr2);
        C6219b c6219b2 = new C6219b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C4764c(5), hashSet6);
        C6234q c6234q5 = new C6234q(InterfaceC5968c.class, ScheduledExecutorService.class);
        C6234q[] c6234qArr3 = {new C6234q(InterfaceC5968c.class, ExecutorService.class), new C6234q(InterfaceC5968c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c6234q5);
        for (C6234q c6234q6 : c6234qArr3) {
            fd.m10650a(c6234q6, "Null interface");
        }
        Collections.addAll(hashSet7, c6234qArr3);
        C6219b c6219b3 = new C6219b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C4764c(6), hashSet9);
        C6218a c6218aM12232b = C6219b.m12232b(new C6234q(InterfaceC5969d.class, Executor.class));
        c6218aM12232b.f30212g = new C4764c(7);
        return Arrays.asList(c6219b, c6219b2, c6219b3, c6218aM12232b.m12228b());
    }
}
