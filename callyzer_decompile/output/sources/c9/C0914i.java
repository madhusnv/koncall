package c9;

import a0.C0001a;
import a9.C0073l;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.C1291g;
import com.google.android.gms.internal.measurement.C1297m;
import com.google.android.gms.internal.measurement.C1299o;
import com.google.android.gms.internal.measurement.C1304t;
import com.google.android.gms.internal.measurement.InterfaceC1298n;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.y3;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import d7.AbstractC1646r;
import d7.a1;
import d7.b1;
import d7.q0;
import d7.t0;
import d7.w0;
import d7.y0;
import dx.AbstractC1851a;
import e9.InterfaceC1970a;
import g7.AbstractC2538c;
import g7.C2539d;
import g8.C2545e;
import i0.l0;
import i00.C3096a;
import i00.C3097b;
import i00.i0;
import i7.C3180c;
import iz.C3390w;
import iz.C3391x;
import iz.InterfaceC3371d;
import iz.d0;
import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k0.ExecutorC3897g;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import og.pe;
import og.sa;
import og.ta;
import p020v.e0;
import pg.f9;
import rw.AbstractC6662l;
import xm.j4;
import xm.y5;
import yh.AbstractC8662f;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.i */
/* loaded from: classes.dex */
public final class C0914i implements InterfaceC1970a {

    /* renamed from: a */
    public Object f5585a;

    /* renamed from: b */
    public Object f5586b;

    /* renamed from: c */
    public Object f5587c;

    /* renamed from: d */
    public Object f5588d;

    public C0914i(int i10) {
        switch (i10) {
            case 6:
                this.f5587c = new ArrayList();
                this.f5588d = new ArrayList();
                break;
            default:
                C1304t c1304t = new C1304t(0);
                this.f5585a = c1304t;
                C0919n c0919n = new C0919n(null, c1304t);
                this.f5587c = c0919n;
                this.f5586b = c0919n.m2661g();
                v5 v5Var = new v5(1);
                this.f5588d = v5Var;
                c0919n.m2664j("require", new u9(v5Var));
                ((HashMap) v5Var.f6423a).put("internal.platform", e1.f6124a);
                c0919n.m2664j("runtime.counter", new C1291g(Double.valueOf(0.0d)));
                break;
        }
    }

    /* renamed from: m */
    public static boolean m2621m(LocalDateTime localDateTime) {
        return localDateTime != null && Duration.between(localDateTime.mo7840H(ZoneId.systemDefault()), ZonedDateTime.now()).abs().getSeconds() <= 240;
    }

