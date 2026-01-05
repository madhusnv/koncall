package k2;

import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a */
    public final l1 f20432a;

    /* renamed from: b */
    public final boolean f20433b;

    /* renamed from: c */
    public final d2 f20434c;

    /* renamed from: d */
    public final boolean f20435d;

    /* renamed from: e */
    public final Object f20436e;

    /* renamed from: f */
    public boolean f20437f = true;

    public m1(l1 l1Var, Object obj, boolean z6, d2 d2Var, boolean z10) {
        this.f20432a = l1Var;
        this.f20433b = z6;
        this.f20434c = d2Var;
        this.f20435d = z10;
        this.f20436e = obj;
    }

    /* renamed from: a */
    public final Object m8573a() {
        if (this.f20433b) {
            return null;
        }
        Object obj = this.f20436e;
        if (obj != null) {
            return obj;
        }
        AbstractC3967p.m8637d("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
