package xd;

import com.sun.mail.util.AbstractC1452a;
import ge.C2577i;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import wd.C7998f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.l */
/* loaded from: classes.dex */
public final class C8341l {

    /* renamed from: a */
    public final Object f39952a;

    /* renamed from: b */
    public final C8345p f39953b;

    /* renamed from: c */
    public final C7998f f39954c;

    public C8341l(Object obj, C8345p c8345p, C7998f c7998f) {
        this.f39952a = obj;
        this.f39953b = c8345p;
        this.f39954c = c7998f;
    }

    public final boolean equals(Object obj) {
        boolean zM8918a;
        if (this != obj) {
            if (obj instanceof C8341l) {
                C8341l c8341l = (C8341l) obj;
                Object obj2 = c8341l.f39952a;
                this.f39953b.getClass();
                Object obj3 = this.f39952a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof C2577i) && (obj2 instanceof C2577i)) {
                        C2577i c2577i = (C2577i) obj3;
                        C2577i c2577i2 = (C2577i) obj2;
                        if (!AbstractC4154l.m8918a(c2577i.f14018a, c2577i2.f14018a) || !c2577i.f14019b.equals(c2577i2.f14019b) || c2577i.f14021d != c2577i2.f14021d || !AbstractC4154l.m8918a(c2577i.f14023f, c2577i2.f14023f) || !AbstractC4154l.m8918a(c2577i.f14025h, c2577i2.f14025h) || c2577i.f14027j != c2577i2.f14027j || c2577i.f14028k != c2577i2.f14028k || c2577i.f14029l != c2577i2.f14029l || c2577i.f14030m != c2577i2.f14030m || c2577i.f14031n != c2577i2.f14031n || c2577i.f14032o != c2577i2.f14032o || c2577i.f14033p != c2577i2.f14033p || !c2577i.f14039v.equals(c2577i2.f14039v) || c2577i.f14040w != c2577i2.f14040w || c2577i.f14022e != c2577i2.f14022e || !c2577i.f14041x.equals(c2577i2.f14041x)) {
                            zM8918a = false;
                        }
                    } else {
                        zM8918a = AbstractC4154l.m8918a(obj3, obj2);
                    }
                    if (zM8918a || !this.f39954c.equals(c8341l.f39954c)) {
                    }
                }
                zM8918a = true;
                if (zM8918a) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        this.f39953b.getClass();
        Object obj = this.f39952a;
        if (obj instanceof C2577i) {
            C2577i c2577i = (C2577i) obj;
            iHashCode = c2577i.f14041x.f14062a.hashCode() + ((c2577i.f14022e.hashCode() + ((c2577i.f14040w.hashCode() + ((c2577i.f14039v.hashCode() + ((c2577i.f14033p.hashCode() + ((c2577i.f14032o.hashCode() + ((c2577i.f14031n.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((AbstractC1452a.m4559f(c2577i.f14023f, (c2577i.f14021d.hashCode() + ((c2577i.f14019b.hashCode() + (c2577i.f14018a.hashCode() * 31)) * 923521)) * 961, 31) + Arrays.hashCode(c2577i.f14025h.f17981a)) * 31, 31, c2577i.f14027j), 31, c2577i.f14028k), 31, c2577i.f14029l), 31, c2577i.f14030m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f39954c.hashCode() + (iHashCode * 31);
    }
}
