package vx;

import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.f */
/* loaded from: classes3.dex */
public final class C7804f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f37478a;

    /* renamed from: b */
    public final /* synthetic */ C7806h f37479b;

    /* renamed from: c */
    public int f37480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7804f(C7806h c7806h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37479b = c7806h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37478a = obj;
        this.f37480c |= Integer.MIN_VALUE;
        Object objM14754F = C7806h.m14754F(this.f37479b, this);
        return objM14754F == EnumC7794a.COROUTINE_SUSPENDED ? objM14754F : new C7813o(objM14754F);
    }
}
