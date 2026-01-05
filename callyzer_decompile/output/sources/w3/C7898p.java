package w3;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.p */
/* loaded from: classes.dex */
public final class C7898p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7898p f37909b;

    /* renamed from: c */
    public static final C7898p f37910c;

    /* renamed from: d */
    public static final C7898p f37911d;

    /* renamed from: e */
    public static final C7898p f37912e;

    /* renamed from: a */
    public final /* synthetic */ int f37913a;

    static {
        int i10 = 1;
        f37909b = new C7898p(i10, 0);
        f37910c = new C7898p(i10, 1);
        f37911d = new C7898p(i10, 2);
        f37912e = new C7898p(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7898p(int i10, int i11) {
        super(i10);
        this.f37913a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37913a) {
            case 0:
                return qw.a0.f30746a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(m0.m14981h(obj));
        }
    }
}
