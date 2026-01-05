package ai;

import hi.o1;
import hi.o2;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.l */
/* loaded from: classes.dex */
public final class C0155l {

    /* renamed from: a */
    public final Object f487a;

    /* renamed from: b */
    public final byte[] f488b;

    /* renamed from: c */
    public final o1 f489c;

    /* renamed from: d */
    public final o2 f490d;

    public C0155l(Object obj, byte[] bArr, o1 o1Var, o2 o2Var) {
        this.f487a = obj;
        this.f488b = Arrays.copyOf(bArr, bArr.length);
        this.f489c = o1Var;
        this.f490d = o2Var;
    }

    /* renamed from: a */
    public final byte[] m360a() {
        byte[] bArr = this.f488b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
