package com.google.android.gms.internal.measurement;

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
public final class u6 {
    public static final u6 zza;
    public static final u6 zzb;
    public static final u6 zzc;
    public static final u6 zzd;
    public static final u6 zze;
    public static final u6 zzf;
    public static final u6 zzg;
    public static final u6 zzh;
    public static final u6 zzi;
    public static final u6 zzj;
    public static final u6 zzk;
    public static final u6 zzl;
    public static final u6 zzm;
    public static final u6 zzn;
    public static final u6 zzo;
    public static final u6 zzp;
    public static final u6 zzq;
    public static final u6 zzr;
    private static final /* synthetic */ u6[] zzu;
    private final v6 zzs;
    private final int zzt;

    static {
        u6 u6Var = new u6("DOUBLE", 0, v6.DOUBLE, 1);
        zza = u6Var;
        u6 u6Var2 = new u6("FLOAT", 1, v6.FLOAT, 5);
        zzb = u6Var2;
        v6 v6Var = v6.LONG;
        u6 u6Var3 = new u6("INT64", 2, v6Var, 0);
        zzc = u6Var3;
        u6 u6Var4 = new u6("UINT64", 3, v6Var, 0);
        zzd = u6Var4;
        v6 v6Var2 = v6.INT;
        u6 u6Var5 = new u6("INT32", 4, v6Var2, 0);
        zze = u6Var5;
        u6 u6Var6 = new u6("FIXED64", 5, v6Var, 1);
        zzf = u6Var6;
        u6 u6Var7 = new u6("FIXED32", 6, v6Var2, 5);
        zzg = u6Var7;
        u6 u6Var8 = new u6("BOOL", 7, v6.BOOLEAN, 0);
        zzh = u6Var8;
        u6 u6Var9 = new u6("STRING", 8, v6.STRING, 2);
        zzi = u6Var9;
        v6 v6Var3 = v6.MESSAGE;
        u6 u6Var10 = new u6("GROUP", 9, v6Var3, 3);
        zzj = u6Var10;
        u6 u6Var11 = new u6("MESSAGE", 10, v6Var3, 2);
        zzk = u6Var11;
        u6 u6Var12 = new u6("BYTES", 11, v6.BYTE_STRING, 2);
        zzl = u6Var12;
        u6 u6Var13 = new u6("UINT32", 12, v6Var2, 0);
        zzm = u6Var13;
        u6 u6Var14 = new u6("ENUM", 13, v6.ENUM, 0);
        zzn = u6Var14;
        u6 u6Var15 = new u6("SFIXED32", 14, v6Var2, 5);
        zzo = u6Var15;
        u6 u6Var16 = new u6("SFIXED64", 15, v6Var, 1);
        zzp = u6Var16;
        u6 u6Var17 = new u6("SINT32", 16, v6Var2, 0);
        zzq = u6Var17;
        u6 u6Var18 = new u6("SINT64", 17, v6Var, 0);
        zzr = u6Var18;
        zzu = new u6[]{u6Var, u6Var2, u6Var3, u6Var4, u6Var5, u6Var6, u6Var7, u6Var8, u6Var9, u6Var10, u6Var11, u6Var12, u6Var13, u6Var14, u6Var15, u6Var16, u6Var17, u6Var18};
    }

    private u6(String str, int i10, v6 v6Var, int i11) {
        this.zzs = v6Var;
        this.zzt = i11;
    }

    public static u6[] values() {
        return (u6[]) zzu.clone();
    }

    public final v6 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
