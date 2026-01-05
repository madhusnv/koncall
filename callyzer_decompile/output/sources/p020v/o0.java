package p020v;

import a1.C0013l;
import a6.C0058f;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import be.C0655j;
import eb.i3;
import eb.q0;
import i0.AbstractC3084o;
import i0.C3080k;
import i0.InterfaceC3093x;
import i0.g2;
import i0.v0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l0.AbstractC4308h;
import l0.C4304d;
import l0.C4310j;
import l0.RunnableC4302b;
import l0.RunnableC4307g;
import o1.g0;
import og.oa;
import og.u1;
import og.y0;
import p022x.C8233c;
import pg.d6;
import pg.t8;
import pg.y5;
import uf.C7427b;
import v0.C7622f;
import x4.C8299i;
import x4.C8302l;
import z1.C8849i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 implements p0 {

    /* renamed from: c */
    public final n0 f36646c;

    /* renamed from: d */
    public g1 f36647d;

    /* renamed from: e */
    public g1 f36648e;

    /* renamed from: f */
    public g2 f36649f;

    /* renamed from: i */
    public m0 f36652i;

    /* renamed from: j */
    public m0 f36653j;

    /* renamed from: k */
    public C8302l f36654k;

    /* renamed from: l */
    public C8299i f36655l;

    /* renamed from: m */
    public HashMap f36656m;

    /* renamed from: n */
    public final q0 f36657n;

    /* renamed from: o */
    public final q0 f36658o;

    /* renamed from: p */
    public final C0058f f36659p;

    /* renamed from: q */
    public final C8233c f36660q;

    /* renamed from: r */
    public final g0 f36661r;

    /* renamed from: s */
    public final boolean f36662s;

    /* renamed from: a */
    public final Object f36644a = new Object();

    /* renamed from: b */
    public final ArrayList f36645b = new ArrayList();

    /* renamed from: g */
    public final HashMap f36650g = new HashMap();

    /* renamed from: h */
    public List f36651h = Collections.EMPTY_LIST;

    public o0(C8233c c8233c, i3 i3Var, boolean z6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m0 m0Var = m0.UNINITIALIZED;
        this.f36652i = m0Var;
        this.f36653j = m0Var;
        this.f36656m = new HashMap();
        this.f36657n = new q0(4);
        this.f36658o = new q0(5);
        m14420o(m0.INITIALIZED);
        this.f36660q = c8233c;
        this.f36646c = new n0(this);
        this.f36659p = new C0058f(i3Var.m5728f(CaptureNoResponseQuirk.class));
        this.f36661r = new g0(i3Var, 2);
        this.f36662s = z6;
    }

    /* renamed from: c */
    public static C7614x m14406c(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c7614x;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3084o abstractC3084o = (AbstractC3084o) it.next();
            if (abstractC3084o == null) {
                c7614x = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                d6.m11580a(abstractC3084o, arrayList2);
                c7614x = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C7614x(arrayList2);
            }
            arrayList.add(c7614x);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C7614x(arrayList);
    }

    /* renamed from: d */
    public static HashMap m14407d(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.m612a((Surface) map2.get(((C3080k) it.next()).f16501a));
                throw null;
            }
            arrayList.size();
            u1.m10943b("CaptureSession");
        }
        return map3;
    }

    /* renamed from: g */
    public static HashMap m14408g(ArrayList arrayList) {
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C3080k c3080k = (C3080k) obj;
            int i11 = c3080k.f16504d;
            if (i11 > 0 && c3080k.f16502b.isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i11), arrayList2);
                }
                arrayList2.add(c3080k);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* renamed from: a */
    public final int m14409a(ArrayList arrayList, C7597g c7597g) {
        C7597g c7597g2 = new C7597g(1);
        int size = arrayList.size();
        int iMo14822p = -1;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            CaptureRequest captureRequest = (CaptureRequest) obj;
            g1 g1Var = this.f36648e;
            Objects.requireNonNull(g1Var);
            C7622f c7622f = g1Var.f36550g;
            c7622f.getClass();
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((C8849i) c7622f.f36778a).f42583b;
            List<CaptureRequest> listCreateHighSpeedRequestList = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
            Iterator<CaptureRequest> it = listCreateHighSpeedRequestList.iterator();
            while (it.hasNext()) {
                c7597g2.m14375a(it.next(), Collections.singletonList(new y0(captureRequest, c7597g)));
            }
            g1 g1Var2 = this.f36648e;
            CameraCaptureSession.CaptureCallback captureCallbackM164c = g1Var2.f36564u.m164c(c7597g2);
            y0.m11055e(g1Var2.f36550g, "Need to call openCaptureSession before using this API.");
            iMo14822p = ((C8849i) g1Var2.f36550g.f36778a).mo14822p(listCreateHighSpeedRequestList, g1Var2.f36547d, captureCallbackM164c);
        }
        return iMo14822p;
    }

    /* renamed from: b */
    public final void m14410b() {
        synchronized (this.f36644a) {
            try {
                int iOrdinal = this.f36653j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f36653j);
                }
                if (iOrdinal == 2) {
                    m14420o(m0.RELEASED);
                } else if (iOrdinal == 3) {
                    y0.m11055e(this.f36647d, "The Opener shouldn't null in state:" + this.f36653j);
                    this.f36647d.m14385p();
                    m14420o(m0.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    y0.m11055e(this.f36647d, "The Opener shouldn't null in state:" + this.f36653j);
                    this.f36647d.m14385p();
                    m14420o(m0.CLOSED);
                    this.f36659p.m177p();
                    this.f36649f = null;
                }
            } finally {
            }
        }
    }

    /* renamed from: e */
    public final void m14411e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m0 m0Var = this.f36653j;
        m0 m0Var2 = m0.RELEASED;
        if (m0Var == m0Var2) {
            u1.m10942a("CaptureSession");
            return;
        }
        m14420o(m0Var2);
        this.f36648e = null;
        C8299i c8299i = this.f36655l;
        if (c8299i != null) {
            c8299i.m15507b(null);
            this.f36655l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p022x.C8238h m14412f(i0.C3080k r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            i0.v0 r0 = r6.f16501a
            java.util.List r1 = r6.f16502b
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r2 = "Surface in OutputConfig not found in configuredSurfaceMap."
            og.y0.m11055e(r0, r2)
            x.h r3 = new x.h
            int r4 = r6.f16504d
            r3.<init>(r4, r0)
            x.j r0 = r3.f39377a
            if (r8 == 0) goto L1e
            r0.mo15419i(r8)
            goto L22
        L1e:
            r8 = 0
            r0.mo15419i(r8)
        L22:
            int r8 = r6.f16503c
            r4 = 1
            if (r8 != 0) goto L2b
            r0.mo15418h(r4)
            goto L31
        L2b:
            if (r8 != r4) goto L31
            r8 = 2
            r0.mo15418h(r8)
        L31:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L57
            r0.mo15412b()
            java.util.Iterator r8 = r1.iterator()
        L3e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            i0.v0 r1 = (i0.v0) r1
            java.lang.Object r1 = r7.get(r1)
            android.view.Surface r1 = (android.view.Surface) r1
            og.y0.m11055e(r1, r2)
            r0.mo15411a(r1)
            goto L3e
        L57:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 < r8) goto L8b
            x.c r1 = r5.f36660q
            r1.getClass()
            if (r7 < r8) goto L65
            goto L66
        L65:
            r4 = 0
        L66:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            og.y0.m11056f(r7, r4)
            java.lang.Object r7 = r1.f39372a
            x.b r7 = (p022x.InterfaceC8232b) r7
            android.hardware.camera2.params.DynamicRangeProfiles r7 = r7.mo15405a()
            if (r7 == 0) goto L8b
            c0.a0 r6 = r6.f16505e
            java.lang.Long r7 = p022x.AbstractC8231a.m15404a(r6, r7)
            if (r7 != 0) goto L86
            java.util.Objects.toString(r6)
            java.lang.String r6 = "CaptureSession"
            og.u1.m10943b(r6)
            goto L8b
        L86:
            long r6 = r7.longValue()
            goto L8d
        L8b:
            r6 = 1
        L8d:
            r0.mo15417g(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.o0.m14412f(i0.k, java.util.HashMap, java.lang.String):x.h");
    }

    /* renamed from: h */
    public final boolean m14413h() {
        boolean z6;
        synchronized (this.f36644a) {
            try {
                m0 m0Var = this.f36653j;
                z6 = m0Var == m0.OPENED || m0Var == m0.OPENING;
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: i */
    public final int m14414i(ArrayList arrayList) {
        C7597g c7597g;
        ArrayList arrayList2;
        boolean z6;
        InterfaceC3093x interfaceC3093x;
        synchronized (this.f36644a) {
            try {
                if (this.f36653j != m0.OPENED) {
                    u1.m10942a("CaptureSession");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    c7597g = new C7597g(1);
                    arrayList2 = new ArrayList();
                    u1.m10942a("CaptureSession");
                    int size = arrayList.size();
                    z6 = false;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        i0.q0 q0Var = (i0.q0) obj;
                        if (Collections.unmodifiableList(q0Var.f16565a).isEmpty()) {
                            u1.m10942a("CaptureSession");
                        } else {
                            Iterator it = Collections.unmodifiableList(q0Var.f16565a).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    v0 v0Var = (v0) it.next();
                                    if (!this.f36650g.containsKey(v0Var)) {
                                        Objects.toString(v0Var);
                                        u1.m10942a("CaptureSession");
                                        break;
                                    }
                                } else {
                                    if (q0Var.f16567c == 2) {
                                        z6 = true;
                                    }
                                    C0655j c0655j = new C0655j(q0Var);
                                    if (q0Var.f16567c == 5 && (interfaceC3093x = q0Var.f16571g) != null) {
                                        c0655j.f4197g = interfaceC3093x;
                                    }
                                    g2 g2Var = this.f36649f;
                                    if (g2Var != null) {
                                        c0655j.m1875e(g2Var.f16473g.f16566b);
                                    }
                                    c0655j.m1875e(q0Var.f16566b);
                                    i0.q0 q0VarM1876f = c0655j.m1876f();
                                    g1 g1Var = this.f36648e;
                                    g1Var.f36550g.getClass();
                                    CaptureRequest captureRequestM11941d = y5.m11941d(q0VarM1876f, ((CameraCaptureSession) ((C8849i) g1Var.f36550g.f36778a).f42583b).getDevice(), this.f36650g, false, this.f36661r);
                                    if (captureRequestM11941d == null) {
                                        u1.m10942a("CaptureSession");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = q0Var.f16568d.iterator();
                                    while (it2.hasNext()) {
                                        d6.m11580a((AbstractC3084o) it2.next(), arrayList3);
                                    }
                                    c7597g.m14375a(captureRequestM11941d, arrayList3);
                                    arrayList2.add(captureRequestM11941d);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e2) {
                    e2.getMessage();
                    u1.m10943b("CaptureSession");
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    u1.m10942a("CaptureSession");
                    return -1;
                }
                if (this.f36657n.m5738e(arrayList2, z6)) {
                    this.f36648e.m14386q();
                    c7597g.f36543c = new l0(this);
                }
                if (this.f36658o.m5737d(arrayList2, z6)) {
                    c7597g.m14375a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C7614x(this)));
                }
                g2 g2Var2 = this.f36649f;
                if (g2Var2 != null && g2Var2.f16474h == 1) {
                    return m14409a(arrayList2, c7597g);
                }
                g1 g1Var2 = this.f36648e;
                CameraCaptureSession.CaptureCallback captureCallbackM164c = g1Var2.f36564u.m164c(c7597g);
                y0.m11055e(g1Var2.f36550g, "Need to call openCaptureSession before using this API.");
                return ((C8849i) g1Var2.f36550g.f36778a).mo14822p(arrayList2, g1Var2.f36547d, captureCallbackM164c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m14415j(List list) {
        synchronized (this.f36644a) {
            try {
                switch (this.f36653j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f36653j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f36645b.addAll(list);
                        break;
                    case OPENED:
                        this.f36645b.addAll(list);
                        this.f36659p.m166e().mo9026a(new RunnableC7606p(2, this), t8.m11872a());
                        break;
                }
            } finally {
            }
        }
    }

    /* renamed from: k */
    public final int m14416k(g2 g2Var) {
        synchronized (this.f36644a) {
            try {
                if (g2Var == null) {
                    u1.m10942a("CaptureSession");
                    return -1;
                }
                if (this.f36653j != m0.OPENED) {
                    u1.m10942a("CaptureSession");
                    return -1;
                }
                i0.q0 q0Var = g2Var.f16473g;
                if (Collections.unmodifiableList(q0Var.f16565a).isEmpty()) {
                    u1.m10942a("CaptureSession");
                    try {
                        this.f36648e.m14386q();
                    } catch (CameraAccessException e2) {
                        e2.getMessage();
                        u1.m10943b("CaptureSession");
                        Thread.dumpStack();
                    }
                } else {
                    try {
                        u1.m10942a("CaptureSession");
                        g1 g1Var = this.f36648e;
                        g1Var.f36550g.getClass();
                        CaptureRequest captureRequestM11941d = y5.m11941d(q0Var, ((CameraCaptureSession) ((C8849i) g1Var.f36550g.f36778a).f42583b).getDevice(), this.f36650g, true, this.f36661r);
                        if (captureRequestM11941d == null) {
                            u1.m10942a("CaptureSession");
                            return -1;
                        }
                        CameraCaptureSession.CaptureCallback captureCallbackM164c = this.f36659p.m164c(m14406c(q0Var.f16568d, new CameraCaptureSession.CaptureCallback[0]));
                        if (g2Var.f16474h != 1) {
                            return this.f36648e.m14383n(captureRequestM11941d, captureCallbackM164c);
                        }
                        C7622f c7622f = this.f36648e.f36550g;
                        c7622f.getClass();
                        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((C8849i) c7622f.f36778a).f42583b;
                        List<CaptureRequest> listCreateHighSpeedRequestList = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequestM11941d) : Collections.EMPTY_LIST;
                        g1 g1Var2 = this.f36648e;
                        y0.m11055e(g1Var2.f36550g, "Need to call openCaptureSession before using this API.");
                        return ((C8849i) g1Var2.f36550g.f36778a).mo14820G(listCreateHighSpeedRequestList, g1Var2.f36547d, captureCallbackM164c);
                    } catch (CameraAccessException e10) {
                        e10.getMessage();
                        u1.m10943b("CaptureSession");
                        Thread.dumpStack();
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final InterfaceFutureC8957d m14417l(g2 g2Var, CameraDevice cameraDevice, g1 g1Var) {
        InterfaceFutureC8957d interfaceFutureC8957dM14384o;
        synchronized (this.f36644a) {
            try {
                if (this.f36653j.ordinal() != 2) {
                    Objects.toString(this.f36653j);
                    u1.m10943b("CaptureSession");
                    return new C4310j(1, new IllegalStateException("open() should not allow the state: " + this.f36653j));
                }
                m14420o(m0.GET_SURFACE);
                ArrayList arrayList = new ArrayList(g2Var.m7341b());
                this.f36651h = arrayList;
                this.f36647d = g1Var;
                synchronized (g1Var.f36559p) {
                    g1Var.f36560q = arrayList;
                    interfaceFutureC8957dM14384o = g1Var.m14384o(arrayList);
                }
                RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(C4304d.m9025b(interfaceFutureC8957dM14384o), new C0013l(12, this, g2Var, cameraDevice), this.f36647d.f36547d);
                runnableC4302bM9037g.mo9026a(new RunnableC4307g(0, runnableC4302bM9037g, new C7427b(4, this)), this.f36647d.f36547d);
                return AbstractC4308h.m9034d(runnableC4302bM9037g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007c, B:28:0x008f), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007c, B:28:0x008f), top: B:31:0x0009 }] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zh.InterfaceFutureC8957d m14418m() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f36644a
            monitor-enter(r3)
            v.m0 r4 = r5.f36653j     // Catch: java.lang.Throwable -> L1d
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L7c
            switch(r4) {
                case 2: goto L73;
                case 3: goto L5b;
                case 4: goto L48;
                case 5: goto L15;
                case 6: goto L1f;
                case 7: goto L15;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L1d
        L14:
            goto L78
        L15:
            v.g1 r0 = r5.f36648e     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            r0.m14378i()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L90
        L1f:
            v.m0 r0 = p020v.m0.RELEASING     // Catch: java.lang.Throwable -> L1d
            r5.m14420o(r0)     // Catch: java.lang.Throwable -> L1d
            a6.f r0 = r5.f36659p     // Catch: java.lang.Throwable -> L1d
            r0.m177p()     // Catch: java.lang.Throwable -> L1d
            v.g1 r0 = r5.f36647d     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            v.m0 r2 = r5.f36653j     // Catch: java.lang.Throwable -> L1d
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            og.y0.m11055e(r0, r1)     // Catch: java.lang.Throwable -> L1d
            v.g1 r0 = r5.f36647d     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.m14385p()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L48
            r5.m14411e()     // Catch: java.lang.Throwable -> L1d
            goto L78
        L48:
            x4.l r0 = r5.f36654k     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L57
            v.l0 r0 = new v.l0     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            x4.l r0 = pg.i7.m11697b(r0)     // Catch: java.lang.Throwable -> L1d
            r5.f36654k = r0     // Catch: java.lang.Throwable -> L1d
        L57:
            x4.l r0 = r5.f36654k     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L5b:
            v.g1 r0 = r5.f36647d     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            v.m0 r1 = r5.f36653j     // Catch: java.lang.Throwable -> L1d
            r2.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            og.y0.m11055e(r0, r1)     // Catch: java.lang.Throwable -> L1d
            v.g1 r0 = r5.f36647d     // Catch: java.lang.Throwable -> L1d
            r0.m14385p()     // Catch: java.lang.Throwable -> L1d
        L73:
            v.m0 r0 = p020v.m0.RELEASED     // Catch: java.lang.Throwable -> L1d
            r5.m14420o(r0)     // Catch: java.lang.Throwable -> L1d
        L78:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            l0.j r0 = l0.C4310j.f21736c
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            v.m0 r0 = r5.f36653j     // Catch: java.lang.Throwable -> L1d
            r2.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.o0.m14418m():zh.d");
    }

    /* renamed from: n */
    public final void m14419n(g2 g2Var) {
        synchronized (this.f36644a) {
            try {
                switch (this.f36653j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f36653j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f36649f = g2Var;
                        break;
                    case OPENED:
                        this.f36649f = g2Var;
                        if (g2Var != null) {
                            if (!this.f36650g.keySet().containsAll(g2Var.m7341b())) {
                                u1.m10943b("CaptureSession");
                                return;
                            } else {
                                u1.m10942a("CaptureSession");
                                m14416k(this.f36649f);
                                break;
                            }
                        } else {
                            return;
                        }
                }
            } finally {
            }
        }
    }

    /* renamed from: o */
    public final void m14420o(m0 m0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (m0Var.ordinal() > this.f36652i.ordinal()) {
            this.f36652i = m0Var;
        }
        this.f36653j = m0Var;
        if (!oa.m10793c() || this.f36652i.ordinal() < m0.GET_SURFACE.ordinal()) {
            return;
        }
        oa.m10794d(m0Var.ordinal(), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
    }
}
