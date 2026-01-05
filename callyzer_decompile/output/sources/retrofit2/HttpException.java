package retrofit2;

import i00.p0;
import iz.k0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    public HttpException(p0 p0Var) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        k0 k0Var = p0Var.f16730a;
        sb2.append(k0Var.f17920d);
        sb2.append(" ");
        sb2.append(k0Var.f17919c);
        super(sb2.toString());
    }
}
