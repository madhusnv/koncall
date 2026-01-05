package wo;

import android.util.Log;
import com.websoptimization.callyzerbiz.common.exception.RestApiException;
import gm.C2650s;
import im.InterfaceC3307i;
import im.q1;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lu.C4525k;
import og.nd;
import pw.InterfaceC6043a;
import qc.C6158d;
import qw.C6366p;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.AbstractC8196f;
import xm.C8418z;
import xm.l2;
import xm.q4;
import xm.s2;
import xm.x1;
import xm.y5;
import yv.C8791f;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.s */
/* loaded from: classes3.dex */
public final class C8134s {

    /* renamed from: a */
    public final x1 f38949a;

    /* renamed from: b */
    public final y5 f38950b;

    /* renamed from: c */
    public final C8418z f38951c;

    /* renamed from: d */
    public final l2 f38952d;

    /* renamed from: e */
    public final C8803r f38953e;

    /* renamed from: f */
    public final q4 f38954f;

    /* renamed from: g */
    public final C8810d f38955g;

    /* renamed from: h */
    public final C8805t f38956h;

    /* renamed from: i */
    public final s2 f38957i;

    /* renamed from: j */
    public final InterfaceC6043a f38958j;

    /* renamed from: k */
    public LocalDateTime f38959k;

    /* renamed from: l */
    public LocalDateTime f38960l;

    /* renamed from: m */
    public List f38961m;

    /* renamed from: n */
    public String f38962n;

    /* renamed from: o */
    public final C6366p f38963o;

