package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r7 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f12594a;

    /* renamed from: b */
    public final /* synthetic */ ja f12595b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f12596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(ja jaVar, InterfaceC2137a interfaceC2137a, int i10) {
        super(1);
        this.f12594a = i10;
        this.f12595b = jaVar;
        this.f12596c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f12594a) {
            case 0:
                if (!this.f12595b.m6181c()) {
                    this.f12596c.invoke();
                }
                break;
            default:
                if (!this.f12595b.m6181c()) {
                    this.f12596c.invoke();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
