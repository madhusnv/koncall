package dd;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.p */
/* loaded from: classes.dex */
public final class C1698p extends AbstractC8193c {

    /* renamed from: a */
    public int f8292a;

    /* renamed from: b */
    public InterfaceC1853a f8293b;

    /* renamed from: c */
    public /* synthetic */ Object f8294c;

    /* renamed from: d */
    public final /* synthetic */ C1700r f8295d;

    /* renamed from: e */
    public int f8296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698p(C1700r c1700r, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8295d = c1700r;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8294c = obj;
        this.f8296e |= Integer.MIN_VALUE;
        return this.f8295d.m5393c(0, this);
    }
}
