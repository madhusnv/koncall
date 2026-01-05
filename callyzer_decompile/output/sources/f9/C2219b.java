package f9;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f9.b */
/* loaded from: classes.dex */
public final class C2219b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f10195a;

    /* renamed from: b */
    public final /* synthetic */ ConstraintTrackingWorker f10196b;

    /* renamed from: c */
    public int f10197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219b(ConstraintTrackingWorker constraintTrackingWorker, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10196b = constraintTrackingWorker;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10195a = obj;
        this.f10197c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1383a(this.f10196b, null, null, null, this);
    }
}
