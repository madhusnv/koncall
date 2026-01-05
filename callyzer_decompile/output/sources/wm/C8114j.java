package wm;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ao.c0;
import c4.C0861k;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import com.websoptimization.callyzerbiz.services.NotePopupService;
import hm.RunnableC2966b;
import im.p1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import lm.AbstractC4487b;
import lm.C4486a;
import ln.C4494g;
import mq.C4833a;
import om.C5415q;
import oo.C5431l;
import pv.C6042b;
import rn.h0;
import tx.InterfaceC7266z;
import uo.C7476a;
import uo.C7481f;
import wo.C8134s;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.C8418z;
import xm.y5;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.j */
/* loaded from: classes3.dex */
public final class C8114j extends ContentObserver {

    /* renamed from: a */
    public final CallMonitorService f38826a;

    /* renamed from: b */
    public final InterfaceC7266z f38827b;

    /* renamed from: c */
    public final C7481f f38828c;

    /* renamed from: d */
    public final C8805t f38829d;

    /* renamed from: e */
    public final C7476a f38830e;

    /* renamed from: f */
    public final C8418z f38831f;

    /* renamed from: g */
    public final y5 f38832g;

    /* renamed from: h */
    public final c0 f38833h;

    /* renamed from: i */
    public final h0 f38834i;

    /* renamed from: j */
    public final C8134s f38835j;

    /* renamed from: k */
    public final C9000c f38836k;

    /* renamed from: l */
    public final C5431l f38837l;

    /* renamed from: m */
    public final C4494g f38838m;

    /* renamed from: n */
    public final C8803r f38839n;

    /* renamed from: o */
    public final C0861k f38840o;

    /* renamed from: p */
    public final m1 f38841p;

    /* renamed from: q */
    public final w0 f38842q;

    /* renamed from: r */
    public final String f38843r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8114j(CallMonitorService callMonitorService, C8810d mIoCoroutineScope, C7481f simVerificationUseCase, C8805t c8805t, C7476a callDetailVerificationUseCase, C8418z appPreferencesRepository, y5 simDetailRepository, c0 fetchCallLogUseCase, h0 callRecordingUseCase, C8134s syncCallLogUseCase, C9000c workManagerUseCase, C5431l notePopUpUseCase, C4494g c4494g, C8803r networkMonitorUtil, C0861k callLogObserverUseCase) {
        super(new Handler(Looper.getMainLooper()));
        AbstractC4154l.m8923f(mIoCoroutineScope, "mIoCoroutineScope");
        AbstractC4154l.m8923f(simVerificationUseCase, "simVerificationUseCase");
        AbstractC4154l.m8923f(callDetailVerificationUseCase, "callDetailVerificationUseCase");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(simDetailRepository, "simDetailRepository");
        AbstractC4154l.m8923f(fetchCallLogUseCase, "fetchCallLogUseCase");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(syncCallLogUseCase, "syncCallLogUseCase");
        AbstractC4154l.m8923f(workManagerUseCase, "workManagerUseCase");
        AbstractC4154l.m8923f(notePopUpUseCase, "notePopUpUseCase");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        AbstractC4154l.m8923f(callLogObserverUseCase, "callLogObserverUseCase");
        this.f38826a = callMonitorService;
        this.f38827b = mIoCoroutineScope;
        this.f38828c = simVerificationUseCase;
        this.f38829d = c8805t;
        this.f38830e = callDetailVerificationUseCase;
        this.f38831f = appPreferencesRepository;
        this.f38832g = simDetailRepository;
        this.f38833h = fetchCallLogUseCase;
        this.f38834i = callRecordingUseCase;
        this.f38835j = syncCallLogUseCase;
        this.f38836k = workManagerUseCase;
        this.f38837l = notePopUpUseCase;
        this.f38838m = c4494g;
        this.f38839n = networkMonitorUtil;
        this.f38840o = callLogObserverUseCase;
        m1 m1VarM15372c = c1.m15372c(new C6042b());
        this.f38841p = m1VarM15372c;
        this.f38842q = new w0(m1VarM15372c);
        this.f38843r = "CallLogObserver";
    }

