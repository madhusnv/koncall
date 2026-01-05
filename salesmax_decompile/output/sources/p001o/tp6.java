package p001o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001o.fbj;
import p001o.wn7;

/* loaded from: classes6.dex */
public final class tp6 extends rp6 {

    /* renamed from: o.tp6$a */
    public static /* synthetic */ class C17172a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47524a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f47524a = iArr;
            try {
                iArr[fbj.EnumC13396b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47524a[fbj.EnumC13396b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47524a[fbj.EnumC13396b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47524a[fbj.EnumC13396b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47524a[fbj.EnumC13396b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47524a[fbj.EnumC13396b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47524a[fbj.EnumC13396b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47524a[fbj.EnumC13396b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47524a[fbj.EnumC13396b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47524a[fbj.EnumC13396b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47524a[fbj.EnumC13396b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47524a[fbj.EnumC13396b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47524a[fbj.EnumC13396b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47524a[fbj.EnumC13396b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47524a[fbj.EnumC13396b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47524a[fbj.EnumC13396b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47524a[fbj.EnumC13396b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47524a[fbj.EnumC13396b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // p001o.rp6
    /* renamed from: a */
    public int mo47054a(Map.Entry entry) {
        return ((wn7.C17938e) entry.getKey()).getNumber();
    }

    @Override // p001o.rp6
    /* renamed from: b */
    public Object mo47055b(qp6 qp6Var, scb scbVar, int i) {
        return qp6Var.m45752b(scbVar, i);
    }

    @Override // p001o.rp6
    /* renamed from: c */
    public fu6 mo47056c(Object obj) {
        return ((wn7.AbstractC17937d) obj).extensions;
    }

    @Override // p001o.rp6
    /* renamed from: d */
    public fu6 mo47057d(Object obj) {
        return ((wn7.AbstractC17937d) obj).m54737g();
    }

    @Override // p001o.rp6
    /* renamed from: e */
    public boolean mo47058e(scb scbVar) {
        return scbVar instanceof wn7.AbstractC17937d;
    }

    @Override // p001o.rp6
    /* renamed from: f */
    public void mo47059f(Object obj) {
        mo47056c(obj).m27510t();
    }

    @Override // p001o.rp6
    /* renamed from: g */
    public Object mo47060g(mce mceVar, Object obj, qp6 qp6Var, fu6 fu6Var, Object obj2, j4i j4iVar) {
        Object objValueOf;
        Object objM27502i;
        ArrayList arrayList;
        wn7.C17939f c17939f = (wn7.C17939f) obj;
        int iM54743e = c17939f.m54743e();
        if (c17939f.f52387d.mo27516k() && c17939f.f52387d.isPacked()) {
            switch (C17172a.f47524a[c17939f.m54741c().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    mceVar.mo35575F(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    mceVar.mo35571B(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    mceVar.mo35601i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    mceVar.mo35599g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    mceVar.mo35615w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    mceVar.mo35609q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    mceVar.mo35616x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    mceVar.mo35605m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    mceVar.mo35612t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    mceVar.mo35595c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    mceVar.mo35614v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    mceVar.mo35610r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    mceVar.mo35596d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    mceVar.mo35602j(arrayList);
                    obj2 = y5f.m57293z(iM54743e, arrayList, c17939f.f52387d.m54739c(), obj2, j4iVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c17939f.f52387d.mo27517l());
            }
            fu6Var.m27513x(c17939f.f52387d, arrayList);
        } else {
            if (c17939f.m54741c() != fbj.EnumC13396b.ENUM) {
                switch (C17172a.f47524a[c17939f.m54741c().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(mceVar.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(mceVar.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(mceVar.mo35576G());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(mceVar.mo35611s());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(mceVar.mo35608p());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(mceVar.mo35593a());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(mceVar.mo35613u());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(mceVar.mo35597e());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(mceVar.mo35600h());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(mceVar.mo35573D());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(mceVar.mo35598f());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(mceVar.mo35604l());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(mceVar.mo35617y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = mceVar.mo35607o();
                        break;
                    case 16:
                        objValueOf = mceVar.readString();
                        break;
                    case 17:
                        objValueOf = mceVar.mo35582M(c17939f.m54742d().getClass(), qp6Var);
                        break;
                    case 18:
                        objValueOf = mceVar.mo35581L(c17939f.m54742d().getClass(), qp6Var);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iMo35608p = mceVar.mo35608p();
                if (c17939f.f52387d.m54739c().findValueByNumber(iMo35608p) == null) {
                    return y5f.m57253L(iM54743e, iMo35608p, obj2, j4iVar);
                }
                objValueOf = Integer.valueOf(iMo35608p);
            }
            if (c17939f.m54744f()) {
                fu6Var.m27499a(c17939f.f52387d, objValueOf);
            } else {
                int i = C17172a.f47524a[c17939f.m54741c().ordinal()];
                if ((i == 17 || i == 18) && (objM27502i = fu6Var.m27502i(c17939f.f52387d)) != null) {
                    objValueOf = yn8.m58019h(objM27502i, objValueOf);
                }
                fu6Var.m27513x(c17939f.f52387d, objValueOf);
            }
        }
        return obj2;
    }

    @Override // p001o.rp6
    /* renamed from: h */
    public void mo47061h(mce mceVar, Object obj, qp6 qp6Var, fu6 fu6Var) {
        wn7.C17939f c17939f = (wn7.C17939f) obj;
        fu6Var.m27513x(c17939f.f52387d, mceVar.mo35581L(c17939f.m54742d().getClass(), qp6Var));
    }

    @Override // p001o.rp6
    /* renamed from: i */
    public void mo47062i(xq1 xq1Var, Object obj, qp6 qp6Var, fu6 fu6Var) throws ct8 {
        wn7.C17939f c17939f = (wn7.C17939f) obj;
        scb scbVarBuildPartial = c17939f.m54742d().newBuilderForType().buildPartial();
        ph1 ph1VarM43640P = ph1.m43640P(ByteBuffer.wrap(xq1Var.m56591I()), true);
        v1e.m52231a().m52232b(scbVarBuildPartial, ph1VarM43640P, qp6Var);
        fu6Var.m27513x(c17939f.f52387d, scbVarBuildPartial);
        if (ph1VarM43640P.mo35618z() != Integer.MAX_VALUE) {
            throw ct8.m21764b();
        }
    }

    @Override // p001o.rp6
    /* renamed from: j */
    public void mo47063j(cdj cdjVar, Map.Entry entry) {
        wn7.C17938e c17938e = (wn7.C17938e) entry.getKey();
        if (!c17938e.mo27516k()) {
            switch (C17172a.f47524a[c17938e.mo27517l().ordinal()]) {
                case 1:
                    cdjVar.mo21021p(c17938e.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    cdjVar.mo20992B(c17938e.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    cdjVar.mo21026u(c17938e.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    cdjVar.mo21011f(c17938e.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    cdjVar.mo21013h(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    cdjVar.mo21024s(c17938e.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    cdjVar.mo21008c(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    cdjVar.mo21027v(c17938e.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    cdjVar.mo21020o(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    cdjVar.mo21028w(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    cdjVar.mo21014i(c17938e.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    cdjVar.mo20998H(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    cdjVar.mo21018m(c17938e.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    cdjVar.mo21013h(c17938e.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    cdjVar.mo21003M(c17938e.getNumber(), (xq1) entry.getValue());
                    break;
                case 16:
                    cdjVar.mo21010e(c17938e.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    cdjVar.mo21000J(c17938e.getNumber(), entry.getValue(), v1e.m52231a().m52234d(entry.getValue().getClass()));
                    break;
                case 18:
                    cdjVar.mo21002L(c17938e.getNumber(), entry.getValue(), v1e.m52231a().m52234d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (C17172a.f47524a[c17938e.mo27517l().ordinal()]) {
            case 1:
                y5f.m57257P(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 2:
                y5f.m57261T(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 3:
                y5f.m57264W(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 4:
                y5f.e0(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 5:
                y5f.m57263V(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 6:
                y5f.m57260S(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 7:
                y5f.m57259R(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 8:
                y5f.m57255N(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 9:
                y5f.d0(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 10:
                y5f.m57266Y(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 11:
                y5f.m57267Z(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 12:
                y5f.a0(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 13:
                y5f.b0(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 14:
                y5f.m57263V(c17938e.getNumber(), (List) entry.getValue(), cdjVar, c17938e.isPacked());
                break;
            case 15:
                y5f.m57256O(c17938e.getNumber(), (List) entry.getValue(), cdjVar);
                break;
            case 16:
                y5f.c0(c17938e.getNumber(), (List) entry.getValue(), cdjVar);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    y5f.m57262U(c17938e.getNumber(), (List) entry.getValue(), cdjVar, v1e.m52231a().m52234d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    y5f.m57265X(c17938e.getNumber(), (List) entry.getValue(), cdjVar, v1e.m52231a().m52234d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
