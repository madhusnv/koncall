package gs;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.i */
/* loaded from: classes3.dex */
public final class C2723i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f15190a;

    /* renamed from: b */
    public final /* synthetic */ C2724j f15191b;

    /* renamed from: c */
    public int f15192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2723i(C2724j c2724j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15191b = c2724j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15190a = obj;
        this.f15192c |= Integer.MIN_VALUE;
        return C2724j.m6725e(this.f15191b, this);
    }
}
