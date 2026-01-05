package z7;

import ex.InterfaceC2137a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.j */
/* loaded from: classes.dex */
public final class C8881j {

    /* renamed from: a */
    public final AbstractC8894w f42747a;

    /* renamed from: b */
    public final n0 f42748b;

    /* renamed from: c */
    public final LinkedHashMap f42749c;

    /* renamed from: d */
    public final ReentrantLock f42750d;

    /* renamed from: e */
    public final C8878g f42751e;

    /* renamed from: f */
    public final C8878g f42752f;

    /* renamed from: g */
    public final C8849i f42753g;

    /* renamed from: h */
    public final Object f42754h;

    /* JADX WARN: Type inference failed for: r2v4, types: [z7.g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [z7.g] */
    public C8881j(AbstractC8894w abstractC8894w, HashMap map, HashMap map2, String... strArr) {
        this.f42747a = abstractC8894w;
        n0 n0Var = new n0(abstractC8894w, map, map2, strArr, abstractC8894w.f42841k, new vr.b0(1, this, C8881j.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 24));
        this.f42748b = n0Var;
        this.f42749c = new LinkedHashMap();
        this.f42750d = new ReentrantLock();
        final int i10 = 0;
        this.f42751e = new InterfaceC2137a(this) { // from class: z7.g

            /* renamed from: b */
            public final /* synthetic */ C8881j f42728b;

            {
                this.f42728b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        this.f42728b.getClass();
                        break;
                    case 1:
                        this.f42728b.getClass();
                        break;
                    default:
                        C8881j c8881j = this.f42728b;
                        return Boolean.valueOf(!c8881j.f42747a.m16393p() || c8881j.f42747a.m16397t());
                }
                return qw.a0.f30746a;
            }
        };
        final int i11 = 1;
        this.f42752f = new InterfaceC2137a(this) { // from class: z7.g

            /* renamed from: b */
            public final /* synthetic */ C8881j f42728b;

            {
                this.f42728b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        this.f42728b.getClass();
                        break;
                    case 1:
                        this.f42728b.getClass();
                        break;
                    default:
                        C8881j c8881j = this.f42728b;
                        return Boolean.valueOf(!c8881j.f42747a.m16393p() || c8881j.f42747a.m16397t());
                }
                return qw.a0.f30746a;
            }
        };
        this.f42753g = new C8849i(abstractC8894w);
        this.f42754h = new Object();
        final int i12 = 2;
        n0Var.f42794k = new InterfaceC2137a(this) { // from class: z7.g

            /* renamed from: b */
            public final /* synthetic */ C8881j f42728b;

            {
                this.f42728b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        this.f42728b.getClass();
                        break;
                    case 1:
                        this.f42728b.getClass();
                        break;
                    default:
                        C8881j c8881j = this.f42728b;
                        return Boolean.valueOf(!c8881j.f42747a.m16393p() || c8881j.f42747a.m16397t());
                }
                return qw.a0.f30746a;
            }
        };
    }

    /* renamed from: a */
    public final Object m16376a(AbstractC8199i abstractC8199i) {
        Object objM16382f;
        AbstractC8894w abstractC8894w = this.f42747a;
        return ((!abstractC8894w.m16393p() || abstractC8894w.m16397t()) && (objM16382f = this.f42748b.m16382f(abstractC8199i)) == EnumC7794a.COROUTINE_SUSPENDED) ? objM16382f : qw.a0.f30746a;
    }
}
