package l1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.d */
/* loaded from: classes.dex */
public final class C4315d extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2139c f21750a;

    /* renamed from: b */
    public /* synthetic */ Object f21751b;

    /* renamed from: c */
    public final /* synthetic */ C4319h f21752c;

    /* renamed from: d */
    public int f21753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4315d(C4319h c4319h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21752c = c4319h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21751b = obj;
        this.f21753d |= Integer.MIN_VALUE;
        return this.f21752c.m9039c(null, DefinitionKt.NO_Float_VALUE, null, this);
    }
}
