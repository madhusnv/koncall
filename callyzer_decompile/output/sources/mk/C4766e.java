package mk;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;
import og.xb;
import pk.AbstractC5973c;
import ym.C8692c;
import ym.InterfaceC8691b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.e */
/* loaded from: classes.dex */
public final class C4766e implements InterfaceC4104x, Cloneable {

    /* renamed from: c */
    public static final C4766e f23778c = new C4766e();

    /* renamed from: a */
    public List f23779a;

    /* renamed from: b */
    public List f23780b;

    public C4766e() {
        List list = Collections.EMPTY_LIST;
        this.f23779a = list;
        this.f23780b = list;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zM9687c = m9687c(rawType, true);
        boolean zM9687c2 = m9687c(rawType, false);
        if (zM9687c || zM9687c2) {
            return new C4765d(this, zM9687c2, zM9687c, c4088h, typeToken);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4766e clone() {
        try {
            return (C4766e) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: c */
    public final boolean m9687c(Class cls, boolean z6) {
        if (!z6 && !Enum.class.isAssignableFrom(cls)) {
            xb xbVar = AbstractC5973c.f29216a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z6 ? this.f23779a : this.f23780b).iterator();
        while (it.hasNext()) {
            ((C8692c) it.next()).getClass();
            if ((cls != null ? (InterfaceC8691b) cls.getAnnotation(InterfaceC8691b.class) : null) != null) {
                return true;
            }
        }
        return false;
    }
}
