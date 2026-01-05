package g1;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import e3.C1928d;
import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.C2782m;
import h1.C2784o;
import kotlin.jvm.internal.AbstractC4155m;
import org.bouncycastle.iana.AEADAlgorithm;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.c */
/* loaded from: classes.dex */
public final class C2423c extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C2423c f10930b;

    /* renamed from: c */
    public static final C2423c f10931c;

    /* renamed from: d */
    public static final C2423c f10932d;

    /* renamed from: e */
    public static final C2423c f10933e;

    /* renamed from: f */
    public static final C2423c f10934f;

    /* renamed from: g */
    public static final C2423c f10935g;

    /* renamed from: h */
    public static final C2423c f10936h;

    /* renamed from: j */
    public static final C2423c f10937j;

    /* renamed from: k */
    public static final C2423c f10938k;

    /* renamed from: l */
    public static final C2423c f10939l;

    /* renamed from: m */
    public static final C2423c f10940m;

    /* renamed from: n */
    public static final C2423c f10941n;

    /* renamed from: p */
    public static final C2423c f10942p;

    /* renamed from: q */
    public static final C2423c f10943q;

    /* renamed from: a */
    public final /* synthetic */ int f10944a;

    static {
        int i10 = 1;
        f10930b = new C2423c(i10, 0);
        f10931c = new C2423c(i10, 1);
        f10932d = new C2423c(i10, 2);
        f10933e = new C2423c(i10, 3);
        f10934f = new C2423c(i10, 4);
        f10935g = new C2423c(i10, 5);
        f10936h = new C2423c(i10, 6);
        f10937j = new C2423c(i10, 7);
        f10938k = new C2423c(i10, 8);
        f10939l = new C2423c(i10, 9);
        f10940m = new C2423c(i10, 10);
        f10941n = new C2423c(i10, 11);
        f10942p = new C2423c(i10, 12);
        f10943q = new C2423c(i10, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2423c(int i10, int i11) {
        super(i10);
        this.f10944a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f10944a) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 4:
                long jM5185a = C1565s.m5185a(((C1565s) obj).f7819a, C1928d.f9126x);
                return new C2784o(C1565s.m5188d(jM5185a), C1565s.m5192h(jM5185a), C1565s.m5191g(jM5185a), C1565s.m5189e(jM5185a));
            case 5:
                return obj;
            case 6:
                long j6 = ((d3.p0) obj).f7807a;
                return new C2782m(d3.p0.m5181b(j6), d3.p0.m5182c(j6));
            case 7:
                C2782m c2782m = (C2782m) obj;
                return new d3.p0(d3.h0.m5136h(c2782m.f15511a, c2782m.f15512b));
            case 8:
                return AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
            case 9:
                long j10 = ((C6756l) obj).f32210a;
                long j11 = 0;
                return new C6756l((j11 & 4294967295L) | (j11 << 32));
            case 10:
                long j12 = ((C6756l) obj).f32210a;
                long j13 = 0;
                return new C6756l((j13 & 4294967295L) | (j13 << 32));
            case 11:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 12:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 13:
                return o0.f11045c;
            case 14:
                return new C6756l((0 << 32) | (4294967295L & ((int) (((C6756l) obj).f32210a & 4294967295L))));
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C6756l((((int) (((C6756l) obj).f32210a >> 32)) << 32) | (0 & 4294967295L));
            case 16:
                return new C6756l((0 << 32) | (4294967295L & ((int) (((C6756l) obj).f32210a & 4294967295L))));
            default:
                return new C6756l((((int) (((C6756l) obj).f32210a >> 32)) << 32) | (0 & 4294967295L));
        }
    }
}
