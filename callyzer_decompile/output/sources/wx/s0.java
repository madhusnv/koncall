package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class s0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39319a;

    /* renamed from: b */
    public int f39320b;

    /* renamed from: c */
    public final /* synthetic */ f0 f39321c;

    /* renamed from: d */
    public Object f39322d;

    /* renamed from: e */
    public InterfaceC8210k f39323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(f0 f0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39321c = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39319a = obj;
        this.f39320b |= Integer.MIN_VALUE;
        return this.f39321c.emit(null, this);
    }
}
