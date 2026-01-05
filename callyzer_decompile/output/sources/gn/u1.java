package gn;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u1 extends AbstractC8193c {

    /* renamed from: a */
    public String f14855a;

    /* renamed from: b */
    public List f14856b;

    /* renamed from: c */
    public /* synthetic */ Object f14857c;

    /* renamed from: d */
    public final /* synthetic */ x2 f14858d;

    /* renamed from: e */
    public int f14859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14858d = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14857c = obj;
        this.f14859e |= Integer.MIN_VALUE;
        return this.f14858d.s0(null, null, this);
    }
}
