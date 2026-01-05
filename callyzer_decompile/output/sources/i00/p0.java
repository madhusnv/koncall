package i00;

import a9.C0073l;
import im.f1;
import iz.C3389v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.x509.DisplayText;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0<T> {

    /* renamed from: a */
    public final iz.k0 f16730a;

    /* renamed from: b */
    public final Object f16731b;

    /* renamed from: c */
    public final iz.n0 f16732c;

    public p0(iz.k0 k0Var, Object obj, iz.m0 m0Var) {
        this.f16730a = k0Var;
        this.f16731b = obj;
        this.f16732c = m0Var;
    }

    /* renamed from: a */
    public static p0 m7457a(f1 f1Var) {
        iz.m0 m0Var = iz.n0.f17961b;
        ArrayList arrayList = new ArrayList(20);
        iz.f0 protocol = iz.f0.HTTP_1_1;
        AbstractC4154l.m8923f(protocol, "protocol");
        C0073l c0073l = new C0073l();
        c0073l.m206P("http://localhost/");
        return m7458b(f1Var, new iz.k0(new x0(c0073l), protocol, "OK", DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, null, new C3389v((String[]) arrayList.toArray(new String[0])), m0Var, null, null, null, 0L, 0L, null, iz.r0.J0));
    }

    /* renamed from: b */
    public static p0 m7458b(Object obj, iz.k0 k0Var) {
        if (k0Var.f17932r) {
            return new p0(k0Var, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f16730a.toString();
    }
}