    /* renamed from: b */
    public void m2622b(String str) {
        C3390w c3390w = new C3390w();
        c3390w.m7795c(null, str);
        C3391x c3391xM7793a = c3390w.m7793a();
        if ("".equals(c3391xM7793a.f17996f.get(r0.size() - 1))) {
            this.f5586b = c3391xM7793a;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c3391xM7793a);
        }
    }

    /* renamed from: c */
    public C0073l m2623c() {
        ArrayList arrayList = (ArrayList) this.f5587c;
        if (((C3391x) this.f5586b) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        Object d0Var = (InterfaceC3371d) this.f5585a;
        if (d0Var == null) {
            d0Var = new d0();
        }
        ExecutorC3897g executorC3897g = i0.f16666a;
        C3096a c3096a = i0.f16668c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f5588d);
        List listMo7433a = c3096a.mo7433a(executorC3897g);
        arrayList2.addAll(listMo7433a);
        List listMo7434c = c3096a.mo7434c();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo7434c.size());
        arrayList3.add(new C3097b(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo7434c);
        C3391x c3391x = (C3391x) this.f5586b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo7433a.size();
        C0073l c0073l = new C0073l();
        c0073l.f264a = new ConcurrentHashMap();
        c0073l.f265b = d0Var;
        c0073l.f266c = c3391x;
        c0073l.f267d = listUnmodifiableList;
        c0073l.f268e = listUnmodifiableList2;
        return c0073l;
    }

    /* renamed from: d */
    public void m2624d(Intent intent) throws DataNotFoundException {
        Context context = (Context) this.f5588d;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            throw new DataNotFoundException(f9.m11628b(context, R.string.call_intent_error));
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2625e(java.lang.String r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof to.C7175a
            if (r0 == 0) goto L13
            r0 = r9
            to.a r0 = (to.C7175a) r0
            int r1 = r0.f34440d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34440d = r1
            goto L18
        L13:
            to.a r0 = new to.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f34438b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34440d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r9)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r0.f34437a
            og.od.m10798c(r9)
            goto L4c
        L3a:
            og.od.m10798c(r9)
            java.lang.Object r9 = r7.f5586b
            xm.y5 r9 = (xm.y5) r9
            r0.f34437a = r8
            r0.f34440d = r5
            java.lang.Object r9 = r9.m15696l(r0)
            if (r9 != r1) goto L4c
            goto L8b
        L4c:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L55
            goto L8c
        L55:
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = rw.AbstractC6664n.m12768r(r9, r5)
            r2.<init>(r5)
            java.util.Iterator r5 = r9.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            mm.m r6 = (mm.C4802m) r6
            java.lang.String r6 = r6.f23908t
            r2.add(r6)
            goto L64
        L76:
            java.lang.Object r5 = r7.f5585a
            xm.j4 r5 = (xm.j4) r5
            java.lang.Object r9 = rw.AbstractC6663m.m12742F(r9)
            mm.m r9 = (mm.C4802m) r9
            r6 = 0
            r0.f34437a = r6
            r0.f34440d = r4
            java.lang.Object r8 = r5.m15579a(r2, r8, r9, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0914i.m2625e(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2626f(java.lang.String r7, java.lang.String r8, ww.AbstractC8193c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof to.C7176b
            if (r0 == 0) goto L13
            r0 = r9
            to.b r0 = (to.C7176b) r0
            int r1 = r0.f34445e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34445e = r1
            goto L18
        L13:
            to.b r0 = new to.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f34443c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34445e
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r9)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r8 = r0.f34442b
            java.lang.String r7 = r0.f34441a
            og.od.m10798c(r9)
            goto L50
        L3c:
            og.od.m10798c(r9)
            java.lang.Object r9 = r6.f5586b
            xm.y5 r9 = (xm.y5) r9
            r0.f34441a = r7
            r0.f34442b = r8
            r0.f34445e = r5
            java.lang.Object r9 = r9.m15696l(r0)
            if (r9 != r1) goto L50
            goto L70
        L50:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L59
            goto L71
        L59:
            java.lang.Object r2 = r6.f5585a
            xm.j4 r2 = (xm.j4) r2
            java.lang.Object r9 = rw.AbstractC6663m.m12742F(r9)
            mm.m r9 = (mm.C4802m) r9
            r5 = 0
            r0.f34441a = r5
            r0.f34442b = r5
            r0.f34445e = r4
            java.lang.Object r7 = r2.m15581c(r7, r8, r9, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0914i.m2626f(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2627g(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof to.C7177c
            if (r0 == 0) goto L13
            r0 = r8
            to.c r0 = (to.C7177c) r0
            int r1 = r0.f34448c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34448c = r1
            goto L18
        L13:
            to.c r0 = new to.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f34446a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34448c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            og.od.m10798c(r8)
            goto L48
        L38:
            og.od.m10798c(r8)
            java.lang.Object r8 = r7.f5586b
            xm.y5 r8 = (xm.y5) r8
            r0.f34448c = r5
            java.lang.Object r8 = r8.m15696l(r0)
            if (r8 != r1) goto L48
            goto L85
        L48:
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L51
            goto L86
        L51:
            r2 = 0
            java.lang.Object r2 = r8.get(r2)
            mm.m r2 = (mm.C4802m) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = rw.AbstractC6664n.m12768r(r8, r6)
            r5.<init>(r6)
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r8.next()
            mm.m r6 = (mm.C4802m) r6
            java.lang.String r6 = r6.f23908t
            r5.add(r6)
            goto L67
        L79:
            java.lang.Object r8 = r7.f5585a
            xm.j4 r8 = (xm.j4) r8
            r0.f34448c = r4
            java.lang.Object r8 = r8.m15583f(r5, r2, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0914i.m2627g(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2628h(ww.AbstractC8193c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof to.C7179e
            if (r0 == 0) goto L13
            r0 = r6
            to.e r0 = (to.C7179e) r0
            int r1 = r0.f34454c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34454c = r1
            goto L18
        L13:
            to.e r0 = new to.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f34452a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34454c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r5.f5585a
            xm.j4 r6 = (xm.j4) r6
            r0.f34454c = r3
            gn.x2 r6 = r6.f40460a
            an.h5 r0 = r6.f14956p
            z7.w r0 = r0.f906a
            java.lang.String r2 = "quick_call_extensions"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            ad.h r3 = new ad.h
            r4 = 24
            r3.<init>(r4)
            b8.j r0 = og.z0.m11078a(r0, r2, r3)
            gn.s r2 = new gn.s
            r3 = 0
            r4 = 0
            r2.<init>(r6, r3, r4)
            wx.t r6 = new wx.t
            r6.<init>(r0, r2)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            wx.j r6 = (wx.InterfaceC8209j) r6
            jo.f r0 = new jo.f
            r1 = 1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0914i.m2628h(ww.c):java.lang.Object");
    }

    /* renamed from: i */
    public C0912g m2629i(C0915j id2) {
        AbstractC4154l.m8923f(id2, "id");
        String str = id2.f5589a;
        int i10 = id2.f5590b;
        C8896y c8896yM16401j = C8896y.m16401j(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        c8896yM16401j.mo9278q(1, str);
        c8896yM16401j.mo9276g(2, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5585a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            return cursorM10840o.moveToFirst() ? new C0912g(cursorM10840o.getString(AbstractC6662l.m12732v(cursorM10840o, "work_spec_id")), cursorM10840o.getInt(AbstractC6662l.m12732v(cursorM10840o, "generation")), cursorM10840o.getInt(AbstractC6662l.m12732v(cursorM10840o, "system_id"))) : null;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* renamed from: j */
    public w0 m2630j(C4147e c4147e, String key) {
        w0 viewModel;
        w0 w0VarMo1207b;
        AbstractC4154l.m8923f(key, "key");
        synchronized (((C3180c) this.f5588d)) {
            try {
                b1 b1Var = (b1) this.f5585a;
                b1Var.getClass();
                viewModel = (w0) b1Var.f8072a.get(key);
                if (c4147e.m8915d(viewModel)) {
                    y0 y0Var = (y0) this.f5586b;
                    if (y0Var instanceof t0) {
                        t0 t0Var = (t0) y0Var;
                        AbstractC4154l.m8920c(viewModel);
                        t0Var.getClass();
                        AbstractC1646r abstractC1646r = t0Var.f8136d;
                        if (abstractC1646r != null) {
                            C2545e c2545e = t0Var.f8137e;
                            AbstractC4154l.m8920c(c2545e);
                            q0.m5334a(viewModel, c2545e, abstractC1646r);
                        }
                    }
                    AbstractC4154l.m8921d(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C2539d c2539d = new C2539d((AbstractC2538c) this.f5587c);
                    c2539d.f13868a.put(a1.f8066b, key);
                    y0 factory = (y0) this.f5586b;
                    AbstractC4154l.m8923f(factory, "factory");
                    try {
                        try {
                            w0VarMo1207b = factory.mo5333c(c4147e, c2539d);
                        } catch (AbstractMethodError unused) {
                            w0VarMo1207b = factory.mo1207b(AbstractC1851a.m5483b(c4147e));
                        }
                    } catch (AbstractMethodError unused2) {
                        w0VarMo1207b = factory.mo5348a(AbstractC1851a.m5483b(c4147e), c2539d);
                    }
                    viewModel = w0VarMo1207b;
                    b1 b1Var2 = (b1) this.f5585a;
                    b1Var2.getClass();
                    AbstractC4154l.m8923f(viewModel, "viewModel");
                    w0 w0Var = (w0) b1Var2.f8072a.put(key, viewModel);
                    if (w0Var != null) {
                        w0Var.m5360b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewModel;
    }

    /* renamed from: k */
    public void m2631k(C0912g c0912g) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5585a;
        workDatabase_Impl.m16388b();
        workDatabase_Impl.m16389c();
        try {
            ((C0907b) this.f5586b).m2547l(c0912g);
            workDatabase_Impl.m16399v();
        } finally {
            workDatabase_Impl.m16395r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: Exception -> 0x005b, SimStateException -> 0x005e, TryCatch #3 {SimStateException -> 0x005e, Exception -> 0x005b, blocks: (B:21:0x0056, B:59:0x00e5, B:26:0x0061, B:39:0x008c, B:41:0x0091, B:45:0x009a, B:47:0x00a2, B:50:0x00ab, B:51:0x00c6, B:36:0x007e), top: B:73:0x0034, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2632l(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0914i.m2632l(ww.c):java.lang.Object");
    }

    /* renamed from: n */
    public void m2633n(int i10, String str) throws DataNotFoundException {
        Context context = (Context) this.f5588d;
        try {
            Object systemService = context.getSystemService("telecom");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
            List<PhoneAccountHandle> callCapablePhoneAccounts = ((TelecomManager) systemService).getCallCapablePhoneAccounts();
            Intent flags = new Intent("android.intent.action.CALL").setFlags(268435456);
            AbstractC4154l.m8922e(flags, "setFlags(...)");
            flags.setData(Uri.parse("tel:".concat(str)));
            flags.putExtra("com.android.phone.force.slot", true);
            flags.putExtra("Cdma_Supp", true);
            if (i10 == -1) {
                m2624d(flags);
                return;
            }
            Iterator it = pe.m10834i("extra_asus_dial_use_dualsim", "com.android.phone.extra.slot", "slot", "simslot", "sim_slot", "subscription", "Subscription", "phone", "com.android.phone.DialingMode", "simSlot", "slot_id", "simId", "simnum", "phone_type", "slotId", "slotIdx", "call_card", "dial_mode", "original_slot_id", "originalSlot").iterator();
            while (it.hasNext()) {
                flags.putExtra((String) it.next(), i10);
            }
            if (callCapablePhoneAccounts == null || callCapablePhoneAccounts.size() < i10) {
                throw new DataNotFoundException(f9.m11628b(context, R.string.something_went_wrong));
            }
            try {
                AbstractC4154l.m8920c(flags.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", callCapablePhoneAccounts.get(i10)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            m2624d(flags);
        } catch (Exception e10) {
            e10.printStackTrace();
            throw new DataNotFoundException(f9.m11628b(context, R.string.something_went_wrong));
        }
    }

    /* renamed from: o */
    public InterfaceC1298n m2634o(C0919n c0919n, y3... y3VarArr) {
        InterfaceC1298n interfaceC1298nM10927c = InterfaceC1298n.f6309i;
        for (y3 y3Var : y3VarArr) {
            interfaceC1298nM10927c = ta.m10927c(y3Var);
            sa.m10902o((C0919n) this.f5587c);
            if ((interfaceC1298nM10927c instanceof C1299o) || (interfaceC1298nM10927c instanceof C1297m)) {
                interfaceC1298nM10927c = ((C1304t) this.f5585a).m3666c(c0919n, interfaceC1298nM10927c);
            }
        }
        return interfaceC1298nM10927c;
    }

    public C0914i(j4 j4Var, y5 userSIMRepository, AbstractC8662f abstractC8662f, Context context) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f5585a = j4Var;
        this.f5586b = userSIMRepository;
        this.f5587c = abstractC8662f;
        this.f5588d = context;
    }

    public C0914i(b1 store, y0 factory, AbstractC2538c defaultExtras) {
        AbstractC4154l.m8923f(store, "store");
        AbstractC4154l.m8923f(factory, "factory");
        AbstractC4154l.m8923f(defaultExtras, "defaultExtras");
        this.f5585a = store;
        this.f5586b = factory;
        this.f5587c = defaultExtras;
        this.f5588d = new C3180c();
    }

    public C0914i(l0 cameraRepository, C0001a cameraCoordinator, e0 useCaseConfigFactory, C0908c streamSpecsCalculator) {
        AbstractC4154l.m8923f(cameraRepository, "cameraRepository");
        AbstractC4154l.m8923f(cameraCoordinator, "cameraCoordinator");
        AbstractC4154l.m8923f(useCaseConfigFactory, "useCaseConfigFactory");
        AbstractC4154l.m8923f(streamSpecsCalculator, "streamSpecsCalculator");
        this.f5585a = cameraRepository;
        this.f5586b = cameraCoordinator;
        this.f5587c = useCaseConfigFactory;
        this.f5588d = streamSpecsCalculator;
    }
}
