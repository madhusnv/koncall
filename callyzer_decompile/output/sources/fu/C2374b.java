package fu;

import ww.AbstractC8193c;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fu.b */
/* loaded from: classes3.dex */
public final class C2374b extends AbstractC8193c {

    /* renamed from: a */
    public C9000c f10804a;

    /* renamed from: b */
    public /* synthetic */ Object f10805b;

    /* renamed from: c */
    public final /* synthetic */ C2375c f10806c;

    /* renamed from: d */
    public int f10807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374b(C2375c c2375c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10806c = c2375c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10805b = obj;
        this.f10807d |= Integer.MIN_VALUE;
        return C2375c.m6059e(this.f10806c, this);
    }
}
