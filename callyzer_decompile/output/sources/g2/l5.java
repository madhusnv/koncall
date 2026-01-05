package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g8.C2545e;
import i8.C3182a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l5 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11998a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f11999b;

    /* renamed from: c */
    public final /* synthetic */ Object f12000c;

    /* renamed from: d */
    public final /* synthetic */ Object f12001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(InterfaceC2139c interfaceC2139c, k2.w0 w0Var, boolean z6) {
        super(0);
        this.f12000c = w0Var;
        this.f12001d = interfaceC2139c;
        this.f11999b = z6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11998a) {
            case 0:
                ((k2.w0) this.f12000c).setValue(new v6());
                ((InterfaceC2139c) this.f12001d).invoke(Boolean.valueOf(!this.f11999b));
                return qw.a0.f30746a;
            default:
                if (this.f11999b) {
                    C2545e c2545e = (C2545e) this.f12000c;
                    String str = (String) this.f12001d;
                    C3182a c3182a = c2545e.f13874a;
                    synchronized (c3182a.f17108c) {
                    }
                }
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(boolean z6, C2545e c2545e, String str) {
        super(0);
        this.f11999b = z6;
        this.f12000c = c2545e;
        this.f12001d = str;
    }
}
