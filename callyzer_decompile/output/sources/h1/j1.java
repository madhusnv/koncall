package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.C7315l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15487a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4155m f15488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(int i10, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f15487a = i10;
        switch (i10) {
            case 1:
                this.f15488b = (AbstractC4155m) interfaceC2139c;
                super(1);
                break;
            case 2:
                this.f15488b = (AbstractC4155m) interfaceC2139c;
                super(1);
                break;
            default:
                this.f15488b = (AbstractC4155m) interfaceC2139c;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15487a) {
            case 0:
                return this.f15488b.invoke(Long.valueOf(((Number) obj).longValue()));
            case 1:
                return this.f15488b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                AbstractC7311h abstractC7311h = (AbstractC7311h) this.f15488b.invoke((C7315l) obj);
                synchronized (AbstractC7316m.f34890b) {
                    AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(abstractC7311h.mo13652g());
                }
                return abstractC7311h;
        }
    }
}
