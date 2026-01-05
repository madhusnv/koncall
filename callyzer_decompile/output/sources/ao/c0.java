package ao;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.TelephonyManager;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.sun.mail.imap.IMAPStore;
import com.websoptimization.callyzerbiz.MainActivity;
import f9.C2222e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import po.C5984e;
import q5.C6128u;
import rw.C6668r;
import so.C6877c;
import tx.C7263w;
import tx.m0;
import ug.C7439j;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import wx.InterfaceC8209j;
import xm.C8418z;
import xm.x0;
import xm.x1;
import xm.y5;
import xx.AbstractC8496b;
import xx.C8503i;
import xx.InterfaceC8510p;
import yh.AbstractC8662f;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a */
    public final Context f2923a;

    /* renamed from: b */
    public final C8810d f2924b;

    /* renamed from: c */
    public final Set f2925c;

    /* renamed from: d */
    public final y5 f2926d;

    /* renamed from: e */
    public final x1 f2927e;

    /* renamed from: f */
    public final C8805t f2928f;

    /* renamed from: g */
    public final TelephonyManager f2929g;

    /* renamed from: h */
    public final C6877c f2930h;

    /* renamed from: i */
    public final C5984e f2931i;

    /* renamed from: j */
    public final C8418z f2932j;

    /* renamed from: k */
    public final C8803r f2933k;

    /* renamed from: l */
    public final C7439j f2934l;

    /* renamed from: m */
    public long f2935m;

    /* renamed from: n */
    public long f2936n;

    /* renamed from: o */
    public long f2937o;

    /* renamed from: p */
    public String f2938p;

    /* renamed from: q */
    public ArrayList f2939q;

    /* renamed from: r */
    public LocalDateTime f2940r;

    /* renamed from: s */
    public boolean f2941s;

    /* renamed from: t */
    public boolean f2942t;

    /* renamed from: u */
    public boolean f2943u;

    /* renamed from: v */
    public List f2944v;

    public c0(Context context, C8810d c8810d, AbstractC8662f abstractC8662f, y5 userSIMRepository, x1 callLogsRepository, C8805t c8805t, TelephonyManager telephonyManager, C6877c phoneNumberUseCase, C5984e notificationUseCase, C8418z appPreferencesRepository, C8803r networkMonitorUtil, C7439j c7439j) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        AbstractC4154l.m8923f(phoneNumberUseCase, "phoneNumberUseCase");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f2923a = context;
        this.f2924b = c8810d;
        this.f2925c = abstractC8662f;
        this.f2926d = userSIMRepository;
        this.f2927e = callLogsRepository;
        this.f2928f = c8805t;
        this.f2929g = telephonyManager;
        this.f2930h = phoneNumberUseCase;
        this.f2931i = notificationUseCase;
        this.f2932j = appPreferencesRepository;
        this.f2933k = networkMonitorUtil;
        this.f2934l = c7439j;
        this.f2944v = C6668r.f31943a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1386a(ao.c0 r5, ww.AbstractC8193c r6) throws java.lang.Exception {
        /*
            boolean r0 = r6 instanceof ao.C0370i
            if (r0 == 0) goto L13
            r0 = r6
            ao.i r0 = (ao.C0370i) r0
            int r1 = r0.f2951c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2951c = r1
            goto L18
        L13:
            ao.i r0 = new ao.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2949a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f2951c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            og.od.m10798c(r6)
            goto L5f
        L32:
            og.od.m10798c(r6)
            goto L4e
        L36:
            og.od.m10798c(r6)
            java.lang.String r6 = "android.permission.READ_CALL_LOG"
            android.content.Context r2 = r5.f2923a
            int r6 = r5.AbstractC6468c.m12450a(r2, r6)
            if (r6 != 0) goto L75
            xm.y5 r6 = r5.f2926d
            r0.f2951c = r4
            java.lang.Object r6 = r6.m15705u(r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L72
            r0.f2951c = r3
            java.lang.Object r6 = r5.m1396k(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r6)
            com.websoptimization.callyzerbiz.common.exception.SimStateException r6 = new com.websoptimization.callyzerbiz.common.exception.SimStateException
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r0 = com.websoptimization.callyzerbiz.common.exception.SimStateException.EnumC1456a.IDENTIFY_FROM_DATA_STORE_STATE
            r6.<init>(r0, r5)
            throw r6
        L72:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        L75:
            com.websoptimization.callyzerbiz.common.exception.RunTimePermissionNotGranted r5 = new com.websoptimization.callyzerbiz.common.exception.RunTimePermissionNotGranted
            com.websoptimization.callyzerbiz.common.exception.RunTimePermissionNotGranted$a r6 = com.websoptimization.callyzerbiz.common.exception.RunTimePermissionNotGranted.EnumC1455a.READ_CALL_LOG
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1386a(ao.c0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1387b(ao.c0 r21, ww.AbstractC8193c r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1387b(ao.c0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0256, code lost:
    
        if (r7.m1401p(r13, r12, r14) != r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018c, code lost:
    
        if (r0.m15670t(r14) != r2) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0239 A[Catch: Exception -> 0x025e, PHI: r7 r12 r13
      0x0239: PHI (r7v13 ao.c0) = (r7v12 ao.c0), (r7v14 ao.c0) binds: [B:115:0x0236, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r12v40 java.lang.StringBuilder) = (r12v35 java.lang.StringBuilder), (r12v41 java.lang.StringBuilder) binds: [B:115:0x0236, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r13v34 java.util.Map) = (r13v30 java.util.Map), (r13v36 java.util.Map) binds: [B:115:0x0236, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x025e, blocks: (B:125:0x025a, B:117:0x0239, B:119:0x0243, B:122:0x024a, B:114:0x022c), top: B:137:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5 A[PHI: r12 r13
      0x01c5: PHI (r12v35 java.lang.StringBuilder) = (r12v9 java.lang.StringBuilder), (r12v37 java.lang.StringBuilder) binds: [B:44:0x00d8, B:86:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r13v30 java.util.Map) = (r13v8 java.util.Map), (r13v31 java.util.Map) binds: [B:44:0x00d8, B:86:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1389d(ao.c0 r11, java.util.Map r12, java.lang.StringBuilder r13, ww.AbstractC8193c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1389d(ao.c0, java.util.Map, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00d8: MOVE (r1 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00ea: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00dc: MOVE (r1 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00da: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00e7: MOVE (r8 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00de: MOVE (r9 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00e6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00dd: MOVE (r12 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:22:0x00d8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0790 -> B:286:0x0794). Please report as a decompilation issue!!! */
    /* renamed from: e */
    public static final java.lang.Object m1390e(ao.c0 r28, android.database.Cursor r29, java.lang.StringBuilder r30, j$.time.LocalDateTime r31, java.util.List r32, wx.InterfaceC8210k r33, ww.AbstractC8193c r34) {
        /*
            Method dump skipped, instructions count: 2264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1390e(ao.c0, android.database.Cursor, java.lang.StringBuilder, j$.time.LocalDateTime, java.util.List, wx.k, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r12 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1391f(ao.c0 r11, ww.AbstractC8193c r12) throws java.lang.Throwable {
        /*
            xm.x1 r0 = r11.f2927e
            boolean r1 = r12 instanceof ao.b0
            if (r1 == 0) goto L15
            r1 = r12
            ao.b0 r1 = (ao.b0) r1
            int r2 = r1.f2919c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f2919c = r2
            goto L1a
        L15:
            ao.b0 r1 = new ao.b0
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.f2917a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f2919c
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2d
            og.od.m10798c(r12)
            goto L7b
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            og.od.m10798c(r12)
            goto L57
        L39:
            og.od.m10798c(r12)
            long r7 = r11.f2935m
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L8d
            r1.f2919c = r6
            yx.d r12 = r0.f40994d
            uw.h r12 = r12.f42488a
            xm.r0 r3 = new xm.r0
            r6 = 0
            r3.<init>(r0, r4, r6)
            java.lang.Object r12 = tx.c0.m13475K(r12, r3, r1)
            if (r12 != r2) goto L57
            goto L7a
        L57:
            java.lang.Number r12 = (java.lang.Number) r12
            long r6 = r12.longValue()
            long r8 = r11.f2935m
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L83
            yv.o r12 = yv.C8800o.f42459a
            j$.time.LocalDateTime r12 = yv.C8800o.m16182F(r8)
            r1.f2919c = r5
            yx.d r3 = r0.f40994d
            uw.h r3 = r3.f42488a
            xm.y0 r5 = new xm.y0
            r5.<init>(r0, r12, r4)
            java.lang.Object r12 = tx.c0.m13475K(r3, r5, r1)
            if (r12 != r2) goto L7b
        L7a:
            return r2
        L7b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L8d
        L83:
            yv.o r12 = yv.C8800o.f42459a
            long r0 = r11.f2935m
            j$.time.LocalDateTime r12 = yv.C8800o.m16182F(r0)
            r11.f2940r = r12
        L8d:
            qw.a0 r11 = qw.a0.f30746a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1391f(ao.c0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1392g(android.database.Cursor r6) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1392g(android.database.Cursor):java.lang.String");
    }

    /* renamed from: h */
    public final InterfaceC8209j m1393h(long j6, long j10, long j11, String callerTag) {
        AbstractC4154l.m8923f(callerTag, "callerTag");
        this.f2935m = j6;
        this.f2936n = j10;
        this.f2937o = j11;
        this.f2938p = callerTag;
        InterfaceC8209j c2222e = new C2222e(new a0(this, null));
        C0496f c0496f = m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        if (executorC0495e.o0(C7263w.f34689b) == null) {
            return executorC0495e.equals(C7565i.f36440a) ? c2222e : c2222e instanceof InterfaceC8510p ? AbstractC8496b.m15788a((InterfaceC8510p) c2222e, executorC0495e, 0, null, 6) : new C8503i(c2222e, executorC0495e, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + executorC0495e).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1394i(java.lang.String r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1394i(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8 A[PHI: r8
      0x02f8: PHI (r8v16 java.lang.String) = (r8v15 java.lang.String), (r8v17 java.lang.String), (r8v17 java.lang.String), (r8v17 java.lang.String) binds: [B:130:0x02d8, B:132:0x02e2, B:134:0x02e8, B:139:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131 A[Catch: g -> 0x017e, TryCatch #0 {g -> 0x017e, blocks: (B:40:0x012b, B:42:0x0131, B:44:0x0137, B:46:0x013b, B:49:0x0148, B:53:0x0182, B:54:0x0187, B:34:0x00fd, B:36:0x0104), top: B:160:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1395j(android.database.Cursor r32, java.lang.StringBuilder r33, ww.AbstractC8193c r34) throws ao.C0369h {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1395j(android.database.Cursor, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1396k(ww.AbstractC8193c r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ao.C0375n
            if (r0 == 0) goto L13
            r0 = r14
            ao.n r0 = (ao.C0375n) r0
            int r1 = r0.f2994j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2994j = r1
            goto L18
        L13:
            ao.n r0 = new ao.n
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f2992g
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f2994j
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r1 = r0.f2991f
            java.lang.StringBuilder r3 = r0.f2990e
            java.lang.String r4 = r0.f2989d
            java.lang.String r5 = r0.f2988c
            java.lang.StringBuilder r6 = r0.f2987b
            java.lang.StringBuilder r0 = r0.f2986a
            og.od.m10798c(r14)
            goto L6f
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3b:
            og.od.m10798c(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            yv.o r2 = yv.C8800o.f42459a
            long r4 = r13.f2935m
            java.lang.String r4 = yv.C8800o.m16211t(r4)
            long r5 = r13.f2936n
            java.lang.String r5 = yv.C8800o.m16211t(r5)
            long r6 = r13.f2937o
            r0.f2986a = r14
            r0.f2987b = r14
            r0.f2988c = r5
            r0.f2989d = r4
            r0.f2990e = r14
            r0.f2991f = r6
            r0.f2994j = r3
            xm.y5 r2 = r13.f2926d
            java.lang.Object r0 = r2.m15696l(r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r3 = r14
            r1 = r6
            r6 = r3
            r14 = r0
            r0 = r6
        L6f:
            r7 = r14
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r11 = 0
            r12 = 56
            java.lang.String r8 = ","
            java.lang.String r9 = "["
            java.lang.String r10 = "]"
            java.lang.String r14 = rw.AbstractC6663m.m12748L(r7, r8, r9, r10, r11, r12)
            java.lang.String r7 = " >>> endDate := "
            java.lang.String r8 = " >>> lastCallLogId := "
            java.lang.String r9 = " startDate := "
            java.lang.StringBuilder r4 = a2.AbstractC0030c.m127r(r9, r4, r7, r5, r8)
            r4.append(r1)
            java.lang.String r1 = " >>> connectedSim := "
            r4.append(r1)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            r3.append(r14)
            java.lang.String r14 = "\n >>> "
            r6.append(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1396k(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        if (m1401p(r12, r2, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1397l(java.util.Map r10, java.lang.StringBuilder r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1397l(java.util.Map, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1398m(java.lang.String r5, java.lang.String r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ao.C0377p
            if (r0 == 0) goto L13
            r0 = r7
            ao.p r0 = (ao.C0377p) r0
            int r1 = r0.f3006e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3006e = r1
            goto L18
        L13:
            ao.p r0 = new ao.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f3004c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3006e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.f3003b
            java.lang.String r5 = r0.f3002a
            og.od.m10798c(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            r0.f3002a = r5
            r0.f3003b = r6
            r0.f3006e = r3
            xm.z r7 = r4.f2932j
            java.io.Serializable r7 = r7.m15713c(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L4b:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r7.next()
            r2 = r0
            mm.j r2 = (mm.C4799j) r2
            java.lang.String r3 = r2.f23882b
            boolean r3 = r3.contentEquals(r5)
            if (r3 == 0) goto L4b
            java.lang.String r2 = r2.f23883c
            boolean r2 = r2.contentEquals(r6)
            if (r2 == 0) goto L4b
            goto L6b
        L6a:
            r0 = r1
        L6b:
            mm.j r0 = (mm.C4799j) r0
            if (r0 == 0) goto L78
            java.lang.String r5 = r0.f23884d
            int r6 = r5.length()
            if (r6 <= 0) goto L78
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1398m(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1399n(java.lang.String r7, java.lang.StringBuilder r8, ww.AbstractC8193c r9) throws ao.C0368g {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1399n(java.lang.String, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* renamed from: o */
    public final Object m1400o(Map map, StringBuilder sb2, AbstractC8193c abstractC8193c) throws Throwable {
        Collection collection;
        EnumC0367f enumC0367f = EnumC0367f.COMPLETE;
        boolean zContainsKey = map.containsKey(enumC0367f);
        qw.a0 a0Var = qw.a0.f30746a;
        if (zContainsKey && (collection = (Collection) map.get(enumC0367f)) != null && !collection.isEmpty()) {
            List list = (List) map.get(enumC0367f);
            InterfaceC7559c interfaceC7559c = null;
            sb2.append(" >>> Complete callLog size := " + (list != null ? new Integer(list.size()) : null));
            Object obj = map.get(enumC0367f);
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.data.model.CallLog>");
            x1 x1Var = this.f2927e;
            Object objM13475K = tx.c0.m13475K(x1Var.f40994d.f42488a, new x0((List) obj, x1Var, interfaceC7559c, 0), abstractC8193c);
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (objM13475K != enumC7794a) {
                objM13475K = a0Var;
            }
            if (objM13475K == enumC7794a) {
                return objM13475K;
            }
        }
        return a0Var;
    }

    /* renamed from: p */
    public final Object m1401p(Map map, StringBuilder sb2, AbstractC8193c abstractC8193c) throws Throwable {
        Collection collection;
        EnumC0367f enumC0367f = EnumC0367f.CORRUPT;
        boolean zContainsKey = map.containsKey(enumC0367f);
        qw.a0 a0Var = qw.a0.f30746a;
        if (zContainsKey && (collection = (Collection) map.get(enumC0367f)) != null && !collection.isEmpty()) {
            List list = (List) map.get(enumC0367f);
            InterfaceC7559c interfaceC7559c = null;
            sb2.append(" >>> Corrupt callLog size := " + (list != null ? new Integer(list.size()) : null));
            Object obj = map.get(enumC0367f);
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.data.model.CorruptCallLog>");
            x1 x1Var = this.f2927e;
            Object objM13475K = tx.c0.m13475K(x1Var.f40994d.f42488a, new x0(x1Var, (List) obj, interfaceC7559c, 1), abstractC8193c);
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (objM13475K != enumC7794a) {
                objM13475K = a0Var;
            }
            if (objM13475K == enumC7794a) {
                return objM13475K;
            }
        }
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (r12 != r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1402q(java.util.Map r10, java.lang.StringBuilder r11, ww.AbstractC8193c r12) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = " >>> Fake callLog size := "
            boolean r1 = r12 instanceof ao.C0380s
            if (r1 == 0) goto L15
            r1 = r12
            ao.s r1 = (ao.C0380s) r1
            int r2 = r1.f3022f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3022f = r2
            goto L1a
        L15:
            ao.s r1 = new ao.s
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.f3020d
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f3022f
            qw.a0 r4 = qw.a0.f30746a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3d
            if (r3 != r5) goto L35
            java.lang.String r10 = r1.f3019c
            yv.t r11 = r1.f3018b
            java.lang.Exception r0 = r1.f3017a
            og.od.m10798c(r12)
            goto Lbb
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            og.od.m10798c(r12)     // Catch: java.lang.Exception -> L41
            return r4
        L41:
            r10 = move-exception
            r0 = r10
            goto La5
        L44:
            og.od.m10798c(r12)
            ao.f r12 = ao.EnumC0367f.FAKE
            boolean r3 = r10.containsKey(r12)
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r10.get(r12)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto Lc9
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5e
            goto Lc9
        L5e:
            java.lang.Object r3 = r10.get(r12)     // Catch: java.lang.Exception -> L41
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L41
            r7 = 0
            if (r3 == 0) goto L71
            int r3 = r3.size()     // Catch: java.lang.Exception -> L41
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Exception -> L41
            r8.<init>(r3)     // Catch: java.lang.Exception -> L41
            goto L72
        L71:
            r8 = r7
        L72:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r3.<init>(r0)     // Catch: java.lang.Exception -> L41
            r3.append(r8)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L41
            r11.append(r0)     // Catch: java.lang.Exception -> L41
            xm.x1 r11 = r9.f2927e     // Catch: java.lang.Exception -> L41
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Exception -> L41
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.data.model.FakeCallLog>"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r10, r12)     // Catch: java.lang.Exception -> L41
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L41
            r1.f3022f = r6     // Catch: java.lang.Exception -> L41
            yx.d r12 = r11.f40994d     // Catch: java.lang.Exception -> L41
            uw.h r12 = r12.f42488a     // Catch: java.lang.Exception -> L41
            xm.x0 r0 = new xm.x0     // Catch: java.lang.Exception -> L41
            r3 = 2
            r0.<init>(r11, r10, r7, r3)     // Catch: java.lang.Exception -> L41
            java.lang.Object r10 = tx.c0.m13475K(r12, r0, r1)     // Catch: java.lang.Exception -> L41
            if (r10 != r2) goto La1
            goto La2
        La1:
            r10 = r4
        La2:
            if (r10 != r2) goto Lc9
            goto Lba
        La5:
            r0.printStackTrace()
            r1.f3017a = r0
            yv.t r11 = r9.f2928f
            r1.f3018b = r11
            java.lang.String r10 = "FakeCallLog"
            r1.f3019c = r10
            r1.f3022f = r5
            java.lang.Object r12 = r9.m1396k(r1)
            if (r12 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            java.lang.StringBuilder r12 = (java.lang.StringBuilder) r12
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r12, r1)
            r11.m16233h(r10, r12, r0)
        Lc9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1402q(java.util.Map, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1403r(java.lang.String r5, java.lang.String r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ao.C0382u
            if (r0 == 0) goto L13
            r0 = r7
            ao.u r0 = (ao.C0382u) r0
            int r1 = r0.f3033e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3033e = r1
            goto L18
        L13:
            ao.u r0 = new ao.u
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f3031c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3033e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.f3030b
            java.lang.String r5 = r0.f3029a
            og.od.m10798c(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            r0.f3029a = r5
            r0.f3030b = r6
            r0.f3033e = r3
            xm.z r7 = r4.f2932j
            java.io.Serializable r7 = r7.m15713c(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L4b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r7.next()
            r1 = r0
            mm.j r1 = (mm.C4799j) r1
            java.lang.String r2 = r1.f23882b
            boolean r2 = r2.contentEquals(r5)
            if (r2 == 0) goto L4b
            java.lang.String r1 = r1.f23883c
            boolean r1 = r1.contentEquals(r6)
            if (r1 == 0) goto L4b
            goto L6a
        L69:
            r0 = 0
        L6a:
            mm.j r0 = (mm.C4799j) r0
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r3 = 0
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1403r(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:31:0x009e). Please report as a decompilation issue!!! */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m1404s(java.util.List r10, ww.AbstractC8193c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ao.C0383v
            if (r0 == 0) goto L13
            r0 = r11
            ao.v r0 = (ao.C0383v) r0
            int r1 = r0.f3041h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3041h = r1
            goto L18
        L13:
            ao.v r0 = new ao.v
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f3039f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3041h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.f3038e
            java.lang.Object r2 = r0.f3037d
            java.util.Iterator r5 = r0.f3036c
            java.util.ArrayList r6 = r0.f3035b
            java.util.ArrayList r7 = r0.f3034a
            og.od.m10798c(r11)
            goto L9e
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            og.od.m10798c(r11)
            if (r10 == 0) goto L5a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r10.next()
            boolean r5 = r2 instanceof mm.C4791b
            if (r5 == 0) goto L48
            r11.add(r2)
            goto L48
        L5a:
            rw.r r11 = rw.C6668r.f31943a
        L5c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
            r7 = r10
            r5 = r11
            r6 = r2
            r10 = r4
        L6e:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r2 = r5.next()
            r11 = r2
            mm.b r11 = (mm.C4791b) r11
            boolean r8 = r11.f23842k
            if (r8 == 0) goto Laa
            mm.c r11 = r11.f23833b
            java.lang.String r11 = r11.f23850g
            kotlin.jvm.internal.AbstractC4154l.m8920c(r11)
            r0.getClass()
            r0.f3034a = r7
            r0.f3035b = r6
            r0.f3036c = r5
            r0.f3037d = r2
            r0.f3038e = r10
            r0.f3041h = r3
            xm.y5 r8 = r9.f2926d
            java.lang.Object r11 = r8.m15695k(r11, r0)
            if (r11 != r1) goto L9e
            return r1
        L9e:
            mm.m r11 = (mm.C4802m) r11
            if (r11 == 0) goto La5
            boolean r11 = r11.f23903o
            goto La6
        La5:
            r11 = r4
        La6:
            if (r11 == 0) goto Laa
            r11 = r3
            goto Lab
        Laa:
            r11 = r4
        Lab:
            if (r11 == 0) goto Lb1
            r7.add(r2)
            goto L6e
        Lb1:
            r6.add(r2)
            goto L6e
        Lb5:
            qw.k r10 = new qw.k
            r10.<init>(r7, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1404s(java.util.List, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r4 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rw.r] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bc -> B:62:0x0145). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0121 -> B:50:0x0124). Please report as a decompilation issue!!! */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m1405t(java.util.List r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1405t(java.util.List, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1406u(java.util.Map r17, ww.AbstractC8193c r18) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c0.m1406u(java.util.Map, ww.c):java.lang.Object");
    }

    /* renamed from: v */
    public final void m1407v() {
        Uri uri = Uri.parse("callbiz://com_websoptimization/missing_calls");
        Context context = this.f2923a;
        Intent intent = new Intent("android.intent.action.VIEW", uri, context, MainActivity.class);
        C6128u c6128u = new C6128u(context);
        c6128u.m12158a(intent);
        C5984e.m12016g(this.f2931i, 763, "There are some call logs which has missing call details. Please provide the missing details.", "Missing Call Details", null, c6128u.m12159b(0), false, null, false, null, IMAPStore.RESPONSE);
    }
}
