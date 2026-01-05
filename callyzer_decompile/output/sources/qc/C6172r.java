package qc;

import java.util.Iterator;
import p020v.x0;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.r */
/* loaded from: classes.dex */
public final class C6172r extends AbstractC8193c {

    /* renamed from: a */
    public x0 f30072a;

    /* renamed from: b */
    public Iterator f30073b;

    /* renamed from: c */
    public C6166l f30074c;

    /* renamed from: d */
    public int f30075d;

    /* renamed from: e */
    public int f30076e;

    /* renamed from: f */
    public /* synthetic */ Object f30077f;

    /* renamed from: g */
    public final /* synthetic */ x0 f30078g;

    /* renamed from: h */
    public int f30079h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6172r(x0 x0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30078g = x0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30077f = obj;
        this.f30079h |= Integer.MIN_VALUE;
        Object objM14494y = this.f30078g.m14494y(null, this);
        return objM14494y == EnumC7794a.COROUTINE_SUSPENDED ? objM14494y : new C6364n(objM14494y);
    }
}
