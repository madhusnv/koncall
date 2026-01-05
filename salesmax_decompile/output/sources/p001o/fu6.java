package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.fbj;
import p001o.ni9;
import p001o.scb;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class fu6 {

    /* renamed from: d */
    public static final fu6 f24078d = new fu6(true);

    /* renamed from: a */
    public final lwf f24079a;

    /* renamed from: b */
    public boolean f24080b;

    /* renamed from: c */
    public boolean f24081c;

    /* renamed from: o.fu6$a */
    public static /* synthetic */ class C13556a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24082a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f24083b;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f24083b = iArr;
            try {
                iArr[fbj.EnumC13396b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24083b[fbj.EnumC13396b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24083b[fbj.EnumC13396b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24083b[fbj.EnumC13396b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24083b[fbj.EnumC13396b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24083b[fbj.EnumC13396b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24083b[fbj.EnumC13396b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24083b[fbj.EnumC13396b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24083b[fbj.EnumC13396b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24083b[fbj.EnumC13396b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24083b[fbj.EnumC13396b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24083b[fbj.EnumC13396b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24083b[fbj.EnumC13396b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24083b[fbj.EnumC13396b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24083b[fbj.EnumC13396b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24083b[fbj.EnumC13396b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24083b[fbj.EnumC13396b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24083b[fbj.EnumC13396b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[fbj.EnumC13397c.values().length];
            f24082a = iArr2;
            try {
                iArr2[fbj.EnumC13397c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f24082a[fbj.EnumC13397c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f24082a[fbj.EnumC13397c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f24082a[fbj.EnumC13397c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f24082a[fbj.EnumC13397c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f24082a[fbj.EnumC13397c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f24082a[fbj.EnumC13397c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f24082a[fbj.EnumC13397c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f24082a[fbj.EnumC13397c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: o.fu6$b */
    public interface InterfaceC13557b extends Comparable {
        /* renamed from: f */
        scb.InterfaceC16809a mo27515f(scb.InterfaceC16809a interfaceC16809a, scb scbVar);

        int getNumber();

        boolean isPacked();

        /* renamed from: k */
        boolean mo27516k();

        /* renamed from: l */
        fbj.EnumC13396b mo27517l();

        /* renamed from: q */
        fbj.EnumC13397c mo27518q();
    }

    public fu6() {
        this.f24079a = lwf.m38055y(16);
    }

    /* renamed from: A */
    public static void m27488A(nf3 nf3Var, fbj.EnumC13396b enumC13396b, Object obj) {
        switch (C13556a.f24083b[enumC13396b.ordinal()]) {
            case 1:
                nf3Var.p0(((Double) obj).doubleValue());
                break;
            case 2:
                nf3Var.x0(((Float) obj).floatValue());
                break;
            case 3:
                nf3Var.F0(((Long) obj).longValue());
                break;
            case 4:
                nf3Var.Z0(((Long) obj).longValue());
                break;
            case 5:
                nf3Var.D0(((Integer) obj).intValue());
                break;
            case 6:
                nf3Var.v0(((Long) obj).longValue());
                break;
            case 7:
                nf3Var.t0(((Integer) obj).intValue());
                break;
            case 8:
                nf3Var.j0(((Boolean) obj).booleanValue());
                break;
            case 9:
                nf3Var.A0((scb) obj);
                break;
            case 10:
                nf3Var.H0((scb) obj);
                break;
            case 11:
                if (!(obj instanceof xq1)) {
                    nf3Var.U0((String) obj);
                    break;
                } else {
                    nf3Var.n0((xq1) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof xq1)) {
                    nf3Var.k0((byte[]) obj);
                    break;
                } else {
                    nf3Var.n0((xq1) obj);
                    break;
                }
            case 13:
                nf3Var.X0(((Integer) obj).intValue());
                break;
            case 14:
                nf3Var.M0(((Integer) obj).intValue());
                break;
            case 15:
                nf3Var.O0(((Long) obj).longValue());
                break;
            case 16:
                nf3Var.Q0(((Integer) obj).intValue());
                break;
            case 17:
                nf3Var.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof yn8.InterfaceC18439c)) {
                    nf3Var.r0(((Integer) obj).intValue());
                    break;
                } else {
                    nf3Var.r0(((yn8.InterfaceC18439c) obj).getNumber());
                    break;
                }
        }
    }

    /* renamed from: c */
    public static Object m27489c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m27490d(fbj.EnumC13396b enumC13396b, int i, Object obj) {
        int iM40457T = nf3.m40457T(i);
        if (enumC13396b == fbj.EnumC13396b.GROUP) {
            iM40457T *= 2;
        }
        return iM40457T + m27491e(enumC13396b, obj);
    }

    /* renamed from: e */
    public static int m27491e(fbj.EnumC13396b enumC13396b, Object obj) {
        switch (C13556a.f24083b[enumC13396b.ordinal()]) {
            case 1:
                return nf3.m40471k(((Double) obj).doubleValue());
            case 2:
                return nf3.m40479s(((Float) obj).floatValue());
            case 3:
                return nf3.m40486z(((Long) obj).longValue());
            case 4:
                return nf3.m40461X(((Long) obj).longValue());
            case 5:
                return nf3.m40484x(((Integer) obj).intValue());
            case 6:
                return nf3.m40477q(((Long) obj).longValue());
            case 7:
                return nf3.m40475o(((Integer) obj).intValue());
            case 8:
                return nf3.m40466f(((Boolean) obj).booleanValue());
            case 9:
                return nf3.m40481u((scb) obj);
            case 10:
                return nf3.m40442E((scb) obj);
            case 11:
                return obj instanceof xq1 ? nf3.m40469i((xq1) obj) : nf3.m40456S((String) obj);
            case 12:
                return obj instanceof xq1 ? nf3.m40469i((xq1) obj) : nf3.m40467g((byte[]) obj);
            case 13:
                return nf3.m40459V(((Integer) obj).intValue());
            case 14:
                return nf3.m40448K(((Integer) obj).intValue());
            case 15:
                return nf3.m40450M(((Long) obj).longValue());
            case 16:
                return nf3.m40452O(((Integer) obj).intValue());
            case 17:
                return nf3.m40454Q(((Long) obj).longValue());
            case 18:
                return obj instanceof yn8.InterfaceC18439c ? nf3.m40473m(((yn8.InterfaceC18439c) obj).getNumber()) : nf3.m40473m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m27492f(InterfaceC13557b interfaceC13557b, Object obj) {
        fbj.EnumC13396b enumC13396bMo27517l = interfaceC13557b.mo27517l();
        int number = interfaceC13557b.getNumber();
        if (!interfaceC13557b.mo27516k()) {
            return m27490d(enumC13396bMo27517l, number, obj);
        }
        int iM27490d = 0;
        if (interfaceC13557b.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM27490d += m27491e(enumC13396bMo27517l, it.next());
            }
            return nf3.m40457T(number) + iM27490d + nf3.m40446I(iM27490d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM27490d += m27490d(enumC13396bMo27517l, number, it2.next());
        }
        return iM27490d;
    }

    /* renamed from: h */
    public static fu6 m27493h() {
        return f24078d;
    }

    /* renamed from: m */
    public static int m27494m(fbj.EnumC13396b enumC13396b, boolean z) {
        if (z) {
            return 2;
        }
        return enumC13396b.getWireType();
    }

    /* renamed from: q */
    public static boolean m27495q(Map.Entry entry) {
        InterfaceC13557b interfaceC13557b = (InterfaceC13557b) entry.getKey();
        if (interfaceC13557b.mo27518q() != fbj.EnumC13397c.MESSAGE) {
            return true;
        }
        if (!interfaceC13557b.mo27516k()) {
            Object value = entry.getValue();
            if (value instanceof scb) {
                return ((scb) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((scb) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m27496r(fbj.EnumC13396b enumC13396b, Object obj) {
        yn8.m58012a(obj);
        switch (C13556a.f24082a[enumC13396b.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof xq1) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof yn8.InterfaceC18439c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof scb)) {
                    break;
                }
                break;
        }
        return false;
    }

    /* renamed from: w */
    public static fu6 m27497w() {
        return new fu6();
    }

    /* renamed from: z */
    public static void m27498z(nf3 nf3Var, fbj.EnumC13396b enumC13396b, int i, Object obj) {
        if (enumC13396b == fbj.EnumC13396b.GROUP) {
            nf3Var.y0(i, (scb) obj);
        } else {
            nf3Var.V0(i, m27494m(enumC13396b, false));
            m27488A(nf3Var, enumC13396b, obj);
        }
    }

    /* renamed from: a */
    public void m27499a(InterfaceC13557b interfaceC13557b, Object obj) {
        List arrayList;
        if (!interfaceC13557b.mo27516k()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m27514y(interfaceC13557b, obj);
        Object objM27502i = m27502i(interfaceC13557b);
        if (objM27502i == null) {
            arrayList = new ArrayList();
            this.f24079a.m38056A(interfaceC13557b, arrayList);
        } else {
            arrayList = (List) objM27502i;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public fu6 clone() {
        fu6 fu6VarM27497w = m27497w();
        for (int i = 0; i < this.f24079a.m38063r(); i++) {
            Map.Entry entryM38062o = this.f24079a.m38062o(i);
            fu6VarM27497w.m27513x((InterfaceC13557b) entryM38062o.getKey(), entryM38062o.getValue());
        }
        for (Map.Entry entry : this.f24079a.m38065t()) {
            fu6VarM27497w.m27513x((InterfaceC13557b) entry.getKey(), entry.getValue());
        }
        fu6VarM27497w.f24081c = this.f24081c;
        return fu6VarM27497w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fu6) {
            return this.f24079a.equals(((fu6) obj).f24079a);
        }
        return false;
    }

    /* renamed from: g */
    public Iterator m27501g() {
        return this.f24081c ? new ni9.C15588b(this.f24079a.m38060k().iterator()) : this.f24079a.m38060k().iterator();
    }

    public int hashCode() {
        return this.f24079a.hashCode();
    }

    /* renamed from: i */
    public Object m27502i(InterfaceC13557b interfaceC13557b) {
        return this.f24079a.get(interfaceC13557b);
    }

    /* renamed from: j */
    public int m27503j() {
        int iM27504k = 0;
        for (int i = 0; i < this.f24079a.m38063r(); i++) {
            iM27504k += m27504k(this.f24079a.m38062o(i));
        }
        Iterator it = this.f24079a.m38065t().iterator();
        while (it.hasNext()) {
            iM27504k += m27504k((Map.Entry) it.next());
        }
        return iM27504k;
    }

    /* renamed from: k */
    public final int m27504k(Map.Entry entry) {
        InterfaceC13557b interfaceC13557b = (InterfaceC13557b) entry.getKey();
        Object value = entry.getValue();
        return (interfaceC13557b.mo27518q() != fbj.EnumC13397c.MESSAGE || interfaceC13557b.mo27516k() || interfaceC13557b.isPacked()) ? m27492f(interfaceC13557b, value) : nf3.m40439B(((InterfaceC13557b) entry.getKey()).getNumber(), (scb) value);
    }

    /* renamed from: l */
    public int m27505l() {
        int iM27492f = 0;
        for (int i = 0; i < this.f24079a.m38063r(); i++) {
            Map.Entry entryM38062o = this.f24079a.m38062o(i);
            iM27492f += m27492f((InterfaceC13557b) entryM38062o.getKey(), entryM38062o.getValue());
        }
        for (Map.Entry entry : this.f24079a.m38065t()) {
            iM27492f += m27492f((InterfaceC13557b) entry.getKey(), entry.getValue());
        }
        return iM27492f;
    }

    /* renamed from: n */
    public boolean m27506n() {
        return this.f24079a.isEmpty();
    }

    /* renamed from: o */
    public boolean m27507o() {
        return this.f24080b;
    }

    /* renamed from: p */
    public boolean m27508p() {
        for (int i = 0; i < this.f24079a.m38063r(); i++) {
            if (!m27495q(this.f24079a.m38062o(i))) {
                return false;
            }
        }
        Iterator it = this.f24079a.m38065t().iterator();
        while (it.hasNext()) {
            if (!m27495q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator m27509s() {
        return this.f24081c ? new ni9.C15588b(this.f24079a.entrySet().iterator()) : this.f24079a.entrySet().iterator();
    }

    /* renamed from: t */
    public void m27510t() {
        if (this.f24080b) {
            return;
        }
        this.f24079a.mo38068w();
        this.f24080b = true;
    }

    /* renamed from: u */
    public void m27511u(fu6 fu6Var) {
        for (int i = 0; i < fu6Var.f24079a.m38063r(); i++) {
            m27512v(fu6Var.f24079a.m38062o(i));
        }
        Iterator it = fu6Var.f24079a.m38065t().iterator();
        while (it.hasNext()) {
            m27512v((Map.Entry) it.next());
        }
    }

    /* renamed from: v */
    public final void m27512v(Map.Entry entry) {
        InterfaceC13557b interfaceC13557b = (InterfaceC13557b) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC13557b.mo27516k()) {
            Object objM27502i = m27502i(interfaceC13557b);
            if (objM27502i == null) {
                objM27502i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM27502i).add(m27489c(it.next()));
            }
            this.f24079a.m38056A(interfaceC13557b, objM27502i);
            return;
        }
        if (interfaceC13557b.mo27518q() != fbj.EnumC13397c.MESSAGE) {
            this.f24079a.m38056A(interfaceC13557b, m27489c(value));
            return;
        }
        Object objM27502i2 = m27502i(interfaceC13557b);
        if (objM27502i2 == null) {
            this.f24079a.m38056A(interfaceC13557b, m27489c(value));
        } else {
            this.f24079a.m38056A(interfaceC13557b, interfaceC13557b.mo27515f(((scb) objM27502i2).toBuilder(), (scb) value).build());
        }
    }

    /* renamed from: x */
    public void m27513x(InterfaceC13557b interfaceC13557b, Object obj) {
        if (!interfaceC13557b.mo27516k()) {
            m27514y(interfaceC13557b, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m27514y(interfaceC13557b, it.next());
            }
            obj = arrayList;
        }
        this.f24079a.m38056A(interfaceC13557b, obj);
    }

    /* renamed from: y */
    public final void m27514y(InterfaceC13557b interfaceC13557b, Object obj) {
        if (!m27496r(interfaceC13557b.mo27517l(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC13557b.getNumber()), interfaceC13557b.mo27517l().getJavaType(), obj.getClass().getName()));
        }
    }

    public fu6(boolean z) {
        this(lwf.m38055y(0));
        m27510t();
    }

    public fu6(lwf lwfVar) {
        this.f24079a = lwfVar;
        m27510t();
    }
}
