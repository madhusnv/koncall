package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import java.util.List;
import kn.C4121a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.v */
/* loaded from: classes3.dex */
public final class C0482v extends AbstractC8193c {

    /* renamed from: a */
    public List f3443a;

    /* renamed from: b */
    public Object f3444b;

    /* renamed from: c */
    public Object f3445c;

    /* renamed from: d */
    public Object f3446d;

    /* renamed from: e */
    public C4121a f3447e;

    /* renamed from: f */
    public int f3448f;

    /* renamed from: g */
    public int f3449g;

    /* renamed from: h */
    public int f3450h;

    /* renamed from: j */
    public /* synthetic */ Object f3451j;

    /* renamed from: k */
    public final /* synthetic */ RecordingUploadManager f3452k;

    /* renamed from: l */
    public int f3453l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482v(RecordingUploadManager recordingUploadManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3452k = recordingUploadManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3451j = obj;
        this.f3453l |= Integer.MIN_VALUE;
        return this.f3452k.doWork(this);
    }
}
