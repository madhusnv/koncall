package tb;

import tc.InterfaceC7116a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.v */
/* loaded from: classes.dex */
public final class C7111v extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC7116a f34299a;

    /* renamed from: b */
    public C7096g f34300b;

    /* renamed from: c */
    public /* synthetic */ Object f34301c;

    /* renamed from: d */
    public final /* synthetic */ l4.d0 f34302d;

    /* renamed from: e */
    public int f34303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7111v(l4.d0 d0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34302d = d0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34301c = obj;
        this.f34303e |= Integer.MIN_VALUE;
        return this.f34302d.m9086p(null, null, this);
    }
}
