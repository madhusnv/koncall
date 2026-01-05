package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.dzh;
import p001o.kag;
import p001o.pvh;
import p001o.svh;
import p001o.tvh;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {
    public ArrayList E0;
    public boolean F0;
    public int G0;
    public boolean H0;
    public int I0;

    /* renamed from: androidx.transition.TransitionSet$a */
    public class C2516a extends AbstractC2523b {

        /* renamed from: a */
        public final /* synthetic */ Transition f10388a;

        public C2516a(Transition transition) {
            this.f10388a = transition;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            this.f10388a.r0();
            transition.n0(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    public class C2517b extends AbstractC2523b {
        public C2517b() {
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            TransitionSet.this.E0.remove(transition);
            if (TransitionSet.this.mo9872T()) {
                return;
            }
            TransitionSet.this.g0(Transition.InterfaceC2515j.f10385c, false);
            TransitionSet transitionSet = TransitionSet.this;
            transitionSet.p0 = true;
            transitionSet.g0(Transition.InterfaceC2515j.f10384b, false);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$c */
    public static class C2518c extends AbstractC2523b {

        /* renamed from: a */
        public TransitionSet f10391a;

        public C2518c(TransitionSet transitionSet) {
            this.f10391a = transitionSet;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
            TransitionSet transitionSet = this.f10391a;
            if (transitionSet.H0) {
                return;
            }
            transitionSet.E0();
            this.f10391a.H0 = true;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            TransitionSet transitionSet = this.f10391a;
            int i = transitionSet.G0 - 1;
            transitionSet.G0 = i;
            if (i == 0) {
                transitionSet.H0 = false;
                transitionSet.m9887w();
            }
            transition.n0(this);
        }
    }

    public TransitionSet() {
        this.E0 = new ArrayList();
        this.F0 = true;
        this.H0 = false;
        this.I0 = 0;
    }

    @Override // androidx.transition.Transition
    public void B0(PathMotion pathMotion) {
        super.B0(pathMotion);
        this.I0 |= 4;
        if (this.E0 != null) {
            for (int i = 0; i < this.E0.size(); i++) {
                ((Transition) this.E0.get(i)).B0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void C0(pvh pvhVar) {
        super.C0(pvhVar);
        this.I0 |= 2;
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).C0(pvhVar);
        }
    }

    @Override // androidx.transition.Transition
    public String F0(String str) {
        String strF0 = super.F0(str);
        for (int i = 0; i < this.E0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strF0);
            sb.append("\n");
            sb.append(((Transition) this.E0.get(i)).F0(str + "  "));
            strF0 = sb.toString();
        }
        return strF0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo9876c(Transition.InterfaceC2514i interfaceC2514i) {
        return (TransitionSet) super.mo9876c(interfaceC2514i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo9877f(View view) {
        for (int i = 0; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i)).mo9877f(view);
        }
        return (TransitionSet) super.mo9877f(view);
    }

    public TransitionSet L0(Transition transition) {
        M0(transition);
        long j = this.f10354c;
        if (j >= 0) {
            transition.w0(j);
        }
        if ((this.I0 & 1) != 0) {
            transition.z0(m9859E());
        }
        if ((this.I0 & 2) != 0) {
            transition.C0(m9863I());
        }
        if ((this.I0 & 4) != 0) {
            transition.B0(m9862H());
        }
        if ((this.I0 & 8) != 0) {
            transition.x0(m9858D());
        }
        return this;
    }

    public final void M0(Transition transition) {
        this.E0.add(transition);
        transition.f10350Y = this;
    }

    public Transition N0(int i) {
        if (i < 0 || i >= this.E0.size()) {
            return null;
        }
        return (Transition) this.E0.get(i);
    }

    public int O0() {
        return this.E0.size();
    }

    public final int P0(long j) {
        for (int i = 1; i < this.E0.size(); i++) {
            if (((Transition) this.E0.get(i)).z0 > j) {
                return i - 1;
            }
        }
        return this.E0.size() - 1;
    }

    @Override // androidx.transition.Transition
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public TransitionSet n0(Transition.InterfaceC2514i interfaceC2514i) {
        return (TransitionSet) super.n0(interfaceC2514i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public TransitionSet o0(View view) {
        for (int i = 0; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i)).o0(view);
        }
        return (TransitionSet) super.o0(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: T */
    public boolean mo9872T() {
        for (int i = 0; i < this.E0.size(); i++) {
            if (((Transition) this.E0.get(i)).mo9872T()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public TransitionSet w0(long j) {
        ArrayList arrayList;
        super.w0(j);
        if (this.f10354c >= 0 && (arrayList = this.E0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.E0.get(i)).w0(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.E0.get(i)).mo9806U()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public TransitionSet z0(TimeInterpolator timeInterpolator) {
        this.I0 |= 1;
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.E0.get(i)).z0(timeInterpolator);
            }
        }
        return (TransitionSet) super.z0(timeInterpolator);
    }

    public TransitionSet X0(int i) {
        if (i == 0) {
            this.F0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.F0 = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public TransitionSet D0(long j) {
        return (TransitionSet) super.D0(j);
    }

    public final void Z0() {
        C2518c c2518c = new C2518c(this);
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo9876c(c2518c);
        }
        this.G0 = this.E0.size();
    }

    @Override // androidx.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void i0(View view) {
        super.i0(view);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).i0(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        if (m9874X(svhVar.f46009b)) {
            Iterator it = this.E0.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m9874X(svhVar.f46009b)) {
                    transition.mo9807k(svhVar);
                    svhVar.f46010c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: m */
    public void mo9881m(svh svhVar) {
        super.mo9881m(svhVar);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).mo9881m(svhVar);
        }
    }

    @Override // androidx.transition.Transition
    public void m0() {
        this.x0 = 0L;
        C2517b c2517b = new C2517b();
        for (int i = 0; i < this.E0.size(); i++) {
            Transition transition = (Transition) this.E0.get(i);
            transition.mo9876c(c2517b);
            transition.m0();
            long jM9870Q = transition.m9870Q();
            if (this.F0) {
                this.x0 = Math.max(this.x0, jM9870Q);
            } else {
                long j = this.x0;
                transition.z0 = j;
                this.x0 = j + jM9870Q;
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        if (m9874X(svhVar.f46009b)) {
            Iterator it = this.E0.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m9874X(svhVar.f46009b)) {
                    transition.mo9808n(svhVar);
                    svhVar.f46010c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void p0(View view) {
        super.p0(view);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).p0(view);
        }
    }

    @Override // androidx.transition.Transition
    public void r0() {
        if (this.E0.isEmpty()) {
            E0();
            m9887w();
            return;
        }
        Z0();
        if (this.F0) {
            Iterator it = this.E0.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).r0();
            }
            return;
        }
        for (int i = 1; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i - 1)).mo9876c(new C2516a((Transition) this.E0.get(i)));
        }
        Transition transition = (Transition) this.E0.get(0);
        if (transition != null) {
            transition.r0();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: s */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.E0 = new ArrayList();
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            transitionSet.M0(((Transition) this.E0.get(i)).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public void s0(boolean z) {
        super.s0(z);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).s0(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t0(long j, long j2) {
        boolean z;
        long jM9870Q = m9870Q();
        if (this.f10350Y != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > jM9870Q && j2 > jM9870Q) {
                return;
            }
        }
        boolean z2 = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= jM9870Q && j2 > jM9870Q)) {
            this.p0 = false;
            g0(Transition.InterfaceC2515j.f10383a, z2);
        }
        if (!this.F0) {
            int iP0 = P0(j2);
            if (j >= j2) {
                while (iP0 < this.E0.size()) {
                    Transition transition = (Transition) this.E0.get(iP0);
                    long j3 = transition.z0;
                    z = z2;
                    long j4 = j - j3;
                    if (j4 < 0) {
                        break;
                    }
                    transition.t0(j4, j2 - j3);
                    iP0++;
                    z2 = z;
                }
            } else {
                z = z2;
                while (iP0 >= 0) {
                    Transition transition2 = (Transition) this.E0.get(iP0);
                    long j5 = transition2.z0;
                    long j6 = j - j5;
                    transition2.t0(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        iP0--;
                    }
                }
            }
            if (this.f10350Y == null) {
                if ((j <= jM9870Q || j2 > jM9870Q) && (j >= 0 || j2 < 0)) {
                    return;
                }
                if (j > jM9870Q) {
                    this.p0 = true;
                }
                g0(Transition.InterfaceC2515j.f10384b, z);
                return;
            }
            return;
        }
        for (int i = 0; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i)).t0(j, j2);
        }
        z = z2;
        if (this.f10350Y == null) {
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: u */
    public void mo9885u(ViewGroup viewGroup, tvh tvhVar, tvh tvhVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jM9865L = m9865L();
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.E0.get(i);
            if (jM9865L > 0 && (this.F0 || i == 0)) {
                long jM9865L2 = transition.m9865L();
                if (jM9865L2 > 0) {
                    transition.D0(jM9865L2 + jM9865L);
                } else {
                    transition.D0(jM9865L);
                }
            }
            transition.mo9885u(viewGroup, tvhVar, tvhVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: x */
    public Transition mo9888x(View view, boolean z) {
        for (int i = 0; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i)).mo9888x(view, z);
        }
        return super.mo9888x(view, z);
    }

    @Override // androidx.transition.Transition
    public void x0(Transition.AbstractC2511f abstractC2511f) {
        super.x0(abstractC2511f);
        this.I0 |= 8;
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).x0(abstractC2511f);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: y */
    public Transition mo9889y(Class cls, boolean z) {
        for (int i = 0; i < this.E0.size(); i++) {
            ((Transition) this.E0.get(i)).mo9889y(cls, z);
        }
        return super.mo9889y(cls, z);
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = new ArrayList();
        this.F0 = true;
        this.H0 = false;
        this.I0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31779i);
        X0(dzh.m23978g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
