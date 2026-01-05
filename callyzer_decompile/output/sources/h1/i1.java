package h1;

import c3.C0847b;
import c3.C0848c;
import c3.C0850e;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;
import org.bouncycastle.iana.AEADAlgorithm;
import s4.C6750f;
import s4.C6751g;
import s4.C6754j;
import s4.C6756l;
import u2.C7325v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final i1 f15463b;

    /* renamed from: c */
    public static final i1 f15464c;

    /* renamed from: d */
    public static final i1 f15465d;

    /* renamed from: e */
    public static final i1 f15466e;

    /* renamed from: f */
    public static final i1 f15467f;

    /* renamed from: g */
    public static final i1 f15468g;

    /* renamed from: h */
    public static final i1 f15469h;

    /* renamed from: j */
    public static final i1 f15470j;

    /* renamed from: k */
    public static final i1 f15471k;

    /* renamed from: l */
    public static final i1 f15472l;

    /* renamed from: m */
    public static final i1 f15473m;

    /* renamed from: n */
    public static final i1 f15474n;

    /* renamed from: p */
    public static final i1 f15475p;

    /* renamed from: q */
    public static final i1 f15476q;

    /* renamed from: r */
    public static final i1 f15477r;

    /* renamed from: s */
    public static final i1 f15478s;

    /* renamed from: t */
    public static final i1 f15479t;

    /* renamed from: v */
    public static final i1 f15480v;

    /* renamed from: w */
    public static final i1 f15481w;

    /* renamed from: x */
    public static final i1 f15482x;

    /* renamed from: y */
    public static final i1 f15483y;

    /* renamed from: a */
    public final /* synthetic */ int f15484a;

    static {
        int i10 = 1;
        f15463b = new i1(i10, 0);
        f15464c = new i1(i10, 1);
        f15465d = new i1(i10, 2);
        f15466e = new i1(i10, 3);
        f15467f = new i1(i10, 4);
        f15468g = new i1(i10, 5);
        f15469h = new i1(i10, 6);
        f15470j = new i1(i10, 7);
        f15471k = new i1(i10, 8);
        f15472l = new i1(i10, 9);
        f15473m = new i1(i10, 10);
        f15474n = new i1(i10, 11);
        f15475p = new i1(i10, 12);
        f15476q = new i1(i10, 13);
        f15477r = new i1(i10, 14);
        f15478s = new i1(i10, 15);
        f15479t = new i1(i10, 16);
        f15480v = new i1(i10, 17);
        f15481w = new i1(i10, 18);
        f15482x = new i1(i10, 19);
        f15483y = new i1(i10, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, int i11) {
        super(i10);
        this.f15484a = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qw.g] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15484a) {
            case 0:
                return qw.a0.f30746a;
            case 1:
                ((InterfaceC2137a) obj).invoke();
                return qw.a0.f30746a;
            case 2:
                x0 x0Var = (x0) obj;
                long j6 = x0Var.f15649f;
                ((C7325v) v1.f15630a.getValue()).m13721d(x0Var, f15465d, x0Var.f15650g);
                long j10 = x0Var.f15649f;
                if (j6 != j10) {
                    p0 p0Var = x0Var.f15657p;
                    if (p0Var != null) {
                        if (p0Var.f15527a > j10) {
                            x0Var.m6879T();
                        } else {
                            p0Var.f15533g = j10;
                            if (p0Var.f15528b == null) {
                                p0Var.f15534h = AbstractC2747a.m6748l((1.0d - p0Var.f15531e.mo6831a(0)) * x0Var.f15649f);
                            }
                        }
                    } else if (j10 != 0) {
                        x0Var.m6881V();
                    }
                }
                return qw.a0.f30746a;
            case 3:
                long j11 = ((C6751g) obj).f32202a;
                return new C2782m(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            case 4:
                C2782m c2782m = (C2782m) obj;
                return new C6751g((Float.floatToRawIntBits(c2782m.f15511a) << 32) | (Float.floatToRawIntBits(c2782m.f15512b) & 4294967295L));
            case 5:
                return new C2781l(((C6750f) obj).f32201a);
            case 6:
                return new C6750f(((C2781l) obj).f15504a);
            case 7:
                return new C2781l(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C2781l) obj).f15504a);
            case 9:
                long j12 = ((C6754j) obj).f32204a;
                return new C2782m((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 10:
                C2782m c2782m2 = (C2782m) obj;
                return new C6754j((Math.round(c2782m2.f15511a) << 32) | (Math.round(c2782m2.f15512b) & 4294967295L));
            case 11:
                long j13 = ((C6756l) obj).f32210a;
                return new C2782m((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case 12:
                C2782m c2782m3 = (C2782m) obj;
                int iRound = Math.round(c2782m3.f15511a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new C6756l(((Math.round(c2782m3.f15512b) >= 0 ? r7 : 0) & 4294967295L) | (iRound << 32));
            case 13:
                return new C2781l(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C2781l) obj).f15504a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                long j14 = ((C0847b) obj).f5352a;
                return new C2782m(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            case 16:
                C2782m c2782m4 = (C2782m) obj;
                return new C0847b((Float.floatToRawIntBits(c2782m4.f15511a) << 32) | (Float.floatToRawIntBits(c2782m4.f15512b) & 4294967295L));
            case 17:
                C0848c c0848c = (C0848c) obj;
                return new C2784o(c0848c.f5354a, c0848c.f5355b, c0848c.f5356c, c0848c.f5357d);
            case 18:
                C2784o c2784o = (C2784o) obj;
                return new C0848c(c2784o.f15521a, c2784o.f15522b, c2784o.f15523c, c2784o.f15524d);
            case 19:
                long j15 = ((C0850e) obj).f5366a;
                return new C2782m(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)));
            default:
                C2782m c2782m5 = (C2782m) obj;
                return new C0850e((Float.floatToRawIntBits(c2782m5.f15511a) << 32) | (Float.floatToRawIntBits(c2782m5.f15512b) & 4294967295L));
        }
    }
}
