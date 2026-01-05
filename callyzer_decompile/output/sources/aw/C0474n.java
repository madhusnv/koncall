package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import java.util.Iterator;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.n */
/* loaded from: classes3.dex */
public final class C0474n extends AbstractC8193c {

    /* renamed from: a */
    public List f3391a;

    /* renamed from: b */
    public Iterator f3392b;

    /* renamed from: c */
    public Object f3393c;

    /* renamed from: d */
    public String f3394d;

    /* renamed from: e */
    public int f3395e;

    /* renamed from: f */
    public int f3396f;

    /* renamed from: g */
    public int f3397g;

    /* renamed from: h */
    public long f3398h;

    /* renamed from: j */
    public /* synthetic */ Object f3399j;

    /* renamed from: k */
    public final /* synthetic */ RecordingCompressManager f3400k;

    /* renamed from: l */
    public int f3401l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0474n(RecordingCompressManager recordingCompressManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3400k = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3399j = obj;
        this.f3401l |= Integer.MIN_VALUE;
        return this.f3400k.m5048g(null, null, this);
    }
}
