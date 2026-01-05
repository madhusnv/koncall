package vn;

import a9.C0073l;
import java.util.Iterator;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vn.a */
/* loaded from: classes3.dex */
public final class C7726a extends AbstractC8193c {

    /* renamed from: a */
    public Iterator f37269a;

    /* renamed from: b */
    public int f37270b;

    /* renamed from: c */
    public /* synthetic */ Object f37271c;

    /* renamed from: d */
    public final /* synthetic */ C0073l f37272d;

    /* renamed from: e */
    public int f37273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7726a(C0073l c0073l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37272d = c0073l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37271c = obj;
        this.f37273e |= Integer.MIN_VALUE;
        return this.f37272d.m205O(this);
    }
}
