package i00;

import b00.C0526k;
import iz.C3393z;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.a */
/* loaded from: classes3.dex */
public class C3096a implements InterfaceC3106k {

    /* renamed from: b */
    public static final C3096a f16633b = new C3096a(0);

    /* renamed from: c */
    public static final C3096a f16634c = new C3096a(1);

    /* renamed from: d */
    public static final C3096a f16635d = new C3096a(2);

    /* renamed from: e */
    public static final C3096a f16636e = new C3096a(3);

    /* renamed from: f */
    public static final C3096a f16637f = new C3096a(4);

    /* renamed from: g */
    public static final C3096a f16638g = new C3096a(5);

    /* renamed from: a */
    public final /* synthetic */ int f16639a;

    public /* synthetic */ C3096a(int i10) {
        this.f16639a = i10;
    }

    /* renamed from: a */
    public List mo7433a(Executor executor) {
        return Collections.singletonList(new C3108m(executor));
    }

    /* JADX WARN: Finally extract failed */
    @Override // i00.InterfaceC3106k
    /* renamed from: b */
    public Object mo2700b(Object obj) {
        switch (this.f16639a) {
            case 0:
                return obj.toString();
            case 1:
                iz.n0 n0Var = (iz.n0) obj;
                try {
                    C0526k c0526k = new C0526k();
                    n0Var.mo7462n().l0(c0526k);
                    C3393z c3393zMo7461j = n0Var.mo7461j();
                    long jMo7460h = n0Var.mo7460h();
                    iz.m0 m0Var = iz.n0.f17961b;
                    iz.m0 m0Var2 = new iz.m0(c3393zMo7461j, jMo7460h, c0526k);
                    n0Var.close();
                    return m0Var2;
                } catch (Throwable th2) {
                    n0Var.close();
                    throw th2;
                }
            case 2:
                return (iz.i0) obj;
            case 3:
                return (iz.n0) obj;
            case 4:
                ((iz.n0) obj).close();
                return qw.a0.f30746a;
            default:
                ((iz.n0) obj).close();
                return null;
        }
    }

    /* renamed from: c */
    public List mo7434c() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: d */
    public String mo7435d(int i10, Method method) {
        return "parameter #" + (i10 + 1);
    }

    /* renamed from: e */
    public Object mo7436e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: f */
    public boolean mo7437f(Method method) {
        return false;
    }
}
