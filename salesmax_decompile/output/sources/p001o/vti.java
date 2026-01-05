package p001o;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class vti {

    /* renamed from: a */
    public final vo0 f50888a;

    /* renamed from: b */
    public final vo0 f50889b;

    /* renamed from: c */
    public final vo0 f50890c;

    public vti(vo0 vo0Var, vo0 vo0Var2, vo0 vo0Var3) {
        this.f50888a = vo0Var;
        this.f50889b = vo0Var2;
        this.f50890c = vo0Var3;
    }

    /* renamed from: A */
    public abstract void mo53412A(byte[] bArr);

    /* renamed from: B */
    public void m53413B(byte[] bArr, int i) {
        mo53448w(i);
        mo53412A(bArr);
    }

    /* renamed from: C */
    public abstract void mo53414C(CharSequence charSequence);

    /* renamed from: D */
    public void m53415D(CharSequence charSequence, int i) {
        mo53448w(i);
        mo53414C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo53416E(int i);

    /* renamed from: F */
    public void m53417F(int i, int i2) {
        mo53448w(i2);
        mo53416E(i);
    }

    /* renamed from: G */
    public abstract void mo53418G(Parcelable parcelable);

    /* renamed from: H */
    public void m53419H(Parcelable parcelable, int i) {
        mo53448w(i);
        mo53418G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo53420I(String str);

    /* renamed from: J */
    public void m53421J(String str, int i) {
        mo53448w(i);
        mo53420I(str);
    }

    /* renamed from: K */
    public void m53422K(xti xtiVar, vti vtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            m53430e(xtiVar.getClass()).invoke(null, xtiVar, vtiVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    /* renamed from: L */
    public void m53423L(xti xtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (xtiVar == null) {
            mo53420I(null);
            return;
        }
        m53425N(xtiVar);
        vti vtiVarMo53427b = mo53427b();
        m53422K(xtiVar, vtiVarMo53427b);
        vtiVarMo53427b.mo53426a();
    }

    /* renamed from: M */
    public void m53424M(xti xtiVar, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mo53448w(i);
        m53423L(xtiVar);
    }

    /* renamed from: N */
    public final void m53425N(xti xtiVar) {
        try {
            mo53420I(m53428c(xtiVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(xtiVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public abstract void mo53426a();

    /* renamed from: b */
    public abstract vti mo53427b();

    /* renamed from: c */
    public final Class m53428c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f50890c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f50890c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    public final Method m53429d(String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f50888a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, vti.class.getClassLoader()).getDeclaredMethod("read", vti.class);
        this.f50888a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m53430e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = (Method) this.f50889b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM53428c = m53428c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM53428c.getDeclaredMethod("write", cls, vti.class);
        this.f50889b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public boolean m53431f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo53432g();

    /* renamed from: h */
    public boolean m53433h(boolean z, int i) {
        return !mo53438m(i) ? z : mo53432g();
    }

    /* renamed from: i */
    public abstract byte[] mo53434i();

    /* renamed from: j */
    public byte[] m53435j(byte[] bArr, int i) {
        return !mo53438m(i) ? bArr : mo53434i();
    }

    /* renamed from: k */
    public abstract CharSequence mo53436k();

    /* renamed from: l */
    public CharSequence m53437l(CharSequence charSequence, int i) {
        return !mo53438m(i) ? charSequence : mo53436k();
    }

    /* renamed from: m */
    public abstract boolean mo53438m(int i);

    /* renamed from: n */
    public xti m53439n(String str, vti vtiVar) {
        try {
            return (xti) m53429d(str).invoke(null, vtiVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    public abstract int mo53440o();

    /* renamed from: p */
    public int m53441p(int i, int i2) {
        return !mo53438m(i2) ? i : mo53440o();
    }

    /* renamed from: q */
    public abstract Parcelable mo53442q();

    /* renamed from: r */
    public Parcelable m53443r(Parcelable parcelable, int i) {
        return !mo53438m(i) ? parcelable : mo53442q();
    }

    /* renamed from: s */
    public abstract String mo53444s();

    /* renamed from: t */
    public String m53445t(String str, int i) {
        return !mo53438m(i) ? str : mo53444s();
    }

    /* renamed from: u */
    public xti m53446u() {
        String strMo53444s = mo53444s();
        if (strMo53444s == null) {
            return null;
        }
        return m53439n(strMo53444s, mo53427b());
    }

    /* renamed from: v */
    public xti m53447v(xti xtiVar, int i) {
        return !mo53438m(i) ? xtiVar : m53446u();
    }

    /* renamed from: w */
    public abstract void mo53448w(int i);

    /* renamed from: x */
    public void m53449x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    public abstract void mo53450y(boolean z);

    /* renamed from: z */
    public void m53451z(boolean z, int i) {
        mo53448w(i);
        mo53450y(z);
    }
}
