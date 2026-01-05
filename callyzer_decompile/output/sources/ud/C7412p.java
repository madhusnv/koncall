package ud;

import b2.C0554l;
import tx.InterfaceC7256p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.p */
/* loaded from: classes.dex */
public final class C7412p extends AbstractC8193c {

    /* renamed from: a */
    public Object f35201a;

    /* renamed from: b */
    public InterfaceC7256p f35202b;

    /* renamed from: c */
    public Object f35203c;

    /* renamed from: d */
    public /* synthetic */ Object f35204d;

    /* renamed from: e */
    public final /* synthetic */ C0554l f35205e;

    /* renamed from: f */
    public int f35206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7412p(C0554l c0554l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35205e = c0554l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35204d = obj;
        this.f35206f |= Integer.MIN_VALUE;
        return this.f35205e.m1643m(null, this);
    }
}
