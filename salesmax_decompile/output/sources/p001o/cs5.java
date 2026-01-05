package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.AbstractC2348o;
import androidx.navigation.C2332c;
import androidx.navigation.C2345l;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

@AbstractC2348o.b("dialog")
/* loaded from: classes2.dex */
public final class cs5 extends AbstractC2348o {

    /* renamed from: h */
    public static final C12736a f18570h = new C12736a(null);

    /* renamed from: c */
    public final Context f18571c;

    /* renamed from: d */
    public final FragmentManager f18572d;

    /* renamed from: e */
    public final Set f18573e;

    /* renamed from: f */
    public final C12738c f18574f;

    /* renamed from: g */
    public final Map f18575g;

    /* renamed from: o.cs5$a */
    public static final class C12736a {
        public C12736a() {
        }

        public /* synthetic */ C12736a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.cs5$b */
    public static class C12737b extends AbstractC2341h implements r37 {

        /* renamed from: H */
        public String f18576H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12737b(AbstractC2348o abstractC2348o) {
            super(abstractC2348o);
            sq8.m48649h(abstractC2348o, "fragmentNavigator");
        }

        @Override // androidx.navigation.AbstractC2341h
        /* renamed from: O */
        public void mo8532O(Context context, AttributeSet attributeSet) {
            sq8.m48649h(context, "context");
            sq8.m48649h(attributeSet, "attrs");
            super.mo8532O(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, uae.DialogFragmentNavigator);
            sq8.m48648g(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(uae.DialogFragmentNavigator_android_name);
            if (string != null) {
                m21704W(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        /* renamed from: V */
        public final String m21703V() {
            String str = this.f18576H;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
            sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        /* renamed from: W */
        public final C12737b m21704W(String str) {
            sq8.m48649h(str, "className");
            this.f18576H = str;
            return this;
        }

        @Override // androidx.navigation.AbstractC2341h
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C12737b)) {
                return false;
            }
            return super.equals(obj) && sq8.m48644c(this.f18576H, ((C12737b) obj).f18576H);
        }

        @Override // androidx.navigation.AbstractC2341h
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f18576H;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: o.cs5$c */
    public static final class C12738c implements InterfaceC2142k {

        /* renamed from: o.cs5$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f18578a;

            static {
                int[] iArr = new int[AbstractC2139h.a.values().length];
                try {
                    iArr[AbstractC2139h.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC2139h.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f18578a = iArr;
            }
        }

        public C12738c() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            int iNextIndex;
            sq8.m48649h(xcaVar, "source");
            sq8.m48649h(aVar, "event");
            int i = a.f18578a[aVar.ordinal()];
            boolean z = true;
            if (i == 1) {
                DialogFragment dialogFragment = (DialogFragment) xcaVar;
                Iterable iterable = (Iterable) cs5.this.m8949b().m56783b().getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z = false;
                } else {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (sq8.m48644c(((C2332c) it.next()).m8554f(), dialogFragment.getTag())) {
                            break;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return;
                }
                dialogFragment.dismiss();
                return;
            }
            Object obj = null;
            if (i == 2) {
                DialogFragment dialogFragment2 = (DialogFragment) xcaVar;
                for (Object obj2 : (Iterable) cs5.this.m8949b().m56784c().getValue()) {
                    if (sq8.m48644c(((C2332c) obj2).m8554f(), dialogFragment2.getTag())) {
                        obj = obj2;
                    }
                }
                C2332c c2332c = (C2332c) obj;
                if (c2332c != null) {
                    cs5.this.m8949b().mo8621e(c2332c);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                DialogFragment dialogFragment3 = (DialogFragment) xcaVar;
                for (Object obj3 : (Iterable) cs5.this.m8949b().m56784c().getValue()) {
                    if (sq8.m48644c(((C2332c) obj3).m8554f(), dialogFragment3.getTag())) {
                        obj = obj3;
                    }
                }
                C2332c c2332c2 = (C2332c) obj;
                if (c2332c2 != null) {
                    cs5.this.m8949b().mo8621e(c2332c2);
                }
                dialogFragment3.getLifecycle().mo6524d(this);
                return;
            }
            DialogFragment dialogFragment4 = (DialogFragment) xcaVar;
            if (dialogFragment4.requireDialog().isShowing()) {
                return;
            }
            List list = (List) cs5.this.m8949b().m56783b().getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (sq8.m48644c(((C2332c) listIterator.previous()).m8554f(), dialogFragment4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            C2332c c2332c3 = (C2332c) kh3.i0(list, iNextIndex);
            if (!sq8.m48644c(kh3.s0(list), c2332c3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Dialog ");
                sb.append(dialogFragment4);
                sb.append(" was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (c2332c3 != null) {
                cs5.this.m21702s(iNextIndex, c2332c3, false);
            }
        }
    }

    public cs5(Context context, FragmentManager fragmentManager) {
        sq8.m48649h(context, "context");
        sq8.m48649h(fragmentManager, "fragmentManager");
        this.f18571c = context;
        this.f18572d = fragmentManager;
        this.f18573e = new LinkedHashSet();
        this.f18574f = new C12738c();
        this.f18575g = new LinkedHashMap();
    }

    /* renamed from: r */
    public static final void m21698r(cs5 cs5Var, FragmentManager fragmentManager, Fragment fragment) {
        sq8.m48649h(cs5Var, "this$0");
        sq8.m48649h(fragmentManager, "<anonymous parameter 0>");
        sq8.m48649h(fragment, "childFragment");
        Set set = cs5Var.f18573e;
        if (azh.m18048a(set).remove(fragment.getTag())) {
            fragment.getLifecycle().mo6521a(cs5Var.f18574f);
        }
        Map map = cs5Var.f18575g;
        azh.m18051d(map).remove(fragment.getTag());
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: e */
    public void mo8714e(List list, C2345l c2345l, AbstractC2348o.a aVar) {
        sq8.m48649h(list, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        if (this.f18572d.W0()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m21701q((C2332c) it.next());
        }
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: f */
    public void mo8715f(xsb xsbVar) {
        AbstractC2139h lifecycle;
        sq8.m48649h(xsbVar, "state");
        super.mo8715f(xsbVar);
        for (C2332c c2332c : (List) xsbVar.m56783b().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.f18572d.m0(c2332c.m8554f());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f18573e.add(c2332c.m8554f());
            } else {
                lifecycle.mo6521a(this.f18574f);
            }
        }
        this.f18572d.m6199k(new wh7() { // from class: o.bs5
            @Override // p001o.wh7
            /* renamed from: a */
            public final void mo6153a(FragmentManager fragmentManager, Fragment fragment) {
                cs5.m21698r(this.f16754a, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: g */
    public void mo8716g(C2332c c2332c) {
        sq8.m48649h(c2332c, "backStackEntry");
        if (this.f18572d.W0()) {
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.f18575g.get(c2332c.m8554f());
        if (dialogFragment == null) {
            Fragment fragmentM0 = this.f18572d.m0(c2332c.m8554f());
            dialogFragment = fragmentM0 instanceof DialogFragment ? (DialogFragment) fragmentM0 : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().mo6524d(this.f18574f);
            dialogFragment.dismiss();
        }
        m21700p(c2332c).show(this.f18572d, c2332c.m8554f());
        m8949b().m56787g(c2332c);
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: j */
    public void mo8719j(C2332c c2332c, boolean z) {
        sq8.m48649h(c2332c, "popUpTo");
        if (this.f18572d.W0()) {
            return;
        }
        List list = (List) m8949b().m56783b().getValue();
        int iIndexOf = list.indexOf(c2332c);
        Iterator it = kh3.B0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentM0 = this.f18572d.m0(((C2332c) it.next()).m8554f());
            if (fragmentM0 != null) {
                ((DialogFragment) fragmentM0).dismiss();
            }
        }
        m21702s(iIndexOf, c2332c, z);
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C12737b mo8527a() {
        return new C12737b(this);
    }

    /* renamed from: p */
    public final DialogFragment m21700p(C2332c c2332c) {
        AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
        sq8.m48647f(abstractC2341hM8553e, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C12737b c12737b = (C12737b) abstractC2341hM8553e;
        String strM21703V = c12737b.m21703V();
        if (strM21703V.charAt(0) == '.') {
            strM21703V = this.f18571c.getPackageName() + strM21703V;
        }
        Fragment fragmentMo6226a = this.f18572d.z0().mo6226a(this.f18571c.getClassLoader(), strM21703V);
        sq8.m48648g(fragmentMo6226a, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogFragment.class.isAssignableFrom(fragmentMo6226a.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentMo6226a;
            dialogFragment.setArguments(c2332c.m8551c());
            dialogFragment.getLifecycle().mo6521a(this.f18574f);
            this.f18575g.put(c2332c.m8554f(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + c12737b.m21703V() + " is not an instance of DialogFragment").toString());
    }

    /* renamed from: q */
    public final void m21701q(C2332c c2332c) {
        m21700p(c2332c).show(this.f18572d, c2332c.m8554f());
        C2332c c2332c2 = (C2332c) kh3.s0((List) m8949b().m56783b().getValue());
        boolean zM35708X = kh3.m35708X((Iterable) m8949b().m56784c().getValue(), c2332c2);
        m8949b().m56788l(c2332c);
        if (c2332c2 == null || zM35708X) {
            return;
        }
        m8949b().mo8621e(c2332c2);
    }

    /* renamed from: s */
    public final void m21702s(int i, C2332c c2332c, boolean z) {
        C2332c c2332c2 = (C2332c) kh3.i0((List) m8949b().m56783b().getValue(), i - 1);
        boolean zM35708X = kh3.m35708X((Iterable) m8949b().m56784c().getValue(), c2332c2);
        m8949b().mo8623i(c2332c, z);
        if (c2332c2 == null || zM35708X) {
            return;
        }
        m8949b().mo8621e(c2332c2);
    }
}
