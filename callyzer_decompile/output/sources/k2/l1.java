package k2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a */
    public final r0 f20421a;

    public l1(InterfaceC2137a interfaceC2137a) {
        this.f20421a = new r0(interfaceC2137a);
    }

    /* renamed from: a */
    public abstract m1 mo8541a(Object obj);

    /* renamed from: b */
    public k2 mo8554b() {
        return this.f20421a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final k2 m8555c(m1 m1Var, k2 k2Var) {
        g0 g0Var = null;
        if (k2Var instanceof g0) {
            if (m1Var.f20435d) {
                g0Var = (g0) k2Var;
                g0Var.f20390a.setValue(m1Var.m8573a());
            }
        } else if (k2Var instanceof j2) {
            if ((m1Var.f20433b || m1Var.f20436e != null) && !m1Var.f20435d) {
                j2 j2Var = (j2) k2Var;
                if (AbstractC4154l.m8918a(m1Var.m8573a(), j2Var.f20414a)) {
                    g0Var = j2Var;
                }
            }
        } else if (k2Var instanceof a0) {
            m1Var.getClass();
        }
        if (g0Var != null) {
            return g0Var;
        }
        if (!m1Var.f20435d) {
            return new j2(m1Var.m8573a());
        }
        Object obj = m1Var.f20436e;
        d2 d2Var = m1Var.f20434c;
        if (d2Var == null) {
            d2Var = s0.f20547f;
        }
        return new g0(new e1(obj, d2Var));
    }
}
