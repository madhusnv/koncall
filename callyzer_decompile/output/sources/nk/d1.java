package nk;

import com.google.gson.reflect.TypeToken;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements InterfaceC4104x {

    /* renamed from: a */
    public final /* synthetic */ Class f24906a;

    /* renamed from: b */
    public final /* synthetic */ Class f24907b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC4103w f24908c;

    public d1(Class cls, Class cls2, AbstractC4103w abstractC4103w) {
        this.f24906a = cls;
        this.f24907b = cls2;
        this.f24908c = abstractC4103w;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f24906a || rawType == this.f24907b) {
            return this.f24908c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f24907b.getName() + "+" + this.f24906a.getName() + ",adapter=" + this.f24908c + "]";
    }
}
