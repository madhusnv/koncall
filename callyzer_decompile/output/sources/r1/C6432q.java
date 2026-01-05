package r1;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.q */
/* loaded from: classes.dex */
public final class C6432q extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C6432q f31014b;

    /* renamed from: c */
    public static final C6432q f31015c;

    /* renamed from: d */
    public static final C6432q f31016d;

    /* renamed from: e */
    public static final C6432q f31017e;

    /* renamed from: a */
    public final /* synthetic */ int f31018a;

    static {
        int i10 = 1;
        f31014b = new C6432q(i10, 0);
        f31015c = new C6432q(i10, 1);
        f31016d = new C6432q(i10, 2);
        f31017e = new C6432q(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6432q(int i10, int i11) {
        super(i10);
        this.f31018a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f31018a) {
            case 0:
                return qw.a0.f30746a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new C6440y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return C6668r.f31943a;
        }
    }
}
