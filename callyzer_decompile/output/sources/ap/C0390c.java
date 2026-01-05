package ap;

import android.view.View;
import c00.C0841h;
import c6.n0;
import c6.v0;
import f8.C2213h;
import f8.C2215j;
import j$.time.LocalDateTime;
import j5.C3592i;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import js.C3850f;
import kn.C4121a;
import kn.C4122b;
import om.C5404f;
import om.C5405g;
import or.C5438a;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5939t;
import qr.AbstractC6297u;
import t6.C7054a;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ap.c */
/* loaded from: classes3.dex */
public final class C0390c implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f3084a;

    public /* synthetic */ C0390c(int i10) {
        this.f3084a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LocalDateTime localDateTime;
        switch (this.f3084a) {
            case 0:
                return AbstractC5939t.m11866a(Integer.valueOf(((C4121a) obj2).f21054a.f23832a), Integer.valueOf(((C4121a) obj).f21054a.f23832a));
            case 1:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 2:
                return AbstractC5939t.m11866a(((C0841h) obj).f5314a, ((C0841h) obj2).f5314a);
            case 3:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 4:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 5:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 6:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 7:
                return AbstractC5939t.m11866a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                return AbstractC5939t.m11866a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 9:
                return AbstractC5939t.m11866a(((C2213h) obj).f10172a, ((C2213h) obj2).f10172a);
            case 10:
                return AbstractC5939t.m11866a(((C2215j) obj).f10184a, ((C2215j) obj2).f10184a);
            case 11:
                String str = ((C3850f) obj).f19821k;
                LocalDateTime localDateTime2 = null;
                if (str != null) {
                    C8800o c8800o = C8800o.f42459a;
                    try {
                        localDateTime = LocalDateTime.parse(str, C8800o.f42462d);
                    } catch (Exception unused) {
                    }
                } else {
                    localDateTime = null;
                }
                String str2 = ((C3850f) obj2).f19821k;
                if (str2 != null) {
                    C8800o c8800o2 = C8800o.f42459a;
                    try {
                        localDateTime2 = LocalDateTime.parse(str2, C8800o.f42462d);
                    } catch (Exception unused2) {
                    }
                }
                return AbstractC5939t.m11866a(localDateTime, localDateTime2);
            case 12:
                C5405g c5405g = (C5405g) obj2;
                LocalDateTime localDateTime3 = c5405g.f27134e;
                if (localDateTime3 == null) {
                    localDateTime3 = c5405g.f27135f;
                }
                C5405g c5405g2 = (C5405g) obj;
                LocalDateTime localDateTime4 = c5405g2.f27134e;
                if (localDateTime4 == null) {
                    localDateTime4 = c5405g2.f27135f;
                }
                return AbstractC5939t.m11866a(localDateTime3, localDateTime4);
            case 13:
                return AbstractC5939t.m11866a(Integer.valueOf(((C5405g) obj2).f27137h), Integer.valueOf(((C5405g) obj).f27137h));
            case 14:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 16:
                return ((C3592i) obj).f19192b - ((C3592i) obj2).f19192b;
            case 17:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 19:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 20:
                return AbstractC5939t.m11866a(Long.valueOf(((C5404f) obj).f27128a), Long.valueOf(((C5404f) obj2).f27128a));
            case 21:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 22:
                return AbstractC5939t.m11866a(Integer.valueOf(((C5438a) obj).f27346a.mo11149a()), Integer.valueOf(((C5438a) obj2).f27346a.mo11149a()));
            case 23:
                Field field = v0.f5527a;
                float fM2455g = n0.m2455g((View) obj);
                float fM2455g2 = n0.m2455g((View) obj2);
                if (fM2455g > fM2455g2) {
                    return -1;
                }
                return fM2455g < fM2455g2 ? 1 : 0;
            case 24:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
            case 25:
                return AbstractC5939t.m11866a(Long.valueOf(((C7054a) obj2).m13349e()), Long.valueOf(((C7054a) obj).m13349e()));
            case 26:
                return AbstractC5939t.m11866a(Long.valueOf(((C7054a) obj2).m13349e()), Long.valueOf(((C7054a) obj).m13349e()));
            case 27:
                return AbstractC5939t.m11866a(Long.valueOf(((C7054a) obj2).m13349e()), Long.valueOf(((C7054a) obj).m13349e()));
            case 28:
                return AbstractC5939t.m11866a(Long.valueOf(((C4122b) obj2).f21065c), Long.valueOf(((C4122b) obj).f21065c));
            default:
                return AbstractC5939t.m11866a(Boolean.valueOf(!((AbstractC6297u) obj).mo12308k()), Boolean.valueOf(!((AbstractC6297u) obj2).mo12308k()));
        }
    }
}
