package cj;

import a9.C0073l;
import aj.C0161a;
import al.C0182j;
import android.content.Context;
import android.util.Log;
import bd.C0645a;
import c9.C0908c;
import c9.C0919n;
import cd.C0959n;
import cj.C0977c;
import cj.C0979e;
import dj.C1728a;
import dj.C1731d;
import dj.RunnableC1730c;
import eb.C1977a;
import eb.C1978b;
import eb.k3;
import eb.l3;
import ec.C2003a;
import ex.InterfaceC2139c;
import fn.C2336i;
import io.C3328c;
import ix.AbstractC3360a;
import ix.AbstractC3363d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nz.C5213x;
import p020v.a1;
import pg.l8;
import qa.C6150a;
import qt.EnumC6318m;
import sc.AbstractC6791k;
import sc.C6788h;
import sc.C6803w;
import sc.InterfaceC6790j;
import sc.InterfaceC6794n;
import ti.C7164d;
import ud.C7418v;
import ue.C7421c;
import ve.C7707a;
import wi.C8051a;
import wi.C8052b;
import wi.C8059i;
import wi.C8067q;
import wi.C8071u;
import wi.C8072v;
import xe.C8365q;
import xi.C8386d;
import xm.q4;
import xm.y5;
import yc.EnumC8616e;
import yg.C8650g;
import yg.C8656m;
import yi.AbstractC8685n;
import yi.C8673b;
import yi.C8674c;
import yi.C8676e;
import yi.C8677f;
import yi.C8679h;
import yi.InterfaceC8675d;
import yv.C8803r;
import yv.C8805t;
import z1.C8849i;
import zi.a0;
import zi.b0;
import zi.c1;
import zi.c2;
import zi.d1;
import zi.f0;
import zi.f1;
import zi.g1;
import zi.j2;
import zi.o0;
import zi.p0;
import zi.q0;
import zi.r0;
import zi.t0;
import zi.u0;
import zi.v0;
import zi.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cj.e */
/* loaded from: classes.dex */
public final class C0979e {

    /* renamed from: a */
    public Object f5802a;

    /* renamed from: b */
    public Object f5803b;

    /* renamed from: c */
    public Object f5804c;

    /* renamed from: d */
    public Object f5805d;

    /* renamed from: e */
    public Object f5806e;

    /* renamed from: f */
    public Object f5807f;

    /* renamed from: g */
    public Object f5808g;

    public C0979e(C4535g execution, C0645a context, InterfaceC6794n interfaceC6794n, InterfaceC6790j interfaceC6790j, C6803w c6803w, C0073l telemetry) {
        AbstractC4154l.m8923f(execution, "execution");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(telemetry, "telemetry");
        this.f5802a = execution;
        this.f5803b = context;
        this.f5804c = interfaceC6794n;
        this.f5805d = interfaceC6790j;
        this.f5806e = c6803w;
        this.f5807f = telemetry;
        C2003a c2003a = AbstractC6791k.f32294c;
        C7418v.f35217e.getClass();
        AbstractC3360a abstractC3360a = AbstractC3363d.f17772b;
        context.mo1862b(c2003a, new C7418v((abstractC3360a.mo7674d().nextLong() & (~C7418v.f35218f)) | C7418v.f35219g, (abstractC3360a.mo7674d().nextLong() & (~C7418v.f35220h)) | C7418v.f35221i).f35224c);
        this.f5808g = new ArrayList();
    }

