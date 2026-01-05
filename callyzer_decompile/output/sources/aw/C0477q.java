package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import java.util.Iterator;
import java.util.List;
import kn.C4121a;
import tx.InterfaceC7266z;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.q */
/* loaded from: classes3.dex */
public final class C0477q extends AbstractC8193c {

    /* renamed from: a */
    public List f3412a;

    /* renamed from: b */
    public List f3413b;

    /* renamed from: c */
    public List f3414c;

    /* renamed from: d */
    public InterfaceC7266z f3415d;

    /* renamed from: e */
    public C4121a f3416e;

    /* renamed from: f */
    public Iterator f3417f;

    /* renamed from: g */
    public int f3418g;

    /* renamed from: h */
    public int f3419h;

    /* renamed from: j */
    public /* synthetic */ Object f3420j;

    /* renamed from: k */
    public final /* synthetic */ RecordingCompressManager f3421k;

    /* renamed from: l */
    public int f3422l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0477q(RecordingCompressManager recordingCompressManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3421k = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3420j = obj;
        this.f3422l |= Integer.MIN_VALUE;
        return this.f3421k.m5050i(null, this);
    }
}
