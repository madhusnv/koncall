package com.google.android.gms.dynamite;

import android.os.Looper;

/* loaded from: classes5.dex */
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /* JADX WARN: Removed duplicated region for block: B:49:0x009d A[Catch: all -> 0x00c3, PHI: r1
      0x009d: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:45:0x0098] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:44:0x0096, B:57:0x00ba, B:12:0x001f, B:48:0x009c, B:49:0x009d, B:60:0x00be, B:61:0x00bf, B:50:0x009e, B:56:0x00b9, B:55:0x00a8, B:13:0x0020, B:15:0x002d, B:21:0x0042, B:22:0x0049, B:24:0x0054, B:30:0x0069, B:31:0x0070, B:41:0x0083, B:42:0x0094, B:18:0x003c), top: B:67:0x0003, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader zza() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (zza == null) {
            Thread thread2 = zzb;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                    }
                }
                zza = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            int iActiveGroupCount = threadGroup2.activeGroupCount();
                            ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                            threadGroup2.enumerate(threadGroupArr);
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= iActiveGroupCount) {
                                    threadGroup = null;
                                    break;
                                }
                                threadGroup = threadGroupArr[i2];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i2++;
                            }
                            if (threadGroup == null) {
                                threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                            }
                            int iActiveCount = threadGroup.activeCount();
                            Thread[] threadArr = new Thread[iActiveCount];
                            threadGroup.enumerate(threadArr);
                            while (true) {
                                if (i >= iActiveCount) {
                                    thread = null;
                                    break;
                                }
                                thread = threadArr[i];
                                if ("GmsDynamite".equals(thread.getName())) {
                                    break;
                                }
                                i++;
                            }
                            if (thread == null) {
                                try {
                                    zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                    try {
                                        zzaVar.setContextClassLoader(null);
                                        zzaVar.start();
                                        thread = zzaVar;
                                    } catch (SecurityException e3) {
                                        e = e3;
                                        thread = zzaVar;
                                        String message2 = e.getMessage();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Failed to enumerate thread/threadgroup ");
                                        sb2.append(message2);
                                        thread2 = thread;
                                        zzb = thread2;
                                        if (thread2 != null) {
                                        }
                                        zza = contextClassLoader;
                                        return zza;
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                }
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
