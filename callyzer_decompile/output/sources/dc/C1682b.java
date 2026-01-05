package dc;

import nd.InterfaceC5016g;
import ta.C7083a;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dc.b */
/* loaded from: classes.dex */
public final class C1682b extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC5016g f8221a;

    /* renamed from: b */
    public Object[] f8222b;

    /* renamed from: c */
    public InterfaceC1681a f8223c;

    /* renamed from: d */
    public int f8224d;

    /* renamed from: e */
    public int f8225e;

    /* renamed from: f */
    public /* synthetic */ Object f8226f;

    /* renamed from: g */
    public final /* synthetic */ C7083a f8227g;

    /* renamed from: h */
    public int f8228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682b(C7083a c7083a, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f8227g = c7083a;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8226f = obj;
        this.f8228h |= Integer.MIN_VALUE;
        return C7083a.m13373j(this.f8227g, this);
    }
}
