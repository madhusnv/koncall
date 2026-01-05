package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f11837a;

    /* renamed from: b */
    public final /* synthetic */ int f11838b;

    /* renamed from: c */
    public final /* synthetic */ int f11839c;

    /* renamed from: d */
    public final /* synthetic */ t3.w0 f11840d;

    /* renamed from: e */
    public final /* synthetic */ int f11841e;

    /* renamed from: f */
    public final /* synthetic */ t3.w0 f11842f;

    /* renamed from: g */
    public final /* synthetic */ int f11843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t3.w0 w0Var, int i10, int i11, t3.w0 w0Var2, int i12, t3.w0 w0Var3, int i13) {
        super(1);
        this.f11837a = w0Var;
        this.f11838b = i10;
        this.f11839c = i11;
        this.f11840d = w0Var2;
        this.f11841e = i12;
        this.f11842f = w0Var3;
        this.f11843g = i13;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        int i10 = this.f11839c;
        t3.w0 w0Var = this.f11837a;
        if (w0Var != null) {
            t3.v0.m13319g(v0Var, w0Var, 0, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i10 - this.f11838b) / 2.0f));
        }
        t3.w0 w0Var2 = this.f11840d;
        int i11 = this.f11841e;
        t3.v0.m13319g(v0Var, w0Var2, i11, 0);
        t3.w0 w0Var3 = this.f11842f;
        if (w0Var3 != null) {
            t3.v0.m13319g(v0Var, w0Var3, i11 + w0Var2.f34030a, AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i10 - this.f11843g) / 2.0f));
        }
        return qw.a0.f30746a;
    }
}
