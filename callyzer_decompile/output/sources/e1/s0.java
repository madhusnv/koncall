package e1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import u2.AbstractC7329z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f9053a;

    /* renamed from: b */
    public final /* synthetic */ k0 f9054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(k0 k0Var, int i10) {
        super(1);
        this.f9053a = i10;
        this.f9054b = k0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f9053a) {
            case 0:
                return obj == this.f9054b ? "(this)" : String.valueOf(obj);
            default:
                if (obj instanceof AbstractC7329z) {
                    ((AbstractC7329z) obj).m13725e(4);
                }
                this.f9054b.m5581a(obj);
                return qw.a0.f30746a;
        }
    }
}
