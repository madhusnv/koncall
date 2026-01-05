package p001o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p001o.mo0;
import p001o.q8;
import p001o.xn8;

/* loaded from: classes4.dex */
public abstract class vn7 extends q8 {
    private static Map<Object, vn7> defaultInstanceMap = new ConcurrentHashMap();
    protected m4i unknownFields = m4i.m38362e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: o.vn7$a */
    public static abstract class AbstractC17621a extends q8.AbstractC16319a {

        /* renamed from: a */
        public final vn7 f50579a;

        /* renamed from: b */
        public vn7 f50580b;

        /* renamed from: c */
        public boolean f50581c = false;

        public AbstractC17621a(vn7 vn7Var) {
            this.f50579a = vn7Var;
            this.f50580b = (vn7) vn7Var.m53054l(EnumC17624d.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: i */
        public final vn7 m53060i() {
            vn7 vn7VarBuildPartial = buildPartial();
            if (vn7VarBuildPartial.m53057s()) {
                return vn7VarBuildPartial;
            }
            throw q8.AbstractC16319a.m44947h(vn7VarBuildPartial);
        }

        @Override // p001o.rcb.InterfaceC16588a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public vn7 buildPartial() {
            if (this.f50581c) {
                return this.f50580b;
            }
            this.f50580b.m53058u();
            this.f50581c = true;
            return this.f50580b;
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC17621a clone() {
            AbstractC17621a abstractC17621aNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            abstractC17621aNewBuilderForType.m53067q(buildPartial());
            return abstractC17621aNewBuilderForType;
        }

        /* renamed from: l */
        public final void m53063l() {
            if (this.f50581c) {
                m53064m();
                this.f50581c = false;
            }
        }

        /* renamed from: m */
        public void m53064m() {
            vn7 vn7Var = (vn7) this.f50580b.m53054l(EnumC17624d.NEW_MUTABLE_INSTANCE);
            m53068s(vn7Var, this.f50580b);
            this.f50580b = vn7Var;
        }

        @Override // p001o.ucb
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public vn7 getDefaultInstanceForType() {
            return this.f50579a;
        }

        @Override // p001o.q8.AbstractC16319a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public AbstractC17621a mo44948f(vn7 vn7Var) {
            return m53067q(vn7Var);
        }

        /* renamed from: q */
        public AbstractC17621a m53067q(vn7 vn7Var) {
            m53063l();
            m53068s(this.f50580b, vn7Var);
            return this;
        }

        /* renamed from: s */
        public final void m53068s(vn7 vn7Var, vn7 vn7Var2) {
            w1e.m53800a().m53803d(vn7Var).mo16904a(vn7Var, vn7Var2);
        }
    }

    /* renamed from: o.vn7$b */
    public static class C17622b extends c9 {

        /* renamed from: b */
        public final vn7 f50582b;

        public C17622b(vn7 vn7Var) {
            this.f50582b = vn7Var;
        }
    }

    /* renamed from: o.vn7$c */
    public static class C17623c extends mp6 {
    }

    /* renamed from: o.vn7$d */
    public enum EnumC17624d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static vn7 m53038A(vn7 vn7Var, yq1 yq1Var, pp6 pp6Var) throws bt8 {
        if3 if3VarMo58097y = yq1Var.mo58097y();
        vn7 vn7VarM53039B = m53039B(vn7Var, if3VarMo58097y, pp6Var);
        try {
            if3VarMo58097y.mo32014a(0);
            return vn7VarM53039B;
        } catch (bt8 e) {
            throw e.m19725i(vn7VarM53039B);
        }
    }

