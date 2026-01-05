package r8;

import android.os.Parcel;
import android.os.Parcelable;
import e1.C1903e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r8.a */
/* loaded from: classes.dex */
public abstract class AbstractC6484a {

    /* renamed from: a */
    public final C1903e f31151a;

    /* renamed from: b */
    public final C1903e f31152b;

    /* renamed from: c */
    public final C1903e f31153c;

    public AbstractC6484a(C1903e c1903e, C1903e c1903e2, C1903e c1903e3) {
        this.f31151a = c1903e;
        this.f31152b = c1903e2;
        this.f31153c = c1903e3;
    }

    /* renamed from: a */
    public abstract C6485b mo12485a();

    /* renamed from: b */
    public final Class m12486b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1903e c1903e = this.f31153c;
        Class cls2 = (Class) c1903e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1903e.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m12487c(String str) throws NoSuchMethodException, SecurityException {
        C1903e c1903e = this.f31151a;
        Method method = (Method) c1903e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC6484a.class.getClassLoader()).getDeclaredMethod("read", AbstractC6484a.class);
        c1903e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method m12488d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C1903e c1903e = this.f31152b;
        Method method = (Method) c1903e.get(name);
        if (method != null) {
            return method;
        }
        Class clsM12486b = m12486b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM12486b.getDeclaredMethod("write", cls, AbstractC6484a.class);
        c1903e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo12489e(int i10);

    /* renamed from: f */
    public final int m12490f(int i10, int i11) {
        return !mo12489e(i11) ? i10 : ((C6485b) this).f31155e.readInt();
    }

    /* renamed from: g */
    public final Parcelable m12491g(Parcelable parcelable, int i10) {
        if (!mo12489e(i10)) {
            return parcelable;
        }
        return ((C6485b) this).f31155e.readParcelable(C6485b.class.getClassLoader());
    }

    /* renamed from: h */
    public final InterfaceC6486c m12492h() {
        String string = ((C6485b) this).f31155e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC6486c) m12487c(string).invoke(null, mo12485a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    /* renamed from: i */
    public abstract void mo12493i(int i10);

    /* renamed from: j */
    public final void m12494j(int i10, int i11) {
        mo12493i(i11);
        ((C6485b) this).f31155e.writeInt(i10);
    }

    /* renamed from: k */
    public final void m12495k(InterfaceC6486c interfaceC6486c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC6486c == null) {
            ((C6485b) this).f31155e.writeString(null);
            return;
        }
        try {
            ((C6485b) this).f31155e.writeString(m12486b(interfaceC6486c.getClass()).getName());
            C6485b c6485bMo12485a = mo12485a();
            try {
                m12488d(interfaceC6486c.getClass()).invoke(null, interfaceC6486c, c6485bMo12485a);
                Parcel parcel = c6485bMo12485a.f31155e;
                int i10 = c6485bMo12485a.f31159i;
                if (i10 >= 0) {
                    int i11 = c6485bMo12485a.f31154d.get(i10);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(iDataPosition - i11);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(interfaceC6486c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
