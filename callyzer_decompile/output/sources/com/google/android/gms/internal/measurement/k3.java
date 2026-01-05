package com.google.android.gms.internal.measurement;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k3 extends i5 {
    private static final k3 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private o5 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private l3 zzQ;
    private m5 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private g3 zzaa;
    private String zzab;
    private o5 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private s2 zzal;
    private int zzam;
    private p2 zzan;
    private String zzao;
    private s3 zzap;
    private long zzaq;
    private String zzar;
    private y2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private o5 zzf;
    private o5 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        k3 k3Var = new k3();
        zzat = k3Var;
        i5.m3332m(k3.class, k3Var);
    }

    public k3() {
        g6 g6Var = g6.f6216e;
        this.zzf = g6Var;
        this.zzg = g6Var;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = g6Var;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = j5.f6255e;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = g6Var;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    /* renamed from: U */
    public static j3 m3433U() {
        return (j3) zzat.m3339h();
    }

    /* renamed from: V */
    public static j3 m3434V(k3 k3Var) {
        h5 h5VarM3339h = zzat.m3339h();
        h5VarM3339h.m3307f(k3Var);
        return (j3) h5VarM3339h;
    }

    /* renamed from: A */
    public final long m3435A() {
        return this.zzz;
    }

    public final boolean A0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void A1(boolean z6) {
        this.zzb |= 131072;
        this.zzx = z6;
    }

    /* renamed from: B */
    public final boolean m3436B() {
        return (this.zzb & 1048576) != 0;
    }

    public final String B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    /* renamed from: C */
    public final int m3437C() {
        return this.zzA;
    }

    public final boolean C0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void C1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    /* renamed from: D */
    public final String m3438D() {
        return this.zzB;
    }

    public final boolean D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    /* renamed from: E */
    public final String m3439E() {
        return this.zzC;
    }

    public final boolean E0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void E1(long j6) {
        this.zzb |= 524288;
        this.zzz = j6;
    }

    /* renamed from: F */
    public final boolean m3440F() {
        return (this.zzb & 8388608) != 0;
    }

    public final String F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    /* renamed from: G */
    public final boolean m3441G() {
        return this.zzD;
    }

    public final int G0() {
        return this.zzaj;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    /* renamed from: H */
    public final o5 m3442H() {
        return this.zzE;
    }

    public final boolean H0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    /* renamed from: I */
    public final String m3443I() {
        return this.zzF;
    }

    public final s2 I0() {
        s2 s2Var = this.zzal;
        return s2Var == null ? s2.m3641x() : s2Var;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    /* renamed from: J */
    public final boolean m3444J() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean J0() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    /* renamed from: K */
    public final int m3445K() {
        return this.zzG;
    }

    public final int K0() {
        return this.zzam;
    }

    public final void K1(ArrayList arrayList) {
        o5 o5Var = this.zzE;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzE = o5Var.mo3298o(size + size);
        }
        t4.m3668c(arrayList, this.zzE);
    }

    /* renamed from: L */
    public final boolean m3446L() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean L0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void L1() {
        this.zzE = g6.f6216e;
    }

    /* renamed from: M */
    public final long m3447M() {
        return this.zzK;
    }

    public final p2 M0() {
        p2 p2Var = this.zzan;
        return p2Var == null ? p2.m3554P() : p2Var;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    /* renamed from: N */
    public final boolean m3448N() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void N1(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    /* renamed from: O */
    public final String m3449O() {
        return this.zzM;
    }

    public final s3 O0() {
        s3 s3Var = this.zzap;
        return s3Var == null ? s3.m3657r() : s3Var;
    }

    public final /* synthetic */ void O1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    /* renamed from: P */
    public final boolean m3450P() {
        return (this.zzb & 1) != 0;
    }

    public final int P0() {
        return this.zze;
    }

    public final List P1() {
        return this.zzf;
    }

    /* renamed from: Q */
    public final boolean m3451Q() {
        return (this.zzd & 134217728) != 0;
    }

    public final /* synthetic */ void Q0(long j6) {
        this.zzb |= 536870912;
        this.zzK = j6;
    }

    public final void Q1() {
        o5 o5Var = this.zzf;
        if (((u4) o5Var).f6407a) {
            return;
        }
        int size = o5Var.size();
        this.zzf = o5Var.mo3298o(size + size);
    }

    /* renamed from: R */
    public final long m3452R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void R1() {
        o5 o5Var = this.zzg;
        if (((u4) o5Var).f6407a) {
            return;
        }
        int size = o5Var.size();
        this.zzg = o5Var.mo3298o(size + size);
    }

    /* renamed from: S */
    public final boolean m3453S() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void S0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int S1() {
        return this.zzf.size();
    }

    /* renamed from: T */
    public final y2 m3454T() {
        y2 y2Var = this.zzas;
        return y2Var == null ? y2.m3780r() : y2Var;
    }

    public final /* synthetic */ void T0(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    public final c3 T1(int i10) {
        return (c3) this.zzf.get(i10);
    }

    public final void U0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((u4) randomAccess).f6407a) {
            j5 j5Var = (j5) randomAccess;
            int i10 = j5Var.f6257c;
            this.zzR = j5Var.mo3298o(i10 + i10);
        }
        t4.m3668c(arrayList, this.zzR);
    }

    public final o5 U1() {
        return this.zzg;
    }

    public final /* synthetic */ void V0(long j6) {
        this.zzd |= 16;
        this.zzS = j6;
    }

    public final int V1() {
        return this.zzg.size();
    }

    /* renamed from: W */
    public final /* synthetic */ void m3455W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void W0(long j6) {
        this.zzd |= 32;
        this.zzT = j6;
    }

    public final u3 W1(int i10) {
        return (u3) this.zzg.get(i10);
    }

    /* renamed from: X */
    public final /* synthetic */ void m3456X(int i10, c3 c3Var) {
        Q1();
        this.zzf.set(i10, c3Var);
    }

    public final /* synthetic */ void X0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean X1() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: Y */
    public final /* synthetic */ void m3457Y(c3 c3Var) {
        Q1();
        this.zzf.add(c3Var);
    }

    public final /* synthetic */ void Y0(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long Y1() {
        return this.zzh;
    }

    /* renamed from: Z */
    public final /* synthetic */ void m3458Z(Iterable iterable) {
        Q1();
        t4.m3668c(iterable, this.zzf);
    }

    public final /* synthetic */ void Z0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Z1() {
        return (this.zzb & 4) != 0;
    }

    public final void a0() {
        this.zzf = g6.f6216e;
    }

    public final void a1(Set set) {
        o5 o5Var = this.zzac;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzac = o5Var.mo3298o(size + size);
        }
        t4.m3668c(set, this.zzac);
    }

    public final long a2() {
        return this.zzi;
    }

    public final /* synthetic */ void b0(int i10) {
        Q1();
        this.zzf.remove(i10);
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean b2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void c0(int i10, u3 u3Var) {
        R1();
        this.zzg.set(i10, u3Var);
    }

    public final /* synthetic */ void c1(long j6) {
        this.zzd |= 32768;
        this.zzae = j6;
    }

    public final long c2() {
        return this.zzj;
    }

    public final /* synthetic */ void d0(u3 u3Var) {
        R1();
        this.zzg.add(u3Var);
    }

    public final /* synthetic */ void d1(boolean z6) {
        this.zzd |= 65536;
        this.zzaf = z6;
    }

    public final boolean d2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void e0(int i10) {
        R1();
        this.zzg.remove(i10);
    }

    public final /* synthetic */ void e1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long e2() {
        return this.zzk;
    }

    public final /* synthetic */ void f0(long j6) {
        this.zzb |= 2;
        this.zzh = j6;
    }

    public final /* synthetic */ void f1(boolean z6) {
        this.zzd |= 262144;
        this.zzah = z6;
    }

    public final boolean f2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long g2() {
        return this.zzl;
    }

    public final /* synthetic */ void h0(long j6) {
        this.zzb |= 4;
        this.zzi = j6;
    }

    public final /* synthetic */ void h1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    public final String h2() {
        return this.zzm;
    }

    public final /* synthetic */ void i0(long j6) {
        this.zzb |= 8;
        this.zzj = j6;
    }

    public final /* synthetic */ void i1(s2 s2Var) {
        this.zzal = s2Var;
        this.zzd |= 4194304;
    }

    public final String i2() {
        return this.zzn;
    }

    public final /* synthetic */ void j0(long j6) {
        this.zzb |= 16;
        this.zzk = j6;
    }

    public final /* synthetic */ void j1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String j2() {
        return this.zzo;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void k1(p2 p2Var) {
        this.zzan = p2Var;
        this.zzd |= 16777216;
    }

    public final String k2() {
        return this.zzp;
    }

    public final /* synthetic */ void l0(long j6) {
        this.zzb |= 32;
        this.zzl = j6;
    }

    public final /* synthetic */ void l1(s3 s3Var) {
        this.zzap = s3Var;
        this.zzd |= 67108864;
    }

    public final boolean l2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(long j6) {
        this.zzd |= 134217728;
        this.zzaq = j6;
    }

    public final int m2() {
        return this.zzq;
    }

    public final /* synthetic */ void n0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void n1() {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final String n2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", c3.class, "zzg", u3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", u2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", t1.f6383g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new k3();
        }
        if (i11 == 4) {
            return new j3(zzat);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void o0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void o1(y2 y2Var) {
        this.zzas = y2Var;
        this.zzd |= 536870912;
    }

    /* renamed from: p */
    public final String m3459p() {
        return this.zzs;
    }

    public final boolean p0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void p1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    /* renamed from: q */
    public final String m3460q() {
        return this.zzt;
    }

    public final int q0() {
        return this.zzO;
    }

    public final /* synthetic */ void q1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    /* renamed from: r */
    public final boolean m3461r() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean r0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    /* renamed from: s */
    public final long m3462s() {
        return this.zzu;
    }

    public final long s0() {
        return this.zzS;
    }

    public final /* synthetic */ void s1(int i10) {
        this.zzb |= 1024;
        this.zzq = i10;
    }

    /* renamed from: t */
    public final boolean m3463t() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean t0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= NewHope.SENDB_BYTES;
        this.zzr = str;
    }

    /* renamed from: u */
    public final long m3464u() {
        return this.zzv;
    }

    public final String u0() {
        return this.zzV;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    /* renamed from: v */
    public final String m3465v() {
        return this.zzw;
    }

    public final boolean v0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    /* renamed from: w */
    public final boolean m3466w() {
        return (this.zzb & 131072) != 0;
    }

    public final String w0() {
        return this.zzab;
    }

    public final /* synthetic */ void w1(long j6) {
        this.zzb |= 16384;
        this.zzu = j6;
    }

    /* renamed from: x */
    public final boolean m3467x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void x1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    /* renamed from: y */
    public final String m3468y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzae;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    /* renamed from: z */
    public final boolean m3469z() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean z0() {
        return this.zzaf;
    }

    public final /* synthetic */ void z1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }
}
