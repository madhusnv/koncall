package fo;

import a9.C0073l;
import java.util.ArrayList;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.b */
/* loaded from: classes3.dex */
public final class C2338b extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f10590a;

    /* renamed from: b */
    public /* synthetic */ Object f10591b;

    /* renamed from: c */
    public final /* synthetic */ C0073l f10592c;

    /* renamed from: d */
    public int f10593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2338b(C0073l c0073l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10592c = c0073l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10591b = obj;
        this.f10593d |= Integer.MIN_VALUE;
        return this.f10592c.m229v(this);
    }
}
