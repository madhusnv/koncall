package l7;

import android.os.Bundle;
import bx.C0797g;
import hq.C3009n;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import mx.AbstractC4913i;
import mx.C4910f;
import rw.AbstractC6663m;
import zk.AbstractC8987a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a */
    public C4412l f22086a;

    /* renamed from: b */
    public boolean f22087b;

    /* renamed from: a */
    public abstract AbstractC4422v mo9193a();

    /* renamed from: b */
    public final C4412l m9225b() {
        C4412l c4412l = this.f22086a;
        if (c4412l != null) {
            return c4412l;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: d */
    public void mo9226d(List list, d0 d0Var) {
        C0797g c0797g = new C0797g(new C4910f(AbstractC4913i.m9811g(AbstractC6663m.m12766y(list), new C3009n(7, this, d0Var)), false, new hq.d0(20)));
        while (c0797g.hasNext()) {
            m9225b().m9222h((C4409i) c0797g.next());
        }
    }

    /* renamed from: e */
    public void mo9227e(C4412l c4412l) {
        this.f22086a = c4412l;
        this.f22087b = true;
    }

    /* renamed from: f */
    public void mo9228f(C4409i c4409i) {
        AbstractC4422v abstractC4422v = c4409i.f22046b;
        if (abstractC4422v == null) {
            abstractC4422v = null;
        }
        if (abstractC4422v == null) {
            return;
        }
        mo9194c(abstractC4422v, null, AbstractC8987a.m16464a(new hq.d0(15)));
        m9225b().m9218d(c4409i);
    }

    /* renamed from: h */
    public Bundle mo9230h() {
        return null;
    }

    /* renamed from: i */
    public void mo9231i(C4409i c4409i, boolean z6) {
        List list = (List) m9225b().f22080e.f39340a.getValue();
        if (!list.contains(c4409i)) {
            throw new IllegalStateException(("popBackStack was called with " + c4409i + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C4409i c4409i2 = null;
        while (mo9195j()) {
            c4409i2 = (C4409i) listIterator.previous();
            if (AbstractC4154l.m8918a(c4409i2, c4409i)) {
                break;
            }
        }
        if (c4409i2 != null) {
            m9225b().m9219e(c4409i2, z6);
        }
    }

    /* renamed from: j */
    public boolean mo9195j() {
        return true;
    }

    /* renamed from: g */
    public void mo9229g(Bundle bundle) {
    }

    /* renamed from: c */
    public AbstractC4422v mo9194c(AbstractC4422v abstractC4422v, Bundle bundle, d0 d0Var) {
        return abstractC4422v;
    }
}
