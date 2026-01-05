package g1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import kotlin.jvm.internal.AbstractC4155m;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.j */
/* loaded from: classes.dex */
public final class C2430j extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C2430j f11022b;

    /* renamed from: c */
    public static final C2430j f11023c;

    /* renamed from: a */
    public final /* synthetic */ int f11024a;

    static {
        int i10 = 2;
        f11022b = new C2430j(i10, 0);
        f11023c = new C2430j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2430j(int i10, int i11) {
        super(i10);
        this.f11024a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11024a) {
            case 0:
                long j6 = ((C6756l) obj).f32210a;
                long j10 = ((C6756l) obj2).f32210a;
                long j11 = 1;
                return AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, new C6756l((j11 & 4294967295L) | (j11 << 32)), 1);
            default:
                f0 f0Var = (f0) obj2;
                return Boolean.valueOf(((f0) obj) == f0Var && f0Var == f0.PostExit);
        }
    }
}
