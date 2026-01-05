package fd;

import a2.AbstractC0030c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.gf;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fd.i */
/* loaded from: classes.dex */
public class C2271i {

    /* renamed from: a */
    public final gf f10278a;

    /* renamed from: b */
    public int f10279b;

    /* renamed from: c */
    public final Set f10280c;

    public C2271i(gf kind, Set traits, int i10) {
        AbstractC4154l.m8923f(kind, "kind");
        AbstractC4154l.m8923f(traits, "traits");
        this.f10278a = kind;
        this.f10279b = 0;
        this.f10280c = traits;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdkFieldDescriptor.");
        sb2.append(this.f10278a);
        sb2.append("(traits=");
        return AbstractC0030c.m123n(sb2, AbstractC6663m.m12748L(this.f10280c, ",", null, null, null, 62), ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2271i(gf kind, Set traits) {
        this(kind, traits, 0);
        AbstractC4154l.m8923f(kind, "kind");
        AbstractC4154l.m8923f(traits, "traits");
    }
}
