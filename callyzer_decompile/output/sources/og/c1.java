package og;

import al.C0182j;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import id.C3238h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c1 {
    /* renamed from: a */
    public static final C0182j m10569a(C0182j c0182j, String str) {
        String strConcat = str.concat("Response");
        String strConcat2 = str.concat("Result");
        if (!AbstractC4154l.m8918a(c0182j.m415f(), strConcat)) {
            StringBuilder sbM7383p = i0.m0.m7383p("invalid root, expected ", strConcat, "; found `");
            sbM7383p.append((C3238h) c0182j.f555b);
            sbM7383p.append('`');
            throw new DeserializationException(sbM7383p.toString());
        }
        C0182j c0182jM418i = c0182j.m418i();
        if (c0182jM418i != null && AbstractC4154l.m8918a(c0182jM418i.m415f(), strConcat2)) {
            return c0182jM418i;
        }
        StringBuilder sbM7383p2 = i0.m0.m7383p("invalid result, expected ", strConcat2, "; found `");
        sbM7383p2.append(c0182jM418i != null ? (C3238h) c0182jM418i.f555b : null);
        sbM7383p2.append('`');
        throw new DeserializationException(sbM7383p2.toString());
    }
}
