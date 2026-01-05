package nk;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.e */
/* loaded from: classes.dex */
public class C5082e implements InterfaceC4104x {
    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        if (typeToken.getRawType() == Date.class) {
            return new C5085h(AbstractC5084g.f24915b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
