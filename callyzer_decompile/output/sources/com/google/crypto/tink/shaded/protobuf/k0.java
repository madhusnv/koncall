package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends m0 {

    /* renamed from: c */
    public static final Class f7064c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* renamed from: d */
    public static List m4300d(int i10, long j6, Object obj) {
        List list = (List) r1.f7095d.m4373i(j6, obj);
        if (list.isEmpty()) {
            List i0Var = list instanceof j0 ? new i0(i10) : ((list instanceof z0) && (list instanceof f0)) ? ((f0) list).mo4173i(i10) : new ArrayList(i10);
            r1.m4392o(obj, j6, i0Var);
            return i0Var;
        }
        if (f7064c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            r1.m4392o(obj, j6, arrayList);
            return arrayList;
        }
        if (list instanceof m1) {
            i0 i0Var2 = new i0(list.size() + i10);
            i0Var2.addAll((m1) list);
            r1.m4392o(obj, j6, i0Var2);
            return i0Var2;
        }
        if ((list instanceof z0) && (list instanceof f0)) {
            f0 f0Var = (f0) list;
            if (!((AbstractC1375b) f0Var).f7018a) {
                f0 f0VarMo4173i = f0Var.mo4173i(list.size() + i10);
                r1.m4392o(obj, j6, f0VarMo4173i);
                return f0VarMo4173i;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: a */
    public final void mo4301a(long j6, Object obj) {
        Object objUnmodifiableList;
        List list = (List) r1.f7095d.m4373i(j6, obj);
        if (list instanceof j0) {
            objUnmodifiableList = ((j0) list).mo4281n();
        } else {
            if (f7064c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof z0) && (list instanceof f0)) {
                AbstractC1375b abstractC1375b = (AbstractC1375b) ((f0) list);
                if (abstractC1375b.f7018a) {
                    abstractC1375b.f7018a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        r1.m4392o(obj, j6, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: b */
    public final void mo4302b(Object obj, long j6, Object obj2) {
        List list = (List) r1.f7095d.m4373i(j6, obj2);
        List listM4300d = m4300d(list.size(), j6, obj);
        int size = listM4300d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM4300d.addAll(list);
        }
        if (size > 0) {
            list = listM4300d;
        }
        r1.m4392o(obj, j6, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: c */
    public final List mo4303c(long j6, Object obj) {
        return m4300d(10, j6, obj);
    }
}
