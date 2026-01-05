package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class zzbt {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        zza = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
        }
        zzb = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int iIntValue;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method = zzb;
        if (method != null) {
            try {
                num = (Integer) method.invoke(UserHandle.class, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            iIntValue = num != null ? num.intValue() : 0;
        }
        Method method2 = zza;
        if (method2 != null) {
            try {
                Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    return num2.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return jobScheduler.schedule(jobInfo);
    }
}
