package ug;

import a1.RunnableC0012k;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import c0.C0829v;
import c0.EnumC0828u;
import c9.C0910e;
import c9.C0917l;
import com.google.firebase.messaging.FirebaseMessagingService;
import ej.C2060e;
import fn.C2336i;
import hn.C2985b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import k2.InterfaceC3954c;
import ke.AbstractC4064e;
import ke.C4069j;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4310j;
import l0.InterfaceC4303c;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.C7612v;
import p020v.RunnableC7606p;
import p020v.RunnableC7609s;
import p023y.AbstractC8523a;
import pg.i7;
import pg.l8;
import pg.m7;
import pg.o7;
import q5.C6115h;
import q5.C6118k;
import qf.C6205d;
import qi.RunnableC6224g;
import r5.AbstractC6468c;
import sf.AbstractC6840z;
import sf.C6825k;
import sf.C6828n;
import sf.C6829o;
import tz.AbstractC7285d;
import ue.EnumC7422d;
import uf.C7427b;
import uf.C7428c;
import ui.InterfaceC7470a;
import ui.InterfaceC7471b;
import v0.C7622f;
import w3.C7904v;
import we.C8011m;
import wj.AbstractC8079e;
import wj.C8083i;
import wj.C8086l;
import xe.C8357i;
import yg.C8650g;
import yg.C8656m;
import yv.C8805t;
import yx.C8810d;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.j */
/* loaded from: classes.dex */
public final class C7439j implements s2, w0, InterfaceC7471b, InterfaceC7470a, InterfaceC3954c, InterfaceC4303c {

    /* renamed from: e */
    public static C7439j f35535e;

    /* renamed from: a */
    public final /* synthetic */ int f35536a;

    /* renamed from: b */
    public Object f35537b;

    /* renamed from: c */
    public Object f35538c;

    /* renamed from: d */
    public Object f35539d;

    public /* synthetic */ C7439j(int i10) {
        this.f35536a = i10;
    }

    /* renamed from: A */
    public void m13995A() {
        v3.p1 p1Var = ((v3.g0) this.f35537b).f36855p;
        if (p1Var != null) {
            ((C7904v) p1Var).m15041x();
        }
    }

    /* renamed from: B */
    public void m13996B() {
        try {
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            AbstractC7285d abstractC7285d2 = AbstractC7285d.f34750a;
            throw new IOException("Platform applicationContext not initialized");
        } catch (Throwable th2) {
            ((CountDownLatch) this.f35539d).countDown();
            throw th2;
        }
    }

    /* renamed from: C */
    public void m13997C(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f35538c = str;
    }

