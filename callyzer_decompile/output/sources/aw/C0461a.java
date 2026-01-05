package aw;

import com.websoptimization.callyzerbiz.workManager.LogFileUploadManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.a */
/* loaded from: classes3.dex */
public final class C0461a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f3304a;

    /* renamed from: b */
    public final /* synthetic */ LogFileUploadManager f3305b;

    /* renamed from: c */
    public int f3306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461a(LogFileUploadManager logFileUploadManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3305b = logFileUploadManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3304a = obj;
        this.f3306c |= Integer.MIN_VALUE;
        return this.f3305b.doWork(this);
    }
}
