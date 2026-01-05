package i9;

import ec.InterfaceC2004b;
import ia.C3220l;
import nd.InterfaceC5016g;
import w9.InterfaceC7964g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2004b f17251a;

    /* renamed from: b */
    public InterfaceC5016g f17252b;

    /* renamed from: c */
    public s0 f17253c;

    /* renamed from: d */
    public C3220l f17254d;

    /* renamed from: e */
    public String f17255e;

    /* renamed from: f */
    public InterfaceC7964g f17256f;

    /* renamed from: g */
    public /* synthetic */ Object f17257g;

    /* renamed from: h */
    public final /* synthetic */ s0 f17258h;

    /* renamed from: j */
    public int f17259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17258h = s0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17257g = obj;
        this.f17259j |= Integer.MIN_VALUE;
        return this.f17258h.resolve(null, this);
    }
}
