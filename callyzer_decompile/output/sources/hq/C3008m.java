package hq;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import ex.InterfaceC2137a;
import i9.AbstractC3193k;
import i9.w0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Objects;
import k2.C3953b;
import kk.C4089i;
import kk.EnumC4099s;
import kotlin.jvm.internal.AbstractC4154l;
import ky.C4275g;
import ky.C4287s;
import ky.C4292x;
import m8.C4672b;
import na.AbstractC4981c;
import oa.C5332d;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.C6361k;
import rw.AbstractC6674x;
import ud.C7410n;
import ud.C7416t;
import ud.InterfaceC7411o;
import ym.C8694e;
import ym.C8695f;
import ym.C8702m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3008m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16254a;

    public /* synthetic */ C3008m(int i10) {
        this.f16254a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qw.g] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
        Class<?> returnType;
        switch (this.f16254a) {
            case 0:
                return C3953b.m8517t(Boolean.FALSE);
            case 1:
                return C3953b.m8517t(Boolean.FALSE);
            case 2:
                return C3953b.m8517t("");
            case 3:
                return C3953b.m8517t("");
            case 4:
                return C3953b.m8517t(Boolean.FALSE);
            case 5:
                return C3953b.m8517t(Boolean.FALSE);
            case 6:
                return C3953b.m8517t(Boolean.FALSE);
            case 7:
                return "retrieving container credentials";
            case 8:
                return "failed to obtain credentials from container metadata service";
            case 9:
                return "Attempting to load credentials from env vars " + AbstractC3193k.f17192a + '/' + AbstractC3193k.f17193b + '/' + AbstractC3193k.f17194c;
            case 10:
                return "Received 404 when loading profile name. This instance may not have an associated profile.";
            case 11:
                return "Attempting to load token from file using legacy format";
            case 12:
                return "token refresh failed";
            case 13:
                return "retrieving assumed credentials";
            case 14:
                return "sts refused to grant assumed role credentials";
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return "retrieving assumed credentials via web identity";
            case 16:
                return "sts refused to grant assumed role credentials from web identity";
            case 17:
                return "Attempting to load credentials from system properties " + w0.f17299a + '/' + w0.f17300b + '/' + w0.f17301c;
            case 18:
                return "refreshing IMDS token";
            case 19:
                C4089i c4089i = new C4089i();
                EnumC4099s enumC4099s = EnumC4099s.LENIENT;
                Objects.requireNonNull(enumC4099s);
                c4089i.f20991k = enumC4099s;
                c4089i.f20985e.add(new C8702m());
                c4089i.m8865b(LocalDateTime.class, C8694e.f42063a);
                c4089i.m8865b(LocalDate.class, C8695f.f42064a);
                return c4089i.m8864a();
            case 20:
                return "cancelling in-flight call";
            case 21:
                return ky.e0.f21672b;
            case 22:
                return C4292x.f21698b;
            case 23:
                return C4287s.f21695b;
            case 24:
                return ky.b0.f21665b;
            case 25:
                return C4275g.f21677b;
            case 26:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 27:
                try {
                    Method method = (Method) C4672b.f23113d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 28:
                LinkedHashMap linkedHashMapM12779g = AbstractC6674x.m12779g(new C6361k("javaVersion", AbstractC4981c.m9895a("java.version")), new C6361k("jvmName", AbstractC4981c.m9895a("java.vm.name")), new C6361k("jvmVersion", AbstractC4981c.m9895a("java.vm.version")));
                InterfaceC7411o.f35200a.getClass();
                C7410n.f35199b.getClass();
                if (((Boolean) C7416t.f35213c.getValue()).booleanValue()) {
                    Class<?> cls2 = Class.forName("android.os.Build$VERSION");
                    Field declaredField = cls2.getDeclaredField("SDK_INT");
                    Field declaredField2 = cls2.getDeclaredField("RELEASE");
                    linkedHashMapM12779g.put("androidApiVersion", String.valueOf(declaredField.getInt(null)));
                    Object obj = declaredField2.get(null);
                    AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMapM12779g.put("androidRelease", (String) obj);
                }
                return linkedHashMapM12779g;
            default:
                int i10 = C5332d.f26229d;
                return "Checksum validation was skipped because it was a composite checksum";
        }
    }
}
