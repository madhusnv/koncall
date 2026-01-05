package aw;

import android.content.Context;
import android.database.Cursor;
import com.websoptimization.callyzerbiz.workManager.ReadContactWorker;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.d */
/* loaded from: classes3.dex */
public final class C0464d extends AbstractC8193c {

    /* renamed from: a */
    public Context f3332a;

    /* renamed from: b */
    public Cursor f3333b;

    /* renamed from: c */
    public /* synthetic */ Object f3334c;

    /* renamed from: d */
    public final /* synthetic */ ReadContactWorker f3335d;

    /* renamed from: e */
    public int f3336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464d(ReadContactWorker readContactWorker, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3335d = readContactWorker;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3334c = obj;
        this.f3336e |= Integer.MIN_VALUE;
        return this.f3335d.doWork(this);
    }
}
