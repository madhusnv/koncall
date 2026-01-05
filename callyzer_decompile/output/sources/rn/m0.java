package rn;

import java.util.ArrayList;
import mm.C4792c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 extends AbstractC8193c {

    /* renamed from: a */
    public C4792c f31587a;

    /* renamed from: b */
    public ArrayList f31588b;

    /* renamed from: c */
    public /* synthetic */ Object f31589c;

    /* renamed from: d */
    public final /* synthetic */ q0 f31590d;

    /* renamed from: e */
    public int f31591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31590d = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31589c = obj;
        this.f31591e |= Integer.MIN_VALUE;
        return this.f31590d.m12646o(null, this);
    }
}
