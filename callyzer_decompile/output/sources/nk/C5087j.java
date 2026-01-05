package nk;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import kk.AbstractC4103w;
import lk.InterfaceC4485b;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.j */
/* loaded from: classes.dex */
public final class C5087j extends AbstractC4103w {

    /* renamed from: d */
    public static final C5086i f24931d = new C5086i();

    /* renamed from: a */
    public final HashMap f24932a = new HashMap();

    /* renamed from: b */
    public final HashMap f24933b = new HashMap();

    /* renamed from: c */
    public final HashMap f24934c = new HashMap();

    public C5087j(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC4485b interfaceC4485b = (InterfaceC4485b) field2.getAnnotation(InterfaceC4485b.class);
                if (interfaceC4485b != null) {
                    strName = interfaceC4485b.value();
                    for (String str : interfaceC4485b.alternate()) {
                        this.f24932a.put(str, r42);
                    }
                }
                this.f24932a.put(strName, r42);
                this.f24933b.put(string, r42);
                this.f24934c.put(r42, strName);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        String strC0 = c6564a.C0();
        Enum r02 = (Enum) this.f24932a.get(strC0);
        return r02 == null ? (Enum) this.f24933b.get(strC0) : r02;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c6566c.v0(r32 == null ? null : (String) this.f24934c.get(r32));
    }
}
