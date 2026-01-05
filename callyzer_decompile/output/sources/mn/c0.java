package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f23952a;

    /* renamed from: b */
    public /* synthetic */ Object f23953b;

    /* renamed from: c */
    public final /* synthetic */ g0 f23954c;

    /* renamed from: d */
    public int f23955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f23954c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f23953b = obj;
        this.f23955d |= Integer.MIN_VALUE;
        Object objM9775s = this.f23954c.m9775s(null, null, false, false, false, false, null, 0, false, null, this);
        return objM9775s == EnumC7794a.COROUTINE_SUSPENDED ? objM9775s : new C6364n(objM9775s);
    }
}
