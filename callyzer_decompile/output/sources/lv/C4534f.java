package lv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lv.f */
/* loaded from: classes3.dex */
public final class C4534f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f22534a;

    /* renamed from: b */
    public final /* synthetic */ C4535g f22535b;

    /* renamed from: c */
    public int f22536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4534f(C4535g c4535g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22535b = c4535g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22534a = obj;
        this.f22536c |= Integer.MIN_VALUE;
        return this.f22535b.m9389g(this);
    }
}
