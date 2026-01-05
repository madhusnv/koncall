package wj;

import an.f1;
import an.h3;
import an.i1;
import an.u0;
import an.u1;
import an.y0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import ap.C0390c;
import com.google.android.gms.internal.measurement.p8;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import cs.EnumC1501t;
import ex.InterfaceC2139c;
import fn.C2336i;
import gn.x2;
import h1.AbstractC2785p;
import h1.InterfaceC2786q;
import h1.InterfaceC2795z;
import h1.c2;
import hn.C2987d;
import i0.m0;
import im.n0;
import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import js.C3846b;
import js.C3850f;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import mn.C4814k;
import og.pe;
import om.C5419u;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.a1;
import rw.AbstractC6663m;
import sf.AbstractC6840z;
import u2.C7320q;
import ug.d1;
import ug.f0;
import ug.n1;
import ug.v0;
import ww.AbstractC8193c;
import xm.C8418z;
import xm.r3;
import xm.y5;
import yv.C8800o;
import yv.C8805t;
import zj.C8986c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.p */
/* loaded from: classes.dex */
public final class C8090p implements c2 {

    /* renamed from: e */
    public static C8090p f38722e;

    /* renamed from: a */
    public Object f38723a;

    /* renamed from: b */
    public Object f38724b;

    /* renamed from: c */
    public Object f38725c;

    /* renamed from: d */
    public Object f38726d;

    public C8090p(d1 d1Var, String str) {
        this.f38726d = d1Var;
        AbstractC6840z.m13033d(str);
        this.f38723a = str;
        this.f38724b = new Bundle();
    }

