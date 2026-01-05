package ky;

import jy.C3889z;
import jy.a1;
import jy.n0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import ly.C4599w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.n */
/* loaded from: classes3.dex */
public abstract class AbstractC4282n {

    /* renamed from: a */
    public static final C3889z f21688a = n0.m8420a(a1.f19869a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    /* renamed from: a */
    public static final int m8991a(d0 d0Var) {
        try {
            long jM9457i = new C4599w(d0Var.mo8989b()).m9457i();
            if (-2147483648L <= jM9457i && jM9457i <= 2147483647L) {
                return (int) jM9457i;
            }
            throw new NumberFormatException(d0Var.mo8989b() + " is not an Int");
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public static final d0 m8992b(AbstractC4281m abstractC4281m) {
        d0 d0Var = abstractC4281m instanceof d0 ? (d0) abstractC4281m : null;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.a0.m8901a(abstractC4281m.getClass()) + " is not a JsonPrimitive");
    }
}
