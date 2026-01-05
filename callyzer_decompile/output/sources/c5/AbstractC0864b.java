package c5;

import a2.AbstractC0030c;
import androidx.constraintlayout.core.parser.CLParsingException;
import i0.m0;
import java.util.ArrayList;
import java.util.Objects;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.b */
/* loaded from: classes.dex */
public abstract class AbstractC0864b extends AbstractC0865c {

    /* renamed from: e */
    public ArrayList f5408e;

    public AbstractC0864b(char[] cArr) {
        super(cArr);
        this.f5408e = new ArrayList();
    }

    /* renamed from: A */
    public final String m2311A(String str) throws CLParsingException {
        AbstractC0865c abstractC0865cM2320s = m2320s(str);
        if (abstractC0865cM2320s instanceof C0870h) {
            return abstractC0865cM2320s.m2327b();
        }
        StringBuilder sbM127r = AbstractC0030c.m127r("no string found for key <", str, ">, found [", abstractC0865cM2320s != null ? abstractC0865cM2320s.m2330g() : null, "] : ");
        sbM127r.append(abstractC0865cM2320s);
        throw new CLParsingException(sbM127r.toString(), this);
    }

    /* renamed from: B */
    public final String m2312B(String str) {
        AbstractC0865c abstractC0865cM2325y = m2325y(str);
        if (abstractC0865cM2325y instanceof C0870h) {
            return abstractC0865cM2325y.m2327b();
        }
        return null;
    }

    /* renamed from: C */
    public final boolean m2313C(String str) {
        ArrayList arrayList = this.f5408e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AbstractC0865c abstractC0865c = (AbstractC0865c) obj;
            if ((abstractC0865c instanceof C0866d) && ((C0866d) abstractC0865c).m2327b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final ArrayList m2314D() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5408e;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            AbstractC0865c abstractC0865c = (AbstractC0865c) obj;
            if (abstractC0865c instanceof C0866d) {
                arrayList.add(((C0866d) abstractC0865c).m2327b());
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void m2315E(String str, AbstractC0865c abstractC0865c) {
        ArrayList arrayList = this.f5408e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C0866d c0866d = (C0866d) ((AbstractC0865c) obj);
            if (c0866d.m2327b().equals(str)) {
                if (c0866d.f5408e.size() > 0) {
                    c0866d.f5408e.set(0, abstractC0865c);
                    return;
                } else {
                    c0866d.f5408e.add(abstractC0865c);
                    return;
                }
            }
        }
        C0866d c0866d2 = new C0866d(str.toCharArray());
        c0866d2.f5410b = 0L;
        c0866d2.m2331k(str.length() - 1);
        if (c0866d2.f5408e.size() > 0) {
            c0866d2.f5408e.set(0, abstractC0865c);
        } else {
            c0866d2.f5408e.add(abstractC0865c);
        }
        this.f5408e.add(c0866d2);
    }

    @Override // c5.AbstractC0865c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0864b) {
            return this.f5408e.equals(((AbstractC0864b) obj).f5408e);
        }
        return false;
    }

    @Override // c5.AbstractC0865c
    public int hashCode() {
        return Objects.hash(this.f5408e, Integer.valueOf(super.hashCode()));
    }

    /* renamed from: m */
    public final void m2317m(AbstractC0865c abstractC0865c) {
        this.f5408e.add(abstractC0865c);
    }

    @Override // c5.AbstractC0865c
    /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC0864b clone() {
        AbstractC0864b abstractC0864b = (AbstractC0864b) super.clone();
        ArrayList arrayList = new ArrayList(this.f5408e.size());
        ArrayList arrayList2 = this.f5408e;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            AbstractC0865c abstractC0865cClone = ((AbstractC0865c) obj).clone();
            abstractC0865cClone.f5412d = abstractC0864b;
            arrayList.add(abstractC0865cClone);
        }
        abstractC0864b.f5408e = arrayList;
        return abstractC0864b;
    }

    /* renamed from: r */
    public final AbstractC0865c m2319r(int i10) throws CLParsingException {
        if (i10 < 0 || i10 >= this.f5408e.size()) {
            throw new CLParsingException(AbstractC4801l.m9730d(i10, "no element at index "), this);
        }
        return (AbstractC0865c) this.f5408e.get(i10);
    }

    /* renamed from: s */
    public final AbstractC0865c m2320s(String str) throws CLParsingException {
        ArrayList arrayList = this.f5408e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C0866d c0866d = (C0866d) ((AbstractC0865c) obj);
            if (c0866d.m2327b().equals(str)) {
                if (c0866d.f5408e.size() > 0) {
                    return (AbstractC0865c) c0866d.f5408e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(AbstractC5601a.m11238i("no element for key <", str, ">"), this);
    }

    /* renamed from: t */
    public final float m2321t(int i10) throws CLParsingException {
        AbstractC0865c abstractC0865cM2319r = m2319r(i10);
        if (abstractC0865cM2319r != null) {
            return abstractC0865cM2319r.mo2328c();
        }
        throw new CLParsingException(AbstractC4801l.m9730d(i10, "no float at index "), this);
    }

    @Override // c5.AbstractC0865c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f5408e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AbstractC0865c abstractC0865c = (AbstractC0865c) obj;
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(abstractC0865c);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    /* renamed from: v */
    public final float m2322v(String str) throws CLParsingException {
        AbstractC0865c abstractC0865cM2320s = m2320s(str);
        if (abstractC0865cM2320s != null) {
            return abstractC0865cM2320s.mo2328c();
        }
        StringBuilder sbM7383p = m0.m7383p("no float found for key <", str, ">, found [");
        sbM7383p.append(abstractC0865cM2320s.m2330g());
        sbM7383p.append("] : ");
        sbM7383p.append(abstractC0865cM2320s);
        throw new CLParsingException(sbM7383p.toString(), this);
    }

    /* renamed from: w */
    public final int m2323w(int i10) throws CLParsingException {
        AbstractC0865c abstractC0865cM2319r = m2319r(i10);
        if (abstractC0865cM2319r != null) {
            return abstractC0865cM2319r.mo2329e();
        }
        throw new CLParsingException(AbstractC4801l.m9730d(i10, "no int at index "), this);
    }

    /* renamed from: x */
    public final AbstractC0865c m2324x(int i10) {
        if (i10 < 0 || i10 >= this.f5408e.size()) {
            return null;
        }
        return (AbstractC0865c) this.f5408e.get(i10);
    }

    /* renamed from: y */
    public final AbstractC0865c m2325y(String str) {
        ArrayList arrayList = this.f5408e;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            C0866d c0866d = (C0866d) ((AbstractC0865c) obj);
            if (c0866d.m2327b().equals(str)) {
                if (c0866d.f5408e.size() > 0) {
                    return (AbstractC0865c) c0866d.f5408e.get(0);
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    public final String m2326z(int i10) throws CLParsingException {
        AbstractC0865c abstractC0865cM2319r = m2319r(i10);
        if (abstractC0865cM2319r instanceof C0870h) {
            return abstractC0865cM2319r.m2327b();
        }
        throw new CLParsingException(AbstractC4801l.m9730d(i10, "no string at index "), this);
    }
}
