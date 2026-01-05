package ko;

import java.util.Iterator;
import p020v.x0;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ko.i */
/* loaded from: classes3.dex */
public final class C4141i extends AbstractC8193c {

    /* renamed from: a */
    public Iterator f21132a;

    /* renamed from: b */
    public int f21133b;

    /* renamed from: c */
    public /* synthetic */ Object f21134c;

    /* renamed from: d */
    public final /* synthetic */ x0 f21135d;

    /* renamed from: e */
    public int f21136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4141i(x0 x0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21135d = x0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21134c = obj;
        this.f21136e |= Integer.MIN_VALUE;
        return this.f21135d.m14474I(null, this);
    }
}