    /* renamed from: t */
    public static synchronized C8090p m15225t() {
        try {
            if (f38722e == null) {
                C8090p c8090p = new C8090p();
                c8090p.f38723a = null;
                c8090p.f38724b = null;
                c8090p.f38725c = null;
                c8090p.f38726d = new ArrayDeque();
                f38722e = c8090p;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38722e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15226A(java.lang.String r9, java.util.List r10, int r11, int r12, ww.AbstractC8193c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof xm.C8401i
            if (r0 == 0) goto L14
            r0 = r13
            xm.i r0 = (xm.C8401i) r0
            int r1 = r0.f40398h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40398h = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.i r0 = new xm.i
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f40396f
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40398h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r12 = r7.f40395e
            int r11 = r7.f40394d
            java.util.List r10 = r7.f40393c
            java.lang.String r9 = r7.f40392b
            gn.x2 r1 = r7.f40391a
            og.od.m10798c(r13)
        L41:
            r3 = r10
            r5 = r11
            r6 = r12
            goto L64
        L45:
            og.od.m10798c(r13)
            java.lang.Object r13 = r8.f38723a
            r1 = r13
            gn.x2 r1 = (gn.x2) r1
            java.lang.Object r13 = r8.f38725c
            xm.z r13 = (xm.C8418z) r13
            r7.f40391a = r1
            r7.f40392b = r9
            r7.f40393c = r10
            r7.f40394d = r11
            r7.f40395e = r12
            r7.f40398h = r3
            java.lang.Object r13 = r13.m15711a(r7)
            if (r13 != r0) goto L41
            goto L7e
        L64:
            java.lang.Number r13 = (java.lang.Number) r13
            int r4 = r13.intValue()
            r10 = 0
            r7.f40391a = r10
            r7.f40392b = r10
            r7.f40393c = r10
            r7.f40394d = r5
            r7.f40395e = r6
            r7.f40398h = r2
            r2 = r9
            java.lang.Object r9 = r1.m6666L(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L7f
        L7e:
            return r0
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15226A(java.lang.String, java.util.List, int, int, ww.c):java.lang.Object");
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        if (((AbstractC2785p) this.f38724b) == null) {
            this.f38724b = abstractC2785p.mo6833c();
        }
        AbstractC2785p abstractC2785p4 = (AbstractC2785p) this.f38724b;
        if (abstractC2785p4 == null) {
            AbstractC4154l.m8928k("valueVector");
            throw null;
        }
        int iMo6832b = abstractC2785p4.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p5 = (AbstractC2785p) this.f38724b;
            if (abstractC2785p5 == null) {
                AbstractC4154l.m8928k("valueVector");
                throw null;
            }
            abstractC2785p5.mo6835e(((InterfaceC2786q) this.f38723a).get(i10).mo6770e(abstractC2785p.mo6831a(i10), abstractC2785p2.mo6831a(i10), abstractC2785p3.mo6831a(i10), j6), i10);
        }
        AbstractC2785p abstractC2785p6 = (AbstractC2785p) this.f38724b;
        if (abstractC2785p6 != null) {
            return abstractC2785p6;
        }
        AbstractC4154l.m8928k("valueVector");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15227C(int r17, int r18, java.lang.String r19, j$.time.LocalDateTime r20, j$.time.LocalDateTime r21, java.util.List r22, ww.AbstractC8193c r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15227C(int, int, java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15228D(ww.AbstractC8193c r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r11 instanceof xm.C8403k
            if (r1 == 0) goto L17
            r1 = r11
            xm.k r1 = (xm.C8403k) r1
            int r2 = r1.f40472d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40472d = r2
            goto L1c
        L17:
            xm.k r1 = new xm.k
            r1.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r1.f40470b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40472d
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            long r1 = r1.f40469a
            og.od.m10798c(r11)
            goto L55
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            og.od.m10798c(r11)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "DataStore - getStartDate START"
            r0.m16232g(r4, r11)
            java.lang.Object r11 = r10.f38724b
            fn.i r11 = (fn.C2336i) r11
            r1.f40469a = r6
            r1.f40472d = r5
            java.lang.String r3 = "dashboard_startDate"
            java.lang.Object r11 = r11.m6024d(r3, r1)
            if (r11 != r2) goto L54
            return r2
        L54:
            r1 = r6
        L55:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            java.lang.String r11 = yv.C8789d.m16160g(r5, r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DataStore - getStartDate SUCCESS, Duration: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.m16232g(r4, r11)
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15228D(ww.c):java.lang.Object");
    }

    /* renamed from: E */
    public Object m15229E(LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC8994d enumC8994d, boolean z6, List list, String str, AbstractC8193c abstractC8193c) {
        return ((x2) this.f38723a).m6669O(localDateTime, localDateTime2, enumC8994d, z6, list, str, abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15230F(java.lang.String r23, j$.time.LocalDateTime r24, j$.time.LocalDateTime r25, java.util.List r26, ww.AbstractC8193c r27, boolean r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r27
            r2 = r28
            boolean r3 = r1 instanceof xm.C8404l
            if (r3 == 0) goto L19
            r3 = r1
            xm.l r3 = (xm.C8404l) r3
            int r4 = r3.f40509k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f40509k = r4
            goto L1e
        L19:
            xm.l r3 = new xm.l
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.f40507h
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f40509k
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L53
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            og.od.m10798c(r1)
            return r1
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            boolean r2 = r3.f40506g
            boolean r5 = r3.f40505f
            java.util.List r7 = r3.f40504e
            java.lang.String r8 = r3.f40503d
            j$.time.LocalDateTime r9 = r3.f40502c
            j$.time.LocalDateTime r10 = r3.f40501b
            gn.x2 r11 = r3.f40500a
            og.od.m10798c(r1)
            r17 = r2
            r2 = r5
            r18 = r7
            r16 = r8
            r15 = r9
            r14 = r10
            goto L86
        L53:
            og.od.m10798c(r1)
            java.lang.Object r1 = r0.f38723a
            r11 = r1
            gn.x2 r11 = (gn.x2) r11
            java.lang.Object r1 = r0.f38725c
            xm.z r1 = (xm.C8418z) r1
            r3.f40500a = r11
            r5 = r24
            r3.f40501b = r5
            r8 = r25
            r3.f40502c = r8
            r9 = r23
            r3.f40503d = r9
            r10 = r26
            r3.f40504e = r10
            r3.f40505f = r2
            r3.f40506g = r2
            r3.f40509k = r7
            java.lang.Object r1 = r1.m15711a(r3)
            if (r1 != r4) goto L7e
            goto Lae
        L7e:
            r17 = r2
            r14 = r5
            r15 = r8
            r16 = r9
            r18 = r10
        L86:
            java.lang.Number r1 = (java.lang.Number) r1
            int r19 = r1.intValue()
            r1 = 0
            r3.f40500a = r1
            r3.f40501b = r1
            r3.f40502c = r1
            r3.f40503d = r1
            r3.f40504e = r1
            r3.f40505f = r2
            r3.f40509k = r6
            an.u r13 = r11.f14942b
            z7.w r1 = r13.f1411a
            an.t r12 = new an.t
            r20 = 0
            r21 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = og.pe.m10838m(r1, r12, r3)
            if (r1 != r4) goto Laf
        Lae:
            return r4
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15230F(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    @Override // h1.z1
    /* renamed from: G */
    public AbstractC2785p mo6884G(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        if (((AbstractC2785p) this.f38726d) == null) {
            this.f38726d = abstractC2785p3.mo6833c();
        }
        AbstractC2785p abstractC2785p4 = (AbstractC2785p) this.f38726d;
        if (abstractC2785p4 == null) {
            AbstractC4154l.m8928k("endVelocityVector");
            throw null;
        }
        int iMo6832b = abstractC2785p4.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p5 = (AbstractC2785p) this.f38726d;
            if (abstractC2785p5 == null) {
                AbstractC4154l.m8928k("endVelocityVector");
                throw null;
            }
            abstractC2785p5.mo6835e(((InterfaceC2786q) this.f38723a).get(i10).mo6769d(abstractC2785p.mo6831a(i10), abstractC2785p2.mo6831a(i10), abstractC2785p3.mo6831a(i10)), i10);
        }
        AbstractC2785p abstractC2785p6 = (AbstractC2785p) this.f38726d;
        if (abstractC2785p6 != null) {
            return abstractC2785p6;
        }
        AbstractC4154l.m8928k("endVelocityVector");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15231H(java.lang.String r10, j$.time.LocalDateTime r11, j$.time.LocalDateTime r12, java.util.List r13, ww.AbstractC8193c r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof xm.C8405m
            if (r0 == 0) goto L14
            r0 = r14
            xm.m r0 = (xm.C8405m) r0
            int r1 = r0.f40556k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40556k = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.m r0 = new xm.m
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f40554h
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40556k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            boolean r15 = r7.f40553g
            boolean r10 = r7.f40552f
            j$.time.LocalDateTime r12 = r7.f40551e
            j$.time.LocalDateTime r11 = r7.f40550d
            gn.x2 r13 = r7.f40549c
            java.lang.String r1 = r7.f40548b
            java.util.List r3 = r7.f40547a
            og.od.m10798c(r14)
            r8 = r15
            r6 = r3
            r15 = r10
            r3 = r1
            r1 = r13
        L4a:
            r4 = r11
            r5 = r12
            goto L76
        L4d:
            og.od.m10798c(r14)
            java.lang.Object r14 = r9.f38723a
            gn.x2 r14 = (gn.x2) r14
            java.lang.Object r1 = r9.f38725c
            xm.z r1 = (xm.C8418z) r1
            r7.f40547a = r13
            r7.f40548b = r10
            r7.f40549c = r14
            r7.f40550d = r11
            r7.f40551e = r12
            r7.f40552f = r15
            r7.f40553g = r15
            r7.f40556k = r3
            java.lang.Object r1 = r1.m15711a(r7)
            if (r1 != r0) goto L6f
            goto L92
        L6f:
            r3 = r1
            r1 = r14
            r14 = r3
            r3 = r10
            r6 = r13
            r8 = r15
            goto L4a
        L76:
            java.lang.Number r14 = (java.lang.Number) r14
            int r10 = r14.intValue()
            r11 = 0
            r7.f40547a = r11
            r7.f40548b = r11
            r7.f40549c = r11
            r7.f40550d = r11
            r7.f40551e = r11
            r7.f40552f = r15
            r7.f40556k = r2
            r2 = r10
            java.lang.Object r10 = r1.m6674T(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L93
        L92:
            return r0
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15231H(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15232I(tq.EnumC7204p r10, ww.AbstractC8193c r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fo.C2358v
            if (r0 == 0) goto L13
            r0 = r11
            fo.v r0 = (fo.C2358v) r0
            int r1 = r0.f10730e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10730e = r1
            goto L18
        L13:
            fo.v r0 = new fo.v
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f10728c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10730e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            og.od.m10798c(r11)
            goto L97
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.util.List r10 = r0.f10727b
            og.od.m10798c(r11)
            goto L62
        L3c:
            tq.p r10 = r0.f10726a
            og.od.m10798c(r11)
            goto L50
        L42:
            og.od.m10798c(r11)
            r0.f10726a = r10
            r0.f10730e = r5
            java.lang.Object r11 = r9.m15258l(r10, r0)
            if (r11 != r1) goto L50
            goto L96
        L50:
            java.util.List r11 = (java.util.List) r11
            r0.f10726a = r6
            r0.f10727b = r11
            r0.f10730e = r4
            java.lang.Object r10 = r9.m15257k(r10, r0)
            if (r10 != r1) goto L5f
            goto L96
        L5f:
            r8 = r11
            r11 = r10
            r10 = r8
        L62:
            mm.m r11 = (mm.C4802m) r11
            if (r11 != 0) goto L78
            java.lang.Object r10 = r9.f38726d
            yv.t r10 = (yv.C8805t) r10
            java.lang.String r11 = "AddLead"
            java.lang.String r0 = "getTotalDueLead:- selectedSIM:= null , not found"
            r10.m16232g(r11, r0)
            java.lang.Integer r10 = new java.lang.Integer
            r11 = 0
            r10.<init>(r11)
            return r10
        L78:
            java.lang.Object r2 = r9.f38725c
            xm.r3 r2 = (xm.r3) r2
            com.websoptimization.callyzerbiz.data.model.request.TotalDueLeadRequest r4 = new com.websoptimization.callyzerbiz.data.model.request.TotalDueLeadRequest
            j$.time.LocalDate r5 = j$.time.LocalDate.now()
            java.lang.String r7 = "now(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r7)
            r4.<init>(r5, r10, r11)
            r0.f10726a = r6
            r0.f10727b = r6
            r0.f10730e = r3
            java.lang.Object r11 = r2.m15612k(r4, r0)
            if (r11 != r1) goto L97
        L96:
            return r1
        L97:
            im.k1 r11 = (im.k1) r11
            boolean r10 = r11 instanceof im.g1
            if (r10 == 0) goto L9e
            goto Lb6
        L9e:
            boolean r10 = r11 instanceof im.h1
            if (r10 == 0) goto La3
            goto Lb6
        La3:
            boolean r10 = r11 instanceof im.i1
            if (r10 == 0) goto Lae
            im.i1 r11 = (im.i1) r11
            java.lang.Object r10 = r11.f17561a
            java.lang.Integer r10 = (java.lang.Integer) r10
            return r10
        Lae:
            im.j1 r10 = im.j1.f17563a
            boolean r10 = kotlin.jvm.internal.AbstractC4154l.m8918a(r11, r10)
            if (r10 == 0) goto Lb7
        Lb6:
            return r6
        Lb7:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15232I(tq.p, ww.c):java.lang.Object");
    }

    /* renamed from: J */
    public Object m15233J(final LocalDateTime localDateTime, final LocalDateTime localDateTime2, String str, boolean z6, boolean z10, boolean z11, final boolean z12, boolean z13, List list, final int i10, final int i11, final int i12, AbstractC8193c abstractC8193c) {
        h3 h3Var = ((x2) this.f38723a).f14941a;
        if (z6) {
            if (z13 && str.length() > 0) {
                return h3Var.m485k(i12, i10, i11, str, localDateTime, localDateTime2, list, abstractC8193c, z12);
            }
            if (z13 && str.length() == 0) {
                return h3Var.m486l(localDateTime, localDateTime2, list, i12, z12, i10, i11, abstractC8193c);
            }
            if (!z13 && str.length() > 0) {
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new i1(localDateTime, localDateTime2, i12, str, z12, i10, i11, 2));
            }
            final int i13 = 1;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.m2
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i14 = i13;
                    int i15 = i11;
                    int i16 = i10;
                    boolean z14 = z12;
                    int i17 = i12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i14) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            interfaceC4026cY0.mo1778g(3, i17);
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, j6);
                            interfaceC4026cY0.mo1778g(6, i16);
                            interfaceC4026cY0.mo1778g(7, i15);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            interfaceC4026cY02.mo1778g(3, i17);
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, j10);
                            interfaceC4026cY02.mo1778g(6, i16);
                            interfaceC4026cY02.mo1778g(7, i15);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            interfaceC4026cY03.mo1778g(3, i17);
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, j11);
                            interfaceC4026cY03.mo1778g(6, i16);
                            interfaceC4026cY03.mo1778g(7, i15);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        if (z10) {
            if (z13 && str.length() > 0) {
                StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND sim_number = ? AND phone_number NOT IN (");
                int iM14323c = a1.m14323c(list, sbM14338r, ") GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ");
                a1.m14319B(sbM14338r, "?", " = 0 THEN name END COLLATE NOCASE DESC LIMIT ", "?", " OFFSET ");
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new f1(m0.m7381n(sbM14338r, "?", "toString(...)"), localDateTime, localDateTime2, i12, str, list, iM14323c, z12, i10, i11, 2));
            }
            if (z13 && str.length() == 0) {
                StringBuilder sbM14338r2 = a1.m14338r(h3Var, "SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND phone_number NOT IN (");
                int iM14323c2 = a1.m14323c(list, sbM14338r2, ") GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ");
                a1.m14319B(sbM14338r2, "?", " = 0 THEN name END COLLATE NOCASE DESC LIMIT ", "?", " OFFSET ");
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new u0(m0.m7381n(sbM14338r2, "?", "toString(...)"), localDateTime, localDateTime2, i12, list, iM14323c2, z12, i10, i11, 0));
            }
            if (!z13 && str.length() > 0) {
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new i1(localDateTime, localDateTime2, i12, str, z12, i10, i11, 1));
            }
            final int i14 = 2;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.m2
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i142 = i14;
                    int i15 = i11;
                    int i16 = i10;
                    boolean z14 = z12;
                    int i17 = i12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i142) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            interfaceC4026cY0.mo1778g(3, i17);
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, j6);
                            interfaceC4026cY0.mo1778g(6, i16);
                            interfaceC4026cY0.mo1778g(7, i15);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            interfaceC4026cY02.mo1778g(3, i17);
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, j10);
                            interfaceC4026cY02.mo1778g(6, i16);
                            interfaceC4026cY02.mo1778g(7, i15);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            interfaceC4026cY03.mo1778g(3, i17);
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, j11);
                            interfaceC4026cY03.mo1778g(6, i16);
                            interfaceC4026cY03.mo1778g(7, i15);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        if (!z11) {
            if (z13 && str.length() > 0) {
                return h3Var.m485k(i12, i10, i11, str, localDateTime, localDateTime2, list, abstractC8193c, z12);
            }
            if (z13 && str.length() == 0) {
                return h3Var.m486l(localDateTime, localDateTime2, list, i12, z12, i10, i11, abstractC8193c);
            }
            if (!z13 && str.length() > 0) {
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new i1(localDateTime, localDateTime2, i12, str, z12, i10, i11, 2));
            }
            final int i15 = 1;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.m2
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i142 = i15;
                    int i152 = i11;
                    int i16 = i10;
                    boolean z14 = z12;
                    int i17 = i12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i142) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            interfaceC4026cY0.mo1778g(3, i17);
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, j6);
                            interfaceC4026cY0.mo1778g(6, i16);
                            interfaceC4026cY0.mo1778g(7, i152);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            interfaceC4026cY02.mo1778g(3, i17);
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, j10);
                            interfaceC4026cY02.mo1778g(6, i16);
                            interfaceC4026cY02.mo1778g(7, i152);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            interfaceC4026cY03.mo1778g(3, i17);
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, j11);
                            interfaceC4026cY03.mo1778g(6, i16);
                            interfaceC4026cY03.mo1778g(7, i152);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        if (z13 && str.length() > 0) {
            StringBuilder sbM14338r3 = a1.m14338r(h3Var, "SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND phone_number NOT IN (");
            int iM14323c3 = a1.m14323c(list, sbM14338r3, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r3, "?", " AND duration > ", "?", " GROUP BY phone_number ORDER BY CASE WHEN ");
            a1.m14319B(sbM14338r3, "?", " = 1 THEN count END ASC, CASE WHEN ", "?", " = 0 THEN count END DESC LIMIT ");
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new f1(iM14323c3, i12, i10, i11, a1.m14336p(sbM14338r3, "?", " OFFSET ", "?", "toString(...)"), str, localDateTime, localDateTime2, list, z12));
        }
        if (!z13 || str.length() != 0) {
            if (!z13 && str.length() > 0) {
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new i1(i12, i10, i11, str, localDateTime, localDateTime2, z12));
            }
            final int i16 = 0;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.m2
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i142 = i16;
                    int i152 = i11;
                    int i162 = i10;
                    boolean z14 = z12;
                    int i17 = i12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i142) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            interfaceC4026cY0.mo1778g(3, i17);
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, j6);
                            interfaceC4026cY0.mo1778g(6, i162);
                            interfaceC4026cY0.mo1778g(7, i152);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            interfaceC4026cY02.mo1778g(3, i17);
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, j10);
                            interfaceC4026cY02.mo1778g(6, i162);
                            interfaceC4026cY02.mo1778g(7, i152);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            interfaceC4026cY03.mo1778g(3, i17);
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, j11);
                            interfaceC4026cY03.mo1778g(6, i162);
                            interfaceC4026cY03.mo1778g(7, i152);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        StringBuilder sbM14338r4 = a1.m14338r(h3Var, "SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE phone_number NOT IN (");
        int iM14323c4 = a1.m14323c(list, sbM14338r4, ") AND date_time BETWEEN ", "?", " AND ");
        a1.m14319B(sbM14338r4, "?", " AND duration > ", "?", " GROUP BY phone_number ORDER BY CASE WHEN ");
        a1.m14319B(sbM14338r4, "?", " = 1 THEN count END ASC, CASE WHEN ", "?", " = 0 THEN count END DESC LIMIT ");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new u0(iM14323c4, i12, i10, i11, a1.m14336p(sbM14338r4, "?", " OFFSET ", "?", "toString(...)"), localDateTime, localDateTime2, list, z12));
    }

    /* renamed from: K */
    public boolean m15234K(Context context) {
        if (((Boolean) this.f38725c) == null) {
            this.f38725c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f38724b).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f38725c).booleanValue();
    }

    /* renamed from: L */
    public boolean m15235L(Context context) {
        if (((Boolean) this.f38724b) == null) {
            this.f38724b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f38724b).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f38724b).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15236M(java.lang.String r10, j$.time.LocalDateTime r11, j$.time.LocalDateTime r12, java.util.List r13, ww.AbstractC8193c r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof xm.C8406n
            if (r0 == 0) goto L14
            r0 = r14
            xm.n r0 = (xm.C8406n) r0
            int r1 = r0.f40599k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40599k = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.n r0 = new xm.n
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f40597h
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40599k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            boolean r15 = r7.f40596g
            boolean r10 = r7.f40595f
            java.lang.String r11 = r7.f40594e
            j$.time.LocalDateTime r12 = r7.f40593d
            j$.time.LocalDateTime r13 = r7.f40592c
            gn.x2 r1 = r7.f40591b
            java.util.List r3 = r7.f40590a
            og.od.m10798c(r14)
            r4 = r13
            r8 = r15
            r6 = r3
            r15 = r10
            r3 = r11
        L4a:
            r5 = r12
            goto L74
        L4c:
            og.od.m10798c(r14)
            java.lang.Object r14 = r9.f38723a
            r1 = r14
            gn.x2 r1 = (gn.x2) r1
            java.lang.Object r14 = r9.f38725c
            xm.z r14 = (xm.C8418z) r14
            r7.f40590a = r13
            r7.f40591b = r1
            r7.f40592c = r11
            r7.f40593d = r12
            r7.f40594e = r10
            r7.f40595f = r15
            r7.f40596g = r15
            r7.f40599k = r3
            java.lang.Object r14 = r14.m15711a(r7)
            if (r14 != r0) goto L6f
            goto L90
        L6f:
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r15
            goto L4a
        L74:
            java.lang.Number r14 = (java.lang.Number) r14
            int r10 = r14.intValue()
            r11 = 0
            r7.f40590a = r11
            r7.f40591b = r11
            r7.f40592c = r11
            r7.f40593d = r11
            r7.f40594e = r11
            r7.f40595f = r15
            r7.f40599k = r2
            r2 = r10
            java.lang.Object r10 = r1.o0(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L91
        L90:
            return r0
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15236M(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15237O(java.lang.String r10, j$.time.LocalDateTime r11, j$.time.LocalDateTime r12, java.util.List r13, ww.AbstractC8193c r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof xm.C8407o
            if (r0 == 0) goto L14
            r0 = r14
            xm.o r0 = (xm.C8407o) r0
            int r1 = r0.f40643k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40643k = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.o r0 = new xm.o
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f40641h
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40643k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            boolean r15 = r7.f40640g
            boolean r10 = r7.f40639f
            java.lang.String r11 = r7.f40638e
            j$.time.LocalDateTime r12 = r7.f40637d
            j$.time.LocalDateTime r13 = r7.f40636c
            gn.x2 r1 = r7.f40635b
            java.util.List r3 = r7.f40634a
            og.od.m10798c(r14)
            r4 = r13
            r8 = r15
            r6 = r3
            r15 = r10
            r3 = r11
        L4a:
            r5 = r12
            goto L74
        L4c:
            og.od.m10798c(r14)
            java.lang.Object r14 = r9.f38723a
            r1 = r14
            gn.x2 r1 = (gn.x2) r1
            java.lang.Object r14 = r9.f38725c
            xm.z r14 = (xm.C8418z) r14
            r7.f40634a = r13
            r7.f40635b = r1
            r7.f40636c = r11
            r7.f40637d = r12
            r7.f40638e = r10
            r7.f40639f = r15
            r7.f40640g = r15
            r7.f40643k = r3
            java.lang.Object r14 = r14.m15711a(r7)
            if (r14 != r0) goto L6f
            goto L90
        L6f:
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r15
            goto L4a
        L74:
            java.lang.Number r14 = (java.lang.Number) r14
            int r10 = r14.intValue()
            r11 = 0
            r7.f40634a = r11
            r7.f40635b = r11
            r7.f40636c = r11
            r7.f40637d = r11
            r7.f40638e = r11
            r7.f40639f = r15
            r7.f40643k = r2
            r2 = r10
            java.lang.Object r10 = r1.p0(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L91
        L90:
            return r0
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15237O(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [dy.a] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15238P(ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o6.v0
            if (r0 == 0) goto L13
            r0 = r8
            o6.v0 r0 = (o6.v0) r0
            int r1 = r0.f26180e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26180e = r1
            goto L18
        L13:
            o6.v0 r0 = new o6.v0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f26178c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26180e
            r3 = 2
            r4 = 1
            qw.a0 r5 = qw.a0.f30746a
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            dy.a r1 = r0.f26177b
            wj.p r0 = r0.f26176a
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L31
            goto L81
        L31:
            r8 = move-exception
            goto L8f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            dy.a r2 = r0.f26177b
            wj.p r4 = r0.f26176a
            og.od.m10798c(r8)
            r8 = r2
            goto L64
        L44:
            og.od.m10798c(r8)
            java.lang.Object r8 = r7.f38724b
            tx.q r8 = (tx.C7257q) r8
            boolean r8 = r8.m13556O()
            if (r8 == 0) goto L52
            return r5
        L52:
            java.lang.Object r8 = r7.f38723a
            dy.c r8 = (dy.C1855c) r8
            r0.f26176a = r7
            r0.f26177b = r8
            r0.f26180e = r4
            java.lang.Object r2 = r8.mo1768h(r0)
            if (r2 != r1) goto L63
            goto L7e
        L63:
            r4 = r7
        L64:
            java.lang.Object r2 = r4.f38724b     // Catch: java.lang.Throwable -> L8c
            tx.q r2 = (tx.C7257q) r2     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.m13556O()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L72
            r8.mo1769j(r6)
            return r5
        L72:
            r0.f26176a = r4     // Catch: java.lang.Throwable -> L8c
            r0.f26177b = r8     // Catch: java.lang.Throwable -> L8c
            r0.f26180e = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r4.m15251e(r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r1 = r8
            r0 = r4
        L81:
            java.lang.Object r8 = r0.f38724b     // Catch: java.lang.Throwable -> L31
            tx.q r8 = (tx.C7257q) r8     // Catch: java.lang.Throwable -> L31
            r8.m13558R(r5)     // Catch: java.lang.Throwable -> L31
            r1.mo1769j(r6)
            return r5
        L8c:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L8f:
            r1.mo1769j(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15238P(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15239Q(java.lang.String r22, java.lang.String r23, java.lang.String r24, j$.time.LocalDateTime r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33, ww.AbstractC8193c r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15239Q(java.lang.String, java.lang.String, java.lang.String, j$.time.LocalDateTime, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15240R(java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r10 instanceof xm.C8408p
            if (r1 == 0) goto L17
            r1 = r10
            xm.p r1 = (xm.C8408p) r1
            int r2 = r1.f40682e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40682e = r2
            goto L1c
        L17:
            xm.p r1 = new xm.p
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.f40680c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40682e
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L39
            if (r3 != r5) goto L31
            long r2 = r1.f40679b
            java.lang.String r9 = r1.f40678a
            og.od.m10798c(r10)
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            og.od.m10798c(r10)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "DataStore - setDateFilterTitle START - Period: '"
            r10.<init>(r3)
            r10.append(r9)
            java.lang.String r3 = "'"
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r0.m16232g(r4, r10)
            java.lang.Object r10 = r8.f38724b
            fn.i r10 = (fn.C2336i) r10
            r1.f40678a = r9
            r1.f40679b = r6
            r1.f40682e = r5
            java.lang.String r3 = "dashboard_period"
            java.lang.Object r10 = r10.m6034n(r3, r9, r1)
            if (r10 != r2) goto L69
            return r2
        L69:
            r2 = r6
        L6a:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            java.lang.String r10 = yv.C8789d.m16160g(r5, r6)
            java.lang.String r1 = "DataStore - setDateFilterTitle SUCCESS - Period: '"
            java.lang.String r2 = "', Duration: "
            java.lang.String r9 = a2.AbstractC0030c.m121l(r1, r9, r2, r10)
            r0.m16232g(r4, r9)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15240R(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15241S(long r9, ww.AbstractC8193c r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r11 instanceof xm.C8409q
            if (r1 == 0) goto L17
            r1 = r11
            xm.q r1 = (xm.C8409q) r1
            int r2 = r1.f40722d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40722d = r2
            goto L1c
        L17:
            xm.q r1 = new xm.q
            r1.<init>(r8, r11)
        L1c:
            java.lang.Object r11 = r1.f40720b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40722d
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            long r9 = r1.f40719a
            og.od.m10798c(r11)
            goto L61
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            og.od.m10798c(r11)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r3 = "DataStore - setEndDate START - Date: "
            r11.<init>(r3)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r0.m16232g(r4, r11)
            java.lang.Object r11 = r8.f38724b
            fn.i r11 = (fn.C2336i) r11
            r1.f40719a = r6
            r1.f40722d = r5
            java.lang.String r3 = "dashboard_endDate"
            java.lang.Object r9 = r11.m6033m(r3, r9, r1)
            if (r9 != r2) goto L60
            return r2
        L60:
            r9 = r6
        L61:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r9
            java.lang.String r9 = yv.C8789d.m16160g(r5, r1)
            java.lang.String r10 = "DataStore - setEndDate SUCCESS, Duration: "
            p020v.a1.m14346z(r10, r9, r0, r4)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15241S(long, ww.c):java.lang.Object");
    }

    /* renamed from: T */
    public void m15242T(n0 n0Var) {
        r3.f40781l.m15398j(n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15243U(long r9, ww.AbstractC8193c r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r11 instanceof xm.C8410r
            if (r1 == 0) goto L17
            r1 = r11
            xm.r r1 = (xm.C8410r) r1
            int r2 = r1.f40763d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40763d = r2
            goto L1c
        L17:
            xm.r r1 = new xm.r
            r1.<init>(r8, r11)
        L1c:
            java.lang.Object r11 = r1.f40761b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40763d
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            long r9 = r1.f40760a
            og.od.m10798c(r11)
            goto L61
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            og.od.m10798c(r11)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r3 = "DataStore - setStartDate START - Date: "
            r11.<init>(r3)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r0.m16232g(r4, r11)
            java.lang.Object r11 = r8.f38724b
            fn.i r11 = (fn.C2336i) r11
            r1.f40760a = r6
            r1.f40763d = r5
            java.lang.String r3 = "dashboard_startDate"
            java.lang.Object r9 = r11.m6033m(r3, r9, r1)
            if (r9 != r2) goto L60
            return r2
        L60:
            r9 = r6
        L61:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r9
            java.lang.String r9 = yv.C8789d.m16160g(r5, r1)
            java.lang.String r10 = "DataStore - setStartDate SUCCESS, Duration: "
            p020v.a1.m14346z(r10, r9, r0, r4)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15243U(long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15244V(java.util.List r34, ww.AbstractC8193c r35) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15244V(java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: X */
    public List m15245X(List leadList, String str, String str2, String str3, String str4, boolean z6, LocalDateTime localDateTime, EnumC1501t leadScreenType) {
        Object next;
        String str5;
        C3846b c3846b;
        LastCallDetails lastCallDetailsM4903a;
        LastCallDetails lastCallDetails;
        LastCallDetails lastCallDetails2;
        C8805t c8805t = (C8805t) this.f38726d;
        AbstractC4154l.m8923f(leadList, "leadList");
        AbstractC4154l.m8923f(leadScreenType, "leadScreenType");
        Iterator it = leadList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4154l.m8918a(((C3850f) next).f19811a, str)) {
                break;
            }
        }
        C3850f c3850f = (C3850f) next;
        if (c3850f == null) {
            return null;
        }
        C7320q c7320q = new C7320q();
        c7320q.addAll(leadList);
        int iIndexOf = leadList.indexOf(c3850f);
        if (iIndexOf != -1) {
            try {
                if (!((C3850f) c7320q.get(iIndexOf)).f19819i.isEmpty()) {
                    C3846b c3846b2 = ((C3850f) c7320q.get(iIndexOf)).f19826p;
                    LocalDateTime localDateTimeM4904b = (c3846b2 == null || (lastCallDetails2 = c3846b2.f19803a) == null) ? null : lastCallDetails2.m4904b();
                    AbstractC4154l.m8920c(localDateTimeM4904b);
                    if (localDateTimeM4904b.compareTo((ChronoLocalDateTime<?>) localDateTime) <= 0) {
                        if (z6) {
                            c7320q.remove(iIndexOf);
                            return c7320q.m13701r().f34901c;
                        }
                        C3850f c3850f2 = (C3850f) leadList.get(iIndexOf);
                        if (((C3850f) leadList.get(iIndexOf)).f19826p != null) {
                            C3846b c3846b3 = ((C3850f) leadList.get(iIndexOf)).f19826p;
                            if (c3846b3 == null || (lastCallDetails = c3846b3.f19803a) == null) {
                                str5 = str2;
                                lastCallDetailsM4903a = null;
                            } else {
                                str5 = str2;
                                lastCallDetailsM4903a = LastCallDetails.m4903a(lastCallDetails, str5);
                            }
                            c3846b = new C3846b(lastCallDetailsM4903a);
                        } else {
                            str5 = str2;
                            c3846b = null;
                        }
                        C8800o c8800o = C8800o.f42459a;
                        c7320q.set(iIndexOf, C3850f.m8399a(c3850f2, null, null, 0, null, null, str3, str4, 0, C8800o.m16182F(System.currentTimeMillis()), null, c3846b, null, str5, false, 350719));
                        return leadScreenType == EnumC1501t.SCHEDULED_LEAD ? AbstractC6663m.m12760X(c7320q.m13701r().f34901c, new C0390c(11)) : c7320q.m13701r().f34901c;
                    }
                }
            } catch (Exception e2) {
                c8805t.m16234i("Lead Not Updated", e2);
                return null;
            }
        }
        c8805t.m16232g("Lead Not Updated", "Index: " + iIndexOf + ", LeadList Size: " + leadList.size());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle m15246Y() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15246Y():android.os.Bundle");
    }

    /* renamed from: Z */
    public void m15247Z(Bundle bundle) {
        String str = (String) this.f38723a;
        d1 d1Var = (d1) this.f38726d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesM13861Q = d1Var.m13861Q();
        n1 n1Var = (n1) d1Var.f482a;
        SharedPreferences.Editor editorEdit = sharedPreferencesM13861Q.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        p8.m3595a();
                        if (n1Var.f35667d.m13889W(null, f0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var = n1Var.f35669f;
                                n1.m14085m(v0Var);
                                v0Var.f35862f.m14141b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var2 = n1Var.f35669f;
                                n1.m14085m(v0Var2);
                                v0Var2.f35862f.m14141b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        v0 v0Var3 = n1Var.f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35862f.m14141b(e2, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f38725c = bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15248a(java.lang.String r10, j$.time.LocalDateTime r11, j$.time.LocalDateTime r12, java.util.List r13, ww.AbstractC8193c r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof xm.C8393a
            if (r0 == 0) goto L14
            r0 = r14
            xm.a r0 = (xm.C8393a) r0
            int r1 = r0.f40095k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40095k = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.a r0 = new xm.a
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f40093h
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40095k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            boolean r15 = r7.f40092g
            boolean r10 = r7.f40091f
            java.lang.String r11 = r7.f40090e
            j$.time.LocalDateTime r12 = r7.f40089d
            j$.time.LocalDateTime r13 = r7.f40088c
            gn.x2 r1 = r7.f40087b
            java.util.List r3 = r7.f40086a
            og.od.m10798c(r14)
            r4 = r13
            r8 = r15
            r6 = r3
            r15 = r10
            r3 = r11
        L4a:
            r5 = r12
            goto L74
        L4c:
            og.od.m10798c(r14)
            java.lang.Object r14 = r9.f38723a
            r1 = r14
            gn.x2 r1 = (gn.x2) r1
            java.lang.Object r14 = r9.f38725c
            xm.z r14 = (xm.C8418z) r14
            r7.f40086a = r13
            r7.f40087b = r1
            r7.f40088c = r11
            r7.f40089d = r12
            r7.f40090e = r10
            r7.f40091f = r15
            r7.f40092g = r15
            r7.f40095k = r3
            java.lang.Object r14 = r14.m15711a(r7)
            if (r14 != r0) goto L6f
            goto L90
        L6f:
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r15
            goto L4a
        L74:
            java.lang.Number r14 = (java.lang.Number) r14
            int r10 = r14.intValue()
            r11 = 0
            r7.f40086a = r11
            r7.f40087b = r11
            r7.f40088c = r11
            r7.f40089d = r11
            r7.f40090e = r11
            r7.f40091f = r15
            r7.f40095k = r2
            r2 = r10
            java.lang.Object r10 = r1.m6684d(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L91
        L90:
            return r0
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15248a(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15249c(java.util.List r33, j$.time.LocalDateTime r34, j$.time.LocalDateTime r35, java.lang.String r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, java.util.List r42, int r43, int r44, ww.AbstractC8193c r45) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15249c(java.util.List, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.util.List, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r0 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (r2.m15634s(r0, "", r4) == r5) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0107 -> B:51:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011f -> B:51:0x0122). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15250d(ww.AbstractC8193c r17) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15250d(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15251e(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f38726d
            o6.w r0 = (o6.C5321w) r0
            boolean r1 = r7 instanceof o6.C5305g
            if (r1 == 0) goto L17
            r1 = r7
            o6.g r1 = (o6.C5305g) r1
            int r2 = r1.f26045d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f26045d = r2
            goto L1c
        L17:
            o6.g r1 = new o6.g
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f26043b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f26045d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            wj.p r0 = r1.f26042a
            og.od.m10798c(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            wj.p r0 = r1.f26042a
            og.od.m10798c(r7)
            goto L74
        L3e:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f38725c
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            o6.j0 r7 = r0.m10462g()
            o6.j r3 = new o6.j
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.f26042a = r6
            r1.f26045d = r4
            java.lang.Object r7 = r7.mo10440a(r3, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            o6.d r7 = (o6.C5302d) r7
            goto L76
        L67:
            r1.f26042a = r6
            r1.f26045d = r5
            r7 = 0
            java.lang.Object r7 = o6.C5321w.m10461f(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            o6.d r7 = (o6.C5302d) r7
        L76:
            java.lang.Object r0 = r0.f38726d
            o6.w r0 = (o6.C5321w) r0
            o6.x r0 = r0.f26188h
            r0.m10469d(r7)
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15251e(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15252f(uw.InterfaceC7559c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xm.C8395c
            if (r0 == 0) goto L13
            r0 = r6
            xm.c r0 = (xm.C8395c) r0
            int r1 = r0.f40185c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40185c = r1
            goto L18
        L13:
            xm.c r0 = new xm.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40183a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40185c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r5.f38723a
            gn.x2 r6 = (gn.x2) r6
            r0.f40185c = r3
            an.h3 r6 = r6.f14941a
            z7.w r6 = r6.f899a
            ad.h r2 = new ad.h
            r4 = 11
            r2.<init>(r4)
            r4 = 0
            java.lang.Object r6 = og.pe.m10839n(r0, r6, r3, r4, r2)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            j$.time.LocalDateTime r6 = (j$.time.LocalDateTime) r6
            if (r6 != 0) goto L58
            j$.time.LocalDateTime r6 = j$.time.LocalDateTime.now()
            java.lang.String r0 = "now(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r0)
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15252f(uw.c):java.lang.Object");
    }

    /* renamed from: g */
    public Object m15253g(List list, final boolean z6, final LocalDateTime localDateTime, final LocalDateTime localDateTime2, boolean z10, final String str, final List list2, boolean z11, final int i10, final int i11, AbstractC8193c abstractC8193c) {
        ArrayList arrayListM10835j = pe.m10835j(EnumC8994d.INCOMING, EnumC8994d.OUTGOING, EnumC8994d.MISSED, EnumC8994d.REJECTED);
        x2 x2Var = (x2) this.f38723a;
        final List list3 = list.isEmpty() ? arrayListM10835j : list;
        h3 h3Var = x2Var.f14941a;
        if (z11) {
            if (z10 && str.length() > 0) {
                StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
                final int iM14321a = a1.m14321a(") AND phone_number NOT IN (", sbM14338r, list3);
                final int iM14323c = a1.m14323c(list2, sbM14338r, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
                a1.m14319B(sbM14338r, "?", " = 0 THEN duration END DESC LIMIT ", "?", " OFFSET ");
                final String strM7381n = m0.m7381n(sbM14338r, "?", "toString(...)");
                final int i12 = 1;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.o2
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Removed duplicated region for block: B:183:0x0323 A[Catch: all -> 0x01e5, LOOP:5: B:131:0x0258->B:183:0x0323, LOOP_END, TryCatch #1 {all -> 0x01e5, blocks: (B:99:0x01bf, B:100:0x01c7, B:102:0x01cd, B:104:0x01d5, B:107:0x01e1, B:111:0x01f0, B:110:0x01e8, B:112:0x01f3, B:113:0x01fa, B:115:0x0200, B:116:0x020c, B:118:0x020f, B:121:0x0219, B:123:0x0220, B:125:0x0225, B:128:0x022f, B:130:0x0236, B:131:0x0258, B:133:0x025e, B:138:0x027e, B:143:0x0294, B:148:0x02a7, B:151:0x02b4, B:156:0x02cb, B:183:0x0323, B:184:0x033a, B:185:0x0341, B:178:0x0313, B:180:0x031a, B:173:0x0302, B:175:0x0309, B:168:0x02f1, B:170:0x02f8, B:162:0x02df, B:164:0x02e5, B:159:0x02d3, B:155:0x02c0, B:186:0x0342, B:187:0x0349, B:146:0x02a1, B:142:0x0288, B:137:0x0277, B:129:0x0233, B:122:0x021d), top: B:193:0x01bf }] */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x019c A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:207:0x033a A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x0183 A[Catch: all -> 0x0054, LOOP:2: B:37:0x00c5->B:89:0x0183, LOOP_END, TryCatch #0 {all -> 0x0054, blocks: (B:5:0x002e, B:6:0x0036, B:8:0x003c, B:10:0x0044, B:13:0x0050, B:17:0x005f, B:16:0x0057, B:18:0x0062, B:19:0x0069, B:21:0x006f, B:22:0x007b, B:24:0x007e, B:27:0x0088, B:29:0x008f, B:31:0x0094, B:34:0x009e, B:36:0x00a5, B:37:0x00c5, B:39:0x00cb, B:44:0x00f0, B:49:0x0106, B:54:0x0114, B:57:0x0121, B:62:0x0139, B:89:0x0183, B:90:0x019c, B:91:0x01a3, B:84:0x0175, B:86:0x017c, B:79:0x0168, B:81:0x016f, B:74:0x015b, B:76:0x0162, B:68:0x014d, B:70:0x0153, B:65:0x0141, B:61:0x012e, B:92:0x01a4, B:93:0x01ab, B:52:0x010e, B:48:0x00ff, B:43:0x00e4, B:35:0x00a2, B:28:0x008c), top: B:192:0x002e }] */
                    @Override // ex.InterfaceC2139c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r29) throws java.lang.Exception {
                        /*
                            Method dump skipped, instructions count: 856
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: an.o2.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            if (z10 && str.length() == 0) {
                StringBuilder sbM14338r2 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
                final int iM14321a2 = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r2, list3);
                final int iM14323c2 = a1.m14323c(list2, sbM14338r2, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r2, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
                a1.m14319B(sbM14338r2, "?", " = 0 THEN duration END DESC LIMIT ", "?", " OFFSET ");
                final String strM7381n2 = m0.m7381n(sbM14338r2, "?", "toString(...)");
                final int i13 = 1;
                final List list4 = list3;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.z0
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Removed duplicated region for block: B:183:0x031f A[Catch: all -> 0x01de, LOOP:5: B:131:0x0251->B:183:0x031f, LOOP_END, TryCatch #0 {all -> 0x01de, blocks: (B:99:0x01bb, B:100:0x01c0, B:102:0x01c6, B:104:0x01ce, B:107:0x01da, B:111:0x01e9, B:110:0x01e1, B:112:0x01ec, B:113:0x01f3, B:115:0x01f9, B:116:0x0205, B:118:0x0208, B:121:0x0212, B:123:0x0219, B:125:0x021e, B:128:0x0228, B:130:0x022f, B:131:0x0251, B:133:0x0257, B:138:0x0278, B:143:0x0286, B:146:0x0293, B:151:0x02aa, B:156:0x02c5, B:183:0x031f, B:184:0x0336, B:185:0x033d, B:178:0x030f, B:180:0x0316, B:173:0x02fe, B:175:0x0305, B:168:0x02ed, B:170:0x02f4, B:162:0x02da, B:164:0x02e1, B:159:0x02cd, B:155:0x02ba, B:150:0x029e, B:186:0x033e, B:187:0x0345, B:141:0x0280, B:137:0x0271, B:129:0x022c, B:122:0x0216), top: B:192:0x01bb }] */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x0198 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:207:0x0336 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x017f A[Catch: all -> 0x004e, LOOP:2: B:37:0x00bf->B:89:0x017f, LOOP_END, TryCatch #1 {all -> 0x004e, blocks: (B:5:0x002b, B:6:0x0030, B:8:0x0036, B:10:0x003e, B:13:0x004a, B:17:0x0059, B:16:0x0051, B:18:0x005c, B:19:0x0063, B:21:0x0069, B:22:0x0075, B:24:0x0078, B:27:0x0082, B:29:0x0089, B:31:0x008e, B:34:0x0098, B:36:0x009f, B:37:0x00bf, B:39:0x00c5, B:44:0x00eb, B:49:0x0102, B:54:0x0110, B:57:0x011d, B:62:0x0134, B:89:0x017f, B:90:0x0198, B:91:0x019f, B:84:0x0171, B:86:0x0178, B:79:0x0164, B:81:0x016b, B:74:0x0157, B:76:0x015e, B:68:0x0148, B:70:0x014f, B:65:0x013c, B:61:0x0129, B:92:0x01a0, B:93:0x01a7, B:52:0x010a, B:48:0x00fb, B:43:0x00df, B:35:0x009c, B:28:0x0086), top: B:193:0x002b }] */
                    @Override // ex.InterfaceC2139c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r29) throws java.lang.Exception {
                        /*
                            Method dump skipped, instructions count: 852
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: an.z0.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            if (str.length() > 0) {
                StringBuilder sbM14338r3 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
                int iM14323c3 = a1.m14323c(list3, sbM14338r3, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r3, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
                a1.m14319B(sbM14338r3, "?", " = 0 THEN duration END DESC LIMIT ", "?", " OFFSET ");
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new y0(iM14323c3, i10, i11, 1, m0.m7381n(sbM14338r3, "?", "toString(...)"), str, localDateTime, localDateTime2, list3, z6));
            }
            StringBuilder sbM14338r4 = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,slot,sim_number,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
            int iM14323c4 = a1.m14323c(list3, sbM14338r4, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r4, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
            a1.m14319B(sbM14338r4, "?", " = 0 THEN duration END DESC LIMIT ", "?", " OFFSET ");
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.v0(iM14323c4, i10, i11, 2, m0.m7381n(sbM14338r4, "?", "toString(...)"), localDateTime, localDateTime2, list3, z6));
        }
        if (z10 && str.length() > 0) {
            StringBuilder sbM14338r5 = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,slot,sim_number,date_time,duration,call_type,slot,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
            final int iM14321a3 = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r5, list3);
            final int iM14323c5 = a1.m14323c(list2, sbM14338r5, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r5, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
            a1.m14319B(sbM14338r5, "?", " = 0 THEN date_time END DESC LIMIT ", "?", " OFFSET ");
            final String strM7381n3 = m0.m7381n(sbM14338r5, "?", "toString(...)");
            final int i14 = 0;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.o2
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object v10) throws Exception {
                    /*
                        Method dump skipped, instructions count: 856
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: an.o2.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
        if (z10 && str.length() == 0) {
            StringBuilder sbM14338r6 = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,date_time,slot,sim_number,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
            final int iM14321a4 = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r6, list3);
            final int iM14323c6 = a1.m14323c(list2, sbM14338r6, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r6, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
            a1.m14319B(sbM14338r6, "?", " = 0 THEN date_time END DESC LIMIT ", "?", " OFFSET ");
            final String strM7381n4 = m0.m7381n(sbM14338r6, "?", "toString(...)");
            final int i15 = 0;
            final List list5 = list3;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.z0
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object v10) throws Exception {
                    /*
                        Method dump skipped, instructions count: 852
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: an.z0.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
        if (str.length() > 0) {
            StringBuilder sbM14338r7 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
            int iM14323c7 = a1.m14323c(list3, sbM14338r7, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r7, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
            a1.m14319B(sbM14338r7, "?", " = 0 THEN date_time END DESC LIMIT ", "?", " OFFSET ");
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new y0(iM14323c7, i10, i11, 0, m0.m7381n(sbM14338r7, "?", "toString(...)"), str, localDateTime, localDateTime2, list3, z6));
        }
        StringBuilder sbM14338r8 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
        int iM14323c8 = a1.m14323c(list3, sbM14338r8, ") AND date_time BETWEEN ", "?", " AND ");
        a1.m14319B(sbM14338r8, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
        a1.m14319B(sbM14338r8, "?", " = 0 THEN date_time END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.v0(iM14323c8, i10, i11, 1, m0.m7381n(sbM14338r8, "?", "toString(...)"), localDateTime, localDateTime2, list3, z6));
    }

    /* renamed from: h */
    public Object m15254h(List list, final boolean z6, final LocalDateTime localDateTime, final LocalDateTime localDateTime2, boolean z10, final String str, final List list2, boolean z11, C4814k c4814k) {
        ArrayList arrayListM10835j = pe.m10835j(EnumC8994d.INCOMING, EnumC8994d.OUTGOING, EnumC8994d.MISSED, EnumC8994d.REJECTED);
        x2 x2Var = (x2) this.f38723a;
        final List list3 = list.isEmpty() ? arrayListM10835j : list;
        h3 h3Var = x2Var.f14941a;
        if (!z11) {
            final List list4 = list3;
            if (z10 && str.length() > 0) {
                StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,slot,sim_number,date_time,duration,call_type,slot,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
                final int iM14321a = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r, list4);
                final int iM14323c = a1.m14323c(list2, sbM14338r, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
                final String strM11241l = AbstractC5601a.m11241l(sbM14338r, "?", " = 0 THEN date_time END DESC", "toString(...)");
                final int i10 = 0;
                return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.t0
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Removed duplicated region for block: B:183:0x0303 A[Catch: all -> 0x01d3, LOOP:5: B:131:0x0238->B:183:0x0303, LOOP_END, TryCatch #0 {all -> 0x01d3, blocks: (B:99:0x01ad, B:100:0x01b5, B:102:0x01bb, B:104:0x01c3, B:107:0x01cf, B:111:0x01de, B:110:0x01d6, B:112:0x01e1, B:113:0x01e8, B:115:0x01ee, B:116:0x01fa, B:118:0x01fd, B:121:0x0207, B:123:0x020e, B:125:0x0213, B:128:0x021d, B:130:0x0224, B:131:0x0238, B:133:0x023e, B:138:0x025e, B:143:0x0274, B:148:0x0287, B:151:0x0294, B:156:0x02ab, B:183:0x0303, B:184:0x031a, B:185:0x031f, B:178:0x02f3, B:180:0x02fa, B:173:0x02e2, B:175:0x02e9, B:168:0x02d1, B:170:0x02d8, B:162:0x02bf, B:164:0x02c5, B:159:0x02b3, B:155:0x02a0, B:186:0x0320, B:187:0x0325, B:146:0x0281, B:142:0x0268, B:137:0x0257, B:129:0x0221, B:122:0x020b), top: B:192:0x01ad }] */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x018e A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:207:0x031a A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x0175 A[Catch: all -> 0x0054, LOOP:2: B:37:0x00b7->B:89:0x0175, LOOP_END, TryCatch #1 {all -> 0x0054, blocks: (B:5:0x002e, B:6:0x0036, B:8:0x003c, B:10:0x0044, B:13:0x0050, B:17:0x005f, B:16:0x0057, B:18:0x0062, B:19:0x0069, B:21:0x006f, B:22:0x007b, B:24:0x007e, B:27:0x0088, B:29:0x008f, B:31:0x0094, B:34:0x009e, B:36:0x00a5, B:37:0x00b7, B:39:0x00bd, B:44:0x00e2, B:49:0x00f9, B:54:0x0107, B:57:0x0114, B:62:0x012b, B:89:0x0175, B:90:0x018e, B:91:0x0193, B:84:0x0167, B:86:0x016e, B:79:0x015a, B:81:0x0161, B:74:0x014d, B:76:0x0154, B:68:0x013f, B:70:0x0145, B:65:0x0133, B:61:0x0120, B:92:0x0194, B:93:0x0199, B:52:0x0101, B:48:0x00f2, B:43:0x00d6, B:35:0x00a2, B:28:0x008c), top: B:193:0x002e }] */
                    @Override // ex.InterfaceC2139c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r29) throws java.lang.Exception {
                        /*
                            Method dump skipped, instructions count: 820
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: an.t0.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            if (z10 && str.length() == 0) {
                StringBuilder sbM14338r2 = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,date_time,slot,sim_number,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
                final int iM14321a2 = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r2, list4);
                final int iM14323c2 = a1.m14323c(list2, sbM14338r2, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r2, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
                final String strM11241l2 = AbstractC5601a.m11241l(sbM14338r2, "?", " = 0 THEN date_time END DESC", "toString(...)");
                final int i11 = 1;
                return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.y1
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Removed duplicated region for block: B:183:0x02ff A[Catch: all -> 0x01cc, LOOP:5: B:131:0x0231->B:183:0x02ff, LOOP_END, TryCatch #0 {all -> 0x01cc, blocks: (B:99:0x01a9, B:100:0x01ae, B:102:0x01b4, B:104:0x01bc, B:107:0x01c8, B:111:0x01d7, B:110:0x01cf, B:112:0x01da, B:113:0x01e1, B:115:0x01e7, B:116:0x01f3, B:118:0x01f6, B:121:0x0200, B:123:0x0207, B:125:0x020c, B:128:0x0216, B:130:0x021d, B:131:0x0231, B:133:0x0237, B:138:0x025d, B:143:0x0273, B:148:0x0281, B:151:0x028e, B:156:0x02a5, B:183:0x02ff, B:184:0x0316, B:185:0x031b, B:178:0x02ef, B:180:0x02f6, B:173:0x02de, B:175:0x02e5, B:168:0x02cd, B:170:0x02d4, B:162:0x02ba, B:164:0x02c1, B:159:0x02ad, B:155:0x029a, B:186:0x031c, B:187:0x0321, B:146:0x027b, B:142:0x026c, B:137:0x0251, B:129:0x021a, B:122:0x0204), top: B:192:0x01a9 }] */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x018a A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:207:0x0316 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x0171 A[Catch: all -> 0x004e, LOOP:2: B:37:0x00b1->B:89:0x0171, LOOP_END, TryCatch #1 {all -> 0x004e, blocks: (B:5:0x002b, B:6:0x0030, B:8:0x0036, B:10:0x003e, B:13:0x004a, B:17:0x0059, B:16:0x0051, B:18:0x005c, B:19:0x0063, B:21:0x0069, B:22:0x0075, B:24:0x0078, B:27:0x0082, B:29:0x0089, B:31:0x008e, B:34:0x0098, B:36:0x009f, B:37:0x00b1, B:39:0x00b7, B:44:0x00d9, B:49:0x00e7, B:52:0x00f4, B:57:0x010b, B:62:0x0126, B:89:0x0171, B:90:0x018a, B:91:0x018f, B:84:0x0163, B:86:0x016a, B:79:0x0156, B:81:0x015d, B:74:0x0149, B:76:0x0150, B:68:0x013a, B:70:0x0141, B:65:0x012e, B:61:0x011b, B:56:0x00ff, B:92:0x0190, B:93:0x0195, B:47:0x00e1, B:43:0x00d2, B:35:0x009c, B:28:0x0086), top: B:193:0x002b }] */
                    @Override // ex.InterfaceC2139c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r29) throws java.lang.Exception {
                        /*
                            Method dump skipped, instructions count: 816
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: an.y1.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            if (str.length() <= 0) {
                StringBuilder sbM14338r3 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
                int iM14323c3 = a1.m14323c(list4, sbM14338r3, ") AND date_time BETWEEN ", "?", " AND ");
                a1.m14319B(sbM14338r3, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
                return pe.m10839n(c4814k, h3Var.f899a, true, false, new u1(AbstractC5601a.m11241l(sbM14338r3, "?", " = 0 THEN date_time END DESC", "toString(...)"), list4, iM14323c3, localDateTime, localDateTime2, z6, 0));
            }
            StringBuilder sbM14338r4 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
            final int iM14323c4 = a1.m14323c(list4, sbM14338r4, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r4, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN date_time END ASC, CASE WHEN ");
            final String strM11241l3 = AbstractC5601a.m11241l(sbM14338r4, "?", " = 0 THEN date_time END DESC", "toString(...)");
            final int i12 = 0;
            return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.n2
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:175:0x02b9 A[Catch: all -> 0x01b2, LOOP:3: B:123:0x01fc->B:175:0x02b9, LOOP_END, TryCatch #0 {all -> 0x01b2, blocks: (B:95:0x018c, B:96:0x0194, B:98:0x019a, B:100:0x01a2, B:103:0x01ae, B:107:0x01bd, B:106:0x01b5, B:108:0x01c0, B:110:0x01c4, B:113:0x01ce, B:115:0x01d5, B:117:0x01d9, B:120:0x01e3, B:122:0x01ea, B:123:0x01fc, B:125:0x0202, B:130:0x0225, B:135:0x023b, B:140:0x0249, B:143:0x0256, B:148:0x026d, B:175:0x02b9, B:176:0x02d0, B:177:0x02d5, B:170:0x02a9, B:172:0x02b0, B:165:0x029c, B:167:0x02a2, B:160:0x0290, B:162:0x0296, B:154:0x0281, B:156:0x0287, B:151:0x0275, B:147:0x0262, B:178:0x02d6, B:179:0x02db, B:138:0x0243, B:134:0x0234, B:129:0x0219, B:121:0x01e7, B:114:0x01d2), top: B:184:0x018c }] */
                /* JADX WARN: Removed duplicated region for block: B:191:0x016d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:196:0x02d0 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0154 A[Catch: all -> 0x0052, LOOP:1: B:33:0x009a->B:85:0x0154, LOOP_END, TryCatch #1 {all -> 0x0052, blocks: (B:5:0x002c, B:6:0x0034, B:8:0x003a, B:10:0x0042, B:13:0x004e, B:17:0x005d, B:16:0x0055, B:18:0x0060, B:20:0x0064, B:23:0x006e, B:25:0x0075, B:27:0x0079, B:30:0x0083, B:32:0x008a, B:33:0x009a, B:35:0x00a0, B:40:0x00c3, B:45:0x00da, B:50:0x00e8, B:53:0x00f5, B:58:0x010c, B:85:0x0154, B:86:0x016d, B:87:0x0172, B:80:0x0146, B:82:0x014d, B:75:0x013a, B:77:0x0140, B:70:0x012e, B:72:0x0134, B:64:0x0120, B:66:0x0126, B:61:0x0114, B:57:0x0101, B:88:0x0173, B:89:0x0178, B:48:0x00e2, B:44:0x00d3, B:39:0x00b7, B:31:0x0087, B:24:0x0072), top: B:185:0x002c }] */
                @Override // ex.InterfaceC2139c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r29) throws java.lang.Exception {
                    /*
                        Method dump skipped, instructions count: 746
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: an.n2.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
        if (z10 && str.length() > 0) {
            StringBuilder sbM14338r5 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
            final int iM14321a3 = a1.m14321a(") AND phone_number NOT IN (", sbM14338r5, list3);
            final int iM14323c5 = a1.m14323c(list2, sbM14338r5, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r5, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
            final String strM11241l4 = AbstractC5601a.m11241l(sbM14338r5, "?", " = 0 THEN duration END DESC", "toString(...)");
            final int i13 = 1;
            final List list5 = list3;
            return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.t0
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object v10) throws Exception {
                    /*
                        Method dump skipped, instructions count: 820
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: an.t0.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
        if (z10 && str.length() == 0) {
            StringBuilder sbM14338r6 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
            final int iM14321a4 = a1.m14321a(")  AND phone_number NOT IN (", sbM14338r6, list3);
            final int iM14323c6 = a1.m14323c(list2, sbM14338r6, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r6, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
            final String strM11241l5 = AbstractC5601a.m11241l(sbM14338r6, "?", " = 0 THEN duration END DESC", "toString(...)");
            final int i14 = 0;
            return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.y1
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object v10) throws Exception {
                    /*
                        Method dump skipped, instructions count: 816
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: an.y1.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
        if (str.length() <= 0) {
            List list6 = list3;
            StringBuilder sbM14338r7 = a1.m14338r(h3Var, "SELECT id,name,phone_number,notes,slot,sim_number,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE call_type IN (");
            int iM14323c7 = a1.m14323c(list6, sbM14338r7, ") AND date_time BETWEEN ", "?", " AND ");
            a1.m14319B(sbM14338r7, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
            return pe.m10839n(c4814k, h3Var.f899a, true, false, new u1(AbstractC5601a.m11241l(sbM14338r7, "?", " = 0 THEN duration END DESC", "toString(...)"), list6, iM14323c7, localDateTime, localDateTime2, z6, 1));
        }
        StringBuilder sbM14338r8 = a1.m14338r(h3Var, "SELECT id,name,phone_number,slot,sim_number,notes,date_time,duration,call_type,country_code FROM ViewCallLogContactUserSim WHERE sim_number = ? AND call_type IN (");
        final int iM14323c8 = a1.m14323c(list3, sbM14338r8, ") AND date_time BETWEEN ", "?", " AND ");
        a1.m14319B(sbM14338r8, "?", " ORDER BY CASE WHEN ", "?", " = 1 THEN duration END ASC, CASE WHEN ");
        final String strM11241l6 = AbstractC5601a.m11241l(sbM14338r8, "?", " = 0 THEN duration END DESC", "toString(...)");
        final int i15 = 1;
        final List list7 = list3;
        return pe.m10839n(c4814k, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.n2
            @Override // ex.InterfaceC2139c
            public final Object invoke(Object v10) throws Exception {
                /*
                    Method dump skipped, instructions count: 746
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: an.n2.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    /* renamed from: i */
    public Object m15255i(final LocalDateTime localDateTime, final LocalDateTime localDateTime2, final String str, boolean z6, boolean z10, boolean z11, final boolean z12, boolean z13, List list, final int i10, final int i11, AbstractC8193c abstractC8193c) {
        h3 h3Var = ((x2) this.f38723a).f14941a;
        if (z6) {
            if (z13 && str.length() > 0) {
                return h3Var.m481g(i10, i11, str, localDateTime, localDateTime2, list, abstractC8193c, z12);
            }
            if (z13 && str.length() == 0) {
                return h3Var.m482h(localDateTime, localDateTime2, list, i10, i11, z12, abstractC8193c);
            }
            if (str.length() > 0) {
                final int i12 = 1;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.d1
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) throws Exception {
                        String strM16212u;
                        String strM16212u2;
                        String strM16212u3;
                        String strM16212u4;
                        String strM16212u5;
                        String strM16212u6;
                        int i13 = i12;
                        int i14 = i11;
                        int i15 = i10;
                        boolean z14 = z12;
                        LocalDateTime localDateTime3 = localDateTime2;
                        LocalDateTime localDateTime4 = localDateTime;
                        String str2 = str;
                        switch (i13) {
                            case 0:
                                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection, "_connection");
                                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY0.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o = C8800o.f42459a;
                                        strM16212u = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u = null;
                                    }
                                    if (strM16212u == null) {
                                        interfaceC4026cY0.mo1779i(2);
                                    } else {
                                        interfaceC4026cY0.mo1776B(2, strM16212u);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o2 = C8800o.f42459a;
                                        strM16212u2 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u2 = null;
                                    }
                                    if (strM16212u2 == null) {
                                        interfaceC4026cY0.mo1779i(3);
                                    } else {
                                        interfaceC4026cY0.mo1776B(3, strM16212u2);
                                    }
                                    long j6 = z14 ? 1L : 0L;
                                    interfaceC4026cY0.mo1778g(4, j6);
                                    interfaceC4026cY0.mo1778g(5, j6);
                                    interfaceC4026cY0.mo1778g(6, i15);
                                    interfaceC4026cY0.mo1778g(7, i14);
                                    ArrayList arrayList = new ArrayList();
                                    while (interfaceC4026cY0.r0()) {
                                        arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                                    }
                                    interfaceC4026cY0.close();
                                    return arrayList;
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            case 1:
                                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection2, "_connection");
                                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY02.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o3 = C8800o.f42459a;
                                        strM16212u3 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u3 = null;
                                    }
                                    if (strM16212u3 == null) {
                                        interfaceC4026cY02.mo1779i(2);
                                    } else {
                                        interfaceC4026cY02.mo1776B(2, strM16212u3);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o4 = C8800o.f42459a;
                                        strM16212u4 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u4 = null;
                                    }
                                    if (strM16212u4 == null) {
                                        interfaceC4026cY02.mo1779i(3);
                                    } else {
                                        interfaceC4026cY02.mo1776B(3, strM16212u4);
                                    }
                                    long j10 = z14 ? 1L : 0L;
                                    interfaceC4026cY02.mo1778g(4, j10);
                                    interfaceC4026cY02.mo1778g(5, j10);
                                    interfaceC4026cY02.mo1778g(6, i15);
                                    interfaceC4026cY02.mo1778g(7, i14);
                                    ArrayList arrayList2 = new ArrayList();
                                    while (interfaceC4026cY02.r0()) {
                                        arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                                    }
                                    interfaceC4026cY02.close();
                                    return arrayList2;
                                } finally {
                                }
                            default:
                                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection3, "_connection");
                                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY03.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o5 = C8800o.f42459a;
                                        strM16212u5 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u5 = null;
                                    }
                                    if (strM16212u5 == null) {
                                        interfaceC4026cY03.mo1779i(2);
                                    } else {
                                        interfaceC4026cY03.mo1776B(2, strM16212u5);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o6 = C8800o.f42459a;
                                        strM16212u6 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u6 = null;
                                    }
                                    if (strM16212u6 == null) {
                                        interfaceC4026cY03.mo1779i(3);
                                    } else {
                                        interfaceC4026cY03.mo1776B(3, strM16212u6);
                                    }
                                    long j11 = z14 ? 1L : 0L;
                                    interfaceC4026cY03.mo1778g(4, j11);
                                    interfaceC4026cY03.mo1778g(5, j11);
                                    interfaceC4026cY03.mo1778g(6, i15);
                                    interfaceC4026cY03.mo1778g(7, i14);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (interfaceC4026cY03.r0()) {
                                        arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                                    }
                                    interfaceC4026cY03.close();
                                    return arrayList3;
                                } finally {
                                }
                        }
                    }
                });
            }
            final int i13 = 0;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.x0
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i14 = i13;
                    int i15 = i11;
                    int i16 = i10;
                    boolean z14 = z12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i14) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(3, j6);
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, i16);
                            interfaceC4026cY0.mo1778g(6, i15);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(5) ? null : Long.valueOf(interfaceC4026cY0.getLong(5))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(3, j10);
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, i16);
                            interfaceC4026cY02.mo1778g(6, i15);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(5) ? null : Long.valueOf(interfaceC4026cY02.getLong(5))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(3, j11);
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, i16);
                            interfaceC4026cY03.mo1778g(6, i15);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(5) ? null : Long.valueOf(interfaceC4026cY03.getLong(5))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        if (z10) {
            if (z13 && str.length() > 0) {
                StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND phone_number NOT IN (");
                int iM14323c = a1.m14323c(list, sbM14338r, ") AND date_time BETWEEN ", "?", " AND  ");
                a1.m14319B(sbM14338r, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ");
                a1.m14319B(sbM14338r, "?", " = 0 THEN name END COLLATE NOCASE DESC LIMIT ", "?", " OFFSET ");
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new y0(iM14323c, i10, i11, 4, m0.m7381n(sbM14338r, "?", "toString(...)"), str, localDateTime, localDateTime2, list, z12));
            }
            if (!z13 || str.length() != 0) {
                if (str.length() > 0) {
                    final int i14 = 0;
                    return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.d1
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) throws Exception {
                            String strM16212u;
                            String strM16212u2;
                            String strM16212u3;
                            String strM16212u4;
                            String strM16212u5;
                            String strM16212u6;
                            int i132 = i14;
                            int i142 = i11;
                            int i15 = i10;
                            boolean z14 = z12;
                            LocalDateTime localDateTime3 = localDateTime2;
                            LocalDateTime localDateTime4 = localDateTime;
                            String str2 = str;
                            switch (i132) {
                                case 0:
                                    InterfaceC4024a _connection = (InterfaceC4024a) obj;
                                    AbstractC4154l.m8923f(_connection, "_connection");
                                    InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                                    try {
                                        interfaceC4026cY0.mo1776B(1, str2);
                                        if (localDateTime4 != null) {
                                            C8800o c8800o = C8800o.f42459a;
                                            strM16212u = C8800o.m16212u(localDateTime4);
                                        } else {
                                            strM16212u = null;
                                        }
                                        if (strM16212u == null) {
                                            interfaceC4026cY0.mo1779i(2);
                                        } else {
                                            interfaceC4026cY0.mo1776B(2, strM16212u);
                                        }
                                        if (localDateTime3 != null) {
                                            C8800o c8800o2 = C8800o.f42459a;
                                            strM16212u2 = C8800o.m16212u(localDateTime3);
                                        } else {
                                            strM16212u2 = null;
                                        }
                                        if (strM16212u2 == null) {
                                            interfaceC4026cY0.mo1779i(3);
                                        } else {
                                            interfaceC4026cY0.mo1776B(3, strM16212u2);
                                        }
                                        long j6 = z14 ? 1L : 0L;
                                        interfaceC4026cY0.mo1778g(4, j6);
                                        interfaceC4026cY0.mo1778g(5, j6);
                                        interfaceC4026cY0.mo1778g(6, i15);
                                        interfaceC4026cY0.mo1778g(7, i142);
                                        ArrayList arrayList = new ArrayList();
                                        while (interfaceC4026cY0.r0()) {
                                            arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                                        }
                                        interfaceC4026cY0.close();
                                        return arrayList;
                                    } finally {
                                        interfaceC4026cY0.close();
                                    }
                                case 1:
                                    InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                                    AbstractC4154l.m8923f(_connection2, "_connection");
                                    InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                                    try {
                                        interfaceC4026cY02.mo1776B(1, str2);
                                        if (localDateTime4 != null) {
                                            C8800o c8800o3 = C8800o.f42459a;
                                            strM16212u3 = C8800o.m16212u(localDateTime4);
                                        } else {
                                            strM16212u3 = null;
                                        }
                                        if (strM16212u3 == null) {
                                            interfaceC4026cY02.mo1779i(2);
                                        } else {
                                            interfaceC4026cY02.mo1776B(2, strM16212u3);
                                        }
                                        if (localDateTime3 != null) {
                                            C8800o c8800o4 = C8800o.f42459a;
                                            strM16212u4 = C8800o.m16212u(localDateTime3);
                                        } else {
                                            strM16212u4 = null;
                                        }
                                        if (strM16212u4 == null) {
                                            interfaceC4026cY02.mo1779i(3);
                                        } else {
                                            interfaceC4026cY02.mo1776B(3, strM16212u4);
                                        }
                                        long j10 = z14 ? 1L : 0L;
                                        interfaceC4026cY02.mo1778g(4, j10);
                                        interfaceC4026cY02.mo1778g(5, j10);
                                        interfaceC4026cY02.mo1778g(6, i15);
                                        interfaceC4026cY02.mo1778g(7, i142);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (interfaceC4026cY02.r0()) {
                                            arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                                        }
                                        interfaceC4026cY02.close();
                                        return arrayList2;
                                    } finally {
                                    }
                                default:
                                    InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                                    AbstractC4154l.m8923f(_connection3, "_connection");
                                    InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                                    try {
                                        interfaceC4026cY03.mo1776B(1, str2);
                                        if (localDateTime4 != null) {
                                            C8800o c8800o5 = C8800o.f42459a;
                                            strM16212u5 = C8800o.m16212u(localDateTime4);
                                        } else {
                                            strM16212u5 = null;
                                        }
                                        if (strM16212u5 == null) {
                                            interfaceC4026cY03.mo1779i(2);
                                        } else {
                                            interfaceC4026cY03.mo1776B(2, strM16212u5);
                                        }
                                        if (localDateTime3 != null) {
                                            C8800o c8800o6 = C8800o.f42459a;
                                            strM16212u6 = C8800o.m16212u(localDateTime3);
                                        } else {
                                            strM16212u6 = null;
                                        }
                                        if (strM16212u6 == null) {
                                            interfaceC4026cY03.mo1779i(3);
                                        } else {
                                            interfaceC4026cY03.mo1776B(3, strM16212u6);
                                        }
                                        long j11 = z14 ? 1L : 0L;
                                        interfaceC4026cY03.mo1778g(4, j11);
                                        interfaceC4026cY03.mo1778g(5, j11);
                                        interfaceC4026cY03.mo1778g(6, i15);
                                        interfaceC4026cY03.mo1778g(7, i142);
                                        ArrayList arrayList3 = new ArrayList();
                                        while (interfaceC4026cY03.r0()) {
                                            arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                                        }
                                        interfaceC4026cY03.close();
                                        return arrayList3;
                                    } finally {
                                    }
                            }
                        }
                    });
                }
                final int i15 = 1;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.x0
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) throws Exception {
                        String strM16212u;
                        String strM16212u2;
                        String strM16212u3;
                        String strM16212u4;
                        String strM16212u5;
                        String strM16212u6;
                        int i142 = i15;
                        int i152 = i11;
                        int i16 = i10;
                        boolean z14 = z12;
                        LocalDateTime localDateTime3 = localDateTime2;
                        LocalDateTime localDateTime4 = localDateTime;
                        switch (i142) {
                            case 0:
                                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection, "_connection");
                                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                                if (localDateTime4 != null) {
                                    try {
                                        C8800o c8800o = C8800o.f42459a;
                                        strM16212u = C8800o.m16212u(localDateTime4);
                                    } finally {
                                        interfaceC4026cY0.close();
                                    }
                                } else {
                                    strM16212u = null;
                                }
                                if (strM16212u == null) {
                                    interfaceC4026cY0.mo1779i(1);
                                } else {
                                    interfaceC4026cY0.mo1776B(1, strM16212u);
                                }
                                if (localDateTime3 != null) {
                                    C8800o c8800o2 = C8800o.f42459a;
                                    strM16212u2 = C8800o.m16212u(localDateTime3);
                                } else {
                                    strM16212u2 = null;
                                }
                                if (strM16212u2 == null) {
                                    interfaceC4026cY0.mo1779i(2);
                                } else {
                                    interfaceC4026cY0.mo1776B(2, strM16212u2);
                                }
                                long j6 = z14 ? 1L : 0L;
                                interfaceC4026cY0.mo1778g(3, j6);
                                interfaceC4026cY0.mo1778g(4, j6);
                                interfaceC4026cY0.mo1778g(5, i16);
                                interfaceC4026cY0.mo1778g(6, i152);
                                ArrayList arrayList = new ArrayList();
                                while (interfaceC4026cY0.r0()) {
                                    arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(5) ? null : Long.valueOf(interfaceC4026cY0.getLong(5))));
                                }
                                interfaceC4026cY0.close();
                                return arrayList;
                            case 1:
                                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection2, "_connection");
                                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                                if (localDateTime4 != null) {
                                    try {
                                        C8800o c8800o3 = C8800o.f42459a;
                                        strM16212u3 = C8800o.m16212u(localDateTime4);
                                    } finally {
                                    }
                                } else {
                                    strM16212u3 = null;
                                }
                                if (strM16212u3 == null) {
                                    interfaceC4026cY02.mo1779i(1);
                                } else {
                                    interfaceC4026cY02.mo1776B(1, strM16212u3);
                                }
                                if (localDateTime3 != null) {
                                    C8800o c8800o4 = C8800o.f42459a;
                                    strM16212u4 = C8800o.m16212u(localDateTime3);
                                } else {
                                    strM16212u4 = null;
                                }
                                if (strM16212u4 == null) {
                                    interfaceC4026cY02.mo1779i(2);
                                } else {
                                    interfaceC4026cY02.mo1776B(2, strM16212u4);
                                }
                                long j10 = z14 ? 1L : 0L;
                                interfaceC4026cY02.mo1778g(3, j10);
                                interfaceC4026cY02.mo1778g(4, j10);
                                interfaceC4026cY02.mo1778g(5, i16);
                                interfaceC4026cY02.mo1778g(6, i152);
                                ArrayList arrayList2 = new ArrayList();
                                while (interfaceC4026cY02.r0()) {
                                    arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(5) ? null : Long.valueOf(interfaceC4026cY02.getLong(5))));
                                }
                                interfaceC4026cY02.close();
                                return arrayList2;
                            default:
                                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection3, "_connection");
                                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                                if (localDateTime4 != null) {
                                    try {
                                        C8800o c8800o5 = C8800o.f42459a;
                                        strM16212u5 = C8800o.m16212u(localDateTime4);
                                    } finally {
                                    }
                                } else {
                                    strM16212u5 = null;
                                }
                                if (strM16212u5 == null) {
                                    interfaceC4026cY03.mo1779i(1);
                                } else {
                                    interfaceC4026cY03.mo1776B(1, strM16212u5);
                                }
                                if (localDateTime3 != null) {
                                    C8800o c8800o6 = C8800o.f42459a;
                                    strM16212u6 = C8800o.m16212u(localDateTime3);
                                } else {
                                    strM16212u6 = null;
                                }
                                if (strM16212u6 == null) {
                                    interfaceC4026cY03.mo1779i(2);
                                } else {
                                    interfaceC4026cY03.mo1776B(2, strM16212u6);
                                }
                                long j11 = z14 ? 1L : 0L;
                                interfaceC4026cY03.mo1778g(3, j11);
                                interfaceC4026cY03.mo1778g(4, j11);
                                interfaceC4026cY03.mo1778g(5, i16);
                                interfaceC4026cY03.mo1778g(6, i152);
                                ArrayList arrayList3 = new ArrayList();
                                while (interfaceC4026cY03.r0()) {
                                    arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(5) ? null : Long.valueOf(interfaceC4026cY03.getLong(5))));
                                }
                                interfaceC4026cY03.close();
                                return arrayList3;
                        }
                    }
                });
            }
            StringBuilder sbM14338r2 = a1.m14338r(h3Var, "SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE phone_number NOT IN (");
            int iM14323c2 = a1.m14323c(list, sbM14338r2, ") AND date_time BETWEEN ", "?", " AND  ");
            a1.m14319B(sbM14338r2, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ");
            a1.m14319B(sbM14338r2, "?", " = 0 THEN name END COLLATE NOCASE DESC LIMIT ", "?", " OFFSET ");
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.v0(iM14323c2, i10, i11, 3, m0.m7381n(sbM14338r2, "?", "toString(...)"), localDateTime, localDateTime2, list, z12));
        }
        if (!z11) {
            if (z13 && str.length() > 0) {
                return h3Var.m481g(i10, i11, str, localDateTime, localDateTime2, list, abstractC8193c, z12);
            }
            if (z13 && str.length() == 0) {
                return h3Var.m482h(localDateTime, localDateTime2, list, i10, i11, z12, abstractC8193c);
            }
            if (str.length() > 0) {
                final int i16 = 1;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.d1
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) throws Exception {
                        String strM16212u;
                        String strM16212u2;
                        String strM16212u3;
                        String strM16212u4;
                        String strM16212u5;
                        String strM16212u6;
                        int i132 = i16;
                        int i142 = i11;
                        int i152 = i10;
                        boolean z14 = z12;
                        LocalDateTime localDateTime3 = localDateTime2;
                        LocalDateTime localDateTime4 = localDateTime;
                        String str2 = str;
                        switch (i132) {
                            case 0:
                                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection, "_connection");
                                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY0.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o = C8800o.f42459a;
                                        strM16212u = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u = null;
                                    }
                                    if (strM16212u == null) {
                                        interfaceC4026cY0.mo1779i(2);
                                    } else {
                                        interfaceC4026cY0.mo1776B(2, strM16212u);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o2 = C8800o.f42459a;
                                        strM16212u2 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u2 = null;
                                    }
                                    if (strM16212u2 == null) {
                                        interfaceC4026cY0.mo1779i(3);
                                    } else {
                                        interfaceC4026cY0.mo1776B(3, strM16212u2);
                                    }
                                    long j6 = z14 ? 1L : 0L;
                                    interfaceC4026cY0.mo1778g(4, j6);
                                    interfaceC4026cY0.mo1778g(5, j6);
                                    interfaceC4026cY0.mo1778g(6, i152);
                                    interfaceC4026cY0.mo1778g(7, i142);
                                    ArrayList arrayList = new ArrayList();
                                    while (interfaceC4026cY0.r0()) {
                                        arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                                    }
                                    interfaceC4026cY0.close();
                                    return arrayList;
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            case 1:
                                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection2, "_connection");
                                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY02.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o3 = C8800o.f42459a;
                                        strM16212u3 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u3 = null;
                                    }
                                    if (strM16212u3 == null) {
                                        interfaceC4026cY02.mo1779i(2);
                                    } else {
                                        interfaceC4026cY02.mo1776B(2, strM16212u3);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o4 = C8800o.f42459a;
                                        strM16212u4 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u4 = null;
                                    }
                                    if (strM16212u4 == null) {
                                        interfaceC4026cY02.mo1779i(3);
                                    } else {
                                        interfaceC4026cY02.mo1776B(3, strM16212u4);
                                    }
                                    long j10 = z14 ? 1L : 0L;
                                    interfaceC4026cY02.mo1778g(4, j10);
                                    interfaceC4026cY02.mo1778g(5, j10);
                                    interfaceC4026cY02.mo1778g(6, i152);
                                    interfaceC4026cY02.mo1778g(7, i142);
                                    ArrayList arrayList2 = new ArrayList();
                                    while (interfaceC4026cY02.r0()) {
                                        arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                                    }
                                    interfaceC4026cY02.close();
                                    return arrayList2;
                                } finally {
                                }
                            default:
                                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection3, "_connection");
                                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY03.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o5 = C8800o.f42459a;
                                        strM16212u5 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u5 = null;
                                    }
                                    if (strM16212u5 == null) {
                                        interfaceC4026cY03.mo1779i(2);
                                    } else {
                                        interfaceC4026cY03.mo1776B(2, strM16212u5);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o6 = C8800o.f42459a;
                                        strM16212u6 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u6 = null;
                                    }
                                    if (strM16212u6 == null) {
                                        interfaceC4026cY03.mo1779i(3);
                                    } else {
                                        interfaceC4026cY03.mo1776B(3, strM16212u6);
                                    }
                                    long j11 = z14 ? 1L : 0L;
                                    interfaceC4026cY03.mo1778g(4, j11);
                                    interfaceC4026cY03.mo1778g(5, j11);
                                    interfaceC4026cY03.mo1778g(6, i152);
                                    interfaceC4026cY03.mo1778g(7, i142);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (interfaceC4026cY03.r0()) {
                                        arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                                    }
                                    interfaceC4026cY03.close();
                                    return arrayList3;
                                } finally {
                                }
                        }
                    }
                });
            }
            final int i17 = 0;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.x0
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i142 = i17;
                    int i152 = i11;
                    int i162 = i10;
                    boolean z14 = z12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i142) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(3, j6);
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, i162);
                            interfaceC4026cY0.mo1778g(6, i152);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(5) ? null : Long.valueOf(interfaceC4026cY0.getLong(5))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(3, j10);
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, i162);
                            interfaceC4026cY02.mo1778g(6, i152);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(5) ? null : Long.valueOf(interfaceC4026cY02.getLong(5))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(3, j11);
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, i162);
                            interfaceC4026cY03.mo1778g(6, i152);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(5) ? null : Long.valueOf(interfaceC4026cY03.getLong(5))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        if (z13 && str.length() > 0) {
            StringBuilder sbM14338r3 = a1.m14338r(h3Var, "SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND phone_number NOT IN (");
            int iM14323c3 = a1.m14323c(list, sbM14338r3, ") AND date_time BETWEEN ", "?", " AND  ");
            a1.m14319B(sbM14338r3, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN count END ASC, CASE WHEN ");
            a1.m14319B(sbM14338r3, "?", " = 0 THEN count END DESC LIMIT ", "?", " OFFSET ");
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new y0(iM14323c3, i10, i11, 3, m0.m7381n(sbM14338r3, "?", "toString(...)"), str, localDateTime, localDateTime2, list, z12));
        }
        if (!z13 || str.length() != 0) {
            if (str.length() > 0) {
                final int i18 = 2;
                return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.d1
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) throws Exception {
                        String strM16212u;
                        String strM16212u2;
                        String strM16212u3;
                        String strM16212u4;
                        String strM16212u5;
                        String strM16212u6;
                        int i132 = i18;
                        int i142 = i11;
                        int i152 = i10;
                        boolean z14 = z12;
                        LocalDateTime localDateTime3 = localDateTime2;
                        LocalDateTime localDateTime4 = localDateTime;
                        String str2 = str;
                        switch (i132) {
                            case 0:
                                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection, "_connection");
                                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY0.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o = C8800o.f42459a;
                                        strM16212u = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u = null;
                                    }
                                    if (strM16212u == null) {
                                        interfaceC4026cY0.mo1779i(2);
                                    } else {
                                        interfaceC4026cY0.mo1776B(2, strM16212u);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o2 = C8800o.f42459a;
                                        strM16212u2 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u2 = null;
                                    }
                                    if (strM16212u2 == null) {
                                        interfaceC4026cY0.mo1779i(3);
                                    } else {
                                        interfaceC4026cY0.mo1776B(3, strM16212u2);
                                    }
                                    long j6 = z14 ? 1L : 0L;
                                    interfaceC4026cY0.mo1778g(4, j6);
                                    interfaceC4026cY0.mo1778g(5, j6);
                                    interfaceC4026cY0.mo1778g(6, i152);
                                    interfaceC4026cY0.mo1778g(7, i142);
                                    ArrayList arrayList = new ArrayList();
                                    while (interfaceC4026cY0.r0()) {
                                        arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                                    }
                                    interfaceC4026cY0.close();
                                    return arrayList;
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            case 1:
                                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection2, "_connection");
                                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY02.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o3 = C8800o.f42459a;
                                        strM16212u3 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u3 = null;
                                    }
                                    if (strM16212u3 == null) {
                                        interfaceC4026cY02.mo1779i(2);
                                    } else {
                                        interfaceC4026cY02.mo1776B(2, strM16212u3);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o4 = C8800o.f42459a;
                                        strM16212u4 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u4 = null;
                                    }
                                    if (strM16212u4 == null) {
                                        interfaceC4026cY02.mo1779i(3);
                                    } else {
                                        interfaceC4026cY02.mo1776B(3, strM16212u4);
                                    }
                                    long j10 = z14 ? 1L : 0L;
                                    interfaceC4026cY02.mo1778g(4, j10);
                                    interfaceC4026cY02.mo1778g(5, j10);
                                    interfaceC4026cY02.mo1778g(6, i152);
                                    interfaceC4026cY02.mo1778g(7, i142);
                                    ArrayList arrayList2 = new ArrayList();
                                    while (interfaceC4026cY02.r0()) {
                                        arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                                    }
                                    interfaceC4026cY02.close();
                                    return arrayList2;
                                } finally {
                                }
                            default:
                                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                                AbstractC4154l.m8923f(_connection3, "_connection");
                                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND  date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                                try {
                                    interfaceC4026cY03.mo1776B(1, str2);
                                    if (localDateTime4 != null) {
                                        C8800o c8800o5 = C8800o.f42459a;
                                        strM16212u5 = C8800o.m16212u(localDateTime4);
                                    } else {
                                        strM16212u5 = null;
                                    }
                                    if (strM16212u5 == null) {
                                        interfaceC4026cY03.mo1779i(2);
                                    } else {
                                        interfaceC4026cY03.mo1776B(2, strM16212u5);
                                    }
                                    if (localDateTime3 != null) {
                                        C8800o c8800o6 = C8800o.f42459a;
                                        strM16212u6 = C8800o.m16212u(localDateTime3);
                                    } else {
                                        strM16212u6 = null;
                                    }
                                    if (strM16212u6 == null) {
                                        interfaceC4026cY03.mo1779i(3);
                                    } else {
                                        interfaceC4026cY03.mo1776B(3, strM16212u6);
                                    }
                                    long j11 = z14 ? 1L : 0L;
                                    interfaceC4026cY03.mo1778g(4, j11);
                                    interfaceC4026cY03.mo1778g(5, j11);
                                    interfaceC4026cY03.mo1778g(6, i152);
                                    interfaceC4026cY03.mo1778g(7, i142);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (interfaceC4026cY03.r0()) {
                                        arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                                    }
                                    interfaceC4026cY03.close();
                                    return arrayList3;
                                } finally {
                                }
                        }
                    }
                });
            }
            final int i19 = 2;
            return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.x0
                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj) throws Exception {
                    String strM16212u;
                    String strM16212u2;
                    String strM16212u3;
                    String strM16212u4;
                    String strM16212u5;
                    String strM16212u6;
                    int i142 = i19;
                    int i152 = i11;
                    int i162 = i10;
                    boolean z14 = z12;
                    LocalDateTime localDateTime3 = localDateTime2;
                    LocalDateTime localDateTime4 = localDateTime;
                    switch (i142) {
                        case 0:
                            InterfaceC4024a _connection = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection, "_connection");
                            InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o = C8800o.f42459a;
                                    strM16212u = C8800o.m16212u(localDateTime4);
                                } finally {
                                    interfaceC4026cY0.close();
                                }
                            } else {
                                strM16212u = null;
                            }
                            if (strM16212u == null) {
                                interfaceC4026cY0.mo1779i(1);
                            } else {
                                interfaceC4026cY0.mo1776B(1, strM16212u);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o2 = C8800o.f42459a;
                                strM16212u2 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u2 = null;
                            }
                            if (strM16212u2 == null) {
                                interfaceC4026cY0.mo1779i(2);
                            } else {
                                interfaceC4026cY0.mo1776B(2, strM16212u2);
                            }
                            long j6 = z14 ? 1L : 0L;
                            interfaceC4026cY0.mo1778g(3, j6);
                            interfaceC4026cY0.mo1778g(4, j6);
                            interfaceC4026cY0.mo1778g(5, i162);
                            interfaceC4026cY0.mo1778g(6, i152);
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(5) ? null : Long.valueOf(interfaceC4026cY0.getLong(5))));
                            }
                            interfaceC4026cY0.close();
                            return arrayList;
                        case 1:
                            InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection2, "_connection");
                            InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o3 = C8800o.f42459a;
                                    strM16212u3 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u3 = null;
                            }
                            if (strM16212u3 == null) {
                                interfaceC4026cY02.mo1779i(1);
                            } else {
                                interfaceC4026cY02.mo1776B(1, strM16212u3);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o4 = C8800o.f42459a;
                                strM16212u4 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u4 = null;
                            }
                            if (strM16212u4 == null) {
                                interfaceC4026cY02.mo1779i(2);
                            } else {
                                interfaceC4026cY02.mo1776B(2, strM16212u4);
                            }
                            long j10 = z14 ? 1L : 0L;
                            interfaceC4026cY02.mo1778g(3, j10);
                            interfaceC4026cY02.mo1778g(4, j10);
                            interfaceC4026cY02.mo1778g(5, i162);
                            interfaceC4026cY02.mo1778g(6, i152);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY02.r0()) {
                                arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(5) ? null : Long.valueOf(interfaceC4026cY02.getLong(5))));
                            }
                            interfaceC4026cY02.close();
                            return arrayList2;
                        default:
                            InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                            AbstractC4154l.m8923f(_connection3, "_connection");
                            InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND  ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                            if (localDateTime4 != null) {
                                try {
                                    C8800o c8800o5 = C8800o.f42459a;
                                    strM16212u5 = C8800o.m16212u(localDateTime4);
                                } finally {
                                }
                            } else {
                                strM16212u5 = null;
                            }
                            if (strM16212u5 == null) {
                                interfaceC4026cY03.mo1779i(1);
                            } else {
                                interfaceC4026cY03.mo1776B(1, strM16212u5);
                            }
                            if (localDateTime3 != null) {
                                C8800o c8800o6 = C8800o.f42459a;
                                strM16212u6 = C8800o.m16212u(localDateTime3);
                            } else {
                                strM16212u6 = null;
                            }
                            if (strM16212u6 == null) {
                                interfaceC4026cY03.mo1779i(2);
                            } else {
                                interfaceC4026cY03.mo1776B(2, strM16212u6);
                            }
                            long j11 = z14 ? 1L : 0L;
                            interfaceC4026cY03.mo1778g(3, j11);
                            interfaceC4026cY03.mo1778g(4, j11);
                            interfaceC4026cY03.mo1778g(5, i162);
                            interfaceC4026cY03.mo1778g(6, i152);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC4026cY03.r0()) {
                                arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(5) ? null : Long.valueOf(interfaceC4026cY03.getLong(5))));
                            }
                            interfaceC4026cY03.close();
                            return arrayList3;
                    }
                }
            });
        }
        StringBuilder sbM14338r4 = a1.m14338r(h3Var, "SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE phone_number NOT IN (");
        int iM14323c4 = a1.m14323c(list, sbM14338r4, ") AND date_time BETWEEN ", "?", " AND  ");
        a1.m14319B(sbM14338r4, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN count END ASC, CASE WHEN ");
        a1.m14319B(sbM14338r4, "?", " = 0 THEN count END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.v0(iM14323c4, i10, i11, 4, m0.m7381n(sbM14338r4, "?", "toString(...)"), localDateTime, localDateTime2, list, z12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r11 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r11.m15657H(r3, r1) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a9 -> B:35:0x00ac). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15256j(ww.AbstractC8193c r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15256j(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15257k(tq.EnumC7204p r5, ww.AbstractC8193c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fo.C2350n
            if (r0 == 0) goto L13
            r0 = r6
            fo.n r0 = (fo.C2350n) r0
            int r1 = r0.f10668d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10668d = r1
            goto L18
        L13:
            fo.n r0 = new fo.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10666b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10668d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tq.p r5 = r0.f10665a
            og.od.m10798c(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f38724b
            xm.y5 r6 = (xm.y5) r6
            r0.f10665a = r5
            r0.f10668d = r3
            java.io.Serializable r6 = r6.m15694j(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4d
            r5 = 0
            return r5
        L4d:
            tq.p r0 = tq.EnumC7204p.SIM2
            r1 = 2
            if (r5 != r0) goto L69
            int r0 = r6.size()
            if (r0 != r1) goto L59
            goto L69
        L59:
            java.lang.Exception r5 = new java.lang.Exception
            int r6 = r6.size()
            java.lang.String r0 = "invalid size:=$"
            java.lang.String r6 = mm.AbstractC4801l.m9730d(r6, r0)
            r5.<init>(r6)
            throw r5
        L69:
            int[] r0 = fo.AbstractC2349m.f10664a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L88
            if (r5 == r1) goto L88
            r0 = 3
            if (r5 == r0) goto L88
            r0 = 4
            if (r5 != r0) goto L82
            java.lang.Object r5 = r6.get(r3)
            mm.m r5 = (mm.C4802m) r5
            return r5
        L82:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L88:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            mm.m r5 = (mm.C4802m) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15257k(tq.p, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x012d -> B:59:0x0131). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15258l(tq.EnumC7204p r13, ww.AbstractC8193c r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15258l(tq.p, ww.c):java.lang.Object");
    }

    @Override // h1.z1
    /* renamed from: m */
    public long mo6771m(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        int iMo6832b = abstractC2785p.mo6832b();
        long jMax = 0;
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            jMax = Math.max(jMax, ((InterfaceC2786q) this.f38723a).get(i10).mo6767b(abstractC2785p.mo6831a(i10), abstractC2785p2.mo6831a(i10), abstractC2785p3.mo6831a(i10)));
        }
        return jMax;
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        if (((AbstractC2785p) this.f38725c) == null) {
            this.f38725c = abstractC2785p3.mo6833c();
        }
        AbstractC2785p abstractC2785p4 = (AbstractC2785p) this.f38725c;
        if (abstractC2785p4 == null) {
            AbstractC4154l.m8928k("velocityVector");
            throw null;
        }
        int iMo6832b = abstractC2785p4.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p5 = (AbstractC2785p) this.f38725c;
            if (abstractC2785p5 == null) {
                AbstractC4154l.m8928k("velocityVector");
                throw null;
            }
            abstractC2785p5.mo6835e(((InterfaceC2786q) this.f38723a).get(i10).mo6768c(abstractC2785p.mo6831a(i10), abstractC2785p2.mo6831a(i10), abstractC2785p3.mo6831a(i10), j6), i10);
        }
        AbstractC2785p abstractC2785p6 = (AbstractC2785p) this.f38725c;
        if (abstractC2785p6 != null) {
            return abstractC2785p6;
        }
        AbstractC4154l.m8928k("velocityVector");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15259o(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r9 instanceof xm.C8396d
            if (r1 == 0) goto L17
            r1 = r9
            xm.d r1 = (xm.C8396d) r1
            int r2 = r1.f40209d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40209d = r2
            goto L1c
        L17:
            xm.d r1 = new xm.d
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.f40207b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40209d
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            long r1 = r1.f40206a
            og.od.m10798c(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            og.od.m10798c(r9)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "DataStore - getDateFilterTitle START"
            r0.m16232g(r4, r9)
            java.lang.Object r9 = r8.f38724b
            fn.i r9 = (fn.C2336i) r9
            r1.f40206a = r6
            r1.f40209d = r5
            java.lang.String r3 = "dashboard_period"
            java.lang.Object r9 = r9.m6028h(r3, r1)
            if (r9 != r2) goto L54
            return r2
        L54:
            r1 = r6
        L55:
            java.lang.String r9 = (java.lang.String) r9
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r1 = yv.C8789d.m16160g(r5, r6)
            java.lang.String r2 = "DataStore - getDateFilterTitle SUCCESS - result : "
            java.lang.String r3 = ", Duration: "
            java.lang.String r1 = a2.AbstractC0030c.m121l(r2, r9, r3, r1)
            r0.m16232g(r4, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15259o(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15260p(mm.C4802m r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r9 instanceof fo.C2352p
            if (r1 == 0) goto L17
            r1 = r9
            fo.p r1 = (fo.C2352p) r1
            int r2 = r1.f10683c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f10683c = r2
            goto L1c
        L17:
            fo.p r1 = new fo.p
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.f10681a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f10683c
            java.lang.String r4 = "Something went wrong"
            java.lang.String r5 = "AddLead"
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 != r6) goto L31
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L9c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            og.od.m10798c(r9)
            if (r8 == 0) goto L91
            java.lang.Object r9 = r7.f38725c     // Catch: java.lang.Exception -> L2f
            xm.r3 r9 = (xm.r3) r9     // Catch: java.lang.Exception -> L2f
            rm.a r3 = new rm.a     // Catch: java.lang.Exception -> L2f
            r3.<init>(r8)     // Catch: java.lang.Exception -> L2f
            r1.f10683c = r6     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.m15605d(r3, r1)     // Catch: java.lang.Exception -> L2f
            if (r9 != r2) goto L50
            return r2
        L50:
            im.k1 r9 = (im.k1) r9     // Catch: java.lang.Exception -> L2f
            boolean r8 = r9 instanceof im.i1     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L66
            im.i1 r9 = (im.i1) r9     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r9.f17561a     // Catch: java.lang.Exception -> L2f
            com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse r8 = (com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse) r8     // Catch: java.lang.Exception -> L2f
            java.util.List r8 = og.rf.m10882c(r8)     // Catch: java.lang.Exception -> L2f
            im.i1 r9 = new im.i1     // Catch: java.lang.Exception -> L2f
            r9.<init>(r8)     // Catch: java.lang.Exception -> L2f
            return r9
        L66:
            boolean r8 = r9 instanceof im.g1     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L74
            im.g1 r8 = new im.g1     // Catch: java.lang.Exception -> L2f
            im.g1 r9 = (im.g1) r9     // Catch: java.lang.Exception -> L2f
            im.f1 r9 = r9.f17557a     // Catch: java.lang.Exception -> L2f
            r8.<init>(r9)     // Catch: java.lang.Exception -> L2f
            return r8
        L74:
            boolean r8 = r9 instanceof im.h1     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L82
            im.h1 r8 = new im.h1     // Catch: java.lang.Exception -> L2f
            im.h1 r9 = (im.h1) r9     // Catch: java.lang.Exception -> L2f
            java.lang.String r9 = r9.f17560a     // Catch: java.lang.Exception -> L2f
            r8.<init>(r9)     // Catch: java.lang.Exception -> L2f
            return r8
        L82:
            im.j1 r8 = im.j1.f17563a     // Catch: java.lang.Exception -> L2f
            boolean r9 = kotlin.jvm.internal.AbstractC4154l.m8918a(r9, r8)     // Catch: java.lang.Exception -> L2f
            if (r9 == 0) goto L8b
            return r8
        L8b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2f
            r8.<init>()     // Catch: java.lang.Exception -> L2f
            throw r8     // Catch: java.lang.Exception -> L2f
        L91:
            java.lang.String r8 = "selectedLeadSIM is null"
            r0.m16232g(r5, r8)     // Catch: java.lang.Exception -> L2f
            im.h1 r8 = new im.h1     // Catch: java.lang.Exception -> L2f
            r8.<init>(r4)     // Catch: java.lang.Exception -> L2f
            return r8
        L9c:
            r0.m16239n(r5, r8)
            im.h1 r8 = new im.h1
            r8.<init>(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15260p(mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15261q(ww.AbstractC8193c r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f38726d
            yv.t r0 = (yv.C8805t) r0
            boolean r1 = r11 instanceof xm.C8397e
            if (r1 == 0) goto L17
            r1 = r11
            xm.e r1 = (xm.C8397e) r1
            int r2 = r1.f40232d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f40232d = r2
            goto L1c
        L17:
            xm.e r1 = new xm.e
            r1.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r1.f40230b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f40232d
            java.lang.String r4 = "AnalyticsRepository"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            long r1 = r1.f40229a
            og.od.m10798c(r11)
            goto L55
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            og.od.m10798c(r11)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "DataStore - getEndDate START"
            r0.m16232g(r4, r11)
            java.lang.Object r11 = r10.f38724b
            fn.i r11 = (fn.C2336i) r11
            r1.f40229a = r6
            r1.f40232d = r5
            java.lang.String r3 = "dashboard_endDate"
            java.lang.Object r11 = r11.m6024d(r3, r1)
            if (r11 != r2) goto L54
            return r2
        L54:
            r1 = r6
        L55:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            java.lang.String r11 = yv.C8789d.m16160g(r5, r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DataStore - getEndDate SUCCESS, Duration: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.m16232g(r4, r11)
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15261q(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15262r(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fo.C2353q
            if (r0 == 0) goto L13
            r0 = r5
            fo.q r0 = (fo.C2353q) r0
            int r1 = r0.f10686c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10686c = r1
            goto L18
        L13:
            fo.q r0 = new fo.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10684a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10686c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            java.lang.Object r5 = r4.f38724b
            xm.y5 r5 = (xm.y5) r5
            r0.f10686c = r3
            java.lang.Object r5 = r5.m15696l(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = rw.AbstractC6663m.m12742F(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15262r(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15263s(java.lang.String r23, j$.time.LocalDateTime r24, j$.time.LocalDateTime r25, java.util.List r26, ww.AbstractC8193c r27, boolean r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r27
            r2 = r28
            boolean r3 = r1 instanceof xm.C8398f
            if (r3 == 0) goto L19
            r3 = r1
            xm.f r3 = (xm.C8398f) r3
            int r4 = r3.f40269k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f40269k = r4
            goto L1e
        L19:
            xm.f r3 = new xm.f
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.f40267h
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f40269k
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L53
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            og.od.m10798c(r1)
            return r1
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            boolean r2 = r3.f40266g
            boolean r5 = r3.f40265f
            java.util.List r7 = r3.f40264e
            java.lang.String r8 = r3.f40263d
            j$.time.LocalDateTime r9 = r3.f40262c
            j$.time.LocalDateTime r10 = r3.f40261b
            gn.x2 r11 = r3.f40260a
            og.od.m10798c(r1)
            r17 = r2
            r2 = r5
            r18 = r7
            r16 = r8
            r15 = r9
            r14 = r10
            goto L86
        L53:
            og.od.m10798c(r1)
            java.lang.Object r1 = r0.f38723a
            r11 = r1
            gn.x2 r11 = (gn.x2) r11
            java.lang.Object r1 = r0.f38725c
            xm.z r1 = (xm.C8418z) r1
            r3.f40260a = r11
            r5 = r24
            r3.f40261b = r5
            r8 = r25
            r3.f40262c = r8
            r9 = r23
            r3.f40263d = r9
            r10 = r26
            r3.f40264e = r10
            r3.f40265f = r2
            r3.f40266g = r2
            r3.f40269k = r7
            java.lang.Object r1 = r1.m15711a(r3)
            if (r1 != r4) goto L7e
            goto Lae
        L7e:
            r17 = r2
            r14 = r5
            r15 = r8
            r16 = r9
            r18 = r10
        L86:
            java.lang.Number r1 = (java.lang.Number) r1
            int r19 = r1.intValue()
            r1 = 0
            r3.f40260a = r1
            r3.f40261b = r1
            r3.f40262c = r1
            r3.f40263d = r1
            r3.f40264e = r1
            r3.f40265f = r2
            r3.f40269k = r6
            an.u r13 = r11.f14942b
            z7.w r1 = r13.f1411a
            an.t r12 = new an.t
            r20 = 0
            r21 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = og.pe.m10838m(r1, r12, r3)
            if (r1 != r4) goto Laf
        Lae:
            return r4
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15263s(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15264u(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, int r25, ww.AbstractC8193c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15264u(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:59:0x0195, B:70:0x01e1, B:22:0x0053, B:53:0x0165, B:55:0x016b, B:60:0x01a6, B:62:0x01aa, B:64:0x01bd, B:66:0x01c1, B:67:0x01d3, B:69:0x01db, B:72:0x01ee, B:73:0x01f3, B:49:0x0143), top: B:76:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:59:0x0195, B:70:0x01e1, B:22:0x0053, B:53:0x0165, B:55:0x016b, B:60:0x01a6, B:62:0x01aa, B:64:0x01bd, B:66:0x01c1, B:67:0x01d3, B:69:0x01db, B:72:0x01ee, B:73:0x01f3, B:49:0x0143), top: B:76:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15265v(int r26, im.EnumC3316r r27, com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r28, java.lang.String r29, tq.EnumC7204p r30, ww.AbstractC8193c r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15265v(int, im.r, com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest, java.lang.String, tq.p, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum m15266w(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f38724b
            xm.y5 r0 = (xm.y5) r0
            boolean r1 = r8 instanceof fo.C2356t
            if (r1 == 0) goto L17
            r1 = r8
            fo.t r1 = (fo.C2356t) r1
            int r2 = r1.f10713d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f10713d = r2
            goto L1c
        L17:
            fo.t r1 = new fo.t
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.f10711b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f10713d
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L38
            if (r3 != r5) goto L30
            tq.p r0 = r1.f10710a
            og.od.m10798c(r8)
            goto L58
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            og.od.m10798c(r8)
            goto L48
        L3c:
            og.od.m10798c(r8)
            r1.f10713d = r4
            java.lang.Enum r8 = r0.m15700p(r1)
            if (r8 != r2) goto L48
            goto L54
        L48:
            tq.p r8 = (tq.EnumC7204p) r8
            r1.f10710a = r8
            r1.f10713d = r5
            java.io.Serializable r0 = r0.m15694j(r1)
            if (r0 != r2) goto L55
        L54:
            return r2
        L55:
            r6 = r0
            r0 = r8
            r8 = r6
        L58:
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r8 != r5) goto L61
            return r0
        L61:
            tq.p r8 = tq.EnumC7204p.DEFAULT
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15266w(ww.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15267x(java.lang.String r9, java.util.List r10, int r11, int r12, ww.AbstractC8193c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof xm.C8399g
            if (r0 == 0) goto L14
            r0 = r13
            xm.g r0 = (xm.C8399g) r0
            int r1 = r0.f40312j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40312j = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xm.g r0 = new xm.g
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f40310g
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f40312j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            og.od.m10798c(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r11 = r7.f40309f
            int r12 = r7.f40308e
            int r9 = r7.f40307d
            java.util.List r10 = r7.f40306c
            java.lang.String r1 = r7.f40305b
            gn.x2 r3 = r7.f40304a
            og.od.m10798c(r13)
            r4 = r11
            r11 = r9
            r9 = r1
            r1 = r3
            r6 = r12
            r3 = r10
            goto L70
        L4a:
            og.od.m10798c(r13)
            java.lang.Object r13 = r8.f38723a
            gn.x2 r13 = (gn.x2) r13
            java.lang.Object r1 = r8.f38725c
            xm.z r1 = (xm.C8418z) r1
            r7.f40304a = r13
            r7.f40305b = r9
            r7.f40306c = r10
            r7.f40307d = r11
            r7.f40308e = r12
            r7.f40309f = r11
            r7.f40312j = r3
            java.lang.Object r1 = r1.m15711a(r7)
            if (r1 != r0) goto L6a
            goto L8a
        L6a:
            r3 = r1
            r1 = r13
            r13 = r3
            r4 = r11
            r3 = r10
            r6 = r12
        L70:
            java.lang.Number r13 = (java.lang.Number) r13
            int r5 = r13.intValue()
            r10 = 0
            r7.f40304a = r10
            r7.f40305b = r10
            r7.f40306c = r10
            r7.f40307d = r11
            r7.f40308e = r6
            r7.f40312j = r2
            r2 = r9
            java.lang.Object r9 = r1.m6664J(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15267x(java.lang.String, java.util.List, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15268y(int r17, int r18, java.lang.String r19, j$.time.LocalDateTime r20, j$.time.LocalDateTime r21, java.util.List r22, ww.AbstractC8193c r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15268y(int, int, java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.util.List, ww.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:15:0x003d, B:53:0x0170, B:64:0x01bd, B:22:0x0051, B:47:0x0140, B:49:0x0146, B:54:0x0182, B:56:0x0186, B:58:0x0199, B:60:0x019d, B:61:0x01af, B:63:0x01b7, B:66:0x01ca, B:67:0x01cf, B:43:0x011e), top: B:70:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:15:0x003d, B:53:0x0170, B:64:0x01bd, B:22:0x0051, B:47:0x0140, B:49:0x0146, B:54:0x0182, B:56:0x0186, B:58:0x0199, B:60:0x019d, B:61:0x01af, B:63:0x01b7, B:66:0x01ca, B:67:0x01cf, B:43:0x011e), top: B:70:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15269z(int r25, im.EnumC3316r r26, com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r27, java.lang.String r28, tq.EnumC7204p r29, ww.AbstractC8193c r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8090p.m15269z(int, im.r, com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest, java.lang.String, tq.p, ww.c):java.lang.Object");
    }

    public C8090p(x2 localDataSource, C2987d remoteDataSource, C2336i dataStoreSource, C8418z appPreferencesRepository, C8805t c8805t) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        this.f38723a = localDataSource;
        this.f38724b = dataStoreSource;
        this.f38725c = appPreferencesRepository;
        this.f38726d = c8805t;
    }

    public C8090p(Context context, y5 userSIMRepository, r3 r3Var, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f38723a = context;
        this.f38724b = userSIMRepository;
        this.f38725c = r3Var;
        this.f38726d = c8805t;
    }

    public C8090p(InterfaceC2786q interfaceC2786q) {
        this.f38723a = interfaceC2786q;
    }

    public C8090p(InterfaceC2795z interfaceC2795z) {
        this(new C8986c(18, interfaceC2795z));
    }
}
