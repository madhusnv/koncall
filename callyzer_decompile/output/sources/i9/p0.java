package i9;

import nd.InterfaceC5016g;
import w9.InterfaceC7964g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC5016g f17231a;

    /* renamed from: b */
    public q0 f17232b;

    /* renamed from: c */
    public InterfaceC7964g f17233c;

    /* renamed from: d */
    public /* synthetic */ Object f17234d;

    /* renamed from: e */
    public final /* synthetic */ q0 f17235e;

    /* renamed from: f */
    public int f17236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17235e = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17234d = obj;
        this.f17236f |= Integer.MIN_VALUE;
        return this.f17235e.resolve(null, this);
    }
}