    /* renamed from: a */
    public static void m15286a(Context context, Intent intent, C5415q c5415q, boolean z6, C8114j c8114j) {
        String str;
        String string;
        String str2;
        boolean z10 = c5415q.f27211q;
        boolean z11 = c5415q.f27212r;
        String str3 = c8114j.f38843r;
        C8805t c8805t = c8114j.f38829d;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            if (z11) {
                str2 = "Showing " + (z6 ? "LEAD" : "GENERAL") + " " + (z10 ? " Verification" : " not verification ") + " CorruptCallLog popup";
            } else {
                str2 = "Showing " + (z6 ? "LEAD" : "GENERAL") + " " + (z10 ? " Verification" : " not verification ") + " call notes popup";
            }
            c8805t.m16232g(str3, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (z11) {
                str = z6 ? "LEAD" : "GENERAL";
                String str4 = z10 ? " Verification" : " not verification ";
                String localizedMessage = e2.getLocalizedMessage();
                StringBuilder sbM127r = AbstractC0030c.m127r("Exception on ", str, " ", str4, " CorruptCallLog popup: ");
                sbM127r.append(localizedMessage);
                string = sbM127r.toString();
            } else {
                str = z6 ? "LEAD" : "GENERAL";
                String str5 = z10 ? " Verification" : "General";
                String localizedMessage2 = e2.getLocalizedMessage();
                StringBuilder sbM127r2 = AbstractC0030c.m127r("Exception on ", str, " ", str5, " complete call notes popup: ");
                sbM127r2.append(localizedMessage2);
                string = sbM127r2.toString();
            }
            c8805t.m16238m(string, e2);
            c8805t.m16233h(str3, string, e2);
        }
    }

