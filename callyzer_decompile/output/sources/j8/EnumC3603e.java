package j8;

import ai.C0150g;
import ai.EnumC0149f;
import ai.InterfaceC0144a;
import bi.C0665d;
import hi.f0;
import hi.g0;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.e */
/* loaded from: classes.dex */
public final class EnumC3603e {
    private static final /* synthetic */ EnumC3603e[] $VALUES;
    public static final EnumC3603e AES256_GCM;
    private final C0150g mAeadKeyTemplate;

    static {
        EnumC0149f enumC0149f = EnumC0149f.TINK;
        f0 f0VarM7106o = g0.m7106o();
        f0VarM7106o.m4460c();
        g0.m7105m((g0) f0VarM7106o.f7128b);
        g0 g0Var = (g0) f0VarM7106o.m4458a();
        C0665d[] c0665dArr = {new C0665d(InterfaceC0144a.class, 3)};
        HashMap map = new HashMap();
        C0665d c0665d = c0665dArr[0];
        Class cls = c0665d.f4217a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, c0665d);
        Class cls2 = c0665dArr[0].f4217a;
        Collections.unmodifiableMap(map);
        EnumC3603e enumC3603e = new EnumC3603e("AES256_GCM", 0, C0150g.m312a("type.googleapis.com/google.crypto.tink.AesGcmKey", g0Var.m4157c(), enumC0149f));
        AES256_GCM = enumC3603e;
        $VALUES = new EnumC3603e[]{enumC3603e};
    }

    private EnumC3603e(String str, int i10, C0150g c0150g) {
        this.mAeadKeyTemplate = c0150g;
    }

    public static EnumC3603e valueOf(String str) {
        return (EnumC3603e) Enum.valueOf(EnumC3603e.class, str);
    }

    public static EnumC3603e[] values() {
        return (EnumC3603e[]) $VALUES.clone();
    }

    public C0150g getKeyTemplate() {
        return this.mAeadKeyTemplate;
    }
}
