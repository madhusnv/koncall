package c9;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.work.impl.WorkDatabase_Impl;
import bg.AbstractC0656a;
import bk.C0674e;
import bk.C0681l;
import bk.C0685p;
import bk.C0687r;
import c0.C0816i;
import c0.k1;
import ee.C2033a;
import ee.C2034b;
import ee.C2036d;
import ee.C2037e;
import ee.C2039g;
import ee.InterfaceC2040h;
import fj.InterfaceC2294a;
import h2.C2806k;
import i0.C3074e;
import i0.C3082m;
import i0.C3083n;
import i0.InterfaceC3094y;
import i0.e0;
import i0.j2;
import i0.m2;
import i0.p2;
import i0.s0;
import i0.w2;
import i0.z2;
import i00.C3119x;
import i00.InterfaceC3102g;
import i00.w0;
import iz.InterfaceC3372e;
import iz.k0;
import j0.AbstractC3506f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import l0.InterfaceC4303c;
import l4.C4367l;
import m0.C4611e;
import m0.C4612f;
import m0.C4615i;
import nz.C5205p;
import og.od;
import og.pe;
import og.u1;
import og.y0;
import oj.C5392d;
import p020v.C7607q;
import p020v.C7612v;
import p020v.a0;
import p020v.c1;
import p020v.p0;
import p021w.C7850p;
import p021w.C7855u;
import rj.InterfaceC6558d;
import rw.AbstractC6674x;
import tx.C7251k;
import u0.C7294d;
import uf.C7427b;
import ug.C7436g;
import ug.C7452w;
import ug.C7453x;
import ug.d1;
import ug.d2;
import ug.f0;
import ug.n1;
import ug.q2;
import ug.v0;
import ug.w3;
import v3.b2;
import v3.g0;
import wc.C7973g;
import wc.InterfaceC7989w;
import wk.InterfaceC8101a;
import wk.InterfaceC8102b;
import xm.C8418z;
import xm.y5;
import y7.z0;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8646c;
import yk.C8687a;
import yn.C8716n;
import yv.C8791f;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.c */
/* loaded from: classes.dex */
public class C0908c implements InterfaceC4303c, InterfaceC2040h, InterfaceC2294a, InterfaceC3372e, InterfaceC7989w, InterfaceC8646c, InterfaceC8102b {

    /* renamed from: a */
    public final /* synthetic */ int f5573a;

    /* renamed from: b */
    public Object f5574b;

    /* renamed from: c */
    public Object f5575c;

    public /* synthetic */ C0908c(int i10, Object obj) {
        this.f5573a = i10;
        this.f5575c = null;
        this.f5574b = obj;
    }

