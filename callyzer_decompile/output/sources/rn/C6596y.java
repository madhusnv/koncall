package rn;

import java.util.Iterator;
import java.util.Map;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.y */
/* loaded from: classes3.dex */
public final class C6596y extends AbstractC8193c {

    /* renamed from: a */
    public boolean f31696a;

    /* renamed from: b */
    public Map f31697b;

    /* renamed from: c */
    public Iterator f31698c;

    /* renamed from: d */
    public int f31699d;

    /* renamed from: e */
    public /* synthetic */ Object f31700e;

    /* renamed from: f */
    public final /* synthetic */ h0 f31701f;

    /* renamed from: g */
    public int f31702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6596y(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31701f = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31700e = obj;
        this.f31702g |= Integer.MIN_VALUE;
        return this.f31701f.m12608I(false, this);
    }
}
