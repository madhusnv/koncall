package ym;

import com.google.gson.reflect.TypeToken;
import j$.time.LocalDateTime;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kk.AbstractC4092l;
import kk.AbstractC4103w;
import kk.C4086f;
import kk.C4088h;
import kk.C4090j;
import kk.C4093m;
import kk.C4094n;
import kk.C4095o;
import kk.InterfaceC4104x;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mk.C4776o;
import nx.AbstractC5185w;
import og.pe;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.m */
/* loaded from: classes3.dex */
public final class C8702m implements InterfaceC4104x {
    /* renamed from: b */
    public static void m16100b(Object obj, AbstractC4092l abstractC4092l) {
        String name;
        Package r10;
        String name2;
        if (obj == null || abstractC4092l == null || !(abstractC4092l instanceof C4094n)) {
            return;
        }
        C4776o c4776o = abstractC4092l.m8870b().f20998a;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        AbstractC4154l.m8922e(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                InterfaceC4485b interfaceC4485b = (InterfaceC4485b) field.getAnnotation(InterfaceC4485b.class);
                if (interfaceC4485b == null || (name = interfaceC4485b.value()) == null) {
                    name = field.getName();
                }
                Object obj2 = field.get(obj);
                if (field.isAnnotationPresent(InterfaceC8701l.class) && AbstractC4154l.m8918a(field.getType(), LocalDateTime.class)) {
                    if (obj2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        c4776o.put(name, new C4095o(C8800o.m16212u(C8800o.m16196e((LocalDateTime) obj2))));
                    } else {
                        c4776o.put(name, C4093m.f20997a);
                    }
                } else if (obj2 instanceof List) {
                    C4090j c4090j = (C4090j) c4776o.get(name);
                    if (c4090j == null) {
                        continue;
                    } else {
                        ArrayList arrayList = c4090j.f20996a;
                        int i10 = 0;
                        for (Object obj3 : (Iterable) obj2) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                pe.m10842q();
                                throw null;
                            }
                            if (i10 < arrayList.size()) {
                                m16100b(obj3, (AbstractC4092l) arrayList.get(i10));
                            }
                            i10 = i11;
                        }
                    }
                } else if (obj2 != null && !field.getType().isPrimitive() && !field.getType().isEnum() && ((r10 = field.getType().getPackage()) == null || (name2 = r10.getName()) == null || !AbstractC5185w.m10138t(name2, "java.", false))) {
                    Field[] declaredFields2 = field.getType().getDeclaredFields();
                    AbstractC4154l.m8922e(declaredFields2, "getDeclaredFields(...)");
                    int length = declaredFields2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        }
                        if (declaredFields2[i12].isAnnotationPresent(InterfaceC8701l.class)) {
                            C4094n c4094n = (C4094n) c4776o.get(name);
                            if (c4094n != null) {
                                m16100b(obj2, c4094n);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m16101c(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC4154l.m8922e(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                if (field.isAnnotationPresent(InterfaceC8701l.class) && AbstractC4154l.m8918a(field.getType(), LocalDateTime.class)) {
                    return true;
                }
                if (!field.getType().isPrimitive() && !AbstractC5185w.m10138t(field.getType().getName(), "java.", false)) {
                    Class<?> type = field.getType();
                    AbstractC4154l.m8922e(type, "getType(...)");
                    if (m16101c(type)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16102d(java.lang.Object r13, kk.AbstractC4092l r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.C8702m.m16102d(java.lang.Object, kk.l):void");
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken type) {
        AbstractC4154l.m8923f(type, "type");
        Class rawType = type.getRawType();
        AbstractC4154l.m8920c(rawType);
        if (m16101c(rawType)) {
            return new C4086f(c4088h.m8859f(this, type), this);
        }
        return null;
    }
}
