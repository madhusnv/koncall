package i00;

import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.storage.ObjectMetadata;
import iz.C3389v;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.g7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends w0 {

    /* renamed from: c */
    public final /* synthetic */ int f16652c = 1;

    /* renamed from: d */
    public final Method f16653d;

    /* renamed from: e */
    public final int f16654e;

    /* renamed from: f */
    public final InterfaceC3106k f16655f;

    /* renamed from: g */
    public final Object f16656g;

    public d0(Method method, int i10, InterfaceC3106k interfaceC3106k, String str) {
        this.f16653d = method;
        this.f16654e = i10;
        this.f16655f = interfaceC3106k;
        this.f16656g = str;
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        int i10 = this.f16652c;
        InterfaceC3106k interfaceC3106k = this.f16655f;
        Object obj2 = this.f16656g;
        Method method = this.f16653d;
        int i11 = this.f16654e;
        switch (i10) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    m0Var.m7450c((C3389v) obj2, (iz.i0) interfaceC3106k.mo2700b(obj));
                    return;
                } catch (IOException e2) {
                    throw w0.m7474m(method, i11, "Unable to convert " + obj + " to RequestBody", e2);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw w0.m7474m(method, i11, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw w0.m7474m(method, i11, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw w0.m7474m(method, i11, AbstractC5601a.m11238i("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {ObjectMetadata.CONTENT_DISPOSITION, AbstractC5601a.m11238i("form-data; name=\"", str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), "Content-Transfer-Encoding", (String) obj2};
                    C3389v c3389v = C3389v.f17980b;
                    m0Var.m7450c(g7.m11657b(strArr), (iz.i0) interfaceC3106k.mo2700b(value));
                }
                return;
        }
    }

    public d0(Method method, int i10, C3389v c3389v, InterfaceC3106k interfaceC3106k) {
        this.f16653d = method;
        this.f16654e = i10;
        this.f16656g = c3389v;
        this.f16655f = interfaceC3106k;
    }
}
