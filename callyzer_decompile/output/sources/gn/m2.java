package gn;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m2 extends AbstractC8193c {

    /* renamed from: a */
    public String f14679a;

    /* renamed from: b */
    public InterfaceC1853a f14680b;

    /* renamed from: c */
    public boolean f14681c;

    /* renamed from: d */
    public int f14682d;

    /* renamed from: e */
    public /* synthetic */ Object f14683e;

    /* renamed from: f */
    public final /* synthetic */ x2 f14684f;

    /* renamed from: g */
    public int f14685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14684f = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14683e = obj;
        this.f14685g |= Integer.MIN_VALUE;
        return this.f14684f.M0(null, false, this);
    }
}
