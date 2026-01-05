package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* loaded from: classes3.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:9:0x000f, B:11:0x0013, B:16:0x001b, B:18:0x001f, B:19:0x0029, B:32:0x004d, B:33:0x004f, B:22:0x002f, B:24:0x0035, B:30:0x0049, B:27:0x0041), top: B:40:0x000f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        boolean z;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                if (!zzb) {
                    int i = 1;
                    while (true) {
                        if (i > 2) {
                            break;
                        }
                        if (zza == null) {
                            zza = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = zza;
                        if (userManager == null) {
                            z = true;
                            break;
                        }
                        try {
                            if (userManager.isUserUnlocked()) {
                                break;
                            }
                            if (!userManager.isUserRunning(Process.myUserHandle())) {
                                break;
                            }
                            if (z) {
                                zza = null;
                            }
                        } catch (NullPointerException unused) {
                            zza = null;
                            i++;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    if (z) {
                        zzb = true;
                    }
                    if (!z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return true;
    }
}
