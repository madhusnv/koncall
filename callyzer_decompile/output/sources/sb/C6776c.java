package sb;

import ec.C2011i;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sb.c */
/* loaded from: classes.dex */
public final class C6776c {
    /* renamed from: a */
    public static C6778e m12972a(String accessKeyId, String secretAccessKey, String str, C7126c c7126c, InterfaceC2004b interfaceC2004b, int i10) {
        if ((i10 & 32) != 0) {
            interfaceC2004b = null;
        }
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        if (interfaceC2004b == null) {
            interfaceC2004b = C2011i.f9543a;
        }
        return new C6778e(accessKeyId, secretAccessKey, str, c7126c, interfaceC2004b);
    }
}
