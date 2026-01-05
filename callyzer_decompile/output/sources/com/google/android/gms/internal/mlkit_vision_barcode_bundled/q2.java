package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
public final class q2 {
    public static final q2 zza;
    public static final q2 zzb;
    public static final q2 zzc;
    public static final q2 zzd;
    public static final q2 zze;
    public static final q2 zzf;
    public static final q2 zzg;
    public static final q2 zzh;
    public static final q2 zzi;
    public static final q2 zzj;
    public static final q2 zzk;
    public static final q2 zzl;
    public static final q2 zzm;
    public static final q2 zzn;
    public static final q2 zzo;
    public static final q2 zzp;
    public static final q2 zzq;
    public static final q2 zzr;
    private static final /* synthetic */ q2[] zzs;
    private final r2 zzt;

    static {
        q2 q2Var = new q2("DOUBLE", 0, r2.DOUBLE, 1);
        zza = q2Var;
        q2 q2Var2 = new q2("FLOAT", 1, r2.FLOAT, 5);
        zzb = q2Var2;
        r2 r2Var = r2.LONG;
        q2 q2Var3 = new q2("INT64", 2, r2Var, 0);
        zzc = q2Var3;
        q2 q2Var4 = new q2("UINT64", 3, r2Var, 0);
        zzd = q2Var4;
        r2 r2Var2 = r2.INT;
        q2 q2Var5 = new q2("INT32", 4, r2Var2, 0);
        zze = q2Var5;
        q2 q2Var6 = new q2("FIXED64", 5, r2Var, 1);
        zzf = q2Var6;
        q2 q2Var7 = new q2("FIXED32", 6, r2Var2, 5);
        zzg = q2Var7;
        q2 q2Var8 = new q2("BOOL", 7, r2.BOOLEAN, 0);
        zzh = q2Var8;
        q2 q2Var9 = new q2("STRING", 8, r2.STRING, 2);
        zzi = q2Var9;
        r2 r2Var3 = r2.MESSAGE;
        q2 q2Var10 = new q2("GROUP", 9, r2Var3, 3);
        zzj = q2Var10;
        q2 q2Var11 = new q2("MESSAGE", 10, r2Var3, 2);
        zzk = q2Var11;
        q2 q2Var12 = new q2("BYTES", 11, r2.BYTE_STRING, 2);
        zzl = q2Var12;
        q2 q2Var13 = new q2("UINT32", 12, r2Var2, 0);
        zzm = q2Var13;
        q2 q2Var14 = new q2("ENUM", 13, r2.ENUM, 0);
        zzn = q2Var14;
        q2 q2Var15 = new q2("SFIXED32", 14, r2Var2, 5);
        zzo = q2Var15;
        q2 q2Var16 = new q2("SFIXED64", 15, r2Var, 1);
        zzp = q2Var16;
        q2 q2Var17 = new q2("SINT32", 16, r2Var2, 0);
        zzq = q2Var17;
        q2 q2Var18 = new q2("SINT64", 17, r2Var, 0);
        zzr = q2Var18;
        zzs = new q2[]{q2Var, q2Var2, q2Var3, q2Var4, q2Var5, q2Var6, q2Var7, q2Var8, q2Var9, q2Var10, q2Var11, q2Var12, q2Var13, q2Var14, q2Var15, q2Var16, q2Var17, q2Var18};
    }

    private q2(String str, int i10, r2 r2Var, int i11) {
        this.zzt = r2Var;
    }

    public static q2[] values() {
        return (q2[]) zzs.clone();
    }

    public final r2 zza() {
        return this.zzt;
    }
}
