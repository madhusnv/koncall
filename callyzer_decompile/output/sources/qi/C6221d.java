package qi;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import i0.m0;
import java.lang.reflect.InvocationTargetException;
import ji.C3773g;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qj.InterfaceC6237b;
import sj.C6851c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C6221d implements InterfaceC6237b {

    /* renamed from: a */
    public final /* synthetic */ int f30220a;

    /* renamed from: b */
    public final /* synthetic */ Object f30221b;

    public /* synthetic */ C6221d(int i10, Object obj) {
        this.f30220a = i10;
        this.f30221b = obj;
    }

    @Override // qj.InterfaceC6237b
    public final Object get() throws ClassNotFoundException {
        switch (this.f30220a) {
            case 0:
                String str = (String) this.f30221b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new InvalidRegistrarException(AbstractC5601a.m11238i("Could not instantiate ", str, "."), e2);
                } catch (InstantiationException e10) {
                    throw new InvalidRegistrarException(AbstractC5601a.m11238i("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new InvalidRegistrarException(m0.m7378k("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new InvalidRegistrarException(m0.m7378k("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f30221b;
            default:
                return new C6851c((C3773g) this.f30221b);
        }
    }
}
