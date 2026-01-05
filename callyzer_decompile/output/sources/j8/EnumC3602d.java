package j8;

import ai.C0150g;
import ai.EnumC0149f;
import ai.InterfaceC0147d;
import bi.C0665d;
import hi.q0;
import hi.r0;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.d */
/* loaded from: classes.dex */
public final class EnumC3602d {
    private static final /* synthetic */ EnumC3602d[] $VALUES;
    public static final EnumC3602d AES256_SIV;
    private final C0150g mDeterministicAeadKeyTemplate;

    static {
        EnumC0149f enumC0149f = EnumC0149f.TINK;
        q0 q0VarM7182o = r0.m7182o();
        q0VarM7182o.m4460c();
        r0.m7181m((r0) q0VarM7182o.f7128b);
        r0 r0Var = (r0) q0VarM7182o.m4458a();
        C0665d[] c0665dArr = {new C0665d(InterfaceC0147d.class, 9)};
        HashMap map = new HashMap();
        C0665d c0665d = c0665dArr[0];
        Class cls = c0665d.f4217a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, c0665d);
        Class cls2 = c0665dArr[0].f4217a;
        Collections.unmodifiableMap(map);
        EnumC3602d enumC3602d = new EnumC3602d("AES256_SIV", 0, C0150g.m312a("type.googleapis.com/google.crypto.tink.AesSivKey", r0Var.m4157c(), enumC0149f));
        AES256_SIV = enumC3602d;
        $VALUES = new EnumC3602d[]{enumC3602d};
    }

    private EnumC3602d(String str, int i10, C0150g c0150g) {
        this.mDeterministicAeadKeyTemplate = c0150g;
    }

    public static EnumC3602d valueOf(String str) {
        return (EnumC3602d) Enum.valueOf(EnumC3602d.class, str);
    }

    public static EnumC3602d[] values() {
        return (EnumC3602d[]) $VALUES.clone();
    }

    public C0150g getKeyTemplate() {
        return this.mDeterministicAeadKeyTemplate;
    }
}
