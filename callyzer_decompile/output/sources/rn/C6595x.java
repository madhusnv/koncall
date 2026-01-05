package rn;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.x */
/* loaded from: classes3.dex */
public final class C6595x extends AbstractC8193c {

    /* renamed from: a */
    public boolean f31691a;

    /* renamed from: b */
    public List f31692b;

    /* renamed from: c */
    public /* synthetic */ Object f31693c;

    /* renamed from: d */
    public final /* synthetic */ h0 f31694d;

    /* renamed from: e */
    public int f31695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6595x(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31694d = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31693c = obj;
        this.f31695e |= Integer.MIN_VALUE;
        return this.f31694d.m12607H(false, this);
    }
}
