package a1;

import af.EnumC0136c;
import ak.C0162a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.view.Surface;
import be.C0655j;
import bk.C0674e;
import bk.C0676g;
import bk.C0681l;
import bk.C0687r;
import c0.C0817j;
import c0.C0829v;
import c0.RunnableC0827t;
import c0.w1;
import c0.x1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.sun.mail.imap.IMAPStore;
import df.RunnableC1702a;
import e1.C1903e;
import ef.C2041a;
import ef.C2042b;
import ef.C2048h;
import ef.C2049i;
import ef.InterfaceC2043c;
import ef.InterfaceC2044d;
import ef.InterfaceC2047g;
import ex.InterfaceC2137a;
import ff.InterfaceC2282a;
import h1.g2;
import i0.c1;
import i0.d1;
import io.C3328c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l0.InterfaceC4301a;
import nf.C5047i;
import nx.AbstractC5178p;
import og.u1;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.o0;
import pg.l8;
import pg.t8;
import q0.C6062c;
import qi.InterfaceC6222e;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import r0.C6414e;
import s0.AbstractC6705i;
import s0.EnumC6702f;
import s2.C6739h;
import t8.EnumC7067m;
import t8.RunnableC7071q;
import ue.EnumC7422d;
import uw.InterfaceC7559c;
import wj.AbstractServiceC8081g;
import wj.C8083i;
import x4.C8299i;
import x4.InterfaceC8300j;
import xe.C8357i;
import xm.m4;
import xm.o4;
import yg.C8656m;
import yg.InterfaceC8644a;
import yg.InterfaceC8646c;
import yg.InterfaceC8649f;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0004c implements InterfaceC8300j, InterfaceC8649f, InterfaceC8644a, c1, InterfaceC2282a, InterfaceC2047g, InterfaceC6222e, w1, InterfaceC6236a, InterfaceC4301a, InterfaceC8646c {

    /* renamed from: a */
    public final /* synthetic */ int f18a;

    /* renamed from: b */
    public final /* synthetic */ Object f19b;

    /* renamed from: c */
    public final /* synthetic */ Object f20c;

    public /* synthetic */ C0004c(int i10, Object obj, Object obj2) {
        this.f18a = i10;
        this.f19b = obj;
        this.f20c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0058 A[EXC_TOP_SPLITTER, PHI: r13
      0x0058: PHI (r13v6 java.io.InputStream) = (r13v5 java.io.InputStream), (r13v7 java.io.InputStream) binds: [B:28:0x0067, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #8 {all -> 0x006d, blocks: (B:9:0x0039, B:11:0x003c, B:12:0x003d, B:18:0x0058, B:25:0x0062, B:26:0x0065, B:35:0x0071, B:72:0x00e1, B:74:0x00e5, B:76:0x00e8, B:80:0x00ec, B:75:0x00e6), top: B:146:0x0015, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [yg.m] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [bk.p] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m14c(yg.C8656m r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0004c.m14c(yg.m):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        switch (this.f18a) {
            case 0:
                i0.e0 e0Var = (i0.e0) this.f19b;
                ArrayList arrayList = (ArrayList) this.f20c;
                C0006e c0006e = new C0006e(c8299i, e0Var);
                arrayList.add(c0006e);
                e0Var.mo7327j(t8.m11872a(), c0006e);
                return "waitForCaptureResult";
            case 1:
                f0 f0Var = (f0) this.f19b;
                Surface surface = (Surface) this.f20c;
                u1.m10942a("TextureViewImpl");
                f0Var.f45h.m2236a(surface, t8.m11872a(), new C0027z(1, c8299i));
                return "provideSurface[request=" + f0Var.f45h + " surface=" + surface + "]";
            case 7:
                C0829v c0829v = (C0829v) this.f19b;
                Context context = (Context) this.f20c;
                Executor executor = c0829v.f5230d;
                executor.execute(new RunnableC0827t(c0829v, context, executor, 1, c8299i, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            case 9:
                x1 x1Var = (x1) this.f19b;
                ((AtomicReference) this.f20c).set(c8299i);
                return "SurfaceRequest-surface-recreation(" + x1Var.hashCode() + ")";
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C6062c c6062c = (C6062c) this.f19b;
                c0.a0 a0Var = (c0.a0) this.f20c;
                Map map = Collections.EMPTY_MAP;
                c6062c.m12069e(new RunnableC0025x(c6062c, a0Var, c8299i), new RunnableC1702a(1));
                return "Init GlRenderer";
            case 18:
                C6414e c6414e = (C6414e) this.f19b;
                c0.a0 a0Var2 = (c0.a0) this.f20c;
                Map map2 = Collections.EMPTY_MAP;
                c6414e.m12422e(new RunnableC0025x(c6414e, a0Var2, c8299i), new RunnableC1702a(1));
                return "Init GlRenderer";
            default:
                Executor executor2 = (Executor) this.f19b;
                ?? r12 = (AbstractC4155m) this.f20c;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c8299i.m15506a(new RunnableC7071q(atomicBoolean, 1), EnumC7067m.INSTANCE);
                executor2.execute(new RunnableC0025x(atomicBoolean, c8299i, (InterfaceC2137a) r12));
                return qw.a0.f30746a;
        }
    }

    @Override // c0.w1
    /* renamed from: a */
    public void mo16a(C0817j c0817j) {
        C6062c c6062c = (C6062c) this.f19b;
        x1 x1Var = (x1) this.f20c;
        c6062c.getClass();
        EnumC6702f enumC6702f = EnumC6702f.DEFAULT;
        if (x1Var.f5260c.m2138a() && c0817j.f5113d) {
            enumC6702f = EnumC6702f.YUV;
        }
        g2 g2Var = c6062c.f29564a;
        AbstractC6705i.m12835d((AtomicBoolean) g2Var.f15432c, true);
        AbstractC6705i.m12834c((Thread) g2Var.f15434e);
        if (((EnumC6702f) g2Var.f15442n) != enumC6702f) {
            g2Var.f15442n = enumC6702f;
            g2Var.m6825q(g2Var.f15431b);
        }
    }

    @Override // ef.InterfaceC2047g
    public Object apply(Object obj) {
        C2049i c2049i = (C2049i) this.f19b;
        C8357i c8357i = (C8357i) this.f20c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C2041a c2041a = c2049i.f9626d;
        ArrayList arrayListM5774u = c2049i.m5774u(sQLiteDatabase, c8357i, c2041a.f9609b);
        for (EnumC7422d enumC7422d : EnumC7422d.values()) {
            if (enumC7422d != c8357i.f40000c) {
                int size = c2041a.f9609b - arrayListM5774u.size();
                if (size <= 0) {
                    break;
                }
                arrayListM5774u.addAll(c2049i.m5774u(sQLiteDatabase, c8357i.m15533b(enumC7422d), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListM5774u.size(); i10++) {
            sb2.append(((C2042b) arrayListM5774u.get(i10)).f9613a);
            if (i10 < arrayListM5774u.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", IMAPStore.ID_NAME, "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j6 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j6));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j6), hashSet);
                }
                hashSet.add(new C2048h(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM5774u.listIterator();
        while (listIterator.hasNext()) {
            C2042b c2042b = (C2042b) listIterator.next();
            long j10 = c2042b.f9613a;
            if (map.containsKey(Long.valueOf(j10))) {
                C6739h c6739hM15531c = c2042b.f9615c.m15531c();
                for (C2048h c2048h : (Set) map.get(Long.valueOf(j10))) {
                    c6739hM15531c.m12893a(c2048h.f9620a, c2048h.f9621b);
                }
                listIterator.set(new C2042b(j10, c2042b.f9614b, c6739hM15531c.m12894b()));
            }
        }
        return arrayListM5774u;
    }

    @Override // ff.InterfaceC2282a
    /* renamed from: b */
    public Object mo17b() {
        switch (this.f18a) {
            case 10:
                C3328c c3328c = (C3328c) this.f19b;
                Iterable iterable = (Iterable) this.f20c;
                C2049i c2049i = (C2049i) ((InterfaceC2044d) c3328c.f17611c);
                c2049i.getClass();
                if (iterable.iterator().hasNext()) {
                    c2049i.m5772h().compileStatement("DELETE FROM events WHERE _id in " + C2049i.m5769A(iterable)).execute();
                    break;
                }
                break;
            default:
                C3328c c3328c2 = (C3328c) this.f19b;
                Iterator it = ((HashMap) this.f20c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C2049i) ((InterfaceC2043c) c3328c2.f17617i)).m5775w(((Integer) r2.getValue()).intValue(), EnumC0136c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // i0.c1
    /* renamed from: d */
    public void mo18d(d1 d1Var) {
        switch (this.f18a) {
            case 8:
                C0655j c0655j = (C0655j) this.f19b;
                c1 c1Var = (c1) this.f20c;
                c0655j.getClass();
                c1Var.mo18d(c0655j);
                break;
            default:
                C5047i c5047i = (C5047i) this.f19b;
                c1 c1Var2 = (c1) this.f20c;
                c5047i.getClass();
                c1Var2.mo18d(c5047i);
                break;
        }
    }

    @Override // qj.InterfaceC6236a
    /* renamed from: e */
    public void mo19e(InterfaceC6237b interfaceC6237b) {
        InterfaceC6236a interfaceC6236a = (InterfaceC6236a) this.f19b;
        InterfaceC6236a interfaceC6236a2 = (InterfaceC6236a) this.f20c;
        interfaceC6236a.mo19e(interfaceC6237b);
        interfaceC6236a2.mo19e(interfaceC6237b);
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) {
        switch (this.f18a) {
            case 4:
                return ((C0681l) this.f19b).m1957b(c8656m, 0L, (HashMap) this.f20c);
            case 5:
                C0681l c0681l = (C0681l) this.f19b;
                Date date = (Date) this.f20c;
                c0681l.getClass();
                if (c8656m.m15985l()) {
                    C0687r c0687r = c0681l.f4283g;
                    synchronized (c0687r.f4317b) {
                        c0687r.f4316a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception excM15982i = c8656m.m15982i();
                    if (excM15982i != null) {
                        if (excM15982i instanceof FirebaseRemoteConfigFetchThrottledException) {
                            C0687r c0687r2 = c0681l.f4283g;
                            synchronized (c0687r2.f4317b) {
                                c0687r2.f4316a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            C0687r c0687r3 = c0681l.f4283g;
                            synchronized (c0687r3.f4317b) {
                                c0687r3.f4316a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                }
                return c8656m;
            case 6:
                return m14c(c8656m);
            default:
                C8083i c8083i = (C8083i) this.f19b;
                String str = (String) this.f20c;
                synchronized (c8083i) {
                    ((C1903e) c8083i.f38708b).remove(str);
                }
                return c8656m;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo21h(p020v.x0 r5) {
        /*
            r4 = this;
            int r0 = r4.f18a
            switch(r0) {
                case 14: goto L91;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f19b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f20c
            gm.z r1 = (gm.C2657z) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.mo12234a(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.f14389a
            switch(r1) {
                case 14: goto L7f;
                case 15: goto L72;
                case 16: goto L30;
                default: goto L1a;
            }
        L1a:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L2d
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.m4461a(r5)
            goto L8b
        L2d:
            java.lang.String r5 = ""
            goto L8b
        L30:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L41
            java.lang.String r5 = "tv"
            goto L8b
        L41:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L50
            java.lang.String r5 = "watch"
            goto L8b
        L50:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5f
            java.lang.String r5 = "auto"
            goto L8b
        L5f:
            r2 = 26
            if (r1 < r2) goto L2d
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L2d
            java.lang.String r5 = "embedded"
            goto L8b
        L72:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L2d
            int r5 = r5.minSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L8b
        L7f:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L2d
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L8b:
            zj.a r1 = new zj.a
            r1.<init>(r0, r5)
            return r1
        L91:
            java.lang.Object r0 = r4.f19b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f20c
            qi.b r1 = (qi.C6219b) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> La6
            qi.e r0 = r1.f30218f     // Catch: java.lang.Throwable -> La6
            java.lang.Object r5 = r0.mo21h(r5)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r5
        La6:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0004c.mo21h(v.x0):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m it) {
        switch (this.f18a) {
            case 21:
                ((AbstractServiceC8081g) this.f19b).m15219b((Intent) this.f20c);
                break;
            default:
                C0162a c0162a = (C0162a) this.f19b;
                o4 o4Var = (o4) this.f20c;
                AbstractC4154l.m8923f(it, "it");
                for (String str : c0162a.f500a) {
                    if (str != null) {
                        InterfaceC7559c interfaceC7559c = null;
                        switch (str.hashCode()) {
                            case -903447868:
                                if (str.equals("BIZ_CONTACT_US_SUPPORT_EMAIL_ID")) {
                                    tx.c0.m13502y(o4Var.f40672b, null, null, new m4(o4Var, o4Var.f40674d.m383b(str), interfaceC7559c, 1), 3);
                                    break;
                                } else {
                                    break;
                                }
                            case -582616056:
                                if (str.equals("BIZ_CONTACT_US_SENDER_EMAIL_SMTP_USERNAME")) {
                                    tx.c0.m13502y(o4Var.f40672b, null, null, new m4(o4Var, o4Var.f40674d.m383b(str), interfaceC7559c, 2), 3);
                                    break;
                                } else {
                                    break;
                                }
                            case 900083149:
                                if (str.equals("BIZ_CONTACT_US_SENDER_EMAIL_SMTP_PASSWORD")) {
                                    tx.c0.m13502y(o4Var.f40672b, null, null, new m4(o4Var, o4Var.f40674d.m383b(str), interfaceC7559c, 3), 3);
                                    break;
                                } else {
                                    break;
                                }
                            case 1362928406:
                                if (str.equals("CALLYZER_QUICK_CALL_EXTENSION_LINK")) {
                                    String strM383b = o4Var.f40674d.m383b(str);
                                    if (AbstractC5178p.m10101L(strM383b)) {
                                        break;
                                    } else {
                                        tx.c0.m13502y(o4Var.f40672b, null, null, new m4(o4Var, strM383b, interfaceC7559c, 0), 3);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                        }
                    }
                }
                break;
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        C0674e c0674e = (C0674e) this.f19b;
        C0676g c0676g = (C0676g) this.f20c;
        synchronized (c0674e) {
            c0674e.f4249c = l8.m11765f(c0676g);
        }
        return l8.m11765f(c0676g);
    }

    public /* synthetic */ C0004c(C0007f c0007f, i0.e0 e0Var, ArrayList arrayList) {
        this.f18a = 0;
        this.f19b = e0Var;
        this.f20c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0004c(Executor executor, InterfaceC2137a interfaceC2137a) {
        this.f18a = 19;
        this.f19b = executor;
        this.f20c = (AbstractC4155m) interfaceC2137a;
    }

    public /* synthetic */ C0004c(C6062c c6062c, c0.a0 a0Var) {
        this.f18a = 15;
        Map map = Collections.EMPTY_MAP;
        this.f19b = c6062c;
        this.f20c = a0Var;
    }

    public /* synthetic */ C0004c(C6414e c6414e, c0.a0 a0Var) {
        this.f18a = 18;
        Map map = Collections.EMPTY_MAP;
        this.f19b = c6414e;
        this.f20c = a0Var;
    }

    @Override // ef.InterfaceC2047g
    public InterfaceFutureC8957d apply(Object obj) {
        o0 o0Var = (o0) this.f19b;
        c0.u1 u1Var = (c0.u1) this.f20c;
        o0Var.m14410b();
        u1Var.mo7416a();
        return o0Var.m14418m();
    }
}
