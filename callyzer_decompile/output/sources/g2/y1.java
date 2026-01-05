package g2;

import d3.C1565s;
import j2.AbstractC3524d;
import j2.EnumC3525e;
import k2.C3966o;
import k2.InterfaceC3962k;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: a */
    public static final k2.i2 f13286a = new k2.i2(w1.f13071b);

    /* renamed from: b */
    public static final k2.i2 f13287b = new k2.i2(w1.f13072c);

    /* renamed from: a */
    public static final long m6342a(v1 v1Var, long j6) {
        long j10 = v1Var.f12954a;
        long j11 = v1Var.f12970q;
        if (C1565s.m5187c(j6, j10)) {
            return v1Var.f12955b;
        }
        if (C1565s.m5187c(j6, v1Var.f12959f)) {
            return v1Var.f12960g;
        }
        if (C1565s.m5187c(j6, v1Var.f12963j)) {
            return v1Var.f12964k;
        }
        if (C1565s.m5187c(j6, v1Var.f12967n)) {
            return v1Var.f12968o;
        }
        if (C1565s.m5187c(j6, v1Var.f12976w)) {
            return v1Var.f12977x;
        }
        if (C1565s.m5187c(j6, v1Var.f12956c)) {
            return v1Var.f12957d;
        }
        if (C1565s.m5187c(j6, v1Var.f12961h)) {
            return v1Var.f12962i;
        }
        if (C1565s.m5187c(j6, v1Var.f12965l)) {
            return v1Var.f12966m;
        }
        if (C1565s.m5187c(j6, v1Var.f12978y)) {
            return v1Var.f12979z;
        }
        if (C1565s.m5187c(j6, v1Var.f12974u)) {
            return v1Var.f12975v;
        }
        if (C1565s.m5187c(j6, v1Var.f12969p)) {
            return j11;
        }
        if (C1565s.m5187c(j6, v1Var.f12971r)) {
            return v1Var.f12972s;
        }
        if (C1565s.m5187c(j6, v1Var.f12931D) || C1565s.m5187c(j6, v1Var.f12933F) || C1565s.m5187c(j6, v1Var.f12934G) || C1565s.m5187c(j6, v1Var.f12935H) || C1565s.m5187c(j6, v1Var.f12936I) || C1565s.m5187c(j6, v1Var.f12937J)) {
            return j11;
        }
        int i10 = C1565s.f7818k;
        return C1565s.f7817j;
    }

    /* renamed from: b */
    public static final long m6343b(long j6, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-1680936624);
        long jM6342a = m6342a((v1) c3966o.m8618k(f13286a), j6);
        if (jM6342a == 16) {
            jM6342a = ((C1565s) c3966o.m8618k(k2.f11902a)).f7819a;
        }
        c3966o.m8623p(false);
        return jM6342a;
    }

    /* renamed from: c */
    public static final long m6344c(v1 v1Var, EnumC3525e enumC3525e) {
        switch (x1.f13200a[enumC3525e.ordinal()]) {
            case 1:
                return v1Var.f12967n;
            case 2:
                return v1Var.f12976w;
            case 3:
                return v1Var.f12978y;
            case 4:
                return v1Var.f12975v;
            case 5:
                return v1Var.f12958e;
            case 6:
                return v1Var.f12974u;
            case 7:
                return v1Var.f12968o;
            case 8:
                return v1Var.f12977x;
            case 9:
                return v1Var.f12979z;
            case 10:
                return v1Var.f12955b;
            case 11:
                return v1Var.f12957d;
            case 12:
                return v1Var.f12960g;
            case 13:
                return v1Var.f12962i;
            case 14:
                return v1Var.f12970q;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return v1Var.f12972s;
            case 16:
                return v1Var.f12973t;
            case 17:
                return v1Var.f12964k;
            case 18:
                return v1Var.f12966m;
            case 19:
                return v1Var.f12928A;
            case 20:
                return v1Var.f12929B;
            case 21:
                return v1Var.f12954a;
            case 22:
                return v1Var.f12956c;
            case 23:
                return v1Var.f12930C;
            case 24:
                return v1Var.f12959f;
            case 25:
                return v1Var.f12961h;
            case 26:
                return v1Var.f12969p;
            case 27:
                return v1Var.f12971r;
            case 28:
                return v1Var.f12931D;
            case 29:
                return v1Var.f12933F;
            case 30:
                return v1Var.f12934G;
            case BERTags.DATE /* 31 */:
                return v1Var.f12935H;
            case 32:
                return v1Var.f12936I;
            case BERTags.DATE_TIME /* 33 */:
                return v1Var.f12937J;
            case BERTags.DURATION /* 34 */:
                return v1Var.f12932E;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return v1Var.f12963j;
            case BERTags.RELATIVE_OID_IRI /* 36 */:
                return v1Var.f12965l;
            default:
                int i10 = C1565s.f7818k;
                return C1565s.f7817j;
        }
    }

    /* renamed from: d */
    public static final long m6345d(EnumC3525e enumC3525e, InterfaceC3962k interfaceC3962k) {
        return m6344c((v1) ((C3966o) interfaceC3962k).m8618k(f13286a), enumC3525e);
    }

    /* renamed from: e */
    public static v1 m6346e(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i10, int i11) {
        long j35 = (i10 & 1) != 0 ? AbstractC3524d.f18530t : j6;
        return new v1(j35, (i10 & 2) != 0 ? AbstractC3524d.f18520j : j10, (i10 & 4) != 0 ? AbstractC3524d.f18531u : j11, (i10 & 8) != 0 ? AbstractC3524d.f18521k : j12, AbstractC3524d.f18515e, (i10 & 32) != 0 ? AbstractC3524d.f18533w : j13, (i10 & 64) != 0 ? AbstractC3524d.f18522l : j14, (i10 & 128) != 0 ? AbstractC3524d.f18534x : j15, (i10 & 256) != 0 ? AbstractC3524d.f18523m : j16, (i10 & 512) != 0 ? AbstractC3524d.f18509H : j17, (i10 & 1024) != 0 ? AbstractC3524d.f18526p : j18, (i10 & NewHope.SENDB_BYTES) != 0 ? AbstractC3524d.f18510I : j19, (i10 & 4096) != 0 ? AbstractC3524d.f18527q : j20, (i10 & 8192) != 0 ? AbstractC3524d.f18511a : j21, (i10 & 16384) != 0 ? AbstractC3524d.f18517g : j22, (32768 & i10) != 0 ? AbstractC3524d.f18535y : j23, (65536 & i10) != 0 ? AbstractC3524d.f18524n : j24, (131072 & i10) != 0 ? AbstractC3524d.f18508G : j25, AbstractC3524d.f18525o, j35, AbstractC3524d.f18516f, AbstractC3524d.f18514d, (4194304 & i10) != 0 ? AbstractC3524d.f18512b : j26, (8388608 & i10) != 0 ? AbstractC3524d.f18518h : j27, (16777216 & i10) != 0 ? AbstractC3524d.f18513c : j28, (33554432 & i10) != 0 ? AbstractC3524d.f18519i : j29, (67108864 & i10) != 0 ? AbstractC3524d.f18528r : j30, (134217728 & i10) != 0 ? AbstractC3524d.f18529s : j31, AbstractC3524d.f18532v, AbstractC3524d.f18536z, AbstractC3524d.f18507F, AbstractC3524d.f18502A, (i10 & Integer.MIN_VALUE) != 0 ? AbstractC3524d.f18503B : j32, (i11 & 1) != 0 ? AbstractC3524d.f18504C : j33, (i11 & 2) != 0 ? AbstractC3524d.f18505D : j34, AbstractC3524d.f18506E);
    }
}
