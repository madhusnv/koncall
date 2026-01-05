package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.k */
/* loaded from: classes3.dex */
public final class C4814k extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24026a;

    /* renamed from: b */
    public /* synthetic */ Object f24027b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24028c;

    /* renamed from: d */
    public int f24029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4814k(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24028c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24027b = obj;
        this.f24029d |= Integer.MIN_VALUE;
        Object objM9758b = this.f24028c.m9758b(null, false, null, null, false, null, null, false, this);
        return objM9758b == EnumC7794a.COROUTINE_SUSPENDED ? objM9758b : new C6364n(objM9758b);
    }
}
