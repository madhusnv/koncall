package vx;

import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.g */
/* loaded from: classes3.dex */
public final class C7805g extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f37481a;

    /* renamed from: b */
    public final /* synthetic */ C7806h f37482b;

    /* renamed from: c */
    public int f37483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7805g(C7806h c7806h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37482b = c7806h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37481a = obj;
        this.f37483c |= Integer.MIN_VALUE;
        Object objM14764G = this.f37482b.m14764G(null, 0, 0L, this);
        return objM14764G == EnumC7794a.COROUTINE_SUSPENDED ? objM14764G : new C7813o(objM14764G);
    }
}
