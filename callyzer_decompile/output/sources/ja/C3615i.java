package ja;

import ex.InterfaceC2139c;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.i */
/* loaded from: classes.dex */
public final class C3615i implements InterfaceC2139c {

    /* renamed from: b */
    public static final C3615i f19251b = new C3615i(0);

    /* renamed from: c */
    public static final C3615i f19252c = new C3615i(1);

    /* renamed from: d */
    public static final C3615i f19253d = new C3615i(2);

    /* renamed from: a */
    public final /* synthetic */ int f19254a;

    public /* synthetic */ C3615i(int i10) {
        this.f19254a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f19254a) {
            case 0:
                Enum it = (Enum) obj;
                AbstractC4154l.m8923f(it, "it");
                String lowerCase = it.name().toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 1:
                Enum it2 = (Enum) obj;
                AbstractC4154l.m8923f(it2, "it");
                String lowerCase2 = it2.name().toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                return lowerCase2;
            default:
                Enum it3 = (Enum) obj;
                AbstractC4154l.m8923f(it3, "it");
                String lowerCase3 = it3.name().toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase3, "toLowerCase(...)");
                return lowerCase3;
        }
    }
}
