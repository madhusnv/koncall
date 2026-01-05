package ad;

import com.google.android.gms.internal.measurement.j4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;
import sd.C6808b;
import tb.C7105p;
import ud.InterfaceC7400d;
import zc.AbstractC8927d;
import zc.C8925b;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.k */
/* loaded from: classes.dex */
public final class C0104k implements InterfaceC7400d {

    /* renamed from: a */
    public C8935l f358a = C8935l.f42908c;

    /* renamed from: b */
    public AbstractC8927d f359b = new C8925b("");

    /* renamed from: c */
    public Integer f360c = null;

    /* renamed from: d */
    public final j4 f361d = new j4(0);

    /* renamed from: e */
    public final C0100g f362e = new C0100g();

    /* renamed from: f */
    public final C7105p f363f = new C7105p(0);

    /* renamed from: g */
    public C6808b f364g = null;

    /* renamed from: a */
    public final C0109p m293a() {
        C8935l c8935l = this.f358a;
        AbstractC8927d abstractC8927d = this.f359b;
        Integer num = this.f360c;
        int iIntValue = num != null ? num.intValue() : c8935l.f42912b;
        C0118y c0118yM3393d = this.f361d.m3393d();
        C0103j c0103jM263d = this.f362e.m263d();
        C7105p c7105p = this.f363f;
        c7105p.getClass();
        return new C0109p(c8935l, abstractC8927d, iIntValue, c0118yM3393d, c0103jM263d, new C0119z((C6808b) c7105p.f34290b, (C6808b) c7105p.f34291c), this.f364g);
    }

    @Override // ud.InterfaceC7400d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0104k mo296m() {
        C0104k c0104k = new C0104k();
        c0104k.f358a = this.f358a;
        c0104k.f359b = this.f359b;
        c0104k.f360c = this.f360c;
        j4 j4Var = c0104k.f361d;
        j4Var.getClass();
        j4 other = this.f361d;
        AbstractC4154l.m8923f(other, "other");
        ArrayList arrayList = (ArrayList) j4Var.f6252c;
        arrayList.clear();
        arrayList.addAll((ArrayList) other.f6252c);
        j4Var.f6251b = other.f6251b;
        C0100g c0100g = c0104k.f362e;
        c0100g.getClass();
        C0100g other2 = this.f362e;
        AbstractC4154l.m8923f(other2, "other");
        c0100g.clear();
        for (Map.Entry entry : other2.f349a.entrySet()) {
            c0100g.put(entry.getKey(), (Object) AbstractC6663m.d0((List) entry.getValue()));
        }
        c0100g.f350b = other2.f350b;
        C7105p c7105p = c0104k.f363f;
        c7105p.getClass();
        C7105p other3 = this.f363f;
        AbstractC4154l.m8923f(other3, "other");
        c7105p.f34290b = (C6808b) other3.f34290b;
        c7105p.f34291c = (C6808b) other3.f34291c;
        c0104k.f364g = this.f364g;
        return c0104k;
    }

    /* renamed from: c */
    public final String m295c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f359b);
        Integer num = this.f360c;
        if (num != null) {
            int i10 = this.f358a.f42912b;
            if (num == null || num.intValue() != i10) {
                sb2.append(':');
                sb2.append(this.f360c);
            }
        }
        return sb2.toString();
    }
}
