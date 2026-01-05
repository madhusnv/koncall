package p7;

import android.content.Context;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w;
import androidx.fragment.app.b1;
import androidx.fragment.app.j0;
import androidx.fragment.app.j1;
import androidx.fragment.app.o1;
import com.sun.mail.util.AbstractC1452a;
import d7.AbstractC1646r;
import g8.C2542b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4412l;
import l7.d0;
import l7.m0;
import l7.n0;
import og.qe;
import rw.AbstractC6663m;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("dialog")
/* renamed from: p7.d */
/* loaded from: classes.dex */
public final class C5833d extends n0 {

    /* renamed from: c */
    public final Context f28522c;

    /* renamed from: d */
    public final j1 f28523d;

    /* renamed from: e */
    public final LinkedHashSet f28524e = new LinkedHashSet();

    /* renamed from: f */
    public final C2542b f28525f = new C2542b(2, this);

    /* renamed from: g */
    public final LinkedHashMap f28526g = new LinkedHashMap();

    public C5833d(Context context, j1 j1Var) {
        this.f28522c = context;
        this.f28523d = j1Var;
    }

    @Override // l7.n0
    /* renamed from: a */
    public final AbstractC4422v mo9193a() {
        return new C5831b(this);
    }

    @Override // l7.n0
    /* renamed from: d */
    public final void mo9226d(List list, d0 d0Var) {
        j1 j1Var = this.f28523d;
        if (j1Var.m1164O()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4409i c4409i = (C4409i) it.next();
            m11407k(c4409i).m1273l(j1Var, c4409i.f22050f);
            C4409i c4409i2 = (C4409i) AbstractC6663m.m12751O((List) m9225b().f22080e.f39340a.getValue());
            boolean zM12767z = AbstractC6663m.m12767z((Iterable) m9225b().f22081f.f39340a.getValue(), c4409i2);
            m9225b().m9223i(c4409i);
            if (c4409i2 != null && !zM12767z) {
                m9225b().m9217c(c4409i2);
            }
        }
    }

    @Override // l7.n0
    /* renamed from: e */
    public final void mo9227e(C4412l c4412l) {
        AbstractC1646r lifecycle;
        this.f22086a = c4412l;
        this.f22087b = true;
        Iterator it = ((List) c4412l.f22080e.f39340a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j1 j1Var = this.f28523d;
            if (!zHasNext) {
                j1Var.f2594p.add(new o1() { // from class: p7.a
                    @Override // androidx.fragment.app.o1
                    /* renamed from: a */
                    public final void mo1121a(j1 j1Var2, j0 j0Var) {
                        AbstractC4154l.m8923f(j1Var2, "<unused var>");
                        C5833d c5833d = this.f28519a;
                        LinkedHashSet linkedHashSet = c5833d.f28524e;
                        String tag = j0Var.getTag();
                        kotlin.jvm.internal.d0.m8904a(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            j0Var.getLifecycle().mo5343a(c5833d.f28525f);
                        }
                        LinkedHashMap linkedHashMap = c5833d.f28526g;
                        kotlin.jvm.internal.d0.m8906c(linkedHashMap).remove(j0Var.getTag());
                    }
                });
                return;
            }
            C4409i c4409i = (C4409i) it.next();
            DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = (DialogInterfaceOnCancelListenerC0358w) j1Var.m1158D(c4409i.f22050f);
            if (dialogInterfaceOnCancelListenerC0358w == null || (lifecycle = dialogInterfaceOnCancelListenerC0358w.getLifecycle()) == null) {
                this.f28524e.add(c4409i.f22050f);
            } else {
                lifecycle.mo5343a(this.f28525f);
            }
        }
    }

