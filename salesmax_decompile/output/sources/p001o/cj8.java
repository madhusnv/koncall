package p001o;

import p001o.di9;
import p001o.xzb;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class cj8 extends xzb {
    public static final C12694a x0 = new C12694a(null);
    public static final ewc y0;
    public final bjg v0;
    public wla w0;

    /* renamed from: o.cj8$a */
    public static final class C12694a {
        public C12694a() {
        }

        public /* synthetic */ C12694a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.cj8$b */
    public final class C12695b extends wla {
        public C12695b() {
            super(cj8.this);
        }

        @Override // p001o.vla
        /* renamed from: V */
        public int mo21321V(s90 s90Var) {
            sq8.m48649h(s90Var, "alignmentLine");
            Integer num = (Integer) m0().mo23284d().get(s90Var);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            o0().put(s90Var, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // p001o.wla
        public void s0() {
            di9.C12942a c12942aM59418K = a0().m59418K();
            sq8.m48646e(c12942aM59418K);
            c12942aM59418K.m0();
        }

        @Override // p001o.y0b
        /* renamed from: w */
        public q8d mo21322w(long j) {
            m44977U(j);
            fqb fqbVarE0 = a0().e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    di9.C12942a c12942aM59418K = ((zh9) objArrM27353n[i]).m59418K();
                    sq8.m48646e(c12942aM59418K);
                    c12942aM59418K.q0(zh9.EnumC18642g.NotUsed);
                    i++;
                } while (i < iM27354o);
            }
            v0(a0().m59423P().mo16327a(this, a0().m59443u(), j));
            return this;
        }
    }

    static {
        ewc ewcVarM18808a = bf0.m18808a();
        ewcVarM18808a.mo16978a(lh3.f33793b.m37211c());
        ewcVarM18808a.mo16982e(1.0f);
        ewcVarM18808a.mo16981d(gwc.f25862a.m29552a());
        y0 = ewcVarM18808a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj8(zh9 zh9Var) {
        super(zh9Var);
        sq8.m48649h(zh9Var, "layoutNode");
        this.v0 = new bjg();
        P0().m17376Z(this);
        this.w0 = zh9Var.m59419L() != null ? new C12695b() : null;
    }

    @Override // p001o.xzb
    public void C0() {
        if (K0() == null) {
            G1(new C12695b());
        }
    }

    @Override // p001o.xzb
    /* renamed from: F1, reason: merged with bridge method [inline-methods] */
    public bjg P0() {
        return this.v0;
    }

    public void G1(wla wlaVar) {
        this.w0 = wlaVar;
    }

    @Override // p001o.xzb
    public wla K0() {
        return this.w0;
    }

    @Override // p001o.xzb, p001o.q8d
    /* renamed from: S */
    public void mo21320S(long j, float f, xk7 xk7Var) {
        super.mo21320S(j, f, xk7Var);
        if (g0()) {
            return;
        }
        k1();
        a0().m59421N().n0();
    }

    @Override // p001o.vla
    /* renamed from: V */
    public int mo21321V(s90 s90Var) {
        sq8.m48649h(s90Var, "alignmentLine");
        wla wlaVarK0 = K0();
        if (wlaVarK0 != null) {
            return wlaVarK0.mo21321V(s90Var);
        }
        Integer num = (Integer) G0().mo23284d().get(s90Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[EDGE_INSN: B:38:0x00a0->B:36:0x00a0 BREAK  A[LOOP:0: B:21:0x0064->B:40:?], SYNTHETIC] */
    @Override // p001o.xzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(xzb.InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sq8.m48649h(interfaceC18275f, "hitTestSource");
        sq8.m48649h(uy7Var, "hitTestResult");
        if (!interfaceC18275f.mo57037c(a0())) {
            z3 = z2;
            z4 = false;
        } else if (E1(j)) {
            z3 = z2;
            z4 = true;
        } else if (z) {
            float fY0 = y0(j, L0());
            if ((Float.isInfinite(fY0) || Float.isNaN(fY0)) ? false : true) {
                z4 = true;
                z3 = false;
            }
        }
        if (z4) {
            int i = uy7Var.f49643c;
            fqb fqbVarD0 = a0().d0();
            int iM27354o = fqbVarD0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarD0.m27353n();
                int i2 = iM27354o - 1;
                do {
                    zh9 zh9Var = (zh9) objArrM27353n[i2];
                    if (zh9Var.mo49883a()) {
                        interfaceC18275f.mo57038d(zh9Var, j, uy7Var, z, z3);
                        if (!uy7Var.m52150y()) {
                            z6 = true;
                            if (!z6) {
                            }
                            if (z5) {
                            }
                        } else if (zh9Var.m59429V().v1()) {
                            uy7Var.m52144d();
                            z6 = true;
                            z5 = !z6;
                            if (z5) {
                                break;
                            } else {
                                i2--;
                            }
                        } else {
                            z6 = false;
                            if (!z6) {
                            }
                            if (z5) {
                            }
                        }
                    }
                } while (i2 >= 0);
            }
            uy7Var.f49643c = i;
        }
    }

    @Override // p001o.xzb
    public void m1(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        sgc sgcVarM21298b = ci9.m21298b(a0());
        fqb fqbVarD0 = a0().d0();
        int iM27354o = fqbVarD0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarD0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                if (zh9Var.mo49883a()) {
                    zh9Var.m59440q(mc2Var);
                }
                i++;
            } while (i < iM27354o);
        }
        if (sgcVarM21298b.getShowLayoutBounds()) {
            A0(mc2Var, y0);
        }
    }

    @Override // p001o.y0b
    /* renamed from: w */
    public q8d mo21322w(long j) {
        m44977U(j);
        fqb fqbVarE0 = a0().e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                ((zh9) objArrM27353n[i]).m59421N().s0(zh9.EnumC18642g.NotUsed);
                i++;
            } while (i < iM27354o);
        }
        r1(a0().m59423P().mo16327a(this, a0().m59444v(), j));
        j1();
        return this;
    }
}
