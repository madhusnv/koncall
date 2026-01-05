package nk;

import com.google.gson.JsonParseException;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import og.xb;
import pk.AbstractC5973c;
import rk.C6564a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends a0 {

    /* renamed from: e */
    public static final HashMap f24902e;

    /* renamed from: b */
    public final Constructor f24903b;

    /* renamed from: c */
    public final Object[] f24904c;

    /* renamed from: d */
    public final HashMap f24905d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(DefinitionKt.NO_Float_VALUE));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f24902e = map;
    }

    public d0(Class cls, c0 c0Var, boolean z6) throws SecurityException {
        super(c0Var);
        this.f24905d = new HashMap();
        xb xbVar = AbstractC5973c.f29216a;
        Constructor constructorMo11041b = xbVar.mo11041b(cls);
        this.f24903b = constructorMo11041b;
        if (z6) {
            e0.m10012b(null, constructorMo11041b);
        } else {
            AbstractC5973c.m12009f(constructorMo11041b);
        }
        String[] strArrMo11042d = xbVar.mo11042d(cls);
        for (int i10 = 0; i10 < strArrMo11042d.length; i10++) {
            this.f24905d.put(strArrMo11042d[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f24903b.getParameterTypes();
        this.f24904c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f24904c[i11] = f24902e.get(parameterTypes[i11]);
        }
    }

    @Override // nk.a0
    /* renamed from: d */
    public final Object mo10009d() {
        return (Object[]) this.f24904c.clone();
    }

    @Override // nk.a0
    /* renamed from: e */
    public final Object mo10010e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f24903b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            xb xbVar = AbstractC5973c.f29216a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5973c.m12005b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5973c.m12005b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5973c.m12005b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // nk.a0
    /* renamed from: f */
    public final void mo10011f(Object obj, C6564a c6564a, C5103z c5103z) {
        Object[] objArr = (Object[]) obj;
        String str = c5103z.f24996c;
        Integer num = (Integer) this.f24905d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC5973c.m12005b(this.f24903b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo8851b = c5103z.f25000g.mo8851b(c6564a);
        if (objMo8851b != null || !c5103z.f25001h) {
            objArr[iIntValue] = objMo8851b;
        } else {
            StringBuilder sbM7383p = i0.m0.m7383p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM7383p.append(c6564a.mo10021H());
            throw new JsonParseException(sbM7383p.toString());
        }
    }
}
