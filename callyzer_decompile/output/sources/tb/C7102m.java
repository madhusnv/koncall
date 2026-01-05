package tb;

import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5939t;
import qw.C6361k;
import sd.C6808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.m */
/* loaded from: classes.dex */
public final class C7102m implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f34277a;

    public /* synthetic */ C7102m(int i10) {
        this.f34277a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f34277a) {
            case 0:
                return AbstractC5939t.m11866a(((C6808b) ((Map.Entry) obj).getKey()).f32349b, ((C6808b) ((Map.Entry) obj2).getKey()).f32349b);
            case 1:
                return AbstractC5939t.m11866a(((C6808b) obj).f32349b, ((C6808b) obj2).f32349b);
            case 2:
                String str = (String) ((Map.Entry) obj).getKey();
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                return AbstractC5939t.m11866a(lowerCase, lowerCase2);
            default:
                return AbstractC5939t.m11866a((String) ((C6361k) obj).f30755a, (String) ((C6361k) obj2).f30755a);
        }
    }
}
