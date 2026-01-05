package g1;

import ex.InterfaceC2139c;
import h1.s1;
import h1.u1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f10945a;

    /* renamed from: b */
    public final /* synthetic */ s1 f10946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(s1 s1Var, int i10) {
        super(1);
        this.f10945a = i10;
        this.f10946b = s1Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f10945a) {
            case 0:
                return Boolean.valueOf(!AbstractC4154l.m8918a(obj, this.f10946b.f15591d.getValue()));
            case 1:
                return new u1(this.f10946b, 0);
            default:
                return new u1(this.f10946b, 1);
        }
    }
}
