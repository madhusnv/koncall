package qc;

import java.util.Iterator;
import p020v.x0;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.q */
/* loaded from: classes.dex */
public final class C6171q extends AbstractC8193c {

    /* renamed from: a */
    public x0 f30064a;

    /* renamed from: b */
    public Iterator f30065b;

    /* renamed from: c */
    public C6165k f30066c;

    /* renamed from: d */
    public int f30067d;

    /* renamed from: e */
    public int f30068e;

    /* renamed from: f */
    public /* synthetic */ Object f30069f;

    /* renamed from: g */
    public final /* synthetic */ x0 f30070g;

    /* renamed from: h */
    public int f30071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6171q(x0 x0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30070g = x0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30069f = obj;
        this.f30071h |= Integer.MIN_VALUE;
        Object objM14493x = this.f30070g.m14493x(null, null, null, this);
        return objM14493x == EnumC7794a.COROUTINE_SUSPENDED ? objM14493x : new C6364n(objM14493x);
    }
}
