package com.websoptimization.callyzerbiz.broadcastReceivers;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import ao.c0;
import ap.C0388a;
import aw.d0;
import c4.C0861k;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import com.websoptimization.callyzerbiz.services.NotePopupService;
import h6.C2856l;
import hm.AbstractC2965a;
import hm.C2968d;
import hm.RunnableC2966b;
import im.p1;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import mm.C4799j;
import og.pe;
import om.C5415q;
import oo.C5431l;
import pv.C6042b;
import r5.AbstractC6466a;
import rn.h0;
import so.C6877c;
import tx.InterfaceC7266z;
import uo.C7476a;
import uo.C7481f;
import uw.InterfaceC7559c;
import wo.C8134s;
import wx.c1;
import wx.k1;
import wx.m1;
import wx.w0;
import xm.C8418z;
import xm.y5;
import yv.C8791f;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class PhoneStateReceiver extends AbstractC2965a {

    /* renamed from: A */
    public static volatile int f7281A = -1;

    /* renamed from: B */
    public static final LinkedHashSet f7282B = new LinkedHashSet();

    /* renamed from: c */
    public C8810d f7283c;

    /* renamed from: d */
    public C8810d f7284d;

    /* renamed from: f */
    public C8805t f7286f;

    /* renamed from: g */
    public h0 f7287g;

    /* renamed from: i */
    public C8805t f7289i;

    /* renamed from: j */
    public C8134s f7290j;

    /* renamed from: k */
    public C9000c f7291k;

    /* renamed from: l */
    public C8803r f7292l;

    /* renamed from: m */
    public C7481f f7293m;

    /* renamed from: n */
    public C7476a f7294n;

    /* renamed from: o */
    public c0 f7295o;

    /* renamed from: p */
    public C8418z f7296p;

    /* renamed from: q */
    public y5 f7297q;

    /* renamed from: r */
    public C4494g f7298r;

    /* renamed from: s */
    public C5431l f7299s;

    /* renamed from: t */
    public C6877c f7300t;

    /* renamed from: u */
    public C0861k f7301u;

    /* renamed from: v */
    public C2856l f7302v;

    /* renamed from: w */
    public Context f7303w;

    /* renamed from: y */
    public final m1 f7305y;

    /* renamed from: z */
    public final w0 f7306z;

    /* renamed from: e */
    public String f7285e = "";

    /* renamed from: h */
    public final String f7288h = "PhoneStateReceiver";

    /* renamed from: x */
    public boolean f7304x = true;

    public PhoneStateReceiver() {
        m1 m1VarM15372c = c1.m15372c(new C6042b());
        this.f7305y = m1VarM15372c;
        this.f7306z = new w0(m1VarM15372c);
    }

    /* renamed from: a */
    public static void m4591a(Context context, Intent intent, PhoneStateReceiver phoneStateReceiver) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            phoneStateReceiver.m4606p().m16232g(phoneStateReceiver.f7288h, "show " + (((C6042b) phoneStateReceiver.f7306z.f39340a.getValue()).f29501b ? "LEAD" : "GENERAL") + " complete call notes popup");
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.toString();
            phoneStateReceiver.m4606p().m16236k(e2);
        }
    }

    /* renamed from: b */
    public static void m4592b(Context context, Intent intent, C5415q c5415q, boolean z6, PhoneStateReceiver phoneStateReceiver) {
        String str;
        String string;
        String str2;
        boolean z10 = c5415q.f27211q;
        boolean z11 = c5415q.f27212r;
        String str3 = phoneStateReceiver.f7288h;
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
            phoneStateReceiver.m4606p().m16232g(str3, str2);
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
            phoneStateReceiver.m4606p().m16238m(string, e2);
            phoneStateReceiver.m4606p().m16233h(str3, string, e2);
        }
    }

    /* renamed from: c */
    public static final void m4593c(PhoneStateReceiver phoneStateReceiver, String str) {
        w0 w0Var = phoneStateReceiver.f7306z;
        InterfaceC7559c interfaceC7559c = null;
        if (str.length() != 0) {
            k1 k1Var = w0Var.f39340a;
            k1 k1Var2 = w0Var.f39340a;
            if (!((C6042b) k1Var.getValue()).f29500a.isEmpty()) {
                int i10 = 0;
                int i11 = -1;
                for (Object obj : ((C6042b) k1Var2.getValue()).f29500a) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    if (AbstractC4154l.m8918a(((C4799j) obj).f23882b, str)) {
                        i11 = i10;
                    }
                    i10 = i12;
                }
                if (i11 != -1) {
                    try {
                        ((C6042b) phoneStateReceiver.f7305y.getValue()).f29500a.remove(i11);
                        tx.c0.m13502y(phoneStateReceiver.m4601k(), null, null, new C2968d(phoneStateReceiver, interfaceC7559c, 0), 3);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        StringBuilder sb2 = new StringBuilder("clearLEadArrayList Error >>>some error while remove object from leadArrayList,leadArrayList ");
                        sb2.append("size is:=" + ((C6042b) k1Var2.getValue()).f29500a.size());
                        sb2.append("isFoundPos:=");
                        sb2.append(i11);
                        C8805t c8805tM4606p = phoneStateReceiver.m4606p();
                        String str2 = phoneStateReceiver.f7288h;
                        String string = sb2.toString();
                        AbstractC4154l.m8922e(string, "toString(...)");
                        c8805tM4606p.m16232g(str2, string);
                    }
                }
                tx.c0.m13502y(phoneStateReceiver.m4601k(), null, null, new C2968d(phoneStateReceiver, interfaceC7559c, 1), 3);
                return;
            }
        }
        ((C6042b) w0Var.f39340a.getValue()).f29500a.clear();
        tx.c0.m13502y(phoneStateReceiver.m4601k(), null, null, new C2968d(phoneStateReceiver, interfaceC7559c, 2), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(5:14|99|(4:104|(3:107|(4:140|109|(4:111|(2:112|(2:114|(1:143)(1:144))(2:142|117))|118|(1:120))|121)(1:141)|105)|139|122)(1:122)|123|124)(2:15|16))(8:17|131|18|19|20|127|50|(1:52)(10:53|(7:56|(6:133|58|(4:71|(3:73|(5:75|76|137|77|149)(2:82|147)|83)(3:145|84|85)|78|79)(7:63|(3:66|(2:155|153)(3:152|70|148)|64)|150|71|(0)(0)|78|79)|95|96|(1:158))(0)|99|(5:101|104|(1:105)|139|122)(0)|123|124|54)|146|86|96|(0)|99|(0)(0)|123|124)))(1:24))(4:26|(1:28)(1:29)|30|(2:32|(1:156)(1:35))(2:125|126))|25|36|(1:38)(1:39)|(1:43)|129|44|(2:46|(1:157)(5:49|20|127|50|(0)(0)))(4:90|135|91|92)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b6, code lost:
    
        r3 = r7;
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x00e0, B:53:0x00e9, B:54:0x00fa, B:56:0x0100, B:71:0x014e, B:73:0x0152, B:75:0x0158, B:63:0x0128, B:64:0x012c), top: B:127:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128 A[Catch: Exception -> 0x0177, TRY_ENTER, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x00e0, B:53:0x00e9, B:54:0x00fa, B:56:0x0100, B:71:0x014e, B:73:0x0152, B:75:0x0158, B:63:0x0128, B:64:0x012c), top: B:127:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x00e0, B:53:0x00e9, B:54:0x00fa, B:56:0x0100, B:71:0x014e, B:73:0x0152, B:75:0x0158, B:63:0x0128, B:64:0x012c), top: B:127:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4594d(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver r24, java.lang.String r25, ww.AbstractC8193c r26) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4594d(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r9.m4610t(r10, r12, r11, r1) == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4595e(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver r9, android.content.Context r10, boolean r11, ww.AbstractC8193c r12) {
        /*
            java.lang.String r0 = r9.f7288h
            boolean r1 = r12 instanceof hm.C2973i
            if (r1 == 0) goto L15
            r1 = r12
            hm.i r1 = (hm.C2973i) r1
            int r2 = r1.f16084e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16084e = r2
            goto L1a
        L15:
            hm.i r1 = new hm.i
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.f16082c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f16084e
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L41
            if (r3 == r6) goto L39
            if (r3 != r5) goto L31
            og.od.m10798c(r12)     // Catch: java.lang.Exception -> L2f
            goto Lba
        L2f:
            r10 = move-exception
            goto L94
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            boolean r11 = r1.f16081b
            android.content.Context r10 = r1.f16080a
            og.od.m10798c(r12)
            goto L6e
        L41:
            og.od.m10798c(r12)
            tx.z r12 = r9.m4601k()
            hm.f r3 = new hm.f
            r8 = 1
            r3.<init>(r9, r10, r7, r8)
            tx.c0.m13502y(r12, r7, r7, r3, r4)
            boolean r12 = android.provider.Settings.canDrawOverlays(r10)
            if (r12 != 0) goto L5d
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r12 >= r3) goto Lb1
        L5d:
            xm.z r12 = r9.m4599i()
            r1.f16080a = r10
            r1.f16081b = r11
            r1.f16084e = r6
            java.lang.Enum r12 = r12.m15714d(r1)
            if (r12 != r2) goto L6e
            goto L93
        L6e:
            yv.l r3 = yv.EnumC8797l.OPTION_NEVER
            if (r12 == r3) goto Lb1
            r9.m4600j()     // Catch: java.lang.Exception -> L2f
            android.database.Cursor r12 = c4.C0861k.m2300h(r10)     // Catch: java.lang.Exception -> L2f
            if (r12 == 0) goto Lba
            int r3 = r12.getCount()     // Catch: java.lang.Exception -> L2f
            if (r3 <= 0) goto Lba
            boolean r3 = r12.moveToFirst()     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto Lba
            r1.f16080a = r7     // Catch: java.lang.Exception -> L2f
            r1.f16081b = r11     // Catch: java.lang.Exception -> L2f
            r1.f16084e = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = r9.m4610t(r10, r12, r11, r1)     // Catch: java.lang.Exception -> L2f
            if (r10 != r2) goto Lba
        L93:
            return r2
        L94:
            r10.printStackTrace()
            yv.t r11 = r9.m4606p()
            java.lang.String r12 = r10.getLocalizedMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleDataLoadedSuccess >>> exception caught while processing callLog for note popup "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.m16233h(r0, r12, r10)
            goto Lba
        Lb1:
            yv.t r10 = r9.m4606p()
            java.lang.String r11 = "fetchCallLogUseCase else DrawOverlays permission is false, READ_CALL_LOG is not granted or OPTION_NEVER selected"
            r10.m16232g(r0, r11)
        Lba:
            tx.z r10 = r9.m4601k()
            hm.d r11 = new hm.d
            r12 = 4
            r11.<init>(r9, r7, r12)
            tx.c0.m13502y(r10, r7, r7, r11, r4)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4595e(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver, android.content.Context, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        if (r1.m16471g(r9) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        if (r1.m16471g(r9) == r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4596f(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver r16, ww.AbstractC8193c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4596f(com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4597g(java.lang.String r10, j$.time.LocalDateTime r11, ww.AbstractC8193c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof hm.C2967c
            if (r0 == 0) goto L13
            r0 = r12
            hm.c r0 = (hm.C2967c) r0
            int r1 = r0.f16041e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16041e = r1
            goto L18
        L13:
            hm.c r0 = new hm.c
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f16039c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f16041e
            r3 = 0
            r4 = 0
            wx.w0 r5 = r9.f7306z
            wx.m1 r6 = r9.f7305y
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            j$.time.LocalDateTime r11 = r0.f16038b
            java.lang.String r10 = r0.f16037a
            og.od.m10798c(r12)
            goto L72
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
            if (r12 != 0) goto Le1
            oo.l r12 = r9.m4602l()
            kotlin.jvm.internal.AbstractC4154l.m8920c(r10)
            r0.f16037a = r10
            r0.f16038b = r11
            r0.f16041e = r7
            java.lang.Object r12 = r12.m11125b(r10, r11, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            om.p r12 = (om.C5414p) r12
            if (r12 == 0) goto Lbd
            wx.k1 r11 = r5.f39340a
            java.lang.Object r11 = r11.getValue()
            pv.b r11 = (pv.C6042b) r11
            java.util.List r11 = r11.f29500a
            java.util.Iterator r11 = r11.iterator()
        L84:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le1
            java.lang.Object r0 = r11.next()
            int r1 = r3 + 1
            if (r3 < 0) goto Lb9
            mm.j r0 = (mm.C4799j) r0
            java.lang.String r2 = r0.f23882b
            boolean r2 = r2.contentEquals(r10)
            if (r2 == 0) goto Lb7
            java.lang.String r0 = r0.f23883c
            java.lang.String r2 = r12.f27194l
            boolean r0 = r0.contentEquals(r2)
            if (r0 == 0) goto Lb7
        La6:
            java.lang.Object r0 = r6.getValue()
            r2 = r0
            pv.b r2 = (pv.C6042b) r2
            pv.b r2 = pv.C6042b.m12051a(r2, r4, r7, r3, r7)
            boolean r0 = r6.m15397i(r0, r2)
            if (r0 == 0) goto La6
        Lb7:
            r3 = r1
            goto L84
        Lb9:
            og.pe.m10842q()
            throw r4
        Lbd:
            yv.t r12 = r9.m4605o()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkForLeadInList - CallerNumber: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = " ,callDateTime :"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = " , callLog found null ,"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "Note-popUp"
            r12.m16232g(r11, r10)
        Le1:
            qw.a0 r10 = qw.a0.f30746a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4597g(java.lang.String, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010d -> B:13:0x0045). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4598h(android.content.Context r19, int r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4598h(android.content.Context, int, ww.c):java.lang.Object");
    }

    /* renamed from: i */
    public final C8418z m4599i() {
        C8418z c8418z = this.f7296p;
        if (c8418z != null) {
            return c8418z;
        }
        AbstractC4154l.m8928k("appPreferencesRepository");
        throw null;
    }

    /* renamed from: j */
    public final C0861k m4600j() {
        C0861k c0861k = this.f7301u;
        if (c0861k != null) {
            return c0861k;
        }
        AbstractC4154l.m8928k("callLogObserverUseCase");
        throw null;
    }

    /* renamed from: k */
    public final InterfaceC7266z m4601k() {
        C8810d c8810d = this.f7283c;
        if (c8810d != null) {
            return c8810d;
        }
        AbstractC4154l.m8928k("mIoCoroutineScope");
        throw null;
    }

    /* renamed from: l */
    public final C5431l m4602l() {
        C5431l c5431l = this.f7299s;
        if (c5431l != null) {
            return c5431l;
        }
        AbstractC4154l.m8928k("notePopUpUseCase");
        throw null;
    }

    /* renamed from: m */
    public final C4494g m4603m() {
        C4494g c4494g = this.f7298r;
        if (c4494g != null) {
            return c4494g;
        }
        AbstractC4154l.m8928k("sessionConfigurationUseCase");
        throw null;
    }

    /* renamed from: n */
    public final C8134s m4604n() {
        C8134s c8134s = this.f7290j;
        if (c8134s != null) {
            return c8134s;
        }
        AbstractC4154l.m8928k("syncCallLogUseCase");
        throw null;
    }

    /* renamed from: o */
    public final C8805t m4605o() {
        C8805t c8805t = this.f7286f;
        if (c8805t != null) {
            return c8805t;
        }
        AbstractC4154l.m8928k("traceLog");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hm.AbstractC2965a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PhoneStateReceiver phoneStateReceiver;
        Context context2;
        super.onReceive(context, intent);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (intent == null || intent.getExtras() == null) {
            phoneStateReceiver = this;
            AbstractC1452a.m4579z("onReceive : intent extras null,action :- ", intent != null ? intent.getAction() : null, m4605o());
        } else {
            Bundle extras = intent.getExtras();
            AbstractC4154l.m8920c(extras);
            String string = extras.getString(TransferTable.COLUMN_STATE);
            if (f7281A == -1) {
                m4605o().m16232g(this.f7288h, "clear placeCallNumberSet from last State");
                f7282B.clear();
            }
            String stringExtra = intent.getStringExtra(TransferTable.COLUMN_STATE);
            int i10 = 3;
            if (stringExtra == null || stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                phoneStateReceiver = this;
                context2 = context;
            } else {
                String stringExtra2 = intent.getStringExtra("incoming_number");
                if (stringExtra2 != null) {
                    this.f7285e = stringExtra2;
                    phoneStateReceiver = this;
                    context2 = context;
                    tx.c0.m13502y(m4601k(), null, null, new d0((Object) stringExtra2, (Object) context2, (Object) phoneStateReceiver, (InterfaceC7559c) (objArr3 == true ? 1 : 0), 7), 3);
                } else {
                    phoneStateReceiver = this;
                    context2 = context;
                }
                C8791f c8791f = C8791f.f42457a;
                if (C8791f.m16171d(phoneStateReceiver.f7285e)) {
                    tx.c0.m13502y(m4601k(), null, null, new C2968d(this, objArr2 == true ? 1 : 0, i10), 3);
                } else {
                    m4605o().m16231f("onReceive : intent extras null,action :- " + intent.getAction() + " getRunningCallDetail callNumber isEmpty or null");
                }
            }
            int i11 = 0;
            if (!AbstractC4154l.m8918a(string, TelephonyManager.EXTRA_STATE_IDLE)) {
                if (AbstractC4154l.m8918a(string, TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    m4612v();
                    i11 = 2;
                } else if (AbstractC4154l.m8918a(string, TelephonyManager.EXTRA_STATE_RINGING)) {
                    m4612v();
                    i11 = 1;
                }
            }
            try {
                AbstractC4154l.m8920c(context2);
                synchronized (this) {
                    if (f7281A != i11) {
                        if (i11 == 0) {
                            C8810d c8810d = phoneStateReceiver.f7284d;
                            if (c8810d == null) {
                                AbstractC4154l.m8928k("mMainCoroutineScope");
                                throw null;
                            }
                            tx.c0.m13502y(c8810d, null, null, new C0388a(context2, this, objArr == true ? 1 : 0, 18), 3);
                        }
                        f7281A = i11;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                m4605o().m16235j(e2);
            }
        }
        m4605o().m16232g(phoneStateReceiver.f7288h, " onReceive : called");
    }

    /* renamed from: p */
    public final C8805t m4606p() {
        C8805t c8805t = this.f7289i;
        if (c8805t != null) {
            return c8805t;
        }
        AbstractC4154l.m8928k("traceLogs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4607q(pv.C6041a r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hm.C2974j
            if (r0 == 0) goto L13
            r0 = r10
            hm.j r0 = (hm.C2974j) r0
            int r1 = r0.f16087c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16087c = r1
            goto L18
        L13:
            hm.j r0 = new hm.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16085a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f16087c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r10)
            goto L95
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            og.od.m10798c(r10)
            yv.t r10 = r8.m4606p()
            java.lang.String r9 = r9.f29496a
            wx.w0 r2 = r8.f7306z
            wx.k1 r4 = r2.f39340a
            java.lang.Object r4 = r4.getValue()
            pv.b r4 = (pv.C6042b) r4
            boolean r4 = r4.f29501b
            wx.k1 r5 = r2.f39340a
            java.lang.Object r5 = r5.getValue()
            pv.b r5 = (pv.C6042b) r5
            int r5 = r5.f29502c
            wx.k1 r2 = r2.f39340a
            java.lang.Object r2 = r2.getValue()
            pv.b r2 = (pv.C6042b) r2
            java.util.List r2 = r2.f29500a
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CallNumber:="
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r9 = ">>> IsNumberExistingInLead = "
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = " >>> leadFoundIndex:="
            r6.append(r9)
            r6.append(r5)
            java.lang.String r9 = ">>> leadCallSize:="
            r6.append(r9)
            r6.append(r2)
            java.lang.String r9 = r6.toString()
            java.lang.String r2 = r8.f7288h
            r10.m16232g(r2, r9)
            xm.z r9 = r8.m4599i()
            r0.f16087c = r3
            r10 = 0
            java.lang.Object r9 = r9.m15721k(r10, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            ln.g r9 = r8.m4603m()
            im.p1 r10 = im.p1.LEAD_NUMBERS_LIST
            rw.r r0 = rw.C6668r.f31943a
            r9.m9337b(r10, r0)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4607q(pv.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r13.m15721k(false, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[PHI: r8 r9 r12
      0x0076: PHI (r8v1 wx.m1) = (r8v0 wx.m1), (r8v2 wx.m1) binds: [B:25:0x0071, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r9v1 pv.a) = (r9v0 pv.a), (r9v2 pv.a) binds: [B:25:0x0071, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:25:0x0071, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[PHI: r2 r6 r8 r9 r12 r13
      0x0094: PHI (r2v3 pv.b) = (r2v2 pv.b), (r2v10 pv.b) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r6v2 java.lang.Object) = (r6v1 java.lang.Object), (r6v3 java.lang.Object) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r8v2 wx.m1) = (r8v1 wx.m1), (r8v3 wx.m1) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v2 pv.a) = (r9v1 pv.a), (r9v3 pv.a) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r12v4 int) = (r12v3 int), (r12v21 int) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v1 java.lang.Object) binds: [B:27:0x0091, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:29:0x0094). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4608r(pv.C6041a r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4608r(pv.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0135, code lost:
    
        if (r2 == r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ab A[Catch: ArrayIndexOutOfBoundsException -> 0x03ca, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x03ca, blocks: (B:108:0x039d, B:110:0x03ab, B:115:0x03d0, B:117:0x03e8, B:119:0x040d, B:140:0x047c, B:142:0x0480, B:143:0x0496, B:114:0x03cd), top: B:160:0x039d }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03cd A[Catch: ArrayIndexOutOfBoundsException -> 0x03ca, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x03ca, blocks: (B:108:0x039d, B:110:0x03ab, B:115:0x03d0, B:117:0x03e8, B:119:0x040d, B:140:0x047c, B:142:0x0480, B:143:0x0496, B:114:0x03cd), top: B:160:0x039d }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e8 A[Catch: ArrayIndexOutOfBoundsException -> 0x03ca, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x03ca, blocks: (B:108:0x039d, B:110:0x03ab, B:115:0x03d0, B:117:0x03e8, B:119:0x040d, B:140:0x047c, B:142:0x0480, B:143:0x0496, B:114:0x03cd), top: B:160:0x039d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x042c A[Catch: ArrayIndexOutOfBoundsException -> 0x0432, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0432, blocks: (B:121:0x0424, B:123:0x042c, B:126:0x0436, B:128:0x043a, B:130:0x0440, B:134:0x044c, B:136:0x0450, B:137:0x0455, B:133:0x0447), top: B:156:0x0424 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x043a A[Catch: ArrayIndexOutOfBoundsException -> 0x0432, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0432, blocks: (B:121:0x0424, B:123:0x042c, B:126:0x0436, B:128:0x043a, B:130:0x0440, B:134:0x044c, B:136:0x0450, B:137:0x0455, B:133:0x0447), top: B:156:0x0424 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0447 A[Catch: ArrayIndexOutOfBoundsException -> 0x0432, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0432, blocks: (B:121:0x0424, B:123:0x042c, B:126:0x0436, B:128:0x043a, B:130:0x0440, B:134:0x044c, B:136:0x0450, B:137:0x0455, B:133:0x0447), top: B:156:0x0424 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0450 A[Catch: ArrayIndexOutOfBoundsException -> 0x0432, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0432, blocks: (B:121:0x0424, B:123:0x042c, B:126:0x0436, B:128:0x043a, B:130:0x0440, B:134:0x044c, B:136:0x0450, B:137:0x0455, B:133:0x0447), top: B:156:0x0424 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0352  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4609s(android.content.Context r40, pv.C6041a r41, boolean r42, ww.AbstractC8193c r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4609s(android.content.Context, pv.a, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[PHI: r4 r10 r11
      0x00f3: PHI (r4v8 boolean) = (r4v6 boolean), (r4v6 boolean), (r4v9 boolean) binds: [B:37:0x00ef, B:34:0x00de, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r10v7 pv.a) = (r10v5 pv.a), (r10v5 pv.a), (r10v8 pv.a) binds: [B:37:0x00ef, B:34:0x00de, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r11v10 android.content.Context) = (r11v8 android.content.Context), (r11v8 android.content.Context), (r11v11 android.content.Context) binds: [B:37:0x00ef, B:34:0x00de, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[PHI: r4 r10 r11
      0x0109: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:40:0x0105, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r10v9 pv.a) = (r10v7 pv.a), (r10v10 pv.a) binds: [B:40:0x0105, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r11v12 android.content.Context) = (r11v10 android.content.Context), (r11v13 android.content.Context) binds: [B:40:0x0105, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[PHI: r0 r4 r10 r11
      0x0122: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:43:0x011e, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r4v12 boolean) = (r4v10 boolean), (r4v14 boolean) binds: [B:43:0x011e, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r10v11 pv.a) = (r10v9 pv.a), (r10v13 pv.a) binds: [B:43:0x011e, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r11v14 android.content.Context) = (r11v12 android.content.Context), (r11v15 android.content.Context) binds: [B:43:0x011e, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x01a2, B:61:0x01b0, B:66:0x01d4, B:68:0x01ee, B:70:0x0215, B:72:0x0245, B:74:0x0249, B:75:0x025f, B:65:0x01d1), top: B:83:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x01a2, B:61:0x01b0, B:66:0x01d4, B:68:0x01ee, B:70:0x0215, B:72:0x0245, B:74:0x0249, B:75:0x025f, B:65:0x01d1), top: B:83:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:59:0x01a2, B:61:0x01b0, B:66:0x01d4, B:68:0x01ee, B:70:0x0215, B:72:0x0245, B:74:0x0249, B:75:0x025f, B:65:0x01d1), top: B:83:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4610t(android.content.Context r30, android.database.Cursor r31, boolean r32, ww.AbstractC8193c r33) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver.m4610t(android.content.Context, android.database.Cursor, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: u */
    public final void m4611u(Context context, C5415q c5415q) {
        PhoneStateReceiver phoneStateReceiver;
        C5415q c5415q2;
        String string;
        boolean z6 = ((C6042b) this.f7306z.f39340a.getValue()).f29501b;
        try {
            m4603m().m9337b(p1.NOTE_POPUP_CALL_DETAILS, c5415q);
            phoneStateReceiver = this;
            c5415q2 = c5415q;
        } catch (Exception e2) {
            e = e2;
            phoneStateReceiver = this;
            c5415q2 = c5415q;
        }
        try {
            new Handler(Looper.getMainLooper()).post(new RunnableC2966b(context, new Intent(context, (Class<?>) NotePopupService.class), c5415q2, z6, phoneStateReceiver, 0));
        } catch (Exception e10) {
            e = e10;
            Exception exc = e;
            exc.printStackTrace();
            m4606p().m16236k(exc);
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
            m4606p().m16233h(phoneStateReceiver.f7288h, string, exc);
        }
    }

    /* renamed from: v */
    public final void m4612v() {
        String str = this.f7288h;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                C2856l c2856l = this.f7302v;
                if (c2856l == null) {
                    AbstractC4154l.m8928k("batteryOptimizationPermissionUseCase");
                    throw null;
                }
                if (!c2856l.m6988d()) {
                    m4605o().m16232g(str, "Call monitor service - not started due to battery optimization settings on Android 14+");
                    return;
                }
            }
            m4603m().m9337b(p1.STOP_CALL_MONITOR_SERVICE, Boolean.FALSE);
            Context context = this.f7303w;
            if (context == null) {
                AbstractC4154l.m8928k("applicationContext");
                throw null;
            }
            Intent intent = new Intent(context, (Class<?>) CallMonitorService.class);
            Context context2 = this.f7303w;
            if (context2 == null) {
                AbstractC4154l.m8928k("applicationContext");
                throw null;
            }
            if (i10 >= 26) {
                AbstractC6466a.m12448c(context2, intent);
            } else {
                context2.startService(intent);
            }
            m4605o().m16232g(str, "Call monitor service - started");
        } catch (Exception e2) {
            e2.printStackTrace();
            C8805t c8805tM4606p = m4606p();
            C2856l c2856l2 = this.f7302v;
            if (c2856l2 == null) {
                AbstractC4154l.m8928k("batteryOptimizationPermissionUseCase");
                throw null;
            }
            c8805tM4606p.m16237l("CallMonitorService >>> Exception caught while starting service >>> batteryOptimizationPermission:- " + c2856l2.m6988d());
            m4605o().m16233h(str, "Error starting CallMonitorService", e2);
            m4605o().m16236k(e2);
        }
    }

    /* renamed from: w */
    public final void m4613w() {
        m4605o().m16232g(this.f7288h, "Call monitor service - stoped");
        m4603m().m9337b(p1.STOP_CALL_MONITOR_SERVICE, Boolean.TRUE);
    }
}
