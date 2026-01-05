package yo;

import android.telephony.TelephonyManager;
import kotlin.jvm.internal.AbstractC4154l;
import so.C6877c;
import xm.C8418z;
import xm.w2;
import xm.y5;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yo.d */
/* loaded from: classes3.dex */
public final class C8720d {

    /* renamed from: a */
    public final w2 f42185a;

    /* renamed from: b */
    public final y5 f42186b;

    /* renamed from: c */
    public final C6877c f42187c;

    /* renamed from: d */
    public final C8805t f42188d;

    /* renamed from: e */
    public final TelephonyManager f42189e;

    /* renamed from: f */
    public final C8418z f42190f;

    public C8720d(w2 w2Var, y5 userSIMRepository, C6877c c6877c, C8805t c8805t, TelephonyManager telephonyManager, C8418z appPreferencesRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        this.f42185a = w2Var;
        this.f42186b = userSIMRepository;
        this.f42187c = c6877c;
        this.f42188d = c8805t;
        this.f42189e = telephonyManager;
        this.f42190f = appPreferencesRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16109a(java.util.List r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof yo.C8717a
            if (r0 == 0) goto L13
            r0 = r9
            yo.a r0 = (yo.C8717a) r0
            int r1 = r0.f42166c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42166c = r1
            goto L18
        L13:
            yo.a r0 = new yo.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f42164a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f42166c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L2a
            goto L5e
        L2a:
            r8 = move-exception
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L2a
            goto L46
        L38:
            og.od.m10798c(r9)
            xm.w2 r9 = r7.f42185a     // Catch: java.lang.Exception -> L2a
            r0.f42166c = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r8 = r9.m15640f(r8, r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r1) goto L46
            goto L5d
        L46:
            xm.z r8 = r7.f42190f     // Catch: java.lang.Exception -> L2a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2a
            r0.f42166c = r3     // Catch: java.lang.Exception -> L2a
            fn.i r8 = r8.f41069a     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = "fetch_contact_time"
            java.lang.Object r8 = r8.m6033m(r9, r5, r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r1) goto L59
            goto L5b
        L59:
            qw.a0 r8 = qw.a0.f30746a     // Catch: java.lang.Exception -> L2a
        L5b:
            if (r8 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kn.h r8 = new kn.h     // Catch: java.lang.Exception -> L2a
            r9 = 0
            r8.<init>(r4, r9)     // Catch: java.lang.Exception -> L2a
            return r8
        L65:
            r8.printStackTrace()
            kn.h r9 = new kn.h
            java.lang.String r0 = r8.getLocalizedMessage()
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.String r1 = "Caught Exception while insert data into DB >>> exception Message:="
            java.lang.String r2 = " \n>>> printTrace:="
            java.lang.String r8 = a2.AbstractC0030c.m121l(r1, r0, r2, r8)
            r0 = 0
            r9.<init>(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.C8720d.m16109a(java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:43|44|238|45|46|(2:47|(2:247|65)(6:(1:50)|198|51|(1:53)(1:54)|(1:(1:248)(2:62|251))(1:(2:57|249)(2:59|250))|58))|66|204|67|(3:69|70|246)(29:71|202|72|73|74|75|76|224|77|78|210|79|80|230|81|82|220|83|84|194|85|86|236|87|88|208|89|90|(2:92|252)(4:93|228|94|(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139))(10:121|107|232|122|(0)(0)|136|137|244|138|139)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(2:12|(2:14|(2:16|17)(2:18|19))(17:20|214|21|22|196|106|107|232|122|(3:212|124|125)(6:242|128|129|240|130|(1:132))|136|137|244|138|139|180|(2:182|(2:184|(1:254)(1:187))(2:188|189))(9:190|226|36|37|192|38|(2:42|176)(10:43|44|238|45|46|(2:47|(2:247|65)(6:(1:50)|198|51|(1:53)(1:54)|(1:(1:248)(2:62|251))(1:(2:57|249)(2:59|250))|58))|66|204|67|(3:69|70|246)(29:71|202|72|73|74|75|76|224|77|78|210|79|80|230|81|82|220|83|84|194|85|86|236|87|88|208|89|90|(2:92|252)(4:93|228|94|(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139))(10:121|107|232|122|(0)(0)|136|137|244|138|139))))|180|(0)(0))))(7:25|206|26|27|228|94|(0)(0))|179|180|(0)(0))(1:30))(2:31|(2:33|186)(1:34))|35|226|36|37|192|38|(1:40)|42|176|180|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:20|214|21|22|196|106|107|232|122|(3:212|124|125)(6:242|128|129|240|130|(1:132))|136|137|244|138|139|180|(2:182|(2:184|(1:254)(1:187))(2:188|189))(9:190|226|36|37|192|38|(2:42|176)(10:43|44|238|45|46|(2:47|(2:247|65)(6:(1:50)|198|51|(1:53)(1:54)|(1:(1:248)(2:62|251))(1:(2:57|249)(2:59|250))|58))|66|204|67|(3:69|70|246)(29:71|202|72|73|74|75|76|224|77|78|210|79|80|230|81|82|220|83|84|194|85|86|236|87|88|208|89|90|(2:92|252)(4:93|228|94|(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139))(10:121|107|232|122|(0)(0)|136|137|244|138|139))))|180|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:71|(1:202)|72|73|74|75|76|224|77|78|210|79|80|230|81|82|220|83|84|194|85|86|236|87|88|208|89|90|(2:92|252)(4:93|228|94|(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139))(10:121|107|232|122|(0)(0)|136|137|244|138|139))) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:71|202|72|73|74|75|76|224|77|78|210|79|80|230|81|82|220|83|84|194|85|86|236|87|88|208|89|90|(2:92|252)(4:93|228|94|(12:200|96|97|216|98|99|218|100|101|234|102|(2:104|253)(12:105|196|106|107|232|122|(0)(0)|136|137|244|138|139))(10:121|107|232|122|(0)(0)|136|137|244|138|139))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:242)|128|129|240|130|(1:132)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03c9, code lost:
    
