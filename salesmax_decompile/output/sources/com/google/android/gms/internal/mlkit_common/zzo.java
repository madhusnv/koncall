package com.google.android.gms.internal.mlkit_common;

import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzo {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    static {
        Field field;
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        ?? field2;
        Field field3;
        Throwable th;
        Object obj;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            declaredMethod = cls3.getDeclaredMethod("S_ISLNK", Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod3 = cls4.getDeclaredMethod("lstat", String.class);
                try {
                    declaredMethod2 = cls4.getDeclaredMethod("fstat", FileDescriptor.class);
                    try {
                        Field declaredField = cls.getDeclaredField("os");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(cls);
                        try {
                            field2 = cls2.getField("st_dev");
                            try {
                                field3 = cls2.getField("st_ino");
                                try {
                                    field = cls2.getField("st_mode");
                                    try {
                                        field2.setAccessible(true);
                                        field3.setAccessible(true);
                                        field.setAccessible(true);
                                        zza = declaredMethod;
                                        zzb = declaredMethod3;
                                        zzc = declaredMethod2;
                                        zzd = field2;
                                        zze = field3;
                                        zzf = field;
                                        zzg = obj;
                                        zzh = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zza = declaredMethod;
                                        zzb = declaredMethod3;
                                        zzc = declaredMethod2;
                                        zzd = field2;
                                        zze = field3;
                                        zzf = field;
                                        zzg = obj;
                                        zzh = th;
                                    }
                                } catch (Throwable th3) {
                                    field = null;
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                field3 = null;
                                field2 = field2;
                                th = th;
                                field = field3;
                                zza = declaredMethod;
                                zzb = declaredMethod3;
                                zzc = declaredMethod2;
                                zzd = field2;
                                zze = field3;
                                zzf = field;
                                zzg = obj;
                                zzh = th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            field2 = 0;
                            field3 = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        field = null;
                        field2 = 0;
                        field3 = field2;
                        th = th;
                        obj = field3;
                        zza = declaredMethod;
                        zzb = declaredMethod3;
                        zzc = declaredMethod2;
                        zzd = field2;
                        zze = field3;
                        zzf = field;
                        zzg = obj;
                        zzh = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field = null;
                    declaredMethod2 = null;
                    field2 = 0;
                }
            } catch (Throwable th8) {
                th = th8;
                field = null;
                declaredMethod2 = null;
                declaredMethod3 = declaredMethod2;
                field2 = declaredMethod3;
                field3 = field2;
                th = th;
                obj = field3;
                zza = declaredMethod;
                zzb = declaredMethod3;
                zzc = declaredMethod2;
                zzd = field2;
                zze = field3;
                zzf = field;
                zzg = obj;
                zzh = th;
            }
        } catch (Throwable th9) {
            th = th9;
            field = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
    }

    public static zzq zza(final FileDescriptor fileDescriptor) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzo.zze(zzo.zzc.invoke(zzo.zzg, fileDescriptor));
            }
        });
    }

    public static zzq zzd(final String str) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzo.zze(zzo.zzb.invoke(zzo.zzg, str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzq zze(Object obj) {
        return new zzq(((Long) zzd.get(obj)).longValue(), ((Long) zze.get(obj)).longValue(), ((Boolean) zza.invoke(null, Integer.valueOf(((Integer) zzf.get(obj)).intValue()))).booleanValue());
    }

    private static Object zzf(Callable callable) throws IOException {
        try {
            Throwable th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
