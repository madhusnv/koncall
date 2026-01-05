package p001o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class i77 {

    /* renamed from: o.i77$a */
    public interface InterfaceC14204a {
        /* renamed from: a */
        void mo17625a(Object obj, Rect rect);
    }

    /* renamed from: o.i77$b */
    public interface InterfaceC14205b {
        /* renamed from: a */
        Object mo17627a(Object obj, int i);

        /* renamed from: b */
        int mo17628b(Object obj);
    }

    /* renamed from: o.i77$c */
    public static class C14206c implements Comparator {

        /* renamed from: a */
        public final Rect f28178a = new Rect();

        /* renamed from: b */
        public final Rect f28179b = new Rect();

        /* renamed from: c */
        public final boolean f28180c;

        /* renamed from: d */
        public final InterfaceC14204a f28181d;

        public C14206c(boolean z, InterfaceC14204a interfaceC14204a) {
            this.f28180c = z;
            this.f28181d = interfaceC14204a;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f28178a;
            Rect rect2 = this.f28179b;
            this.f28181d.mo17625a(obj, rect);
            this.f28181d.mo17625a(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f28180c ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f28180c ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f28180c ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f28180c ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m31631a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean zM31632b = m31632b(i, rect, rect2);
        if (m31632b(i, rect, rect3) || !zM31632b) {
            return false;
        }
        return !m31640j(i, rect, rect3) || i == 17 || i == 66 || m31641k(i, rect, rect2) < m31643m(i, rect, rect3);
    }

    /* renamed from: b */
    public static boolean m31632b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static Object m31633c(Object obj, InterfaceC14205b interfaceC14205b, InterfaceC14204a interfaceC14204a, Object obj2, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo17628b = interfaceC14205b.mo17628b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i2 = 0; i2 < iMo17628b; i2++) {
            Object objMo17627a = interfaceC14205b.mo17627a(obj, i2);
            if (objMo17627a != obj2) {
                interfaceC14204a.mo17625a(objMo17627a, rect3);
                if (m31638h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = objMo17627a;
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m31634d(Object obj, InterfaceC14205b interfaceC14205b, InterfaceC14204a interfaceC14204a, Object obj2, int i, boolean z, boolean z2) {
        int iMo17628b = interfaceC14205b.mo17628b(obj);
        ArrayList arrayList = new ArrayList(iMo17628b);
        for (int i2 = 0; i2 < iMo17628b; i2++) {
            arrayList.add(interfaceC14205b.mo17627a(obj, i2));
        }
        Collections.sort(arrayList, new C14206c(z, interfaceC14204a));
        if (i == 1) {
            return m31636f(obj2, arrayList, z2);
        }
        if (i == 2) {
            return m31635e(obj2, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static Object m31635e(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static Object m31636f(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m31637g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m31638h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m31639i(rect, rect2, i)) {
            return false;
        }
        if (m31639i(rect, rect3, i) && !m31631a(i, rect, rect2, rect3)) {
            return !m31631a(i, rect, rect3, rect2) && m31637g(m31641k(i, rect, rect2), m31645o(i, rect, rect2)) < m31637g(m31641k(i, rect, rect3), m31645o(i, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m31639i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* renamed from: j */
    public static boolean m31640j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    public static int m31641k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m31642l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m31642l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m31643m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m31644n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m31644n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m31645o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
