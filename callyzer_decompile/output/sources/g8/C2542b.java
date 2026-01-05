package g8;

import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import d7.b1;
import d7.c1;
import d7.q0;
import d7.w0;
import i0.m0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p004e.AbstractActivityC1878m;
import p7.AbstractC5832c;
import p7.C5833d;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g8.b */
/* loaded from: classes.dex */
public final class C2542b implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f13872a;

    /* renamed from: b */
    public final Object f13873b;

    public /* synthetic */ C2542b(int i10, Object obj) {
        this.f13872a = i10;
        this.f13873b = obj;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iNextIndex;
        switch (this.f13872a) {
            case 0:
                InterfaceC2547g interfaceC2547g = (InterfaceC2547g) this.f13873b;
                if (enumC1644p != EnumC1644p.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC1649u.getLifecycle().mo5346d(this);
                Bundle bundleM6563a = interfaceC2547g.getSavedStateRegistry().m6563a("androidx.savedstate.Restarter");
                if (bundleM6563a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM6563a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    String str = stringArrayList.get(i10);
                    i10++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, C2542b.class.getClassLoader()).asSubclass(InterfaceC2543c.class);
                        AbstractC4154l.m8920c(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC4154l.m8920c(objNewInstance);
                                if (!(interfaceC2547g instanceof c1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC2547g).toString());
                                }
                                b1 viewModelStore = ((c1) interfaceC2547g).getViewModelStore();
                                C2545e savedStateRegistry = interfaceC2547g.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f8072a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    AbstractC4154l.m8923f(key, "key");
                                    w0 w0Var = (w0) linkedHashMap.get(key);
                                    if (w0Var != null) {
                                        q0.m5334a(w0Var, savedStateRegistry, interfaceC2547g.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m6566d();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(m0.m7378k("Failed to instantiate ", str2), e2);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(AbstractC5601a.m11238i("Class ", str2, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                AbstractActivityC1878m abstractActivityC1878m = (AbstractActivityC1878m) this.f13873b;
                AbstractActivityC1878m.access$ensureViewModelStore(abstractActivityC1878m);
                abstractActivityC1878m.getLifecycle().mo5346d(this);
                return;
            default:
                C5833d c5833d = (C5833d) this.f13873b;
                int i11 = AbstractC5832c.f28521a[enumC1644p.ordinal()];
                if (i11 == 1) {
                    DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = (DialogInterfaceOnCancelListenerC0358w) interfaceC1649u;
                    Iterable iterable = (Iterable) c5833d.m9225b().f22080e.f39340a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC4154l.m8918a(((C4409i) it2.next()).f22050f, dialogInterfaceOnCancelListenerC0358w.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0358w.m1270i(false, false);
                    return;
                }
                Object obj = null;
                if (i11 == 2) {
                    DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w2 = (DialogInterfaceOnCancelListenerC0358w) interfaceC1649u;
                    for (Object obj2 : (Iterable) c5833d.m9225b().f22081f.f39340a.getValue()) {
                        if (AbstractC4154l.m8918a(((C4409i) obj2).f22050f, dialogInterfaceOnCancelListenerC0358w2.getTag())) {
                            obj = obj2;
                        }
                    }
                    C4409i c4409i = (C4409i) obj;
                    if (c4409i != null) {
                        c5833d.m9225b().m9217c(c4409i);
                        return;
                    }
                    return;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w3 = (DialogInterfaceOnCancelListenerC0358w) interfaceC1649u;
                    for (Object obj3 : (Iterable) c5833d.m9225b().f22081f.f39340a.getValue()) {
                        if (AbstractC4154l.m8918a(((C4409i) obj3).f22050f, dialogInterfaceOnCancelListenerC0358w3.getTag())) {
                            obj = obj3;
                        }
                    }
                    C4409i c4409i2 = (C4409i) obj;
                    if (c4409i2 != null) {
                        c5833d.m9225b().m9217c(c4409i2);
                    }
                    dialogInterfaceOnCancelListenerC0358w3.getLifecycle().mo5346d(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w4 = (DialogInterfaceOnCancelListenerC0358w) interfaceC1649u;
                if (dialogInterfaceOnCancelListenerC0358w4.m1272k().isShowing()) {
                    return;
                }
                List list = (List) c5833d.m9225b().f22080e.f39340a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (AbstractC4154l.m8918a(((C4409i) listIterator.previous()).f22050f, dialogInterfaceOnCancelListenerC0358w4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                C4409i c4409i3 = (C4409i) AbstractC6663m.m12744H(list, iNextIndex);
                if (!AbstractC4154l.m8918a(AbstractC6663m.m12751O(list), c4409i3)) {
                    dialogInterfaceOnCancelListenerC0358w4.toString();
                }
                if (c4409i3 != null) {
                    c5833d.m11408l(iNextIndex, c4409i3, false);
                    return;
                }
                return;
        }
    }
}
