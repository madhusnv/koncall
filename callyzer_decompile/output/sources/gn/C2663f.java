package gn;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gn.f */
/* loaded from: classes3.dex */
public final class C2663f extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC1853a f14483a;

    /* renamed from: b */
    public int f14484b;

    /* renamed from: c */
    public /* synthetic */ Object f14485c;

    /* renamed from: d */
    public final /* synthetic */ x2 f14486d;

    /* renamed from: e */
    public int f14487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2663f(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14486d = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14485c = obj;
        this.f14487e |= Integer.MIN_VALUE;
        return this.f14486d.m6685e(this);
    }
}
