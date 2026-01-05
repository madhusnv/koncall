package p001o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.jme;

/* loaded from: classes5.dex */
public final class ada {

    /* renamed from: a */
    public final Map f14528a = new HashMap();

    /* renamed from: b */
    public final jme.InterfaceC14614b f14529b;

    /* renamed from: o.ada$a */
    public class C12145a implements vca {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2139h f14530a;

        public C12145a(AbstractC2139h abstractC2139h) {
            this.f14530a = abstractC2139h;
        }

        @Override // p001o.vca
        public void onDestroy() {
            ada.this.f14528a.remove(this.f14530a);
        }

        @Override // p001o.vca
        public void onStart() {
        }

        @Override // p001o.vca
        public void onStop() {
        }
    }

    /* renamed from: o.ada$b */
    public final class C12146b implements kme {

        /* renamed from: a */
        public final FragmentManager f14532a;

        public C12146b(FragmentManager fragmentManager) {
            this.f14532a = fragmentManager;
        }

        @Override // p001o.kme
        /* renamed from: a */
        public Set mo12711a() {
            HashSet hashSet = new HashSet();
            m16902b(this.f14532a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m16902b(FragmentManager fragmentManager, Set set) {
            List listB0 = fragmentManager.B0();
            int size = listB0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) listB0.get(i);
                m16902b(fragment.getChildFragmentManager(), set);
                hme hmeVarM16900a = ada.this.m16900a(fragment.getLifecycle());
                if (hmeVarM16900a != null) {
                    set.add(hmeVarM16900a);
                }
            }
        }
    }

    public ada(jme.InterfaceC14614b interfaceC14614b) {
        this.f14529b = interfaceC14614b;
    }

    /* renamed from: a */
    public hme m16900a(AbstractC2139h abstractC2139h) {
        uqi.m51920a();
        return (hme) this.f14528a.get(abstractC2139h);
    }

    /* renamed from: b */
    public hme m16901b(Context context, ComponentCallbacks2C10724a componentCallbacks2C10724a, AbstractC2139h abstractC2139h, FragmentManager fragmentManager, boolean z) {
        uqi.m51920a();
        hme hmeVarM16900a = m16900a(abstractC2139h);
        if (hmeVarM16900a != null) {
            return hmeVarM16900a;
        }
        uca ucaVar = new uca(abstractC2139h);
        hme hmeVarMo34106a = this.f14529b.mo34106a(componentCallbacks2C10724a, ucaVar, new C12146b(fragmentManager), context);
        this.f14528a.put(abstractC2139h, hmeVarMo34106a);
        ucaVar.mo43994a(new C12145a(abstractC2139h));
        if (z) {
            hmeVarMo34106a.onStart();
        }
        return hmeVarMo34106a;
    }
}
