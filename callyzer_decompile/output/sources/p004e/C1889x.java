package p004e;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.x */
/* loaded from: classes.dex */
public final class C1889x extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8906a;

    /* renamed from: b */
    public final /* synthetic */ c0 f8907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1889x(c0 c0Var, int i10) {
        super(0);
        this.f8906a = i10;
        this.f8907b = c0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f8906a) {
            case 0:
                this.f8907b.m5502c();
                break;
            case 1:
                this.f8907b.m5501b();
                break;
            default:
                this.f8907b.m5502c();
                break;
        }
        return a0.f30746a;
    }
}
