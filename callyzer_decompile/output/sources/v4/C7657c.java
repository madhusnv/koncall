package v4;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.c */
/* loaded from: classes.dex */
public final class C7657c extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7657c f37085b;

    /* renamed from: c */
    public static final C7657c f37086c;

    /* renamed from: d */
    public static final C7657c f37087d;

    /* renamed from: e */
    public static final C7657c f37088e;

    /* renamed from: a */
    public final /* synthetic */ int f37089a;

    static {
        int i10 = 1;
        f37085b = new C7657c(i10, 0);
        f37086c = new C7657c(i10, 1);
        f37087d = new C7657c(i10, 2);
        f37088e = new C7657c(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7657c(int i10, int i11) {
        super(i10);
        this.f37089a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37089a) {
            case 0:
                AbstractC7663i abstractC7663i = (AbstractC7663i) obj;
                abstractC7663i.getHandler().post(new RunnableC7655a(1, abstractC7663i.f37123s));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return a0.f30746a;
    }
}
