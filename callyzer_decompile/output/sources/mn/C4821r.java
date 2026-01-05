package mn;

import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.r */
/* loaded from: classes3.dex */
public final class C4821r extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f24053a;

    /* renamed from: b */
    public /* synthetic */ Object f24054b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24055c;

    /* renamed from: d */
    public int f24056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4821r(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24055c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24054b = obj;
        this.f24056d |= Integer.MIN_VALUE;
        Object objM9766j = this.f24055c.m9766j(false, null, null, false, null, null, 0, this);
        return objM9766j == EnumC7794a.COROUTINE_SUSPENDED ? objM9766j : new C6364n(objM9766j);
    }
}
