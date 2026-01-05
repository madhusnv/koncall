package nk;

import com.google.gson.reflect.TypeToken;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 implements InterfaceC4104x {

    /* renamed from: a */
    public final /* synthetic */ int f24891a;

    /* renamed from: b */
    public final /* synthetic */ Object f24892b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC4103w f24893c;

    public /* synthetic */ b1(Object obj, AbstractC4103w abstractC4103w, int i10) {
        this.f24891a = i10;
        this.f24892b = obj;
        this.f24893c = abstractC4103w;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        switch (this.f24891a) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.f24892b)) {
                    return this.f24893c;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) this.f24892b).isAssignableFrom(rawType)) {
                    return new C5080c(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) this.f24892b)) {
                    return this.f24893c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f24891a) {
            case 0:
                return "Factory[type=" + ((Class) this.f24892b).getName() + ",adapter=" + this.f24893c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f24892b).getName() + ",adapter=" + this.f24893c + "]";
            default:
                return super.toString();
        }
    }
}
