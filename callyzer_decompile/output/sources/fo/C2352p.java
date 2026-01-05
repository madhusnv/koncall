package fo;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.p */
/* loaded from: classes3.dex */
public final class C2352p extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f10681a;

    /* renamed from: b */
    public final /* synthetic */ C8090p f10682b;

    /* renamed from: c */
    public int f10683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2352p(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10682b = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10681a = obj;
        this.f10683c |= Integer.MIN_VALUE;
        return this.f10682b.m15260p(null, this);
    }
}
