package ud;

import dy.InterfaceC1853a;
import l4.C4367l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.i */
/* loaded from: classes.dex */
public final class C7405i extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC1853a f35189a;

    /* renamed from: b */
    public C4367l f35190b;

    /* renamed from: c */
    public int f35191c;

    /* renamed from: d */
    public /* synthetic */ Object f35192d;

    /* renamed from: e */
    public final /* synthetic */ C4367l f35193e;

    /* renamed from: f */
    public int f35194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7405i(C4367l c4367l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35193e = c4367l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35192d = obj;
        this.f35194f |= Integer.MIN_VALUE;
        return this.f35193e.m9139s(this);
    }
}