    /* renamed from: B */
    public static vn7 m53039B(vn7 vn7Var, if3 if3Var, pp6 pp6Var) throws bt8 {
        vn7 vn7Var2 = (vn7) vn7Var.m53054l(EnumC17624d.NEW_MUTABLE_INSTANCE);
        try {
            o5f o5fVarM53803d = w1e.m53800a().m53803d(vn7Var2);
            o5fVarM53803d.mo16913j(vn7Var2, lf3.m37061N(if3Var), pp6Var);
            o5fVarM53803d.mo16905b(vn7Var2);
            return vn7Var2;
        } catch (IOException e) {
            if (e.getCause() instanceof bt8) {
                throw ((bt8) e.getCause());
            }
            throw new bt8(e.getMessage()).m19725i(vn7Var2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bt8) {
                throw ((bt8) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: C */
    public static vn7 m53040C(vn7 vn7Var, byte[] bArr, int i, int i2, pp6 pp6Var) throws bt8 {
        vn7 vn7Var2 = (vn7) vn7Var.m53054l(EnumC17624d.NEW_MUTABLE_INSTANCE);
        try {
            o5f o5fVarM53803d = w1e.m53800a().m53803d(vn7Var2);
            o5fVarM53803d.mo16911h(vn7Var2, bArr, i, i + i2, new mo0.C15370a(pp6Var));
            o5fVarM53803d.mo16905b(vn7Var2);
            if (vn7Var2.memoizedHashCode == 0) {
                return vn7Var2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof bt8) {
                throw ((bt8) e.getCause());
            }
            throw new bt8(e.getMessage()).m19725i(vn7Var2);
        } catch (IndexOutOfBoundsException unused) {
            throw bt8.m19724j().m19725i(vn7Var2);
        }
    }

    /* renamed from: D */
    public static void m53041D(Class cls, vn7 vn7Var) {
        defaultInstanceMap.put(cls, vn7Var);
    }

    /* renamed from: j */
    public static vn7 m53042j(vn7 vn7Var) throws bt8 {
        if (vn7Var == null || vn7Var.m53057s()) {
            return vn7Var;
        }
        throw vn7Var.m44945g().m52309a().m19725i(vn7Var);
    }

    /* renamed from: o */
    public static xn8.InterfaceC18196d m53043o() {
        return y1e.m57111e();
    }

    /* renamed from: p */
    public static vn7 m53044p(Class cls) throws ClassNotFoundException {
        vn7 defaultInstanceForType = defaultInstanceMap.get(cls);
        if (defaultInstanceForType == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                defaultInstanceForType = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (defaultInstanceForType == null) {
            defaultInstanceForType = ((vn7) a5i.m16471i(cls)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, defaultInstanceForType);
        }
        return defaultInstanceForType;
    }

    /* renamed from: r */
    static Object m53045r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: t */
    public static final boolean m53046t(vn7 vn7Var, boolean z) {
        byte bByteValue = ((Byte) vn7Var.m53054l(EnumC17624d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo16906c = w1e.m53800a().m53803d(vn7Var).mo16906c(vn7Var);
        if (z) {
            vn7Var.m53055m(EnumC17624d.SET_MEMOIZED_IS_INITIALIZED, zMo16906c ? vn7Var : null);
        }
        return zMo16906c;
    }

    /* renamed from: v */
    public static xn8.InterfaceC18196d m53047v(xn8.InterfaceC18196d interfaceC18196d) {
        int size = interfaceC18196d.size();
        return interfaceC18196d.mo56352a(size == 0 ? 10 : size * 2);
    }

    /* renamed from: x */
    public static Object m53048x(rcb rcbVar, String str, Object[] objArr) {
        return new hce(rcbVar, str, objArr);
    }

    /* renamed from: y */
    public static vn7 m53049y(vn7 vn7Var, yq1 yq1Var, pp6 pp6Var) {
        return m53042j(m53038A(vn7Var, yq1Var, pp6Var));
    }

    /* renamed from: z */
    public static vn7 m53050z(vn7 vn7Var, byte[] bArr, pp6 pp6Var) {
        return m53042j(m53040C(vn7Var, bArr, 0, bArr.length, pp6Var));
    }

    @Override // p001o.rcb
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final AbstractC17621a toBuilder() {
        AbstractC17621a abstractC17621a = (AbstractC17621a) m53054l(EnumC17624d.NEW_BUILDER);
        abstractC17621a.m53067q(this);
        return abstractC17621a;
    }

    @Override // p001o.rcb
    /* renamed from: c */
    public void mo46523c(mf3 mf3Var) {
        w1e.m53800a().m53803d(this).mo16912i(this, of3.m42166P(mf3Var));
    }

    @Override // p001o.q8
    /* renamed from: d */
    int mo44942d() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return w1e.m53800a().m53803d(this).mo16910g(this, (vn7) obj);
        }
        return false;
    }

    @Override // p001o.rcb
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = w1e.m53800a().m53803d(this).mo16907d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // p001o.q8
    /* renamed from: h */
    void mo44946h(int i) {
        this.memoizedSerializedSize = i;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iMo16909f = w1e.m53800a().m53803d(this).mo16909f(this);
        this.memoizedHashCode = iMo16909f;
        return iMo16909f;
    }

    /* renamed from: i */
    Object m53052i() {
        return m53054l(EnumC17624d.BUILD_MESSAGE_INFO);
    }

    /* renamed from: k */
    public final AbstractC17621a m53053k() {
        return (AbstractC17621a) m53054l(EnumC17624d.NEW_BUILDER);
    }

    /* renamed from: l */
    public Object m53054l(EnumC17624d enumC17624d) {
        return mo16636n(enumC17624d, null, null);
    }

    /* renamed from: m */
    public Object m53055m(EnumC17624d enumC17624d, Object obj) {
        return mo16636n(enumC17624d, obj, null);
    }

    /* renamed from: n */
    public abstract Object mo16636n(EnumC17624d enumC17624d, Object obj, Object obj2);

    @Override // p001o.ucb
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final vn7 getDefaultInstanceForType() {
        return (vn7) m53054l(EnumC17624d.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: s */
    public final boolean m53057s() {
        return m53046t(this, true);
    }

    public String toString() {
        return wcb.m54219e(this, super.toString());
    }

    /* renamed from: u */
    public void m53058u() {
        w1e.m53800a().m53803d(this).mo16905b(this);
    }

    @Override // p001o.rcb
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AbstractC17621a newBuilderForType() {
        return (AbstractC17621a) m53054l(EnumC17624d.NEW_BUILDER);
    }
}