    /* renamed from: D */
    public void m13998D(im.o1 o1Var) {
        Object value;
        wx.m1 m1Var = (wx.m1) this.f35538c;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, o1Var));
    }

    /* renamed from: E */
    public void m13999E(View view) {
        if (((ArrayList) this.f35539d).remove(view)) {
            C7427b c7427b = (C7427b) this.f35537b;
            y7.t0 t0VarM1313H = RecyclerView.m1313H(view);
            if (t0VarM1313H != null) {
                RecyclerView recyclerView = (RecyclerView) c7427b.f35231b;
                int i10 = t0VarM1313H.f41807p;
                if (recyclerView.m1327K()) {
                    t0VarM1313H.f41808q = i10;
                    recyclerView.f43713v1.add(t0VarM1313H);
                } else {
                    View view2 = t0VarM1313H.f41792a;
                    Field field = c6.v0.f5527a;
                    view2.setImportantForAccessibility(i10);
                }
                t0VarM1313H.f41807p = 0;
            }
        }
    }

    /* renamed from: F */
    public synchronized void m14000F(int i10, int i11, long j6, long j10) {
        ((n1) this.f35537b).f35674l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f35539d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((C7428c) this.f35538c).m13822c(new C6828n(Arrays.asList(new C6825k(36301, i10, 0, j6, j10, null, null, 0, i11)), 0)).m15978e(new k1.j2(3, jElapsedRealtime, this));
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        Object obj;
        C2060e c2060e = (C2060e) this.f35537b;
        RunnableC7606p runnableC7606p = new RunnableC7606p(12, c2060e);
        if (o7.m11808c()) {
            runnableC7606p.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            og.y0.m11056f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new RunnableC0012k(25, runnableC7606p, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e2) {
                throw new InterruptedRuntimeException(e2);
            }
        }
        C0829v c0829v = (C0829v) c2060e.f9655f;
        if (c0829v != null) {
            synchronized (c0829v.f5228b) {
                try {
                    c0829v.f5231e.removeCallbacksAndMessages("retry_token");
                    int iOrdinal = c0829v.f5241o.ordinal();
                    if (iOrdinal == 0) {
                        c0829v.f5241o = EnumC0828u.SHUTDOWN;
                        obj = C4310j.f21736c;
                    } else {
                        if (iOrdinal == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iOrdinal == 2 || iOrdinal == 3) {
                            c0829v.f5241o = EnumC0828u.SHUTDOWN;
                            C0829v.m2230a(c0829v.f5243q);
                            c0829v.f5242p = i7.m11697b(new a1.c0(2, c0829v));
                        }
                        obj = c0829v.f5242p;
                    }
                } finally {
                }
            }
        } else {
            obj = C4310j.f21736c;
        }
        AbstractC4154l.m8920c(obj);
        synchronized (c2060e.f9651b) {
            c2060e.f9652c = null;
            c2060e.f9653d = obj;
            ((HashMap) c2060e.f9657h).clear();
            ((HashSet) c2060e.f9658i).clear();
        }
        c2060e.f9655f = null;
        c2060e.f9656g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.String] */
    @Override // ug.s2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo13878a(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7439j.mo13878a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: b */
    public void m14001b(View view, int i10, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C7427b) this.f35537b).f35231b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m14010u(i10);
        ((k1.j2) this.f35538c).m8459f(childCount, z6);
        if (z6) {
            m14015z(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1313H(view);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: c */
    public void mo2735c(int i10, Object obj) {
        ((v3.g0) this.f35539d).m14572B(i10, (v3.g0) obj);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: d */
    public void mo2736d(Object obj) {
        ((ArrayList) this.f35538c).add(this.f35539d);
        this.f35539d = obj;
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: e */
    public void mo8528e() {
        ((v3.g0) this.f35539d).mo8540j();
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: f */
    public void mo2737f(int i10, int i11, int i12) {
        ((v3.g0) this.f35539d).m14582L(i10, i11, i12);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        C2060e c2060e = (C2060e) this.f35537b;
        c2060e.f9655f = (C0829v) this.f35538c;
        c2060e.f9656g = m7.m11788a((Context) this.f35539d);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: h */
    public void mo2739h(int i10, int i11) {
        ((v3.g0) this.f35539d).m14587R(i10, i11);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: i */
    public void mo2740i() {
        this.f35539d = ((ArrayList) this.f35538c).remove(r0.size() - 1);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo2741j(int i10, Object obj) {
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: k */
    public Object mo2742k() {
        return this.f35539d;
    }

    @Override // ui.InterfaceC7470a
    /* renamed from: l */
    public void mo9084l(Bundle bundle) {
        synchronized (this.f35538c) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f35539d = new CountDownLatch(1);
            ((l4.d0) this.f35537b).mo9084l(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.f35539d).await(500, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
            }
            this.f35539d = null;
        }
    }

    /* renamed from: m */
    public void m14002m(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C7427b) this.f35537b).f35231b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m14010u(i10);
        ((k1.j2) this.f35538c).m8459f(childCount, z6);
        if (z6) {
            m14015z(view);
        }
        y7.t0 t0VarM1313H = RecyclerView.m1313H(view);
        if (t0VarM1313H != null) {
            if (!t0VarM1313H.m15925j() && !t0VarM1313H.m15930o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + t0VarM1313H + recyclerView.m1361x());
            }
            t0VarM1313H.f41801j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: n */
    public C8357i m14003n() {
        String strConcat = ((String) this.f35538c) == null ? " backendName" : "";
        if (((EnumC7422d) this.f35539d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C8357i((String) this.f35538c, (byte[]) this.f35537b, (EnumC7422d) this.f35539d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* renamed from: o */
    public boolean m14004o() {
        Context context = (Context) this.f35539d;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return ((TelephonyManager) this.f35537b).getCallState() == 0;
            }
            if (AbstractC6468c.m12450a(context, "android.permission.READ_PHONE_STATE") != 0) {
                return false;
            }
            Object systemService = context.getSystemService("telecom");
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            return telecomManager == null || !telecomManager.isInCall();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // ui.InterfaceC7471b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f35539d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14005p(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.h0
            if (r0 == 0) goto L13
            r0 = r6
            xm.h0 r0 = (xm.h0) r0
            int r1 = r0.f40363c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40363c = r1
            goto L18
        L13:
            xm.h0 r0 = new xm.h0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40361a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40363c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f35538c
            hn.b r6 = (hn.C2985b) r6
            r0.f40363c = r3
            ym.i r6 = r6.f16123a
            java.lang.Object r6 = r6.m16096b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            im.f1 r6 = (im.f1) r6
            boolean r5 = r6 instanceof im.d1
            if (r5 == 0) goto L54
            im.d1 r6 = (im.d1) r6
            java.lang.Object r5 = r6.f17545a
            com.websoptimization.callyzerbiz.data.model.response.BaseResponse r5 = (com.websoptimization.callyzerbiz.data.model.response.BaseResponse) r5
            java.lang.Object r5 = r5.m4732a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L54:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7439j.m14005p(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public void m14006q() {
        ((ArrayList) this.f35538c).clear();
        this.f35539d = this.f35537b;
        ((v3.g0) this.f35537b).m14586Q();
    }

    /* renamed from: r */
    public void m14007r(int i10) {
        y7.t0 t0VarM1313H;
        int iM14010u = m14010u(i10);
        ((k1.j2) this.f35538c).m8462i(iM14010u);
        RecyclerView recyclerView = (RecyclerView) ((C7427b) this.f35537b).f35231b;
        View childAt = recyclerView.getChildAt(iM14010u);
        if (childAt != null && (t0VarM1313H = RecyclerView.m1313H(childAt)) != null) {
            if (t0VarM1313H.m15925j() && !t0VarM1313H.m15930o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + t0VarM1313H + recyclerView.m1361x());
            }
            t0VarM1313H.m15916a(256);
        }
        recyclerView.detachViewFromParent(iM14010u);
    }

    /* renamed from: s */
    public View m14008s(int i10) {
        return ((RecyclerView) ((C7427b) this.f35537b).f35231b).getChildAt(m14010u(i10));
    }

    /* renamed from: t */
    public int m14009t() {
        return ((RecyclerView) ((C7427b) this.f35537b).f35231b).getChildCount() - ((ArrayList) this.f35539d).size();
    }

    public String toString() {
        switch (this.f35536a) {
            case 16:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f35538c);
                sb2.append('{');
                C8849i c8849i = (C8849i) ((C8849i) this.f35537b).f42583b;
                String str = "";
                while (c8849i != null) {
                    Object obj = c8849i.f42584c;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c8849i = (C8849i) c8849i.f42583b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 19:
                return ((k1.j2) this.f35538c).toString() + ", hidden list:" + ((ArrayList) this.f35539d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public int m14010u(int i10) {
        k1.j2 j2Var = (k1.j2) this.f35538c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C7427b) this.f35537b).f35231b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iM8456c = i10 - (i11 - j2Var.m8456c(i11));
            if (iM8456c == 0) {
                while (j2Var.m8458e(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iM8456c;
        }
        return -1;
    }

    /* renamed from: v */
    public Size[] m14011v(int i10) {
        ArrayList arrayList;
        List arrayList2;
        HashMap map = (HashMap) this.f35539d;
        Size[] outputSizes = null;
        if (map.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) map.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i10))).clone();
        }
        try {
            outputSizes = ((StreamConfigurationMap) ((C7622f) this.f35537b).f36778a).getOutputSizes(i10);
        } catch (Throwable unused) {
            og.u1.m10952k("StreamConfigurationMapCompat");
        }
        if (outputSizes == null || outputSizes.length == 0) {
            og.u1.m10951j("StreamConfigurationMapCompat");
            return outputSizes;
        }
        C0910e c0910e = (C0910e) this.f35538c;
        c0910e.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) c0910e.f5579b) != null) {
            Size[] sizeArr = (i10 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr));
            }
        }
        eb.g2 g2Var = (eb.g2) c0910e.f5580c;
        g2Var.getClass();
        if (((ExcludedSupportedSizesQuirk) AbstractC8523a.f41447a.m5729g(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList2 = new ArrayList();
        } else {
            String str = g2Var.f9320a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i10 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i10 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && (i10 == 34 || i10 == 35)) {
                    arrayList.add(new Size(720, 720));
                    arrayList.add(new Size(400, 400));
                }
            } else if (ExcludedSupportedSizesQuirk.m598d()) {
                arrayList = new ArrayList();
                if (str.equals("0")) {
                    if (i10 == 34) {
                        arrayList.add(new Size(4128, 3096));
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                        arrayList.add(new Size(1920, 1080));
                    } else if (i10 == 35) {
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3264, 1836));
                    arrayList.add(new Size(2448, 2448));
                    arrayList.add(new Size(1920, 1920));
                    arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                    arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else if (ExcludedSupportedSizesQuirk.m597c()) {
                arrayList = new ArrayList();
                if (str.equals("0")) {
                    if (i10 == 34) {
                        arrayList.add(new Size(4128, 3096));
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                        arrayList.add(new Size(1920, 1080));
                    } else if (i10 == 35) {
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                        arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                    arrayList.add(new Size(2576, 1932));
                    arrayList.add(new Size(2560, 1440));
                    arrayList.add(new Size(1920, 1920));
                    arrayList.add(new Size(NewHope.SENDB_BYTES, 1536));
                    arrayList.add(new Size(NewHope.SENDB_BYTES, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i10 == 256) {
                    arrayList.add(new Size(9280, 6944));
                }
            } else if (ExcludedSupportedSizesQuirk.m596b()) {
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = arrayList4;
                if (i10 == 35) {
                    arrayList4.add(new Size(3840, 2160));
                    arrayList4.add(new Size(3264, 2448));
                    arrayList4.add(new Size(3200, 2400));
                    arrayList4.add(new Size(2688, 1512));
                    arrayList4.add(new Size(2592, 1944));
                    arrayList4.add(new Size(2592, 1940));
                    arrayList4.add(new Size(1920, 1440));
                    arrayList2 = arrayList4;
                }
            } else {
                og.u1.m10951j("ExcludedSupportedSizesQuirk");
                arrayList2 = Collections.EMPTY_LIST;
            }
            arrayList2 = arrayList;
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.removeAll(arrayList2);
        }
        if (arrayList3.isEmpty()) {
            og.u1.m10951j("OutputSizesCorrector");
        }
        Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
        map.put(Integer.valueOf(i10), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    /* renamed from: w */
    public View m14012w(int i10) {
        return ((RecyclerView) ((C7427b) this.f35537b).f35231b).getChildAt(i10);
    }

    /* renamed from: x */
    public int m14013x() {
        return ((RecyclerView) ((C7427b) this.f35537b).f35231b).getChildCount();
    }

    /* renamed from: y */
    public boolean m14014y() {
        C8086l c8086l;
        IconCompat iconCompat;
        if (((C7622f) this.f35539d).m14510a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f35538c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String strM14517u = ((C7622f) this.f35539d).m14517u("gcm.n.image");
        if (TextUtils.isEmpty(strM14517u)) {
            c8086l = null;
        } else {
            try {
                c8086l = new C8086l(new URL(strM14517u));
            } catch (MalformedURLException unused) {
            }
        }
        if (c8086l != null) {
            ExecutorService executorService = (ExecutorService) this.f35537b;
            C8650g c8650g = new C8650g();
            c8086l.f38714b = executorService.submit(new RunnableC6224g(21, c8086l, c8650g));
            c8086l.f38715c = c8650g.f41930a;
        }
        C8083i c8083iM15217a = AbstractC8079e.m15217a((FirebaseMessagingService) this.f35538c, (C7622f) this.f35539d);
        C6118k c6118k = (C6118k) c8083iM15217a.f38707a;
        if (c8086l != null) {
            try {
                C8656m c8656m = c8086l.f38715c;
                AbstractC6840z.m13036g(c8656m);
                Bitmap bitmap = (Bitmap) l8.m11761b(c8656m, 5L, TimeUnit.SECONDS);
                c6118k.m12153d(bitmap);
                C6115h c6115h = new C6115h();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f2203b = bitmap;
                }
                c6115h.f29826e = iconCompat;
                c6115h.f29827f = null;
                c6115h.f29828g = true;
                c6118k.m12154e(c6115h);
            } catch (InterruptedException unused2) {
                c8086l.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Objects.toString(e2.getCause());
            } catch (TimeoutException unused3) {
                c8086l.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) ((FirebaseMessagingService) this.f35538c).getSystemService("notification")).notify((String) c8083iM15217a.f38708b, 0, ((C6118k) c8083iM15217a.f38707a).m12151a());
        return true;
    }

    /* renamed from: z */
    public void m14015z(View view) {
        ((ArrayList) this.f35539d).add(view);
        C7427b c7427b = (C7427b) this.f35537b;
        y7.t0 t0VarM1313H = RecyclerView.m1313H(view);
        if (t0VarM1313H != null) {
            View view2 = t0VarM1313H.f41792a;
            RecyclerView recyclerView = (RecyclerView) c7427b.f35231b;
            int i10 = t0VarM1313H.f41808q;
            if (i10 != -1) {
                t0VarM1313H.f41807p = i10;
            } else {
                Field field = c6.v0.f5527a;
                t0VarM1313H.f41807p = view2.getImportantForAccessibility();
            }
            if (recyclerView.m1327K()) {
                t0VarM1313H.f41808q = 4;
                recyclerView.f43713v1.add(t0VarM1313H);
            } else {
                Field field2 = c6.v0.f5527a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public /* synthetic */ C7439j(int i10, Object obj, Object obj2, Object obj3) {
        this.f35536a = i10;
        this.f35537b = obj;
        this.f35538c = obj2;
        this.f35539d = obj3;
    }

    public /* synthetic */ C7439j(h4 h4Var, String str, Object obj, int i10) {
        this.f35536a = i10;
        this.f35538c = str;
        this.f35537b = obj;
        this.f35539d = h4Var;
    }

    public C7439j(Context context, n1 n1Var) {
        this.f35536a = 1;
        this.f35539d = new AtomicLong(-1L);
        this.f35538c = new C7428c(context, null, C7428c.f35232k, new C6829o("measurement:api"), C6205d.f30184c);
        this.f35537b = n1Var;
    }

    public C7439j(C2336i dataStoreSource) {
        this.f35536a = 18;
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        this.f35537b = dataStoreSource;
        wx.m1 m1VarM15372c = wx.c1.m15372c(im.m1.f17567a);
        this.f35538c = m1VarM15372c;
        this.f35539d = new wx.w0(m1VarM15372c);
    }

    public C7439j(xm.o4 remoteConfigRepository, C8805t c8805t, C8810d c8810d) {
        this.f35536a = 9;
        AbstractC4154l.m8923f(remoteConfigRepository, "remoteConfigRepository");
        this.f35537b = remoteConfigRepository;
        this.f35538c = c8805t;
        this.f35539d = c8810d;
    }

    public C7439j(TelephonyManager telephonyManager, C2985b noAuthRemoteSource, Context context) {
        this.f35536a = 17;
        AbstractC4154l.m8923f(noAuthRemoteSource, "noAuthRemoteSource");
        this.f35537b = telephonyManager;
        this.f35538c = noAuthRemoteSource;
        this.f35539d = context;
    }

    public C7439j() {
        this.f35536a = 14;
        this.f35536a = 14;
        this.f35537b = new AtomicBoolean(false);
        this.f35539d = new CountDownLatch(1);
        this.f35538c = "PublicSuffixDatabase.list";
    }

    public C7439j(l4.d0 d0Var) {
        this.f35536a = 5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f35538c = new Object();
        this.f35537b = d0Var;
    }

    public C7439j(C7427b c7427b) {
        this.f35536a = 19;
        this.f35537b = c7427b;
        this.f35538c = new k1.j2();
        this.f35539d = new ArrayList();
    }

    public C7439j(StreamConfigurationMap streamConfigurationMap, C0910e c0910e) {
        this.f35536a = 10;
        this.f35539d = new HashMap();
        new HashMap();
        new HashMap();
        this.f35537b = new C7622f(streamConfigurationMap);
        this.f35538c = c0910e;
    }

    public C7439j(FirebaseMessagingService firebaseMessagingService, C7622f c7622f, ExecutorService executorService) {
        this.f35536a = 12;
        this.f35537b = executorService;
        this.f35538c = firebaseMessagingService;
        this.f35539d = c7622f;
    }

    public C7439j(Context context) {
        this.f35536a = 11;
        this.f35537b = context.getApplicationContext();
        this.f35538c = AbstractC4064e.f20918a;
        this.f35539d = new C4069j();
    }

    public C7439j(String str) {
        this.f35536a = 16;
        C8849i c8849i = new C8849i(23, false);
        this.f35537b = c8849i;
        this.f35539d = c8849i;
        this.f35538c = str;
    }

    public C7439j(v3.g0 g0Var) {
        this.f35536a = 7;
        this.f35537b = g0Var;
        this.f35538c = new ArrayList();
        this.f35539d = g0Var;
    }

    public C7439j(URL url, C8011m c8011m, String str) {
        this.f35536a = 8;
        this.f35537b = url;
        this.f35539d = c8011m;
        this.f35538c = str;
    }

    public C7439j(C0917l c0917l) {
        this.f35536a = 6;
        this.f35539d = c0917l;
        this.f35538c = new AtomicBoolean(false);
        this.f35537b = ((C7612v) c0917l.f5595c).f36722d.schedule(new RunnableC7609s(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
