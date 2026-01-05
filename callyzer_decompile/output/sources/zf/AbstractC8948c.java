package zf;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.measurement.k4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zf.c */
/* loaded from: classes.dex */
public abstract class AbstractC8948c {

    /* renamed from: a */
    public static String f42958a;

    /* renamed from: b */
    public static int f42959b;

    /* renamed from: c */
    public static Boolean f42960c;

    /* renamed from: a */
    public static String m16432a() throws Throwable {
        BufferedReader bufferedReader;
        if (f42958a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f42958a = Application.getProcessName();
            } else {
                int iMyPid = f42959b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f42959b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            String str = "/proc/" + iMyPid + "/cmdline";
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(str));
                                try {
                                    String line = bufferedReader.readLine();
                                    AbstractC6840z.m13036g(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f42958a = strTrim;
                                    return f42958a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } finally {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (IOException unused4) {
                }
                f42958a = strTrim;
            }
        }
        return f42958a;
    }

    /* renamed from: b */
    public static boolean m16433b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolValueOf = f42960c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzac(k4.m3471b(objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f42960c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
