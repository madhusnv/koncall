package l7;

import android.os.Bundle;
import e1.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import ly.C4599w;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.n7;
import q7.C6140g;
import qw.C6361k;
import uz.AbstractC7582g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("navigation")
/* renamed from: l7.z */
/* loaded from: classes.dex */
public class C4426z extends n0 {

    /* renamed from: c */
    public final o0 f22146c;

    public C4426z(o0 navigatorProvider) {
        AbstractC4154l.m8923f(navigatorProvider, "navigatorProvider");
        this.f22146c = navigatorProvider;
    }

    @Override // l7.n0
    /* renamed from: d */
    public final void mo9226d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4409i c4409i = (C4409i) it.next();
            AbstractC4422v abstractC4422v = c4409i.f22046b;
            AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            C4423w c4423w = (C4423w) abstractC4422v;
            C4168z c4168z = new C4168z();
            c4168z.f21164a = c4409i.f22052h.m12163a();
            C4599w c4599w = c4423w.f22140g;
            int i10 = c4599w.f22763b;
            String str = c4599w.f22765d;
            if (i10 == 0 && str == null) {
                C6140g c6140g = c4423w.f22135b;
                String superName = c6140g.f29936b;
                if (superName == null) {
                    superName = String.valueOf(c6140g.f29939e);
                }
                AbstractC4154l.m8923f(superName, "superName");
                if (((C4423w) c4599w.f22766e).f22135b.f29939e == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            AbstractC4422v abstractC4422vM9464q = str != null ? c4599w.m9464q(str, false) : (AbstractC4422v) ((v0) c4599w.f22767f).m5646c(i10);
            if (abstractC4422vM9464q == null) {
                if (c4599w.f22764c == null) {
                    String strValueOf = c4599w.f22765d;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(c4599w.f22763b);
                    }
                    c4599w.f22764c = strValueOf;
                }
                String str2 = c4599w.f22764c;
                AbstractC4154l.m8920c(str2);
                throw new IllegalArgumentException(AbstractC5601a.m11238i("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            C6140g c6140g2 = abstractC4422vM9464q.f22135b;
            if (str != null) {
                if (!str.equals(c6140g2.f29940f)) {
                    C4421u c4421uM12189a = c6140g2.m12189a(str);
                    Bundle bundle = c4421uM12189a != null ? c4421uM12189a.f22128b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                        bundleM11799a.putAll(bundle);
                        Bundle bundle2 = (Bundle) c4168z.f21164a;
                        if (bundle2 != null) {
                            bundleM11799a.putAll(bundle2);
                        }
                        c4168z.f21164a = bundleM11799a;
                    }
                }
                if (abstractC4422vM9464q.m9249r().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListM14314a = AbstractC7582g.m14314a(abstractC4422vM9464q.m9249r(), new C4425y(c4168z, 0));
                    if (!arrayListM14314a.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + abstractC4422vM9464q + ". Missing required arguments [" + arrayListM14314a + ']').toString());
                    }
                }
            }
            this.f22146c.m9233b(abstractC4422vM9464q.f22134a).mo9226d(pe.m10833h(m9225b().m9216b(abstractC4422vM9464q, abstractC4422vM9464q.m9246h((Bundle) c4168z.f21164a))), d0Var);
        }
    }

    @Override // l7.n0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C4423w mo9193a() {
        return new C4423w(this);
    }
}
