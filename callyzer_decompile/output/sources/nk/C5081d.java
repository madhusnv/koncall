package nk;

import com.google.android.gms.internal.measurement.j4;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;
import mk.AbstractC4770i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.d */
/* loaded from: classes.dex */
public final class C5081d implements InterfaceC4104x {

    /* renamed from: a */
    public final /* synthetic */ int f24900a;

    /* renamed from: b */
    public final j4 f24901b;

    public /* synthetic */ C5081d(j4 j4Var, int i10) {
        this.f24900a = i10;
        this.f24901b = j4Var;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.f24900a;
        j4 j4Var = this.f24901b;
        cls = Object.class;
        switch (i10) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC4770i.m9689b(Collection.class.isAssignableFrom(rawType));
                Type typeM9698k = AbstractC4770i.m9698k(type, rawType, AbstractC4770i.m9694g(type, rawType, Collection.class), new HashMap());
                cls = typeM9698k instanceof ParameterizedType ? ((ParameterizedType) typeM9698k).getActualTypeArguments()[0] : Object.class;
                return new C5080c(new C5097t(c4088h, c4088h.m8858e(TypeToken.get(cls)), cls), j4Var.m3395m(typeToken, false));
            default:
                Type type2 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(rawType2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC4770i.m9689b(Map.class.isAssignableFrom(rawType2));
                    Type typeM9698k2 = AbstractC4770i.m9698k(type2, rawType2, AbstractC4770i.m9694g(type2, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeM9698k2 instanceof ParameterizedType ? ((ParameterizedType) typeM9698k2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C5097t(this, new C5097t(c4088h, (type3 == Boolean.TYPE || type3 == Boolean.class) ? m1.f24944c : c4088h.m8858e(TypeToken.get(type3)), type3), new C5097t(c4088h, c4088h.m8858e(TypeToken.get(type4)), type4), j4Var.m3395m(typeToken, false));
        }
    }
}
