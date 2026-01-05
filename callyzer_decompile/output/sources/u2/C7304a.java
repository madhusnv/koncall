package u2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.a */
/* loaded from: classes.dex */
public final class C7304a extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7304a f34835b;

    /* renamed from: c */
    public static final C7304a f34836c;

    /* renamed from: a */
    public final /* synthetic */ int f34837a;

    static {
        int i10 = 1;
        f34835b = new C7304a(i10, 0);
        f34836c = new C7304a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7304a(int i10, int i11) {
        super(i10);
        this.f34837a = i11;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f34837a) {
            case 0:
                synchronized (AbstractC7316m.f34890b) {
                    ?? r12 = AbstractC7316m.f34896h;
                    int size = r12.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((InterfaceC2139c) r12.get(i10)).invoke(obj);
                    }
                }
                return qw.a0.f30746a;
            default:
                return qw.a0.f30746a;
        }
    }
}
