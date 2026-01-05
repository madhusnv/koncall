package com.arthenica.ffmpegkit;

import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import dg.C1720i;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import qe.AbstractC6192c;
import qe.C6191b;
import qe.C6193d;
import qe.C6194e;
import qe.C6196g;
import qe.C6201l;
import qe.EnumC6195f;
import qe.EnumC6197h;
import qe.EnumC6200k;
import qe.InterfaceC6199j;
import se.AbstractC6814a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FFmpegKitConfig {

    /* renamed from: a */
    public static final AtomicInteger f5946a;

    /* renamed from: b */
    public static EnumC6195f f5947b;

    /* renamed from: c */
    public static int f5948c;

    /* renamed from: d */
    public static final C6191b f5949d;

    /* renamed from: e */
    public static final LinkedList f5950e;

    /* renamed from: f */
    public static final Object f5951f;

    /* renamed from: g */
    public static final ExecutorService f5952g;

    /* renamed from: h */
    public static final SparseArray f5953h;

    /* renamed from: i */
    public static final SparseArray f5954i;

    /* renamed from: j */
    public static final EnumC6197h f5955j;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    static {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.<clinit>():void");
    }

    /* renamed from: a */
    public static String m3078a(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m3079b() {
        while (true) {
            LinkedList linkedList = f5950e;
            if (linkedList.size() <= f5948c) {
                return;
            }
            try {
                InterfaceC6199j interfaceC6199j = (InterfaceC6199j) linkedList.remove(0);
                if (interfaceC6199j != null) {
                    f5949d.remove(Long.valueOf(((C6194e) interfaceC6199j).f30156a));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m3080c(C6194e c6194e) {
        String[] strArr = c6194e.f30161f;
        c6194e.f30164i = EnumC6200k.RUNNING;
        c6194e.f30159d = new Date();
        try {
            c6194e.f30165j = new C1720i(nativeFFmpegExecute(c6194e.f30156a, strArr), 3);
            c6194e.f30164i = EnumC6200k.COMPLETED;
            c6194e.f30160e = new Date();
        } catch (Exception e2) {
            c6194e.f30166k = AbstractC6814a.m12989a(e2);
            c6194e.f30164i = EnumC6200k.FAILED;
            c6194e.f30160e = new Date();
            m3078a(strArr);
            AbstractC6814a.m12989a(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3081d(android.content.Context r6, android.net.Uri r7) throws java.lang.Throwable {
        /*
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L86
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L2f
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L2f
            java.lang.String r0 = "_display_name"
            int r0 = r7.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L20
            goto L31
        L20:
            r0 = move-exception
            r6 = r0
            r7.close()     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L2c
        L2b:
            throw r6     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
        L2d:
            r6 = r0
            goto L89
        L2f:
            java.lang.String r0 = "unknown"
        L31:
            if (r7 == 0) goto L36
            r7.close()     // Catch: java.lang.Throwable -> L2c
        L36:
            java.util.concurrent.atomic.AtomicInteger r7 = com.arthenica.ffmpegkit.FFmpegKitConfig.f5946a
            int r7 = r7.getAndIncrement()
            qe.d r2 = new qe.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            android.content.ContentResolver r6 = r6.getContentResolver()
            r2.<init>(r3, r1, r6)
            android.util.SparseArray r6 = com.arthenica.ffmpegkit.FFmpegKitConfig.f5953h
            r6.put(r7, r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "saf:"
            r6.<init>(r1)
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            int r1 = r0.lastIndexOf(r7)
            if (r1 < 0) goto L6b
            int r7 = r0.lastIndexOf(r7)
            java.lang.String r0 = r0.substring(r7)
        L6b:
            java.util.StringTokenizer r7 = new java.util.StringTokenizer     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = " ."
            r7.<init>(r0, r1)     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = r7.nextToken()     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            r7 = r0
            se.AbstractC6814a.m12989a(r7)
            java.lang.String r7 = "raw"
        L7e:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
        L86:
            r0 = move-exception
            r1 = r7
            goto L2d
        L89:
            r1.toString()
            se.AbstractC6814a.m12989a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.m3081d(android.content.Context, android.net.Uri):java.lang.String");
    }

    private static native void disableNativeRedirection();

    /* renamed from: e */
    public static InterfaceC6199j m3082e(long j6) {
        InterfaceC6199j interfaceC6199j;
        synchronized (f5951f) {
            interfaceC6199j = (InterfaceC6199j) f5949d.get(Long.valueOf(j6));
        }
        return interfaceC6199j;
    }

    private static native void enableNativeRedirection();

    /* renamed from: f */
    public static LinkedList m3083f() {
        LinkedList linkedList;
        synchronized (f5951f) {
            linkedList = new LinkedList(f5950e);
        }
        return linkedList;
    }

    /* renamed from: g */
    public static void m3084g(EnumC6195f enumC6195f) {
        if (enumC6195f != null) {
            f5947b = enumC6195f;
            setNativeLogLevel(enumC6195f.getValue());
        }
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    public static native int getNativeLogLevel();

    private static native String getNativeVersion();

    /* renamed from: h */
    public static void m3085h(int i10) {
        if (i10 >= 1000) {
            throw new IllegalArgumentException("Session history size must not exceed the hard limit!");
        }
        if (i10 > 0) {
            f5948c = i10;
            m3079b();
        }
    }

    private static native void ignoreNativeSignal(int i10);

    private static void log(long j6, int i10, byte[] bArr) {
        EnumC6195f enumC6195fFrom = EnumC6195f.from(i10);
        String str = new String(bArr);
        C6196g c6196g = new C6196g(j6, enumC6195fFrom, str);
        EnumC6197h enumC6197h = f5955j;
        if ((f5947b != EnumC6195f.AV_LOG_QUIET || i10 == EnumC6195f.AV_LOG_STDERR.getValue()) && i10 <= f5947b.getValue()) {
            InterfaceC6199j interfaceC6199jM3082e = m3082e(j6);
            boolean z6 = false;
            if (interfaceC6199jM3082e != null) {
                C6194e c6194e = (C6194e) interfaceC6199jM3082e;
                EnumC6197h enumC6197h2 = c6194e.f30167l;
                synchronized (c6194e.f30163h) {
                    c6194e.f30162g.add(c6196g);
                }
                if (c6194e.f30157b != null) {
                    try {
                        ((RecordingCompressManager) ((C6194e) interfaceC6199jM3082e).f30157b.f43339b).m5047f(str, null);
                    } catch (Exception e2) {
                        AbstractC6814a.m12989a(e2);
                    }
                    z6 = true;
                }
                enumC6197h = enumC6197h2;
            }
            int i11 = AbstractC6192c.f30149a[enumC6197h.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && z6) {
                            return;
                        }
                    } else if (z6) {
                        return;
                    }
                }
                int i12 = AbstractC6192c.f30150b[enumC6195fFrom.ordinal()];
            }
        }
    }

    public static native int messagesInTransmit(long j6);

    public static native void nativeFFmpegCancel(long j6);

    private static native int nativeFFmpegExecute(long j6, String[] strArr);

    public static native int nativeFFprobeExecute(long j6, String[] strArr);

    private static native int registerNewNativeFFmpegPipe(String str);

    private static int safClose(int i10) {
        try {
            SparseArray sparseArray = f5954i;
            C6193d c6193d = (C6193d) sparseArray.get(i10);
            if (c6193d == null) {
                String.format("SAF fd %d not found.", Integer.valueOf(i10));
                return 0;
            }
            ParcelFileDescriptor parcelFileDescriptor = c6193d.f30154d;
            if (parcelFileDescriptor == null) {
                String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i10));
                return 0;
            }
            sparseArray.delete(i10);
            f5953h.delete(c6193d.f30151a.intValue());
            parcelFileDescriptor.close();
            return 1;
        } catch (Throwable th2) {
            String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i10), AbstractC6814a.m12989a(th2));
            return 0;
        }
    }

    private static int safOpen(int i10) {
        try {
            C6193d c6193d = (C6193d) f5953h.get(i10);
            if (c6193d == null) {
                String.format("SAF id %d not found.", Integer.valueOf(i10));
                return 0;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c6193d.f30153c.openFileDescriptor(c6193d.f30152b, "r");
            c6193d.f30154d = parcelFileDescriptorOpenFileDescriptor;
            int fd2 = parcelFileDescriptorOpenFileDescriptor.getFd();
            f5954i.put(fd2, c6193d);
            return fd2;
        } catch (Throwable th2) {
            String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i10), AbstractC6814a.m12989a(th2));
            return 0;
        }
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i10);

    private static void statistics(long j6, int i10, float f6, float f10, long j10, double d2, double d10, double d11) {
        C6201l c6201l = new C6201l();
        c6201l.f30176a = j6;
        c6201l.f30177b = i10;
        c6201l.f30178c = f6;
        c6201l.f30179d = f10;
        c6201l.f30180e = j10;
        c6201l.f30181f = d2;
        c6201l.f30182g = d10;
        c6201l.f30183h = d11;
        InterfaceC6199j interfaceC6199jM3082e = m3082e(j6);
        if (interfaceC6199jM3082e != null) {
            C6194e c6194e = (C6194e) interfaceC6199jM3082e;
            synchronized (c6194e.f30171p) {
                c6194e.f30170o.add(c6201l);
            }
            if (c6194e.f30168m != null) {
                try {
                    c6201l.toString();
                } catch (Exception e2) {
                    AbstractC6814a.m12989a(e2);
                }
            }
        }
    }
}
