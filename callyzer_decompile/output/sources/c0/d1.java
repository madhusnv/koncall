package c0;

import a1.RunnableC0025x;
import a2.C0036i;
import androidx.camera.core.CameraUnavailableException;
import c9.C0910e;
import com.sun.mail.util.AbstractC1452a;
import d0.AbstractC1545b;
import e0.AbstractC1895d;
import e0.C1896e;
import e0.EnumC1898g;
import f0.EnumC2167b;
import i0.C3070a;
import i0.C3082m;
import i0.w2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4305e;
import m0.C4612f;
import mx.C4912h;
import og.pe;
import p021w.C7851q;
import pg.i7;
import pg.o6;
import pg.t8;
import q3.C6104d;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import rw.C6670t;
import s4.InterfaceC6747c;
import uw.InterfaceC7559c;
import vx.C7806h;
import zh.InterfaceFutureC8957d;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements i0.n1 {

    /* renamed from: a */
    public boolean f5066a;

    /* renamed from: b */
    public Object f5067b;

    /* renamed from: c */
    public final Object f5068c;

    /* renamed from: d */
    public final Object f5069d;

    /* renamed from: e */
    public Object f5070e;

    /* renamed from: f */
    public final Object f5071f;

    /* renamed from: g */
    public Object f5072g;

    /* renamed from: h */
    public Object f5073h;

    public d1(k1.x1 x1Var, C8989c c8989c, k1.l1 l1Var, InterfaceC6747c interfaceC6747c) {
        this.f5067b = x1Var;
        this.f5068c = c8989c;
        this.f5069d = l1Var;
        this.f5070e = interfaceC6747c;
        this.f5071f = o6.m11805a(Integer.MAX_VALUE, null, null, 6);
        this.f5073h = new C0910e(8);
    }

    /* renamed from: b */
    public static final float m2180b(d1 d1Var, k1.v1 v1Var, float f6) {
        k1.x1 x1Var = (k1.x1) d1Var.f5067b;
        long jM8481g = x1Var.m8481g(x1Var.m8477c(f6));
        k1.x1 x1Var2 = v1Var.f20281a;
        return x1Var.m8480f(x1Var.m8478d(k1.x1.m8475a(x1Var2, x1Var2.f20318j, jM8481g, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2181d(c0.d1 r19, k1.x1 r20, k1.s0 r21, float r22, float r23, ww.AbstractC8193c r24) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d1.m2181d(c0.d1, k1.x1, k1.s0, float, float, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2182e(c0.d1 r14, kotlin.jvm.internal.C4168z r15, kotlin.jvm.internal.C4165w r16, k1.x1 r17, kotlin.jvm.internal.C4168z r18, long r19, ww.AbstractC8193c r21) {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof k1.v0
            if (r3 == 0) goto L17
            r3 = r2
            k1.v0 r3 = (k1.v0) r3
            int r4 = r3.f20280g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f20280g = r4
            goto L1c
        L17:
            k1.v0 r3 = new k1.v0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f20279f
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f20280g
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            kotlin.jvm.internal.z r14 = r3.f20278e
            k1.x1 r0 = r3.f20277d
            kotlin.jvm.internal.w r1 = r3.f20276c
            kotlin.jvm.internal.z r4 = r3.f20275b
            c0.d1 r3 = r3.f20274a
            og.od.m10798c(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6f
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            og.od.m10798c(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4c
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4c:
            ab.b r2 = new ab.b
            r5 = 0
            r7 = 28
            r2.<init>(r14, r5, r7)
            r3.f20274a = r14
            r3.f20275b = r15
            r7 = r16
            r3.f20276c = r7
            r8 = r17
            r3.f20277d = r8
            r9 = r18
            r3.f20278e = r9
            r3.f20280g = r6
            java.lang.Object r2 = tx.c0.m13476L(r0, r2, r3)
            if (r2 != r4) goto L6d
            return r4
        L6d:
            r4 = r15
            r1 = r7
        L6f:
            k1.s0 r2 = (k1.s0) r2
            if (r2 == 0) goto Laa
            java.lang.Object r0 = r4.f21164a
            k1.s0 r0 = (k1.s0) r0
            boolean r0 = r0.f20224c
            long r10 = r2.f20222a
            long r12 = r2.f20223b
            k1.s0 r3 = new k1.s0
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.f21164a = r0
            long r3 = r8.m8478d(r10)
            float r0 = r8.m8480f(r3)
            r1.f21161a = r0
            r0 = 30
            r3 = 0
            h1.k r0 = h1.AbstractC2773d.m6779b(r3, r3, r0)
            r9.f21164a = r0
            r14.m2188i(r2)
            float r14 = r1.f21161a
            boolean r14 = k1.r0.m8469a(r14)
            r14 = r14 ^ r6
            goto Lab
        Laa:
            r14 = 0
        Lab:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d1.m2182e(c0.d1, kotlin.jvm.internal.z, kotlin.jvm.internal.w, k1.x1, kotlin.jvm.internal.z, long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static k1.s0 m2183h(C7806h c7806h) {
        k1.s0 s0Var = null;
        C4912h c4912hM10679a = og.h1.m10679a(new k1.m0((Object) new C0036i(21, c7806h), (InterfaceC7559c) (0 == true ? 1 : 0), 1));
        while (c4912hM10679a.hasNext()) {
            k1.s0 s0VarM8473a = (k1.s0) c4912hM10679a.next();
            if (s0Var != null) {
                s0VarM8473a = s0Var.m8473a(s0VarM8473a);
            }
            s0Var = s0VarM8473a;
        }
        return s0Var;
    }

    @Override // i0.n1
    /* renamed from: a */
    public void mo2184a(Executor executor, i0.m1 m1Var) {
        List listUnmodifiableList;
        Throwable th2;
        executor.getClass();
        ((CopyOnWriteArrayList) this.f5069d).add(new C3070a(executor, m1Var));
        synchronized (this.f5068c) {
            try {
                if (!this.f5066a && !((CopyOnWriteArrayList) this.f5069d).isEmpty()) {
                    this.f5066a = true;
                    if (((p020v.c0) this.f5073h) != null) {
                        m2187g();
                    }
                    p020v.c0 c0Var = new p020v.c0(this);
                    this.f5073h = c0Var;
                    C7851q c7851q = (C7851q) this.f5071f;
                    c7851q.f37624a.mo2552E((Executor) this.f5072g, c0Var);
                    i7.m11697b(new C4305e(m2186f(), 1));
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.f5067b);
                th2 = (Throwable) this.f5070e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        executor.execute(new RunnableC0025x(9, th2, new C3070a(executor, m1Var), listUnmodifiableList));
    }

    @Override // i0.n1
    /* renamed from: c */
    public void mo2185c(i0.m1 m1Var) {
        C3070a c3070a;
        Iterator it = ((CopyOnWriteArrayList) this.f5069d).iterator();
        while (true) {
            if (!it.hasNext()) {
                c3070a = null;
                break;
            } else {
                c3070a = (C3070a) it.next();
                if (c3070a.f16422b.equals(m1Var)) {
                    break;
                }
            }
        }
        if (c3070a != null) {
            ((CopyOnWriteArrayList) this.f5069d).remove(c3070a);
        }
        synchronized (this.f5068c) {
            try {
                if (this.f5066a && ((CopyOnWriteArrayList) this.f5069d).isEmpty()) {
                    this.f5066a = false;
                    m2187g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public InterfaceFutureC8957d m2186f() {
        return i7.m11697b(new p020v.b0(0, this));
    }

    /* renamed from: g */
    public void m2187g() {
        p020v.c0 c0Var = (p020v.c0) this.f5073h;
        if (c0Var != null) {
            try {
                ((C7851q) this.f5071f).f37624a.mo2553F(c0Var);
            } catch (Exception unused) {
            } finally {
                this.f5073h = null;
            }
        }
    }

    /* renamed from: i */
    public void m2188i(k1.s0 s0Var) {
        C0910e c0910e = (C0910e) this.f5073h;
        long j6 = s0Var.f20223b;
        long j10 = s0Var.f20222a;
        ((C6104d) c0910e.f5579b).m12139a(Float.intBitsToFloat((int) (j10 >> 32)), j6);
        ((C6104d) c0910e.f5580c).m12139a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j6);
    }

    /* renamed from: j */
    public void m2189j(ArrayList arrayList, CameraUnavailableException cameraUnavailableException) {
        boolean z6;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f5068c) {
            z6 = true;
            try {
                if (cameraUnavailableException != null) {
                    if (((Throwable) this.f5070e) != null && ((List) this.f5067b).isEmpty()) {
                        z6 = false;
                    }
                    this.f5070e = cameraUnavailableException;
                    this.f5067b = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    if (((Throwable) this.f5070e) == null && ((List) this.f5067b).equals(arrayList)) {
                        z6 = false;
                    }
                    this.f5070e = null;
                    this.f5067b = arrayList;
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.f5067b);
                th2 = (Throwable) this.f5070e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z6) {
            ((CopyOnWriteArrayList) this.f5069d).size();
            Iterator it = ((CopyOnWriteArrayList) this.f5069d).iterator();
            while (it.hasNext()) {
                C3070a c3070a = (C3070a) it.next();
                c3070a.f16421a.execute(new RunnableC0025x(9, th2, c3070a, listUnmodifiableList));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2190k(k1.x1 r6, k1.u0 r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof k1.w0
            if (r0 == 0) goto L13
            r0 = r8
            k1.w0 r0 = (k1.w0) r0
            int r1 = r0.f20287d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20287d = r1
            goto L18
        L13:
            k1.w0 r0 = new k1.w0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20285b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20287d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c0.d1 r6 = r0.f20284a
            og.od.m10798c(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r8)
            r5.f5066a = r3
            gs.a r8 = new gs.a
            r2 = 0
            r4 = 18
            r8.<init>(r6, r7, r2, r4)
            r0.f20284a = r5
            r0.f20287d = r3
            tx.t1 r6 = new tx.t1
            uw.h r7 = r0.getContext()
            r2 = 0
            r6.<init>(r7, r0, r2)
            java.lang.Object r6 = th.AbstractC7152b.m13416b(r6, r3, r6, r8)
            if (r6 != r1) goto L53
            return r1
        L53:
            r6 = r5
        L54:
            r7 = 0
            r6.f5066a = r7
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d1.m2190k(k1.x1, k1.u0, ww.c):java.lang.Object");
    }

    public d1(List initialCameraIds, C7851q c7851q, Executor systemCallbackExecutor) {
        AbstractC4154l.m8923f(initialCameraIds, "initialCameraIds");
        AbstractC4154l.m8923f(systemCallbackExecutor, "systemCallbackExecutor");
        this.f5068c = new Object();
        this.f5069d = new CopyOnWriteArrayList();
        this.f5070e = null;
        this.f5066a = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = initialCameraIds.iterator();
        while (it.hasNext()) {
            String primaryCameraId = (String) it.next();
            AbstractC4154l.m8923f(primaryCameraId, "primaryCameraId");
            arrayList.add(new C0823p(pe.m10835j(primaryCameraId), null));
        }
        this.f5067b = arrayList;
        this.f5071f = c7851q;
        this.f5072g = systemCallbackExecutor;
    }

    /* JADX WARN: Type inference failed for: r13v48, types: [i0.w1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [i0.w1, java.lang.Object] */
    public d1(ArrayList arrayList, List effects) {
        String str;
        boolean z6;
        Object next;
        String str2;
        String str3;
        String str4;
        boolean zMo7404i;
        AbstractC4154l.m8923f(effects, "effects");
        Object frameRateRange = C3082m.f16521h;
        AbstractC4154l.m8923f(frameRateRange, "frameRateRange");
        this.f5067b = effects;
        this.f5070e = frameRateRange;
        this.f5071f = C6670t.f31945a;
        this.f5068c = C6668r.f31943a;
        List listM12737A = AbstractC6663m.m12737A(arrayList);
        this.f5069d = listM12737A;
        this.f5072g = new n1(0);
        ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894dM11875d = t8.m11875d();
        AbstractC4154l.m8922e(scheduledExecutorServiceC3894dM11875d, "mainThreadExecutor(...)");
        this.f5073h = scheduledExecutorServiceC3894dM11875d;
        if (!frameRateRange.equals(frameRateRange)) {
            Iterator it = listM12737A.iterator();
            while (it.hasNext()) {
                if (((b2) it.next()).f5050e.mo7404i(w2.f44349y0)) {
                    throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                }
            }
        }
        List list = (List) this.f5068c;
        Set set = (Set) this.f5071f;
        if (!set.isEmpty() || !list.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC1545b) it2.next()).mo5083a());
            }
            for (EnumC2167b enumC2167b : AbstractC6663m.m12737A(arrayList2)) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : set2) {
                    if (((AbstractC1545b) obj).mo5083a() == enumC2167b) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.size() > 1) {
                    throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList3).toString());
                }
            }
            if (AbstractC6663m.m12737A(list).size() == list.size()) {
                Set setF0 = AbstractC6663m.f0(set2);
                setF0.retainAll(list);
                if (setF0.isEmpty()) {
                    for (b2 b2Var : (List) this.f5069d) {
                        EnumC1898g.Companion.getClass();
                        if (C1896e.m5515a(b2Var) != EnumC1898g.UNDEFINED) {
                            if (b2Var instanceof k1) {
                                str = "Preview";
                            } else if (b2Var instanceof v0) {
                                str = "ImageCapture";
                            } else if (b2Var instanceof j0) {
                                str = "ImageAnalysis";
                            } else {
                                str = C4612f.m9481B(b2Var) ? "VideoCapture" : "UseCase";
                            }
                            ?? r22 = b2Var.f5050e;
                            Iterator<E> it3 = EnumC2167b.getEntries().iterator();
                            while (true) {
                                z6 = false;
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                EnumC1898g.Companion.getClass();
                                int i10 = AbstractC1895d.f8917b[((EnumC2167b) next).ordinal()];
                                if (i10 == 1) {
                                    zMo7404i = r22.mo7404i(i0.a1.f44331f0);
                                } else if (i10 == 2) {
                                    zMo7404i = r22.mo7404i(w2.f44349y0);
                                } else if (i10 == 3) {
                                    zMo7404i = r22.mo7404i(w2.D0) || r22.mo7404i(w2.E0);
                                } else if (i10 == 4) {
                                    zMo7404i = r22.mo7404i(i0.z0.f16625e);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (zMo7404i) {
                                    break;
                                }
                            }
                            EnumC2167b enumC2167b2 = (EnumC2167b) next;
                            if (enumC2167b2 == null) {
                                z6 = true;
                            }
                            if (!z6) {
                                StringBuilder sb2 = new StringBuilder("A ");
                                AbstractC4154l.m8920c(enumC2167b2);
                                sb2.append(enumC2167b2.name());
                                sb2.append(" value is set to ");
                                sb2.append(str);
                                sb2.append(" despite using feature groups. Do not use APIs like ");
                                sb2.append(str);
                                sb2.append(".Builder.");
                                int[] iArr = o1.f5186a;
                                int i11 = iArr[enumC2167b2.ordinal()];
                                if (i11 == 1) {
                                    str2 = "setDynamicRange";
                                } else if (i11 == 2) {
                                    str2 = "setTargetFrameRateRange";
                                } else if (i11 != 3) {
                                    if (i11 == 4) {
                                        str2 = "setOutputFormat";
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (C4612f.m9481B(b2Var)) {
                                    str2 = "setVideoStabilizationEnabled";
                                } else {
                                    str2 = "setPreviewStabilizationEnabled";
                                }
                                sb2.append(str2);
                                sb2.append(" while using feature groups. If ");
                                int i12 = iArr[enumC2167b2.ordinal()];
                                if (i12 == 1) {
                                    str3 = "HDR";
                                } else if (i12 == 2) {
                                    str3 = "60 FPS";
                                } else if (i12 == 3) {
                                    str3 = "stabilization";
                                } else if (i12 == 4) {
                                    str3 = "JPEG_R output format";
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                sb2.append(str3);
                                sb2.append(" is required, instead set ");
                                int i13 = iArr[enumC2167b2.ordinal()];
                                if (i13 == 1) {
                                    str4 = "GroupableFeature.HDR_HLG10";
                                } else if (i13 == 2) {
                                    str4 = "GroupableFeature.FPS_60";
                                } else if (i13 != 3) {
                                    if (i13 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str4 = "GroupableFeature.IMAGE_ULTRA_HDR";
                                } else {
                                    str4 = "GroupableFeature.PREVIEW_STABILIZATION";
                                }
                                throw new IllegalArgumentException(AbstractC1452a.m4564k(sb2, str4, " as either a required or preferred feature.").toString());
                            }
                        } else {
                            throw new IllegalArgumentException((b2Var + " is not supported with feature group").toString());
                        }
                    }
                    if (!((List) this.f5067b).isEmpty()) {
                        throw new IllegalArgumentException("Effects aren't supported with feature group yet");
                    }
                } else {
                    throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setF0).toString());
                }
            } else {
                throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + list + ')').toString());
            }
        }
        this.f5066a = true;
    }
}
