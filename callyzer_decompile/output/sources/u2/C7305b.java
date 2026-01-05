package u2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.b */
/* loaded from: classes.dex */
public final class C7305b extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f34840a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f34841b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f34842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7305b(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, int i10) {
        super(1);
        this.f34840a = i10;
        this.f34841b = interfaceC2139c;
        this.f34842c = interfaceC2139c2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long j6;
        switch (this.f34840a) {
            case 0:
                C7315l c7315l = (C7315l) obj;
                synchronized (AbstractC7316m.f34890b) {
                    j6 = AbstractC7316m.f34892d;
                    AbstractC7316m.f34892d = 1 + j6;
                }
                return new C7307d(j6, c7315l, this.f34841b, this.f34842c);
            case 1:
                this.f34841b.invoke(obj);
                this.f34842c.invoke(obj);
                return qw.a0.f30746a;
            default:
                this.f34841b.invoke(obj);
                this.f34842c.invoke(obj);
                return qw.a0.f30746a;
        }
    }
}
