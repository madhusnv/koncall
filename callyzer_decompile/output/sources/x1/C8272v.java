package x1;

import c3.C0847b;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import p005f.C2153b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.v */
/* loaded from: classes.dex */
public final class C8272v extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39700a;

    /* renamed from: b */
    public final /* synthetic */ b2.y0 f39701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8272v(b2.y0 y0Var, int i10) {
        super(1);
        this.f39700a = i10;
        this.f39701b = y0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f39700a) {
            case 0:
                return new C2153b(12, this.f39701b);
            default:
                long j6 = ((C0847b) obj).f5352a;
                this.f39701b.m1706p();
                return qw.a0.f30746a;
        }
    }
}
