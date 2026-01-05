package wp;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wp.e */
/* loaded from: classes3.dex */
public final class C8139e extends AbstractC8193c {

    /* renamed from: a */
    public List f38976a;

    /* renamed from: b */
    public /* synthetic */ Object f38977b;

    /* renamed from: c */
    public final /* synthetic */ C8141g f38978c;

    /* renamed from: d */
    public int f38979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8139e(C8141g c8141g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38978c = c8141g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38977b = obj;
        this.f38979d |= Integer.MIN_VALUE;
        return C8141g.m15318h(this.f38978c, this);
    }
}