        r5 = r26;
        r26 = r2;
        r2 = r5;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03d1, code lost:
    
        r16 = r11;
        r11 = r16;
        r18 = r1;
        r21 = r2;
        r2 = r8;
        r24 = r9;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03e1, code lost:
    
        r8 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03e5, code lost:
    
        r18 = r1;
        r21 = r2;
        r2 = r8;
        r24 = r9;
        r1 = r10;
        r16 = r11;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0445, code lost:
    
        kotlin.jvm.internal.AbstractC4154l.m8920c(r3);
        r0 = r3.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r2);
        r14.f21162a = r7.m4507d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0481, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0482, code lost:
    
        r16 = r3;
        r24 = r7;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x048d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x048e, code lost:
    
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0491, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0492, code lost:
    
        r13 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04a9, code lost:
    
        r31 = r1;
        r25 = r3;
        r27 = r4;
        r23 = r23;
        r28 = r15;
        r1 = r22;
        r2 = r26;
        r26 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04bb, code lost:
    
        r3 = r30;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04be, code lost:
    
        r12 = r16;
        r10 = r18;
        r16 = r5;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04c8, code lost:
    
        r16 = r30;
        r6 = r11;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r30 = r10;
        r18 = r31;
        r2 = r13;
        r28 = r15;
        r8 = r20;
        r26 = r21;
        r13 = r5;
        r5 = r12;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04eb, code lost:
    
        r16 = r30;
        r6 = r11;
        r23 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04f1, code lost:
    
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r30 = r10;
        r18 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04fd, code lost:
    
        r2 = r13;
        r28 = r15;
        r8 = r20;
        r26 = r21;
        r1 = r22;
        r13 = r5;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x050f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0510, code lost:
    
        r16 = r30;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0515, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0516, code lost:
    
        r18 = r31;
        r6 = r11;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r30 = r10;
        r16 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0527, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0528, code lost:
    
        r16 = r30;
        r18 = r31;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r2 = r13;
        r28 = r15;
        r8 = r20;
        r26 = r21;
        r1 = r22;
        r13 = r5;
        r5 = r12;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x054c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x054d, code lost:
    
        r16 = r30;
        r18 = r31;
        r6 = r32;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x055e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x055f, code lost:
    
        r16 = r30;
        r18 = r31;
        r6 = r32;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r31 = r9;
        r30 = r10;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0587, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0588, code lost:
    
        r16 = r30;
        r18 = r1;
        r17 = r2;
        r25 = r3;
        r27 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0592, code lost:
    
        r31 = r9;
        r30 = r10;
        r24 = r11;
        r2 = r13;
        r6 = r14;
        r28 = r15;
        r8 = r20;
        r26 = r21;
        r1 = r22;
        r13 = r5;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x05ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x05ad, code lost:
    
        r18 = r1;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x05ca, code lost:
    
        r18 = r1;
        r17 = r2;
        r25 = r3;
        r27 = r4;
        r16 = r6;
        r23 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x01bb, B:42:0x01c1], limit reached: 253 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [yo.d] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x03ad -> B:196:0x03ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0405 -> B:107:0x03b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x05d7 -> B:180:0x05f9). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16110b(android.database.Cursor r30, int r31, int r32, int r33, ww.AbstractC8193c r34) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.C8720d.m16110b(android.database.Cursor, int, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16111c(android.database.Cursor r11, ww.AbstractC8193c r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Data is fetched,but some of columns is missing in data. Index of columns >>> name:="
            boolean r1 = r12 instanceof yo.C8719c
            if (r1 == 0) goto L16
            r1 = r12
            yo.c r1 = (yo.C8719c) r1
            int r2 = r1.f42184c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f42184c = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            yo.c r1 = new yo.c
            r1.<init>(r10, r12)
            goto L14
        L1c:
            java.lang.Object r12 = r7.f42182a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r7.f42184c
            java.lang.String r8 = "Data not found in device...!"
            r3 = 1
            r9 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            og.od.m10798c(r12)     // Catch: java.lang.Exception -> L2e
            goto L6f
        L2e:
            r0 = move-exception
            r11 = r0
            goto L9a
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            og.od.m10798c(r12)
            int r12 = r11.getCount()     // Catch: java.lang.Exception -> L2e
            if (r12 <= 0) goto L94
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L2e
            if (r12 == 0) goto L94
            r11.getCount()     // Catch: java.lang.Exception -> L2e
            java.lang.String r12 = "display_name"
            int r5 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L2e
            java.lang.String r12 = "data1"
            int r4 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L2e
            java.lang.String r12 = "photo_uri"
            int r6 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L2e
            r12 = -1
            if (r5 <= r12) goto L72
            if (r4 <= r12) goto L72
            if (r6 <= r12) goto L72
            r7.f42184c = r3     // Catch: java.lang.Exception -> L2e
            r2 = r10
            r3 = r11
            java.lang.Object r12 = r2.m16110b(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2e
            if (r12 != r1) goto L6f
            return r1
        L6f:
            kn.h r12 = (kn.C4128h) r12     // Catch: java.lang.Exception -> L2e
            return r12
        L72:
            kn.h r11 = new kn.h     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r12.<init>(r0)     // Catch: java.lang.Exception -> L2e
            r12.append(r5)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = ",phoneNo:="
            r12.append(r0)     // Catch: java.lang.Exception -> L2e
            r12.append(r4)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = ",photoUri:="
            r12.append(r0)     // Catch: java.lang.Exception -> L2e
            r12.append(r6)     // Catch: java.lang.Exception -> L2e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L2e
            r11.<init>(r9, r12)     // Catch: java.lang.Exception -> L2e
            return r11
        L94:
            kn.h r11 = new kn.h     // Catch: java.lang.Exception -> L2e
            r11.<init>(r9, r8)     // Catch: java.lang.Exception -> L2e
            return r11
        L9a:
            r11.printStackTrace()
            kn.h r11 = new kn.h
            r11.<init>(r9, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.C8720d.m16111c(android.database.Cursor, ww.c):java.lang.Object");
    }
}
