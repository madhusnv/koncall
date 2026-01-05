package k2;

import androidx.compose.runtime.ComposeRuntimeError;
import cj.C0975a;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.p */
/* loaded from: classes.dex */
public abstract class AbstractC3967p {

    /* renamed from: a */
    public static final y0 f20492a = new y0(AWSCognitoLegacyCredentialStore.PROVIDER_KEY);

    /* renamed from: b */
    public static final y0 f20493b = new y0(AWSCognitoLegacyCredentialStore.PROVIDER_KEY);

    /* renamed from: c */
    public static final y0 f20494c = new y0("compositionLocalMap");

    /* renamed from: d */
    public static final y0 f20495d = new y0("providers");

    /* renamed from: e */
    public static final y0 f20496e = new y0("reference");

    /* renamed from: f */
    public static final C0975a f20497f = new C0975a(6);

    /* renamed from: a */
    public static final void m8634a(List list, int i10, int i11) {
        int iM8639f = m8639f(list, i10);
        if (iM8639f < 0) {
            iM8639f = -(iM8639f + 1);
        }
        while (iM8639f < list.size() && ((m0) list.get(iM8639f)).f20430b < i11) {
            list.remove(iM8639f);
        }
    }

    /* renamed from: b */
    public static final void m8635b(u1 u1Var, ArrayList arrayList, int i10) {
        boolean zM8690i = u1Var.m8690i(i10);
        int[] iArr = u1Var.f20578b;
        if (zM8690i) {
            arrayList.add(u1Var.m8692k(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            m8635b(u1Var, arrayList, i12);
        }
    }

    /* renamed from: c */
    public static final void m8636c(String str) {
        throw new ComposeRuntimeError(AbstractC5601a.m11238i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* renamed from: d */
    public static final Void m8637d(String str) {
        throw new ComposeRuntimeError(AbstractC5601a.m11238i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* renamed from: e */
    public static final void m8638e(y1 y1Var, C6739h c6739h) {
        int iM8745o;
        int[] iArr = y1Var.f20611b;
        int i10 = y1Var.f20629t;
        int iM8737f = y1Var.m8737f(y1Var.m8747q(y1Var.m8749s(i10) + i10), iArr);
        for (int iM8737f2 = y1Var.m8737f(y1Var.m8747q(y1Var.f20629t), y1Var.f20611b); iM8737f2 < iM8737f; iM8737f2++) {
            Object obj = y1Var.f20612c[y1Var.m8738g(iM8737f2)];
            int iM8734c = -1;
            if (obj instanceof InterfaceC3960i) {
                c6739h.m12898f((InterfaceC3960i) obj, y1Var.m8745o() - iM8737f2, -1, -1);
            } else if (obj instanceof s1) {
                s1 s1Var = (s1) obj;
                if (!(s1Var.f20549a instanceof C3963l)) {
                    m8641h(y1Var, iM8737f2, obj);
                    int iM8745o2 = y1Var.m8745o() - iM8737f2;
                    C3952a c3952a = s1Var.f20550b;
                    if (c3952a == null || !c3952a.m8486a()) {
                        iM8745o = -1;
                    } else {
                        iM8734c = y1Var.m8734c(c3952a);
                        iM8745o = y1Var.m8745o() - y1Var.m8725M(iM8734c);
                    }
                    c6739h.m12898f(s1Var, iM8745o2, iM8734c, iM8745o);
                }
            } else if (obj instanceof n1) {
                m8641h(y1Var, iM8737f2, obj);
                ((n1) obj).m8579d();
            }
        }
    }

    /* renamed from: f */
    public static final int m8639f(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iM8924g = AbstractC4154l.m8924g(((m0) list.get(i12)).f20430b, i10);
            if (iM8924g < 0) {
                i11 = i12 + 1;
            } else {
                if (iM8924g <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: g */
    public static final void m8640g(y1 y1Var, C6739h c6739h) {
        int iM8745o;
        int[] iArr = y1Var.f20611b;
        int i10 = y1Var.f20629t;
        int iM8737f = y1Var.m8737f(y1Var.m8747q(y1Var.m8749s(i10) + i10), iArr);
        for (int iM8737f2 = y1Var.m8737f(y1Var.m8747q(y1Var.f20629t), y1Var.f20611b); iM8737f2 < iM8737f; iM8737f2++) {
            Object obj = y1Var.f20612c[y1Var.m8738g(iM8737f2)];
            int iM8734c = -1;
            if (obj instanceof InterfaceC3960i) {
                int iM8745o2 = y1Var.m8745o() - iM8737f2;
                Object obj2 = (InterfaceC3960i) obj;
                e1.k0 k0Var = (e1.k0) c6739h.f32185f;
                if (k0Var == null) {
                    int i11 = e1.t0.f9058a;
                    k0Var = new e1.k0();
                    c6739h.f32185f = k0Var;
                }
                k0Var.m5591k(obj2);
                c6739h.m12898f(obj2, iM8745o2, -1, -1);
            }
            if (obj instanceof s1) {
                int iM8745o3 = y1Var.m8745o() - iM8737f2;
                s1 s1Var = (s1) obj;
                C3952a c3952a = s1Var.f20550b;
                if (c3952a == null || !c3952a.m8486a()) {
                    iM8745o = -1;
                } else {
                    iM8734c = y1Var.m8734c(c3952a);
                    iM8745o = y1Var.m8745o() - y1Var.m8725M(iM8734c);
                }
                c6739h.m12898f(s1Var, iM8745o3, iM8734c, iM8745o);
            }
            if (obj instanceof n1) {
                ((n1) obj).m8579d();
            }
        }
        y1Var.m8718F();
    }

    /* renamed from: h */
    public static final void m8641h(y1 y1Var, int i10, Object obj) {
        int iM8738g = y1Var.m8738g(i10);
        Object[] objArr = y1Var.f20612c;
        Object obj2 = objArr[iM8738g];
        objArr[iM8738g] = C3961j.f20408a;
        if (obj == obj2) {
            return;
        }
        m8636c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
