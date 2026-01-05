package io;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amplifyframework.storage.StorageException;
import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import xm.C8418z;
import xm.q4;
import xm.y5;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: io.e */
/* loaded from: classes3.dex */
public final class C3330e {

    /* renamed from: a */
    public final y5 f17623a;

    /* renamed from: b */
    public final C8805t f17624b;

    /* renamed from: c */
    public final q4 f17625c;

    /* renamed from: d */
    public final C8810d f17626d;

    /* renamed from: e */
    public final Context f17627e;

    /* renamed from: f */
    public final C8418z f17628f;

    public C3330e(y5 userSIMRepository, C8805t c8805t, q4 sessionConfigurationRepository, C8810d c8810d, Context context, C8418z appPreferenceRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        AbstractC4154l.m8923f(appPreferenceRepository, "appPreferenceRepository");
        this.f17623a = userSIMRepository;
        this.f17624b = c8805t;
        this.f17625c = sessionConfigurationRepository;
        this.f17626d = c8810d;
        this.f17627e = context;
        this.f17628f = appPreferenceRepository;
    }

    /* renamed from: a */
    public static void m7655a(StringBuilder sb2, List list) {
        String str;
        String str2 = "YES";
        a1.m14319B(sb2, "<------ Currently Active Features ------>\n", "CallSync: ", "YES", "\n");
        sb2.append("Lead: ");
        if (list.isEmpty()) {
            str = "NO";
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C4802m) it.next()).f23902n) {
                    str = "YES";
                    break;
                }
            }
            str = "NO";
        }
        sb2.append(str);
        sb2.append("\n");
        sb2.append("CallRecording: ");
        if (list.isEmpty()) {
            str2 = "NO";
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C4802m) it2.next()).f23905q) {
                    break;
                }
            }
            str2 = "NO";
        }
        sb2.append(str2);
        sb2.append("\n\n");
    }

    /* renamed from: b */
    public static void m7656b(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            sb2.append("Log file [No customer name found]\n");
            return;
        }
        sb2.append("<------ Connected Number ------> \n");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4802m c4802m = (C4802m) it.next();
            if (c4802m.f23898j) {
                sb2.append("Phone Number: ");
                a1.m14318A(sb2, c4802m.f23891c, "\n", "Customer Name: ");
                a1.m14318A(sb2, c4802m.f23909u, "\n", "Device Connect Code: ");
                sb2.append(c4802m.f23897i);
                sb2.append("\n");
            }
        }
    }

    /* renamed from: c */
    public static String m7657c(StringBuilder sb2, List list) {
        String strM14335o;
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeM16204m = C8800o.m16204m();
        if (list.isEmpty()) {
            sb2.append("UNKNOWN");
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4802m c4802m = (C4802m) it.next();
                if (c4802m.f23898j) {
                    sb2.append(" (");
                    sb2.append(c4802m.f23891c);
                    sb2.append(") ");
                }
            }
        }
        C8800o c8800o2 = C8800o.f42459a;
        String strM16191O = C8800o.m16191O(localDateTimeM16204m);
        if (list.isEmpty()) {
            String str = Build.BRAND;
            String str2 = Build.MODEL;
            String strM16191O2 = C8800o.m16191O(localDateTimeM16204m);
            String str3 = localDateTimeM16204m.format(C8800o.m16214w("HH:mm:ss.SSS"));
            AbstractC4154l.m8922e(str3, "format(...)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("_");
            sb3.append(str2);
            sb3.append("_LOG_");
            sb3.append(strM16191O2);
            strM14335o = a1.m14335o(sb3, "_", str3, ".txt");
        } else {
            String str4 = localDateTimeM16204m.format(C8800o.m16214w("HH:mm:ss.SSS"));
            AbstractC4154l.m8922e(str4, "format(...)");
            strM14335o = AbstractC5601a.m11238i("LOG_", str4, ".txt");
        }
        return ((Object) sb2) + "/" + strM16191O + "/" + strM14335o;
    }

    /* renamed from: e */
    public static int m7658e(Exception exc) {
        return exc == null ? R.string.something_went_wrong_Please_try_again : ((exc instanceof UnknownHostException) || (exc instanceof ConnectException)) ? R.string.check_internet_connection : exc instanceof IOException ? R.string.ioexception_accessing_the_log_file : exc instanceof StorageException ? R.string.storage_service_error : R.string.something_went_wrong_Please_try_again;
    }

    /* renamed from: d */
    public final void m7659d(StringBuilder sb2) {
        sb2.append("\n<----- Device Information -----> \n");
        try {
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f17627e;
            PackageInfo packageInfo = i10 >= 33 ? context.getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", 0);
            String str = packageInfo.versionName;
            Object objValueOf = i10 >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode);
            sb2.append("Version Name: ");
            sb2.append(str);
            sb2.append("\n");
            sb2.append("Version Code: ");
            sb2.append(objValueOf);
            sb2.append("\n");
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        sb2.append("Model :");
        a1.m14318A(sb2, Build.MODEL, "\n", "Manufacturer: ");
        a1.m14318A(sb2, Build.MANUFACTURER, "\n", "Board: ");
        a1.m14318A(sb2, Build.BOARD, "\n", "Brand: ");
        a1.m14318A(sb2, Build.BRAND, "\n", "Android Version: ");
        a1.m14318A(sb2, Build.VERSION.RELEASE, "\n", "SDK Version: ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n");
    }

    /* renamed from: f */
    public final void m7660f(StringBuilder sb2) {
        sb2.append("<------ App statistics ------>\n");
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Object systemService = this.f17627e.getSystemService("usagestats");
                AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
                int appStandbyBucket = ((UsageStatsManager) systemService).getAppStandbyBucket();
                sb2.append("AppStandByBucket: ");
                if (appStandbyBucket == 10) {
                    sb2.append(" STANDBY_BUCKET_ACTIVE ");
                } else if (appStandbyBucket == 20) {
                    sb2.append(" STANDBY_BUCKET_WORKING_SET ");
                } else if (appStandbyBucket == 30) {
                    sb2.append(" STANDBY_BUCKET_FREQUENT ");
                } else if (appStandbyBucket == 40) {
                    sb2.append(" STANDBY_BUCKET_RARE ");
                } else if (appStandbyBucket != 45) {
                    sb2.append("Can't match value >>> value: ");
                    sb2.append(appStandbyBucket);
                } else {
                    sb2.append(" STANDBY_BUCKET_RESTRICTED ");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f17624b.m16236k(e2);
        }
        sb2.append("\n");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:8))(0)|7|9|(5:(2:69|(1:(6:13|14|15|66|41|(4:43|(1:45)(1:46)|47|48)(2:51|52))(2:18|19))(2:20|21))(4:23|67|24|(2:26|39)(1:27))|72|37|(4:40|66|41|(0)(0))|39)|22|70|28|(2:64|30)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:41:0x00b7, B:43:0x00bb, B:47:0x00c3, B:51:0x00eb), top: B:66:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb A[Catch: Exception -> 0x00e8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e8, blocks: (B:41:0x00b7, B:43:0x00bb, B:47:0x00c3, B:51:0x00eb), top: B:66:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7661g(java.io.File r10, boolean r11, ww.AbstractC8193c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3330e.m7661g(java.io.File, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7662h(java.io.File r12, java.lang.String r13, an.k5 r14, ww.AbstractC8193c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof io.C3327b
            if (r0 == 0) goto L13
            r0 = r15
            io.b r0 = (io.C3327b) r0
            int r1 = r0.f17608c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17608c = r1
            goto L18
        L13:
            io.b r0 = new io.b
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f17606a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17608c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r15)
            goto L4a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            og.od.m10798c(r15)
            ay.f r15 = tx.m0.f34659a
            ay.e r15 = ay.ExecutorC0495e.f3538c
            gs.l r4 = new gs.l
            r9 = 0
            r10 = 1
            r7 = r11
            r6 = r12
            r5 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f17608c = r3
            java.lang.Object r15 = tx.c0.m13475K(r15, r4, r0)
            if (r15 != r1) goto L4a
            return r1
        L4a:
            qw.n r15 = (qw.C6364n) r15
            java.lang.Object r12 = r15.f30758a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3330e.m7662h(java.io.File, java.lang.String, an.k5, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7663i(java.lang.String r15, java.io.File r16, java.lang.StringBuilder r17, boolean r18, ww.AbstractC8193c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.C3330e.m7663i(java.lang.String, java.io.File, java.lang.StringBuilder, boolean, ww.c):java.lang.Object");
    }
}
