package jy;

import hy.InterfaceC3055f;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.z */
/* loaded from: classes3.dex */
public final class C3889z extends p0 {

    /* renamed from: l */
    public final boolean f19983l;

    public C3889z(String str, a0 a0Var) {
        super(str, a0Var, 1);
        this.f19983l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qw.g] */
    @Override // jy.p0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3889z) {
            InterfaceC3055f interfaceC3055f = (InterfaceC3055f) obj;
            if (this.f19941a.equals(interfaceC3055f.mo7277a())) {
                C3889z c3889z = (C3889z) obj;
                if (c3889z.f19983l && Arrays.equals((InterfaceC3055f[]) this.f19950j.getValue(), (InterfaceC3055f[]) c3889z.f19950j.getValue())) {
                    int iMo7281f = interfaceC3055f.mo7281f();
                    int i10 = this.f19943c;
                    if (i10 == iMo7281f) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (AbstractC4154l.m8918a(mo7284i(i11).mo7277a(), interfaceC3055f.mo7284i(i11).mo7277a()) && AbstractC4154l.m8918a(mo7284i(i11).mo7280e(), interfaceC3055f.mo7284i(i11).mo7280e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // jy.p0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // jy.p0, hy.InterfaceC3055f
    public final boolean isInline() {
        return this.f19983l;
    }
}
