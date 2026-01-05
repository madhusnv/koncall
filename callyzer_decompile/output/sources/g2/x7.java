package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x7 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f13227a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f13228b;

    /* renamed from: c */
    public final /* synthetic */ Object f13229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(long j6, k2.h2 h2Var) {
        super(1);
        this.f13228b = j6;
        this.f13229c = h2Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f13227a) {
            case 0:
                InterfaceC2198d.o0((InterfaceC2198d) obj, this.f13228b, 0L, 0L, pg.w9.m11911b(((Number) ((k2.h2) this.f13229c).getValue()).floatValue(), DefinitionKt.NO_Float_VALUE, 1.0f), null, 118);
                break;
            default:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                x1.v0 v0Var = (x1.v0) this.f13229c;
                if (((Boolean) v0Var.f39721s.getValue()).booleanValue() || ((Boolean) v0Var.f39722t.getValue()).booleanValue()) {
                    InterfaceC2198d.o0(interfaceC2198d, this.f13228b, 0L, 0L, DefinitionKt.NO_Float_VALUE, null, 126);
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(x1.v0 v0Var, long j6) {
        super(1);
        this.f13229c = v0Var;
        this.f13228b = j6;
    }
}
