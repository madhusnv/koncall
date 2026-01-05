package ai;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import hi.o2;
import hi.q1;
import hi.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.g */
/* loaded from: classes.dex */
public final class C0150g {

    /* renamed from: a */
    public final r1 f481a;

    public C0150g(r1 r1Var) {
        this.f481a = r1Var;
    }

    /* renamed from: a */
    public static C0150g m312a(String str, byte[] bArr, EnumC0149f enumC0149f) {
        o2 o2Var;
        q1 q1VarM7189t = r1.m7189t();
        q1VarM7189t.m4460c();
        r1.m7185m((r1) q1VarM7189t.f7128b, str);
        C1381h c1381hM4277c = AbstractC1382i.m4277c(0, bArr.length, bArr);
        q1VarM7189t.m4460c();
        r1.m7186n((r1) q1VarM7189t.f7128b, c1381hM4277c);
        int i10 = AbstractC0148e.f480b[enumC0149f.ordinal()];
        if (i10 == 1) {
            o2Var = o2.TINK;
        } else if (i10 == 2) {
            o2Var = o2.LEGACY;
        } else if (i10 == 3) {
            o2Var = o2.RAW;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            o2Var = o2.CRUNCHY;
        }
        q1VarM7189t.m4460c();
        r1.m7187o((r1) q1VarM7189t.f7128b, o2Var);
        return new C0150g((r1) q1VarM7189t.m4458a());
    }
}
