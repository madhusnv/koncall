package bo;

import a9.C0073l;
import com.websoptimization.callyzerbiz.data.model.request.CallRecordingPathSuggestionRequest;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bo.a */
/* loaded from: classes3.dex */
public final class C0716a extends AbstractC8193c {

    /* renamed from: a */
    public boolean f4527a;

    /* renamed from: b */
    public boolean f4528b;

    /* renamed from: c */
    public CallRecordingPathSuggestionRequest f4529c;

    /* renamed from: d */
    public /* synthetic */ Object f4530d;

    /* renamed from: e */
    public final /* synthetic */ C0073l f4531e;

    /* renamed from: f */
    public int f4532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0716a(C0073l c0073l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4531e = c0073l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4530d = obj;
        this.f4532f |= Integer.MIN_VALUE;
        Object objM226s = this.f4531e.m226s(this);
        return objM226s == EnumC7794a.COROUTINE_SUSPENDED ? objM226s : new C6364n(objM226s);
    }
}