    public C8134s(x1 callLogRepository, y5 userSIMRepository, C8418z appPreferencesRepository, l2 l2Var, C8803r networkMonitor, q4 sessionConfigurationRepository, C8810d c8810d, C8805t c8805t, s2 callRecordingRepository, C2650s noteUseCase) {
        AbstractC4154l.m8923f(callLogRepository, "callLogRepository");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(networkMonitor, "networkMonitor");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        AbstractC4154l.m8923f(callRecordingRepository, "callRecordingRepository");
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        this.f38949a = callLogRepository;
        this.f38950b = userSIMRepository;
        this.f38951c = appPreferencesRepository;
        this.f38952d = l2Var;
        this.f38953e = networkMonitor;
        this.f38954f = sessionConfigurationRepository;
        this.f38955g = c8810d;
        this.f38956h = c8805t;
        this.f38957i = callRecordingRepository;
        this.f38958j = noteUseCase;
        this.f38963o = nd.m10782c(new C6158d(15, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15297a(wo.C8134s r4, mm.C4802m r5, ww.AbstractC8193c r6) throws java.lang.Exception {
        /*
            boolean r0 = r6 instanceof wo.C8118c
            if (r0 == 0) goto L13
            r0 = r6
            wo.c r0 = (wo.C8118c) r0
            int r1 = r0.f38858c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38858c = r1
            goto L18
        L13:
            wo.c r0 = new wo.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f38856a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38858c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L40
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            og.od.m10798c(r6)
            xm.l2 r4 = r4.f38952d     // Catch: java.lang.Exception -> L40
            r0.f38858c = r3     // Catch: java.lang.Exception -> L40
            java.lang.Object r4 = r4.m15592h(r5, r0)     // Catch: java.lang.Exception -> L40
            if (r4 != r1) goto L3d
            return r1
        L3d:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L40:
            r4 = move-exception
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "CallNoteTemplates sync failed, something wrong "
            java.lang.String r4 = a2.AbstractC0030c.m120k(r6, r4)
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15297a(wo.s, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0309  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0330 -> B:14:0x0051). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15298b(wo.C8134s r18, mm.C4802m r19, j$.time.LocalDateTime r20, j$.time.LocalDateTime r21, ww.AbstractC8193c r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15298b(wo.s, mm.m, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r1 != r11) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d9 -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15299c(wo.C8134s r17, mm.C4802m r18, ww.AbstractC8193c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15299c(wo.s, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: o */
    public static /* synthetic */ Object m15300o(C8134s c8134s, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str2, InterfaceC7559c interfaceC7559c, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            localDateTime = null;
        }
        if ((i10 & 4) != 0) {
            localDateTime2 = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return c8134s.m15311n(str, localDateTime, localDateTime2, str2, interfaceC7559c);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:34:0x00ba, B:36:0x00c2, B:37:0x00cb, B:39:0x00d1, B:43:0x00df, B:46:0x00e6, B:48:0x00f7, B:51:0x00fd, B:52:0x0101, B:56:0x012e, B:55:0x0117, B:57:0x0137, B:24:0x0086, B:27:0x009b, B:30:0x00a3, B:59:0x0143, B:61:0x014e), top: B:98:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:34:0x00ba, B:36:0x00c2, B:37:0x00cb, B:39:0x00d1, B:43:0x00df, B:46:0x00e6, B:48:0x00f7, B:51:0x00fd, B:52:0x0101, B:56:0x012e, B:55:0x0117, B:57:0x0137, B:24:0x0086, B:27:0x009b, B:30:0x00a3, B:59:0x0143, B:61:0x014e), top: B:98:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:64:0x0167, B:66:0x0178, B:69:0x0181, B:82:0x01c8, B:75:0x018f, B:77:0x019b, B:79:0x01be, B:63:0x0163, B:23:0x006b), top: B:99:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:64:0x0167, B:66:0x0178, B:69:0x0181, B:82:0x01c8, B:75:0x018f, B:77:0x019b, B:79:0x01be, B:63:0x0163, B:23:0x006b), top: B:99:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8 A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #2 {Exception -> 0x0187, blocks: (B:64:0x0167, B:66:0x0178, B:69:0x0181, B:82:0x01c8, B:75:0x018f, B:77:0x019b, B:79:0x01be, B:63:0x0163, B:23:0x006b), top: B:99:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15301d(android.content.Context r23, j$.time.LocalDateTime r24, j$.time.LocalDateTime r25, java.lang.StringBuilder r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15301d(android.content.Context, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15302e(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof wo.C8119d
            if (r0 == 0) goto L13
            r0 = r9
            wo.d r0 = (wo.C8119d) r0
            int r1 = r0.f38861c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38861c = r1
            goto L18
        L13:
            wo.d r0 = new wo.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f38859a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38861c
            qw.a0 r3 = qw.a0.f30746a
            xm.z r4 = r8.f38951c
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            og.od.m10798c(r9)
            return r3
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            og.od.m10798c(r9)
            goto L77
        L3d:
            og.od.m10798c(r9)
            goto L55
        L41:
            og.od.m10798c(r9)
            r0.f38861c = r7
            fn.i r9 = r4.f41069a
            km.a r9 = r9.f10585a
            java.lang.String r2 = "need_to_fetch_note_from_server"
            km.o r9 = (km.C4120o) r9
            java.lang.Object r9 = r9.m8879a(r2, r0)
            if (r9 != r1) goto L55
            goto L88
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            java.lang.String r9 = "SyncCallLogUseCase"
            java.lang.String r2 = "needToFetchNoteFromServer is true, triggering fetchEditCallNotesForSync"
            yv.t r7 = r8.f38956h
            r7.m16232g(r9, r2)
            pw.a r9 = r8.f38958j
            java.lang.Object r9 = r9.get()
            no.i r9 = (no.C5122i) r9
            r0.f38861c = r6
            java.lang.Object r9 = r9.m10047c(r0)
            if (r9 != r1) goto L77
            goto L88
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            r0.f38861c = r5
            r9 = 0
            java.lang.Object r9 = r4.m15722l(r9, r0)
            if (r9 != r1) goto L89
        L88:
            return r1
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15302e(ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m15303f(q1 q1Var) {
        this.f38949a.m15652C(q1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r14 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r14 = new java.util.ArrayList();
        r0 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (((com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording) r1).m4624a() != zm.EnumC8993c.SUCCESS) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r14.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        r7 = rw.AbstractC6663m.m12737A(r14);
        r13.f38956h.m16231f("Recording sync pending records : " + r7.size() + " >>> " + rw.AbstractC6663m.m12748L(r7, null, null, null, new ub.C7393i(11), 31));
        r6.m15652C(new im.r1(r7.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        return qw.a0.f30746a;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[EDGE_INSN: B:37:0x0087->B:29:0x0087 BREAK  A[LOOP:0: B:20:0x005c->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007f -> B:28:0x0080). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15304g(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15304g(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15305h(int r10, ww.AbstractC8193c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof wo.C8121f
            if (r0 == 0) goto L13
            r0 = r11
            wo.f r0 = (wo.C8121f) r0
            int r1 = r0.f38872d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38872d = r1
            goto L18
        L13:
            wo.f r0 = new wo.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f38870b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38872d
            xm.y5 r3 = r9.f38950b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            int r10 = r0.f38869a
            og.od.m10798c(r11)
            goto L70
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            int r10 = r0.f38869a
            og.od.m10798c(r11)
            goto L4e
        L3c:
            og.od.m10798c(r11)
            r0.f38869a = r10
            r0.f38872d = r5
            fn.i r11 = r3.f41050b
            java.lang.String r2 = "sync_success_time"
            java.lang.Object r11 = r11.m6024d(r2, r0)
            if (r11 != r1) goto L4e
            goto L6f
        L4e:
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L73
            r0.f38869a = r10
            r0.f38872d = r4
            yx.d r11 = r3.f41052d
            uw.h r11 = r11.f42488a
            xm.e5 r2 = new xm.e5
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            java.lang.Object r11 = tx.c0.m13475K(r11, r2, r0)
            if (r11 != r1) goto L70
        L6f:
            return r1
        L70:
            j$.time.LocalDateTime r11 = (j$.time.LocalDateTime) r11
            goto L79
        L73:
            yv.o r11 = yv.C8800o.f42459a
            j$.time.LocalDateTime r11 = yv.C8800o.m16182F(r5)
        L79:
            yv.o r0 = yv.C8800o.f42459a
            java.lang.String r10 = yv.C8800o.m16207p(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15305h(int, ww.c):java.lang.Object");
    }

    /* renamed from: i */
    public final String m15306i() {
        return (String) this.f38963o.getValue();
    }

    /* renamed from: j */
    public final Object m15307j(RestApiException restApiException, AbstractC8193c abstractC8193c) {
        RestApiException.EnumC1454a enumC1454a = restApiException.f7325a;
        int i10 = AbstractC8116a.f38847a[enumC1454a.ordinal()];
        a0 a0Var = a0.f30746a;
        if (i10 != 1) {
            if (i10 == 2) {
                AbstractC8196f.m15349b(Log.d("SyncCallLogUseCase", "handleSyncRestApiException: subscription expired "));
                return a0Var;
            }
            AbstractC8196f.m15349b(Log.d("SyncCallLogUseCase", "syncCallLogsAndHandleErrors: " + enumC1454a.name()));
            return a0Var;
        }
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(restApiException.f7327c)) {
            String str = restApiException.f7327c;
            AbstractC4154l.m8920c(str);
            Object objP0 = this.f38950b.f41049a.P0(str, abstractC8193c);
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (objP0 != enumC7794a) {
                objP0 = a0Var;
            }
            if (objP0 == enumC7794a) {
                return objP0;
            }
        }
        return a0Var;
    }

    /* renamed from: k */
    public final void m15308k(InterfaceC3307i interfaceC3307i) {
        c0.m13502y(this.f38955g, null, null, new C4525k(this, interfaceC3307i, null, 26), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15309l(mm.C4802m r23, int r24, j$.time.LocalDateTime r25, j$.time.LocalDateTime r26, ww.AbstractC8193c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15309l(mm.m, int, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15310m(mm.C4802m r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wo.C8123h
            if (r0 == 0) goto L13
            r0 = r9
            wo.h r0 = (wo.C8123h) r0
            int r1 = r0.f38885d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38885d = r1
            goto L18
        L13:
            wo.h r0 = new wo.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f38883b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38885d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mm.m r8 = r0.f38882a
            og.od.m10798c(r9)
            goto L51
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r9)
            java.lang.String r9 = r8.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r9)
            r0.f38882a = r8
            r0.f38885d = r3
            xm.x1 r2 = r7.f38949a
            yx.d r3 = r2.f40994d
            uw.h r3 = r3.f42488a
            xm.q0 r4 = new xm.q0
            r5 = 0
            r6 = 0
            r4.<init>(r9, r2, r5, r6)
            java.lang.Object r9 = tx.c0.m13475K(r3, r4, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = rw.AbstractC6664n.m12768r(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r9.next()
            com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote r1 = (com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote) r1
            java.lang.String r2 = r1.m4631b()
            if (r2 != 0) goto L78
            com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote r1 = com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote.m4630a(r1)
        L78:
            r0.add(r1)
            goto L62
        L7c:
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L88
            com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest r9 = new com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest
            r9.<init>(r8, r0)
            return r9
        L88:
            com.websoptimization.callyzerbiz.common.exception.DataNotFoundException r9 = new com.websoptimization.callyzerbiz.common.exception.DataNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No callLog notes found for sync this sim:-"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15310m(mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        if (r15 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15311n(java.lang.String r11, j$.time.LocalDateTime r12, j$.time.LocalDateTime r13, java.lang.String r14, uw.InterfaceC7559c r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15311n(java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194 A[PHI: r1 r2 r4 r5 r8 r10 r12 r13 r14
      0x0194: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r2v7 wo.m) = (r2v6 wo.m), (r2v2 wo.m) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r4v7 kotlin.jvm.internal.x) = (r4v6 kotlin.jvm.internal.x), (r4v21 kotlin.jvm.internal.x) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r5v2 qw.a0) = (r5v1 qw.a0), (r5v0 qw.a0) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r8v3 java.util.List) = (r8v2 java.util.List), (r8v6 java.util.List) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r10v2 boolean) = (r10v1 boolean), (r10v0 boolean) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r12v2 java.lang.Object) = (r12v8 java.lang.Object), (r12v7 java.lang.Object) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r13v13 java.util.List) = (r13v12 java.util.List), (r13v15 java.util.List) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r14v9 mm.m) = (r14v8 mm.m), (r14v13 mm.m) binds: [B:56:0x0190, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0314  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Iterator, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0190 -> B:58:0x0194). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15312p(java.util.List r35, mm.C4802m r36, ww.AbstractC8193c r37) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15312p(java.util.List, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (m15312p((java.util.List) r7, r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15313q(mm.C4802m r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wo.C8127l
            if (r0 == 0) goto L13
            r0 = r7
            wo.l r0 = (wo.C8127l) r0
            int r1 = r0.f38910d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38910d = r1
            goto L18
        L13:
            wo.l r0 = new wo.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38908b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38910d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            mm.m r6 = r0.f38907a
            og.od.m10798c(r7)
            goto L4d
        L38:
            og.od.m10798c(r7)
            java.lang.String r7 = r6.f23891c
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            r0.f38907a = r6
            r0.f38910d = r4
            xm.x1 r2 = r5.f38949a
            java.lang.Object r7 = r2.m15663m(r7, r0)
            if (r7 != r1) goto L4d
            goto L5a
        L4d:
            java.util.List r7 = (java.util.List) r7
            r2 = 0
            r0.f38907a = r2
            r0.f38910d = r3
            java.lang.Object r6 = r5.m15312p(r7, r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15313q(mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15314r(mm.C4802m r18, int r19, j$.time.LocalDateTime r20, j$.time.LocalDateTime r21, ww.AbstractC8193c r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15314r(mm.m, int, j$.time.LocalDateTime, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15315s(mm.C4791b r12, ww.AbstractC8193c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15315s(mm.b, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15316t(com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest r5, ww.AbstractC8193c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wo.C8132q
            if (r0 == 0) goto L13
            r0 = r6
            wo.q r0 = (wo.C8132q) r0
            int r1 = r0.f38944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38944c = r1
            goto L18
        L13:
            wo.q r0 = new wo.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f38942a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38944c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            java.util.List r6 = r5.m4689N()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L60
            mm.m r5 = r5.f7363b
            java.lang.String r5 = r5.f23891c
            if (r5 != 0) goto L44
            java.lang.String r5 = ""
        L44:
            r0.f38944c = r3
            xm.y5 r6 = r4.f38950b
            java.lang.Object r6 = r6.m15704t(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L58
            goto L60
        L58:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Sync subscription expired"
            r5.<init>(r6)
            throw r5
        L60:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15316t(com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15317u(ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8134s.m15317u(ww.c):java.lang.Object");
    }
}
