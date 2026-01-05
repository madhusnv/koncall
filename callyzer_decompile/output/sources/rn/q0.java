package rn;

import a2.AbstractC0030c;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kn.C4122b;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import pg.f9;
import po.C5984e;
import pt.C6031e;
import so.C6877c;
import u8.C7368p;
import ug.C7452w;
import uo.C7485j;
import wo.C8134s;
import wx.w0;
import xm.C8418z;
import xm.s2;
import xm.x1;
import yv.C8789d;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a */
    public final Context f31631a;

    /* renamed from: b */
    public final s2 f31632b;

    /* renamed from: c */
    public final x1 f31633c;

    /* renamed from: d */
    public final C6877c f31634d;

    /* renamed from: e */
    public final w0 f31635e;

    /* renamed from: f */
    public final C8134s f31636f;

    /* renamed from: g */
    public final C5984e f31637g;

    /* renamed from: h */
    public final C8805t f31638h;

    /* renamed from: i */
    public final C7485j f31639i;

    /* renamed from: j */
    public final C8418z f31640j;

    /* renamed from: k */
    public final C8810d f31641k;

    /* renamed from: l */
    public final ArrayList f31642l;

    public q0(Context context, s2 callRecordingRepository, x1 x1Var, C6877c c6877c, w0 w0Var, C8134s c8134s, C5984e c5984e, C8805t c8805t, C7485j c7485j, C8418z appPreferencesRepository) {
        AbstractC4154l.m8923f(callRecordingRepository, "callRecordingRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        this.f31631a = context;
        this.f31632b = callRecordingRepository;
        this.f31633c = x1Var;
        this.f31634d = c6877c;
        this.f31635e = w0Var;
        this.f31636f = c8134s;
        this.f31637g = c5984e;
        this.f31638h = c8805t;
        this.f31639i = c7485j;
        this.f31640j = appPreferencesRepository;
        C0496f c0496f = tx.m0.f34659a;
        this.f31641k = tx.c0.m13479b(ExecutorC0495e.f3538c);
        this.f31642l = new ArrayList();
    }

    /* renamed from: a */
    public static boolean m12631a(String str) {
        if (str == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        return patternCompile.matcher(str).find();
    }

    /* renamed from: c */
    public static /* synthetic */ void m12632c(q0 q0Var, String str) {
        q0Var.m12635b(str, null);
    }

    /* renamed from: s */
    public static String m12634s(q0 q0Var, String input) {
        Pattern patternCompile = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        AbstractC4154l.m8923f(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: b */
    public final void m12635b(String str, Exception exc) {
        C8805t c8805t = this.f31638h;
        if (exc == null) {
            AbstractC1452a.m4579z("FindCallRecordingUseCase >>> ", str, c8805t);
            return;
        }
        c8805t.m16231f("FindCallRecordingUseCase >>> " + str + " -- " + exc);
    }

    /* renamed from: d */
    public final void m12636d(boolean z6, ArrayList arrayList, boolean z10) {
        Context context = this.f31631a;
        C7452w c7452w = s2.f40808l;
        synchronized (c7452w) {
            s2.f40810n.clear();
        }
        if (z6) {
            C7368p.m13783g(context).m13784f("CompressWork");
        }
        c7452w.m14179d(arrayList);
        tx.c0.m13502y(this.f31641k, null, null, new C6031e(this, z10, null), 3);
        C8789d.f42453a.m16166l(context);
        m12635b("enqueueCompress: worker is called", null);
    }

    /* renamed from: e */
    public final boolean m12637e(C4792c c4792c, List list, C4122b c4122b) {
        C8805t c8805t = this.f31638h;
        C8800o c8800o = C8800o.f42459a;
        long jM16184H = C8800o.m16184H(c4792c.f23849f);
        String input = c4792c.f23845b;
        if (input == null) {
            input = c4792c.f23844a;
        }
        boolean zM12653w = false;
        if (c4122b.f21065c < jM16184H) {
            return false;
        }
        try {
            zM12653w = m12653w(c4122b, c4792c, input, list);
        } catch (IllegalStateException e2) {
            AbstractC1452a.m4579z("validateNumberOrNameInDocName >> exception : ", e2.getMessage(), c8805t);
        }
        if (!zM12653w) {
            Pattern patternCompile = Pattern.compile("[-/.,:;_`!@#$%^&*<>?\\\\|\"']");
            AbstractC4154l.m8922e(patternCompile, "compile(...)");
            AbstractC4154l.m8923f(input, "input");
            if (patternCompile.matcher(input).find()) {
                String str = c4122b.f21064b;
                String str2 = Build.BRAND;
                StringBuilder sbM127r = AbstractC0030c.m127r("filterByNameAndNumber : not matched >>>> callLog name: ", input, " , file name: ", str, ",device: ");
                sbM127r.append(str2);
                String string = sbM127r.toString();
                m12635b(string, null);
                c8805t.m16231f(string);
            }
        }
        return zM12653w;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0667 -> B:159:0x075a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0741 -> B:158:0x0749). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x0929 -> B:294:0x0d5a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x0ae0 -> B:294:0x0d5a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x0c26 -> B:294:0x0d5a). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public final java.lang.Object m12638f(boolean r42, boolean r43, boolean r44, ex.InterfaceC2139c r45, ww.AbstractC8193c r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12638f(boolean, boolean, boolean, ex.c, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Cursor m12639h(Uri uri) {
        Uri uri2;
        try {
            uri2 = uri;
        } catch (Exception e2) {
            e = e2;
            uri2 = uri;
        }
        try {
            return this.f31631a.getContentResolver().query(uri2, new String[]{"document_id", "_display_name", "last_modified", "_size", "mime_type"}, null, null, null);
        } catch (Exception e10) {
            e = e10;
            Exception exc = e;
            exc.printStackTrace();
            m12635b("getDocumentCursor >>> uri:=" + uri2, exc);
            this.f31638h.m16234i("FindCallRecordingUseCase >>> getDocumentCursor >>> uri:=" + uri2, exc);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:31|135|32|(1:34)(21:35|36|(0)(1:39)|141|40|41|147|42|43|(14:85|86|151|87|88|131|89|90|137|91|92|159|93|94)(4:133|46|(2:48|(6:143|50|51|155|52|53)(16:59|139|60|61|161|62|63|165|64|65|66|67|68|69|149|70))(1:84)|71)|74|75|113|153|114|115|157|116|117|145|118)|38|141|40|41|147|42|43|(14:85|86|151|87|88|131|89|90|137|91|92|159|93|94)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0356, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0357, code lost:
    
        r30 = r6;
        r23 = r10;
        r3 = r18;
        r18 = r20;
        r13 = r21;
        r12 = r24;
        r2 = r27;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x036a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036b, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040c A[LOOP:1: B:13:0x00af->B:130:0x040c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x040b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5 A[Catch: Exception -> 0x0294, TRY_LEAVE, TryCatch #9 {Exception -> 0x0294, blocks: (B:70:0x0280, B:85:0x02d5), top: B:149:0x0280 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m12640i(android.database.Cursor r34, long r35, android.net.Uri r37) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12640i(android.database.Cursor, long, android.net.Uri):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x016a A[LOOP:0: B:4:0x0020->B:44:0x016a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166 A[SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m12641j(android.database.Cursor r24, java.lang.String r25, long r26, android.net.Uri r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12641j(android.database.Cursor, java.lang.String, long, android.net.Uri):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0312 A[Catch: Exception -> 0x0337, TRY_LEAVE, TryCatch #1 {Exception -> 0x0337, blocks: (B:72:0x02ef, B:74:0x0312), top: B:91:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m12642k(long r38, android.net.Uri r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12642k(long, android.net.Uri):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d0 A[LOOP:2: B:82:0x02f8->B:108:0x03d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025f A[Catch: Exception -> 0x0229, TryCatch #4 {Exception -> 0x0229, blocks: (B:57:0x0211, B:64:0x0232, B:66:0x025f, B:70:0x0282), top: B:143:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d6  */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m12643l(long r33, android.net.Uri r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12643l(long, android.net.Uri):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12644m(boolean r17, ww.AbstractC8193c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof rn.k0
            if (r2 == 0) goto L17
            r2 = r1
            rn.k0 r2 = (rn.k0) r2
            int r3 = r2.f31568c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31568c = r3
            goto L1c
        L17:
            rn.k0 r2 = new rn.k0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f31566a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f31568c
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            og.od.m10798c(r1)
            goto Lbd
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            og.od.m10798c(r1)
            r2.f31568c = r5
            xm.s2 r1 = r0.f31632b
            gn.x2 r1 = r1.f40818c
            an.h3 r10 = r1.f14941a
            java.lang.String r4 = "toString(...)"
            java.lang.String r6 = "    "
            java.lang.String r7 = "        AND ((T1.call_record_source_path IS NULL OR  T1.call_record_source_path='') OR (T1.call_record_compress_path IS NULL OR T1.call_record_compress_path=''))"
            java.lang.String r8 = "        AND T1.date_time BETWEEN S1.call_recording_subscription_start_time AND S1.call_recording_subscription_end_time "
            java.lang.String r9 = "\n"
            java.lang.String r11 = ") AND T1.duration > 0 AND S1.is_call_recording = 1 "
            java.lang.String r12 = "\n        SELECT MIN(date_time) FROM CallLog T1 LEFT JOIN UserSimDetails S1  ON S1.sim_number = T1.sim_number \n        WHERE T1.call_type IN ("
            if (r17 == 0) goto L85
            zm.d r13 = zm.EnumC8994d.OUTGOING
            zm.d r14 = zm.EnumC8994d.INCOMING
            zm.d[] r13 = new zm.EnumC8994d[]{r13, r14}
            java.util.List r13 = og.pe.m10834i(r13)
            zm.c r14 = zm.EnumC8993c.NOT_FOUND
            java.lang.StringBuilder r12 = p020v.a1.m14338r(r10, r12)
            int r8 = p020v.a1.m14323c(r13, r12, r11, r9, r8)
            java.lang.String r11 = "?"
            java.lang.String r15 = ")) "
            java.lang.String r1 = "        AND ((T1.call_record_sync_status IS NULL OR T1.call_record_sync_status='') OR (T1.call_record_sync_status="
            p020v.a1.m14319B(r12, r9, r1, r11, r15)
            java.lang.String r7 = a2.AbstractC0030c.m124o(r12, r9, r7, r9, r6)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r7, r4)
            z7.w r1 = r10.f899a
            an.a1 r6 = new an.a1
            r9 = r8
            r8 = r13
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r4 = 0
            java.lang.Object r1 = og.pe.m10839n(r2, r1, r5, r4, r6)
            goto Lba
        L85:
            zm.d r1 = zm.EnumC8994d.OUTGOING
            zm.d r13 = zm.EnumC8994d.INCOMING
            zm.d[] r1 = new zm.EnumC8994d[]{r1, r13}
            java.util.List r1 = og.pe.m10834i(r1)
            java.lang.StringBuilder r12 = p020v.a1.m14338r(r10, r12)
            int r13 = r1.size()
            og.ue.m10986b(r13, r12)
            r12.append(r11)
            r12.append(r9)
            r12.append(r8)
            java.lang.String r8 = "        AND (T1.call_record_sync_status IS NULL OR T1.call_record_sync_status='') "
            p020v.a1.m14319B(r12, r9, r8, r9, r7)
            java.lang.String r4 = org.bouncycastle.jcajce.provider.digest.AbstractC5601a.m11241l(r12, r9, r6, r4)
            z7.w r6 = r10.f899a
            an.a2 r7 = new an.a2
            r7.<init>(r5, r4, r1)
            r4 = 0
            java.lang.Object r1 = og.pe.m10839n(r2, r6, r5, r4, r7)
        Lba:
            if (r1 != r3) goto Lbd
            return r3
        Lbd:
            j$.time.LocalDateTime r1 = (j$.time.LocalDateTime) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "FindCallRecordingUseCase >> GetMinimumDateTime : "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            yv.t r3 = r0.f31638h
            r3.m16231f(r2)
            if (r1 != 0) goto Ldc
            java.lang.Long r1 = new java.lang.Long
            r2 = -1
            r1.<init>(r2)
            return r1
        Ldc:
            yv.o r2 = yv.C8800o.f42459a
            long r1 = yv.C8800o.m16184H(r1)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12644m(boolean, ww.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:89:0x01d6, B:97:0x01f1], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:91:0x01dc, B:94:0x01ec], limit reached: 151 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215 A[Catch: all -> 0x0142, Exception -> 0x020e, TRY_LEAVE, TryCatch #2 {Exception -> 0x020e, blocks: (B:106:0x0207, B:112:0x0215), top: B:137:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161 A[Catch: all -> 0x004b, Exception -> 0x0167, TryCatch #8 {Exception -> 0x0167, blocks: (B:75:0x01a7, B:77:0x01ab, B:79:0x01af, B:81:0x01bf, B:83:0x01c6, B:85:0x01cc, B:87:0x01d0, B:102:0x01fa, B:57:0x015a, B:59:0x0161, B:64:0x016d, B:67:0x0179, B:69:0x0180, B:71:0x0187, B:89:0x01d6, B:91:0x01dc), top: B:146:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d A[Catch: all -> 0x004b, Exception -> 0x0167, TryCatch #8 {Exception -> 0x0167, blocks: (B:75:0x01a7, B:77:0x01ab, B:79:0x01af, B:81:0x01bf, B:83:0x01c6, B:85:0x01cc, B:87:0x01d0, B:102:0x01fa, B:57:0x015a, B:59:0x0161, B:64:0x016d, B:67:0x0179, B:69:0x0180, B:71:0x0187, B:89:0x01d6, B:91:0x01dc), top: B:146:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v23, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a4 -> B:146:0x01a7). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12645n(mm.C4792c r27, ww.AbstractC8193c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12645n(mm.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123 A[Catch: all -> 0x00c5, Exception -> 0x00c9, TryCatch #1 {all -> 0x00c5, blocks: (B:36:0x00b8, B:42:0x00cd, B:44:0x00d3, B:46:0x00d9, B:49:0x00e8, B:52:0x00f0, B:54:0x00f6, B:56:0x00fe, B:59:0x0106, B:63:0x010f, B:66:0x0116, B:71:0x0132, B:73:0x0138, B:75:0x013d, B:91:0x0168, B:96:0x0171, B:101:0x019a, B:77:0x0143, B:79:0x0149, B:68:0x0123, B:87:0x015f, B:98:0x0190), top: B:117:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158 A[PHI: r11
      0x0158: PHI (r11v17 java.lang.String) = (r11v16 java.lang.String), (r11v19 java.lang.String) binds: [B:78:0x0147, B:80:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f A[Catch: all -> 0x00c5, Exception -> 0x00c9, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:36:0x00b8, B:42:0x00cd, B:44:0x00d3, B:46:0x00d9, B:49:0x00e8, B:52:0x00f0, B:54:0x00f6, B:56:0x00fe, B:59:0x0106, B:63:0x010f, B:66:0x0116, B:71:0x0132, B:73:0x0138, B:75:0x013d, B:91:0x0168, B:96:0x0171, B:101:0x019a, B:77:0x0143, B:79:0x0149, B:68:0x0123, B:87:0x015f, B:98:0x0190), top: B:117:0x007b }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12646o(mm.C4792c r19, ww.AbstractC8193c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12646o(mm.c, ww.c):java.lang.Object");
    }

    /* renamed from: p */
    public final Uri m12647p(Uri uri) {
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.isDocumentUri(this.f31631a, uri) ? DocumentsContract.getDocumentId(uri) : DocumentsContract.getTreeDocumentId(uri));
        AbstractC4154l.m8922e(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
        return uriBuildDocumentUriUsingTree;
    }

    /* renamed from: q */
    public final boolean m12648q(C4122b c4122b, C4792c c4792c) {
        long jM15622f = this.f31632b.m15622f(c4122b.f21063a, c4122b.f21064b);
        if (jM15622f <= 0) {
            return false;
        }
        long j6 = c4792c.f23854l;
        return j6 > 0 && C8800o.m16182F(jM15622f).mo7846m().equals(C8800o.m16182F(j6).mo7846m()) && jM15622f <= c4792c.f23854l + ((long) 5000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (wo.C8134s.m15300o(r5, null, null, null, "0 recording found in folder", r10, 7) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009c -> B:26:0x00a2). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12649r(ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12649r(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12650t(java.util.List r14, boolean r15) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12650t(java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3 A[Catch: Exception -> 0x005e, SecurityException -> 0x01cf, IllegalArgumentException -> 0x01d1, TryCatch #10 {Exception -> 0x005e, blocks: (B:17:0x0053, B:155:0x03d0, B:158:0x03da, B:160:0x03ec, B:30:0x0085, B:149:0x038c, B:151:0x03a7, B:37:0x00a1, B:54:0x00e2, B:55:0x00ef, B:58:0x00f7, B:60:0x010e, B:62:0x0118, B:64:0x011c, B:66:0x0120, B:68:0x0128, B:70:0x012e, B:78:0x014b, B:93:0x0187, B:95:0x018d, B:101:0x01d3, B:102:0x01d7, B:104:0x01dd, B:108:0x01ed, B:110:0x01f1, B:112:0x0232, B:114:0x0239, B:117:0x024e, B:119:0x0293, B:121:0x02a1, B:123:0x02cc, B:125:0x02e6, B:126:0x0308, B:128:0x0310, B:132:0x031f, B:135:0x0328, B:136:0x0336, B:141:0x0340, B:144:0x0347, B:139:0x033b, B:145:0x034b, B:122:0x02c4, B:118:0x0287, B:48:0x00c1, B:50:0x00c7, B:91:0x0183), top: B:199:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a7 A[Catch: Exception -> 0x005e, SecurityException -> 0x01cf, IllegalArgumentException -> 0x01d1, TRY_LEAVE, TryCatch #10 {Exception -> 0x005e, blocks: (B:17:0x0053, B:155:0x03d0, B:158:0x03da, B:160:0x03ec, B:30:0x0085, B:149:0x038c, B:151:0x03a7, B:37:0x00a1, B:54:0x00e2, B:55:0x00ef, B:58:0x00f7, B:60:0x010e, B:62:0x0118, B:64:0x011c, B:66:0x0120, B:68:0x0128, B:70:0x012e, B:78:0x014b, B:93:0x0187, B:95:0x018d, B:101:0x01d3, B:102:0x01d7, B:104:0x01dd, B:108:0x01ed, B:110:0x01f1, B:112:0x0232, B:114:0x0239, B:117:0x024e, B:119:0x0293, B:121:0x02a1, B:123:0x02cc, B:125:0x02e6, B:126:0x0308, B:128:0x0310, B:132:0x031f, B:135:0x0328, B:136:0x0336, B:141:0x0340, B:144:0x0347, B:139:0x033b, B:145:0x034b, B:122:0x02c4, B:118:0x0287, B:48:0x00c1, B:50:0x00c7, B:91:0x0183), top: B:199:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018d A[Catch: Exception -> 0x005e, SecurityException -> 0x01cf, IllegalArgumentException -> 0x01d1, TryCatch #10 {Exception -> 0x005e, blocks: (B:17:0x0053, B:155:0x03d0, B:158:0x03da, B:160:0x03ec, B:30:0x0085, B:149:0x038c, B:151:0x03a7, B:37:0x00a1, B:54:0x00e2, B:55:0x00ef, B:58:0x00f7, B:60:0x010e, B:62:0x0118, B:64:0x011c, B:66:0x0120, B:68:0x0128, B:70:0x012e, B:78:0x014b, B:93:0x0187, B:95:0x018d, B:101:0x01d3, B:102:0x01d7, B:104:0x01dd, B:108:0x01ed, B:110:0x01f1, B:112:0x0232, B:114:0x0239, B:117:0x024e, B:119:0x0293, B:121:0x02a1, B:123:0x02cc, B:125:0x02e6, B:126:0x0308, B:128:0x0310, B:132:0x031f, B:135:0x0328, B:136:0x0336, B:141:0x0340, B:144:0x0347, B:139:0x033b, B:145:0x034b, B:122:0x02c4, B:118:0x0287, B:48:0x00c1, B:50:0x00c7, B:91:0x0183), top: B:199:0x003e }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r32v0, types: [rn.q0] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12651u(mm.C4792c r33, java.util.List r34, java.util.List r35, ww.AbstractC8193c r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12651u(mm.c, java.util.List, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12652v(java.util.List r13, ww.AbstractC8193c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof rn.p0
            if (r0 == 0) goto L13
            r0 = r14
            rn.p0 r0 = (rn.p0) r0
            int r1 = r0.f31629h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31629h = r1
            goto L18
        L13:
            rn.p0 r0 = new rn.p0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f31627f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31629h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r13 = r0.f31626e
            int r2 = r0.f31625d
            int r5 = r0.f31624c
            int r6 = r0.f31623b
            java.util.Iterator r7 = r0.f31622a
            og.od.m10798c(r14)
            goto L72
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            og.od.m10798c(r14)
            yv.f r14 = yv.C8791f.f42457a
            if (r13 == 0) goto Lba
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L4a:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r13.next()
            r5 = r2
            kn.a r5 = (kn.C4121a) r5
            mm.b r5 = r5.f21054a
            java.lang.String r5 = r5.f23837f
            if (r5 == 0) goto L4a
            int r5 = r5.length()
            if (r5 != 0) goto L64
            goto L4a
        L64:
            r14.add(r2)
            goto L4a
        L68:
            java.util.Iterator r13 = r14.iterator()
            r14 = 0
            r7 = r13
            r13 = r14
            r2 = r13
            r5 = r2
            r6 = r5
        L72:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto Lbf
            java.lang.Object r14 = r7.next()
            kn.a r14 = (kn.C4121a) r14
            mm.b r14 = r14.f21054a
            int r8 = r14.f23832a
            java.lang.String r9 = r14.f23837f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Setting SourcePath in DB >> "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = " >>> "
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r12.m12635b(r8, r3)
            int r8 = r14.f23832a
            java.lang.String r14 = r14.f23837f
            if (r14 != 0) goto La5
            java.lang.String r14 = ""
        La5:
            r0.f31622a = r7
            r0.f31623b = r6
            r0.f31624c = r5
            r0.f31625d = r2
            r0.f31626e = r13
            r0.f31629h = r4
            xm.s2 r9 = r12.f31632b
            java.lang.Object r14 = r9.m15634s(r8, r14, r0)
            if (r14 != r1) goto L72
            return r1
        Lba:
            java.lang.String r13 = "updateCRPath: null list found"
            r12.m12635b(r13, r3)
        Lbf:
            qw.a0 r13 = qw.a0.f30746a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.q0.m12652v(java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: w */
    public final boolean m12653w(C4122b c4122b, C4792c c4792c, String str, List list) {
        s2 s2Var;
        String str2 = c4122b.f21064b;
        if (!AbstractC5178p.m10116x(AbstractC5185w.m10136r(str2, " ", ""), c4792c.f23846c, false) && !AbstractC5178p.m10116x(f9.m11633g(str2), f9.m11633g(str), true) && ((!AbstractC5178p.m10117y(str, ' ') || !AbstractC5178p.m10116x(str2, AbstractC5185w.m10136r(str, " ", ""), false)) && (!m12631a(str) || !AbstractC5178p.m10116x(str2, m12634s(this, str), true)))) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3 != null && str3.length() != 0 && AbstractC5178p.m10116x(f9.m11633g(str2), f9.m11633g(str3), true)) {
                        break;
                    }
                }
                s2Var = this.f31632b;
                s2Var.getClass();
                if (!AbstractC5178p.m10116x(AbstractC5185w.m10136r(AbstractC5185w.m10136r(s2Var.m15631p(c4122b), " ", ""), "-", ""), c4792c.f23846c, false) || AbstractC5178p.m10116x(c4792c.f23844a, s2Var.m15631p(c4122b), false)) {
                    break;
                }
                return false;
            }
            s2Var = this.f31632b;
            s2Var.getClass();
            if (AbstractC5178p.m10116x(AbstractC5185w.m10136r(AbstractC5185w.m10136r(s2Var.m15631p(c4122b), " ", ""), "-", ""), c4792c.f23846c, false)) {
            }
        }
        return true;
    }
}
