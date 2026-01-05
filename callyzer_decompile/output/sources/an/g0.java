package an;

import nm.C5107b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 extends AbstractC8193c {

    /* renamed from: a */
    public h3 f839a;

    /* renamed from: b */
    public C5107b f840b;

    /* renamed from: c */
    public /* synthetic */ Object f841c;

    /* renamed from: d */
    public final /* synthetic */ h3 f842d;

    /* renamed from: e */
    public int f843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h3 h3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f842d = h3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f841c = obj;
        this.f843e |= Integer.MIN_VALUE;
        return h3.m474v(this.f842d, null, this);
    }
}
