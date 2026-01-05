package p001o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ji6 implements Serializable {

    /* renamed from: b */
    public static final C14546a f30481b = new C14546a(null);

    /* renamed from: a */
    public final Class f30482a;

    /* renamed from: o.ji6$a */
    public static final class C14546a {
        public C14546a() {
        }

        public /* synthetic */ C14546a(id5 id5Var) {
            this();
        }
    }

    public ji6(Enum[] enumArr) {
        sq8.m48649h(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Class<?> componentType = enumArr.getClass().getComponentType();
        sq8.m48646e(componentType);
        this.f30482a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f30482a.getEnumConstants();
        sq8.m48648g(enumConstants, "getEnumConstants(...)");
        return hi6.m30609a((Enum[]) enumConstants);
    }
}
