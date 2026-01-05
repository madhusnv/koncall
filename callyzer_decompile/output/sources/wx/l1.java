package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l1 extends AbstractC8193c {

    /* renamed from: a */
    public m1 f39257a;

    /* renamed from: b */
    public InterfaceC8210k f39258b;

    /* renamed from: c */
    public n1 f39259c;

    /* renamed from: d */
    public tx.e1 f39260d;

    /* renamed from: e */
    public Object f39261e;

    /* renamed from: f */
    public /* synthetic */ Object f39262f;

    /* renamed from: g */
    public final /* synthetic */ m1 f39263g;

    /* renamed from: h */
    public int f39264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39263g = m1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39262f = obj;
        this.f39264h |= Integer.MIN_VALUE;
        return this.f39263g.collect(null, this);
    }
}
