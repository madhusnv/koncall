package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.q */
/* loaded from: classes3.dex */
public final class C4820q extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24049a;

    /* renamed from: b */
    public /* synthetic */ Object f24050b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24051c;

    /* renamed from: d */
    public int f24052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4820q(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24051c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24050b = obj;
        this.f24052d |= Integer.MIN_VALUE;
        Object objM9765i = this.f24051c.m9765i(null, null, 0, 0, this);
        return objM9765i == EnumC7794a.COROUTINE_SUSPENDED ? objM9765i : new C6364n(objM9765i);
    }
}
