package jy;

import a2.AbstractC0030c;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import lx.InterfaceC4564c;
import pg.AbstractC5942w;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class n0 {

    /* renamed from: a */
    public static final InterfaceC3055f[] f19930a = new InterfaceC3055f[0];

    /* renamed from: b */
    public static final InterfaceC2401a[] f19931b = new InterfaceC2401a[0];

    /* renamed from: a */
    public static final C3889z m8420a(InterfaceC2401a interfaceC2401a, String str) {
        return new C3889z(str, new a0(interfaceC2401a));
    }

    /* renamed from: b */
    public static final Set m8421b(InterfaceC3055f interfaceC3055f) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        if (interfaceC3055f instanceof InterfaceC3873j) {
            return ((InterfaceC3873j) interfaceC3055f).mo7286b();
        }
        HashSet hashSet = new HashSet(interfaceC3055f.mo7281f());
        int iMo7281f = interfaceC3055f.mo7281f();
        for (int i10 = 0; i10 < iMo7281f; i10++) {
            hashSet.add(interfaceC3055f.mo7282g(i10));
        }
        return hashSet;
    }

    /* renamed from: c */
    public static final InterfaceC3055f[] m8422c(List list) {
        InterfaceC3055f[] interfaceC3055fArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC3055fArr = (InterfaceC3055f[]) list.toArray(new InterfaceC3055f[0])) == null) ? f19930a : interfaceC3055fArr;
    }

    /* renamed from: d */
    public static final C3884u m8423d(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        AbstractC4154l.m8923f(values, "values");
        C3883t c3883t = new C3883t(str, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r52 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) AbstractC6662l.m12736z(i11, strArr);
            if (strName == null) {
                strName = r52.name();
            }
            c3883t.m8428k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC6662l.m12736z(i11, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    AbstractC4154l.m8923f(annotation, "annotation");
                    int i13 = c3883t.f19944d;
                    List[] listArr = c3883t.f19946f;
                    List arrayList = listArr[i13];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[c3883t.f19944d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        C3884u c3884u = new C3884u(str, values);
        c3884u.f19969c = c3883t;
        return c3884u;
    }

    /* renamed from: e */
    public static final C3884u m8424e(String str, Enum[] values) {
        AbstractC4154l.m8923f(values, "values");
        return new C3884u(str, values);
    }

    /* renamed from: f */
    public static final int m8425f(InterfaceC3055f interfaceC3055f, InterfaceC3055f[] typeParams) {
        AbstractC4154l.m8923f(typeParams, "typeParams");
        int iHashCode = (interfaceC3055f.mo7277a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iMo7281f = interfaceC3055f.mo7281f();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo7281f > 0)) {
                break;
            }
            int i11 = iMo7281f - 1;
            int i12 = i10 * 31;
            String strMo7277a = interfaceC3055f.mo7284i(interfaceC3055f.mo7281f() - iMo7281f).mo7277a();
            if (strMo7277a != null) {
                iHashCode2 = strMo7277a.hashCode();
            }
            i10 = i12 + iHashCode2;
            iMo7281f = i11;
        }
        int iMo7281f2 = interfaceC3055f.mo7281f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo7281f2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iMo7281f2 - 1;
            int i14 = iHashCode3 * 31;
            AbstractC5942w abstractC5942wMo7280e = interfaceC3055f.mo7284i(interfaceC3055f.mo7281f() - iMo7281f2).mo7280e();
            iHashCode3 = i14 + (abstractC5942wMo7280e != null ? abstractC5942wMo7280e.hashCode() : 0);
            iMo7281f2 = i13;
        }
    }

    /* renamed from: g */
    public static final void m8426g(int i10, int i11, InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.mo7282g(i13));
            }
            i12 >>>= 1;
        }
        String serialName = descriptor.mo7277a();
        AbstractC4154l.m8923f(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? AbstractC0030c.m124o(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    /* renamed from: h */
    public static final void m8427h(String str, InterfaceC4564c baseClass) {
        String string;
        AbstractC4154l.m8923f(baseClass, "baseClass");
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        C4147e c4147e = (C4147e) baseClass;
        sb2.append(c4147e.m8914c());
        sb2.append('\'');
        String string2 = sb2.toString();
        if (str == null) {
            string = p020v.a1.m14328h('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbM127r = AbstractC0030c.m127r("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            p020v.a1.m14319B(sbM127r, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM127r.append(c4147e.m8914c());
            sbM127r.append("' has to be sealed and '@Serializable'.");
            string = sbM127r.toString();
        }
        throw new SerializationException(string);
    }
}
