package g2;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class sa extends AbstractC8193c {

    /* renamed from: a */
    public ta f12712a;

    /* renamed from: b */
    public ra f12713b;

    /* renamed from: c */
    public InterfaceC1853a f12714c;

    /* renamed from: d */
    public /* synthetic */ Object f12715d;

    /* renamed from: e */
    public final /* synthetic */ ta f12716e;

    /* renamed from: f */
    public int f12717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(ta taVar, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f12716e = taVar;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f12715d = obj;
        this.f12717f |= Integer.MIN_VALUE;
        return this.f12716e.m6313a(null, this);
    }
}
