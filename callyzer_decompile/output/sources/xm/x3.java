package xm;

import java.util.ArrayList;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x3 extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f41009a;

    /* renamed from: b */
    public List f41010b;

    /* renamed from: c */
    public /* synthetic */ Object f41011c;

    /* renamed from: d */
    public final /* synthetic */ b0 f41012d;

    /* renamed from: e */
    public int f41013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(b0 b0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41012d = b0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41011c = obj;
        this.f41013e |= Integer.MIN_VALUE;
        return this.f41012d.m15570p(null, this);
    }
}