    /* renamed from: b */
    public static void m15287b(Context context, Intent intent, C8114j c8114j, C6042b c6042b) {
        C8805t c8805t = c8114j.f38829d;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            c8805t.m16232g(c8114j.f38843r, "show " + (c6042b.f29501b ? "LEAD" : "GENERAL") + " complete call notes popup");
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.toString();
            c8805t.m16236k(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.content.Context] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ad -> B:26:0x00b1). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15288c(wm.C8114j r17, com.websoptimization.callyzerbiz.services.CallMonitorService r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15288c(wm.j, com.websoptimization.callyzerbiz.services.CallMonitorService, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r10.m15295j(r11, r12, r3) == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15289d(wm.C8114j r10, android.content.Context r11, ww.AbstractC8193c r12) {
        /*
            tx.z r0 = r10.f38827b
            java.lang.String r1 = r10.f38843r
            yv.t r2 = r10.f38829d
            boolean r3 = r12 instanceof wm.C8108d
            if (r3 == 0) goto L19
            r3 = r12
            wm.d r3 = (wm.C8108d) r3
            int r4 = r3.f38794d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f38794d = r4
            goto L1e
        L19:
            wm.d r3 = new wm.d
            r3.<init>(r10, r12)
        L1e:
            java.lang.Object r12 = r3.f38792b
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f38794d
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L43
            if (r5 == r8) goto L3d
            if (r5 != r7) goto L35
            og.od.m10798c(r12)     // Catch: java.lang.Exception -> L33
            goto Lac
        L33:
            r11 = move-exception
            goto L8e
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            android.content.Context r11 = r3.f38791a
            og.od.m10798c(r12)
            goto L68
        L43:
            og.od.m10798c(r12)
            wm.c r12 = new wm.c
            r5 = 1
            r12.<init>(r10, r9, r5)
            tx.c0.m13502y(r0, r9, r9, r12, r6)
            boolean r12 = android.provider.Settings.canDrawOverlays(r11)
            if (r12 != 0) goto L5b
            int r12 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r12 >= r5) goto La7
        L5b:
            xm.z r12 = r10.f38831f
            r3.f38791a = r11
            r3.f38794d = r8
            java.lang.Enum r12 = r12.m15714d(r3)
            if (r12 != r4) goto L68
            goto L8d
        L68:
            yv.l r5 = yv.EnumC8797l.OPTION_NEVER
            if (r12 == r5) goto La7
            c4.k r12 = r10.f38840o     // Catch: java.lang.Exception -> L33
            r12.getClass()     // Catch: java.lang.Exception -> L33
            android.database.Cursor r12 = c4.C0861k.m2300h(r11)     // Catch: java.lang.Exception -> L33
            if (r12 == 0) goto Lac
            int r5 = r12.getCount()     // Catch: java.lang.Exception -> L33
            if (r5 <= 0) goto Lac
            boolean r5 = r12.moveToFirst()     // Catch: java.lang.Exception -> L33
            if (r5 == 0) goto Lac
            r3.f38791a = r9     // Catch: java.lang.Exception -> L33
            r3.f38794d = r7     // Catch: java.lang.Exception -> L33
            java.lang.Object r11 = r10.m15295j(r11, r12, r3)     // Catch: java.lang.Exception -> L33
            if (r11 != r4) goto Lac
        L8d:
            return r4
        L8e:
            r11.printStackTrace()
            java.lang.String r12 = r11.getLocalizedMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "handleDataLoadedSuccess >>> exception caught while processing callLog for note popup "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r2.m16233h(r1, r12, r11)
            goto Lac
        La7:
            java.lang.String r11 = "fetchCallLogUseCase else DrawOverlays permission is false, READ_CALL_LOG is not granted or OPTION_NEVER selected"
            r2.m16232g(r1, r11)
        Lac:
            wm.c r11 = new wm.c
            r12 = 2
            r11.<init>(r10, r9, r12)
            tx.c0.m13502y(r0, r9, r9, r11, r6)
            qw.a0 r10 = qw.a0.f30746a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15289d(wm.j, android.content.Context, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r3.m16471g(r13) == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
    
        if (r3.m16471g(r13) == r7) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15290e(wm.C8114j r17, ww.AbstractC8193c r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15290e(wm.j, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15291f(java.lang.String r10, j$.time.LocalDateTime r11, ww.AbstractC8193c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof wm.C8105a
            if (r0 == 0) goto L13
            r0 = r12
            wm.a r0 = (wm.C8105a) r0
            int r1 = r0.f38778e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38778e = r1
            goto L18
        L13:
            wm.a r0 = new wm.a
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f38776c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38778e
            r3 = 0
            r4 = 0
            wx.w0 r5 = r9.f38842q
            wx.m1 r6 = r9.f38841p
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            j$.time.LocalDateTime r11 = r0.f38775b
            java.lang.String r10 = r0.f38774a
            og.od.m10798c(r12)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            og.od.m10798c(r12)
        L3c:
            java.lang.Object r12 = r6.getValue()
            r2 = r12
            pv.b r2 = (pv.C6042b) r2
            r8 = -1
            pv.b r2 = pv.C6042b.m12051a(r2, r4, r3, r8, r7)
            boolean r12 = r6.m15397i(r12, r2)
            if (r12 == 0) goto L3c
            wx.k1 r12 = r5.f39340a
            java.lang.Object r12 = r12.getValue()
            pv.b r12 = (pv.C6042b) r12
            java.util.List r12 = r12.f29500a
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto Ldd
            kotlin.jvm.internal.AbstractC4154l.m8920c(r10)
            r0.f38774a = r10
            r0.f38775b = r11
            r0.f38778e = r7
            oo.l r12 = r9.f38837l
            java.lang.Object r12 = r12.m11125b(r10, r11, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            om.p r12 = (om.C5414p) r12
            if (r12 == 0) goto Lbb
            wx.k1 r11 = r5.f39340a
            java.lang.Object r11 = r11.getValue()
            pv.b r11 = (pv.C6042b) r11
            java.util.List r11 = r11.f29500a
            java.util.Iterator r11 = r11.iterator()
        L82:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r0 = r11.next()
            int r1 = r3 + 1
            if (r3 < 0) goto Lb7
            mm.j r0 = (mm.C4799j) r0
            java.lang.String r2 = r0.f23882b
            boolean r2 = r2.contentEquals(r10)
            if (r2 == 0) goto Lb5
            java.lang.String r0 = r0.f23883c
            java.lang.String r2 = r12.f27194l
            boolean r0 = r0.contentEquals(r2)
            if (r0 == 0) goto Lb5
        La4:
            java.lang.Object r0 = r6.getValue()
            r2 = r0
            pv.b r2 = (pv.C6042b) r2
            pv.b r2 = pv.C6042b.m12051a(r2, r4, r7, r3, r7)
            boolean r0 = r6.m15397i(r0, r2)
            if (r0 == 0) goto La4
        Lb5:
            r3 = r1
            goto L82
        Lb7:
            og.pe.m10842q()
            throw r4
        Lbb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "checkForLeadInList - CallerNumber: "
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = " ,callDateTime :"
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = " , callLog found null ,"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            yv.t r11 = r9.f38829d
            java.lang.String r12 = "Note-popUp"
            r11.m16232g(r12, r10)
        Ldd:
            qw.a0 r10 = qw.a0.f30746a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15291f(java.lang.String, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15292g(pv.C6041a r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wm.C8109e
            if (r0 == 0) goto L13
            r0 = r9
            wm.e r0 = (wm.C8109e) r0
            int r1 = r0.f38797c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38797c = r1
            goto L18
        L13:
            wm.e r0 = new wm.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f38795a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38797c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r9)
            goto L91
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            og.od.m10798c(r9)
            java.lang.String r8 = r8.f29496a
            wx.w0 r9 = r7.f38842q
            wx.k1 r2 = r9.f39340a
            java.lang.Object r2 = r2.getValue()
            pv.b r2 = (pv.C6042b) r2
            boolean r2 = r2.f29501b
            wx.k1 r4 = r9.f39340a
            java.lang.Object r4 = r4.getValue()
            pv.b r4 = (pv.C6042b) r4
            int r4 = r4.f29502c
            wx.k1 r9 = r9.f39340a
            java.lang.Object r9 = r9.getValue()
            pv.b r9 = (pv.C6042b) r9
            java.util.List r9 = r9.f29500a
            int r9 = r9.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "CallNumber:="
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r8 = ">>> IsNumberExistingInLead = "
            r5.append(r8)
            r5.append(r2)
            java.lang.String r8 = " >>> leadFoundIndex:="
            r5.append(r8)
            r5.append(r4)
            java.lang.String r8 = ">>> leadCallSize:="
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = r5.toString()
            yv.t r9 = r7.f38829d
            java.lang.String r2 = r7.f38843r
            r9.m16232g(r2, r8)
            r0.f38797c = r3
            xm.z r8 = r7.f38831f
            r9 = 0
            java.lang.Object r8 = r8.m15721k(r9, r0)
            if (r8 != r1) goto L91
            return r1
        L91:
            im.p1 r8 = im.p1.LEAD_NUMBERS_LIST
            rw.r r9 = rw.C6668r.f31943a
            ln.g r0 = r7.f38838m
            r0.m9337b(r8, r9)
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15292g(pv.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r8.m15721k(false, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[PHI: r9 r10 r13
      0x0074: PHI (r9v1 wx.m1) = (r9v0 wx.m1), (r9v2 wx.m1) binds: [B:25:0x006f, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r10v1 pv.a) = (r10v0 pv.a), (r10v2 pv.a) binds: [B:25:0x006f, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:25:0x006f, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[PHI: r2 r6 r9 r10 r13 r14
      0x008e: PHI (r2v3 pv.b) = (r2v2 pv.b), (r2v6 pv.b) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r6v2 java.lang.Object) = (r6v1 java.lang.Object), (r6v3 java.lang.Object) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r9v2 wx.m1) = (r9v1 wx.m1), (r9v3 wx.m1) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r10v2 pv.a) = (r10v1 pv.a), (r10v3 pv.a) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r13v4 int) = (r13v3 int), (r13v23 int) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v1 java.lang.Object) binds: [B:27:0x008b, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008b -> B:29:0x008e). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15293h(pv.C6041a r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15293h(pv.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0339, code lost:
    
        if (r3 == r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        if (r0 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036e A[Catch: ArrayIndexOutOfBoundsException -> 0x038d, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x038d, blocks: (B:113:0x0360, B:115:0x036e, B:120:0x0393, B:122:0x03ab, B:124:0x03d0, B:144:0x043b, B:119:0x0390), top: B:156:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0390 A[Catch: ArrayIndexOutOfBoundsException -> 0x038d, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x038d, blocks: (B:113:0x0360, B:115:0x036e, B:120:0x0393, B:122:0x03ab, B:124:0x03d0, B:144:0x043b, B:119:0x0390), top: B:156:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ab A[Catch: ArrayIndexOutOfBoundsException -> 0x038d, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x038d, blocks: (B:113:0x0360, B:115:0x036e, B:120:0x0393, B:122:0x03ab, B:124:0x03d0, B:144:0x043b, B:119:0x0390), top: B:156:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ef A[Catch: ArrayIndexOutOfBoundsException -> 0x03f5, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03f5, blocks: (B:126:0x03e7, B:128:0x03ef, B:131:0x03f9, B:133:0x03fd, B:135:0x0403, B:139:0x040f, B:141:0x0413, B:142:0x0418, B:138:0x040a), top: B:150:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040a A[Catch: ArrayIndexOutOfBoundsException -> 0x03f5, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03f5, blocks: (B:126:0x03e7, B:128:0x03ef, B:131:0x03f9, B:133:0x03fd, B:135:0x0403, B:139:0x040f, B:141:0x0413, B:142:0x0418, B:138:0x040a), top: B:150:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0413 A[Catch: ArrayIndexOutOfBoundsException -> 0x03f5, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x03f5, blocks: (B:126:0x03e7, B:128:0x03ef, B:131:0x03f9, B:133:0x03fd, B:135:0x0403, B:139:0x040f, B:141:0x0413, B:142:0x0418, B:138:0x040a), top: B:150:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0298  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15294i(android.content.Context r43, pv.C6041a r44, ww.AbstractC8193c r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15294i(android.content.Context, pv.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[PHI: r4 r12
      0x00da: PHI (r4v10 pv.a) = (r4v8 pv.a), (r4v8 pv.a), (r4v11 pv.a) binds: [B:37:0x00d6, B:34:0x00c7, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r12v8 android.content.Context) = (r12v6 android.content.Context), (r12v6 android.content.Context), (r12v9 android.content.Context) binds: [B:37:0x00d6, B:34:0x00c7, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[PHI: r4 r12
      0x00ea: PHI (r4v12 pv.a) = (r4v10 pv.a), (r4v13 pv.a) binds: [B:40:0x00e6, B:16:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r12v10 android.content.Context) = (r12v8 android.content.Context), (r12v11 android.content.Context) binds: [B:40:0x00e6, B:16:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[PHI: r0 r4 r12
      0x00ff: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:43:0x00fb, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r4v14 pv.a) = (r4v12 pv.a), (r4v16 pv.a) binds: [B:43:0x00fb, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r12v12 android.content.Context) = (r12v10 android.content.Context), (r12v13 android.content.Context) binds: [B:43:0x00fb, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[Catch: Exception -> 0x0192, TRY_ENTER, TryCatch #0 {Exception -> 0x0192, blocks: (B:60:0x017d, B:63:0x0187, B:68:0x0197, B:70:0x01ab, B:72:0x01b8, B:67:0x0194), top: B:80:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194 A[Catch: Exception -> 0x0192, TryCatch #0 {Exception -> 0x0192, blocks: (B:60:0x017d, B:63:0x0187, B:68:0x0197, B:70:0x01ab, B:72:0x01b8, B:67:0x0194), top: B:80:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab A[Catch: Exception -> 0x0192, TryCatch #0 {Exception -> 0x0192, blocks: (B:60:0x017d, B:63:0x0187, B:68:0x0197, B:70:0x01ab, B:72:0x01b8, B:67:0x0194), top: B:80:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15295j(android.content.Context r33, android.database.Cursor r34, ww.AbstractC8193c r35) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C8114j.m15295j(android.content.Context, android.database.Cursor, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final void m15296k(Context context, C5415q c5415q) {
        C8114j c8114j;
        C5415q c5415q2;
        String string;
        boolean z6 = ((C6042b) this.f38842q.f39340a.getValue()).f29501b;
        try {
            this.f38838m.m9337b(p1.NOTE_POPUP_CALL_DETAILS, c5415q);
            c8114j = this;
            c5415q2 = c5415q;
            try {
                new Handler(Looper.getMainLooper()).post(new RunnableC2966b(context, new Intent(context, (Class<?>) NotePopupService.class), c5415q2, z6, c8114j, 1));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                exc.printStackTrace();
                C8805t c8805t = c8114j.f38829d;
                c8805t.m16236k(exc);
                if (c5415q2.f27212r) {
                    string = AbstractC0030c.m121l("Exception in ", z6 ? "LEAD" : "GENERAL", " CorruptCallLog popup: ", exc.getLocalizedMessage());
                } else {
                    String str = z6 ? "LEAD" : "GENERAL";
                    String str2 = c5415q2.f27211q ? " Verification" : "General";
                    String localizedMessage = exc.getLocalizedMessage();
                    StringBuilder sbM127r = AbstractC0030c.m127r("Exception in ", str, " ", str2, " complete call notes popup: ");
                    sbM127r.append(localizedMessage);
                    string = sbM127r.toString();
                }
                c8805t.m16233h(c8114j.f38843r, string, exc);
            }
        } catch (Exception e10) {
            e = e10;
            c8114j = this;
            c5415q2 = c5415q;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, Uri uri) {
        super.onChange(z6, uri);
        AtomicBoolean atomicBoolean = AbstractC4487b.f22326a;
        AbstractC4487b.m9333a(this.f38826a, this.f38827b, new C4486a(this.f38829d, this.f38828c, this.f38830e, this.f38831f, this.f38832g, new C8107c(this, null, 3), new C4833a(25, this)));
    }
}
