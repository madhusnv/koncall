package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.m */
/* loaded from: classes3.dex */
public final class C4816m extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24034a;

    /* renamed from: b */
    public /* synthetic */ Object f24035b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24036c;

    /* renamed from: d */
    public int f24037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4816m(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24036c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24035b = obj;
        this.f24037d |= Integer.MIN_VALUE;
        Object objM9760d = this.f24036c.m9760d(null, false, null, null, false, null, null, false, 0, this);
        return objM9760d == EnumC7794a.COROUTINE_SUSPENDED ? objM9760d : new C6364n(objM9760d);
    }
}
