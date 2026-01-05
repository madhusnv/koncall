package o1;

import com.sun.mail.util.AbstractC1452a;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 implements v1 {

    /* renamed from: a */
    public final String f25851a;

    /* renamed from: b */
    public final k2.e1 f25852b;

    public t1(z0 z0Var, String str) {
        this.f25851a = str;
        this.f25852b = C3953b.m8517t(z0Var);
    }

    @Override // o1.v1
    /* renamed from: a */
    public final int mo6893a(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return m10371e().f25894a;
    }

    @Override // o1.v1
    /* renamed from: b */
    public final int mo6894b(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return m10371e().f25896c;
    }

    @Override // o1.v1
    /* renamed from: c */
    public final int mo6895c(InterfaceC6747c interfaceC6747c) {
        return m10371e().f25895b;
    }

    @Override // o1.v1
    /* renamed from: d */
    public final int mo6896d(InterfaceC6747c interfaceC6747c) {
        return m10371e().f25897d;
    }

    /* renamed from: e */
    public final z0 m10371e() {
        return (z0) this.f25852b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            return AbstractC4154l.m8918a(m10371e(), ((t1) obj).m10371e());
        }
        return false;
    }

    /* renamed from: f */
    public final void m10372f(z0 z0Var) {
        this.f25852b.setValue(z0Var);
    }

    public final int hashCode() {
        return this.f25851a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25851a);
        sb2.append("(left=");
        sb2.append(m10371e().f25894a);
        sb2.append(", top=");
        sb2.append(m10371e().f25895b);
        sb2.append(", right=");
        sb2.append(m10371e().f25896c);
        sb2.append(", bottom=");
        return AbstractC1452a.m4563j(sb2, m10371e().f25897d, ')');
    }
}
