package i00;

import java.lang.reflect.Method;
import java.util.Map;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends w0 {

    /* renamed from: c */
    public final /* synthetic */ int f16645c;

    /* renamed from: d */
    public final Method f16646d;

    /* renamed from: e */
    public final int f16647e;

    /* renamed from: f */
    public final boolean f16648f;

    public /* synthetic */ b0(Method method, int i10, boolean z6, int i11) {
        this.f16645c = i11;
        this.f16646d = method;
        this.f16647e = i10;
        this.f16648f = z6;
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        switch (this.f16645c) {
            case 0:
                Map map = (Map) obj;
                int i10 = this.f16647e;
                Method method = this.f16646d;
                if (map == null) {
                    throw w0.m7474m(method, i10, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw w0.m7474m(method, i10, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw w0.m7474m(method, i10, AbstractC5601a.m11238i("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw w0.m7474m(method, i10, "Field map value '" + value + "' converted to null by " + C3096a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    m0Var.m7448a(str, string, this.f16648f);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i11 = this.f16647e;
                Method method2 = this.f16646d;
                if (map2 == null) {
                    throw w0.m7474m(method2, i11, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw w0.m7474m(method2, i11, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw w0.m7474m(method2, i11, AbstractC5601a.m11238i("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    m0Var.m7449b(str2, value2.toString(), this.f16648f);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i12 = this.f16647e;
                Method method3 = this.f16646d;
                if (map3 == null) {
                    throw w0.m7474m(method3, i12, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw w0.m7474m(method3, i12, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw w0.m7474m(method3, i12, AbstractC5601a.m11238i("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw w0.m7474m(method3, i12, "Query map value '" + value3 + "' converted to null by " + C3096a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    m0Var.m7451d(str3, string2, this.f16648f);
                }
                return;
        }
    }
}
