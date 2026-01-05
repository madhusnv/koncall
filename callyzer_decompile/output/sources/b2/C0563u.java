package b2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g2.rd;
import kotlin.jvm.internal.AbstractC4155m;
import t1.C6979d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.u */
/* loaded from: classes.dex */
public final class C0563u extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3836a;

    /* renamed from: b */
    public final /* synthetic */ int f3837b;

    /* renamed from: c */
    public final /* synthetic */ Object f3838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0563u(int i10, Object obj, int i11) {
        super(0);
        this.f3836a = i11;
        this.f3837b = i10;
        this.f3838c = obj;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3836a) {
            case 0:
                g4.l0 l0Var = (g4.l0) ((C0558p) this.f3838c).f3798e;
                return Integer.valueOf(l0Var.f13671b.m6471d(this.f3837b));
            case 1:
                ((InterfaceC2139c) this.f3838c).invoke(Integer.valueOf(this.f3837b));
                return qw.a0.f30746a;
            case 2:
                rd rdVar = (rd) this.f3838c;
                int iMo6212f = rdVar.mo6212f();
                int i10 = this.f3837b;
                if (i10 != iMo6212f) {
                    rdVar.mo6211e(i10);
                }
                return qw.a0.f30746a;
            default:
                return new C6979d(this.f3837b, DefinitionKt.NO_Float_VALUE, (InterfaceC2137a) this.f3838c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0563u(Object obj, int i10, int i11) {
        super(0);
        this.f3836a = i11;
        this.f3838c = obj;
        this.f3837b = i10;
    }
}
