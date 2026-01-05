package fv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.g */
/* loaded from: classes3.dex */
public final class C2382g extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f10833a;

    /* renamed from: b */
    public final /* synthetic */ C2386k f10834b;

    /* renamed from: c */
    public int f10835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2382g(C2386k c2386k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10834b = c2386k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10833a = obj;
        this.f10835c |= Integer.MIN_VALUE;
        return C2386k.m6061f(this.f10834b, this);
    }
}
