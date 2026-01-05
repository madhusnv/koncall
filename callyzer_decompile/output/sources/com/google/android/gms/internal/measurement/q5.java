package com.google.android.gms.internal.measurement;

import com.skydoves.balloon.internals.DefinitionKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q5 {
    public static final q5 zza;
    public static final q5 zzb;
    public static final q5 zzc;
    public static final q5 zzd;
    public static final q5 zze;
    public static final q5 zzf;
    public static final q5 zzg;
    public static final q5 zzh;
    public static final q5 zzi;
    public static final q5 zzj;
    private static final /* synthetic */ q5[] zzl;
    private final Class zzk;

    static {
        q5 q5Var = new q5("VOID", 0, Void.class, Void.class, null);
        zza = q5Var;
        Class cls = Integer.TYPE;
        q5 q5Var2 = new q5("INT", 1, cls, Integer.class, 0);
        zzb = q5Var2;
        q5 q5Var3 = new q5("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = q5Var3;
        q5 q5Var4 = new q5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(DefinitionKt.NO_Float_VALUE));
        zzd = q5Var4;
        q5 q5Var5 = new q5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = q5Var5;
        q5 q5Var6 = new q5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = q5Var6;
        q5 q5Var7 = new q5("STRING", 6, String.class, String.class, "");
        zzg = q5Var7;
        q5 q5Var8 = new q5("BYTE_STRING", 7, z4.class, z4.class, z4.f6468c);
        zzh = q5Var8;
        q5 q5Var9 = new q5("ENUM", 8, cls, Integer.class, null);
        zzi = q5Var9;
        q5 q5Var10 = new q5("MESSAGE", 9, Object.class, Object.class, null);
        zzj = q5Var10;
        zzl = new q5[]{q5Var, q5Var2, q5Var3, q5Var4, q5Var5, q5Var6, q5Var7, q5Var8, q5Var9, q5Var10};
    }

    private q5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static q5[] values() {
        return (q5[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