    @Override // l7.n0
    /* renamed from: f */
    public final void mo9228f(C4409i c4409i) {
        String str = c4409i.f22050f;
        j1 j1Var = this.f28523d;
        if (j1Var.m1164O()) {
            return;
        }
        DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = (DialogInterfaceOnCancelListenerC0358w) this.f28526g.get(str);
        if (dialogInterfaceOnCancelListenerC0358w == null) {
            j0 j0VarM1158D = j1Var.m1158D(str);
            dialogInterfaceOnCancelListenerC0358w = j0VarM1158D instanceof DialogInterfaceOnCancelListenerC0358w ? (DialogInterfaceOnCancelListenerC0358w) j0VarM1158D : null;
        }
        if (dialogInterfaceOnCancelListenerC0358w != null) {
            dialogInterfaceOnCancelListenerC0358w.getLifecycle().mo5346d(this.f28525f);
            dialogInterfaceOnCancelListenerC0358w.m1270i(false, false);
        }
        m11407k(c4409i).m1273l(j1Var, str);
        C4412l c4412lM9225b = m9225b();
        List list = (List) c4412lM9225b.f22080e.f39340a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C4409i c4409i2 = (C4409i) listIterator.previous();
            if (AbstractC4154l.m8918a(c4409i2.f22050f, str)) {
                m1 m1Var = c4412lM9225b.f22078c;
                m1Var.m15399k(null, qe.m10859e(qe.m10859e((Set) m1Var.getValue(), c4409i2), c4409i));
                c4412lM9225b.m9218d(c4409i);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // l7.n0
    /* renamed from: i */
    public final void mo9231i(C4409i c4409i, boolean z6) {
        j1 j1Var = this.f28523d;
        if (j1Var.m1164O()) {
            return;
        }
        List list = (List) m9225b().f22080e.f39340a.getValue();
        int iIndexOf = list.indexOf(c4409i);
        Iterator it = AbstractC6663m.m12758V(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            j0 j0VarM1158D = j1Var.m1158D(((C4409i) it.next()).f22050f);
            if (j0VarM1158D != null) {
                ((DialogInterfaceOnCancelListenerC0358w) j0VarM1158D).m1270i(false, false);
            }
        }
        m11408l(iIndexOf, c4409i, z6);
    }

    /* renamed from: k */
    public final DialogInterfaceOnCancelListenerC0358w m11407k(C4409i c4409i) {
        AbstractC4422v abstractC4422v = c4409i.f22046b;
        AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C5831b c5831b = (C5831b) abstractC4422v;
        String str = c5831b.f28520g;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f28522c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        b1 b1VarM1161I = this.f28523d.m1161I();
        context.getClassLoader();
        j0 j0VarM1119a = b1VarM1161I.m1119a(str);
        AbstractC4154l.m8922e(j0VarM1119a, "instantiate(...)");
        if (DialogInterfaceOnCancelListenerC0358w.class.isAssignableFrom(j0VarM1119a.getClass())) {
            DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = (DialogInterfaceOnCancelListenerC0358w) j0VarM1119a;
            dialogInterfaceOnCancelListenerC0358w.setArguments(c4409i.f22052h.m12163a());
            dialogInterfaceOnCancelListenerC0358w.getLifecycle().mo5343a(this.f28525f);
            this.f28526g.put(c4409i.f22050f, dialogInterfaceOnCancelListenerC0358w);
            return dialogInterfaceOnCancelListenerC0358w;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = c5831b.f28520g;
        if (str2 != null) {
            throw new IllegalArgumentException(AbstractC1452a.m4564k(sb2, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    /* renamed from: l */
    public final void m11408l(int i10, C4409i c4409i, boolean z6) {
        C4409i c4409i2 = (C4409i) AbstractC6663m.m12744H((List) m9225b().f22080e.f39340a.getValue(), i10 - 1);
        boolean zM12767z = AbstractC6663m.m12767z((Iterable) m9225b().f22081f.f39340a.getValue(), c4409i2);
        m9225b().m9220f(c4409i, z6);
        if (c4409i2 == null || zM12767z) {
            return;
        }
        m9225b().m9217c(c4409i2);
    }
}
