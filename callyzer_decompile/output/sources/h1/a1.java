package h1;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 implements InterfaceC2794y {

    /* renamed from: a */
    public final float f15345a;

    /* renamed from: b */
    public final float f15346b;

    /* renamed from: c */
    public final Object f15347c;

    public a1(float f6, float f10, Object obj) {
        this.f15345a = f6;
        this.f15346b = f10;
        this.f15347c = obj;
    }

    @Override // h1.InterfaceC2779j
    /* renamed from: a */
    public final z1 mo6766a(x1 x1Var) {
        Object obj = this.f15347c;
        return new C8989c(this.f15345a, this.f15346b, obj == null ? null : (AbstractC2785p) x1Var.f15661a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a1Var.f15345a == this.f15345a && a1Var.f15346b == this.f15346b && AbstractC4154l.m8918a(a1Var.f15347c, this.f15347c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f15347c;
        return Float.hashCode(this.f15346b) + AbstractC1452a.m4555b(this.f15345a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ a1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
