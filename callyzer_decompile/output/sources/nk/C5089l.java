package nk;

import com.google.android.gms.internal.measurement.j4;
import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import kk.InterfaceC4104x;
import lk.InterfaceC4484a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.l */
/* loaded from: classes.dex */
public final class C5089l implements InterfaceC4104x {

    /* renamed from: c */
    public static final C5088k f24935c;

    /* renamed from: d */
    public static final C5088k f24936d;

    /* renamed from: a */
    public final j4 f24937a;

    /* renamed from: b */
    public final ConcurrentHashMap f24938b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        f24935c = new C5088k(i10);
        f24936d = new C5088k(i10);
    }

    public C5089l(j4 j4Var) {
        this.f24937a = j4Var;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        InterfaceC4484a interfaceC4484a = (InterfaceC4484a) typeToken.getRawType().getAnnotation(InterfaceC4484a.class);
        if (interfaceC4484a == null) {
            return null;
        }
        return m10017b(this.f24937a, c4088h, typeToken, interfaceC4484a, true);
    }

    /* renamed from: b */
    public final AbstractC4103w m10017b(j4 j4Var, C4088h c4088h, TypeToken typeToken, InterfaceC4484a interfaceC4484a, boolean z6) {
        AbstractC4103w abstractC4103wMo8877a;
        Object objMo28i = j4Var.m3395m(TypeToken.get(interfaceC4484a.value()), true).mo28i();
        boolean zNullSafe = interfaceC4484a.nullSafe();
        if (objMo28i instanceof AbstractC4103w) {
            abstractC4103wMo8877a = (AbstractC4103w) objMo28i;
        } else if (objMo28i instanceof InterfaceC4104x) {
            InterfaceC4104x interfaceC4104x = (InterfaceC4104x) objMo28i;
            if (z6) {
                InterfaceC4104x interfaceC4104x2 = (InterfaceC4104x) this.f24938b.putIfAbsent(typeToken.getRawType(), interfaceC4104x);
                if (interfaceC4104x2 != null) {
                    interfaceC4104x = interfaceC4104x2;
                }
            }
            abstractC4103wMo8877a = interfaceC4104x.mo8877a(c4088h, typeToken);
        } else {
            boolean z10 = objMo28i instanceof InterfaceC4096p;
            if (!z10 && !(objMo28i instanceof InterfaceC4091k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo28i.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            h0 h0Var = new h0(z10 ? (InterfaceC4096p) objMo28i : null, objMo28i instanceof InterfaceC4091k ? (InterfaceC4091k) objMo28i : null, c4088h, typeToken, z6 ? f24935c : f24936d, zNullSafe);
            zNullSafe = false;
            abstractC4103wMo8877a = h0Var;
        }
        return (abstractC4103wMo8877a == null || !zNullSafe) ? abstractC4103wMo8877a : abstractC4103wMo8877a.m8876a();
    }
}
