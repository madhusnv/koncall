package i9;

import nd.InterfaceC5016g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.f */
/* loaded from: classes.dex */
public final class C3188f extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC5016g f17158a;

    /* renamed from: b */
    public String f17159b;

    /* renamed from: c */
    public /* synthetic */ Object f17160c;

    /* renamed from: d */
    public final /* synthetic */ C3190h f17161d;

    /* renamed from: e */
    public int f17162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3188f(C3190h c3190h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17161d = c3190h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17160c = obj;
        this.f17162e |= Integer.MIN_VALUE;
        return this.f17161d.resolve(null, this);
    }
}