    /* renamed from: a */
    public static p0 m2761a(p0 p0Var, C8677f c8677f, C0979e c0979e, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        o0 o0VarM16453a = p0Var.m16453a();
        String strMo13825c = ((InterfaceC8675d) c8677f.f42016b).mo13825c();
        if (strMo13825c != null) {
            o0VarM16453a.f43225e = new c1(strMo13825c);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        C0182j c0182j = (C0182j) c0979e.f5805d;
        if (map.isEmpty()) {
            C8676e c8676e = (C8676e) ((AtomicMarkableReference) c0182j.f555b).getReference();
            synchronized (c8676e) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(c8676e.f42011a));
            }
        } else {
            C8676e c8676e2 = (C8676e) ((AtomicMarkableReference) c0182j.f555b).getReference();
            synchronized (c8676e2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c8676e2.f42011a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            for (Map.Entry entry : map.entrySet()) {
                String strM16010a = C8676e.m16010a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strM16010a)) {
                    map2.put(strM16010a, C8676e.m16010a(1024, (String) entry.getValue()));
                }
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listM2765p = m2765p(mapUnmodifiableMap2);
        C8676e c8676e3 = (C8676e) ((AtomicMarkableReference) ((C0182j) c0979e.f5806e).f555b).getReference();
        synchronized (c8676e3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(c8676e3.f42011a));
        }
        List listM2765p2 = m2765p(mapUnmodifiableMap3);
        if (!listM2765p.isEmpty() || !listM2765p2.isEmpty()) {
            q0 q0Var = (q0) p0Var.f43234c;
            o0VarM16453a.f43223c = new q0(q0Var.f43244a, listM2765p, listM2765p2, q0Var.f43247d, q0Var.f43248e, q0Var.f43249f, q0Var.f43250g);
        }
        return o0VarM16453a.m16452a();
    }

    /* renamed from: b */
    public static j2 m2762b(p0 p0Var, C0979e c0979e) {
        List listM10207a = ((C5213x) c0979e.f5807f).m10207a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listM10207a.size(); i10++) {
            AbstractC8685n abstractC8685n = (AbstractC8685n) listM10207a.get(i10);
            abstractC8685n.getClass();
            d1 d1Var = new d1();
            C8673b c8673b = (C8673b) abstractC8685n;
            String str = c8673b.f42006e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c8673b.f42003b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.f43056a = new f1(str2, str);
            String str3 = c8673b.f42004c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.f43057b = str3;
            String str4 = c8673b.f42005d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.f43058c = str4;
            d1Var.f43059d = c8673b.f42007f;
            d1Var.f43060e = (byte) (d1Var.f43060e | 1);
            arrayList.add(d1Var.m16447a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0VarM16453a = p0Var.m16453a();
        o0VarM16453a.f43226f = new g1(arrayList);
        return o0VarM16453a.m16452a();
    }

    /* renamed from: e */
    public static String m2763e(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public static C0979e m2764f(Context context, C8072v c8072v, C0979e c0979e, C8051a c8051a, C8677f c8677f, C0979e c0979e2, C0908c c0908c, C3328c c3328c, C8849i c8849i, C8059i c8059i, C8386d c8386d) {
        C8067q c8067q = new C8067q(context, c8072v, c8051a, c0908c, c3328c);
        C0977c c0977c = new C0977c(c0979e, c3328c, c8059i);
        C0161a c0161a = C1728a.f8372b;
        C8365q.m15537b(context);
        C1728a c1728a = new C1728a(new C1731d(C8365q.m15536a().m15538c(new C7707a(C1728a.f8373c, C1728a.f8374d)).m15534a("FIREBASE_CRASHLYTICS_REPORT", new C7421c("json"), C1728a.f8375e), c3328c.m7651f(), c8849i));
        C0979e c0979e3 = new C0979e();
        c0979e3.f5802a = c8067q;
        c0979e3.f5803b = c0977c;
        c0979e3.f5804c = c1728a;
        c0979e3.f5805d = c8677f;
        c0979e3.f5806e = c0979e2;
        c0979e3.f5807f = c8072v;
        c0979e3.f5808g = c8386d;
        return c0979e3;
    }

    /* renamed from: p */
    public static List m2765p(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new C0975a(11));
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: t */
    public static synchronized void m2766t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    public static boolean m2767u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m2767u(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: w */
    public static String m2768w(EnumC6318m enumC6318m, String str, String str2, List list) {
        if (str != null && !AbstractC5178p.m10101L(str)) {
            return AbstractC5185w.m10136r(str2, enumC6318m.getToken(), str);
        }
        list.add(enumC6318m.getToken());
        return str2;
    }

    /* renamed from: x */
    public static List m2769x(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* renamed from: A */
    public void m2770A(InterfaceC2139c interfaceC2139c) {
        k3 k3Var = new k3();
        interfaceC2139c.invoke(k3Var);
        this.f5808g = new l3(k3Var);
    }

    /* renamed from: c */
    public void m2771c(InterfaceC2139c interfaceC2139c) {
        C1977a c1977a = new C1977a();
        interfaceC2139c.invoke(c1977a);
        this.f5803b = new C1978b(c1977a);
    }

    /* renamed from: d */
    public void m2772d(String str) {
        File file = new File((File) this.f5803b, str);
        if (file.exists() && m2767u(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2773g(ww.AbstractC8193c r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5808g
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r10 instanceof jo.C3806b
            if (r1 == 0) goto L17
            r1 = r10
            jo.b r1 = (jo.C3806b) r1
            int r2 = r1.f19695c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f19695c = r2
            goto L1c
        L17:
            jo.b r1 = new jo.b
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.f19693a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f19695c
            java.lang.String r4 = "fetchAllMessageTemplate"
            r5 = 3
            r6 = 2
            r7 = 1
            qw.a0 r8 = qw.a0.f30746a
            if (r3 == 0) goto L45
            if (r3 == r7) goto L41
            if (r3 == r6) goto L3d
            if (r3 != r5) goto L35
            og.od.m10798c(r10)
            return r8
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            og.od.m10798c(r10)
            goto L79
        L41:
            og.od.m10798c(r10)
            goto L55
        L45:
            og.od.m10798c(r10)
            java.lang.Object r10 = r9.f5803b
            xm.y5 r10 = (xm.y5) r10
            r1.f19695c = r7
            java.lang.Object r10 = r10.m15696l(r1)
            if (r10 != r2) goto L55
            goto L91
        L55:
            java.util.List r10 = (java.util.List) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L63
            java.lang.String r10 = "No SIM connected"
            r0.m16232g(r4, r10)
            return r8
        L63:
            java.lang.Object r3 = r9.f5802a
            xm.b0 r3 = (xm.b0) r3
            r7 = 0
            java.lang.Object r10 = r10.get(r7)
            mm.m r10 = (mm.C4802m) r10
            r1.f19695c = r6
            r6 = 50
            java.lang.Object r10 = r3.m15561g(r10, r6, r1)
            if (r10 != r2) goto L79
            goto L91
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L93
            java.lang.Object r10 = r9.f5805d
            fn.i r10 = (fn.C2336i) r10
            long r3 = java.lang.System.currentTimeMillis()
            r1.f19695c = r5
            java.lang.Object r10 = r10.m6040t(r3, r1)
            if (r10 != r2) goto L92
        L91:
            return r2
        L92:
            return r8
        L93:
            java.lang.String r10 = "Api call is not fully success "
            r0.m16232g(r4, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2773g(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2774h(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jo.C3807c
            if (r0 == 0) goto L13
            r0 = r7
            jo.c r0 = (jo.C3807c) r0
            int r1 = r0.f19698c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19698c = r1
            goto L18
        L13:
            jo.c r0 = new jo.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f19696a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19698c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r7)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            og.od.m10798c(r7)
            goto L48
        L38:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f5803b
            xm.y5 r7 = (xm.y5) r7
            r0.f19698c = r5
            java.lang.Object r7 = r7.m15696l(r0)
            if (r7 != r1) goto L48
            goto L6f
        L48:
            java.util.List r7 = (java.util.List) r7
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L5c
            java.lang.Object r7 = r6.f5808g
            yv.t r7 = (yv.C8805t) r7
            java.lang.String r0 = "fetchAllMessageTemplate"
            java.lang.String r1 = "No SIM connected"
            r7.m16232g(r0, r1)
            return r3
        L5c:
            java.lang.Object r2 = r6.f5802a
            xm.b0 r2 = (xm.b0) r2
            r5 = 0
            java.lang.Object r7 = r7.get(r5)
            mm.m r7 = (mm.C4802m) r7
            r0.f19698c = r4
            java.lang.Object r7 = r2.m15562h(r7, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2774h(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m2775i(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jo.C3808d
            if (r0 == 0) goto L13
            r0 = r6
            jo.d r0 = (jo.C3808d) r0
            int r1 = r0.f19701c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19701c = r1
            goto L18
        L13:
            jo.d r0 = new jo.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19699a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19701c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f5802a
            xm.b0 r6 = (xm.b0) r6
            r0.f19701c = r3
            java.lang.Object r6 = r6.f40147a
            gn.x2 r6 = (gn.x2) r6
            java.lang.Object r6 = r6.m6697q(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r5 = fb.AbstractC2227a.m5934e(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2775i(java.lang.String, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2776j(ww.AbstractC8193c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jo.C3811g
            if (r0 == 0) goto L13
            r0 = r6
            jo.g r0 = (jo.C3811g) r0
            int r1 = r0.f19709c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19709c = r1
            goto L18
        L13:
            jo.g r0 = new jo.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f19707a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19709c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L60
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r5.f5802a
            xm.b0 r6 = (xm.b0) r6
            r0.f19709c = r3
            java.lang.Object r6 = r6.f40147a
            gn.x2 r6 = (gn.x2) r6
            bn.g r0 = r6.f14955o
            z7.w r0 = r0.f4525a
            java.lang.String r2 = "message_template_tag"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            an.j5 r3 = new an.j5
            r4 = 20
            r3.<init>(r4)
            b8.j r0 = og.z0.m11078a(r0, r2, r3)
            gn.s r2 = new gn.s
            r3 = 0
            r4 = 1
            r2.<init>(r6, r3, r4)
            wx.t r6 = new wx.t
            r6.<init>(r0, r2)
            if (r6 != r1) goto L60
            return r1
        L60:
            wx.j r6 = (wx.InterfaceC8209j) r6
            jo.f r0 = new jo.f
            r1 = 0
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2776j(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a9 -> B:26:0x00aa). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2777k(rt.C6617a r13, ww.AbstractC8193c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof jo.C3812h
            if (r0 == 0) goto L13
            r0 = r14
            jo.h r0 = (jo.C3812h) r0
            int r1 = r0.f19719k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19719k = r1
            goto L18
        L13:
            jo.h r0 = new jo.h
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f19717h
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19719k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            int r13 = r0.f19716g
            int r2 = r0.f19715f
            java.util.Collection r4 = r0.f19714e
            java.util.Collection r4 = (java.util.Collection) r4
            rt.c r5 = r0.f19713d
            java.util.Iterator r6 = r0.f19712c
            java.util.Collection r7 = r0.f19711b
            java.util.Collection r7 = (java.util.Collection) r7
            rt.a r8 = r0.f19710a
            og.od.m10798c(r14)
            goto Laa
        L3d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L45:
            rt.a r13 = r0.f19710a
            og.od.m10798c(r14)
            goto L61
        L4b:
            og.od.m10798c(r14)
            java.lang.Object r14 = r12.f5802a
            xm.b0 r14 = (xm.b0) r14
            r0.f19710a = r13
            r0.f19719k = r4
            java.lang.Object r14 = r14.f40147a
            gn.x2 r14 = (gn.x2) r14
            java.lang.Object r14 = r14.m6701u(r0)
            if (r14 != r1) goto L61
            goto La8
        L61:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r14 = fb.AbstractC2227a.m5934e(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = rw.AbstractC6664n.m12768r(r14, r4)
            r2.<init>(r4)
            java.util.Iterator r14 = r14.iterator()
            r4 = 0
            r8 = r13
            r6 = r14
            r13 = r4
            r4 = r2
            r2 = r13
        L7c:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto Lc0
            java.lang.Object r14 = r6.next()
            r5 = r14
            rt.c r5 = (rt.C6619c) r5
            java.lang.String r14 = r5.f31802c
            r0.f19710a = r8
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            r0.f19711b = r7
            r0.f19712c = r6
            r0.f19713d = r5
            r0.f19714e = r7
            r0.f19715f = r2
            r0.f19716g = r13
            r0.f19719k = r3
            java.util.List r7 = fb.AbstractC2227a.m5931b(r14)
            java.io.Serializable r14 = r12.m2785v(r14, r7, r8, r0)
            if (r14 != r1) goto La9
        La8:
            return r1
        La9:
            r7 = r4
        Laa:
            qw.k r14 = (qw.C6361k) r14
            rt.c r9 = new rt.c
            int r10 = r5.f31800a
            java.lang.String r11 = r5.f31801b
            java.lang.Object r14 = r14.f30755a
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r5 = r5.f31803d
            r9.<init>(r11, r10, r14, r5)
            r4.add(r9)
            r4 = r7
            goto L7c
        Lc0:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2777k(rt.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2778l(java.lang.String r6, rt.C6617a r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof jo.C3814j
            if (r0 == 0) goto L13
            r0 = r8
            jo.j r0 = (jo.C3814j) r0
            int r1 = r0.f19737d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19737d = r1
            goto L18
        L13:
            jo.j r0 = new jo.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f19735b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19737d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            rt.a r7 = r0.f19734a
            og.od.m10798c(r8)
            goto L6b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r8)
            java.lang.Object r8 = r5.f5802a
            xm.b0 r8 = (xm.b0) r8
            r0.f19734a = r7
            r0.f19737d = r3
            java.lang.Object r8 = r8.f40147a
            gn.x2 r8 = (gn.x2) r8
            bn.a r0 = r8.f14951k
            r0.getClass()
            java.lang.String r2 = "messageTemplateId"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r2)
            z7.w r0 = r0.f4512a
            java.lang.String r2 = "message_sub_template"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            an.v1 r3 = new an.v1
            r4 = 13
            r3.<init>(r6, r4)
            b8.j r0 = og.z0.m11078a(r0, r2, r3)
            gn.p0 r2 = new gn.p0
            r3 = 0
            r2.<init>(r8, r6, r3)
            wx.t r8 = new wx.t
            r8.<init>(r0, r2)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            wx.j r8 = (wx.InterfaceC8209j) r8
            b8.j r6 = new b8.j
            r0 = 1
            r6.<init>(r8, r5, r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2778l(java.lang.String, rt.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m2779m(java.lang.String r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof jo.C3815k
            if (r0 == 0) goto L13
            r0 = r11
            jo.k r0 = (jo.C3815k) r0
            int r1 = r0.f19740c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19740c = r1
            goto L18
        L13:
            jo.k r0 = new jo.k
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f19738a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19740c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r11)
            goto L43
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            og.od.m10798c(r11)
            java.lang.Object r11 = r9.f5802a
            xm.b0 r11 = (xm.b0) r11
            r0.f19740c = r3
            java.lang.Object r11 = r11.f40147a
            gn.x2 r11 = (gn.x2) r11
            java.lang.Object r11 = r11.m6662H(r10, r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            java.util.List r11 = (java.util.List) r11
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r11, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = rw.AbstractC6664n.m12768r(r11, r0)
            r10.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            qm.c r0 = (qm.C6247c) r0
            nt.c r1 = new nt.c
            int r2 = r0.f30280a
            java.lang.String r3 = r0.f30281b
            java.lang.String r4 = r0.f30282c
            java.lang.String r5 = r0.f30283d
            r6 = 0
            r7 = -1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.add(r1)
            goto L59
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2779m(java.lang.String, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2780n(java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof jo.C3816l
            if (r0 == 0) goto L13
            r0 = r8
            jo.l r0 = (jo.C3816l) r0
            int r1 = r0.f19744d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19744d = r1
            goto L18
        L13:
            jo.l r0 = new jo.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f19742b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19744d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.f19741a
            og.od.m10798c(r8)
            goto L4c
        L3a:
            og.od.m10798c(r8)
            java.lang.Object r8 = r6.f5803b
            xm.y5 r8 = (xm.y5) r8
            r0.f19741a = r7
            r0.f19744d = r5
            java.lang.Object r8 = r8.m15696l(r0)
            if (r8 != r1) goto L4c
            goto L76
        L4c:
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L60
            java.lang.Object r7 = r6.f5808g
            yv.t r7 = (yv.C8805t) r7
            java.lang.String r8 = "fetchAllMessageTemplate"
            java.lang.String r0 = "No SIM connected"
            r7.m16232g(r8, r0)
            return r3
        L60:
            java.lang.Object r2 = r6.f5802a
            xm.b0 r2 = (xm.b0) r2
            r5 = 0
            java.lang.Object r8 = r8.get(r5)
            mm.m r8 = (mm.C4802m) r8
            r5 = 0
            r0.f19741a = r5
            r0.f19744d = r4
            java.lang.Object r7 = r2.m15564j(r7, r8, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2780n(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: o */
    public File m2781o(String str, String str2) {
        File file = new File((File) this.f5805d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a9 -> B:26:0x00aa). Please report as a decompilation issue!!! */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2782q(java.util.List r12, rt.C6617a r13, ww.AbstractC8193c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof jo.C3817m
            if (r0 == 0) goto L13
            r0 = r14
            jo.m r0 = (jo.C3817m) r0
            int r1 = r0.f19754k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19754k = r1
            goto L18
        L13:
            jo.m r0 = new jo.m
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f19752h
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19754k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            int r12 = r0.f19751g
            int r13 = r0.f19750f
            java.util.Collection r2 = r0.f19749e
            java.util.Collection r2 = (java.util.Collection) r2
            rt.c r4 = r0.f19748d
            java.util.Iterator r5 = r0.f19747c
            java.util.Collection r6 = r0.f19746b
            java.util.Collection r6 = (java.util.Collection) r6
            rt.a r7 = r0.f19745a
            og.od.m10798c(r14)
            goto Laa
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L45:
            rt.a r13 = r0.f19745a
            og.od.m10798c(r14)
            goto L61
        L4b:
            og.od.m10798c(r14)
            java.lang.Object r14 = r11.f5802a
            xm.b0 r14 = (xm.b0) r14
            r0.f19745a = r13
            r0.f19754k = r4
            java.lang.Object r14 = r14.f40147a
            gn.x2 r14 = (gn.x2) r14
            java.lang.Object r14 = r14.m6671Q(r12, r0)
            if (r14 != r1) goto L61
            goto La8
        L61:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r12 = fb.AbstractC2227a.m5934e(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r2 = 10
            int r2 = rw.AbstractC6664n.m12768r(r12, r2)
            r14.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r5 = r12
            r7 = r13
            r12 = r2
            r13 = r12
            r2 = r14
        L7c:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto Lc0
            java.lang.Object r14 = r5.next()
            r4 = r14
            rt.c r4 = (rt.C6619c) r4
            java.lang.String r14 = r4.f31802c
            r0.f19745a = r7
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f19746b = r6
            r0.f19747c = r5
            r0.f19748d = r4
            r0.f19749e = r6
            r0.f19750f = r13
            r0.f19751g = r12
            r0.f19754k = r3
            java.util.List r6 = fb.AbstractC2227a.m5931b(r14)
            java.io.Serializable r14 = r11.m2785v(r14, r6, r7, r0)
            if (r14 != r1) goto La9
        La8:
            return r1
        La9:
            r6 = r2
        Laa:
            qw.k r14 = (qw.C6361k) r14
            rt.c r8 = new rt.c
            int r9 = r4.f31800a
            java.lang.String r10 = r4.f31801b
            java.lang.Object r14 = r14.f30755a
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r4 = r4.f31803d
            r8.<init>(r10, r9, r14, r4)
            r2.add(r8)
            r2 = r6
            goto L7c
        Lc0:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2782q(java.util.List, rt.a, ww.c):java.lang.Object");
    }

    /* renamed from: r */
    public void m2783r(C6150a c6150a) {
        C4535g c4535g = (C4535g) this.f5802a;
        c6150a.f29992b = Integer.valueOf(((C0959n) c4535g.f22544h).mo2719f().f3778b);
        ((C6788h) c4535g.f22540d).m12980c(c6150a, EnumC8616e.After);
    }

    /* renamed from: s */
    public void m2784s(Throwable th2, Thread thread, String str, final C8674c c8674c, boolean z6) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        C0908c c0908c;
        final boolean zEquals = str.equals("crash");
        C8067q c8067q = (C8067q) this.f5802a;
        long j6 = c8674c.f42009b;
        Context context = c8067q.f38641a;
        int i10 = context.getResources().getConfiguration().orientation;
        C0908c c0908c2 = c8067q.f38644d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C0919n c0919n = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            String localizedMessage = th3.getLocalizedMessage();
            String name = th3.getClass().getName();
            StackTraceElement[] stackTraceElementArrMo2559b = c0908c2.mo2559b(th3.getStackTrace());
            C0919n c0919n2 = new C0919n();
            c0919n2.f5598a = localizedMessage;
            c0919n2.f5599b = name;
            c0919n2.f5600c = stackTraceElementArrMo2559b;
            c0919n2.f5601d = c0919n;
            c0919n = c0919n2;
        }
        o0 o0Var = new o0();
        o0Var.f43222b = str;
        o0Var.f43221a = j6;
        o0Var.f43227g = (byte) (o0Var.f43227g | 1);
        c2 c2VarM13425b = C7164d.f34414a.m13425b(context);
        int i11 = ((z0) c2VarM13425b).f43327c;
        Boolean boolValueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList arrayListM13424a = C7164d.m13424a(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c0919n.f5600c;
        String name2 = thread.getName();
        if (name2 == null) {
            throw new NullPointerException("Null name");
        }
        byte b11 = (byte) 1;
        List listM15206d = C8067q.m15206d(stackTraceElementArr, 4);
        if (listM15206d == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b11 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b11 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
        }
        arrayList.add(new v0(4, name2, listM15206d));
        if (z6) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    c0908c = c0908c2;
                } else {
                    StackTraceElement[] stackTraceElementArrMo2559b2 = c0908c2.mo2559b(next.getValue());
                    String name3 = key.getName();
                    if (name3 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listM15206d2 = C8067q.m15206d(stackTraceElementArrMo2559b2, 0);
                    if (listM15206d2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b11 != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        if (b11 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(a1.m14334n(sb3, "Missing required properties:"));
                    }
                    c0908c = c0908c2;
                    arrayList.add(new v0(0, name3, listM15206d2));
                }
                it2 = it;
                c0908c2 = c0908c;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarM15205c = C8067q.m15205c(c0919n, 0);
        u0 u0VarM15207e = C8067q.m15207e();
        List listM15208a = c8067q.m15208a();
        if (listM15208a == null) {
            throw new NullPointerException("Null binaries");
        }
        r0 r0Var = new r0(listUnmodifiableList, t0VarM15205c, null, u0VarM15207e, listM15208a);
        if (b10 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b10 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(a1.m14334n(sb4, "Missing required properties:"));
        }
        o0Var.f43223c = new q0(r0Var, null, null, bool, c2VarM13425b, arrayListM13424a, i10);
        o0Var.f43224d = c8067q.m15209b(i10);
        p0 p0VarM16452a = o0Var.m16452a();
        Map map = c8674c.f42010c;
        C8677f c8677f = (C8677f) this.f5805d;
        C0979e c0979e = (C0979e) this.f5806e;
        final j2 j2VarM2762b = m2762b(m2761a(p0VarM16452a, c8677f, c0979e, map), c0979e);
        if (z6) {
            ((C0977c) this.f5803b).m2760d(j2VarM2762b, c8674c.f42008a, zEquals);
        } else {
            ((C8386d) this.f5808g).f40064b.m15551a(new Runnable() { // from class: wi.w
                @Override // java.lang.Runnable
                public final void run() {
                    C0979e c0979e2 = this.f38663a;
                    c0979e2.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    ((C0977c) c0979e2.f5803b).m2760d(j2VarM2762b, c8674c.f42008a, zEquals);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m2785v(java.lang.String r11, java.util.List r12, rt.C6617a r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2785v(java.lang.String, java.util.List, rt.a, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a9 -> B:26:0x00aa). Please report as a decompilation issue!!! */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2786y(java.lang.String r11, java.util.List r12, rt.C6617a r13, ww.AbstractC8193c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof jo.C3819o
            if (r0 == 0) goto L13
            r0 = r14
            jo.o r0 = (jo.C3819o) r0
            int r1 = r0.f19771k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19771k = r1
            goto L18
        L13:
            jo.o r0 = new jo.o
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f19769h
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19771k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            int r11 = r0.f19768g
            int r12 = r0.f19767f
            java.util.Collection r13 = r0.f19766e
            java.util.Collection r13 = (java.util.Collection) r13
            rt.c r2 = r0.f19765d
            java.util.Iterator r4 = r0.f19764c
            java.util.Collection r5 = r0.f19763b
            java.util.Collection r5 = (java.util.Collection) r5
            rt.a r6 = r0.f19762a
            og.od.m10798c(r14)
            goto Laa
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L45:
            rt.a r13 = r0.f19762a
            og.od.m10798c(r14)
            goto L61
        L4b:
            og.od.m10798c(r14)
            java.lang.Object r14 = r10.f5802a
            xm.b0 r14 = (xm.b0) r14
            r0.f19762a = r13
            r0.f19771k = r4
            java.lang.Object r14 = r14.f40147a
            gn.x2 r14 = (gn.x2) r14
            java.lang.Object r14 = r14.s0(r11, r12, r0)
            if (r14 != r1) goto L61
            goto La8
        L61:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r11 = fb.AbstractC2227a.m5934e(r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r14 = 10
            int r14 = rw.AbstractC6664n.m12768r(r11, r14)
            r12.<init>(r14)
            java.util.Iterator r11 = r11.iterator()
            r14 = 0
            r4 = r11
            r6 = r13
            r11 = r14
            r13 = r12
            r12 = r11
        L7c:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto Lc0
            java.lang.Object r14 = r4.next()
            r2 = r14
            rt.c r2 = (rt.C6619c) r2
            java.lang.String r14 = r2.f31802c
            r0.f19762a = r6
            r5 = r13
            java.util.Collection r5 = (java.util.Collection) r5
            r0.f19763b = r5
            r0.f19764c = r4
            r0.f19765d = r2
            r0.f19766e = r5
            r0.f19767f = r12
            r0.f19768g = r11
            r0.f19771k = r3
            java.util.List r5 = fb.AbstractC2227a.m5931b(r14)
            java.io.Serializable r14 = r10.m2785v(r14, r5, r6, r0)
            if (r14 != r1) goto La9
        La8:
            return r1
        La9:
            r5 = r13
        Laa:
            qw.k r14 = (qw.C6361k) r14
            rt.c r7 = new rt.c
            int r8 = r2.f31800a
            java.lang.String r9 = r2.f31801b
            java.lang.Object r14 = r14.f30755a
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r2 = r2.f31803d
            r7.<init>(r9, r8, r14, r2)
            r13.add(r7)
            r13 = r5
            goto L7c
        Lc0:
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C0979e.m2786y(java.lang.String, java.util.List, rt.a, ww.c):java.lang.Object");
    }

    /* renamed from: z */
    public C8656m m2787z(Executor executor, String str) {
        C8650g c8650g;
        ArrayList arrayListM2758b = ((C0977c) this.f5803b).m2758b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListM2758b.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM2758b.get(i10);
            i10++;
            File file = (File) obj;
            try {
                C0161a c0161a = C0977c.f5793g;
                String strM2756e = C0977c.m2756e(file);
                c0161a.getClass();
                arrayList.add(new C8052b(C0161a.m380i(strM2756e), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            C8052b c8052b = (C8052b) obj2;
            if (str == null || str.equals(c8052b.f38571b)) {
                C1728a c1728a = (C1728a) this.f5804c;
                b0 b0Var = c8052b.f38570a;
                if (b0Var.f43006f == null || b0Var.f43007g == null) {
                    C8071u c8071uM15211b = ((C8072v) this.f5807f).m15211b(true);
                    b0 b0Var2 = c8052b.f38570a;
                    String str2 = c8071uM15211b.f38653a;
                    a0 a0VarM16445a = b0Var2.m16445a();
                    a0VarM16445a.f42976e = str2;
                    b0 b0VarM16443a = a0VarM16445a.m16443a();
                    String str3 = c8071uM15211b.f38654b;
                    a0 a0VarM16445a2 = b0VarM16443a.m16445a();
                    a0VarM16445a2.f42977f = str3;
                    c8052b = new C8052b(a0VarM16445a2.m16443a(), c8052b.f38571b, c8052b.f38572c);
                }
                boolean z6 = str != null;
                C1731d c1731d = c1728a.f8376a;
                synchronized (c1731d.f8390f) {
                    try {
                        c8650g = new C8650g();
                        if (z6) {
                            ((AtomicInteger) c1731d.f8393i.f42583b).getAndIncrement();
                            if (c1731d.f8390f.size() < c1731d.f8389e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                c1731d.f8390f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                c1731d.f8391g.execute(new RunnableC1730c(0, c1731d, c8052b, c8650g));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                c8650g.m15971d(c8052b);
                            } else {
                                c1731d.m5429a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) c1731d.f8393i.f42584c).getAndIncrement();
                                c8650g.m15971d(c8052b);
                            }
                        } else {
                            c1731d.m5430b(c8052b, c8650g);
                        }
                    } finally {
                    }
                }
                arrayList2.add(c8650g.f41930a.m15980g(executor, new p020v.b0(4, this)));
            }
        }
        return l8.m11766g(arrayList2);
    }

    public C0979e(xm.b0 b0Var, y5 userSIMRepository, q4 sessionConfigurationRepository, C2336i dataStoreSource, C8803r networkMonitorUtil, Context context, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f5802a = b0Var;
        this.f5803b = userSIMRepository;
        this.f5804c = sessionConfigurationRepository;
        this.f5805d = dataStoreSource;
        this.f5806e = networkMonitorUtil;
        this.f5807f = context;
        this.f5808g = c8805t;
    }

    public C0979e(String str, C0979e c0979e, C8386d c8386d) {
        this.f5805d = new C0182j(this, false);
        this.f5806e = new C0182j(this, true);
        this.f5807f = new C5213x();
        this.f5808g = new AtomicMarkableReference(null, false);
        this.f5802a = str;
        this.f5803b = new C8679h(c0979e);
        this.f5804c = c8386d;
    }
}
