package g1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import s4.C6754j;
import s4.C6756l;
import u2.AbstractC7316m;
import u2.C7310g;
import u2.C7315l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11038a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f11039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f11038a = i10;
        this.f11039b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long j6;
        switch (this.f11038a) {
            case 0:
                return new C6754j((0 << 32) | (4294967295L & ((Number) this.f11039b.invoke(Integer.valueOf((int) (((C6756l) obj).f32210a & 4294967295L)))).intValue()));
            case 1:
                return new C6754j((0 << 32) | (4294967295L & ((Number) this.f11039b.invoke(Integer.valueOf((int) (((C6756l) obj).f32210a & 4294967295L)))).intValue()));
            default:
                C7315l c7315l = (C7315l) obj;
                synchronized (AbstractC7316m.f34890b) {
                    j6 = AbstractC7316m.f34892d;
                    AbstractC7316m.f34892d = 1 + j6;
                }
                return new C7310g(j6, c7315l, this.f11039b);
        }
    }
}
