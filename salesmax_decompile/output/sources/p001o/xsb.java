package p001o;

import android.os.Bundle;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.C2332c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class xsb {

    /* renamed from: a */
    public final ReentrantLock f54236a = new ReentrantLock(true);

    /* renamed from: b */
    public final cqb f54237b;

    /* renamed from: c */
    public final cqb f54238c;

    /* renamed from: d */
    public boolean f54239d;

    /* renamed from: e */
    public final q4g f54240e;

    /* renamed from: f */
    public final q4g f54241f;

    public xsb() {
        cqb cqbVarM47838a = s4g.m47838a(ch3.m21246k());
        this.f54237b = cqbVarM47838a;
        cqb cqbVarM47838a2 = s4g.m47838a(nif.m40664e());
        this.f54238c = cqbVarM47838a2;
        this.f54240e = e47.m24268b(cqbVarM47838a);
        this.f54241f = e47.m24268b(cqbVarM47838a2);
    }

    /* renamed from: a */
    public abstract C2332c mo8620a(AbstractC2341h abstractC2341h, Bundle bundle);

    /* renamed from: b */
    public final q4g m56783b() {
        return this.f54240e;
    }

    /* renamed from: c */
    public final q4g m56784c() {
        return this.f54241f;
    }

    /* renamed from: d */
    public final boolean m56785d() {
        return this.f54239d;
    }

    /* renamed from: e */
    public void mo8621e(C2332c c2332c) {
        sq8.m48649h(c2332c, "entry");
        cqb cqbVar = this.f54238c;
        cqbVar.setValue(oif.m42271k((Set) cqbVar.getValue(), c2332c));
    }

    /* renamed from: f */
    public void m56786f(C2332c c2332c) {
        int iNextIndex;
        sq8.m48649h(c2332c, "backStackEntry");
        ReentrantLock reentrantLock = this.f54236a;
        reentrantLock.lock();
        try {
            List listT0 = kh3.T0((Collection) this.f54240e.getValue());
            ListIterator listIterator = listT0.listIterator(listT0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (sq8.m48644c(((C2332c) listIterator.previous()).m8554f(), c2332c.m8554f())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listT0.set(iNextIndex, c2332c);
            this.f54237b.setValue(listT0);
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public void m56787g(C2332c c2332c) {
        sq8.m48649h(c2332c, "backStackEntry");
        List list = (List) this.f54240e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C2332c c2332c2 = (C2332c) listIterator.previous();
            if (sq8.m48644c(c2332c2.m8554f(), c2332c.m8554f())) {
                cqb cqbVar = this.f54238c;
                cqbVar.setValue(oif.m42273m(oif.m42273m((Set) cqbVar.getValue(), c2332c2), c2332c));
                m56786f(c2332c);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    /* renamed from: h */
    public void mo8622h(C2332c c2332c, boolean z) {
        sq8.m48649h(c2332c, "popUpTo");
        ReentrantLock reentrantLock = this.f54236a;
        reentrantLock.lock();
        try {
            cqb cqbVar = this.f54237b;
            Iterable iterable = (Iterable) cqbVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!sq8.m48644c((C2332c) obj, c2332c))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            cqbVar.setValue(arrayList);
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo8623i(C2332c c2332c, boolean z) {
        boolean z2;
        Object objPrevious;
        boolean z3;
        sq8.m48649h(c2332c, "popUpTo");
        Iterable iterable = (Iterable) this.f54238c.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z2 = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C2332c) it.next()) == c2332c) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2) {
            Iterable iterable2 = (Iterable) this.f54240e.getValue();
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                z3 = true;
                if (z3) {
                }
            } else {
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    if (((C2332c) it2.next()) == c2332c) {
                        z3 = false;
                        break;
                    }
                }
                z3 = true;
                if (z3) {
                    return;
                }
            }
        }
        cqb cqbVar = this.f54238c;
        cqbVar.setValue(oif.m42273m((Set) cqbVar.getValue(), c2332c));
        List list = (List) this.f54240e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C2332c c2332c2 = (C2332c) objPrevious;
            if (!sq8.m48644c(c2332c2, c2332c) && ((List) this.f54240e.getValue()).lastIndexOf(c2332c2) < ((List) this.f54240e.getValue()).lastIndexOf(c2332c)) {
                break;
            }
        }
        C2332c c2332c3 = (C2332c) objPrevious;
        if (c2332c3 != null) {
            cqb cqbVar2 = this.f54238c;
            cqbVar2.setValue(oif.m42273m((Set) cqbVar2.getValue(), c2332c3));
        }
        mo8622h(c2332c, z);
    }

    /* renamed from: j */
    public void mo8624j(C2332c c2332c) {
        sq8.m48649h(c2332c, "entry");
        cqb cqbVar = this.f54238c;
        cqbVar.setValue(oif.m42273m((Set) cqbVar.getValue(), c2332c));
    }

    /* renamed from: k */
    public void mo8625k(C2332c c2332c) {
        sq8.m48649h(c2332c, "backStackEntry");
        ReentrantLock reentrantLock = this.f54236a;
        reentrantLock.lock();
        try {
            cqb cqbVar = this.f54237b;
            cqbVar.setValue(kh3.y0((Collection) cqbVar.getValue(), c2332c));
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[RETURN] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56788l(C2332c c2332c) {
        boolean z;
        sq8.m48649h(c2332c, "backStackEntry");
        Iterable iterable = (Iterable) this.f54238c.getValue();
        boolean z2 = true;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C2332c) it.next()) == c2332c) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            Iterable iterable2 = (Iterable) this.f54240e.getValue();
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                z2 = false;
                if (z2) {
                }
            } else {
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    if (((C2332c) it2.next()) == c2332c) {
                        break;
                    }
                }
                z2 = false;
                if (z2) {
                    return;
                }
            }
        }
        C2332c c2332c2 = (C2332c) kh3.s0((List) this.f54240e.getValue());
        if (c2332c2 != null) {
            cqb cqbVar = this.f54238c;
            cqbVar.setValue(oif.m42273m((Set) cqbVar.getValue(), c2332c2));
        }
        cqb cqbVar2 = this.f54238c;
        cqbVar2.setValue(oif.m42273m((Set) cqbVar2.getValue(), c2332c));
        mo8625k(c2332c);
    }

    /* renamed from: m */
    public final void m56789m(boolean z) {
        this.f54239d = z;
    }
}
