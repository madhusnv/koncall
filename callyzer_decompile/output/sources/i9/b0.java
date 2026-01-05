package i9;

import ec.InterfaceC2004b;
import k9.InterfaceC4034h;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2004b f17124a;

    /* renamed from: b */
    public d0 f17125b;

    /* renamed from: c */
    public InterfaceC4034h f17126c;

    /* renamed from: d */
    public /* synthetic */ Object f17127d;

    /* renamed from: e */
    public final /* synthetic */ c0 f17128e;

    /* renamed from: f */
    public int f17129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17128e = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17127d = obj;
        this.f17129f |= Integer.MIN_VALUE;
        return this.f17128e.resolve(null, this);
    }
}
