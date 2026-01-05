package p001o;

import java.util.Objects;
import p001o.f27;
import p001o.qh1;

/* loaded from: classes2.dex */
public final class c27 extends qh1 {

    /* renamed from: o.c27$b */
    public static final class C12536b implements qh1.InterfaceC16407f {

        /* renamed from: a */
        public final j27 f17157a;

        /* renamed from: b */
        public final int f17158b;

        /* renamed from: c */
        public final f27.C13314a f17159c;

        @Override // p001o.qh1.InterfaceC16407f
        /* renamed from: a */
        public qh1.C16406e mo20094a(uq6 uq6Var, long j) {
            long position = uq6Var.getPosition();
            long jM20095c = m20095c(uq6Var);
            long jMo40493g = uq6Var.mo40493g();
            uq6Var.mo40494h(Math.max(6, this.f17157a.f29616c));
            long jM20095c2 = m20095c(uq6Var);
            return (jM20095c > j || jM20095c2 <= j) ? jM20095c2 <= j ? qh1.C16406e.m45484f(jM20095c2, uq6Var.mo40493g()) : qh1.C16406e.m45482d(jM20095c, position) : qh1.C16406e.m45483e(jMo40493g);
        }

        /* renamed from: c */
        public final long m20095c(uq6 uq6Var) {
            while (uq6Var.mo40493g() < uq6Var.getLength() - 6 && !f27.m25966h(uq6Var, this.f17157a, this.f17158b, this.f17159c)) {
                uq6Var.mo40494h(1);
            }
            if (uq6Var.mo40493g() < uq6Var.getLength() - 6) {
                return this.f17159c.f22562a;
            }
            uq6Var.mo40494h((int) (uq6Var.getLength() - uq6Var.mo40493g()));
            return this.f17157a.f29623j;
        }

        public C12536b(j27 j27Var, int i) {
            this.f17157a = j27Var;
            this.f17158b = i;
            this.f17159c = new f27.C13314a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c27(final j27 j27Var, int i, long j, long j2) {
        super(new qh1.InterfaceC16405d() { // from class: o.b27
            @Override // p001o.qh1.InterfaceC16405d
            /* renamed from: a */
            public final long mo18114a(long j3) {
                return j27Var.m33096i(j3);
            }
        }, new C12536b(j27Var, i), j27Var.m33093f(), 0L, j27Var.f29623j, j, j2, j27Var.m33092d(), Math.max(6, j27Var.f29616c));
        Objects.requireNonNull(j27Var);
    }
}
