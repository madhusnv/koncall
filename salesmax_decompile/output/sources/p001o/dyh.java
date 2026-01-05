package p001o;

import org.objectweb.asm.Opcodes;
import p001o.qh1;

/* loaded from: classes2.dex */
public final class dyh extends qh1 {

    /* renamed from: o.dyh$a */
    public static final class C13063a implements qh1.InterfaceC16407f {

        /* renamed from: a */
        public final umh f20652a;

        /* renamed from: b */
        public final zwc f20653b = new zwc();

        /* renamed from: c */
        public final int f20654c;

        /* renamed from: d */
        public final int f20655d;

        public C13063a(int i, umh umhVar, int i2) {
            this.f20654c = i;
            this.f20652a = umhVar;
            this.f20655d = i2;
        }

        @Override // p001o.qh1.InterfaceC16407f
        /* renamed from: a */
        public qh1.C16406e mo20094a(uq6 uq6Var, long j) {
            long position = uq6Var.getPosition();
            int iMin = (int) Math.min(this.f20655d, uq6Var.getLength() - position);
            this.f20653b.m60013Q(iMin);
            uq6Var.mo40498m(this.f20653b.m60024e(), 0, iMin);
            return m23958c(this.f20653b, j, position);
        }

        @Override // p001o.qh1.InterfaceC16407f
        /* renamed from: b */
        public void mo23957b() {
            this.f20653b.m60014R(sqi.f45795f);
        }

        /* renamed from: c */
        public final qh1.C16406e m23958c(zwc zwcVar, long j, long j2) {
            int iM32914a;
            int iM32914a2;
            int iM60026g = zwcVar.m60026g();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (zwcVar.m60020a() >= 188 && (iM32914a2 = (iM32914a = iyh.m32914a(zwcVar.m60024e(), zwcVar.m60025f(), iM60026g)) + Opcodes.NEWARRAY) <= iM60026g) {
                long jM32916c = iyh.m32916c(zwcVar, iM32914a, this.f20654c);
                if (jM32916c != -9223372036854775807L) {
                    long jM51795b = this.f20652a.m51795b(jM32916c);
                    if (jM51795b > j) {
                        return j5 == -9223372036854775807L ? qh1.C16406e.m45482d(jM51795b, j2) : qh1.C16406e.m45483e(j2 + j4);
                    }
                    if (100000 + jM51795b > j) {
                        return qh1.C16406e.m45483e(j2 + iM32914a);
                    }
                    j4 = iM32914a;
                    j5 = jM51795b;
                }
                zwcVar.m60017U(iM32914a2);
                j3 = iM32914a2;
            }
            return j5 != -9223372036854775807L ? qh1.C16406e.m45484f(j5, j2 + j3) : qh1.C16406e.f42003d;
        }
    }

    public dyh(umh umhVar, long j, long j2, int i, int i2) {
        super(new qh1.C16403b(), new C13063a(i, umhVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
