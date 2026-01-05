package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class m1 {
    public static final m1 zza;
    public static final m1 zzb;
    public static final m1 zzc;
    public static final m1 zzd;
    public static final m1 zze;
    public static final m1 zzf;
    public static final m1 zzg;
    public static final m1 zzh;
    public static final m1 zzi;
    public static final m1 zzj;
    private static final /* synthetic */ m1[] zzk;
    private final Class zzl;

    static {
        m1 m1Var = new m1("VOID", 0, Void.class, Void.class, null);
        zza = m1Var;
        Class cls = Integer.TYPE;
        m1 m1Var2 = new m1("INT", 1, cls, Integer.class, 0);
        zzb = m1Var2;
        m1 m1Var3 = new m1("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = m1Var3;
        m1 m1Var4 = new m1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(DefinitionKt.NO_Float_VALUE));
        zzd = m1Var4;
        m1 m1Var5 = new m1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = m1Var5;
        m1 m1Var6 = new m1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = m1Var6;
        m1 m1Var7 = new m1("STRING", 6, String.class, String.class, "");
        zzg = m1Var7;
        m1 m1Var8 = new m1("BYTE_STRING", 7, r0.class, r0.class, r0.f6641b);
        zzh = m1Var8;
        m1 m1Var9 = new m1("ENUM", 8, cls, Integer.class, null);
        zzi = m1Var9;
        m1 m1Var10 = new m1("MESSAGE", 9, Object.class, Object.class, null);
        zzj = m1Var10;
        zzk = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7, m1Var8, m1Var9, m1Var10};
    }

    private m1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static m1[] values() {
        return (m1[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
