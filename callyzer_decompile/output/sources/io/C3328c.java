package io;

import a1.C0004c;
import a1.C0005d;
import a1.c0;
import af.C0134a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.TelephonyManager;
import android.util.Log;
import bk.C0677h;
import bz.C0802a;
import com.google.crypto.tink.shaded.protobuf.C1377d;
import com.sun.mail.util.AbstractC1452a;
import df.C1709h;
import ef.C2042b;
import ef.C2049i;
import ef.InterfaceC2043c;
import ef.InterfaceC2044d;
import ej.C2057b;
import ej.EnumC2058c;
import ff.InterfaceC2282a;
import ff.InterfaceC2283b;
import gf.InterfaceC2585a;
import io.C3328c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import net.schmizz.sshj.common.InterfaceC5028h;
import net.schmizz.sshj.transport.TransportException;
import nn.C5113e;
import og.f1;
import og.pe;
import oj.C5392d;
import org.json.JSONObject;
import p020v.b0;
import ph.C5950e;
import rw.AbstractC6664n;
import s2.C6739h;
import ue.C7421c;
import ug.C7439j;
import ug.C7451v;
import ve.C7707a;
import ve.C7708b;
import we.C8010l;
import we.C8011m;
import we.C8012n;
import we.C8013o;
import we.C8014p;
import we.C8015q;
import we.C8016r;
import we.C8017s;
import we.C8018t;
import we.C8020v;
import we.EnumC8022x;
import we.EnumC8024z;
import we.h0;
import we.j0;
import wl.C8104b;
import xe.AbstractC8362n;
import xe.C8356h;
import xe.C8357i;
import xe.C8360l;
import xm.g0;
import xm.x1;
import xm.y2;
import xm.y5;
import ye.C8636a;
import ye.C8641f;
import ye.EnumC8638c;
import ye.InterfaceC8642g;
import yh.AbstractC8662f;
import yv.C8805t;
import zj.C8986c;
import zk.C8989c;
import zy.AbstractC9107g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: io.c */
/* loaded from: classes3.dex */
public final class C3328c {

    /* renamed from: a */
    public Object f17609a;

    /* renamed from: b */
    public Object f17610b;

    /* renamed from: c */
    public Object f17611c;

    /* renamed from: d */
    public Object f17612d;

    /* renamed from: e */
    public Object f17613e;

    /* renamed from: f */
    public Object f17614f;

    /* renamed from: g */
    public Object f17615g;

    /* renamed from: h */
    public Object f17616h;

    /* renamed from: i */
    public Object f17617i;

    public C3328c(Context context, y5 userSIMRepository, x1 callLogsRepository, C5113e c5113e, g0 authTokenStatusRepository, y2 y2Var, AbstractC8662f abstractC8662f, TelephonyManager telephonyManager, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        AbstractC4154l.m8923f(authTokenStatusRepository, "authTokenStatusRepository");
        this.f17609a = context;
        this.f17610b = userSIMRepository;
        this.f17611c = callLogsRepository;
        this.f17612d = c5113e;
        this.f17613e = authTokenStatusRepository;
        this.f17614f = y2Var;
        this.f17615g = abstractC8662f;
        this.f17616h = telephonyManager;
        this.f17617i = c8805t;
    }

