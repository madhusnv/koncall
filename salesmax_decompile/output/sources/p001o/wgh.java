package p001o;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class wgh {

    /* renamed from: a */
    public static final vgh f51956a = new C17860e(null, false);

    /* renamed from: b */
    public static final vgh f51957b = new C17860e(null, true);

    /* renamed from: c */
    public static final vgh f51958c;

    /* renamed from: d */
    public static final vgh f51959d;

    /* renamed from: e */
    public static final vgh f51960e;

    /* renamed from: f */
    public static final vgh f51961f;

    /* renamed from: o.wgh$a */
    public static class C17856a implements InterfaceC17858c {

        /* renamed from: b */
        public static final C17856a f51962b = new C17856a(true);

        /* renamed from: a */
        public final boolean f51963a;

        public C17856a(boolean z) {
            this.f51963a = z;
        }

        @Override // p001o.wgh.InterfaceC17858c
        /* renamed from: a */
        public int mo54383a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iM54381a = wgh.m54381a(Character.getDirectionality(charSequence.charAt(i)));
                if (iM54381a != 0) {
                    if (iM54381a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f51963a) {
                        return 1;
                    }
                } else if (this.f51963a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f51963a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: o.wgh$b */
    public static class C17857b implements InterfaceC17858c {

        /* renamed from: a */
        public static final C17857b f51964a = new C17857b();

        @Override // p001o.wgh.InterfaceC17858c
        /* renamed from: a */
        public int mo54383a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iM54382b = 2;
            while (i < i3 && iM54382b == 2) {
                iM54382b = wgh.m54382b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iM54382b;
        }
    }

    /* renamed from: o.wgh$c */
    public interface InterfaceC17858c {
        /* renamed from: a */
        int mo54383a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: o.wgh$d */
    public static abstract class AbstractC17859d implements vgh {

        /* renamed from: a */
        public final InterfaceC17858c f51965a;

        public AbstractC17859d(InterfaceC17858c interfaceC17858c) {
            this.f51965a = interfaceC17858c;
        }

        @Override // p001o.vgh
        /* renamed from: a */
        public boolean mo52766a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f51965a == null ? mo54384b() : m54385c(charSequence, i, i2);
        }

        /* renamed from: b */
        public abstract boolean mo54384b();

        /* renamed from: c */
        public final boolean m54385c(CharSequence charSequence, int i, int i2) {
            int iMo54383a = this.f51965a.mo54383a(charSequence, i, i2);
            if (iMo54383a == 0) {
                return true;
            }
            if (iMo54383a != 1) {
                return mo54384b();
            }
            return false;
        }
    }

    /* renamed from: o.wgh$e */
    public static class C17860e extends AbstractC17859d {

        /* renamed from: b */
        public final boolean f51966b;

        public C17860e(InterfaceC17858c interfaceC17858c, boolean z) {
            super(interfaceC17858c);
            this.f51966b = z;
        }

        @Override // p001o.wgh.AbstractC17859d
        /* renamed from: b */
        public boolean mo54384b() {
            return this.f51966b;
        }
    }

    /* renamed from: o.wgh$f */
    public static class C17861f extends AbstractC17859d {

        /* renamed from: b */
        public static final C17861f f51967b = new C17861f();

        public C17861f() {
            super(null);
        }

        @Override // p001o.wgh.AbstractC17859d
        /* renamed from: b */
        public boolean mo54384b() {
            return ejh.m25160a(Locale.getDefault()) == 1;
        }
    }

    static {
        C17857b c17857b = C17857b.f51964a;
        f51958c = new C17860e(c17857b, false);
        f51959d = new C17860e(c17857b, true);
        f51960e = new C17860e(C17856a.f51962b, false);
        f51961f = C17861f.f51967b;
    }

    /* renamed from: a */
    public static int m54381a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m54382b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
