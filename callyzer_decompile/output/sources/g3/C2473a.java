package g3;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.a */
/* loaded from: classes.dex */
public final class C2473a extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C2473a f13411b;

    /* renamed from: c */
    public static final C2473a f13412c;

    /* renamed from: a */
    public final /* synthetic */ int f13413a;

    static {
        int i10 = 1;
        f13411b = new C2473a(i10, 0);
        f13412c = new C2473a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2473a(int i10, int i11) {
        super(i10);
        this.f13413a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f13413a) {
            case 0:
                break;
            default:
                InterfaceC2198d.o0((InterfaceC2198d) obj, C1565s.f7816i, 0L, 0L, DefinitionKt.NO_Float_VALUE, null, 126);
                break;
        }
        return a0.f30746a;
    }
}
