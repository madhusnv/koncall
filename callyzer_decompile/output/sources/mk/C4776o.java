package mk;

import ap.C0390c;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.o */
/* loaded from: classes.dex */
public final class C4776o extends AbstractMap implements Serializable {

    /* renamed from: j */
    public static final C0390c f23806j = new C0390c(19);

    /* renamed from: b */
    public final boolean f23808b;

    /* renamed from: c */
    public C4775n f23809c;

    /* renamed from: f */
    public final C4775n f23812f;

    /* renamed from: g */
    public C4774m f23813g;

    /* renamed from: h */
    public C4774m f23814h;

    /* renamed from: d */
    public int f23810d = 0;

    /* renamed from: e */
    public int f23811e = 0;

    /* renamed from: a */
    public final Comparator f23807a = f23806j;

    public C4776o(boolean z6) {
        this.f23808b = z6;
        this.f23812f = new C4775n(z6);
    }

    /* renamed from: b */
    public final C4775n m9703b(Object obj, boolean z6) {
        int iCompareTo;
        C4775n c4775n;
        C4775n c4775n2 = this.f23809c;
        C0390c c0390c = f23806j;
        Comparator comparator = this.f23807a;
        if (c4775n2 != null) {
            Comparable comparable = comparator == c0390c ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c4775n2.f23802f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c4775n2;
                }
                C4775n c4775n3 = iCompareTo < 0 ? c4775n2.f23798b : c4775n2.f23799c;
                if (c4775n3 == null) {
                    break;
                }
                c4775n2 = c4775n3;
            }
        } else {
            iCompareTo = 0;
        }
        C4775n c4775n4 = c4775n2;
        if (!z6) {
            return null;
        }
        C4775n c4775n5 = this.f23812f;
        if (c4775n4 != null) {
            c4775n = new C4775n(this.f23808b, c4775n4, obj, c4775n5, c4775n5.f23801e);
            if (iCompareTo < 0) {
                c4775n4.f23798b = c4775n;
            } else {
                c4775n4.f23799c = c4775n;
            }
            m9704d(c4775n4, true);
        } else {
            if (comparator == c0390c && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c4775n = new C4775n(this.f23808b, c4775n4, obj, c4775n5, c4775n5.f23801e);
            this.f23809c = c4775n;
        }
        this.f23810d++;
        this.f23811e++;
        return c4775n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f23809c = null;
        this.f23810d = 0;
        this.f23811e++;
        C4775n c4775n = this.f23812f;
        c4775n.f23801e = c4775n;
        c4775n.f23800d = c4775n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C4775n c4775nM9703b = null;
        if (obj != null) {
            try {
                c4775nM9703b = m9703b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c4775nM9703b != null;
    }

    /* renamed from: d */
    public final void m9704d(C4775n c4775n, boolean z6) {
        while (c4775n != null) {
            C4775n c4775n2 = c4775n.f23798b;
            C4775n c4775n3 = c4775n.f23799c;
            int i10 = c4775n2 != null ? c4775n2.f23805j : 0;
            int i11 = c4775n3 != null ? c4775n3.f23805j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                C4775n c4775n4 = c4775n3.f23798b;
                C4775n c4775n5 = c4775n3.f23799c;
                int i13 = (c4775n4 != null ? c4775n4.f23805j : 0) - (c4775n5 != null ? c4775n5.f23805j : 0);
                if (i13 == -1 || (i13 == 0 && !z6)) {
                    m9707i(c4775n);
                } else {
                    m9708j(c4775n3);
                    m9707i(c4775n);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 2) {
                C4775n c4775n6 = c4775n2.f23798b;
                C4775n c4775n7 = c4775n2.f23799c;
                int i14 = (c4775n6 != null ? c4775n6.f23805j : 0) - (c4775n7 != null ? c4775n7.f23805j : 0);
                if (i14 == 1 || (i14 == 0 && !z6)) {
                    m9708j(c4775n);
                } else {
                    m9707i(c4775n2);
                    m9708j(c4775n);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 0) {
                c4775n.f23805j = i10 + 1;
                if (z6) {
                    return;
                }
            } else {
                c4775n.f23805j = Math.max(i10, i11) + 1;
                if (!z6) {
                    return;
                }
            }
            c4775n = c4775n.f23797a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C4774m c4774m = this.f23813g;
        if (c4774m != null) {
            return c4774m;
        }
        C4774m c4774m2 = new C4774m(this, 0);
        this.f23813g = c4774m2;
        return c4774m2;
    }

    /* renamed from: f */
    public final void m9705f(C4775n c4775n, boolean z6) {
        C4775n c4775n2;
        C4775n c4775n3;
        int i10;
        if (z6) {
            C4775n c4775n4 = c4775n.f23801e;
            c4775n4.f23800d = c4775n.f23800d;
            c4775n.f23800d.f23801e = c4775n4;
        }
        C4775n c4775n5 = c4775n.f23798b;
        C4775n c4775n6 = c4775n.f23799c;
        C4775n c4775n7 = c4775n.f23797a;
        int i11 = 0;
        if (c4775n5 == null || c4775n6 == null) {
            if (c4775n5 != null) {
                m9706h(c4775n, c4775n5);
                c4775n.f23798b = null;
            } else if (c4775n6 != null) {
                m9706h(c4775n, c4775n6);
                c4775n.f23799c = null;
            } else {
                m9706h(c4775n, null);
            }
            m9704d(c4775n7, false);
            this.f23810d--;
            this.f23811e++;
            return;
        }
        if (c4775n5.f23805j > c4775n6.f23805j) {
            C4775n c4775n8 = c4775n5.f23799c;
            while (true) {
                C4775n c4775n9 = c4775n8;
                c4775n3 = c4775n5;
                c4775n5 = c4775n9;
                if (c4775n5 == null) {
                    break;
                } else {
                    c4775n8 = c4775n5.f23799c;
                }
            }
        } else {
            C4775n c4775n10 = c4775n6.f23798b;
            while (true) {
                c4775n2 = c4775n6;
                c4775n6 = c4775n10;
                if (c4775n6 == null) {
                    break;
                } else {
                    c4775n10 = c4775n6.f23798b;
                }
            }
            c4775n3 = c4775n2;
        }
        m9705f(c4775n3, false);
        C4775n c4775n11 = c4775n.f23798b;
        if (c4775n11 != null) {
            i10 = c4775n11.f23805j;
            c4775n3.f23798b = c4775n11;
            c4775n11.f23797a = c4775n3;
            c4775n.f23798b = null;
        } else {
            i10 = 0;
        }
        C4775n c4775n12 = c4775n.f23799c;
        if (c4775n12 != null) {
            i11 = c4775n12.f23805j;
            c4775n3.f23799c = c4775n12;
            c4775n12.f23797a = c4775n3;
            c4775n.f23799c = null;
        }
        c4775n3.f23805j = Math.max(i10, i11) + 1;
        m9706h(c4775n, c4775n3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C4775n c4775nM9703b;
        if (obj != null) {
            try {
                c4775nM9703b = m9703b(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c4775nM9703b = null;
        }
        if (c4775nM9703b != null) {
            return c4775nM9703b.f23804h;
        }
        return null;
    }

    /* renamed from: h */
    public final void m9706h(C4775n c4775n, C4775n c4775n2) {
        C4775n c4775n3 = c4775n.f23797a;
        c4775n.f23797a = null;
        if (c4775n2 != null) {
            c4775n2.f23797a = c4775n3;
        }
        if (c4775n3 == null) {
            this.f23809c = c4775n2;
        } else if (c4775n3.f23798b == c4775n) {
            c4775n3.f23798b = c4775n2;
        } else {
            c4775n3.f23799c = c4775n2;
        }
    }

    /* renamed from: i */
    public final void m9707i(C4775n c4775n) {
        C4775n c4775n2 = c4775n.f23798b;
        C4775n c4775n3 = c4775n.f23799c;
        C4775n c4775n4 = c4775n3.f23798b;
        C4775n c4775n5 = c4775n3.f23799c;
        c4775n.f23799c = c4775n4;
        if (c4775n4 != null) {
            c4775n4.f23797a = c4775n;
        }
        m9706h(c4775n, c4775n3);
        c4775n3.f23798b = c4775n;
        c4775n.f23797a = c4775n3;
        int iMax = Math.max(c4775n2 != null ? c4775n2.f23805j : 0, c4775n4 != null ? c4775n4.f23805j : 0) + 1;
        c4775n.f23805j = iMax;
        c4775n3.f23805j = Math.max(iMax, c4775n5 != null ? c4775n5.f23805j : 0) + 1;
    }

    /* renamed from: j */
    public final void m9708j(C4775n c4775n) {
        C4775n c4775n2 = c4775n.f23798b;
        C4775n c4775n3 = c4775n.f23799c;
        C4775n c4775n4 = c4775n2.f23798b;
        C4775n c4775n5 = c4775n2.f23799c;
        c4775n.f23798b = c4775n5;
        if (c4775n5 != null) {
            c4775n5.f23797a = c4775n;
        }
        m9706h(c4775n, c4775n2);
        c4775n2.f23799c = c4775n;
        c4775n.f23797a = c4775n2;
        int iMax = Math.max(c4775n3 != null ? c4775n3.f23805j : 0, c4775n5 != null ? c4775n5.f23805j : 0) + 1;
        c4775n.f23805j = iMax;
        c4775n2.f23805j = Math.max(iMax, c4775n4 != null ? c4775n4.f23805j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C4774m c4774m = this.f23814h;
        if (c4774m != null) {
            return c4774m;
        }
        C4774m c4774m2 = new C4774m(this, 1);
        this.f23814h = c4774m2;
        return c4774m2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f23808b) {
            throw new NullPointerException("value == null");
        }
        C4775n c4775nM9703b = m9703b(obj, true);
        Object obj3 = c4775nM9703b.f23804h;
        c4775nM9703b.f23804h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C4775n c4775nM9703b;
        if (obj != null) {
            try {
                c4775nM9703b = m9703b(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c4775nM9703b = null;
        }
        if (c4775nM9703b != null) {
            m9705f(c4775nM9703b, true);
        }
        if (c4775nM9703b != null) {
            return c4775nM9703b.f23804h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23810d;
    }
}
