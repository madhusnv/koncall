package mq;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ap.C0395h;
import ay.C0496f;
import ay.ExecutorC0495e;
import c9.C0908c;
import c9.C0910e;
import dr.C1768r;
import dr.C1769s;
import dy.AbstractC1856d;
import dy.C1855c;
import hp.C2995b;
import i7.C3178a;
import ik.C3279c;
import j$.time.LocalDateTime;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4171a;
import kq.C4181k;
import kq.C4184n;
import ln.C4494g;
import lp.C4504f;
import lq.C4507b;
import lv.C4531c;
import nn.C5113e;
import no.C5122i;
import nx.AbstractC5178p;
import og.nd;
import pg.g9;
import pg.o6;
import pn.C5979e;
import qw.C6361k;
import qw.C6366p;
import rt.C6617a;
import rw.AbstractC6674x;
import rw.C6668r;
import rw.C6669s;
import si.C6847c;
import sq.n2;
import tq.EnumC7202n;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import v0.C7622f;
import vw.EnumC7794a;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8791f;
import yv.C8805t;
import yx.C8810d;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends d7.w0 {

    /* renamed from: A */
    public final wx.w0 f24253A;

    /* renamed from: B */
    public final m1 f24254B;

    /* renamed from: C */
    public final wx.w0 f24255C;

    /* renamed from: D */
    public final int f24256D;

    /* renamed from: E */
    public volatile EnumC7204p f24257E;

    /* renamed from: F */
    public int f24258F;

    /* renamed from: G */
    public final C4531c f24259G;

    /* renamed from: H */
    public boolean f24260H;

    /* renamed from: b */
    public final Context f24261b;

    /* renamed from: c */
    public final C5979e f24262c;

    /* renamed from: d */
    public final C0910e f24263d;

    /* renamed from: e */
    public final C5113e f24264e;

    /* renamed from: f */
    public final C5122i f24265f;

    /* renamed from: g */
    public final rn.h0 f24266g;

    /* renamed from: h */
    public final p020v.x0 f24267h;

    /* renamed from: i */
    public final C7622f f24268i;

    /* renamed from: j */
    public final C7622f f24269j;

    /* renamed from: k */
    public final C4494g f24270k;

    /* renamed from: l */
    public final C0908c f24271l;

    /* renamed from: m */
    public final EnumC7202n f24272m;

    /* renamed from: n */
    public final C8805t f24273n;

    /* renamed from: o */
    public final C8810d f24274o;

    /* renamed from: p */
    public final C7806h f24275p;

    /* renamed from: q */
    public final C8203d f24276q;

    /* renamed from: r */
    public final C7806h f24277r;

    /* renamed from: s */
    public final C8203d f24278s;

    /* renamed from: t */
    public boolean f24279t;

    /* renamed from: u */
    public final C1855c f24280u;

    /* renamed from: v */
    public final C8810d f24281v;

    /* renamed from: w */
    public final C1855c f24282w;

    /* renamed from: x */
    public final C7806h f24283x;

    /* renamed from: y */
    public final C8203d f24284y;

    /* renamed from: z */
    public final m1 f24285z;

    public h0(Context context, C5979e c5979e, C0910e c0910e, C5113e c5113e, C5122i noteUseCase, rn.h0 callRecordingUseCase, p020v.x0 x0Var, C7622f c7622f, C7622f c7622f2, C4494g c4494g, C0908c c0908c, EnumC7202n callType, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(callType, "callType");
        this.f24261b = context;
        this.f24262c = c5979e;
        this.f24263d = c0910e;
        this.f24264e = c5113e;
        this.f24265f = noteUseCase;
        this.f24266g = callRecordingUseCase;
        this.f24267h = x0Var;
        this.f24268i = c7622f;
        this.f24269j = c7622f2;
        this.f24270k = c4494g;
        this.f24271l = c0908c;
        this.f24272m = callType;
        this.f24273n = c8805t;
        this.f24274o = c8810d;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f24275p = c7806hM11805a;
        this.f24276q = c1.m15389t(c7806hM11805a);
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f24277r = c7806hM11805a2;
        this.f24278s = c1.m15389t(c7806hM11805a2);
        this.f24280u = AbstractC1856d.m5490a();
        C0496f c0496f = tx.m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        this.f24281v = tx.c0.m13479b(executorC0495e);
        this.f24282w = AbstractC1856d.m5490a();
        C7806h c7806hM11805a3 = o6.m11805a(0, null, null, 7);
        this.f24283x = c7806hM11805a3;
        this.f24284y = c1.m15389t(c7806hM11805a3);
        m1 m1VarM15372c = c1.m15372c(new C4507b(true, C6668r.f31943a, C6669s.f31944a, false, false, 0, new C4184n(false, -1), null, null));
        this.f24285z = m1VarM15372c;
        this.f24253A = new wx.w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c("");
        this.f24254B = m1VarM15372c2;
        this.f24255C = new wx.w0(m1VarM15372c2);
        this.f24256D = 50;
        this.f24258F = 1;
        int i10 = 8;
        this.f24259G = new C4531c(new C6361k(LocalDateTime.now(), Integer.MAX_VALUE), new C4833a(0, this), new hq.d0(18), new a0(this, null, 1), new C4834b(this, interfaceC7559c, i10), new C4858z(this, interfaceC7559c, 1), new C3279c(2, 2, null), new a0(this, null, 2), new C4858z(this, interfaceC7559c, 2), new C1769s(this, interfaceC7559c, i10), 1024);
        tx.c0.m13502y(d7.q0.m5340g(this), executorC0495e, null, new C4834b(this, interfaceC7559c, 0), 2);
        if (callType == EnumC7202n.ALL || callType == EnumC7202n.OUTGOING || callType == EnumC7202n.INCOMING) {
            tx.c0.m13502y(d7.q0.m5340g(this), executorC0495e, null, new C4834b(this, interfaceC7559c, 1), 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if (r0 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c0, code lost:
    
        if (r0 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0222, code lost:
    
        if (r0 != r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028b, code lost:
    
        if (r0 != r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9793e(mq.h0 r14, j$.time.LocalDateTime r15, int r16, int r17, ww.AbstractC8193c r18) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.h0.m9793e(mq.h0, j$.time.LocalDateTime, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:14:0x005b, B:29:0x0124, B:31:0x012a, B:53:0x022e, B:54:0x0244, B:56:0x024a, B:58:0x0259, B:59:0x0261, B:60:0x0267, B:61:0x0271, B:63:0x0277, B:64:0x02b5, B:65:0x02b7, B:21:0x00ac, B:28:0x00f5), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018f A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:50:0x0204, B:36:0x0189, B:38:0x018f, B:43:0x019a), top: B:71:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r1v9, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01e6 -> B:47:0x01fb). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9794f(mq.h0 r20, java.util.List r21, ww.AbstractC8193c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.h0.m9794f(mq.h0, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v2, types: [dy.a] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9795g(mq.h0 r21, ww.AbstractC8193c r22) throws java.lang.Throwable {
        /*
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof mq.d0
            if (r2 == 0) goto L17
            r2 = r1
            mq.d0 r2 = (mq.d0) r2
            int r3 = r2.f24199e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f24199e = r3
            goto L1c
        L17:
            mq.d0 r2 = new mq.d0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f24197c
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f24199e
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L45
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            dy.a r2 = r2.f24195a
            og.od.m10798c(r1)     // Catch: java.lang.Throwable -> L32
            goto L8e
        L32:
            r0 = move-exception
            goto L96
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            int r4 = r2.f24196b
            dy.a r6 = r2.f24195a
            og.od.m10798c(r1)
            r1 = r6
            goto L58
        L45:
            og.od.m10798c(r1)
            dy.c r1 = r0.f24282w
            r2.f24195a = r1
            r2.f24196b = r7
            r2.f24199e = r6
            java.lang.Object r4 = r1.mo1768h(r2)
            if (r4 != r3) goto L57
            goto L8c
        L57:
            r4 = r7
        L58:
            wx.m1 r6 = r0.f24285z     // Catch: java.lang.Throwable -> L94
        L5a:
            java.lang.Object r9 = r6.getValue()     // Catch: java.lang.Throwable -> L94
            r10 = r9
            lq.b r10 = (lq.C4507b) r10     // Catch: java.lang.Throwable -> L94
            rw.r r12 = rw.C6668r.f31943a     // Catch: java.lang.Throwable -> L94
            rw.s r13 = rw.C6669s.f31944a     // Catch: java.lang.Throwable -> L94
            r19 = 0
            r20 = 1929(0x789, float:2.703E-42)
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            lq.b r10 = lq.C4507b.m9340a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L94
            boolean r9 = r6.m15397i(r9, r10)     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L5a
            r0.f24258F = r7     // Catch: java.lang.Throwable -> L94
            lv.c r0 = r0.f24259G     // Catch: java.lang.Throwable -> L94
            r2.f24195a = r1     // Catch: java.lang.Throwable -> L94
            r2.f24196b = r4     // Catch: java.lang.Throwable -> L94
            r2.f24199e = r5     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r0.m9381e(r2)     // Catch: java.lang.Throwable -> L94
            if (r0 != r3) goto L8d
        L8c:
            return r3
        L8d:
            r2 = r1
        L8e:
            r2.mo1769j(r8)
            qw.a0 r0 = qw.a0.f30746a
            return r0
        L94:
            r0 = move-exception
            r2 = r1
        L96:
            r2.mo1769j(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.h0.m9795g(mq.h0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01bd -> B:32:0x01d5). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9796h(mq.h0 r32, java.util.List r33, ww.AbstractC8193c r34) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.h0.m9796h(mq.h0, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:16:0x0061, B:50:0x01af, B:52:0x01b5, B:54:0x01cc, B:79:0x031f, B:85:0x0356, B:24:0x00b4, B:27:0x00ed, B:30:0x010b, B:38:0x0140, B:42:0x014b, B:44:0x0178, B:46:0x0182, B:47:0x019b, B:48:0x01a0, B:49:0x01a1), top: B:92:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027d A[Catch: all -> 0x0282, TryCatch #0 {all -> 0x0282, blocks: (B:76:0x02ed, B:58:0x0234, B:62:0x0279, B:64:0x027d, B:69:0x0288), top: B:90:0x02ed }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0353  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02d5 -> B:18:0x0080). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9797i(mq.h0 r28, java.util.List r29, ww.AbstractC8193c r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.h0.m9797i(mq.h0, java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public static ArrayList m9798k(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getKey()).intValue()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final Object m9799j(C4855w c4855w) throws Exception {
        EnumC7204p enumC7204p = this.f24257E;
        if (enumC7204p == null) {
            AbstractC4154l.m8928k("simSelectionMode");
            throw null;
        }
        if (enumC7204p != EnumC7204p.ALL) {
            EnumC7204p enumC7204p2 = this.f24257E;
            if (enumC7204p2 == null) {
                AbstractC4154l.m8928k("simSelectionMode");
                throw null;
            }
            if (enumC7204p2 != EnumC7204p.DEFAULT) {
                C5113e c5113e = this.f24264e;
                EnumC7204p enumC7204p3 = this.f24257E;
                if (enumC7204p3 != null) {
                    Object objM10040c = c5113e.m10040c(enumC7204p3, c4855w);
                    return objM10040c == EnumC7794a.COROUTINE_SUSPENDED ? objM10040c : (String) objM10040c;
                }
                AbstractC4154l.m8928k("simSelectionMode");
                throw null;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final void m9800l() {
        C3178a c3178aM5340g = d7.q0.m5340g(this);
        C0496f c0496f = tx.m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        InterfaceC7559c interfaceC7559c = null;
        tx.c0.m13502y(c3178aM5340g, executorC0495e, null, new C4834b(this, interfaceC7559c, 4), 2);
        tx.c0.m13502y(d7.q0.m5340g(this), executorC0495e, null, new C4834b(this, interfaceC7559c, 5), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final void m9801m(AbstractC4854v event) {
        C6617a c6617a;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        C4507b c4507b;
        Object value6;
        C4507b c4507b2;
        Object value7;
        Object value8;
        Object value9;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C4840h;
        int i10 = 3;
        C8810d c8810d = this.f24281v;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            C4840h c4840h = (C4840h) event;
            tx.c0.m13502y(c8810d, null, null, new C1768r(this, c4840h.f24252b, c4840h.f24251a, interfaceC7559c, 5), 3);
            return;
        }
        boolean z10 = false;
        Object[] objArr = 0;
        if (event instanceof C4839g) {
            tx.c0.m13502y(c8810d, null, null, new C0395h(4, this, interfaceC7559c, z10), 3);
            return;
        }
        boolean zEquals = event.equals(C4837e.f24200a);
        m1 m1Var = this.f24254B;
        if (zEquals) {
            do {
                value9 = m1Var.getValue();
            } while (!m1Var.m15397i(value9, ""));
            return;
        }
        if (event instanceof C4852t) {
            do {
                value8 = m1Var.getValue();
            } while (!m1Var.m15397i(value8, ((C4852t) event).f24317a));
            return;
        }
        if (event instanceof C4836d) {
            tx.c0.m13502y(d7.q0.m5340g(this), null, null, new b0(this, event, interfaceC7559c, objArr == true ? 1 : 0), 3);
            return;
        }
        boolean z11 = event instanceof C4849q;
        C0910e c0910e = this.f24263d;
        if (z11) {
            c0910e.m2585D(((C4849q) event).f24312a);
            return;
        }
        if (event instanceof C4850r) {
            c0910e.m2588G(((C4850r) event).f24314a);
            return;
        }
        if (event instanceof C4853u) {
            c0910e.m2587F(((C4853u) event).f24324a);
            return;
        }
        if (event instanceof C4838f) {
            c0910e.m2609s(((C4838f) event).f24205a);
            return;
        }
        boolean z12 = event instanceof C4844l;
        int i11 = 1;
        m1 m1Var2 = this.f24285z;
        if (z12) {
            do {
                value7 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value7, C4507b.m9340a((C4507b) value7, false, null, null, false, false, 0, new C4184n(true, ((C4844l) event).f24300a), null, null, 1919)));
            return;
        }
        int i12 = 7;
        if (event instanceof C4843k) {
            do {
                value6 = m1Var2.getValue();
                c4507b2 = (C4507b) value6;
            } while (!m1Var2.m15397i(value6, C4507b.m9340a(c4507b2, false, null, null, false, false, 0, new C4184n(false, c4507b2.f22425g.f21222b), null, null, 1919)));
            tx.c0.m13502y(c8810d, null, null, new C4834b(this, interfaceC7559c, i12), 3);
            if (this.f24279t) {
                return;
            }
            this.f24279t = true;
            tx.c0.m13502y(d7.q0.m5340g(this), null, null, new C4857y(this, interfaceC7559c, i10), 3);
            tx.c0.m13502y(d7.q0.m5340g(this), null, null, new C4834b(this, interfaceC7559c, 9), 3);
            return;
        }
        if (event instanceof C4842j) {
            do {
                value5 = m1Var2.getValue();
                c4507b = (C4507b) value5;
            } while (!m1Var2.m15397i(value5, C4507b.m9340a(c4507b, false, null, null, false, false, 0, new C4184n(false, c4507b.f22425g.f21222b), null, null, 1919)));
            return;
        }
        if (event instanceof C4841i) {
            Objects.toString(((C4841i) event).f24287b);
            tx.c0.m13502y(c8810d, null, null, new b0(this, event, interfaceC7559c, i11), 3);
            return;
        }
        if (event instanceof C4847o) {
            tx.c0.m13502y(c8810d, null, null, new C2995b(this, event, interfaceC7559c, 23), 3);
            return;
        }
        if (event instanceof C4845m) {
            do {
                value4 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value4, C4507b.m9340a((C4507b) value4, false, null, null, false, false, 0, null, null, null, 1791)));
            return;
        }
        boolean z13 = event instanceof C4846n;
        Context mContext = this.f24261b;
        if (!z13) {
            if (event instanceof C4848p) {
                C4848p c4848p = (C4848p) event;
                String firebaseMessage = c4848p.f24309a;
                if (!c4848p.f24310b) {
                    new C8805t(mContext).m16231f(firebaseMessage);
                    return;
                }
                AbstractC4154l.m8923f(mContext, "mContext");
                C6366p c6366pM10782c = nd.m10782c(new n2(22));
                AbstractC4154l.m8923f(firebaseMessage, "firebaseMessage");
                ((C6847c) c6366pM10782c.getValue()).m13045b(firebaseMessage);
                return;
            }
            if (!(event instanceof C4851s)) {
                throw new NoWhenBranchMatchedException();
            }
            C4181k c4181k = ((C4851s) event).f24316a;
            if (c4181k != null) {
                String str = c4181k.f21191b;
                String str2 = c4181k.f21202n;
                String str3 = c4181k.f21192c;
                String strValueOf = String.valueOf(c4181k.f21193d);
                EnumC8994d enumC8994d = c4181k.f21194e;
                LocalDateTime localDateTime = c4181k.f21195f;
                String strValueOf2 = String.valueOf(c4181k.f21196g);
                String str4 = c4181k.f21199k;
                c6617a = new C6617a(str, str3, str2, strValueOf, enumC8994d, localDateTime, strValueOf2, null, 0, null, null, str4 == null ? "" : str4, 1920);
            } else {
                c6617a = null;
            }
            tx.c0.m13502y(this.f24274o, null, null, new C4504f(this, c6617a, interfaceC7559c, i12), 3);
            return;
        }
        C6361k c6361k = ((C4846n) event).f24304a;
        if (c6361k == null) {
            do {
                value3 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value3, C4507b.m9340a((C4507b) value3, false, null, null, false, false, 0, null, null, null, 1023)));
            return;
        }
        Object obj = c6361k.f30755a;
        Object obj2 = c6361k.f30756b;
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d((String) obj2)) {
            AbstractC4154l.m8920c(obj2);
            String str5 = (String) obj2;
            boolean zM10116x = AbstractC5178p.m10116x(str5, "content://", false);
            Uri uriM754d = zM10116x ? Uri.parse(str5) : FileProvider.m754d(mContext, new File(str5));
            if (zM10116x) {
                AbstractC4154l.m8920c(uriM754d);
                if (!g9.m11663c(mContext, uriM754d)) {
                    int iIntValue = ((Number) obj).intValue();
                    this.f24273n.m16231f("recording play failed for: " + iIntValue);
                    tx.c0.m13502y(c8810d, null, null, new C4856x(this, iIntValue, interfaceC7559c, i11), 3);
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C4507b.m9340a((C4507b) value2, false, null, null, false, false, 0, null, null, null, 1023)));
                    return;
                }
            }
            do {
                value = m1Var2.getValue();
            } while (!m1Var2.m15397i(value, C4507b.m9340a((C4507b) value, false, null, null, false, false, 0, null, null, new C6361k(obj, uriM754d), 1023)));
        }
    }

    /* renamed from: n */
    public final void m9802n(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((C4181k) obj).f21209w;
            Object arrayList = linkedHashMap2.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap.put(new C4171a((String) entry.getKey(), entry.getKey() + "_" + ((List) entry.getValue()).size()), entry.getValue());
        }
        while (true) {
            m1 m1Var = this.f24285z;
            Object value = m1Var.getValue();
            List list2 = list;
            if (m1Var.m15397i(value, C4507b.m9340a((C4507b) value, false, list2, AbstractC6674x.m12785m(linkedHashMap), true, false, list.size(), null, null, null, 1961))) {
                return;
            } else {
                list = list2;
            }
        }
    }
}
