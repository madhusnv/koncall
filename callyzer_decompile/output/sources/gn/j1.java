package gn;

import dy.InterfaceC1853a;
import java.util.ArrayList;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j1 extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f14590a;

    /* renamed from: b */
    public InterfaceC1853a f14591b;

    /* renamed from: c */
    public int f14592c;

    /* renamed from: d */
    public /* synthetic */ Object f14593d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14594e;

    /* renamed from: f */
    public int f14595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14594e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14593d = obj;
        this.f14595f |= Integer.MIN_VALUE;
        return this.f14594e.h0(null, this);
    }
}
