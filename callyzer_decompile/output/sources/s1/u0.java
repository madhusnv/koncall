package s1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.Serializable;
import ji.C3773g;
import ji.C3775i;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a */
    public int f32143a;

    /* renamed from: b */
    public int f32144b;

    /* renamed from: c */
    public Object f32145c;

    /* renamed from: d */
    public Serializable f32146d;

    /* renamed from: e */
    public Object f32147e;

    /* renamed from: c */
    public static String m12861c(C3773g c3773g) {
        c3773g.m8293a();
        C3775i c3775i = c3773g.f19664c;
        String str = c3775i.f19681e;
        if (str != null) {
            return str;
        }
        c3773g.m8293a();
        String str2 = c3775i.f19678b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    /* renamed from: a */
    public int m12862a(long j6) {
        int i10 = this.f32143a + 1;
        long[] jArr = (long[]) this.f32145c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r22 = new int[i11];
            AbstractC6662l.m12718h(0, jArr, 0, jArr2, jArr.length);
            AbstractC6662l.m12722l(0, (int[]) this.f32146d, 0, 14, r22);
            this.f32145c = jArr2;
            this.f32146d = r22;
        }
        int i12 = this.f32143a;
        this.f32143a = i12 + 1;
        int length2 = ((int[]) this.f32147e).length;
        if (this.f32144b >= length2) {
            int i13 = length2 * 2;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr[i14] = i15;
                i14 = i15;
            }
            AbstractC6662l.m12722l(0, (int[]) this.f32147e, 0, 14, iArr);
            this.f32147e = iArr;
        }
        int i16 = this.f32144b;
        int[] iArr2 = (int[]) this.f32147e;
        this.f32144b = iArr2[i16];
        long[] jArr3 = (long[]) this.f32145c;
        jArr3[i12] = j6;
        ((int[]) this.f32146d)[i12] = i16;
        iArr2[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (jArr3[i17] <= j6) {
                break;
            }
            m12866f(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    /* renamed from: b */
    public synchronized String m12863b() {
        try {
            if (((String) this.f32146d) == null) {
                m12865e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f32146d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:35:0x006e, B:34:0x006c), top: B:42:0x0001 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m12864d() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f32144b     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L71
        La:
            java.lang.Object r0 = r5.f32145c     // Catch: java.lang.Throwable -> L43
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L43
            r4 = -1
            if (r3 != r4) goto L20
            monitor-exit(r5)
            r0 = r2
            goto L71
        L20:
            boolean r3 = zf.AbstractC8947b.m16428e()     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L45
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L43
            if (r3 <= 0) goto L45
            r5.f32144b = r1     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r1
            goto L71
        L43:
            r0 = move-exception
            goto L75
        L45:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L43
            r3 = 2
            if (r0 == 0) goto L63
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L43
            if (r0 <= 0) goto L63
            r5.f32144b = r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r3
            goto L71
        L63:
            boolean r0 = zf.AbstractC8947b.m16428e()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L6c
            r5.f32144b = r3     // Catch: java.lang.Throwable -> L43
            goto L6e
        L6c:
            r5.f32144b = r1     // Catch: java.lang.Throwable -> L43
        L6e:
            int r0 = r5.f32144b     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
        L71:
            if (r0 == 0) goto L74
            return r1
        L74:
            return r2
        L75:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.u0.m12864d():boolean");
    }

    /* renamed from: e */
    public synchronized void m12865e() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.f32145c).getPackageManager().getPackageInfo(((Context) this.f32145c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f32146d = Integer.toString(packageInfo.versionCode);
            this.f32147e = packageInfo.versionName;
        }
    }

    /* renamed from: f */
    public void m12866f(int i10, int i11) {
        long[] jArr = (long[]) this.f32145c;
        int[] iArr = (int[]) this.f32146d;
        int[] iArr2 = (int[]) this.f32147e;
        long j6 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j6;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
