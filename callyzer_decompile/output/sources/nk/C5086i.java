package nk;

import com.google.gson.reflect.TypeToken;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.i */
/* loaded from: classes.dex */
public class C5086i implements InterfaceC4104x {
    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new C5087j(rawType);
    }
}
