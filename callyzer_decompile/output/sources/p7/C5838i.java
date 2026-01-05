package p7;

import a2.AbstractC0030c;
import androidx.fragment.app.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import l7.C4412l;
import qw.C6361k;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p7.i */
/* loaded from: classes.dex */
public final class C5838i {

    /* renamed from: a */
    public final /* synthetic */ C4412l f28539a;

    /* renamed from: b */
    public final /* synthetic */ C5836g f28540b;

    public C5838i(C4412l c4412l, C5836g c5836g) {
        this.f28539a = c4412l;
        this.f28540b = c5836g;
    }

    /* renamed from: a */
    public final void m11413a(j0 fragment, boolean z6) {
        Object obj;
        Object objPrevious;
        C5836g c5836g = this.f28540b;
        ArrayList arrayList = c5836g.f28534g;
        AbstractC4154l.m8923f(fragment, "fragment");
        C4412l c4412l = this.f28539a;
        ArrayList arrayListM12754R = AbstractC6663m.m12754R((Collection) c4412l.f22080e.f39340a.getValue(), (Iterable) c4412l.f22081f.f39340a.getValue());
        ListIterator listIterator = arrayListM12754R.listIterator(arrayListM12754R.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (AbstractC4154l.m8918a(((C4409i) objPrevious).f22050f, fragment.getTag())) {
                    break;
                }
            }
        }
        C4409i c4409i = (C4409i) objPrevious;
        boolean z10 = z6 && arrayList.isEmpty() && fragment.isRemoving();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i10);
            i10++;
            if (AbstractC4154l.m8918a(((C6361k) obj2).f30755a, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        C6361k c6361k = (C6361k) obj;
        if (c6361k != null) {
            arrayList.remove(c6361k);
        }
        if (!z10 && C5836g.m11410n()) {
            fragment.toString();
            Objects.toString(c4409i);
        }
        boolean z11 = c6361k != null && ((Boolean) c6361k.f30756b).booleanValue();
        if (!z6 && !z11 && c4409i == null) {
            throw new IllegalArgumentException(AbstractC0030c.m119j("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c4409i != null) {
            c5836g.m11411l(fragment, c4409i, c4412l);
            if (z10) {
                if (C5836g.m11410n()) {
                    fragment.toString();
                    c4409i.toString();
                }
                c4412l.m9220f(c4409i, false);
            }
        }
    }

    /* renamed from: b */
    public final void m11414b(j0 fragment, boolean z6) {
        Object objPrevious;
        AbstractC4154l.m8923f(fragment, "fragment");
        if (z6) {
            C4412l c4412l = this.f28539a;
            List list = (List) c4412l.f22080e.f39340a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (AbstractC4154l.m8918a(((C4409i) objPrevious).f22050f, fragment.getTag())) {
                        break;
                    }
                }
            }
            C4409i c4409i = (C4409i) objPrevious;
            if (C5836g.m11410n()) {
                fragment.toString();
                Objects.toString(c4409i);
            }
            if (c4409i != null) {
                c4412l.m9221g(c4409i);
            }
        }
    }
}
