package ge;

import android.graphics.Bitmap;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.sun.mail.util.AbstractC1452a;
import he.EnumC2913d;
import je.C3757a;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import tx.AbstractC7262v;
import tx.m0;
import ux.C7569c;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.c */
/* loaded from: classes.dex */
public final class C2571c {

    /* renamed from: a */
    public final AbstractC7262v f13983a;

    /* renamed from: b */
    public final AbstractC7262v f13984b;

    /* renamed from: c */
    public final AbstractC7262v f13985c;

    /* renamed from: d */
    public final AbstractC7262v f13986d;

    /* renamed from: e */
    public final C3757a f13987e;

    /* renamed from: f */
    public final EnumC2913d f13988f;

    /* renamed from: g */
    public final Bitmap.Config f13989g;

    /* renamed from: h */
    public final boolean f13990h;

    /* renamed from: i */
    public final EnumC2570b f13991i;

    /* renamed from: j */
    public final EnumC2570b f13992j;

    /* renamed from: k */
    public final EnumC2570b f13993k;

    public C2571c() {
        C0496f c0496f = m0.f34659a;
        C7569c c7569c = AbstractC8819m.f42514a.f36446f;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        EnumC2913d enumC2913d = EnumC2913d.AUTOMATIC;
        Bitmap.Config config = AbstractC4066g.f20921b;
        EnumC2570b enumC2570b = EnumC2570b.ENABLED;
        this.f13983a = c7569c;
        this.f13984b = executorC0495e;
        this.f13985c = executorC0495e;
        this.f13986d = executorC0495e;
        this.f13987e = C3757a.f19624a;
        this.f13988f = enumC2913d;
        this.f13989g = config;
        this.f13990h = true;
        this.f13991i = enumC2570b;
        this.f13992j = enumC2570b;
        this.f13993k = enumC2570b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2571c)) {
            return false;
        }
        C2571c c2571c = (C2571c) obj;
        return AbstractC4154l.m8918a(this.f13983a, c2571c.f13983a) && AbstractC4154l.m8918a(this.f13984b, c2571c.f13984b) && AbstractC4154l.m8918a(this.f13985c, c2571c.f13985c) && AbstractC4154l.m8918a(this.f13986d, c2571c.f13986d) && AbstractC4154l.m8918a(this.f13987e, c2571c.f13987e) && this.f13988f == c2571c.f13988f && this.f13989g == c2571c.f13989g && this.f13990h == c2571c.f13990h && this.f13991i == c2571c.f13991i && this.f13992j == c2571c.f13992j && this.f13993k == c2571c.f13993k;
    }

    public final int hashCode() {
        int iHashCode = (this.f13986d.hashCode() + ((this.f13985c.hashCode() + ((this.f13984b.hashCode() + (this.f13983a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f13987e.getClass();
        return this.f13993k.hashCode() + ((this.f13992j.hashCode() + ((this.f13991i.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f13989g.hashCode() + ((this.f13988f.hashCode() + ((C3757a.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f13990h), 923521, false)) * 31)) * 31);
    }
}
