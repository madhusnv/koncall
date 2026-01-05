package nk;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4101u;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.u */
/* loaded from: classes.dex */
public final class C5098u implements InterfaceC4104x {

    /* renamed from: a */
    public final /* synthetic */ int f24985a;

    /* renamed from: b */
    public final /* synthetic */ Object f24986b;

    public /* synthetic */ C5098u(int i10, Object obj) {
        this.f24985a = i10;
        this.f24986b = obj;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        switch (this.f24985a) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (C5100w) this.f24986b;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new C5102y(c4088h, (InterfaceC4101u) this.f24986b);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (z0) this.f24986b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f24985a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((z0) this.f24986b) + "]";
            default:
                return super.toString();
        }
    }
}
