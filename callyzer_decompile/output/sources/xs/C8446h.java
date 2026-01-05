package xs;

import ws.C8176q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.h */
/* loaded from: classes3.dex */
public final class C8446h extends AbstractC8193c {

    /* renamed from: a */
    public C8176q f41198a;

    /* renamed from: b */
    public /* synthetic */ Object f41199b;

    /* renamed from: c */
    public final /* synthetic */ C8449k f41200c;

    /* renamed from: d */
    public int f41201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8446h(C8449k c8449k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41200c = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41199b = obj;
        this.f41201d |= Integer.MIN_VALUE;
        return this.f41200c.m15751g(null, this);
    }
}
