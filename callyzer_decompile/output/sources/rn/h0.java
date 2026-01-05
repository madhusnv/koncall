package rn;

import an.a2;
import an.h3;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import aw.C0469i;
import aw.C0473m;
import aw.C0476p;
import aw.C0481u;
import aw.C0482v;
import co.C0984a;
import com.sun.mail.util.AbstractC1452a;
import gn.x2;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kn.C4121a;
import kn.EnumC4123c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import ln.C4493f;
import mm.C4791b;
import mm.C4792c;
import nq.C5130b;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.pe;
import og.ue;
import p020v.a1;
import pg.g9;
import pg.n6;
import po.C5984e;
import rw.AbstractC6663m;
import tx.C7251k;
import uo.C7485j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wo.C8134s;
import ww.AbstractC8193c;
import wx.w0;
import xm.C8418z;
import xm.s2;
import xm.x1;
import xm.y5;
import yv.C8800o;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a */
    public final Context f31519a;

    /* renamed from: b */
    public final y5 f31520b;

    /* renamed from: c */
    public final C8418z f31521c;

    /* renamed from: d */
    public final x1 f31522d;

    /* renamed from: e */
    public final s2 f31523e;

    /* renamed from: f */
    public final q0 f31524f;

    /* renamed from: g */
    public final C8803r f31525g;

    /* renamed from: h */
    public final C8134s f31526h;

    /* renamed from: i */
    public final C5984e f31527i;

    /* renamed from: j */
    public final C7485j f31528j;

    /* renamed from: k */
    public final C4493f f31529k;

    /* renamed from: l */
    public final C8810d f31530l;

    /* renamed from: m */
    public final C8805t f31531m;

    /* renamed from: n */
    public boolean f31532n;

    /* renamed from: o */
    public long f31533o;

    /* renamed from: p */
    public long f31534p;

    /* renamed from: q */
    public final int f31535q;

    /* renamed from: r */
    public final C0476p f31536r;

    public h0(Context context, y5 userSIMRepository, C8418z appPreferencesRepository, x1 x1Var, s2 callRecordingRepository, q0 q0Var, C8803r networkUtil, C8134s c8134s, C5984e c5984e, C7485j c7485j, C0984a c0984a, C4493f c4493f, C8810d c8810d, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(callRecordingRepository, "callRecordingRepository");
        AbstractC4154l.m8923f(networkUtil, "networkUtil");
        this.f31519a = context;
        this.f31520b = userSIMRepository;
        this.f31521c = appPreferencesRepository;
        this.f31522d = x1Var;
        this.f31523e = callRecordingRepository;
        this.f31524f = q0Var;
        this.f31525g = networkUtil;
        this.f31526h = c8134s;
        this.f31527i = c5984e;
        this.f31528j = c7485j;
        this.f31529k = c4493f;
        this.f31530l = c8810d;
        this.f31531m = c8805t;
        tx.c0.m13502y(tx.c0.m13479b(tx.m0.f34659a), null, null, new ps.c0(this, (InterfaceC7559c) null, 10), 3);
        this.f31533o = -1L;
        this.f31534p = -1L;
        this.f31535q = 100000000;
        this.f31536r = new C0476p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12589a(rn.h0 r7, long r8, ww.AbstractC8193c r10) {
        /*
            boolean r0 = r10 instanceof rn.C6575d
            if (r0 == 0) goto L13
            r0 = r10
            rn.d r0 = (rn.C6575d) r0
            int r1 = r0.f31483c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31483c = r1
            goto L18
        L13:
            rn.d r0 = new rn.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f31481a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31483c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            og.od.m10798c(r10)
            goto L51
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            og.od.m10798c(r10)
            long r5 = r7.f31534p
            long r5 = r5 + r8
            r7.f31534p = r5
            long r5 = r7.f31533o
            long r5 = r5 - r8
            r7.f31533o = r5
            xm.s2 r8 = r7.f31523e
            r0.f31483c = r4
            fn.i r8 = r8.f40819d
            java.lang.String r9 = "cloud_free_space"
            java.lang.Object r8 = r8.m6033m(r9, r5, r0)
            if (r8 != r1) goto L4d
            goto L4e
        L4d:
            r8 = r3
        L4e:
            if (r8 != r1) goto L51
            return r1
        L51:
            long r8 = r7.f31534p
            long r0 = r7.f31533o
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "total uploaded: "
            r10.<init>(r2)
            r10.append(r8)
            java.lang.String r8 = ", available: "
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = r10.toString()
            r9 = 0
            r7.m12616i(r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12589a(rn.h0, long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12595g(rn.h0 r9, int r10, ww.AbstractC8193c r11) {
        /*
            wo.s r0 = r9.f31526h
            yv.t r1 = r9.f31531m
            boolean r2 = r11 instanceof rn.c0
            if (r2 == 0) goto L18
            r2 = r11
            rn.c0 r2 = (rn.c0) r2
            int r3 = r2.f31480d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f31480d = r3
        L16:
            r5 = r2
            goto L1e
        L18:
            rn.c0 r2 = new rn.c0
            r2.<init>(r9, r11)
            goto L16
        L1e:
            java.lang.Object r11 = r5.f31478b
            vw.a r7 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r5.f31480d
            r3 = 3
            r4 = 2
            r6 = 1
            qw.a0 r8 = qw.a0.f30746a
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L46
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            og.od.m10798c(r11)
            return r8
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            og.od.m10798c(r11)
            qw.n r11 = (qw.C6364n) r11
            r11.getClass()
            return r8
        L46:
            int r10 = r5.f31477a
            og.od.m10798c(r11)
            goto L5c
        L4c:
            og.od.m10798c(r11)
            xm.x1 r9 = r9.f31522d
            r5.f31477a = r10
            r5.f31480d = r6
            java.lang.Object r11 = r9.m15662k(r10, r5)
            if (r11 != r7) goto L5c
            goto Lac
        L5c:
            mm.b r11 = (mm.C4791b) r11
            if (r11 != 0) goto L72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "CallRecordingUseCase >> synOneCallLog: no callLog found with id: "
            r9.<init>(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r1.m16231f(r9)
            return r8
        L72:
            java.util.EnumSet r9 = r11.f23835d
            zm.a r2 = zm.EnumC8991a.SYNC_NEW
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L95
            java.lang.String r9 = "CallRecordingUseCase >> call log not synced, so syncing call logs..."
            r1.m16231f(r9)
            mm.c r9 = r11.f23833b
            java.lang.String r1 = r9.f23850g
            r5.f31477a = r10
            r5.f31480d = r4
            r2 = 0
            r3 = 0
            java.lang.String r4 = "After Upload.."
            r6 = 6
            java.lang.Object r9 = wo.C8134s.m15300o(r0, r1, r2, r3, r4, r5, r6)
            if (r9 != r7) goto Lad
            goto Lac
        L95:
            zm.a r2 = zm.EnumC8991a.SYNC_CALL_RECORDING_UPDATE
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto Lad
            java.lang.String r9 = "CallRecordingUseCase >> syncing call recording..."
            r1.m16231f(r9)
            r5.f31477a = r10
            r5.f31480d = r3
            java.lang.Object r9 = r0.m15315s(r11, r5)
            if (r9 != r7) goto Lad
        Lac:
            return r7
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12595g(rn.h0, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182 A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #4 {Exception -> 0x00a3, blocks: (B:28:0x009e, B:70:0x0171, B:72:0x0182, B:78:0x01b0, B:80:0x01b4, B:86:0x01e4, B:88:0x01e8), top: B:121:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b0 A[Catch: Exception -> 0x00a3, TRY_ENTER, TryCatch #4 {Exception -> 0x00a3, blocks: (B:28:0x009e, B:70:0x0171, B:72:0x0182, B:78:0x01b0, B:80:0x01b4, B:86:0x01e4, B:88:0x01e8), top: B:121:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r17v0, types: [rn.h0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [xm.s2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18, types: [kn.a] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m12596h(rn.h0 r17, kn.C4121a r18, ww.AbstractC8193c r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12596h(rn.h0, kn.a, ww.c):java.io.Serializable");
    }

    /* renamed from: q */
    public static String m12598q(String str, C4792c c4792c) {
        String str2 = c4792c.f23850g;
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTime = c4792c.f23849f;
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str3 = localDateTime.format(C8800o.m16214w("yyyyMMdd"));
        AbstractC4154l.m8922e(str3, "format(...)");
        String strM12599v = m12599v(c4792c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append("/");
        sb2.append(str3);
        return AbstractC1452a.m4564k(sb2, "/", strM12599v);
    }

    /* renamed from: v */
    public static String m12599v(C4792c item) {
        AbstractC4154l.m8923f(item, "item");
        String str = item.f23850g;
        String str2 = item.f23846c;
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTime = item.f23849f;
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str3 = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss", Locale.ENGLISH).withZone(ZoneId.systemDefault()));
        AbstractC4154l.m8922e(str3, "format(...)");
        return str + "_" + str2 + "_" + str3 + ".mp3";
    }

    /* renamed from: A */
    public final boolean m12600A(Uri videoFileUri) {
        AbstractC4154l.m8923f(videoFileUri, "videoFileUri");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f31519a, videoFileUri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(16);
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return (strExtractMetadata == null || strExtractMetadata.length() == 0 || !AbstractC5185w.m10130l(strExtractMetadata, "yes", true)) ? false : true;
    }

    /* renamed from: B */
    public final ArrayList m12601B(List list) throws FileNotFoundException {
        File file;
        C8805t c8805t = this.f31531m;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4791b c4791b = (C4791b) it.next();
            try {
                String str = c4791b.f23838g;
                String str2 = "";
                if (str == null || !AbstractC5178p.m10116x(str, "content://", false)) {
                    String str3 = c4791b.f23838g;
                    if (str3 == null) {
                        str3 = "";
                    }
                    file = new File(str3);
                    if (!file.exists()) {
                        throw new FileNotFoundException();
                    }
                } else {
                    Uri uri = Uri.parse(c4791b.f23838g);
                    AbstractC4154l.m8922e(uri, "parse(...)");
                    file = g9.m11668h(this.f31519a, uri);
                }
                File file2 = file;
                String str4 = c4791b.f23837f;
                if (str4 == null) {
                    str4 = "";
                }
                File file3 = new File(str4);
                String str5 = c4791b.f23837f;
                if (str5 != null) {
                    str2 = str5;
                }
                arrayList.add(new C4121a(c4791b, Uri.parse(str2), file3, file2, c4791b.f23837f, c4791b.f23838g, file2.length(), 3904));
            } catch (FileNotFoundException unused) {
                c8805t.m16231f("mapCallLogToRecordModel >> Compress File not found : " + c4791b.f23838g + " >>> for call log " + c4791b.f23833b);
                tx.c0.m13502y(this.f31530l, null, null, new ps.c0(c4791b, this, null, 11), 3);
            } catch (Exception e2) {
                c8805t.m16231f("mapCallLogToRecordModel >> exception for call log " + c4791b.f23833b.f23849f + " >>> " + e2.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public final Object m12602C(C0481u c0481u, C0482v c0482v) {
        C7251k c7251k = new C7251k(1, n6.m11797c(c0482v));
        c7251k.m13540p();
        w0 w0Var = this.f31525g.f42471f;
        C4168z c4168z = new C4168z();
        c4168z.f21164a = EnumC4123c.UPLOAD_NO_ERROR;
        C4166x c4166x = new C4166x();
        this.f31533o = -1L;
        this.f31534p = -1L;
        C4166x c4166x2 = new C4166x();
        tx.c0.m13502y(tx.c0.m13479b(c7251k.f34651e.t0(this.f31536r)), null, null, new C6591t(this, c0481u, new C4166x(), c4168z, w0Var, c4166x, c4166x2, c7251k, null), 3);
        c7251k.m13542t(new C0469i(4, c4166x2, this, c4166x));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [rn.h0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12603D(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rn.C6592u
            if (r0 == 0) goto L13
            r0 = r8
            rn.u r0 = (rn.C6592u) r0
            int r1 = r0.f31679d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31679d = r1
            goto L18
        L13:
            rn.u r0 = new rn.u
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f31677b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31679d
            rw.r r3 = rw.C6668r.f31943a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            java.util.ArrayList r0 = r0.f31676a
            og.od.m10798c(r8)
            goto L69
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            og.od.m10798c(r8)
            goto L50
        L3a:
            og.od.m10798c(r8)
            java.util.ArrayList r8 = xm.s2.f40810n
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto Lc1
            zm.c r8 = zm.EnumC8993c.COMPRESS_IN_PROGRESS
            r0.f31679d = r5
            java.lang.Object r8 = r7.m12626u(r8, r0)
            if (r8 != r1) goto L50
            goto L65
        L50:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L55
            r8 = r3
        L55:
            java.util.ArrayList r8 = rw.AbstractC6663m.d0(r8)
            zm.c r2 = zm.EnumC8993c.CON_COM_FAILED
            r0.f31676a = r8
            r0.f31679d = r4
            java.lang.Object r0 = r7.m12626u(r2, r0)
            if (r0 != r1) goto L66
        L65:
            return r1
        L66:
            r6 = r0
            r0 = r8
            r8 = r6
        L69:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L6e
            goto L6f
        L6e:
            r3 = r8
        L6f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "CallRecordingUseCase >>> compressFailedCallLogs: "
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r1 = ", con_com_failed: "
            r8.append(r1)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            yv.t r1 = r7.f31531m
            r1.m16231f(r8)
            r0.addAll(r3)
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto Lc1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "CallRecordingUseCase >>> reCompressing call logs: "
            r8.<init>(r2)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r1.m16231f(r8)
            ug.w r8 = xm.s2.f40808l
            java.util.ArrayList r0 = r7.m12601B(r0)
            r8.m14179d(r0)
            yv.d r8 = yv.C8789d.f42453a
            java.lang.String r0 = "CompressWork"
            android.content.Context r2 = r7.f31519a
            boolean r0 = yv.C8789d.m16164k(r2, r0)
            if (r0 != 0) goto Lc1
            r8.m16166l(r2)
            java.lang.String r8 = "CallRecordingUseCase >>> retry failed compress >> enqueueCompress: worker is called"
            r1.m16231f(r8)
        Lc1:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12603D(ww.c):java.lang.Object");
    }

    /* renamed from: E */
    public final Object m12604E(AbstractC8193c abstractC8193c) {
        Object objM6033m = this.f31523e.f40819d.m6033m("last_free_space_checked", -1L, abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM6033m != enumC7794a) {
            objM6033m = a0Var;
        }
        return objM6033m == enumC7794a ? objM6033m : a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12605F(java.lang.String r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rn.C6593v
            if (r0 == 0) goto L13
            r0 = r7
            rn.v r0 = (rn.C6593v) r0
            int r1 = r0.f31682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31682c = r1
            goto L18
        L13:
            rn.v r0 = new rn.v
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31680a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31682c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            og.od.m10798c(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r7)
            r0.f31682c = r4
            xm.z r7 = r5.f31521c
            fn.i r7 = r7.f41069a
            java.lang.String r2 = "call_record_folder"
            java.lang.Object r6 = r7.m6034n(r2, r6, r0)
            if (r6 != r1) goto L43
            goto L44
        L43:
            r6 = r3
        L44:
            if (r6 != r1) goto L47
            return r1
        L47:
            uo.j r6 = r5.f31528j
            android.content.Context r7 = r5.f31519a
            r6.m14286c(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12605F(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ec A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0278 A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289 A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029b A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cc A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0328 A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154 A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170 A[Catch: Exception -> 0x0044, TryCatch #3 {Exception -> 0x0044, blocks: (B:13:0x003f, B:132:0x02bc, B:120:0x025b, B:123:0x0278, B:124:0x0283, B:126:0x0289, B:128:0x029b, B:115:0x023b, B:104:0x01e6, B:106:0x01ec, B:108:0x020e, B:109:0x0217, B:134:0x02cc, B:136:0x02d0, B:138:0x02d4, B:140:0x02d8, B:142:0x02dc, B:144:0x02e0, B:146:0x02e4, B:147:0x02f0, B:148:0x02f1, B:149:0x02fb, B:150:0x02fc, B:151:0x0306, B:152:0x0307, B:153:0x0311, B:154:0x0312, B:155:0x031c, B:156:0x031d, B:157:0x0327, B:90:0x0184, B:94:0x019c, B:99:0x01b7, B:100:0x01cf, B:36:0x008d, B:77:0x0148, B:78:0x014e, B:80:0x0154, B:84:0x016b, B:86:0x0170, B:158:0x0328, B:39:0x0094, B:72:0x0127, B:42:0x009b, B:54:0x00c8, B:45:0x00a4, B:49:0x00ae, B:51:0x00b4, B:63:0x0102, B:67:0x010c, B:69:0x0112, B:74:0x0139, B:58:0x00df, B:60:0x00e5, B:62:0x00ec, B:160:0x033b), top: B:164:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m12606G(kn.C4121a r24, ww.AbstractC8193c r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12606G(kn.a, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12607H(boolean r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12607H(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r5 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (m12613N(r0, r12, r3) == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r0 == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:37:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c6 -> B:38:0x00ca). Please report as a decompilation issue!!! */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12608I(boolean r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12608I(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12609J(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12609J(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12610K(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rn.a0
            if (r0 == 0) goto L13
            r0 = r7
            rn.a0 r0 = (rn.a0) r0
            int r1 = r0.f31465c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31465c = r1
            goto L18
        L13:
            rn.a0 r0 = new rn.a0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31463a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31465c
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
            goto L44
        L38:
            og.od.m10798c(r7)
            r0.f31465c = r5
            java.lang.Object r7 = r6.m12619m(r0)
            if (r7 != r1) goto L44
            goto L56
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4d
            goto L57
        L4d:
            r0.f31465c = r4
            r7 = 0
            java.lang.Object r7 = r6.m12607H(r7, r0)
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12610K(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12611L(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rn.b0
            if (r0 == 0) goto L13
            r0 = r7
            rn.b0 r0 = (rn.b0) r0
            int r1 = r0.f31473c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31473c = r1
            goto L18
        L13:
            rn.b0 r0 = new rn.b0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31471a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31473c
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
            goto L44
        L38:
            og.od.m10798c(r7)
            r0.f31473c = r5
            java.lang.Object r7 = r6.m12619m(r0)
            if (r7 != r1) goto L44
            goto L55
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4d
            goto L56
        L4d:
            r0.f31473c = r4
            java.lang.Object r7 = r6.m12607H(r5, r0)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12611L(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12612M(int r5, android.net.Uri r6, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof rn.d0
            if (r0 == 0) goto L13
            r0 = r7
            rn.d0 r0 = (rn.d0) r0
            int r1 = r0.f31486c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31486c = r1
            goto L18
        L13:
            rn.d0 r0 = new rn.d0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f31484a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31486c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r7)
            boolean r7 = xm.s2.f40812p
            r2 = 0
            if (r7 == 0) goto L4d
            ay.f r5 = tx.m0.f34659a
            ux.c r5 = yx.AbstractC8819m.f42514a
            rn.e0 r6 = new rn.e0
            r7 = 0
            r6.<init>(r4, r2, r7)
            r0.f31486c = r3
            java.lang.Object r5 = tx.c0.m13475K(r5, r6, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            ay.f r7 = tx.m0.f34659a
            ay.e r7 = ay.ExecutorC0495e.f3538c
            yx.d r7 = tx.c0.m13479b(r7)
            nb.a r0 = new nb.a
            r0.<init>(r4, r6, r5, r2)
            r5 = 3
            tx.c0.m13502y(r7, r2, r2, r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12612M(int, android.net.Uri, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
    
        if (r4 == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        if (r2 != r6) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r2 != r6) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[PHI: r1 r2 r7
      0x0128: PHI (r1v1 int) = (r1v0 int), (r1v3 int) binds: [B:47:0x00ee, B:54:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r2v1 long) = (r2v0 long), (r2v6 long) binds: [B:47:0x00ee, B:54:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r7v12 qw.k) = (r7v10 qw.k), (r7v16 qw.k) binds: [B:47:0x00ee, B:54:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12613N(int r19, long r20, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12613N(int, long, ww.c):java.lang.Object");
    }

    /* renamed from: O */
    public final Object m12614O(int i10, String str, AbstractC8193c abstractC8193c) {
        Object objF0 = this.f31523e.f40818c.F0(i10, str, abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objF0 != enumC7794a) {
            objF0 = a0Var;
        }
        return objF0 == enumC7794a ? objF0 : a0Var;
    }

    /* renamed from: P */
    public final Object m12615P(int i10, EnumC8993c enumC8993c, boolean z6, AbstractC8193c abstractC8193c) {
        Object objM15659J = this.f31522d.m15659J(i10, enumC8993c, z6, abstractC8193c);
        return objM15659J == EnumC7794a.COROUTINE_SUSPENDED ? objM15659J : qw.a0.f30746a;
    }

    /* renamed from: i */
    public final void m12616i(String str, Exception exc) {
        C8805t c8805t = this.f31531m;
        if (exc == null) {
            AbstractC1452a.m4579z("CallRecordingUseCase >>> ", str, c8805t);
            return;
        }
        exc.toString();
        c8805t.m16231f(str + ", exception: " + exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12617k(java.lang.Boolean r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof rn.C6576e
            if (r0 == 0) goto L13
            r0 = r10
            rn.e r0 = (rn.C6576e) r0
            int r1 = r0.f31490d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31490d = r1
            goto L18
        L13:
            rn.e r0 = new rn.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31488b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31490d
            xm.z r3 = r8.f31521c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            og.od.m10798c(r10)
            return r10
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            og.od.m10798c(r10)
            goto L6c
        L3c:
            java.lang.Boolean r9 = r0.f31487a
            og.od.m10798c(r10)
            goto L50
        L42:
            og.od.m10798c(r10)
            r0.f31487a = r9
            r0.f31490d = r6
            java.lang.Object r10 = r3.m15715e(r0)
            if (r10 != r1) goto L50
            goto L82
        L50:
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.length()
            if (r10 != 0) goto L84
            if (r9 == 0) goto L5f
            boolean r9 = r9.booleanValue()
            goto L72
        L5f:
            r0.f31487a = r7
            r0.f31490d = r5
            xm.s2 r9 = r8.f31523e
            java.lang.Object r10 = r9.m15619b(r0)
            if (r10 != r1) goto L6c
            goto L82
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
        L72:
            if (r9 == 0) goto L84
            r0.f31487a = r7
            r0.f31490d = r4
            fn.i r9 = r3.f41069a
            java.lang.String r10 = "dialog_dismissed"
            java.lang.Object r9 = r9.m6022b(r10, r0)
            if (r9 != r1) goto L83
        L82:
            return r1
        L83:
            return r9
        L84:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12617k(java.lang.Boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12618l(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rn.C6577f
            if (r0 == 0) goto L13
            r0 = r8
            rn.f r0 = (rn.C6577f) r0
            int r1 = r0.f31495c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31495c = r1
            goto L18
        L13:
            rn.f r0 = new rn.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f31493a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31495c
            xm.z r3 = r7.f31521c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            og.od.m10798c(r8)
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            og.od.m10798c(r8)
            goto L66
        L3b:
            og.od.m10798c(r8)
            goto L4b
        L3f:
            og.od.m10798c(r8)
            r0.f31495c = r6
            java.lang.Object r8 = r3.m15715e(r0)
            if (r8 != r1) goto L4b
            goto L7a
        L4b:
            java.lang.String r8 = (java.lang.String) r8
            android.content.Context r2 = r7.f31519a
            boolean r2 = pg.y8.m11948c(r2)
            if (r2 != 0) goto L84
            int r8 = r8.length()
            if (r8 != 0) goto L84
            r0.f31495c = r5
            xm.s2 r8 = r7.f31523e
            java.lang.Object r8 = r8.m15619b(r0)
            if (r8 != r1) goto L66
            goto L7a
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
            r0.f31495c = r4
            fn.i r8 = r3.f41069a
            java.lang.String r2 = "dialog_dismissed"
            java.lang.Object r8 = r8.m6022b(r2, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L84
            goto L85
        L84:
            r6 = 0
        L85:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12618l(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12619m(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rn.C6578g
            if (r0 == 0) goto L13
            r0 = r7
            rn.g r0 = (rn.C6578g) r0
            int r1 = r0.f31504c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31504c = r1
            goto L18
        L13:
            rn.g r0 = new rn.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31502a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31504c
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r5) goto L2b
            og.od.m10798c(r7)
            goto L6c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            og.od.m10798c(r7)
            goto L51
        L37:
            og.od.m10798c(r7)
            boolean r7 = xm.s2.f40812p
            if (r7 == 0) goto L46
            java.lang.String r7 = "startRecordFindProcess >>> already find process is running."
            r6.m12616i(r7, r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L46:
            r0.f31504c = r4
            xm.s2 r7 = r6.f31523e
            java.lang.Object r7 = r7.m15619b(r0)
            if (r7 != r1) goto L51
            goto L6b
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L61
            java.lang.String r7 = "Searching CallLogs for recording >>> recording feature not available"
            r6.m12616i(r7, r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L61:
            r0.f31504c = r5
            xm.z r7 = r6.f31521c
            java.lang.Object r7 = r7.m15715e(r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = nx.AbstractC5178p.m10101L(r7)
            if (r0 == 0) goto L7c
            java.lang.String r7 = "Searching CallLogs for recording >>> folder path not set"
            r6.m12616i(r7, r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L7c:
            android.net.Uri r0 = android.net.Uri.parse(r7)
            java.lang.String r1 = "parse(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r1)
            android.content.Context r1 = r6.f31519a
            boolean r0 = pg.g9.m11663c(r1, r0)
            if (r0 != 0) goto L99
            java.lang.String r0 = "Searching CallLogs for recording >>> folder path read permission not available, path:= "
            java.lang.String r7 = r0.concat(r7)
            r6.m12616i(r7, r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L99:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12619m(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12620n(ww.AbstractC8193c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof rn.C6579h
            if (r0 == 0) goto L13
            r0 = r12
            rn.h r0 = (rn.C6579h) r0
            int r1 = r0.f31518g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31518g = r1
            goto L18
        L13:
            rn.h r0 = new rn.h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f31516e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31518g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r2 = r0.f31515d
            java.util.Iterator r4 = r0.f31514c
            java.util.List r6 = r0.f31513b
            java.util.List r7 = r0.f31512a
            og.od.m10798c(r12)
            goto L70
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            og.od.m10798c(r12)
            goto L59
        L3f:
            og.od.m10798c(r12)
            r0.f31518g = r4
            xm.s2 r12 = r11.f31523e
            gn.x2 r12 = r12.f40818c
            an.h3 r12 = r12.f14941a
            z7.w r12 = r12.f899a
            ad.h r2 = new ad.h
            r6 = 6
            r2.<init>(r6)
            java.lang.Object r12 = og.pe.m10839n(r0, r12, r4, r5, r2)
            if (r12 != r1) goto L59
            goto L9c
        L59:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto Laf
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L64
            goto Laf
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r12.iterator()
            r7 = r12
            r6 = r2
            r2 = r5
        L70:
            boolean r12 = r4.hasNext()
            xm.x1 r8 = r11.f31522d
            if (r12 == 0) goto L9d
            java.lang.Object r12 = r4.next()
            mm.b r12 = (mm.C4791b) r12
            int r9 = r12.f23832a
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r6.add(r10)
            int r12 = r12.f23832a
            zm.c r9 = zm.EnumC8993c.UPLOAD_FAILED
            r0.f31512a = r7
            r0.f31513b = r6
            r0.f31514c = r4
            r0.f31515d = r2
            r0.f31518g = r3
            java.lang.Object r12 = r8.m15659J(r12, r9, r5, r0)
            if (r12 != r1) goto L70
        L9c:
            return r1
        L9d:
            im.d r12 = new im.d
            r12.<init>(r6)
            r8.m15651B(r12)
            int r12 = r7.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            return r0
        Laf:
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12620n(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r12 != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12621o(ww.AbstractC8193c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof rn.C6580i
            if (r0 == 0) goto L13
            r0 = r12
            rn.i r0 = (rn.C6580i) r0
            int r1 = r0.f31540d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31540d = r1
            goto L18
        L13:
            rn.i r0 = new rn.i
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f31538b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31540d
            qw.a0 r3 = qw.a0.f30746a
            xm.z r4 = r11.f31521c
            xm.s2 r5 = r11.f31523e
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r2 == 0) goto L54
            if (r2 == r10) goto L50
            if (r2 == r9) goto L4c
            if (r2 == r8) goto L48
            if (r2 == r7) goto L42
            if (r2 != r6) goto L3a
            og.od.m10798c(r12)
            goto Lc2
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L42:
            boolean r2 = r0.f31537a
            og.od.m10798c(r12)
            goto La6
        L48:
            og.od.m10798c(r12)
            goto L82
        L4c:
            og.od.m10798c(r12)
            goto L71
        L50:
            og.od.m10798c(r12)
            goto L60
        L54:
            og.od.m10798c(r12)
            r0.f31540d = r10
            java.lang.Object r12 = r5.m15619b(r0)
            if (r12 != r1) goto L60
            goto Lc1
        L60:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc9
            r0.f31540d = r9
            java.lang.Object r12 = r4.m15715e(r0)
            if (r12 != r1) goto L71
            goto Lc1
        L71:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto Lc9
            r0.f31540d = r8
            java.lang.Object r12 = r4.m15715e(r0)
            if (r12 != r1) goto L82
            goto Lc1
        L82:
            java.lang.String r12 = (java.lang.String) r12
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.content.Context r2 = r11.f31519a
            boolean r2 = pg.g9.m11663c(r2, r12)
            if (r2 != 0) goto Lc9
            java.lang.String r12 = "PermissionsViewModel"
            java.lang.String r4 = "Recording Folder permission found removed, removing path from data store"
            yv.t r8 = r11.f31531m
            r8.m16232g(r12, r4)
            r0.f31537a = r2
            r0.f31540d = r7
            java.lang.String r12 = ""
            java.lang.Object r12 = r11.m12605F(r12, r0)
            if (r12 != r1) goto La6
            goto Lc1
        La6:
            r0.f31537a = r2
            r0.f31540d = r6
            fn.i r12 = r5.f40819d
            km.a r12 = r12.f10585a
            java.lang.String r2 = "is_recording_folder_locked"
            km.o r12 = (km.C4120o) r12
            r4 = 0
            java.lang.Object r12 = r12.m8887i(r2, r4, r0)
            if (r12 != r1) goto Lba
            goto Lbb
        Lba:
            r12 = r3
        Lbb:
            if (r12 != r1) goto Lbe
            goto Lbf
        Lbe:
            r12 = r3
        Lbf:
            if (r12 != r1) goto Lc2
        Lc1:
            return r1
        Lc2:
            uo.j r12 = r11.f31528j
            android.content.Context r0 = r12.f36145d
            r12.m14286c(r0)
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12621o(ww.c):java.lang.Object");
    }

    /* renamed from: p */
    public final void m12622p() {
        int i10 = 2;
        InterfaceC7559c interfaceC7559c = null;
        C0473m c0473m = new C0473m(i10, 10, interfaceC7559c);
        C8810d c8810d = this.f31530l;
        tx.c0.m13502y(c8810d, null, null, c0473m, 3);
        tx.c0.m13502y(c8810d, null, null, new C0473m(i10, 11, interfaceC7559c), 3);
        tx.c0.m13502y(c8810d, null, null, new C0473m(i10, 12, interfaceC7559c), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        if (r2 == r4) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12623r(int r17, ww.AbstractC8193c r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12623r(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m12624s(com.amplifyframework.storage.StoragePath r19, java.io.File r20, ww.AbstractC8193c r21) {
        /*
            r18 = this;
            r0 = r21
            boolean r1 = r0 instanceof rn.C6582k
            if (r1 == 0) goto L17
            r1 = r0
            rn.k r1 = (rn.C6582k) r1
            int r2 = r1.f31565c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f31565c = r2
            r4 = r18
            goto L1e
        L17:
            rn.k r1 = new rn.k
            r4 = r18
            r1.<init>(r4, r0)
        L1e:
            java.lang.Object r0 = r1.f31563a
            vw.a r9 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r1.f31565c
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L38
            if (r2 != r10) goto L30
            og.od.m10798c(r0)     // Catch: java.lang.Throwable -> L2e
            goto L82
        L2e:
            r0 = move-exception
            goto L85
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            og.od.m10798c(r0)
            com.amplifyframework.kotlin.core.Amplify$Companion r0 = com.amplifyframework.kotlin.core.Amplify.Companion
            com.amplifyframework.kotlin.storage.KotlinStorageFacade r12 = r0.getStorage()
            r16 = 4
            r17 = 0
            r15 = 0
            r13 = r19
            r14 = r20
            com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation r3 = com.amplifyframework.kotlin.storage.Storage.uploadFile$default(r12, r13, r14, r15, r16, r17)
            kotlin.jvm.internal.v r5 = new kotlin.jvm.internal.v
            r5.<init>()
            ay.f r0 = tx.m0.f34659a
            ay.e r0 = ay.ExecutorC0495e.f3538c
            yx.d r0 = tx.c0.m13479b(r0)
            rn.n r2 = new rn.n     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r6 = r3
            r3 = r5
            r5 = r20
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            r5 = r3
            r3 = r6
            r12 = 3
            tx.g0 r7 = tx.c0.m13482e(r0, r11, r2, r12)     // Catch: java.lang.Throwable -> L2e
            rn.m r2 = new rn.m     // Catch: java.lang.Throwable -> L2e
            r8 = 0
            r6 = r18
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            tx.c0.m13502y(r0, r11, r11, r2, r12)     // Catch: java.lang.Throwable -> L2e
            r1.f31565c = r10     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r7.m13563m(r1)     // Catch: java.lang.Throwable -> L2e
            if (r0 != r9) goto L82
            return r9
        L82:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e
            goto L89
        L85:
            qw.m r0 = og.od.m10796a(r0)
        L89:
            boolean r1 = r0 instanceof qw.C6363m
            if (r1 != 0) goto L92
            if (r1 == 0) goto L90
            goto L96
        L90:
            r11 = r0
            goto L96
        L92:
            java.lang.Throwable r11 = qw.C6364n.m12363a(r0)
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12624s(com.amplifyframework.storage.StoragePath, java.io.File, ww.c):java.io.Serializable");
    }

    /* renamed from: t */
    public final LocalDateTime m12625t(String str) {
        try {
            String str2 = (String) AbstractC6663m.m12750N(AbstractC5178p.m10112W(str, new String[]{"/"}, 6));
            if (str2.length() <= 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = str2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str2.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            if (string.length() <= 0 || Long.parseLong(string) <= 0) {
                return null;
            }
            C8800o c8800o = C8800o.f42459a;
            return C8800o.m16182F(Long.parseLong(string));
        } catch (Exception e2) {
            m12616i("exception while getting dateTime from Intent (gDialer)", e2);
            this.f31531m.m16238m("exception while getting dateTime from Intent (gDialer)", e2);
            return null;
        }
    }

    /* renamed from: u */
    public final Object m12626u(EnumC8993c enumC8993c, AbstractC8193c abstractC8193c) {
        x2 x2Var = this.f31523e.f40818c;
        String strName = enumC8993c.name();
        h3 h3Var = x2Var.f14941a;
        List listM10834i = pe.m10834i(EnumC8994d.OUTGOING, EnumC8994d.INCOMING);
        StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT DISTINCT cl.*, sd.is_call_recording, sd.call_recording_subscription_start_time, sd.call_recording_subscription_end_time FROM CallLog AS cl INNER JOIN UserSimDetails AS sd ON cl.sim_number = sd.sim_number WHERE call_type IN (");
        int iM14323c = a1.m14323c(listM10834i, sbM14338r, ") AND duration > 0 AND is_call_recording = '1' AND date_time BETWEEN call_recording_subscription_start_time AND call_recording_subscription_end_time  AND (call_record_sync_status = ", "?", ") ORDER BY date_time DESC");
        String string = sbM14338r.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.w0(string, listM10834i, iM14323c, strName, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12627w(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rn.C6586o
            if (r0 == 0) goto L13
            r0 = r6
            rn.o r0 = (rn.C6586o) r0
            int r1 = r0.f31608d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31608d = r1
            goto L18
        L13:
            rn.o r0 = new rn.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f31606b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31608d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f31605a
            og.od.m10798c(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f31605a = r5
            r0.f31608d = r3
            xm.y5 r6 = r4.f31520b
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            r2 = r0
            mm.m r2 = (mm.C4802m) r2
            java.lang.String r2 = r2.f23891c
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r5)
            if (r2 == 0) goto L47
            goto L5f
        L5e:
            r0 = r1
        L5f:
            mm.m r0 = (mm.C4802m) r0
            if (r0 == 0) goto L66
            java.lang.String r5 = r0.f23897i
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12627w(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12628x(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rn.C6587p
            if (r0 == 0) goto L13
            r0 = r5
            rn.p r0 = (rn.C6587p) r0
            int r1 = r0.f31621c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31621c = r1
            goto L18
        L13:
            rn.p r0 = new rn.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31619a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31621c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f31621c = r3
            xm.z r5 = r4.f31521c
            java.lang.Object r5 = r5.m15715e(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r5 = r5.getPath()
            r0 = 0
            if (r5 == 0) goto L56
            java.lang.String r1 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            java.util.List r5 = nx.AbstractC5178p.m10112W(r5, r1, r2)
            goto L57
        L56:
            r5 = r0
        L57:
            if (r5 == 0) goto L7f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L60
            goto L7f
        L60:
            int r0 = r5.size()
            r1 = 2
            if (r0 != r1) goto L78
            java.lang.Object r5 = r5.get(r3)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r0 = r5.length()
            if (r0 != 0) goto L75
            java.lang.String r5 = "full device selected"
        L75:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L78:
            java.lang.Object r5 = rw.AbstractC6663m.m12742F(r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.m12628x(ww.c):java.lang.Object");
    }

    /* renamed from: y */
    public final Object m12629y(AbstractC8193c abstractC8193c) {
        h3 h3Var = this.f31523e.f40818c.f14941a;
        List listM10834i = pe.m10834i(EnumC8994d.OUTGOING, EnumC8994d.INCOMING);
        StringBuilder sbM14338r = a1.m14338r(h3Var, "SELECT cl.*, sd.is_call_recording, sd.call_recording_subscription_start_time, sd.call_recording_subscription_end_time FROM CallLog AS cl INNER JOIN UserSimDetails AS sd ON cl.sim_number = sd.sim_number WHERE call_type IN (");
        ue.m10986b(listM10834i.size(), sbM14338r);
        sbM14338r.append(") AND duration > 0 AND is_connect = '1' AND is_call_recording = '1' AND date_time BETWEEN call_recording_subscription_start_time AND call_recording_subscription_end_time  AND COALESCE(call_record_sync_status, '') = '' AND COALESCE(call_record_compress_path, '') = '' ORDER BY date_time DESC");
        String string = sbM14338r.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new a2(0, string, listM10834i));
    }

    /* renamed from: z */
    public final boolean m12630z(Intent intent, C5130b c5130b) {
        C8805t c8805t = this.f31531m;
        if (intent == null) {
            c8805t.m16231f("CallRecording Attach ext: intent is null");
            return false;
        }
        boolean zM8918a = AbstractC4154l.m8918a(intent.getAction(), "android.intent.action.SEND");
        String type = intent.getType();
        boolean z6 = type != null && AbstractC5185w.m10138t(type, "audio/", false);
        Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (zM8918a && z6) {
            if (uri != null) {
                c5130b.invoke(uri);
                return true;
            }
            c8805t.m16231f("CallRecording Attach ext: uri is null");
            return false;
        }
        c8805t.m16231f("GetIntentData: not shareIntent or not correct type: " + intent.getAction() + " and " + intent.getType());
        return false;
    }
}
