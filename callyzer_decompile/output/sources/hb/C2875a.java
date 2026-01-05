package hb;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hb.a */
/* loaded from: classes.dex */
public final class C2875a extends AbstractC8193c {

    /* renamed from: a */
    public List f15896a;

    /* renamed from: b */
    public /* synthetic */ Object f15897b;

    /* renamed from: c */
    public final /* synthetic */ C2876b f15898c;

    /* renamed from: d */
    public int f15899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2875a(C2876b c2876b, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15898c = c2876b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15897b = obj;
        this.f15899d |= Integer.MIN_VALUE;
        return this.f15898c.m6993a(null, this);
    }
}
