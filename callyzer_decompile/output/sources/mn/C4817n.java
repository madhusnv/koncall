package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.n */
/* loaded from: classes3.dex */
public final class C4817n extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24038a;

    /* renamed from: b */
    public /* synthetic */ Object f24039b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24040c;

    /* renamed from: d */
    public int f24041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4817n(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24040c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24039b = obj;
        this.f24041d |= Integer.MIN_VALUE;
        Object objM9762f = this.f24040c.m9762f(null, null, null, false, false, false, false, null, 0, false, null, this);
        return objM9762f == EnumC7794a.COROUTINE_SUSPENDED ? objM9762f : new C6364n(objM9762f);
    }
}