    /* renamed from: b */
    public static String m7645b(List list, String str, List list2) throws TransportException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2.contains(str2)) {
                return str2;
            }
        }
        throw new TransportException("Unable to reach a settlement of " + str + ": " + list + " and " + list2);
    }

    /* renamed from: i */
    public static String m7646i(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int i11 = i10 + 1;
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(str);
            i10 = i11;
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7647a(com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest r10, ww.AbstractC8193c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3328c.m7647a(com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public C2057b m7648c(EnumC2058c enumC2058c) {
        try {
            if (EnumC2058c.SKIP_CACHE_LOOKUP.equals(enumC2058c)) {
                return null;
            }
            JSONObject jSONObjectE0 = ((C8989c) this.f17613e).e0();
            if (jSONObjectE0 == null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                return null;
            }
            C8986c c8986c = (C8986c) this.f17611c;
            c8986c.getClass();
            C2057b c2057bMo5782f = (jSONObjectE0.getInt("settings_version") != 3 ? new C5392d(8) : new C5950e(8)).mo5782f((C7451v) c8986c.f43336b, jSONObjectE0);
            jSONObjectE0.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            ((C7451v) this.f17612d).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!EnumC2058c.IGNORE_CACHE_EXPIRATION.equals(enumC2058c) && c2057bMo5782f.f9646c < jCurrentTimeMillis) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return null;
            }
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return c2057bMo5782f;
            } catch (Exception unused) {
                return c2057bMo5782f;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public List m7649d() {
        C0802a c0802a = new C0802a(21);
        C0802a c0802a2 = new C0802a(22);
        C0802a c0802a3 = new C0802a(25);
        C0802a c0802a4 = new C0802a(26);
        C0802a c0802a5 = new C0802a(27);
        BigInteger bigInteger = AbstractC9107g.f43671c;
        BigInteger bigInteger2 = AbstractC9107g.f43669a;
        int i10 = 19;
        List listM10834i = pe.m10834i(c0802a, c0802a2, c0802a3, c0802a4, c0802a5, new C8104b("diffie-hellman-group14-sha256", bigInteger, bigInteger2, new C0802a(17)), new C8104b("diffie-hellman-group16-sha512", AbstractC9107g.f43673e, bigInteger2, new C0802a(i10)), new C8104b("diffie-hellman-group18-sha512", AbstractC9107g.f43675g, bigInteger2, new C0802a(i10)));
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10834i, 10));
        Iterator it = listM10834i.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5028h) it.next()).getName());
        }
        arrayList.toString();
        return listM10834i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[PHI: r3 r5 r6 r7 r8 r14 r15 r26
      0x0062: PHI (r3v7 int) = (r3v12 int), (r3v20 int) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r5v2 int) = (r5v4 int), (r5v11 int) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r6v1 android.telephony.SubscriptionInfo) = (r6v5 android.telephony.SubscriptionInfo), (r6v11 android.telephony.SubscriptionInfo) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r7v0 ??) = (r7v1 ??), (r7v6 ??) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r8v0 java.util.Iterator) = (r8v2 java.util.Iterator), (r8v7 java.util.Iterator) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r14v1 ??) = (r14v3 ??), (r14v8 ??) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r15v1 ??) = (r15v2 ??), (r15v11 ??) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r26v0 int) = (r26v2 int), (r26v6 int) binds: [B:70:0x019f, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003b, B:76:0x01d0, B:44:0x00c3, B:46:0x00c9, B:50:0x010b, B:52:0x010f, B:55:0x0117, B:58:0x0129, B:61:0x0146, B:59:0x0135, B:62:0x014b, B:66:0x017c, B:72:0x01a2, B:69:0x019d, B:60:0x0139, B:63:0x016e, B:65:0x0176, B:77:0x01e0, B:79:0x01ec, B:81:0x01fa, B:21:0x005c, B:25:0x0072, B:28:0x007b, B:33:0x008c, B:35:0x0094, B:37:0x009a, B:40:0x00a4, B:43:0x00ac, B:83:0x0200), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003b, B:76:0x01d0, B:44:0x00c3, B:46:0x00c9, B:50:0x010b, B:52:0x010f, B:55:0x0117, B:58:0x0129, B:61:0x0146, B:59:0x0135, B:62:0x014b, B:66:0x017c, B:72:0x01a2, B:69:0x019d, B:60:0x0139, B:63:0x016e, B:65:0x0176, B:77:0x01e0, B:79:0x01ec, B:81:0x01fa, B:21:0x005c, B:25:0x0072, B:28:0x007b, B:33:0x008c, B:35:0x0094, B:37:0x009a, B:40:0x00a4, B:43:0x00ac, B:83:0x0200), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003b, B:76:0x01d0, B:44:0x00c3, B:46:0x00c9, B:50:0x010b, B:52:0x010f, B:55:0x0117, B:58:0x0129, B:61:0x0146, B:59:0x0135, B:62:0x014b, B:66:0x017c, B:72:0x01a2, B:69:0x019d, B:60:0x0139, B:63:0x016e, B:65:0x0176, B:77:0x01e0, B:79:0x01ec, B:81:0x01fa, B:21:0x005c, B:25:0x0072, B:28:0x007b, B:33:0x008c, B:35:0x0094, B:37:0x009a, B:40:0x00a4, B:43:0x00ac, B:83:0x0200), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003b, B:76:0x01d0, B:44:0x00c3, B:46:0x00c9, B:50:0x010b, B:52:0x010f, B:55:0x0117, B:58:0x0129, B:61:0x0146, B:59:0x0135, B:62:0x014b, B:66:0x017c, B:72:0x01a2, B:69:0x019d, B:60:0x0139, B:63:0x016e, B:65:0x0176, B:77:0x01e0, B:79:0x01ec, B:81:0x01fa, B:21:0x005c, B:25:0x0072, B:28:0x007b, B:33:0x008c, B:35:0x0094, B:37:0x009a, B:40:0x00a4, B:43:0x00ac, B:83:0x0200), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003b, B:76:0x01d0, B:44:0x00c3, B:46:0x00c9, B:50:0x010b, B:52:0x010f, B:55:0x0117, B:58:0x0129, B:61:0x0146, B:59:0x0135, B:62:0x014b, B:66:0x017c, B:72:0x01a2, B:69:0x019d, B:60:0x0139, B:63:0x016e, B:65:0x0176, B:77:0x01e0, B:79:0x01ec, B:81:0x01fa, B:21:0x005c, B:25:0x0072, B:28:0x007b, B:33:0x008c, B:35:0x0094, B:37:0x009a, B:40:0x00a4, B:43:0x00ac, B:83:0x0200), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r14v1, types: [qw.g] */
    /* JADX WARN: Type inference failed for: r14v3, types: [qw.g] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [qw.g] */
    /* JADX WARN: Type inference failed for: r14v8, types: [qw.g] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v12, types: [qw.g] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.telephony.SubscriptionInfo, uw.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01cb -> B:76:0x01d0). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7650e(ww.AbstractC8193c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3328c.m7650e(ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public C2057b m7651f() {
        return (C2057b) ((AtomicReference) this.f17616h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7652g(java.util.List r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof uo.C7479d
            if (r0 == 0) goto L13
            r0 = r9
            uo.d r0 = (uo.C7479d) r0
            int r1 = r0.f36109c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36109c = r1
            goto L18
        L13:
            uo.d r0 = new uo.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f36107a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f36109c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L27
            goto L71
        L27:
            r8 = move-exception
            goto L6d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.util.ArrayList r9 = i0.m0.m7386s(r9)
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L27
        L39:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L27
            com.websoptimization.callyzerbiz.data.model.response.CallLogDetailsData r2 = (com.websoptimization.callyzerbiz.data.model.response.CallLogDetailsData) r2     // Catch: java.lang.Exception -> L27
            mm.b r2 = r2.m4739a()     // Catch: java.lang.Exception -> L27
            r9.add(r2)     // Catch: java.lang.Exception -> L27
            goto L39
        L4d:
            java.lang.Object r8 = r7.f17611c     // Catch: java.lang.Exception -> L27
            xm.x1 r8 = (xm.x1) r8     // Catch: java.lang.Exception -> L27
            r0.f36109c = r3     // Catch: java.lang.Exception -> L27
            yx.d r2 = r8.f40994d     // Catch: java.lang.Exception -> L27
            uw.h r2 = r2.f42488a     // Catch: java.lang.Exception -> L27
            u7.a r4 = new u7.a     // Catch: java.lang.Exception -> L27
            r5 = 24
            r6 = 0
            r4.<init>(r8, r9, r6, r5)     // Catch: java.lang.Exception -> L27
            java.lang.Object r8 = tx.c0.m13475K(r2, r4, r0)     // Catch: java.lang.Exception -> L27
            vw.a r9 = vw.EnumC7794a.COROUTINE_SUSPENDED     // Catch: java.lang.Exception -> L27
            if (r8 != r9) goto L68
            goto L6a
        L68:
            qw.a0 r8 = qw.a0.f30746a     // Catch: java.lang.Exception -> L27
        L6a:
            if (r8 != r1) goto L71
            return r1
        L6d:
            r8.printStackTrace()
            r3 = 0
        L71:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3328c.m7652g(java.util.List, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public void m7653h(C8357i c8357i, int i10) {
        byte[] bArr;
        InterfaceC2283b interfaceC2283b;
        long j6;
        C8636a c8636a;
        String str;
        C8636a c8636a2;
        C1377d c1377dM14347a;
        int i11;
        String str2;
        Integer numValueOf;
        C3328c c3328c;
        final C3328c c3328c2 = this;
        final C8357i c8357i2 = c8357i;
        byte[] bArr2 = c8357i2.f39999b;
        InterfaceC2283b interfaceC2283b2 = (InterfaceC2283b) c3328c2.f17614f;
        InterfaceC8642g interfaceC8642gM15963a = ((C8641f) c3328c2.f17610b).m15963a(c8357i2.f39998a);
        if (EnumC8638c.OK == null) {
            throw new NullPointerException("Null status");
        }
        long jMax = 0;
        while (true) {
            final int i12 = 0;
            InterfaceC2282a interfaceC2282a = new InterfaceC2282a(c3328c2) { // from class: df.g

                /* renamed from: b */
                public final /* synthetic */ C3328c f8322b;

                {
                    this.f8322b = c3328c2;
                }

                @Override // ff.InterfaceC2282a
                /* renamed from: b */
                public final Object mo17b() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            C8357i c8357i3 = c8357i2;
                            C2049i c2049i = (C2049i) ((InterfaceC2044d) this.f8322b.f17611c);
                            SQLiteDatabase sQLiteDatabaseM5772h = c2049i.m5772h();
                            sQLiteDatabaseM5772h.beginTransaction();
                            try {
                                Long lM5771j = C2049i.m5771j(sQLiteDatabaseM5772h, c8357i3);
                                if (lM5771j == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c2049i.m5772h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM5771j.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseM5772h.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseM5772h.endTransaction();
                            }
                        default:
                            C2049i c2049i2 = (C2049i) ((InterfaceC2044d) this.f8322b.f17611c);
                            c2049i2.getClass();
                            return (Iterable) c2049i2.m5773n(new C0004c(12, c2049i2, c8357i2));
                    }
                }
            };
            C2049i c2049i = (C2049i) interfaceC2283b2;
            if (!((Boolean) c2049i.m5776z(interfaceC2282a)).booleanValue()) {
                c2049i.m5776z(new C0677h(c3328c2, c8357i2, jMax));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) c2049i.m5776z(new InterfaceC2282a(c3328c2) { // from class: df.g

                /* renamed from: b */
                public final /* synthetic */ C3328c f8322b;

                {
                    this.f8322b = c3328c2;
                }

                @Override // ff.InterfaceC2282a
                /* renamed from: b */
                public final Object mo17b() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            C8357i c8357i3 = c8357i2;
                            C2049i c2049i2 = (C2049i) ((InterfaceC2044d) this.f8322b.f17611c);
                            SQLiteDatabase sQLiteDatabaseM5772h = c2049i2.m5772h();
                            sQLiteDatabaseM5772h.beginTransaction();
                            try {
                                Long lM5771j = C2049i.m5771j(sQLiteDatabaseM5772h, c8357i3);
                                if (lM5771j == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c2049i2.m5772h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM5771j.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseM5772h.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseM5772h.endTransaction();
                            }
                        default:
                            C2049i c2049i22 = (C2049i) ((InterfaceC2044d) this.f8322b.f17611c);
                            c2049i22.getClass();
                            return (Iterable) c2049i22.m5773n(new C0004c(12, c2049i22, c8357i2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC8642gM15963a == null) {
                f1.m10638b("Uploader", "Unknown backend for %s, deleting event batch for it...", c8357i2);
                c8636a2 = new C8636a(EnumC8638c.FATAL_ERROR, -1L);
                bArr = bArr2;
                interfaceC2283b = interfaceC2283b2;
                j6 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2042b) it.next()).f9615c);
                }
                if (bArr2 != null) {
                    InterfaceC2043c interfaceC2043c = (InterfaceC2043c) c3328c2.f17617i;
                    Objects.requireNonNull(interfaceC2043c);
                    C0134a c0134a = (C0134a) c2049i.m5776z(new c0(6, interfaceC2043c));
                    C6739h c6739h = new C6739h();
                    c6739h.f32185f = new HashMap();
                    c6739h.f32183d = Long.valueOf(((InterfaceC2585a) c3328c2.f17615g).getTime());
                    c6739h.f32184e = Long.valueOf(((InterfaceC2585a) c3328c2.f17616h).getTime());
                    c6739h.f32180a = "GDT_CLIENT_METRICS";
                    C7421c c7421c = new C7421c("proto");
                    c0134a.getClass();
                    C4367l c4367l = AbstractC8362n.f40010a;
                    c4367l.getClass();
                    bArr = bArr2;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c4367l.m9136p(c0134a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c6739h.f32182c = new C8360l(c7421c, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C7708b) interfaceC8642gM15963a).m14707a(c6739h.m12894b()));
                } else {
                    bArr = bArr2;
                }
                C7708b c7708b = (C7708b) interfaceC8642gM15963a;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    C8356h c8356h = (C8356h) obj;
                    String str3 = c8356h.f39988a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c8356h);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c8356h);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C8356h c8356h2 = (C8356h) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.DEFAULT;
                    long time = c7708b.f37236f.getTime();
                    long time2 = c7708b.f37235e.getTime();
                    C8012n c8012n = new C8012n(EnumC8022x.ANDROID_FIREBASE, new C8010l(Integer.valueOf(c8356h2.m15530b("sdk-version")), c8356h2.m15529a("model"), c8356h2.m15529a("hardware"), c8356h2.m15529a("device"), c8356h2.m15529a("product"), c8356h2.m15529a("os-uild"), c8356h2.m15529a("manufacturer"), c8356h2.m15529a("fingerprint"), c8356h2.m15529a("locale"), c8356h2.m15529a("country"), c8356h2.m15529a("mcc_mnc"), c8356h2.m15529a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C8356h c8356h3 : (List) entry.getValue()) {
                        InterfaceC2283b interfaceC2283b3 = interfaceC2283b2;
                        C8360l c8360l = c8356h3.f39990c;
                        byte[] bArr3 = c8356h3.f39997j;
                        C7421c c7421c2 = c8360l.f40007a;
                        byte[] bArr4 = c8360l.f40008b;
                        long j10 = jMax;
                        if (c7421c2.equals(new C7421c("proto"))) {
                            c3328c = new C3328c();
                            c3328c.f17614f = bArr4;
                        } else if (c7421c2.equals(new C7421c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            C3328c c3328c3 = new C3328c();
                            c3328c3.f17609a = str4;
                            c3328c = c3328c3;
                        } else {
                            if (Log.isLoggable(f1.m10639c("CctTransportBackend"), 5)) {
                                c7421c2.toString();
                            }
                            interfaceC2283b2 = interfaceC2283b3;
                            jMax = j10;
                        }
                        c3328c.f17610b = Long.valueOf(c8356h3.f39991d);
                        c3328c.f17613e = Long.valueOf(c8356h3.f39992e);
                        String str5 = (String) c8356h3.f39993f.get("tz-offset");
                        c3328c.f17615g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c3328c.f17616h = new C8020v(h0.forNumber(c8356h3.m15530b("net-type")), we.g0.forNumber(c8356h3.m15530b("mobile-subtype")));
                        Integer num = c8356h3.f39989b;
                        if (num != null) {
                            c3328c.f17611c = num;
                        }
                        Integer num2 = c8356h3.f39994g;
                        if (num2 != null) {
                            c3328c.f17612d = new C8013o(new C8016r(new C8015q(num2)), EnumC8024z.EVENT_OVERRIDE);
                        }
                        byte[] bArr5 = c8356h3.f39996i;
                        if (bArr5 != null || bArr3 != null) {
                            if (bArr5 == null) {
                                bArr5 = null;
                            }
                            c3328c.f17617i = new C8014p(bArr5, bArr3 != null ? bArr3 : null);
                        }
                        String strM4561h = ((Long) c3328c.f17610b) == null ? " eventTimeMs" : "";
                        if (((Long) c3328c.f17613e) == null) {
                            strM4561h = strM4561h.concat(" eventUptimeMs");
                        }
                        if (((Long) c3328c.f17615g) == null) {
                            strM4561h = AbstractC1452a.m4561h(strM4561h, " timezoneOffsetSeconds");
                        }
                        if (!strM4561h.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strM4561h));
                        }
                        arrayList4.add(new C8017s(((Long) c3328c.f17610b).longValue(), (Integer) c3328c.f17611c, (C8013o) c3328c.f17612d, ((Long) c3328c.f17613e).longValue(), (byte[]) c3328c.f17614f, (String) c3328c.f17609a, ((Long) c3328c.f17615g).longValue(), (C8020v) c3328c.f17616h, (C8014p) c3328c.f17617i));
                        interfaceC2283b2 = interfaceC2283b3;
                        jMax = j10;
                    }
                    arrayList3.add(new C8018t(time, time2, c8012n, numValueOf, str2, arrayList4, j0Var));
                    interfaceC2283b2 = interfaceC2283b2;
                }
                interfaceC2283b = interfaceC2283b2;
                j6 = jMax;
                C8011m c8011m = new C8011m(arrayList3);
                URL urlM14706b = c7708b.f37234d;
                if (bArr != null) {
                    try {
                        C7707a c7707aM14705a = C7707a.m14705a(bArr);
                        str = c7707aM14705a.f37230b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = c7707aM14705a.f37229a;
                        if (str6 != null) {
                            urlM14706b = C7708b.m14706b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c8636a = new C8636a(EnumC8638c.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    C7439j c7439j = new C7439j(urlM14706b, c8011m, str);
                    b0 b0Var = new b0(3, c7708b);
                    int i15 = 5;
                    do {
                        c1377dM14347a = b0Var.m14347a(c7439j);
                        URL url = (URL) c1377dM14347a.f7029c;
                        if (url != null) {
                            f1.m10638b("CctTransportBackend", "Following redirect to: %s", url);
                            c7439j = new C7439j(url, (C8011m) c7439j.f35539d, (String) c7439j.f35538c);
                        } else {
                            c7439j = null;
                        }
                        if (c7439j == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    i11 = c1377dM14347a.f7027a;
                } catch (IOException unused4) {
                    Log.isLoggable(f1.m10639c("CctTransportBackend"), 6);
                    c8636a = new C8636a(EnumC8638c.TRANSIENT_ERROR, -1L);
                }
                if (i11 == 200) {
                    c8636a2 = new C8636a(EnumC8638c.OK, c1377dM14347a.f7028b);
                } else {
                    c8636a = (i11 >= 500 || i11 == 404) ? new C8636a(EnumC8638c.TRANSIENT_ERROR, -1L) : i11 == 400 ? new C8636a(EnumC8638c.INVALID_PAYLOAD, -1L) : new C8636a(EnumC8638c.FATAL_ERROR, -1L);
                    c8636a2 = c8636a;
                }
            }
            EnumC8638c enumC8638c = EnumC8638c.TRANSIENT_ERROR;
            EnumC8638c enumC8638c2 = c8636a2.f41916a;
            if (enumC8638c2 == enumC8638c) {
                c2049i.m5776z(new C1709h(this, iterable, c8357i, j6));
                ((C0005d) this.f17612d).a0(c8357i, i10 + 1, true);
                return;
            }
            c8357i2 = c8357i;
            jMax = j6;
            c2049i.m5776z(new C0004c(10, this, iterable));
            if (enumC8638c2 == EnumC8638c.OK) {
                jMax = Math.max(jMax, c8636a2.f41917b);
                if (bArr != null) {
                    c2049i.m5776z(new c0(8, this));
                }
            } else if (enumC8638c2 == EnumC8638c.INVALID_PAYLOAD) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((C2042b) it2.next()).f9615c.f39988a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                c2049i.m5776z(new C0004c(11, this, map2));
            }
            c3328c2 = this;
            bArr2 = bArr;
            interfaceC2283b2 = interfaceC2283b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(2:109|(1:(9:14|15|16|105|86|87|107|88|89)(2:20|21))(10:22|23|24|76|105|86|87|107|88|89))(4:25|103|26|27))(10:31|98|32|(1:34)(1:37)|38|(1:40)(1:41)|42|(13:51|50|52|(1:57)(1:56)|58|(1:63)(1:62)|64|65|100|66|67|(1:70)|84)(6:44|(1:46)(1:47)|(2:49|51)|50|52|(4:54|57|58|(9:60|63|64|65|100|66|67|(0)|84)(0))(0))|96|97)|102|(2:72|(1:74)(8:75|76|105|86|87|107|88|89))(3:79|(1:81)(1:82)|(7:85|105|86|87|107|88|89))|84|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r4v1, types: [xm.y5] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [tx.b0, uw.c, uw.h] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m7654j(java.lang.String r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, mm.C4802m r29, com.websoptimization.callyzerbiz.data.model.response.AddDeviceResponse r30, ww.AbstractC8193c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3328c.m7654j(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, mm.m, com.websoptimization.callyzerbiz.data.model.response.AddDeviceResponse, ww.c):java.lang.Object");
    }
}
