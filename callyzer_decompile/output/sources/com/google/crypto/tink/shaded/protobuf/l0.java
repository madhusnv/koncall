package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: a */
    public final void mo4301a(long j6, Object obj) {
        ((AbstractC1375b) ((f0) r1.f7095d.m4373i(j6, obj))).f7018a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: b */
    public final void mo4302b(Object obj, long j6, Object obj2) {
        q1 q1Var = r1.f7095d;
        f0 f0VarMo4173i = (f0) q1Var.m4373i(j6, obj);
        f0 f0Var = (f0) q1Var.m4373i(j6, obj2);
        int size = f0VarMo4173i.size();
        int size2 = f0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1375b) f0VarMo4173i).f7018a) {
                f0VarMo4173i = f0VarMo4173i.mo4173i(size2 + size);
            }
            f0VarMo4173i.addAll(f0Var);
        }
        if (size > 0) {
            f0Var = f0VarMo4173i;
        }
        r1.m4392o(obj, j6, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: c */
    public final List mo4303c(long j6, Object obj) {
        f0 f0Var = (f0) r1.f7095d.m4373i(j6, obj);
        if (((AbstractC1375b) f0Var).f7018a) {
            return f0Var;
        }
        int size = f0Var.size();
        f0 f0VarMo4173i = f0Var.mo4173i(size == 0 ? 10 : size * 2);
        r1.m4392o(obj, j6, f0VarMo4173i);
        return f0VarMo4173i;
    }
}
