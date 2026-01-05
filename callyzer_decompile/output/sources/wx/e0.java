package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class e0 extends AbstractC8193c {

    /* renamed from: a */
    public f0 f39211a;

    /* renamed from: b */
    public /* synthetic */ Object f39212b;

    /* renamed from: c */
    public int f39213c;

    /* renamed from: d */
    public final /* synthetic */ f0 f39214d;

    /* renamed from: e */
    public Object f39215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39214d = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39212b = obj;
        this.f39213c |= Integer.MIN_VALUE;
        return this.f39214d.emit(null, this);
    }
}
