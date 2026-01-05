package nk;

import com.google.android.gms.internal.measurement.j4;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.sun.mail.util.AbstractC1452a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import kk.AbstractC4103w;
import kk.C4084d;
import kk.C4088h;
import kk.EnumC4098r;
import kk.InterfaceC4082b;
import kk.InterfaceC4104x;
import mk.AbstractC4770i;
import mk.AbstractC4780s;
import mk.C4766e;
import og.xb;
import pk.AbstractC5973c;
import ym.C8692c;
import ym.InterfaceC8691b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements InterfaceC4104x {

    /* renamed from: a */
    public final j4 f24909a;

    /* renamed from: b */
    public final InterfaceC4082b f24910b;

    /* renamed from: c */
    public final C4766e f24911c;

    /* renamed from: d */
    public final C5089l f24912d;

    /* renamed from: e */
    public final List f24913e;

    public e0(j4 j4Var, InterfaceC4082b interfaceC4082b, C4766e c4766e, C5089l c5089l, List list) {
        this.f24909a = j4Var;
        this.f24910b = interfaceC4082b;
        this.f24911c = c4766e;
        this.f24912d = c5089l;
        this.f24913e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m10012b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC4780s.f23816a.mo9709a(obj, accessibleObject)) {
            throw new JsonIOException(AbstractC1452a.m4561h(AbstractC5973c.m12007d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* renamed from: c */
    public static void m10013c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC5973c.m12006c(field) + " and " + AbstractC5973c.m12006c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        xb xbVar = AbstractC5973c.f29216a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new C4084d(2);
        }
        EnumC4098r enumC4098rM9693f = AbstractC4770i.m9693f(this.f24913e);
        if (enumC4098rM9693f == EnumC4098r.BLOCK_ALL) {
            throw new JsonIOException(AbstractC1452a.m4560g("ReflectionAccessFilter does not permit using reflection for ", rawType, ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z6 = enumC4098rM9693f == EnumC4098r.BLOCK_INACCESSIBLE;
        return AbstractC5973c.f29216a.mo11043e(rawType) ? new d0(rawType, m10014d(c4088h, typeToken, rawType, z6, true), z6) : new b0(this.f24909a.m3395m(typeToken, true), m10014d(c4088h, typeToken, rawType, z6, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nk.c0 m10014d(kk.C4088h r29, com.google.gson.reflect.TypeToken r30, java.lang.Class r31, boolean r32, boolean r33) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.e0.m10014d(kk.h, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):nk.c0");
    }

    /* renamed from: e */
    public final boolean m10015e(Field field, boolean z6) {
        boolean z10;
        C4766e c4766e = this.f24911c;
        c4766e.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c4766e.m9687c(field.getType(), z6)) {
            z10 = true;
            break;
        }
        List list = z6 ? c4766e.f23779a : c4766e.f23780b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C8692c) it.next()).getClass();
                if (((InterfaceC8691b) field.getAnnotation(InterfaceC8691b.class)) != null) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return !z10;
    }
}
