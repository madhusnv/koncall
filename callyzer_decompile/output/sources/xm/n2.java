package xm;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n2 extends AbstractC8193c {

    /* renamed from: a */
    public s2 f40617a;

    /* renamed from: b */
    public /* synthetic */ Object f40618b;

    /* renamed from: c */
    public final /* synthetic */ s2 f40619c;

    /* renamed from: d */
    public int f40620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(s2 s2Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40619c = s2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40618b = obj;
        this.f40620d |= Integer.MIN_VALUE;
        return this.f40619c.m15619b(this);
    }
}