    /* renamed from: A */
    public void m2549A(int i10, int i11) {
        int[] iArr = (int[]) this.f5574b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        m2564h(i12);
        int[] iArr2 = (int[]) this.f5574b;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f5574b;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f5575c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z0 z0Var = (z0) ((ArrayList) this.f5575c).get(size);
            int i13 = z0Var.f41835a;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.f5575c).remove(size);
                } else {
                    z0Var.f41835a = i13 - i11;
                }
            }
        }
    }

    /* renamed from: C */
    public void mo2550C(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f5574b).openCamera(str, new C7607q(executor, stateCallback), ((C7855u) this.f5575c).f37627b);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: D */
    public C2034b mo2551D(C2033a c2033a) {
        C2036d c2036d = (C2036d) ((C2037e) this.f5575c).m5620h(c2033a);
        if (c2036d != null) {
            return new C2034b(c2036d.f9595a, c2036d.f9596b);
        }
        return null;
    }

    /* renamed from: E */
    public void mo2552E(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C7850p c7850p;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        C7855u c7855u = (C7855u) this.f5575c;
        synchronized (c7855u.f37626a) {
            try {
                c7850p = (C7850p) c7855u.f37626a.get(availabilityCallback);
                if (c7850p == null) {
                    c7850p = new C7850p(executor, availabilityCallback);
                    c7855u.f37626a.put(availabilityCallback, c7850p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((CameraManager) this.f5574b).registerAvailabilityCallback(c7850p, c7855u.f37627b);
    }

    /* renamed from: F */
    public void mo2553F(CameraManager.AvailabilityCallback availabilityCallback) {
        C7850p c7850p;
        if (availabilityCallback != null) {
            C7855u c7855u = (C7855u) this.f5575c;
            synchronized (c7855u.f37626a) {
                c7850p = (C7850p) c7855u.f37626a.remove(availabilityCallback);
            }
        } else {
            c7850p = null;
        }
        if (c7850p != null) {
            synchronized (c7850p.f37622c) {
                c7850p.f37623d = true;
            }
        }
        ((CameraManager) this.f5574b).unregisterAvailabilityCallback(c7850p);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2554G(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5574b
            xm.l2 r0 = (xm.l2) r0
            boolean r1 = r9 instanceof ko.C4137e
            if (r1 == 0) goto L17
            r1 = r9
            ko.e r1 = (ko.C4137e) r1
            int r2 = r1.f21117c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f21117c = r2
            goto L1c
        L17:
            ko.e r1 = new ko.e
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.f21115a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f21117c
            r4 = 2
            qw.a0 r5 = qw.a0.f30746a
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L38
            if (r3 != r4) goto L30
            og.od.m10798c(r9)
            return r5
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            og.od.m10798c(r9)
            goto L64
        L3c:
            og.od.m10798c(r9)
            r1.f21117c = r6
            gn.x2 r9 = r0.f40530a
            an.m4 r9 = r9.f14949i
            z7.w r9 = r9.f1106a
            ad.h r3 = new ad.h
            r7 = 14
            r3.<init>(r7)
            r7 = 0
            java.lang.Object r9 = og.pe.m10837l(r9, r6, r7, r3)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L5c
            goto L5d
        L5c:
            r6 = r7
        L5d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            if (r9 != r2) goto L64
            goto L7c
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L7d
            r1.f21117c = r4
            fn.i r9 = r0.f40531b
            r3 = 0
            java.lang.Object r9 = r9.m6037q(r3, r1)
            if (r9 != r2) goto L79
            goto L7a
        L79:
            r9 = r5
        L7a:
            if (r9 != r2) goto L7d
        L7c:
            return r2
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2554G(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2555H(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5575c
            xm.b0 r0 = (xm.b0) r0
            boolean r1 = r8 instanceof ko.C4138f
            if (r1 == 0) goto L17
            r1 = r8
            ko.f r1 = (ko.C4138f) r1
            int r2 = r1.f21120c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f21120c = r2
            goto L1c
        L17:
            ko.f r1 = new ko.f
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.f21118a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f21120c
            r4 = 2
            r5 = 1
            qw.a0 r6 = qw.a0.f30746a
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            og.od.m10798c(r8)
            return r6
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            og.od.m10798c(r8)
            goto L4c
        L3c:
            og.od.m10798c(r8)
            r1.f21120c = r5
            java.lang.Object r8 = r0.f40147a
            gn.x2 r8 = (gn.x2) r8
            java.lang.Object r8 = r8.l0(r1)
            if (r8 != r2) goto L4c
            goto L66
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L67
            r1.f21120c = r4
            java.lang.Object r8 = r0.f40148b
            fn.i r8 = (fn.C2336i) r8
            r3 = 0
            java.lang.Object r8 = r8.m6040t(r3, r1)
            if (r8 != r2) goto L63
            goto L64
        L63:
            r8 = r6
        L64:
            if (r8 != r2) goto L67
        L66:
            return r2
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2555H(ww.c):java.lang.Object");
    }

    /* renamed from: I */
    public void m2556I() {
        n1 n1Var = (n1) ((q2) this.f5575c).f482a;
        d1 d1Var = n1Var.f35668e;
        n1.m14083i(d1Var);
        SparseArray sparseArrayM13863S = d1Var.m13863S();
        w3 w3Var = (w3) this.f5574b;
        sparseArrayM13863S.put(w3Var.f35894c, Long.valueOf(w3Var.f35893b));
        d1 d1Var2 = n1Var.f35668e;
        n1.m14083i(d1Var2);
        int[] iArr = new int[sparseArrayM13863S.size()];
        long[] jArr = new long[sparseArrayM13863S.size()];
        for (int i10 = 0; i10 < sparseArrayM13863S.size(); i10++) {
            iArr[i10] = sparseArrayM13863S.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayM13863S.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        d1Var2.f35340p.m15247Z(bundle);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        switch (this.f5573a) {
            case 1:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            case 16:
                w3 w3Var = (w3) this.f5574b;
                q2 q2Var = (q2) this.f5575c;
                q2Var.mo325M();
                q2Var.f35776j = false;
                n1 n1Var = (n1) q2Var.f482a;
                C7436g c7436g = n1Var.f35667d;
                v0 v0Var = n1Var.f35669f;
                int i10 = 2;
                if (c7436g.m13889W(null, f0.T0)) {
                    String message = th2.getMessage();
                    q2Var.f35781p = false;
                    if (message != null) {
                        if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                            if (message.contains("Background")) {
                                q2Var.f35781p = true;
                            }
                            i10 = 1;
                        } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                            i10 = 3;
                        }
                    }
                }
                int i11 = i10 - 1;
                if (i11 == 0) {
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14142c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", v0.m14157U(n1Var.m14095r().m14080S()), v0.m14157U(th2.toString()));
                    q2Var.f35777k = 1;
                    q2Var.k0().add(w3Var);
                    return;
                }
                if (i11 != 1) {
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14142c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", v0.m14157U(n1Var.m14095r().m14080S()), th2);
                    m2556I();
                    q2Var.f35777k = 1;
                    q2Var.l0();
                    return;
                }
                q2Var.k0().add(w3Var);
                if (q2Var.f35777k > ((Integer) f0.f44831w0.m13872a(null)).intValue()) {
                    q2Var.f35777k = 1;
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14142c("registerTriggerAsync failed. May try later. App ID, throwable", v0.m14157U(n1Var.m14095r().m14080S()), v0.m14157U(th2.toString()));
                    return;
                }
                n1.m14085m(v0Var);
                v0Var.f35865j.m14143d("registerTriggerAsync failed. App ID, delay in seconds, throwable", v0.m14157U(n1Var.m14095r().m14080S()), v0.m14157U(String.valueOf(q2Var.f35777k)), v0.m14157U(th2.toString()));
                int i12 = q2Var.f35777k;
                if (q2Var.f35778l == null) {
                    q2Var.f35778l = new d2(q2Var, n1Var, 1);
                }
                q2Var.f35778l.m14096b(i12 * 1000);
                int i13 = q2Var.f35777k;
                q2Var.f35777k = i13 + i13;
                return;
            default:
                return;
        }
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: V */
    public void mo2557V(int i10) {
        int i11;
        if (i10 >= 40) {
            ((C2037e) this.f5575c).m5628p(-1);
            return;
        }
        if (10 > i10 || i10 >= 20) {
            return;
        }
        C2037e c2037e = (C2037e) this.f5575c;
        synchronized (((C8687a) c2037e.f9052g)) {
            i11 = c2037e.f9048c;
        }
        c2037e.m5628p(i11 / 2);
    }

    /* renamed from: a */
    public void m2558a(g0 g0Var, boolean z6) {
        C7427b c7427b = (C7427b) this.f5575c;
        C7427b c7427b2 = (C7427b) this.f5574b;
        if (z6) {
            c7427b2.m13811c(g0Var);
            c7427b.m13811c(g0Var);
        } else {
            if (((b2) c7427b2.f35231b).contains(g0Var)) {
                return;
            }
            c7427b.m13811c(g0Var);
        }
    }

    @Override // fj.InterfaceC2294a
    /* renamed from: b */
    public StackTraceElement[] mo2559b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC2294a[] interfaceC2294aArr = (InterfaceC2294a[]) this.f5574b;
        StackTraceElement[] stackTraceElementArrMo2559b = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            InterfaceC2294a interfaceC2294a = interfaceC2294aArr[i10];
            if (stackTraceElementArrMo2559b.length <= 1024) {
                break;
            }
            stackTraceElementArrMo2559b = interfaceC2294a.mo2559b(stackTraceElementArr);
        }
        return stackTraceElementArrMo2559b.length > 1024 ? ((C5392d) this.f5575c).mo2559b(stackTraceElementArrMo2559b) : stackTraceElementArrMo2559b;
    }

    /* renamed from: c */
    public synchronized void m2560c() {
        if (!((LinkedHashSet) this.f5574b).isEmpty()) {
            ((C0685p) this.f5575c).m1970e(0L);
        }
    }

    @Override // wc.InterfaceC7989w
    public boolean cancel(Throwable th2) {
        return ((C7973g) this.f5575c).cancel(th2);
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: d */
    public void mo2561d(C5205p c5205p, IOException iOException) {
        try {
            ((InterfaceC3102g) this.f5574b).mo5819L((C3119x) this.f5575c, iOException);
        } catch (Throwable th2) {
            w0.m7478q(th2);
            th2.printStackTrace();
        }
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: e */
    public void mo2562e(C5205p c5205p, k0 k0Var) {
        InterfaceC3102g interfaceC3102g = (InterfaceC3102g) this.f5574b;
        C3119x c3119x = (C3119x) this.f5575c;
        try {
            try {
                interfaceC3102g.mo5818A(c3119x, c3119x.m7482c(k0Var));
            } catch (Throwable th2) {
                w0.m7478q(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            w0.m7478q(th3);
            try {
                interfaceC3102g.mo5819L(c3119x, th3);
            } catch (Throwable th4) {
                w0.m7478q(th4);
                th4.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public C4615i m2563f(int i10, e0 cameraInfoInternal, ArrayList arrayList, ArrayList arrayList2, InterfaceC3094y cameraConfig, Range targetFrameRate, boolean z6) {
        int i11;
        Rect rectMo7324g;
        boolean z10;
        AbstractC4154l.m8923f(cameraInfoInternal, "cameraInfoInternal");
        AbstractC4154l.m8923f(cameraConfig, "cameraConfig");
        AbstractC4154l.m8923f(targetFrameRate, "targetFrameRate");
        ArrayList arrayList3 = new ArrayList();
        String strMo7323e = cameraInfoInternal.mo7323e();
        AbstractC4154l.m8922e(strMo7323e, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            int i13 = i12 + 1;
            c0.b2 b2Var = (c0.b2) obj;
            int i14 = size;
            C3082m c3082m = b2Var.f5053h;
            if (c3082m == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            a0 a0Var = (a0) this.f5575c;
            if (a0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iMo7291q = b2Var.f5052g.mo7291q();
            C3082m c3082m2 = b2Var.f5053h;
            Size size2 = c3082m2 != null ? c3082m2.f16522a : null;
            if (size2 == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            j2 j2VarM7423z = b2Var.f5052g.m7423z();
            c1 c1Var = (c1) a0Var.f36471b.get(strMo7323e);
            y0.m11051a("No such camera id in supported combination list: ".concat(strMo7323e), c1Var != null);
            C3083n c3083nM14361l = c1Var.m14361l(iMo7291q);
            m2 m2Var = m2.CAPTURE_SESSION_TABLES;
            j2 j2Var = p2.f16554e;
            p2 p2VarM11531b = pg.a0.m11531b(iMo7291q, size2, c3083nM14361l, i10, m2Var, j2VarM7423z);
            int iMo7291q2 = b2Var.f5052g.mo7291q();
            C3082m c3082m3 = b2Var.f5053h;
            Size size3 = c3082m3 != null ? c3082m3.f16522a : null;
            AbstractC4154l.m8920c(size3);
            c0.a0 a0Var2 = c3082m.f16524c;
            ArrayList arrayListM13626H = C7294d.m13626H(b2Var);
            s0 s0Var = c3082m.f16527f;
            int iIntValue = ((Integer) b2Var.f5052g.mo7401e(w2.f44348x0, 0)).intValue();
            Range range = (Range) b2Var.f5052g.mo7401e(w2.f44349y0, C3082m.f16521h);
            if (range == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean bool = (Boolean) b2Var.f5052g.mo7401e(w2.f44350z0, Boolean.FALSE);
            Objects.requireNonNull(bool);
            C3074e c3074e = new C3074e(p2VarM11531b, iMo7291q2, size3, a0Var2, arrayListM13626H, s0Var, iIntValue, range, bool.booleanValue());
            arrayList3.add(c3074e);
            linkedHashMap2.put(c3074e, b2Var);
            linkedHashMap.put(b2Var, c3082m);
            size = i14;
            i12 = i13;
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object second = pair.second;
        AbstractC4154l.m8922e(second, "second");
        Map map = (Map) second;
        HashMap mapM9487x = C4612f.m9487x(arrayList, (z2) cameraConfig.mo7401e(InterfaceC3094y.f16613U, z2.f16632a), (p020v.e0) this.f5574b, targetFrameRate);
        String strMo7323e2 = cameraInfoInternal.mo7323e();
        AbstractC4154l.m8922e(strMo7323e2, "getCameraId(...)");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i11 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rectMo7324g = cameraInfoInternal.mo7324g();
            } catch (NullPointerException unused) {
                rectMo7324g = null;
            }
            C4367l c4367l = new C4367l(cameraInfoInternal, rectMo7324g != null ? AbstractC3506f.m8070e(rectMo7324g) : null);
            int size4 = arrayList.size();
            int i15 = 0;
            boolean z11 = false;
            while (i15 < size4) {
                Object obj2 = arrayList.get(i15);
                i15++;
                c0.b2 b2Var2 = (c0.b2) obj2;
                Object obj3 = mapM9487x.get(b2Var2);
                if (obj3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                HashMap map2 = mapM9487x;
                C4611e c4611e = (C4611e) obj3;
                int i16 = size4;
                w2 w2VarM2163n = b2Var2.m2163n(cameraInfoInternal, c4611e.f22832a, c4611e.f22833b);
                AbstractC4154l.m8922e(w2VarM2163n, "mergeConfigs(...)");
                linkedHashMap4.put(w2VarM2163n, b2Var2);
                linkedHashMap5.put(w2VarM2163n, c4367l.m9120B(w2VarM2163n));
                if ((b2Var2 instanceof k1) || (b2Var2 instanceof C7294d)) {
                    z11 = w2VarM2163n.m7422P() == 2;
                }
                mapM9487x = map2;
                size4 = i16;
            }
            a0 a0Var3 = (a0) this.f5575c;
            if (a0Var3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ArrayList arrayList4 = new ArrayList(map.keySet());
            int size5 = arrayList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size5) {
                    z10 = false;
                    break;
                }
                Object obj4 = arrayList.get(i17);
                i17++;
                if (C4612f.m9481B((c0.b2) obj4)) {
                    z10 = true;
                    break;
                }
            }
            y0.m11051a("No new use cases to be bound.", !linkedHashMap5.isEmpty());
            c1 c1Var2 = (c1) a0Var3.f36471b.get(strMo7323e2);
            y0.m11051a("No such camera id in supported combination list: ".concat(strMo7323e2), c1Var2 != null);
            i0.q2 q2VarM14359j = c1Var2.m14359j(i10, arrayList4, linkedHashMap5, z11, z10, z6);
            HashMap map3 = q2VarM14359j.f16572a;
            HashMap map4 = q2VarM14359j.f16573b;
            i11 = q2VarM14359j.f16574c;
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                Object value = entry.getValue();
                Object obj5 = map3.get(entry.getKey());
                if (obj5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap3.put(value, obj5);
            }
            for (Map.Entry entry2 : map4.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj6 = map.get(entry2.getKey());
                    if (obj6 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap3.put(obj6, entry2.getValue());
                }
            }
        }
        Object first = pair.first;
        AbstractC4154l.m8922e(first, "first");
        return new C4615i(AbstractC6674x.m12780h((Map) first, linkedHashMap3), i11);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        switch (this.f5573a) {
            case 1:
                y0.m11056f("Unexpected result from SurfaceRequest. Surface was provided twice.", ((C0816i) obj).f5107a != 3);
                u1.m10942a("TextureViewImpl");
                ((SurfaceTexture) this.f5574b).release();
                a1.f0 f0Var = ((a1.e0) this.f5575c).f35a;
                if (f0Var.f47j != null) {
                    f0Var.f47j = null;
                    break;
                }
                break;
            default:
                ((C7612v) this.f5575c).f36735s.remove((p0) this.f5574b);
                int iOrdinal = ((C7612v) this.f5575c).f36723e.ordinal();
                if (iOrdinal != 1 && iOrdinal != 5) {
                    if (iOrdinal == 6 || (iOrdinal == 7 && ((C7612v) this.f5575c).f36730m != 0)) {
                        ((C7612v) this.f5575c).m14455w("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (((C7612v) this.f5575c).f36735s.isEmpty()) {
                    C7612v c7612v = (C7612v) this.f5575c;
                    if (c7612v.f36729l != null) {
                        c7612v.m14455w("closing camera");
                        ((C7612v) this.f5575c).f36729l.close();
                        ((C7612v) this.f5575c).f36729l = null;
                        break;
                    }
                }
                break;
        }
    }

    @Override // wc.InterfaceC7989w
    public int getAvailableForRead() {
        return ((C7973g) this.f5575c).getAvailableForRead();
    }

    @Override // wc.InterfaceC7989w
    public Throwable getClosedCause() {
        return ((C7973g) this.f5575c).getClosedCause();
    }

    /* renamed from: h */
    public void m2564h(int i10) {
        int[] iArr = (int[]) this.f5574b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f5574b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5574b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f5574b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: i */
    public CameraCharacteristics mo2565i(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.f5574b).getCameraCharacteristics(str);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForRead() {
        return ((C7973g) this.f5575c).isClosedForRead();
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForWrite() {
        return ((C7973g) this.f5575c).isClosedForWrite();
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m task) {
        switch (this.f5573a) {
            case 14:
                ((Map) ((C0910e) this.f5575c).f5580c).remove((C8650g) this.f5574b);
                return;
            default:
                C8716n c8716n = (C8716n) this.f5574b;
                C7251k c7251k = (C7251k) this.f5575c;
                AbstractC4154l.m8923f(task, "task");
                if (!task.m15985l()) {
                    task.m15982i();
                    Exception excM15982i = task.m15982i();
                    if (excM15982i != null) {
                        C8791f c8791f = C8791f.f42457a;
                        excM15982i.printStackTrace();
                        c7251k.resumeWith(od.m10796a(excM15982i));
                        return;
                    }
                    return;
                }
                try {
                    String str = (String) task.m15983j();
                    C8791f c8791f2 = C8791f.f42457a;
                    if (C8791f.m16171d(str)) {
                        c7251k.resumeWith(str);
                        return;
                    } else {
                        throw new NullPointerException("FCM task success but token is emptyOrNull in result >>> task:=" + task);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    c8716n.f42156n.m16235j(e2);
                    c7251k.resumeWith(od.m10796a(e2));
                    return;
                }
        }
    }

    /* renamed from: k */
    public Set mo2566k() {
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0655 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05f2  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2567l(j$.time.LocalDateTime r35, j$.time.LocalDateTime r36, java.util.List r37, int r38, java.lang.String r39, java.lang.String r40, android.content.Context r41, ww.AbstractC8193c r42) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2567l(j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, int, java.lang.String, java.lang.String, android.content.Context, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2568m(java.util.List r15, boolean r16, j$.time.LocalDateTime r17, j$.time.LocalDateTime r18, java.lang.String r19, boolean r20, java.lang.String r21, int r22, int r23, ww.AbstractC8193c r24) {
        /*
            r14 = this;
            r0 = r24
            boolean r1 = r0 instanceof sn.C6866b
            if (r1 == 0) goto L16
            r1 = r0
            sn.b r1 = (sn.C6866b) r1
            int r2 = r1.f32645c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f32645c = r2
        L14:
            r13 = r1
            goto L1c
        L16:
            sn.b r1 = new sn.b
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r13.f32643a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r13.f32645c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L2b
            goto L7d
        L2b:
            r0 = move-exception
            r15 = r0
            goto La5
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            og.od.m10798c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r15)
            boolean r15 = r0.isEmpty()
            if (r15 == 0) goto L5c
            zm.d r15 = zm.EnumC8994d.INCOMING
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.OUTGOING
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.MISSED
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.REJECTED
            r0.add(r15)
        L5c:
            int r10 = r23 * 50
            java.lang.Object r15 = r14.f5574b     // Catch: java.lang.Exception -> L2b
            r2 = r15
            xm.w2 r2 = (xm.w2) r2     // Catch: java.lang.Exception -> L2b
            r13.f32645c = r3     // Catch: java.lang.Exception -> L2b
            r9 = 50
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r11 = r21
            r12 = r22
            r3 = r0
            java.lang.Object r0 = r2.m15636b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2b
            if (r0 != r1) goto L7d
            return r1
        L7d:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            r0.size()     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r15.<init>()     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2b
        L8b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2b
            om.i r1 = (om.C5407i) r1     // Catch: java.lang.Exception -> L2b
            cr.b r2 = new cr.b     // Catch: java.lang.Exception -> L2b
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2b
            r15.add(r2)     // Catch: java.lang.Exception -> L2b
            goto L8b
        La0:
            java.util.List r15 = rw.AbstractC6663m.c0(r15)     // Catch: java.lang.Exception -> L2b
            return r15
        La5:
            r15.printStackTrace()
            qw.m r15 = og.od.m10796a(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2568m(java.util.List, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, java.lang.String, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2569n(java.util.List r13, boolean r14, j$.time.LocalDateTime r15, j$.time.LocalDateTime r16, java.lang.String r17, boolean r18, java.lang.String r19, int r20, ww.AbstractC8193c r21) {
        /*
            r12 = this;
            r0 = r21
            boolean r1 = r0 instanceof sn.C6867c
            if (r1 == 0) goto L16
            r1 = r0
            sn.c r1 = (sn.C6867c) r1
            int r2 = r1.f32648c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f32648c = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            sn.c r1 = new sn.c
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r11.f32646a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r11.f32648c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L2b
            goto L77
        L2b:
            r0 = move-exception
            r13 = r0
            goto L9f
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            og.od.m10798c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r13)
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L5c
            zm.d r13 = zm.EnumC8994d.INCOMING
            r0.add(r13)
            zm.d r13 = zm.EnumC8994d.OUTGOING
            r0.add(r13)
            zm.d r13 = zm.EnumC8994d.MISSED
            r0.add(r13)
            zm.d r13 = zm.EnumC8994d.REJECTED
            r0.add(r13)
        L5c:
            java.lang.Object r13 = r12.f5574b     // Catch: java.lang.Exception -> L2b
            r2 = r13
            xm.w2 r2 = (xm.w2) r2     // Catch: java.lang.Exception -> L2b
            r11.f32648c = r3     // Catch: java.lang.Exception -> L2b
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r3 = r0
            java.lang.Object r0 = r2.m15637c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2b
            if (r0 != r1) goto L77
            return r1
        L77:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            r0.size()     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r13.<init>()     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Exception -> L2b
        L85:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r15 == 0) goto L9a
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Exception -> L2b
            om.i r15 = (om.C5407i) r15     // Catch: java.lang.Exception -> L2b
            cr.b r0 = new cr.b     // Catch: java.lang.Exception -> L2b
            r0.<init>(r15)     // Catch: java.lang.Exception -> L2b
            r13.add(r0)     // Catch: java.lang.Exception -> L2b
            goto L85
        L9a:
            java.util.List r13 = rw.AbstractC6663m.c0(r13)     // Catch: java.lang.Exception -> L2b
            return r13
        L9f:
            r13.printStackTrace()
            qw.m r13 = og.od.m10796a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2569n(java.util.List, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, java.lang.String, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0211 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:64:0x020a, B:66:0x0221, B:23:0x0061, B:56:0x01ae, B:58:0x01cf, B:60:0x01de, B:65:0x0211, B:26:0x0076, B:48:0x015c, B:50:0x0177, B:52:0x0186, B:57:0x01ba, B:29:0x008c, B:40:0x00fe, B:42:0x0120, B:44:0x012f, B:49:0x0167, B:34:0x00ba, B:36:0x00c7, B:41:0x0106), top: B:70:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2570o(int r18, java.lang.String r19, java.lang.String r20, j$.time.LocalDateTime r21, j$.time.LocalDateTime r22, java.util.List r23, ww.AbstractC8193c r24) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2570o(int, java.lang.String, java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: p */
    public ArrayList m2571p(String str) {
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        c8896yM16401j.mo9278q(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5574b;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
            while (cursorM10840o.moveToNext()) {
                arrayList.add(cursorM10840o.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2572q(int r8, java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5574b
            xm.w2 r0 = (xm.w2) r0
            boolean r1 = r10 instanceof sn.C6869e
            if (r1 == 0) goto L17
            r1 = r10
            sn.e r1 = (sn.C6869e) r1
            int r2 = r1.f32664c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f32664c = r2
            goto L1c
        L17:
            sn.e r1 = new sn.e
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.f32662a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f32664c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L9b
        L31:
            r8 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L8f
        L3f:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L58
        L43:
            og.od.m10798c(r10)
            r10 = 50
            int r8 = r8 * r10
            int r3 = r9.length()     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L5b
            r1.f32664c = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15638d(r10, r8, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L58
            goto L9a
        L58:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L5b:
            java.lang.String r3 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r3 = nx.AbstractC5178p.g0(r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L31
            int r3 = r3.length()     // Catch: java.lang.Exception -> L31
            if (r3 <= 0) goto L92
            java.lang.String r9 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r9 = nx.AbstractC5178p.g0(r9)     // Catch: java.lang.Exception -> L31
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31
            r1.f32664c = r5     // Catch: java.lang.Exception -> L31
            gn.x2 r0 = r0.f40962a     // Catch: java.lang.Exception -> L31
            an.w4 r0 = r0.f14943c     // Catch: java.lang.Exception -> L31
            z7.w r0 = r0.f1509a     // Catch: java.lang.Exception -> L31
            an.v4 r3 = new an.v4     // Catch: java.lang.Exception -> L31
            r4 = 1
            r3.<init>(r9, r10, r8, r4)     // Catch: java.lang.Exception -> L31
            r8 = 0
            java.lang.Object r10 = og.pe.m10839n(r1, r0, r6, r8, r3)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L8f
            goto L9a
        L8f:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L92:
            r1.f32664c = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15638d(r10, r8, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L9b
        L9a:
            return r2
        L9b:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L9e:
            r8.printStackTrace()
            qw.m r8 = og.od.m10796a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2572q(int, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2573r(int r8, java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5574b
            xm.w2 r0 = (xm.w2) r0
            boolean r1 = r10 instanceof sn.C6870f
            if (r1 == 0) goto L17
            r1 = r10
            sn.f r1 = (sn.C6870f) r1
            int r2 = r1.f32667c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f32667c = r2
            goto L1c
        L17:
            sn.f r1 = new sn.f
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.f32665a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f32667c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L8e
        L31:
            r8 = move-exception
            goto L91
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L82
        L3f:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L58
        L43:
            og.od.m10798c(r10)
            r10 = 50
            int r8 = r8 * r10
            int r3 = r9.length()     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L5b
            r1.f32667c = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15635a(r10, r8, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L58
            goto L8d
        L58:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L5b:
            java.lang.String r3 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r3 = nx.AbstractC5178p.g0(r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L31
            int r3 = r3.length()     // Catch: java.lang.Exception -> L31
            if (r3 <= 0) goto L85
            java.lang.String r9 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r9 = nx.AbstractC5178p.g0(r9)     // Catch: java.lang.Exception -> L31
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31
            r1.f32667c = r5     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15639e(r9, r10, r8, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L82
            goto L8d
        L82:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L85:
            r1.f32667c = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15635a(r10, r8, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L8e
        L8d:
            return r2
        L8e:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L91:
            r8.printStackTrace()
            qw.m r8 = og.od.m10796a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2573r(int, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read(wc.C7985s r6, long r7, uw.InterfaceC7559c r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5575c
            wc.g r0 = (wc.C7973g) r0
            boolean r1 = r9 instanceof qc.C6156b
            if (r1 == 0) goto L17
            r1 = r9
            qc.b r1 = (qc.C6156b) r1
            int r2 = r1.f30013c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f30013c = r2
            goto L1e
        L17:
            qc.b r1 = new qc.b
            ww.c r9 = (ww.AbstractC8193c) r9
            r1.<init>(r5, r9)
        L1e:
            java.lang.Object r9 = r1.f30011a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f30013c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            og.od.m10798c(r9)
            goto L41
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            og.od.m10798c(r9)
            r1.f30013c = r4
            java.lang.Object r9 = r0.read(r6, r7, r1)
            if (r9 != r2) goto L41
            return r2
        L41:
            r6 = r9
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r1 = -1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L5f
            java.lang.Object r6 = r5.f5574b
            java.lang.String r6 = (java.lang.String) r6
            ic.e r7 = r0.f38360a
            byte[] r7 = r7.mo7578a()
            java.lang.String r7 = sd.AbstractC6807a.m12983a(r7)
            qc.AbstractC6164j.m12200a(r6, r7)
        L5f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.read(wc.s, long, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2574s(ww.AbstractC8193c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f5574b
            xm.y5 r0 = (xm.y5) r0
            boolean r1 = r11 instanceof xo.C8419a
            if (r1 == 0) goto L17
            r1 = r11
            xo.a r1 = (xo.C8419a) r1
            int r2 = r1.f41103c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f41103c = r2
            goto L1c
        L17:
            xo.a r1 = new xo.a
            r1.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r1.f41101a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f41103c
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            og.od.m10798c(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            og.od.m10798c(r11)
            goto L4a
        L3a:
            og.od.m10798c(r11)
            r1.f41103c = r5
            fn.i r11 = r0.f41050b
            java.lang.String r3 = "sync_success_time"
            java.lang.Object r11 = r11.m6024d(r3, r1)
            if (r11 != r2) goto L4a
            goto L81
        L4a:
            r3 = r11
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r7 = 0
            if (r3 == 0) goto L5f
            r8 = -1
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r11 = r7
        L60:
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L6f
            yv.o r0 = yv.C8800o.f42459a
            long r0 = r11.longValue()
            j$.time.LocalDateTime r11 = yv.C8800o.m16182F(r0)
            return r11
        L6f:
            r1.f41103c = r4
            yx.d r11 = r0.f41052d
            uw.h r11 = r11.f42488a
            xm.e5 r3 = new xm.e5
            r4 = 0
            r3.<init>(r0, r7, r4)
            java.lang.Object r11 = tx.c0.m13475K(r11, r3, r1)
            if (r11 != r2) goto L82
        L81:
            return r2
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2574s(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2575t(java.util.List r15, boolean r16, j$.time.LocalDateTime r17, j$.time.LocalDateTime r18, java.lang.String r19, boolean r20, java.lang.String r21, int r22, int r23, ww.AbstractC8193c r24) {
        /*
            r14 = this;
            r0 = r24
            boolean r1 = r0 instanceof sn.C6871g
            if (r1 == 0) goto L16
            r1 = r0
            sn.g r1 = (sn.C6871g) r1
            int r2 = r1.f32670c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f32670c = r2
        L14:
            r13 = r1
            goto L1c
        L16:
            sn.g r1 = new sn.g
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r13.f32668a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r13.f32670c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L2b
            goto L7c
        L2b:
            r0 = move-exception
            r15 = r0
            goto La1
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            og.od.m10798c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r15)
            boolean r15 = r0.isEmpty()
            if (r15 == 0) goto L5c
            zm.d r15 = zm.EnumC8994d.INCOMING
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.OUTGOING
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.MISSED
            r0.add(r15)
            zm.d r15 = zm.EnumC8994d.REJECTED
            r0.add(r15)
        L5c:
            int r9 = r23 * 50
            java.lang.Object r15 = r14.f5574b     // Catch: java.lang.Exception -> L2b
            r2 = r15
            xm.w2 r2 = (xm.w2) r2     // Catch: java.lang.Exception -> L2b
            r13.f32670c = r3     // Catch: java.lang.Exception -> L2b
            r10 = 0
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r11 = r21
            r12 = r22
            r3 = r0
            java.lang.Object r0 = r2.m15636b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2b
            if (r0 != r1) goto L7c
            return r1
        L7c:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r15.<init>()     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2b
        L87:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2b
            om.i r1 = (om.C5407i) r1     // Catch: java.lang.Exception -> L2b
            cr.b r2 = new cr.b     // Catch: java.lang.Exception -> L2b
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2b
            r15.add(r2)     // Catch: java.lang.Exception -> L2b
            goto L87
        L9c:
            java.util.List r15 = rw.AbstractC6663m.c0(r15)     // Catch: java.lang.Exception -> L2b
            return r15
        La1:
            r15.printStackTrace()
            qw.m r15 = og.od.m10796a(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2575t(java.util.List, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, java.lang.String, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2576u(int r8, java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5574b
            xm.w2 r0 = (xm.w2) r0
            boolean r1 = r10 instanceof sn.C6872h
            if (r1 == 0) goto L17
            r1 = r10
            sn.h r1 = (sn.C6872h) r1
            int r2 = r1.f32673c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f32673c = r2
            goto L1c
        L17:
            sn.h r1 = new sn.h
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.f32671a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f32673c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L9a
        L31:
            r8 = move-exception
            goto L9d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L8e
        L3f:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L58
        L43:
            og.od.m10798c(r10)
            int r8 = r8 * 50
            int r10 = r9.length()     // Catch: java.lang.Exception -> L31
            r3 = 0
            if (r10 != 0) goto L5b
            r1.f32673c = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15638d(r8, r3, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L58
            goto L99
        L58:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L5b:
            java.lang.String r10 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r10 = nx.AbstractC5178p.g0(r10)     // Catch: java.lang.Exception -> L31
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L31
            int r10 = r10.length()     // Catch: java.lang.Exception -> L31
            if (r10 <= 0) goto L91
            java.lang.String r9 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r9 = nx.AbstractC5178p.g0(r9)     // Catch: java.lang.Exception -> L31
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31
            r1.f32673c = r5     // Catch: java.lang.Exception -> L31
            gn.x2 r10 = r0.f40962a     // Catch: java.lang.Exception -> L31
            an.w4 r10 = r10.f14943c     // Catch: java.lang.Exception -> L31
            z7.w r10 = r10.f1509a     // Catch: java.lang.Exception -> L31
            an.v4 r0 = new an.v4     // Catch: java.lang.Exception -> L31
            r4 = 1
            r0.<init>(r9, r8, r3, r4)     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = og.pe.m10839n(r1, r10, r6, r3, r0)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L8e
            goto L99
        L8e:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L91:
            r1.f32673c = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15638d(r8, r3, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L9a
        L99:
            return r2
        L9a:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L9d:
            r8.printStackTrace()
            qw.m r8 = og.od.m10796a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2576u(int, java.lang.String, ww.c):java.lang.Object");
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: v */
    public void mo2577v(C2033a c2033a, Bitmap bitmap, Map map) {
        int i10;
        int iM1902k = AbstractC0656a.m1902k(bitmap);
        C2037e c2037e = (C2037e) this.f5575c;
        synchronized (((C8687a) c2037e.f9052g)) {
            i10 = c2037e.f9047b;
        }
        if (iM1902k <= i10) {
            ((C2037e) this.f5575c).m5624l(c2033a, new C2036d(bitmap, map, iM1902k));
        } else {
            ((C2037e) this.f5575c).m5625m(c2033a);
            ((C2039g) this.f5574b).m5767q(c2033a, bitmap, map, iM1902k);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2578w(int r8, java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5574b
            xm.w2 r0 = (xm.w2) r0
            boolean r1 = r10 instanceof sn.C6873i
            if (r1 == 0) goto L17
            r1 = r10
            sn.i r1 = (sn.C6873i) r1
            int r2 = r1.f32676c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f32676c = r2
            goto L1c
        L17:
            sn.i r1 = new sn.i
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.f32674a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f32676c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L96
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L82
        L3f:
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L31
            goto L58
        L43:
            og.od.m10798c(r10)
            int r8 = r8 * 50
            int r10 = r9.length()     // Catch: java.lang.Exception -> L31
            r3 = 0
            if (r10 != 0) goto L5b
            r1.f32676c = r6     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15635a(r8, r3, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L58
            goto L95
        L58:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L5b:
            java.lang.String r10 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r10 = nx.AbstractC5178p.g0(r10)     // Catch: java.lang.Exception -> L31
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L31
            int r10 = r10.length()     // Catch: java.lang.Exception -> L31
            if (r10 <= 0) goto L85
            java.lang.String r9 = pg.f9.m11632f(r9)     // Catch: java.lang.Exception -> L31
            java.lang.CharSequence r9 = nx.AbstractC5178p.g0(r9)     // Catch: java.lang.Exception -> L31
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31
            r1.f32676c = r5     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15639e(r9, r8, r3, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L82
            goto L95
        L82:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L85:
            java.lang.CharSequence r9 = nx.AbstractC5178p.g0(r9)     // Catch: java.lang.Exception -> L31
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31
            r1.f32676c = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r0.m15639e(r9, r8, r3, r1)     // Catch: java.lang.Exception -> L31
            if (r10 != r2) goto L96
        L95:
            return r2
        L96:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L31
            return r10
        L99:
            r8.printStackTrace()
            qw.m r8 = og.od.m10796a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2578w(int, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2579x(int r14, java.lang.String r15, java.lang.String r16, j$.time.LocalDateTime r17, j$.time.LocalDateTime r18, java.util.List r19, ww.AbstractC8193c r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof sn.C6874j
            if (r1 == 0) goto L16
            r1 = r0
            sn.j r1 = (sn.C6874j) r1
            int r2 = r1.f32687l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f32687l = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            sn.j r1 = new sn.j
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.f32685j
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r10.f32687l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            og.od.m10798c(r0)
            return r0
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            int r14 = r10.f32684h
            int r2 = r10.f32683g
            java.lang.String r4 = r10.f32682f
            java.lang.String r5 = r10.f32681e
            java.util.List r6 = r10.f32680d
            j$.time.LocalDateTime r7 = r10.f32679c
            j$.time.LocalDateTime r8 = r10.f32678b
            xm.w2 r9 = r10.f32677a
            og.od.m10798c(r0)
            r12 = r5
            r5 = r14
            r14 = r2
            r2 = r0
            r0 = r6
            r6 = r12
            r12 = r7
            r7 = r4
            r4 = r12
            goto L87
        L53:
            og.od.m10798c(r0)
            java.lang.Object r0 = r13.f5574b
            r9 = r0
            xm.w2 r9 = (xm.w2) r9
            java.lang.Object r0 = r13.f5575c
            xm.z r0 = (xm.C8418z) r0
            r10.f32677a = r9
            r2 = r17
            r10.f32678b = r2
            r5 = r18
            r10.f32679c = r5
            r6 = r19
            r10.f32680d = r6
            r7 = r16
            r10.f32681e = r7
            r10.f32682f = r15
            r10.f32683g = r14
            r10.f32684h = r14
            r10.f32687l = r4
            java.lang.Object r0 = r0.m15711a(r10)
            if (r0 != r1) goto L80
            goto Laa
        L80:
            r8 = r2
            r4 = r5
            r5 = r14
            r2 = r0
            r0 = r6
            r6 = r7
            r7 = r15
        L87:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r11 = 0
            r10.f32677a = r11
            r10.f32678b = r11
            r10.f32679c = r11
            r10.f32680d = r11
            r10.f32681e = r11
            r10.f32682f = r11
            r10.f32683g = r14
            r10.f32687l = r3
            gn.x2 r14 = r9.f40962a
            r9 = r2
            r3 = r8
            r2 = r14
            r8 = r0
            java.lang.Object r14 = r2.m6675U(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0908c.m2579x(int, java.lang.String, java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: y */
    public boolean m2580y() {
        return !(((b2) ((C7427b) this.f5575c).f35231b).isEmpty() && ((b2) ((C7427b) this.f5574b).f35231b).isEmpty());
    }

    /* renamed from: z */
    public void m2581z(int i10, int i11) {
        int[] iArr = (int[]) this.f5574b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        m2564h(i12);
        int[] iArr2 = (int[]) this.f5574b;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f5574b, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.f5575c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z0 z0Var = (z0) ((ArrayList) this.f5575c).get(size);
            int i13 = z0Var.f41835a;
            if (i13 >= i10) {
                z0Var.f41835a = i13 + i11;
            }
        }
    }

    public /* synthetic */ C0908c(int i10, Object obj, Object obj2) {
        this.f5573a = i10;
        this.f5575c = obj;
        this.f5574b = obj2;
    }

    public /* synthetic */ C0908c(int i10, Object obj, Object obj2, boolean z6) {
        this.f5573a = i10;
        this.f5574b = obj;
        this.f5575c = obj2;
    }

    public /* synthetic */ C0908c(int i10, boolean z6) {
        this.f5573a = i10;
    }

    public C0908c(y5 userSIMRepository) {
        this.f5573a = 21;
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f5574b = userSIMRepository;
        this.f5575c = userSIMRepository.f41057i;
    }

    public C0908c(xm.w2 w2Var, C8418z appPreferencesRepository) {
        this.f5573a = 15;
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        this.f5574b = w2Var;
        this.f5575c = appPreferencesRepository;
    }

    public C0908c(WorkDatabase_Impl workDatabase_Impl) {
        this.f5573a = 0;
        this.f5574b = workDatabase_Impl;
        this.f5575c = new C0907b(workDatabase_Impl, 0);
    }

    public C0908c(InterfaceC2294a[] interfaceC2294aArr) {
        this.f5573a = 5;
        this.f5574b = interfaceC2294aArr;
        this.f5575c = new C5392d(13);
    }

    public C0908c(Context context, C7855u c7855u) {
        this.f5573a = 19;
        this.f5574b = (CameraManager) context.getSystemService("camera");
        this.f5575c = c7855u;
    }

    public C0908c(C3773g c3773g, InterfaceC6558d interfaceC6558d, C0681l c0681l, C0674e c0674e, Context context, C0687r c0687r, ScheduledExecutorService scheduledExecutorService) {
        this.f5573a = 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5574b = linkedHashSet;
        this.f5575c = new C0685p(c3773g, interfaceC6558d, c0681l, c0674e, context, linkedHashSet, c0687r, scheduledExecutorService);
    }

    public C0908c(int i10, C2039g c2039g) {
        this.f5573a = 4;
        this.f5574b = c2039g;
        this.f5575c = new C2037e(i10, this);
    }

    /* renamed from: B */
    private final void m2548B(Throwable th2) {
    }

    public C0908c(int i10) {
        this.f5573a = i10;
        switch (i10) {
            case 20:
                int i11 = 22;
                this.f5574b = new C0910e((InterfaceC8101a) new C7453x(i11));
                this.f5575c = new C0910e((InterfaceC8101a) new C7452w(i11));
                break;
            default:
                this.f5574b = new C7427b(6);
                this.f5575c = new C7427b(6);
                break;
        }
    }

    public C0908c(C0925t c0925t) {
        this.f5573a = 6;
        this.f5575c = c0925t;
        this.f5574b = new C2806k(c0925t);
    }
}
