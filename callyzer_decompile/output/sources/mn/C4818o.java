package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.o */
/* loaded from: classes3.dex */
public final class C4818o extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24042a;

    /* renamed from: b */
    public /* synthetic */ Object f24043b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24044c;

    /* renamed from: d */
    public int f24045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4818o(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24044c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24043b = obj;
        this.f24045d |= Integer.MIN_VALUE;
        Object objM9763g = this.f24044c.m9763g(null, null, 0, 0, this);
        return objM9763g == EnumC7794a.COROUTINE_SUSPENDED ? objM9763g : new C6364n(objM9763g);
    }
}
