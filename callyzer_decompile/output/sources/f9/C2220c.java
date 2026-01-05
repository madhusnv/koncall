package f9;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import t8.AbstractC7076v;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f9.c */
/* loaded from: classes.dex */
public final class C2220c extends AbstractC8193c {

    /* renamed from: a */
    public ConstraintTrackingWorker f10198a;

    /* renamed from: b */
    public AbstractC7076v f10199b;

    /* renamed from: c */
    public /* synthetic */ Object f10200c;

    /* renamed from: d */
    public final /* synthetic */ ConstraintTrackingWorker f10201d;

    /* renamed from: e */
    public int f10202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2220c(ConstraintTrackingWorker constraintTrackingWorker, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10201d = constraintTrackingWorker;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10200c = obj;
        this.f10202e |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1384b(this.f10201d, this);
    }
}
