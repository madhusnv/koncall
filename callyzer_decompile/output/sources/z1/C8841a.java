package z1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4365j;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.a */
/* loaded from: classes.dex */
public final class C8841a extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C8841a f42556b;

    /* renamed from: c */
    public static final C8841a f42557c;

    /* renamed from: d */
    public static final C8841a f42558d;

    /* renamed from: a */
    public final /* synthetic */ int f42559a;

    static {
        int i10 = 1;
        f42556b = new C8841a(i10, 0);
        f42557c = new C8841a(i10, 1);
        f42558d = new C8841a(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8841a(int i10, int i11) {
        super(i10);
        this.f42559a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f42559a) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i10 = ((C4365j) obj).f21911a;
                break;
        }
        return a0.f30746a;
    }
}
