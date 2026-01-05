package nk;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;
import mk.AbstractC4770i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.a */
/* loaded from: classes.dex */
public class C5078a implements InterfaceC4104x {
    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Type type = typeToken.getType();
        boolean z6 = type instanceof GenericArrayType;
        if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C5079b(c4088h, c4088h.m8858e(TypeToken.get(genericComponentType)), AbstractC4770i.m9695h(genericComponentType));
    }
}
