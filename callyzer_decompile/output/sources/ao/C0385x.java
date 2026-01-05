package ao;

import java.util.ArrayList;
import java.util.Map;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.x */
/* loaded from: classes3.dex */
public final class C0385x extends AbstractC8193c {

    /* renamed from: a */
    public Map f3056a;

    /* renamed from: b */
    public ArrayList f3057b;

    /* renamed from: c */
    public /* synthetic */ Object f3058c;

    /* renamed from: d */
    public final /* synthetic */ c0 f3059d;

    /* renamed from: e */
    public int f3060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385x(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3059d = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3058c = obj;
        this.f3060e |= Integer.MIN_VALUE;
        return this.f3059d.m1406u(null, this);
    }
}
