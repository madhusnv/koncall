package ta;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ta.e */
/* loaded from: classes.dex */
public final class C7087e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34193a;

    /* renamed from: b */
    public final /* synthetic */ C7084b f34194b;

    /* renamed from: c */
    public int f34195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7087e(C7084b c7084b, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34194b = c7084b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34193a = obj;
        this.f34195c |= Integer.MIN_VALUE;
        return this.f34194b.mo5383h(this);
    }
}
