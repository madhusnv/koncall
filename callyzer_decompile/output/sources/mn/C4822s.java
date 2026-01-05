package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.s */
/* loaded from: classes3.dex */
public final class C4822s extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24057a;

    /* renamed from: b */
    public /* synthetic */ Object f24058b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24059c;

    /* renamed from: d */
    public int f24060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4822s(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24059c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24058b = obj;
        this.f24060d |= Integer.MIN_VALUE;
        Object objM9767k = this.f24059c.m9767k(null, false, null, null, false, null, null, false, 0, this);
        return objM9767k == EnumC7794a.COROUTINE_SUSPENDED ? objM9767k : new C6364n(objM9767k);
    }
}
